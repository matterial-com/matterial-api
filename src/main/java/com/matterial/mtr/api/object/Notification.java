package com.matterial.mtr.api.object;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * <strong>Notification</strong>
 */
@XmlRootElement
public class Notification implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private long instanceId;
    private long clientId;
    private String message;
    private String type;
    
    public Notification() {
        this.type = this.getClass().getSimpleName();
    }
    
    public Notification(long instanceId, 
                        long clientId, 
                        String message) {
        this();
        this.instanceId = instanceId;
        this.clientId = clientId;
        this.message = message;
    }

    public long getInstanceId() {
        return instanceId;
    }
    
    public void setInstanceId(long instanceId) {
        this.instanceId = instanceId;
    }
    
    public long getClientId() {
        return clientId;
    }
    
    public void setClientId(long clientId) {
        this.clientId = clientId;
    }
    
    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
    
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
}
