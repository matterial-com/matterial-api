
package com.matterial.mtr.api.object;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Container class representing a search result
 */
@XmlRootElement
public class SearchResult extends ListResult<SearchResultEntry> {

    private static final long serialVersionUID = 1L;

    private Map<String, HashMap<String, Long>> aggregations;

    public SearchResult() {
        // *** do nothing;
    }

    @Override
    public String toString() {
        return "SearchResult{" +
               "totalHits=" + this.getTotalHits() +
               ", results=" + this.getResults() +
               ", aggregations=" + aggregations +
               '}';
    }

    public Map<String, HashMap<String, Long>> getAggregations() {
        return aggregations;
    }

    public void setAggregations(Map<String, HashMap<String, Long>> aggregations) {
        this.aggregations = aggregations;
    }

}
