package com.matterial.mtr.api.object;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * <strong>DocumentNotification</strong>
 */
@XmlRootElement
public class DocumentNotification extends Notification {

    private static final long serialVersionUID = 1L;

    private long documentId;

    public DocumentNotification() {
        // *** do nothing;
    }

    public DocumentNotification(String message,
                                long documentId) {
        super(message);
        this.documentId = documentId;
    }

    public long getDocumentId() {
        return documentId;
    }

    public void setDocumentId(long documentId) {
        this.documentId = documentId;
    }

}
