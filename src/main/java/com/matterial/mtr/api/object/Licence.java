package com.matterial.mtr.api.object;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * <strong>Licence</strong>
 */
@XmlRootElement
public class Licence implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private static final String MTR_PREFIX = "MTR-";

    public static final long LICENCE_ID_MTR_USER = 1L;
    public static final long LICENCE_ID_MTR_CAS_SIZE = 2L;
    public static final long LICENCE_ID_MTR_PACKAGE_GROUP = 3L;
    public static final long LICENCE_ID_MTR_PACKAGE_ROLE = 4L;
    public static final long LICENCE_ID_MTR_PACKAGE_REVIEW = 5L;
    public static final long LICENCE_ID_MTR_PACKAGE_MULTI_LANGUAGE = 6L;

    private static final String MTR_USER = "USER";
    private static final String MTR_CAS_SIZE = "CAS_SIZE";
    private static final String MTR_PACKAGE_GROUP = "PACKAGE_GROUP";
    private static final String MTR_PACKAGE_ROLE = "PACKAGE_ROLE";
    private static final String MTR_PACKAGE_REVIEW = "PACKAGE_REVIEW";
    private static final String MTR_PACKAGE_MULTI_LANGUAGE = "PACKAGE_MULTI_LANGUAGE";
    
    public static final int MTR_USER_DEFAULT = 1;
    public static final int MTR_CAS_SIZE_DEFAULT = 100;

    public static final int MB = (1024*1024);

    private int user;
    private int casSize;
    private boolean packageGroup;
    private boolean packageRole;
    private boolean packageReview;
    private boolean packageMultiLanguage;
    private String hash;
    
    public Licence() {
        this.user = MTR_USER_DEFAULT;
        this.casSize = MTR_CAS_SIZE_DEFAULT;
        this.packageGroup = false;
        this.packageRole = false;
        this.packageReview = false;
        this.packageMultiLanguage = false;
        this.hash = null;
    }

    public Licence(int user, 
                   int casSize, 
                   boolean packageGroup, 
                   boolean packageRole, 
                   boolean packageReview, 
                   boolean packageMultiLanguage) {
        this();
        if(user > 0) {
            this.user = user;
        }
        if(casSize > 0) {
            this.casSize = casSize;
        }
        this.packageGroup = packageGroup;
        this.packageRole = packageRole;
        this.packageReview = packageReview;
        this.packageMultiLanguage = packageMultiLanguage;
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

    public boolean isPackageGroup() {
        return packageGroup;
    }
    
    public void setPackageGroup(boolean packageGroup) {
        this.packageGroup = packageGroup;
    }

    public boolean isPackageRole() {
        return packageRole;
    }
    
    public void setPackageRole(boolean packageRole) {
        this.packageRole = packageRole;
    }

    public boolean isPackageReview() {
        return packageReview;
    }
    
    public void setPackageReview(boolean packageReview) {
        this.packageReview = packageReview;
    }
    
    public boolean isPackageMultiLanguage() {
        return packageMultiLanguage;
    }
    
    public void setPackageMultiLanguage(boolean packageMultiLanguage) {
        this.packageMultiLanguage = packageMultiLanguage;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }
    
    /**
     * this is used to generate the license-key!
     */
    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        // *** add prefix;
        buffer.append(MTR_PREFIX);
        // *** always add user;
        buffer.append(MTR_USER);
        buffer.append("-");
        buffer.append(this.getUser());
        // *** cas-size;
        if(this.getCasSize() > 0) {
            buffer.append("-");
            buffer.append(MTR_CAS_SIZE);
            buffer.append("-");
            buffer.append(this.getCasSize());
        }
        // *** role;
        if(this.isPackageRole()) {
            buffer.append("-");
            buffer.append(MTR_PACKAGE_ROLE);
            buffer.append("-");
            buffer.append(this.isPackageRole());
        }
        // *** group;
        if(this.isPackageGroup()) {
            buffer.append("-");
            buffer.append(MTR_PACKAGE_GROUP);
            buffer.append("-");
            buffer.append(this.isPackageGroup());
        }
        // *** review;
        if(this.isPackageGroup()) {
            buffer.append("-");
            buffer.append(MTR_PACKAGE_REVIEW);
            buffer.append("-");
            buffer.append(this.isPackageReview());
        }
        // *** multi-language;
        if(this.isPackageMultiLanguage()) {
            buffer.append("-");
            buffer.append(MTR_PACKAGE_MULTI_LANGUAGE);
            buffer.append("-");
            buffer.append(this.isPackageMultiLanguage());
        }
        return buffer.toString();
    }
    
}
