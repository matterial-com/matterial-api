package com.matterial.mtr.api.object;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

import javax.xml.bind.annotation.XmlRootElement;

import com.matterial.mtr.api.object.meta.Identifiable;

/**
 * <strong>DataSource</strong>
 */
@XmlRootElement
public class DataSource extends ListResultEntry implements Identifiable {

    private static final long serialVersionUID = 1L;

    private long id;
    private Long activeUntilInSeconds;
    private String name;
    private String displayName;
    private String reference;
    private String server;

    public DataSource() {
        // *** do nothing;
    }

    public DataSource(String name) {
        this.activeUntilInSeconds = null;
        this.name = name;
        this.displayName = name;
    }

    public DataSource(long id, Long activeUntilInSeconds, String name, String displayName, String reference, String server) {
        this(name);
        this.id = id;
        this.activeUntilInSeconds  = activeUntilInSeconds;
        if(displayName != null) {
            this.displayName = displayName;
        }
        if(reference != null) {
            this.reference = reference;
        }
        if(server != null) {
            this.server = server;
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

    public Long getActiveUntilInSeconds() {
        return activeUntilInSeconds;
    }

    public void setActiveUntilInSeconds(Long activeUntilInSeconds) {
        this.activeUntilInSeconds = activeUntilInSeconds;
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

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    /**
     * @return true, of currently this datasource is active
     */
    public boolean isActive() {
        return (this.getActiveUntilInSeconds() == null ||
                this.activeUntilInSeconds > LocalDateTime.now().toEpochSecond(ZoneOffset.UTC));
    }

    /**
     * dummy implementation, does nothing.
     */
    public void setActive(boolean active) {
        // *** do nothing;
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("id: ");
        buffer.append(this.getId());
        buffer.append(", activeUntilInSeconds: ");
        buffer.append(this.getActiveUntilInSeconds());
        buffer.append(", name: ");
        buffer.append(this.getName());
        buffer.append(", displayName: ");
        buffer.append(this.getDisplayName());
        buffer.append(", reference: ");
        buffer.append(this.getReference());
        buffer.append(", server: ");
        buffer.append(this.getServer());
        buffer.append(", active: ");
        buffer.append(this.isActive());
        return buffer.toString();
    }

}
