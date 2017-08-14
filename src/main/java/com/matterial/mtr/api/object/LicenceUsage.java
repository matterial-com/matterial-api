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
    private long languageActiveCount;
    private Long dataSourceActiveUntilInSeconds;
    private Licence licence;
    
    public LicenceUsage() {
        // *** do nothing;
    }
    
    public LicenceUsage(int user, int casSize, 
                        Long languageActiveCount, 
                        Long dataSourceActiveUntilInSeconds,  
                        Licence licence) {
        this.user = user;
        this.casSize = casSize;
        this.languageActiveCount = (languageActiveCount==null)?0L:languageActiveCount;
        this.dataSourceActiveUntilInSeconds = dataSourceActiveUntilInSeconds;
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
    
    public long getLanguageActiveCount() {
        return languageActiveCount;
    }
    
    public void setLanguageActiveCount(long languageActiveCount) {
        this.languageActiveCount = languageActiveCount;
    }
    
    public Long getDataSourceActiveUntilInSeconds() {
        return dataSourceActiveUntilInSeconds;
    }

    public void setDataSourceActiveUntilInSeconds(Long dataSourceActiveUntilInSeconds) {
        this.dataSourceActiveUntilInSeconds = dataSourceActiveUntilInSeconds;
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
        long currentLanguageActiveCount = this.getLanguageActiveCount();
        boolean currentPackageGroup = this.getLicence().isPackageGroup();
        // *** check licence;
        if(newLicence != null) {
            // *** get requested values;
            int requestedCasSize = newLicence.getCasSize();
            int requestedUser = newLicence.getUser();
            boolean requestedPackageGroup = newLicence.isPackageGroup();
            boolean requestedPackageMultiLanguage = newLicence.isPackageMultiLanguage();
            if(requestedCasSize >= currentCasSize &&
               requestedUser >= currentUser && 
               // *** check for groups;
               (requestedPackageGroup || !currentPackageGroup) && 
               // *** check for multi-language;
               (requestedPackageMultiLanguage || (!requestedPackageMultiLanguage && currentLanguageActiveCount == 1L)) ) {
                ok = true; 
            }
        }
        return ok;
    }
    
}
