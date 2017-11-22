package com.matterial.mtr.api.object;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * <strong>SimpleValue</strong>: wraps simple java-objects into json/xml.
 */
@XmlRootElement
public class SimpleValue extends ListResultEntry implements Serializable {

    private static final long serialVersionUID = 1L;

    private Object value;
    
    public SimpleValue() {
        // *** do nothing;
    }

    public SimpleValue(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

}