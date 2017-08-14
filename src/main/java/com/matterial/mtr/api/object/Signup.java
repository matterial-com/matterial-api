package com.matterial.mtr.api.object;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * <strong>Signup</strong>
 */
@XmlRootElement
public class Signup implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private String subscriptionEmail;
    private String password;
    private String dataSourceDisplayName;
    private String dataSourceReference;
    private Integer dataSourceActivationDays;
    private List<Long> activeLanguageIds;
    private boolean updatePassword;
    private Licence licence;
    
    public Signup() {
        // *** do nothing;
    }
    
    public String getSubscriptionEmail() {
        return subscriptionEmail;
    }
    
    public void setSubscriptionEmail(String subscriptionEmail) {
        this.subscriptionEmail = subscriptionEmail;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getDataSourceDisplayName() {
        return dataSourceDisplayName;
    }
    
    public void setDataSourceDisplayName(String dataSourceDisplayName) {
        this.dataSourceDisplayName = dataSourceDisplayName;
    }
    
    public String getDataSourceReference() {
        return dataSourceReference;
    }
    
    public void setDataSourceReference(String dataSourceReference) {
        this.dataSourceReference = dataSourceReference;
    }
    
    public Integer getDataSourceActivationDays() {
        return dataSourceActivationDays;
    }

    public void setDataSourceActivationDays(Integer dataSourceActivationDays) {
        this.dataSourceActivationDays = dataSourceActivationDays;
    }
    
    public List<Long> getActiveLanguageIds() {
        return activeLanguageIds;
    }
    
    public void setActiveLanguageIds(List<Long> activeLanguageIds) {
        this.activeLanguageIds = activeLanguageIds;
    }

    public boolean isUpdatePassword() {
        return updatePassword;
    }
    
    public void setUpdatePassword(boolean updatePassword) {
        this.updatePassword = updatePassword;
    }
    
    public Licence getLicence() {
        return licence;
    }
    
    public void setLicence(Licence licence) {
        this.licence = licence;
    }
    
}
