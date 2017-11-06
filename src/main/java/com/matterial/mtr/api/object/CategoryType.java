package com.matterial.mtr.api.object;

import javax.xml.bind.annotation.XmlRootElement;

import com.matterial.mtr.api.object.meta.Identifiable;

/**
 * Container representing a CategoryType
 * @author Philipp
 */
@XmlRootElement
public class CategoryType implements Identifiable {
    
    private static final long serialVersionUID = 1L;
    
    public static final String NAME_TAG = "Tag";
    
    private long id;
    private String name;
    private String description;
    private boolean quick;
    private boolean tag;
    private boolean personal;    

    /**
     * Empty Constructor
     */
    public CategoryType(){
        // *** do nothing;
    }
    
    /**
     * Constructor
     * 
     * @param id
     * @param name
     * @param description
     * @param accountId
     */
    public CategoryType(long id, String name, String description, boolean quick, boolean tag, boolean personal) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.quick = quick;
        this.tag = tag;
        this.personal = personal;
    }
    
    /**
     * Constructor (used in native query)
     */
    public CategoryType(Number id, String name, String description, Object quick, Object tag, Number accountId) {
        this((id!=null)?id.longValue():0L, 
             name, 
             description, 
             // *** quick: oracle: BigDecimal, all other db: Boolean;
             (quick != null && ((quick instanceof Boolean && (Boolean)quick) || (quick instanceof Number && ((Number)quick).longValue() > 0)) ),
             // *** tag: oracle: BigDecimal, all other db: Boolean;
             (tag != null && ((tag instanceof Boolean && (Boolean)tag) || (tag instanceof Number && ((Number)tag).longValue() > 0)) ),
             (accountId != null && accountId.longValue() > 0L));
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
    
    public boolean isTag() {
        return this.tag;
    }

    public void setTag(boolean tag) {
        this.tag = tag;
    }
    
    public boolean isPersonal() {
        return personal;
    }

    public void setPersonal(boolean personal) {
        this.personal = personal;
    }

}
