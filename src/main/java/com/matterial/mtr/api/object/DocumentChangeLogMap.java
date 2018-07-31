package com.matterial.mtr.api.object;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * <strong>DocumentChangeLogMap</strong>
 */
@XmlRootElement
public class DocumentChangeLogMap implements Serializable {

    private static final long serialVersionUID = 1L;

    private long totalHits;
    private LinkedHashMap<Long, DocumentChangeLogs> map;

    public DocumentChangeLogMap() {
        this.totalHits = -1L;
    }

    public void add(long secondsAtStartOfDay, DocumentChangeLog dcl) {
        DocumentChangeLogs dcls = this.getMap().get(secondsAtStartOfDay);
        if(dcls == null) {
            dcls = new DocumentChangeLogs();
            this.getMap().put(secondsAtStartOfDay, dcls);
        }
        dcls.getDocumentChangeLogs().add(dcl);
    }

    public long getTotalHits() {
        return totalHits;
    }

    public void setTotalHits(long totalHits) {
        this.totalHits = totalHits;
    }

    public LinkedHashMap<Long, DocumentChangeLogs> getMap() {
        if(this.map == null) {
            this.map = new LinkedHashMap<>();
        }
        return this.map;
    }

    public void setMap(LinkedHashMap<Long, DocumentChangeLogs> map) {
        this.map = map;
    }

    public Set<Long> getKeys() {
        return this.getMap().keySet();
    }

    public void setKeys(Set<Long> keys) {
        // *** do nothing;
    }

    /**
     * <strong>DocumentChangeLogs</strong>
     */
    public static class DocumentChangeLogs {

        private List<DocumentChangeLog> documentChangeLogs;

        public DocumentChangeLogs() {
            // *** do nothing;
        }

        @XmlElement(name="documentChangeLog")
        public List<DocumentChangeLog> getDocumentChangeLogs() {
            if(this.documentChangeLogs == null) {
                this.documentChangeLogs = new ArrayList<>();
            }
            return this.documentChangeLogs;
        }

        public void setDocumentChangeLogs(List<DocumentChangeLog> documentChangeLogs) {
            this.documentChangeLogs = documentChangeLogs;
        }

    }

}
