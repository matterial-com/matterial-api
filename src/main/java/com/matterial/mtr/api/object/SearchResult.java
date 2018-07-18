
package com.matterial.mtr.api.object;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Container class representing a search result
 */
@XmlRootElement
public class SearchResult extends ListResult<SearchResultEntry> {

    private static final long serialVersionUID = 1L;

    private List<Aggregation> aggregations;

    public SearchResult() {
        // *** do nothing;
    }

    @Override
    public String toString() {
        return "SearchResult{" +
               "totalHits=" + this.getTotalHits() +
               ", results=" + this.getResults() +
               ", aggregation=" + this.getAggregations() +
               '}';
    }

    public List<Aggregation> getAggregations() {
        if(this.aggregations == null) {
            this.aggregations = new ArrayList<>();
        }
        return aggregations;
    }

    public void setAggregations(List<Aggregation> aggregations) {
        this.aggregations = aggregations;
    }

    /**
     * <strong>Aggregation</strong>
     */
    public static class Aggregation {

        /**
         * aggregation found for this field.
         * for example: categoryIds, ...
         */
        private String indexField;
        /** buckets-map contains of: key: value of indexField, value: hits */
        private Map<String, Long> buckets;

        public Aggregation() {
            // *** do nothing;
        }

        public String getIndexField() {
            return indexField;
        }

        public void setIndexField(String indexField) {
            this.indexField = indexField;
        }

        public Map<String, Long> getBuckets() {
            if(this.buckets == null) {
                this.buckets = new HashMap<>();
            }
            return this.buckets;
        }

        public void setBuckets(Map<String, Long> buckets) {
            this.buckets = buckets;
        }

        @Override
        public String toString() {
            StringBuilder buffer = new StringBuilder();
            buffer.append(this.getIndexField());
            buffer.append(":");
            buffer.append(this.getBuckets());
            return buffer.toString();
        }

    }

}
