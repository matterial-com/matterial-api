package com.matterial.mtr.api.object;

import javax.xml.bind.annotation.XmlRootElement;

import com.matterial.mtr.api.object.meta.Identifiable;
import com.matterial.mtr.api.object.meta.IndexableChild;

/**
 * Container representing CommunicationData
 */
@XmlRootElement
public class CommunicationData extends IndexableChild implements Identifiable {

    private static final long serialVersionUID = 1L;

    /** indicates that a commdata was imported from an external system (ldap) */
    public static final int STATUS_BIT_IMPORTED = 1 << 0;          // 1
    /** indicates that an email should be used for any notification */
    public static final int STATUS_BIT_USED_FOR_NOTIFICATION = 1 << 1;    // 2

    private long id;
    private long entityTypeId;
    private String value;
    private String description;
    private boolean imported;
    private boolean usedForNotification;

    /**
     * Empty Constructor
     */
    public CommunicationData() {
        // *** empty;
    }

    /**
     * Constructor
     * @param id
     * @param entityTypeId
     * @param value
     * @param description
     * @param status
     */
    public CommunicationData(long id, long entityTypeId, String value, String description, int status) {
        this.id = id;
        this.entityTypeId = entityTypeId;
        this.value = value;
        this.description = description;
        // *** status;
        if((status & STATUS_BIT_IMPORTED) > 0) {
            this.setImported(true);
        }
        if((status & STATUS_BIT_USED_FOR_NOTIFICATION) > 0) {
            this.setUsedForNotification(true);
        }
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    public long getEntityTypeId() {
        return entityTypeId;
    }

    public void setEntityTypeId(long entityTypeId) {
        this.entityTypeId = entityTypeId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isImported() {
        return imported;
    }

    public void setImported(boolean imported) {
        this.imported = imported;
    }

    public boolean isUsedForNotification() {
        return usedForNotification;
    }

    public void setUsedForNotification(boolean usedForNotification) {
        this.usedForNotification = usedForNotification;
    }

    /**
     * @return true, if no attributes are filled
     */
    public boolean empty() {
        return ((value == null       || value.trim().length() == 0) &&
                (description == null || description.trim().length() == 0));
    }

}
