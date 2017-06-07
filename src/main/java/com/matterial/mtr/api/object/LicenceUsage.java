package com.matterial.mtr.api.object;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * <strong>LicenceUsage</strong>
 */
@XmlRootElement
public class LicenceUsage implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private int user;
    private int casSize;
    private Licence licence;
    
    public LicenceUsage() {
        // *** do nothing;
    }
    
    public LicenceUsage(int user, int casSize, Licence licence) {
        this.user = user;
        this.casSize = casSize;
        this.licence = licence;
    }

    public int getUser() {
        return user;
    }
    
    public void setUser(int user) {
        this.user = user;
    }
    
    public int getCasSize() {
        return casSize;
    }
    
    public void setCasSize(int casSize) {
        this.casSize = casSize;
    }
    
    public Licence getLicence() {
        return licence;
    }
    
    public void setLicence(Licence licence) {
        this.licence = licence;
    }
    
    /**
     * checks if new licence exceeds current values.  
     */
    public boolean checkForExceeding(Licence newLicence) {
        boolean ok = false;
        // *** get current values;
        int currentCasSize = this.getCasSize();
        int currentUser = this.getUser();
        // *** check licence;
        if(newLicence != null) {
            // *** get requested values;
            int requestedCasSize = newLicence.getCasSize();
            int requestedUser = newLicence.getUser();
            if(requestedCasSize >= currentCasSize && 
               requestedUser >= currentUser) {
               ok = true; 
            }
        }
        return ok;
    }
    
}
