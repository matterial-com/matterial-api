package com.matterial.mtr.api.object;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * <strong>LicenceUsage</strong>
 */
@XmlRootElement
public class LicenceUsage {
    
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
    
    
}
