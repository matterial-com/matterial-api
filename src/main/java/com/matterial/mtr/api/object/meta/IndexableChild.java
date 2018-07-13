package com.matterial.mtr.api.object.meta;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Interface for classes to be indexable by the EmbeddedSearchServer
 */
public interface IndexableChild extends Serializable {

    public static final String INDEX_KEY_AUTOCOMPLETE = "autocomplete";

    /**
     * Get a map of all key/values that should be indexed.
     * default implementation uses reflection to fill the map.
     *
     * @return Map of key:String and value:Object
     */
    public default Map<String, Object> indexMap() {
        return this.indexMap(null);
    }

    /**
     * Get a map of all key/values that should be indexed.
     * default implementation uses reflection to fill the map.
     *
     * @return Map of key:String and value:Object
     */
    public default Map<String, Object> indexMap(List<String> doNotIndexKeys) {
        Map<String, Object> indexMap = new HashMap<>();
        // *** for each declared method;
        for (Method m : this.getClass().getDeclaredMethods()) {
            if(m != null) {
                String key = null;
                // *** get;
                if(m.getName().startsWith("get")) {
                    key = m.getName().substring(3);
                }
                // *** is;
                else if(m.getName().startsWith("is")) {
                    key = m.getName().substring(2);
                }
                if(key != null) {
                    // *** lowercase the first letter;
                    char c[] = key.toCharArray();
                    c[0] += 32; // c[0] = Character.toLowerCase(c[0]);
                    key = new String(c);
                    if(doNotIndexKeys == null || !doNotIndexKeys.contains(key)) {
                        Object value = null;
                        try {
                            value = m.invoke(this);
                        }
                        catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                            // *** do nothing;
                        }
                        // *** check for null value;
                        if(value != null) {
                            // *** no list or other complex object: add directly to indexMap;
                            if(value.getClass().isPrimitive() ||
                               value instanceof Number ||
                               value instanceof Boolean ||
                               value instanceof String) {
                                indexMap.put(key, value);
                            }
                            // *** single IndexableChild;
                            else if(value instanceof IndexableChild) {
                                indexMap.put(key, ((IndexableChild)value).indexMap());
                            }
                            // *** list of IndexableChilds;
                            else if(value instanceof List) {
                                List<Map<String, Object>> list = new ArrayList<>();
                                ((List<?>)value).stream().forEach((entry) -> {
                                    if(entry instanceof IndexableChild) {
                                        list.add(((IndexableChild)entry).indexMap());
                                    }
                                });
                                indexMap.put(key, list);
                            }
                        }
                    }
                }
            }
        }
        return indexMap;
    }

    /**
     * Init object with data from indexMap.
     * Default implementation uses reflection to fill the object.
     */
    public default void initFromIndexMap(Map<String, Object> indexMap) {
        this.initFromIndexMapDefault(indexMap);
    }

    /**
     * Init object with data from indexMap.
     * Default implementation uses reflection to fill the object.
     */
    public default void initFromIndexMapDefault(Map<String, Object> indexMap) {
        if(indexMap != null) {
            // *** for each entry;
            for(String key : indexMap.keySet()) {
                // *** get value by key;
                Object value = indexMap.get(key);
                // *** only if value not null;
                if(value != null) {
                    // *** no list or other complex object: add directly to object;
                    if(value.getClass().isPrimitive() ||
                       value instanceof Number ||
                       value instanceof Boolean ||
                       value instanceof String) {
                        this._putValueIntoField(this._field(key), value);
                    }
                    // *** single IndexableChild;
                    else if(value instanceof Map) {
                        Map<?, ?> map = (Map<?, ?>)value;
                        this._handleMap(key, map);
                    }
                    // ***  list of IndexableChilds;
                    else if(value instanceof List) {
                        List<?> listOfMaps = (List<?>)value;
                        this._handleListOfMaps(key, listOfMaps);
                    }
                }
            }
        }
    }


    /**
     * helper method.
     */
    public default Field _field(String key) {
        Field f = null;
        try {
            f = this.getClass().getDeclaredField(key);
        }
        catch (NoSuchFieldException | SecurityException e) {
            // *** do nothing;
        }
        return f;
    }

    /**
     * helper method.
     */
    public default Method _method(String key) {
        // *** lowercase the first letter;
        char c[] = key.toCharArray();
        c[0] -= 32; // c[0] = Character.toUpperCase(c[0]);
        String mName = new String(c);
        mName = "get"+mName;
        Method m = null;
        try {
            m = this.getClass().getDeclaredMethod(mName);
        }
        catch (NoSuchMethodException e) {
            // *** do nothing;
        }
        return m;
    }

    /**
     * helper method.
     */
    @SuppressWarnings("unchecked")
    public default void _handleListOfMaps(String key, List<?> listOfMaps) {
        Method m = this._method(key);
        if(m != null) {
            try {
                Object obj = m.invoke(this);
                if(obj != null && obj instanceof List) {
                    List<Object> list = (List<Object>)obj;
                    // *** foreach map;
                    for (Object oMap : listOfMaps) {
                        // *** list-items should be maps;
                        if(oMap != null && oMap instanceof Map) {
                            Map<String, Object> map = (Map<String, Object>)oMap;
                            // *** try to intantiate IndexableChild;
                            Class<?> clazz = Mapping.FIELD_CLASS.get(key);
                            if(clazz != null) {
                                try {
                                    Object instance = clazz.newInstance();
                                    if(instance instanceof IndexableChild) {
                                        ((IndexableChild)instance).initFromIndexMap(map);
                                        list.add(instance);
                                    }
                                }
                                catch (InstantiationException e) {
                                    // *** do nothing;
                                }
                            }
                        }
                    }
                }
            }
            catch (IllegalArgumentException | IllegalAccessException | InvocationTargetException e) {
                // *** do nothing';
            }
        }
    }

    /**
     * helper method.
     */
    @SuppressWarnings("unchecked")
    public default void _handleMap(String key, Map<?, ?> map) {
        Field f = this._field(key);
        if(f != null) {
            try {
                Object obj = f.getType().newInstance();
                if(obj instanceof IndexableChild) {
                    // *** init object from map;
                    ((IndexableChild)obj).initFromIndexMap((Map<String, Object>)map);
                    this._putValueIntoField(f, obj);
                }
            }
            catch (InstantiationException | IllegalAccessException e) {
                // *** do nothing;
            }
        }
    }

    /**
     * helper method.
     */
    public default void _putValueIntoField(Field f, Object value) {
        try {
            if(f != null) {
                // *** access private field;
                f.setAccessible(true);
                try {
                    f.set(this, value);
                }
                catch (IllegalArgumentException | IllegalAccessException e) {
                    // *** do nothing;
                }
            }
        }
        catch (SecurityException e) {
            // *** do nothing;
        }
    }

}