package com.matterial.mtr.api.object;

import javax.xml.bind.annotation.XmlRootElement;

import com.matterial.mtr.api.object.meta.Identifiable;

/**
 * <strong>DocumentChangeLog</strong>
 */
@XmlRootElement
public class DocumentLock implements Identifiable {
    
    private static final long serialVersionUID = 1L;
    
    private long id;
    private Person person;
    private long documentId;
    private boolean lockedForMe;
    private long lockTimestampInSeconds;
    
    public DocumentLock() {
        // *** do nothing;
    }
    
    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }
    
    public Person getPerson() {
        return person;
    }
    
    public void setPerson(Person person) {
        this.person = person;
    }
    
    public long getDocumentId() {
        return documentId;
    }
    
    public void setDocumentId(long documentId) {
        this.documentId = documentId;
    }
    
    public boolean isLockedForMe() {
        return lockedForMe;
    }
    
    public void setLockedForMe(boolean lockedForMe) {
        this.lockedForMe = lockedForMe;
    }
    
    public long getLockTimestampInSeconds() {
        return lockTimestampInSeconds;
    }
    
    public void setLockTimestampInSeconds(long lockTimestampInSeconds) {
        this.lockTimestampInSeconds = lockTimestampInSeconds;
    }

}
