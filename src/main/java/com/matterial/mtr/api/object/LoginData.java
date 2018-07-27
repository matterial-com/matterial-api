package com.matterial.mtr.api.object;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * <strong>LoginData</strong>
 */
@XmlRootElement
public class LoginData implements Serializable {

    private static final long serialVersionUID = 1L;

    private String sessionId;
    private long sessionDataTimeout;
    private boolean firstLogin;
    private boolean pwdMustChange;
    private boolean pwdExists;
    private boolean externallyAuthenticated;
    private boolean multipleInstanceInstallation;
    private Licence licence;
    private DataSource currentDataSource;
    private DataSource favouriteDataSource;
    private Person person;
    private Client client;
    private Collection<Language> availableLanguages;
    private List<DataSource> availableDataSources;
    private Map<String, Object> accountSettings;
    private Map<String, String> clientPreferences;

    /**
     * constructor.
     */
    public LoginData() {
        // *** do nothing;
    }

    public void updateSessionDataTimeout(int sessionDataTimeoutInMinutes) {
        // *** set timeout to 30 minutes later;
        this.sessionDataTimeout = LocalDateTime.now().plusMinutes(sessionDataTimeoutInMinutes).toEpochSecond(ZoneOffset.UTC);
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public long getSessionDataTimeout() {
        return this.sessionDataTimeout;
    }

    public void setSessionDataTimeout(long sessionDataTimeout) {
        this.sessionDataTimeout = sessionDataTimeout;
    }

    public boolean isFirstLogin() {
        return firstLogin;
    }

    public void setFirstLogin(boolean firstLogin) {
        this.firstLogin = firstLogin;
    }

    public boolean isPwdMustChange() {
        return this.pwdMustChange;
    }

    public void setPwdMustChange(boolean pwdMustChange) {
        this.pwdMustChange = pwdMustChange;
    }

    public boolean isPwdExists() {
        return this.pwdExists;
    }

    public void setPwdExists(boolean pwdExists) {
        this.pwdExists = pwdExists;
    }

    public boolean isExternallyAuthenticated() {
        return this.externallyAuthenticated;
    }

    public void setExternallyAuthenticated(boolean externallyAuthenticated) {
        this.externallyAuthenticated = externallyAuthenticated;
    }

    public boolean isMultipleInstanceInstallation() {
        return this.multipleInstanceInstallation;
    }

    public void setMultipleInstanceInstallation(boolean multipleInstanceInstallation) {
        this.multipleInstanceInstallation = multipleInstanceInstallation;
    }

    public Licence getLicence() {
        return this.licence;
    }

    public void setLicence(Licence licence) {
        this.licence = licence;
        // *** always reset hash;
        this.licence.setHash(null);
    }

    public DataSource getCurrentDataSource() {
        return this.currentDataSource;
    }

    public void setCurrentDataSource(DataSource currentDataSource) {
        this.currentDataSource = currentDataSource;
    }

    public DataSource getFavouriteDataSource() {
        return this.favouriteDataSource;
    }

    public void setFavouriteDataSource(DataSource favouriteDataSource) {
        this.favouriteDataSource = favouriteDataSource;
    }

    public Person getPerson() {
        return this.person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Client getClient() {
        return this.client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Collection<Language> getAvailableLanguages() {
        if(this.availableLanguages == null) {
            this.availableLanguages = new ArrayList<>();
        }
        return this.availableLanguages;
    }

    public void setAvailableLanguages(List<Language> availableLanguages) {
        this.availableLanguages = availableLanguages;
    }

    public List<DataSource> getAvailableDataSources() {
        if(this.availableDataSources == null) {
            this.availableDataSources = new ArrayList<>();
        }
        return this.availableDataSources;
    }

    public void setAvailableDataSources(List<DataSource> availableDataSources) {
        this.availableDataSources = availableDataSources;
    }

    public Map<String, Object> getAccountSettings() {
        if(this.accountSettings == null) {
            this.accountSettings = new HashMap<>();
        }
        return this.accountSettings;
    }

    public void setAccountSettings(Map<String, Object> accountSettings) {
        this.accountSettings = accountSettings;
    }

    public Map<String, String> getClientPreferences() {
        if(this.clientPreferences == null) {
            this.clientPreferences = new HashMap<>();
        }
        return this.clientPreferences;
    }

    public void setClientPreferences(Map<String, String> clientPreferences) {
        this.clientPreferences = clientPreferences;
    }

}
