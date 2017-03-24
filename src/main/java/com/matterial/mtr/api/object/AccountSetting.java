package com.matterial.mtr.api.object;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * <strong>AccountSetting</strong>
 */
@XmlRootElement
public class AccountSetting implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private String key;
    private Object value;
    
    public AccountSetting() {
        // *** do nothing;
    }
    
    public AccountSetting(String key, String value) {
        this.key = key;
        this.value = value;
    }
    
    public String getKey() {
        return key;
    }
    
    public void setKey(String key) {
        this.key = key;
    }
    
    public Object getValue() {
        return value;
    }
    
    public void setValue(Object value) {
        this.value = value;
    }
    
}
