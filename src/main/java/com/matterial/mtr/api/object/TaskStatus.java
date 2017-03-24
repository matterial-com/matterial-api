package com.matterial.mtr.api.object;

import javax.xml.bind.annotation.XmlRootElement;

import com.matterial.mtr.api.object.meta.Identifiable;

/**
 * Container representing a taskStatus
 */
@XmlRootElement
public class TaskStatus implements Identifiable {
    
    public static final long ID_OPEN = 1L;
    public static final long ID_ACCEPTED = 2L;
    public static final long ID_CLOSED = 3L;
    public static final long ID_REJECTED = 4L;

    private static final long serialVersionUID = 1L;

    private long id;
    private String name;
    private String description;

    /**
     * Empty Constructor
     */
    public TaskStatus(){}
    
    /**
     * Constructor
     * @param id
     * @param name
     * @param description 
     */
    public TaskStatus(long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
    
    /**
     * Constructor (used in native query)
     */
    public TaskStatus(Number id, String name, String description) {
       this((id!=null)?id.longValue():0L, name, description); 
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
}