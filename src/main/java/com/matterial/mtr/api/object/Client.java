package com.matterial.mtr.api.object;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

import com.matterial.mtr.api.object.meta.Identifiable;
import com.matterial.mtr.api.object.meta.IndexableChild;

/**
 * <strong>Client</strong>
 */
@XmlRootElement
public class Client implements Identifiable, IndexableChild {
    
    private static final long serialVersionUID = 1L;
    
    public static final String DEFAULT_NAME = "DEFAULT";
    
    private long id;
    private String name;
    
    private PreferenceMapContainer clientPreferences;
    
    
    public Client() {
        // *** do nothing;
    }
    
    public Client(long id, String name) {
        this.id = id;
        this.name = name;
    }
    
    @Override
    public long getId() {
        return id;
    }
    
    @Override
    public void setId(long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public PreferenceMapContainer getClientPreferences() {
        if(this.clientPreferences == null) {
            this.clientPreferences = new PreferenceMapContainer();
        }
        return clientPreferences;
    }
    
    public void setClientPreferences(PreferenceMapContainer clientPreferences) {
        this.clientPreferences = clientPreferences;
    }

    @Override
    public Map<String, Object> indexMap() {
        Map<String, Object> indexMap = new HashMap<>();
        indexMap.put("id", this.getId());
        indexMap.put("name", this.getName());
        return indexMap;
    }
}
