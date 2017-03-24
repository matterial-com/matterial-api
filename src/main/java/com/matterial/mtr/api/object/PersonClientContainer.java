package com.matterial.mtr.api.object;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * <strong>PersonClientContainer</strong>
 */
@XmlRootElement
public class PersonClientContainer implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private Client client;
    private List<Role> roles;
    
    public PersonClientContainer() {
        // *** do nothing;
    }

    public Client getClient() {
        return client;
    }
    
    public void setClient(Client client) {
        this.client = client;
    }
    
    public List<Role> getRoles() {
        if(this.roles == null) {
            this.roles = new ArrayList<>();
        }
        return roles;
    }
    
    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
    
}
