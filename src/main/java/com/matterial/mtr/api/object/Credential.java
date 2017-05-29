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
    
    private String login;
    private String password;
    private String tempKey;
    private Long tempKeyValidEndInSeconds;
    private String subscriptionEmail;
    
    private List<DataSource> dataSources;
    
    public Credential(String login, String password, 
                      String tempKey, Long tempKeyValidEndInSeconds,
                      String subscriptionEmail) {
        this.login = login;
        this.password = password;
        this.tempKey = tempKey;
        this.tempKeyValidEndInSeconds = tempKeyValidEndInSeconds;
        this.subscriptionEmail = subscriptionEmail;
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
    
    public String getTempKey() {
        return this.tempKey;
    }

    public void setTempKey(String tempKey) {
        this.tempKey = tempKey;
    }

    public Long getTempKeyValidEndInSeconds() {
        return tempKeyValidEndInSeconds;
    }

    public void setTempKeyValidEndInSeconds(Long tempKeyValidEndInSeconds) {
        this.tempKeyValidEndInSeconds = tempKeyValidEndInSeconds;
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

}
