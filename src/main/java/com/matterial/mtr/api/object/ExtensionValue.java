package com.matterial.mtr.api.object;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

import com.matterial.mtr.api.object.meta.Identifiable;
import com.matterial.mtr.api.object.meta.IndexableChild;

/**
 * <strong>ExtensionValue</strong>
 */
@XmlRootElement
public class ExtensionValue implements IndexableChild, Identifiable, Comparable<ExtensionValue> {

    private static final long serialVersionUID = 1L;

    public static final int TYPE_FLAG_STRING = 1;
    public static final int TYPE_FLAG_INTEGER = 2;
    public static final int TYPE_FLAG_DOUBLE = 3;
    public static final int TYPE_FLAG_DATETIME = 4;
    // *** reserved type 5 from km3: FILE;
    public static final int TYPE_FLAG_BOOLEAN = 6;

    public static final String TYPE_STRING = "text";
    public static final String TYPE_INTEGER = "int";
    public static final String TYPE_DOUBLE = "double";
    public static final String TYPE_DATETIME = "date";
    public static final String TYPE_BOOLEAN = "boolean";

    public static final Map<String, Integer> TYPE_MAPPING;
    static {
        Map<String, Integer> m = new HashMap<>();
        m.put(TYPE_STRING, TYPE_FLAG_STRING);
        m.put(TYPE_INTEGER, TYPE_FLAG_INTEGER);
        m.put(TYPE_DOUBLE, TYPE_FLAG_DOUBLE);
        m.put(TYPE_DATETIME, TYPE_FLAG_DATETIME);
        m.put(TYPE_BOOLEAN, TYPE_FLAG_BOOLEAN);
        TYPE_MAPPING = Collections.unmodifiableMap(m);
    }

    private long id;
    private String key;
    private int type;
    private Object value;

    public ExtensionValue() {
        // *** do nothing;
    }

    public ExtensionValue(long id, String key, int type, String value) {
        this.id = id;
        this.key = key;
        this.type = type;
        this.value = value;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public int compareTo(ExtensionValue o) {
        int result = -1;
        if( this.getId() == o.getId() &&
            this.getType() == o.getType() &&
            this.getKey() != null &&
            o.getKey() != null &&
            this.getValue() != null &&
            o.getValue() != null &&
            this.getKey().equals(o.getKey()) &&
            this.getValue().equals(o.getValue())){
            result = 0;
        }
        return result;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((key == null) ? 0 : key.hashCode());
        result = prime * result + type;
        result = prime * result + ((value == null) ? 0 : value.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof ExtensionValue)) {
            return false;
        }
        ExtensionValue other = (ExtensionValue) obj;
        if (key == null) {
            if (other.key != null) {
                return false;
            }
        }
        else if (!key.equals(other.key)) {
            return false;
        }
        if (type != other.type) {
            return false;
        }
        if (value == null) {
            if (other.value != null) {
                return false;
            }
        }
        else if (!value.equals(other.value)) {
            return false;
        }
        return true;
    }

    @Override
    public Map<String, Object> indexMap() {
        // *** creating index-map;
        Map<String, Object> indexMap = this.indexMap(Arrays.asList("value"));
        // *** special handling for value, which is an object (object will not be handled by super-class);
        indexMap.put("value", this.getValue());
        return indexMap;
    }

    @Override
    public void initFromIndexMap(Map<String, Object> indexMap) {
        this.initFromIndexMapDefault(indexMap);
        // *** special handling for value, which is an object (object will not be handled by super-class);
        this.setValue(indexMap.get("value"));
    }

}
