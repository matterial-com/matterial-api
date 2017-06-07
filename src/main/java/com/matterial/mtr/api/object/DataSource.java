package com.matterial.mtr.api.object;

import javax.xml.bind.annotation.XmlRootElement;

import com.matterial.mtr.api.object.meta.Identifiable;

/**
 * <strong>DataSource</strong>
 */
@XmlRootElement
public class DataSource extends ListResultEntry implements Identifiable {
    
    private static final long serialVersionUID = 1L;
    
    private long id;
    private boolean active;
    private String name;
    private String displayName;
    private String reference;
    
    public DataSource() {
        // *** do nothing;
    }
    
    public DataSource(String name) {
        this.active = true;
        this.name = name;
        this.displayName = name;
    }
    
    public DataSource(long id, boolean active, String name, String displayName, String reference) {
        this(name);
        this.id = id;
        this.active  = active;
        if(displayName != null) {
            this.displayName = displayName;
        }
        if(reference != null) {
            this.reference = reference;
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

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDisplayName() {
        return displayName;
    }
    
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
    
    public String getReference() {
        return reference;
    }
    
    public void setReference(String reference) {
        this.reference = reference;
    }
    
    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("id:");
        buffer.append(this.getId());
        buffer.append(", active:");
        buffer.append(this.isActive());
        buffer.append(", name:");
        buffer.append(this.getName());
        buffer.append(", displayName:");
        buffer.append(this.getDisplayName());
        buffer.append(", reference:");
        buffer.append(this.getReference());
        return buffer.toString();
    }

}
