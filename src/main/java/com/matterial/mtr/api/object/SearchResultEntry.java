
package com.matterial.mtr.api.object;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Container class representing a single entry in a search result
 */
@XmlRootElement
// *** can not set generic to <T extends Indexable>, because of JAXB marshalling to XML will fail!
public class SearchResultEntry<T> extends ListResultEntry {

    private static final long serialVersionUID = 1L;

    private String type;
    private String id;
    private T source;
    private Map<String, Highlights> highlights;
    private float score;

    /**
     * constructor
     */
    public SearchResultEntry() {
        // *** do nothing;
    }

    /**
     * constructor
     */
    public SearchResultEntry(String type, String id, T source, float score) {
        this.type = type;
        this.id = id;
        this.source = source;
        this.score = score;
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

    public T getSource() {
        return this.source;
    }

    public void setSource(T source) {
        this.source = source;
    }

    public Map<String, Highlights> getHighlights() {
        return highlights;
    }

    public void setHighlights(Map<String, Highlights> highlights) {
        this.highlights = highlights;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "SearchResultEntry {\n"+
               "  type="+this.getType()+";\n"+
               "  id="+this.getId()+";\n"+
               "  score="+this.getScore()+";\n"+
               "}\n";
    }

    /**
     * <strong>Highlights</strong>
     */
    public static class Highlights {

        private List<String> highlights;

        public Highlights() {
            // *** do nothing;
        }

        @XmlElement(name="highlight")
        public List<String> getHighlights() {
            if(this.highlights == null) {
                this.highlights = new ArrayList<>();
            }
            return this.highlights;
        }

        public void setHighlights(List<String> highlights) {
            this.highlights = highlights;
        }

    }

}
