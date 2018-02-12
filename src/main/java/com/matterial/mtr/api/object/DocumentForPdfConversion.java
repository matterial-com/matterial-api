package com.matterial.mtr.api.object;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * <strong>DocumentForPdfConversion</strong>
 */
@XmlRootElement
public class DocumentForPdfConversion implements Serializable {

    private static final long serialVersionUID = 1L;

    private Document document;
    private String mainFile;

    public DocumentForPdfConversion() {
        // *** do nothing;
    }

    public DocumentForPdfConversion(Document document, String mainFile) {
        super();
        this.document = document;
        this.mainFile = mainFile;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public String getMainFile() {
        return mainFile;
    }

    public void setMainFile(String mainFile) {
        this.mainFile = mainFile;
    }

}
