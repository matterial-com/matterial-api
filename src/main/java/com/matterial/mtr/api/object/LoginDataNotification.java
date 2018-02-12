package com.matterial.mtr.api.object;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * <strong>LoginDataNotification</strong>
 */
@XmlRootElement
public class LoginDataNotification extends Notification {

    private static final long serialVersionUID = 1L;

    public static final String LOGIN_DATA_RELOAD = "LOGIN_DATA_RELOAD";

    public LoginDataNotification() {
        super(LOGIN_DATA_RELOAD);
    }

}
