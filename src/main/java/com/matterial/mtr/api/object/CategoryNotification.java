package com.matterial.mtr.api.object;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * <strong>CategoryNotification</strong>
 */
@XmlRootElement
public class CategoryNotification extends Notification {
    
    private static final long serialVersionUID = 1L;
    
    public static final String CATEGORY_STORE = "CATEGORY_STORE";
    
    private long categoryTypeId;
    private long categoryId;
    
    public CategoryNotification() {
        // *** do nothing;
    }
    
    public CategoryNotification(long instanceId, 
                                long clientId, 
                                long categoryTypeId,
                                long categoryId) {
        super(instanceId, clientId, CATEGORY_STORE);
        this.categoryTypeId = categoryTypeId;
        this.categoryId = categoryId;
    }
    
    public long getCategoryTypeId() {
        return categoryTypeId;
    }
    
    public void setCategoryTypeId(long categoryTypeId) {
        this.categoryTypeId = categoryTypeId;
    }

    public long getCategoryId() {
        return categoryId;
    }
    
    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

}
