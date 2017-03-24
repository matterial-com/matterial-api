package com.matterial.mtr.api.object;

import javax.xml.bind.annotation.XmlRootElement;

import com.matterial.mtr.api.object.meta.Identifiable;

/**
 * Container representing attachments
 */
@XmlRootElement
public class Attachment implements Identifiable, Comparable<Attachment> {
    
    private static final long serialVersionUID = 1L;
    
    public static final int STATUS_BIT_IMAGE_TEASER = 1 << 0;   // 1
    
    private long id;
    private String name;
    private int status;
    private String casId;
    private String casIdPdf;
    private String casIdThumbnail;
    private Long fileSize;
    private Long fileSizePdf;
    private Long fileSizeThumbnail;
    private long createTimeInSeconds;
    private String mimeType;
    
    public Attachment() {
        // *** do nothing;
    }
    
    public Attachment(long id, String name, int status, 
                      String casId, String casIdPdf, String casIdThumbnail,
                      Long fileSize, Long fileSizePdf, Long fileSizeThumbnail,
                      long createTimeInSeconds, String mimeType) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.casId = casId;
        this.casIdPdf = casIdPdf;
        this.casIdThumbnail = casIdThumbnail;
        this.fileSize = fileSize;
        this.fileSizePdf = fileSizePdf;
        this.fileSizeThumbnail = fileSizeThumbnail;
        this.createTimeInSeconds = createTimeInSeconds;
        this.mimeType = mimeType;
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
    
    public int getStatus() {
        return status;
    }
    
    public void setStatus(int status) {
        this.status = status;
    }
    
    public String getCasId() {
        return casId;
    }
    
    public void setCasId(String casId) {
        this.casId = casId;
    }
    
    public String getCasIdPdf() {
        return casIdPdf;
    }
    
    public void setCasIdPdf(String casIdPdf) {
        this.casIdPdf = casIdPdf;
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

    public Long getFileSizePdf() {
        return fileSizePdf;
    }

    public void setFileSizePdf(Long fileSizePdf) {
        this.fileSizePdf = fileSizePdf;
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
    
    @Override
    public int compareTo(Attachment o) {
        int result = -1;
        if( this.getId() == o.getId()){
            result = 0;
        }
        return result;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Attachment)) {
            return false;
        }
        Attachment other = (Attachment) obj;
        if (id != other.id) {
            return false;
        }
        return true;
    }

}
