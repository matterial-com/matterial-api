package com.matterial.mtr.api.object;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * <strong>PasswordContainer</strong>
 */
@XmlRootElement
public class PasswordContainer implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private String passwordCurrent;
    private String passwordNew;
    private String passwordNew2;

    public PasswordContainer() {
        // *** do nothing;
    }
    
    public String getPasswordCurrent() {
        return passwordCurrent;
    }

    public void setPasswordCurrent(String passwordCurrent) {
        this.passwordCurrent = passwordCurrent;
    }

    public String getPasswordNew() {
        return passwordNew;
    }

    public void setPasswordNew(String passwordNew) {
        this.passwordNew = passwordNew;
    }

    public String getPasswordNew2() {
        return passwordNew2;
    }

    public void setPasswordNew2(String passwordNew2) {
        this.passwordNew2 = passwordNew2;
    }

}
