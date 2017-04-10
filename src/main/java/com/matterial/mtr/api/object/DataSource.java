package com.matterial.mtr.api.object;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * <strong>DataSource</strong>
 */
@XmlRootElement
public class DataSource implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private String name;
    private String displayName;
    private String reference;
    
    public DataSource() {
        // *** do nothing;
    }
    
    public DataSource(String name) {
        this.name = name;
        this.displayName = name;
        this.reference = name;
    }
    
    public DataSource(String name, String displayName, String reference) {
        this(name);
        if(displayName != null) {
            this.displayName = displayName;
        }
        if(reference != null) {
            this.reference = reference;
        }
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
        buffer.append("name:");
        buffer.append(this.getName());
        buffer.append(", displayName:");
        buffer.append(this.getDisplayName());
        buffer.append(", reference:");
        buffer.append(this.getReference());
        return buffer.toString();
    }
    
}
