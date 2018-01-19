package com.matterial.mtr.api.object;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * <strong>Logon</strong>
 */
@XmlRootElement
public class Logon implements Serializable {

    private static final long serialVersionUID = 1L;

    private String login;
    private String password;

    public Logon() {
        // *** do nothing;
    }

    public Logon(String login, String password) {
        this.login = login;
        this.password = password;
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

    @Override
    public String toString() {
        return this.getLogin();
    }

}
