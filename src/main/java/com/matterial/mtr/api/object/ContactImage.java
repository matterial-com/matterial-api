package com.matterial.mtr.api.object;

import javax.xml.bind.annotation.XmlRootElement;

import com.matterial.mtr.api.object.meta.Identifiable;
import com.matterial.mtr.api.object.meta.IndexableChild;

/**
 * Container representing ContactImages
 */
@XmlRootElement
public class ContactImage extends IndexableChild implements Identifiable {

    private static final long serialVersionUID = 1L;

    public static final int STATUS_BIT_INTERNAL = 1 << 0;          // 1
    public static final int STATUS_BIT_ACTIVE = 1 << 1;            // 2
    public static final int STATUS_BIT_EXTERNAL = 1 << 2;          // 4
    public static final int STATUS_BIT_GRAVATAR = 1 << 3;          // 8
    public static final int STATUS_BIT_GOOGLE = 1 << 4;            // 16
    public static final int STATUS_BIT_COBOT = 1 << 5;             // 32

    private long id;
    private String name;
    private String casId;
    private String casIdThumbnail;
    private Long fileSize;
    private Long fileSizeThumbnail;
    private long createTimeInSeconds;
    private String mimeType;
    private String externalImgUrl;
    private boolean internal;
    private boolean active;
    private boolean external;
    private boolean gravatar;
    private boolean google;
    private boolean cobot;
    private String reference;

    public ContactImage() {
        // *** empty;
    }

    public ContactImage(long id, String name,
                        int status, String casId,
                        String casIdThumbnail,
                        Long fileSize, Long fileSizeThumbnail,
                        long createTimeInSeconds,
                        String externalImgUrl,
                        String mimeType,
                        String reference) {
        this(id, name, status, casId, casIdThumbnail, fileSize, fileSizeThumbnail, createTimeInSeconds, externalImgUrl, mimeType);
        this.reference = reference;
    }

    public ContactImage(long id, String name,
                        int status, String casId,
                        String casIdThumbnail,
                        Long fileSize, Long fileSizeThumbnail,
                        long createTimeInSeconds,
                        String externalImgUrl,
                        String mimeType) {
        this.id = id;
        this.name = name;
        this.casId = casId;
        this.casIdThumbnail = casIdThumbnail;
        this.fileSize = fileSize;
        this.fileSizeThumbnail = fileSizeThumbnail;
        this.createTimeInSeconds = createTimeInSeconds;
        this.externalImgUrl = externalImgUrl;
        this.mimeType = mimeType;
        // *** status;
        if((status & STATUS_BIT_INTERNAL) > 0) {
            this.setInternal(true);
        }
        if((status & STATUS_BIT_ACTIVE) > 0) {
            this.setActive(true);
        }
        if((status & STATUS_BIT_EXTERNAL) > 0) {
            this.setExternal(true);
        }
        if((status & STATUS_BIT_GRAVATAR) > 0) {
            this.setGravatar(true);
        }
        if((status & STATUS_BIT_GOOGLE) > 0) {
            this.setGoogle(true);
        }
        if((status & STATUS_BIT_COBOT) > 0) {
            this.setCobot(true);
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCasId() {
        return casId;
    }

    public void setCasId(String casId) {
        this.casId = casId;
    }

    public String getCasIdThumbnail() {
        return casIdThumbnail;
    }

    public void setCasIdThumbnail(String casIdThumbnail) {
        this.casIdThumbnail = casIdThumbnail;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public Long getFileSizeThumbnail() {
        return fileSizeThumbnail;
    }

    public void setFileSizeThumbnail(Long fileSizeThumbnail) {
        this.fileSizeThumbnail = fileSizeThumbnail;
    }

    public long getCreateTimeInSeconds() {
        return createTimeInSeconds;
    }

    public void setCreateTimeInSeconds(long createTimeInSeconds) {
        this.createTimeInSeconds = createTimeInSeconds;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getExternalImgUrl() {
        return externalImgUrl;
    }

    public void setExternalImgUrl(String externalImgUrl) {
        this.externalImgUrl = externalImgUrl;
    }

    public boolean isInternal() {
        return internal;
    }

    public void setInternal(boolean internal) {
        this.internal = internal;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isExternal() {
        return external;
    }

    public void setExternal(boolean external) {
        this.external = external;
    }

    public boolean isGravatar() {
        return gravatar;
    }

    public void setGravatar(boolean gravatar) {
        this.gravatar = gravatar;
    }

    public boolean isGoogle() {
        return google;
    }

    public void setGoogle(boolean google) {
        this.google = google;
    }

    public boolean isCobot() {
        return cobot;
    }

    public void setCobot(boolean cobot) {
        this.cobot = cobot;
    }

    public String getReference() {
        if(this.reference == null &&
           this.isGravatar()) {
           return this.name;
        }
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

}
