package com.matterial.mtr.api.object;

import javax.xml.bind.annotation.XmlRootElement;

import com.matterial.mtr.api.object.meta.Identifiable;

/**
 * Container representing a category
 */
@XmlRootElement
public class Category implements Identifiable {
    
    private static final long serialVersionUID = 1L;

    public static final String NAME_QUICK = "Quick";
    
    private long id;
    private String name;
    private String description;
    private boolean quick;
    private long typeId;
    private String casId;
    private String casIdThumbnail;
    private Long fileSize;
    private Long fileSizeThumbnail;

    /**
     * Empty Constructor
     */
    public Category() {
        // *** do nothing;
    }
    
    /**
     * Constructor
     * 
     * @param id
     * @param name
     * @param description
     * @param typeId
     * @param casId 
     * @param casIdThumbnail
     */
    public Category(long id, String name, String description, boolean quick, long typeId, 
                    String casId, String casIdThumbnail,
                    Long fileSize, Long fileSizeThumbnail) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.quick = quick;
        this.typeId = typeId;
        this.casId = casId;
        this.casIdThumbnail = casIdThumbnail;
        this.fileSize = fileSize;
        this.fileSizeThumbnail = fileSizeThumbnail;
    }
    
    /**
     * Constructor (used in native query)
     */
    public Category(Number id, String name, String description, Object quick, Number typeId, 
                    String casId, String casIdThumbnail,
                    Number fileSize, Number fileSizeThumbnail) {
        this((id!=null)?id.longValue():0L, 
             name, 
             description, 
             // *** quick: oracle: BigDecimal, all other db: Boolean;
             (quick != null && ((quick instanceof Boolean && (Boolean)quick) || (quick instanceof Number && ((Number)quick).longValue() > 0)) ),
             (typeId!=null)?typeId.longValue():0L, 
             casId,
             casIdThumbnail,
             (fileSize!=null)?fileSize.longValue():null,
             (fileSizeThumbnail!=null)?fileSizeThumbnail.longValue():null);
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public boolean isQuick() {
        return this.quick;
    }

    public void setQuick(boolean quick) {
        this.quick = quick;
    }
    
    public long getTypeId() {
        return typeId;
    }

    public void setTypeId(long typeId) {
        this.typeId = typeId;
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
    
}
