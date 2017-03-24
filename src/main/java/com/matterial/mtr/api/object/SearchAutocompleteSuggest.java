
package com.matterial.mtr.api.object;


import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Container class representing an autocomplete suggestion
 */
@XmlRootElement
public class SearchAutocompleteSuggest implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private String label;
    private String value;
    private Object object;

    public SearchAutocompleteSuggest(){
        
    }

    public SearchAutocompleteSuggest(String value) {
        this.value = value;
    }

    public SearchAutocompleteSuggest(String label, String value, Object object) {
        this.label = label;
        this.value = value;
        this.object = object;
    }

    @Override
    public String toString() {
        return "SearchAutocompleteSuggest{" + "label=" + label + ", value=" + value + ", object=" + object + '}';
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
