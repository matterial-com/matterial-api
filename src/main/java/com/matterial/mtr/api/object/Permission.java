package com.matterial.mtr.api.object;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * <strong>Permission</strong>
 */
@XmlRootElement
public class Permission implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    /**
     * bit used for bit-operations to check permission
     */
    private long bit;
    
    /**
     * message-key for the name-property
     */
    private String namePropertyKey;
    
    /**
     * message-key for the description-property
     */
    private String descriptionPropertyKey;
    
    public Permission() {
        // *** do nothing;
    }
    
    public Permission(long bit, String namePropertyKey, String descriptionPropertyKey) {
        setBit(bit);
        setNamePropertyKey(namePropertyKey);
        setDescriptionPropertyKey(descriptionPropertyKey);
    }
    
    public long getBit() {
        return bit;
    }
    
    public void setBit(long bit) {
        this.bit = bit;
    }
    
    public String getNamePropertyKey() {
        return namePropertyKey;
    }
    
    public void setNamePropertyKey(String namePropertyKey) {
        this.namePropertyKey = namePropertyKey;
    }
    
    public String getDescriptionPropertyKey() {
        return descriptionPropertyKey;
    }
    
    public void setDescriptionPropertyKey(String descriptionPropertyKey) {
        this.descriptionPropertyKey = descriptionPropertyKey;
    }
    
}
