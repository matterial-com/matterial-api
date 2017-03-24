package com.matterial.mtr.api.object;

import java.io.Serializable;
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
    
    private String dataSource;
    private String sessionId;
    private Permissions permissions;
    private Person person;
    private Client client;
    private List<DataSource> dataSources;
    private Map<String, Object> accountSettings;
    private Map<String, String> clientPreferences;

    public String getDataSource() {
        return dataSource;
    }
    
    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }
    
    public String getSessionId() {
        return sessionId;
    }
    
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
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
    
    public List<DataSource> getDataSources() {
        return dataSources;
    }
    
    public void setDataSources(List<DataSource> dataSources) {
        this.dataSources = dataSources;
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
