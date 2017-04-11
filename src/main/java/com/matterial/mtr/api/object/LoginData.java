package com.matterial.mtr.api.object;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * <strong>LoginData</strong>
 */
@XmlRootElement
public class LoginData implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private String sessionId;
    private DataSource currentDataSource;
    private DataSource favouriteDataSource;
    private Permissions permissions;
    private Person person;
    private Client client;
    private List<DataSource> availableDataSources;
    private Map<String, Object> accountSettings;
    private Map<String, String> clientPreferences;

    public String getSessionId() {
        return sessionId;
    }
    
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
    
    public DataSource getCurrentDataSource() {
        return currentDataSource;
    }
    
    public void setCurrentDataSource(DataSource currentDataSource) {
        this.currentDataSource = currentDataSource;
    }
    
    public DataSource getFavouriteDataSource() {
        return favouriteDataSource;
    }
    
    public void setFavouriteDataSource(DataSource favouriteDataSource) {
        this.favouriteDataSource = favouriteDataSource;
    }
    
    public Permissions getPermissions() {
        return permissions;
    }
    
    public void setPermissions(Permissions permissions) {
        this.permissions = permissions;
    }
    
    public Person getPerson() {
        return person;
    }
    
    public void setPerson(Person person) {
        this.person = person;
    }
    
    public Client getClient() {
        return client;
    }
    
    public void setClient(Client client) {
        this.client = client;
    }
    
    public List<DataSource> getAvailableDataSources() {
        if(this.availableDataSources == null) {
            this.availableDataSources = new ArrayList<>();
        }
        return availableDataSources;
    }
    
    public void setAvailableDataSources(List<DataSource> availableDataSources) {
        this.availableDataSources = availableDataSources;
    }
    
    public Map<String, Object> getAccountSettings() {
        if(this.accountSettings == null) {
            this.accountSettings = new HashMap<>();
        }
        return accountSettings;
    }
    
    public void setAccountSettings(Map<String, Object> accountSettings) {
        this.accountSettings = accountSettings;
    }
    
    public Map<String, String> getClientPreferences() {
        if(this.clientPreferences == null) {
            this.clientPreferences = new HashMap<>();
        }
        return clientPreferences;
    }
    
    public void setClientPreferences(Map<String, String> clientPreferences) {
        this.clientPreferences = clientPreferences;
    }

}
