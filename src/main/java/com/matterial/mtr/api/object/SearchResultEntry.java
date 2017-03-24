
package com.matterial.mtr.api.object;

import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Container class representing a single entry in a search result
 */
@XmlRootElement
public class SearchResultEntry extends ListResultEntry {

    private static final long serialVersionUID = 1L;
    
    private String type;
    private String id;
    private Map<String,Object> source;
    private Map<String,List<String>> highlights;
    private float score;

    public SearchResultEntry(){

    }

    @Override
    public String toString() {
        return "SearchResultEntry{" + "type=" + type + ", id=" + id + ", score=" + score + '}';
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Map<String,Object> getSource() {
        return source;
    }
    public void setSource(Map<String,Object> source) {
        this.source = source;
    }
    public Map<String, List<String>> getHighlights() {
        return highlights;
    }
    public void setHighlights(Map<String, List<String>> highlights) {
        this.highlights = highlights;
    }
    public float getScore() {
        return score;
    }
    public void setScore(float score) {
        this.score = score;
    }
}