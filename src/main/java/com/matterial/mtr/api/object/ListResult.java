package com.matterial.mtr.api.object;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * <strong>ListResult</strong>
 */
@XmlRootElement
public class ListResult<T extends ListResultEntry> implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private long totalHits;
    private List<T> results;
    
    public ListResult() {
        // *** do nothing;
    }
    
    public ListResult(List<T> results, Long totalHits) {
        this.results = results;
        this.totalHits = (totalHits!=null)?totalHits:-1L;
    }
    
    public ListResult(List<T> results) {
        this(results, null);
    }
    
    public long getTotalHits() {
        return totalHits;
    }
    
    public void setTotalHits(long totalHits) {
        this.totalHits = totalHits;
    }
    
    public List<T> getResults() {
        if(this.results == null) {
            this.results = new ArrayList<>();
        }
        return results;
    }
    
    public void setResults(List<T> results) {
        this.results = results;
    }
    
}
