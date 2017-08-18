package com.matterial.mtr.api.object;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.matterial.mtr.api.object.meta.Identifiable;

/**
 * Container representing additional properties of documents
 */
@XmlRootElement
public class AdditionalProperty implements Identifiable, Comparable<AdditionalProperty> {
    
    private static final long serialVersionUID = 1L;
    
    public static final int PROPERTY_TYPE_NEWS = 1;
    public static final int PROPERTY_TYPE_URGENT = 2;
    public static final int PROPERTY_TYPE_HELP_SECTION_DASHBOARD = 3;
    public static final int PROPERTY_TYPE_HELP_SECTION_DOCUMENT_EDITOR = 4;
    
    public static final String ADDITIONAL_PROPERTY_NAME_NEWS_DE = "Neuigkeit";
    public static final String ADDITIONAL_PROPERTY_DESCRIPTION_NEWS_DE = "Dokument taucht unter Neuigkeiten auf dem Dashboard auf";
    public static final String ADDITIONAL_PROPERTY_NAME_NEWS_EN = "News";
    public static final String ADDITIONAL_PROPERTY_DESCRIPTION_NEWS_EN = "Document will appear in the news-stream on the dashboard";

    public static final String ADDITIONAL_PROPERTY_NAME_URGENT_DE = "Wichtig";
    public static final String ADDITIONAL_PROPERTY_DESCRIPTION_URGENT_DE = "Dokument wird Benutzern nach dem Login prominent angeboten, bis sie es gelesen haben";
    public static final String ADDITIONAL_PROPERTY_NAME_URGENT_EN = "Urgent";
    public static final String ADDITIONAL_PROPERTY_DESCRIPTION_URGENT_EN = "Document will be suggested prominently after login, until read";

    public static final String ADDITIONAL_PROPERTY_NAME_HELP_SECTION_DASHBOARD_DE = "Willkommen";
    public static final String ADDITIONAL_PROPERTY_DESCRIPTION_HELP_SECTION_DASHBOARD_DE = "Dokument wird neuen Benutzern in der Willkommensbox auf dem Dashboard angeboten, bis sie die Box entfernen";
    public static final String ADDITIONAL_PROPERTY_NAME_HELP_SECTION_DASHBOARD_EN = "Welcome";
    public static final String ADDITIONAL_PROPERTY_DESCRIPTION_HELP_SECTION_DASHBOARD_EN = "Document will be suggested to new users within welcomebox on dashboard, until dismissed";

    public static final String ADDITIONAL_PROPERTY_NAME_HELP_SECTION_DOCUMENT_EDITOR_DE = "Dokumenteinführung";
    public static final String ADDITIONAL_PROPERTY_DESCRIPTION_HELP_SECTION_DOCUMENT_EDITOR_DE = "Dokument wird neuen Benutzern in der Box zur Dokumenterstellung angeboten, bis sie die Box entfernen";
    public static final String ADDITIONAL_PROPERTY_NAME_HELP_SECTION_DOCUMENT_EDITOR_EN = "Introducing document";
    public static final String ADDITIONAL_PROPERTY_DESCRIPTION_HELP_SECTION_DOCUMENT_EDITOR_EN = "Document will be suggested to new users within box to create knowledge in editor, until dismissed";

    
    public static final List<Integer> KNOWN_PROPERTY_TYPES;
    static {
        List<Integer> l = new ArrayList<>();
        // *** foreach constant within leading ID_;
        for (Field idField : AdditionalProperty.class.getFields()) {
            try {
                if(idField.getName().startsWith("PROPERTY_TYPE_") && 
                   idField.get(null) instanceof Integer) {
                    Integer id = (Integer)idField.get(null);
                    if(id != null && id > 0L) {
                        l.add(id);
                    }
                }
            }
            catch (Exception e) {
                // *** do nothing;
            }
        }
        KNOWN_PROPERTY_TYPES = Collections.unmodifiableList(l);
    }
    
    private long id;
    private String name;
    private String description;
    private Integer propertyType;
    private Long validBeginInSeconds;
    private Long validEndInSeconds;
    
    public AdditionalProperty() {
        // *** do nothing;
    }
    
    /**
     * Constructor (used in native query)
     */
    public AdditionalProperty(Number id, String name, String description, Number propertyType) {
       this((id!=null)?id.longValue():0L, name, description, (propertyType!=null)?propertyType.intValue():null); 
    }
    
    public AdditionalProperty(long id, 
                              String name, 
                              String description,
                              Integer propertyType) {
        this(id, name, description, propertyType, null, null);
    }

    public AdditionalProperty(long id, 
                              String name, 
                              String description, 
                              Integer propertyType,
                              Long validBeginInSeconds,
                              Long validEndInSeconds) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.propertyType = propertyType;
        this.validBeginInSeconds = validBeginInSeconds;
        this.validEndInSeconds = validEndInSeconds;
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
    
    public Integer getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(Integer propertyType) {
        this.propertyType = propertyType;
    }

    public Long getValidBeginInSeconds() {
        return validBeginInSeconds;
    }

    public void setValidBeginInSeconds(Long validBeginInSeconds) {
        this.validBeginInSeconds = validBeginInSeconds;
    }

    public Long getValidEndInSeconds() {
        return validEndInSeconds;
    }

    public void setValidEndInSeconds(Long validEndInSeconds) {
        this.validEndInSeconds = validEndInSeconds;
    }
    
    @Override
    public int compareTo(AdditionalProperty o) {
        int result = -1;
        if( this.getId() == o.getId() &&
           // *** valid-begin;
           ((this.getValidBeginInSeconds() == null && o.getValidBeginInSeconds() != null) ||
            (this.getValidBeginInSeconds() == null && o.getValidBeginInSeconds() != null) ||
            (this.getValidBeginInSeconds() != null && 
             o.getValidBeginInSeconds() != null && 
             this.getValidBeginInSeconds().equals(o.getValidBeginInSeconds()) ) )  &&
           // *** valid-end;
           ((this.getValidEndInSeconds() == null && o.getValidEndInSeconds() != null) ||
            (this.getValidEndInSeconds() == null && o.getValidEndInSeconds() != null) ||
            (this.getValidEndInSeconds() != null && 
            o.getValidEndInSeconds() != null && 
            this.getValidEndInSeconds().equals(o.getValidEndInSeconds()) ) ) ) {
            result = 0;
        }
        return result;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        result = prime * result + ((validBeginInSeconds == null) ? 0 : validBeginInSeconds.hashCode());
        result = prime * result + ((validEndInSeconds == null) ? 0 : validEndInSeconds.hashCode());
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
        if (!(obj instanceof AdditionalProperty)) {
            return false;
        }
        AdditionalProperty other = (AdditionalProperty) obj;
        if (id != other.id) {
            return false;
        }
        if (validBeginInSeconds == null) {
            if (other.validBeginInSeconds != null) {
                return false;
            }
        }
        else if (!validBeginInSeconds.equals(other.validBeginInSeconds)) {
            return false;
        }
        if (validEndInSeconds == null) {
            if (other.validEndInSeconds != null) {
                return false;
            }
        }
        else if (!validEndInSeconds.equals(other.validEndInSeconds)) {
            return false;
        }
        return true;
    }
    
}
