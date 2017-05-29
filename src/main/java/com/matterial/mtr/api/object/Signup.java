package com.matterial.mtr.api.object;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * <strong>Signup</strong>
 */
@XmlRootElement
public class Signup implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private String subscriptionEmail;
    private String dataSourceDisplayName;
    private String dataSourceReference;
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
    
    public Licence getLicence() {
        return licence;
    }
    
    public void setLicence(Licence licence) {
        this.licence = licence;
    }
    
}
