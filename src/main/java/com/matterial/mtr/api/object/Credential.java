package com.matterial.mtr.api.object;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * <strong>Credential</strong>
 */
@XmlRootElement
public class Credential implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private String login;
    private String password;
    private boolean active;
    
    private List<DataSource> dataSources;
    
    public Credential(String login, String password, boolean active, List<DataSource> dataSources) {
        this.login = login;
        this.password = password;
        this.active = active;
        this.dataSources = dataSources;
    }

    public Credential() {
        // *** do nothing;
    }
    
    public String getLogin() {
        return login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean isActive() {
        return active;
    }
    
    public void setActive(boolean active) {
        this.active = active;
    }
    
    public List<DataSource> getDataSources() {
        return dataSources;
    }
    
    public void setDataSources(List<DataSource> dataSources) {
        this.dataSources = dataSources;
    }
    
}
