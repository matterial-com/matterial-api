package com.matterial.mtr.api.object;

import java.io.Serializable;

/**
 * <strong>Notification</strong>
 */
public class Notification implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String message;
    
    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
    
}
