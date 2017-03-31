package com.matterial.mtr.api.object;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * <strong>PreferenceMapContainer</strong>
 */
@XmlRootElement
public class PreferenceMapContainer implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private Map<String, String> preferences;
    private Map<String, String> preferenceDescriptions;
    
    public Map<String, String> getPreferences() {
        if(this.preferences == null) {
            this.preferences = new LinkedHashMap<>();
        }
        return preferences;
    }
    
    public void setPreferences(Map<String, String> preferences) {
        this.preferences = preferences;
    }
    
    public Map<String, String> getPreferenceDescriptions() {
        if(this.preferenceDescriptions == null) {
            this.preferenceDescriptions = new LinkedHashMap<>();
        }
        return preferenceDescriptions;
    }
    
    public void setPreferenceDescriptions(Map<String, String> preferenceDescriptions) {
        this.preferenceDescriptions = preferenceDescriptions;
    }
    
}
