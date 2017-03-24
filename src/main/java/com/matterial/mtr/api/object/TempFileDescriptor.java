package com.matterial.mtr.api.object;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * <strong>TempFileDescriptor</strong>
 */
@XmlRootElement
public class TempFileDescriptor implements Serializable {

    private static final long serialVersionUID = 1L;
    
    public static final String FILE_TYPE_DOCUMENT = "document";
    public static final String FILE_TYPE_ATTACHMENT = "attachment";
    public static final String FILE_TYPE_CONTACT_IMAGE = "contactimage";
    public static final String FILE_TYPE_CATEGORY = "category";
    //public static final String FILE_TYPE_GALLERY = "gallery";
    //public static final String FILE_TYPE_COMPENDIUM = "compendium";
    
    private String fileToken;
    private String contextToken;
    private String languageKey;
    private String tempFileName;
    private String fileName;
    private String mimeType;
    private String fileType;
    private long fileSize;
    
    
    public String getFileToken() {
        return fileToken;
    }

    public void setFileToken(String fileToken) {
        this.fileToken = fileToken;
    }
    
    public String getContextToken() {
        return contextToken;
    }

    public void setContextToken(String contextToken) {
        this.contextToken = contextToken;
    }
    
    public String getLanguageKey() {
        return languageKey;
    }
    
    public void setLanguageKey(String languageKey) {
        this.languageKey = languageKey;
    }

    public String getTempFileName() {
        return tempFileName;
    }
    
    public void setTempFileName(String tempFileName) {
        this.tempFileName = tempFileName;
    }
    
    public String getFileName() {
        return fileName;
    }
    
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    
    public String getMimeType() {
        return mimeType;
    }
    
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }
    
    public String getFileType() {
        return fileType;
    }
    
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }
    
    public long getFileSize() {
        return fileSize;
    }
    
    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

}
