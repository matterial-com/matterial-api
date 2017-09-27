package com.matterial.mtr.api.object;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * <strong>DocumentChangeLogMap</strong>
 */
@XmlRootElement
public class DocumentChangeLogMap implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private long totalHits;
    private Map<Long, List<DocumentChangeLog>> map;

    public DocumentChangeLogMap() {
        this.totalHits = -1L;
    }
    
    public void add(long secondsAtStartOfDay, DocumentChangeLog dcl) {
        List<DocumentChangeLog> dcls = this.getMap().get(secondsAtStartOfDay);
        if(dcls == null) {
            dcls = new ArrayList<>();
            this.getMap().put(secondsAtStartOfDay, dcls);
        }
        dcls.add(dcl);
    }
    
    public long getTotalHits() {
        return totalHits;
    }
    
    public void setTotalHits(long totalHits) {
        this.totalHits = totalHits;
    }
    
    public Map<Long, List<DocumentChangeLog>> getMap() {
        if(this.map == null) {
            this.map = new LinkedHashMap<>();
        }
        return this.map;
    }
    
    public void setMap(Map<Long, List<DocumentChangeLog>> map) {
        this.map = map;
    }
    
}
