package com.matterial.mtr.api.object;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * <strong>Notification</strong>
 */
@XmlRootElement
public class Notification implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private String message;
    private String type;
    
    public Notification() {
        this.type = this.getClass().getSimpleName();
    }
    
    public Notification(String message) {
        this();
        this.message = message;
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
