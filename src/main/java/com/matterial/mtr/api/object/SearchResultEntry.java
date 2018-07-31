
package com.matterial.mtr.api.object;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.matterial.mtr.api.object.meta.Indexable;

/**
 * Container class representing a single entry in a search result
 */
@XmlRootElement
public class SearchResultEntry extends ListResultEntry {

    private static final long serialVersionUID = 1L;

    private String type;
    private String id;
    private Indexable source;
    private List<Highlight> highlights;
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
    public SearchResultEntry(String type, String id, Indexable source, float score) {
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

    public Indexable getSource() {
        return this.source;
    }

    public void setSource(Indexable source) {
        this.source = source;
    }

    public List<Highlight> getHighlights() {
        if(this.highlights == null) {
            this.highlights = new ArrayList<>();
        }
        return highlights;
    }

    public void setHighlights(List<Highlight> highlights) {
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
     * <strong>Highlight</strong>
     */
    public static class Highlight {

        /**
         * searchquery found in this field.
         * for example: languageVersionTitle, languageVersionAbstract, mainContent, ...
         */
        private String indexField;
        /** fragments found within indexField */
        private List<String> fragments;

        public Highlight() {
            // *** do nothing;
        }

        public String getIndexField() {
            return indexField;
        }

        public void setIndexField(String indexField) {
            this.indexField = indexField;
        }

        public List<String> getFragments() {
            if(this.fragments == null) {
                this.fragments = new ArrayList<>();
            }
            return this.fragments;
        }

        public void setFragments(List<String> fragments) {
            this.fragments = fragments;
        }

    }

}
