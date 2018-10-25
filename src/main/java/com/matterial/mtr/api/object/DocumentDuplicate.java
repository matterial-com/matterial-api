package com.matterial.mtr.api.object;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * <strong>DocumentDuplicate</strong> represents a duplicated document.
 */
@XmlRootElement
public class DocumentDuplicate implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Document> documents;
    private List<TempFileDescriptor> tempFileDescriptors;

    public List<Document> getDocuments() {
        if(this.documents == null) {
            this.documents = new ArrayList<>();
        }
        return documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }

    public List<TempFileDescriptor> getTempFileDescriptors() {
        if(this.tempFileDescriptors == null) {
            this.tempFileDescriptors = new ArrayList<>();
        }
        return tempFileDescriptors;
    }

    public void setTempFileDescriptors(List<TempFileDescriptor> tempFileDescriptors) {
        this.tempFileDescriptors = tempFileDescriptors;
    }

}
