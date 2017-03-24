package com.matterial.mtr.api.object;

import javax.xml.bind.annotation.XmlRootElement;

import com.matterial.mtr.api.object.meta.Identifiable;

/**
 * <strong>SavedSearchParameter</strong>
 */
@XmlRootElement
public class SavedSearchParameter implements Identifiable {
    
    private static final long serialVersionUID = 1L;
    
    private long id;
    private String key;
    private String value;
    
    public SavedSearchParameter() {
        // *** empty;
    }
    
    public SavedSearchParameter(long id, String key, String value) {
        this.id = id;
        this.key = key;
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
    
    public String getValue() {
        return value;
    }
    
    public void setValue(String value) {
        this.value = value;
    }
    
}
