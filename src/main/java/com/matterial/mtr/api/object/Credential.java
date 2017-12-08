package com.matterial.mtr.api.object;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * <strong>Credential</strong>
 */
@XmlRootElement
public class Credential implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private long id;
    private String login;
    private String password;
    private String subscriptionEmail;

    private List<DataSource> dataSources;
    
    private boolean updatePassword;
    
    public Credential(String login, String password, 
                      String subscriptionEmail) {
        this(0L, login, password, subscriptionEmail);
    }
    
    public Credential(long id,
                      String login, String password, 
                      String subscriptionEmail) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.subscriptionEmail = subscriptionEmail;
        this.updatePassword = false;
    }

    public Credential() {
        // *** do nothing;
    }
    
    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
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
    
    public String getSubscriptionEmail() {
        return subscriptionEmail;
    }
    
    public void setSubscriptionEmail(String subscriptionEmail) {
        this.subscriptionEmail = subscriptionEmail;
    }

    public List<DataSource> getDataSources() {
        if(this.dataSources == null) {
            this.dataSources = new ArrayList<>();
        }
        return dataSources;
    }
    
    public void setDataSources(List<DataSource> dataSources) {
        this.dataSources = dataSources;
    }
    
    public boolean isUpdatePassword() {
        return updatePassword;
    }
    
    public void setUpdatePassword(boolean updatePassword) {
        this.updatePassword = updatePassword;
    }

}
