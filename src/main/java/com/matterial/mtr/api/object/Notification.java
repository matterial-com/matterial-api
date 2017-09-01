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
    private long documentId;
    private String message;
    
    public Notification() {
        // *** do nothing;
    }
    
    public Notification(long instanceId, 
                        long clientId, 
                        long documentId, 
                        String message) {
        this.instanceId = instanceId;
        this.clientId = clientId;
        this.documentId = documentId;
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
    
    public long getDocumentId() {
        return documentId;
    }
    
    public void setDocumentId(long documentId) {
        this.documentId = documentId;
    }
    
    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
    
}
