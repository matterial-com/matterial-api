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
    
    public DataSource() {
        // *** do nothing;
    }
    
    public DataSource(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
