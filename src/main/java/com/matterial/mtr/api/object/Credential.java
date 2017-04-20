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
    private boolean initial;
    
    private List<DataSource> dataSources;
    
    public Credential(String login, String password, boolean initial, List<DataSource> dataSources) {
        this.login = login;
        this.password = password;
        this.initial = initial;
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
    
    public boolean isInitial() {
        return initial;
    }
    
    public void setInitial(boolean initial) {
        this.initial = initial;
    }
    
    public List<DataSource> getDataSources() {
        return dataSources;
    }
    
    public void setDataSources(List<DataSource> dataSources) {
        this.dataSources = dataSources;
    }
    
}
