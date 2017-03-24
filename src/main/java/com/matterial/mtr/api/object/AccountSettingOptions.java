package com.matterial.mtr.api.object;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * <strong>AccountSettingOptions</strong>
 */
@XmlRootElement
public class AccountSettingOptions implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private List<Client> client;
    private Collection<Language> language;
    private List<Language> newsSubscriber;
    private List<Boolean> disableRightsOnLogin;
    private List<Boolean> showArchiveOnLogin;
    private List<Boolean> showHelp;
    
    public AccountSettingOptions() {
        // *** do nothing;
    }

    public List<Client> getClient() {
        return client;
    }
    
    public void setClient(List<Client> client) {
        this.client = client;
    }
    
    public Collection<Language> getLanguage() {
        return language;
    }
    
    public void setLanguage(Collection<Language> language) {
        this.language = language;
    }
    
    public List<Language> getNewsSubscriber() {
        return newsSubscriber;
    }
    
    public void setNewsSubscriber(List<Language> newsSubscriber) {
        this.newsSubscriber = newsSubscriber;
    }
    
    public List<Boolean> getDisableRightsOnLogin() {
        return disableRightsOnLogin;
    }
    
    public void setDisableRightsOnLogin(List<Boolean> disableRightsOnLogin) {
        this.disableRightsOnLogin = disableRightsOnLogin;
    }
    
    public List<Boolean> getShowArchiveOnLogin() {
        return showArchiveOnLogin;
    }
    
    public void setShowArchiveOnLogin(List<Boolean> showArchiveOnLogin) {
        this.showArchiveOnLogin = showArchiveOnLogin;
    }
    
    public List<Boolean> getShowHelp() {
        return showHelp;
    }
    
    public void setShowHelp(List<Boolean> showHelp) {
        this.showHelp = showHelp;
    }
    
}
