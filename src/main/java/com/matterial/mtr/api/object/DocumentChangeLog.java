package com.matterial.mtr.api.object;

import javax.xml.bind.annotation.XmlRootElement;

import com.matterial.mtr.api.object.meta.Identifiable;

/**
 * <strong>DocumentChangeLog</strong>
 */
@XmlRootElement
public class DocumentChangeLog extends ListResultEntry implements Identifiable {
    
    private static final long serialVersionUID = 1L;
    
    public static final long DOC_VALID_TRUE = 1L << 1;
    public static final long DOC_VALID_FALSE = 1L << 2;
    public static final long DOC_VALID_BEGIN = 1L << 3;
    public static final long DOC_VALID_END = 1L << 4;
    public static final long DOC_ARCHIVED_TRUE = 1L << 5;
    public static final long DOC_ARCHIVED_FALSE = 1L << 6;
    public static final long DOC_ARCHIVED_BEGIN = 1L << 7;
    public static final long DOC_CATEGORY = 1L << 8;
    public static final long DOC_PERMISSION = 1L << 9;
    public static final long DOC_REVIEW_UNTIL = 1L << 10;
    public static final long DOC_TRASHED_TRUE = 1L << 11;
    public static final long DOC_TRASHED_FALSE = 1L << 12;
    public static final long DOC_ADDITIONAL_PROPERTY = 1L << 13;
    public static final long DOC_LANGUAGE_REMOVED = 1L << 25;
    public static final long DOC_VERSION_REMOVED = 1L << 26;
    
    public static final long DLV_TITLE = 1L << 14;
    public static final long DLV_ABSTRACT = 1L << 15;
    public static final long DLV_VALID_BEGIN = 1L << 16;
    public static final long DLV_VALID_END = 1L << 17;
    public static final long DLV_MAIN_FILE = 1L << 18;
    public static final long DLV_ATTACHMENT = 1L << 19;
    public static final long DLV_REVIEW_REQUEST_GRANTED = 1L << 20;
    public static final long DLV_REVIEW_REQUEST_DECLINED = 1L << 21;
    public static final long DLV_REVIEW_REQUESTED = 1L << 22;
    public static final long DLV_EXTENSION_VALUE = 1L << 23;
    public static final long DLV_PUBLISHED = 1L << 24;
    
    private long id;
    // *** person;
    private Person person;
    // *** document;
    private long documentId;
    private Long languageVersionId;
    private Integer languageVersionVersion;
    private Long languageVersionLanguageId;
    private String languageVersionLanguageKey;
    // *** change-date;
    private Long changeDateInSeconds;
    // *** action-bitmask;
    private long action;
    
    private boolean docValidTrue;
    private boolean docValidFalse;
    private boolean docValidBegin;
    private boolean docValidEnd;
    private boolean docArchivedTrue;
    private boolean docArchivedFalse;
    private boolean docArchivedBegin;
    private boolean docCategory;
    private boolean docPermission;
    private boolean docReviewUntil;
    private boolean docTrashedTrue;
    private boolean docTrashedFalse;
    private boolean docAdditionalProperty;
    private boolean docLanguageRemoved;
    private boolean docVersionRemoved;
    private boolean dlvTitle;
    private boolean dlvAbstract;
    private boolean dlvValidBegin;
    private boolean dlvValidEnd;
    private boolean dlvMainFile;
    private boolean dlvAttachment;
    private boolean dlvReviewRequestGranted;
    private boolean dlvReviewRequestDeclined;
    private boolean dlvReviewRequested;
    private boolean dlvExtensionValue;
    private boolean dlvPublished;
    
    
    public DocumentChangeLog() {
        // *** do nothing;
    }
    
    public DocumentChangeLog(long bitmask) {
        this.action = bitmask;
        // *** doc;
        this.docValidTrue = ((bitmask & DOC_VALID_TRUE) > 0);
        this.docValidFalse = ((bitmask & DOC_VALID_FALSE) > 0);
        this.docValidBegin = ((bitmask & DOC_VALID_BEGIN) > 0);
        this.docValidEnd = ((bitmask & DOC_VALID_END) > 0);
        this.docArchivedTrue = ((bitmask & DOC_ARCHIVED_TRUE) > 0);
        this.docArchivedFalse = ((bitmask & DOC_ARCHIVED_FALSE) > 0);
        this.docArchivedBegin = ((bitmask & DOC_ARCHIVED_BEGIN) > 0);
        this.docCategory = ((bitmask & DOC_CATEGORY) > 0);
        this.docPermission = ((bitmask & DOC_PERMISSION) > 0);
        this.docReviewUntil = ((bitmask & DOC_REVIEW_UNTIL) > 0);
        this.docTrashedTrue = ((bitmask & DOC_TRASHED_TRUE) > 0);
        this.docTrashedFalse = ((bitmask & DOC_TRASHED_FALSE) > 0);
        this.docAdditionalProperty = ((bitmask & DOC_ADDITIONAL_PROPERTY) > 0);
        this.docLanguageRemoved = ((bitmask & DOC_LANGUAGE_REMOVED) > 0);
        this.docVersionRemoved = ((bitmask & DOC_VERSION_REMOVED) > 0);
        // *** dlv;
        this.dlvTitle = ((bitmask & DLV_TITLE) > 0);
        this.dlvAbstract = ((bitmask & DLV_ABSTRACT) > 0);
        this.dlvValidBegin = ((bitmask & DLV_VALID_BEGIN) > 0);
        this.dlvValidEnd = ((bitmask & DLV_VALID_END) > 0);
        this.dlvMainFile = ((bitmask & DLV_MAIN_FILE) > 0);
        this.dlvAttachment = ((bitmask & DLV_ATTACHMENT) > 0);
        this.dlvReviewRequestGranted = ((bitmask & DLV_REVIEW_REQUEST_GRANTED) > 0);
        this.dlvReviewRequestDeclined = ((bitmask & DLV_REVIEW_REQUEST_DECLINED) > 0);
        this.dlvReviewRequested = ((bitmask & DLV_REVIEW_REQUESTED) > 0);
        this.dlvExtensionValue = ((bitmask & DLV_EXTENSION_VALUE) > 0);
        this.dlvPublished = ((bitmask & DLV_PUBLISHED) > 0);
    }
    
    /**
     * Constructor (implicit Person construction)
     */
    public DocumentChangeLog(long id,
                             long changeDateInSeconds,
                             long action,
                             long documentId,
                             Long languageVersionId,
                             Integer languageVersionVersion,
                             Long languageVersionLanguageId,
                             String languageVersionLanguageKey,
                             Long accountId,
                             String accountLogin,
                             Long superiorAccountId,
                             long accountCreateTimeInSeconds,
                             Long accountLastLoginInSeconds,
                             Boolean instanceAdmin,
                             Boolean limited,
                             long contactId,
                             String firstName,
                             String lastName,
                             String position,
                             Long birthdayInSeconds,
                             Integer gender) {
        this(action);
        this.id = id;
        this.changeDateInSeconds = changeDateInSeconds;
        this.documentId = documentId;
        this.languageVersionId = languageVersionId;
        this.languageVersionVersion = languageVersionVersion;
        this.languageVersionLanguageId = languageVersionLanguageId;
        this.languageVersionLanguageKey = languageVersionLanguageKey;
        this.person = new Person(accountId, accountLogin, superiorAccountId, accountCreateTimeInSeconds, 
                                 accountLastLoginInSeconds, instanceAdmin, limited, 
                                 contactId, firstName, lastName, position, birthdayInSeconds, gender);
    }

    
    /**
     * updates the bitmask according to the boolean fields;
     */
    public void updateBitmask() {
        long bitmask = 0L;
        // *** doc;
        if (this.docValidTrue) {
            bitmask |= DOC_VALID_TRUE;
        }
        if (this.docValidFalse) {
            bitmask |= DOC_VALID_FALSE;
        }
        if (this.docValidBegin) {
            bitmask |= DOC_VALID_BEGIN;
        }
        if (this.docValidEnd) {
            bitmask |= DOC_VALID_END;
        }
        if (this.docArchivedTrue) {
            bitmask |= DOC_ARCHIVED_TRUE;
        }
        if (this.docArchivedFalse) {
            bitmask |= DOC_ARCHIVED_FALSE;
        }
        if (this.docArchivedBegin) {
            bitmask |= DOC_ARCHIVED_BEGIN;
        }
        if (this.docCategory) {
            bitmask |= DOC_CATEGORY;
        }
        if (this.docPermission) {
            bitmask |= DOC_PERMISSION;
        }
        if (this.docReviewUntil) {
            bitmask |= DOC_REVIEW_UNTIL;
        }
        if (this.docTrashedTrue) {
            bitmask |= DOC_TRASHED_TRUE;
        }
        if (this.docTrashedFalse) {
            bitmask |= DOC_TRASHED_FALSE;
        }
        if (this.docAdditionalProperty) {
            bitmask |= DOC_ADDITIONAL_PROPERTY;
        }
        if (this.docLanguageRemoved) {
            bitmask |= DOC_LANGUAGE_REMOVED;
        }
        if (this.docVersionRemoved) {
            bitmask |= DOC_VERSION_REMOVED;
        }
        // *** dlv;
        if (this.dlvTitle) {
            bitmask |= DLV_TITLE;
        }
        if (this.dlvAbstract) {
            bitmask |= DLV_ABSTRACT;
        }
        if (this.dlvValidBegin) {
            bitmask |= DLV_VALID_BEGIN;
        }
        if (this.dlvValidEnd) {
            bitmask |= DLV_VALID_END;
        }
        if (this.dlvMainFile) {
            bitmask |= DLV_MAIN_FILE;
        }
        if (this.dlvAttachment) {
            bitmask |= DLV_ATTACHMENT;
        }
        if (this.dlvReviewRequestGranted) {
            bitmask |= DLV_REVIEW_REQUEST_GRANTED;
        }
        if (this.dlvReviewRequestDeclined) {
            bitmask |= DLV_REVIEW_REQUEST_DECLINED;
        }
        if (this.dlvReviewRequested) {
            bitmask |= DLV_REVIEW_REQUESTED;
        }
        if (this.dlvExtensionValue) {
            bitmask |= DLV_EXTENSION_VALUE;
        }
        if (this.dlvPublished) {
            bitmask |= DLV_PUBLISHED;
        }
        this.setAction(bitmask);
    }
    
    @Override
    public long getId() {
        return id;
    }
    
    @Override
    public void setId(long id) {
        this.id = id;
    }
    
    public Person getPerson() {
        return person;
    }
    
    public void setPerson(Person person) {
        this.person = person;
    }
    
    public long getDocumentId() {
        return documentId;
    }
    
    public void setDocumentId(long documentId) {
        this.documentId = documentId;
    }
    
    public Long getLanguageVersionId() {
        return languageVersionId;
    }
    
    public void setLanguageVersionId(Long languageVersionId) {
        this.languageVersionId = languageVersionId;
    }
    
    public Integer getLanguageVersionVersion() {
        return languageVersionVersion;
    }
    
    public void setLanguageVersionVersion(Integer languageVersionVersion) {
        this.languageVersionVersion = languageVersionVersion;
    }
    
    public Long getLanguageVersionLanguageId() {
        return languageVersionLanguageId;
    }
    
    public void setLanguageVersionLanguageId(Long languageVersionLanguageId) {
        this.languageVersionLanguageId = languageVersionLanguageId;
    }
    
    public String getLanguageVersionLanguageKey() {
        return languageVersionLanguageKey;
    }
    
    public void setLanguageVersionLanguageKey(String languageVersionLanguageKey) {
        this.languageVersionLanguageKey = languageVersionLanguageKey;
    }
    
    public Long getChangeDateInSeconds() {
        return changeDateInSeconds;
    }
    
    public void setChangeDateInSeconds(Long changeDateInSeconds) {
        this.changeDateInSeconds = changeDateInSeconds;
    }
    
    public long getAction() {
        return action;
    }
    
    public void setAction(long action) {
        this.action = action;
    }
    
    public boolean isDocValidTrue() {
        return docValidTrue;
    }
    
    public void setDocValidTrue(boolean docValidTrue) {
        this.docValidTrue = docValidTrue;
    }
    
    public boolean isDocValidFalse() {
        return docValidFalse;
    }
    
    public void setDocValidFalse(boolean docValidFalse) {
        this.docValidFalse = docValidFalse;
    }
    
    public boolean isDocValidBegin() {
        return docValidBegin;
    }
    
    public void setDocValidBegin(boolean docValidBegin) {
        this.docValidBegin = docValidBegin;
    }
    
    public boolean isDocValidEnd() {
        return docValidEnd;
    }
    
    public void setDocValidEnd(boolean docValidEnd) {
        this.docValidEnd = docValidEnd;
    }
    
    public boolean isDocArchivedTrue() {
        return docArchivedTrue;
    }
    
    public void setDocArchivedTrue(boolean docArchivedTrue) {
        this.docArchivedTrue = docArchivedTrue;
    }
    
    public boolean isDocArchivedFalse() {
        return docArchivedFalse;
    }
    
    public void setDocArchivedFalse(boolean docArchivedFalse) {
        this.docArchivedFalse = docArchivedFalse;
    }
    
    public boolean isDocArchivedBegin() {
        return docArchivedBegin;
    }
    
    public void setDocArchivedBegin(boolean docArchivedBegin) {
        this.docArchivedBegin = docArchivedBegin;
    }
    
    public boolean isDocCategory() {
        return docCategory;
    }
    
    public void setDocCategory(boolean docCategory) {
        this.docCategory = docCategory;
    }
    
    public boolean isDocPermission() {
        return docPermission;
    }
    
    public void setDocPermission(boolean docPermission) {
        this.docPermission = docPermission;
    }
    
    public boolean isDocReviewUntil() {
        return docReviewUntil;
    }
    
    public void setDocReviewUntil(boolean docReviewUntil) {
        this.docReviewUntil = docReviewUntil;
    }
    
    public boolean isDocTrashedTrue() {
        return docTrashedTrue;
    }
    
    public void setDocTrashedTrue(boolean docTrashedTrue) {
        this.docTrashedTrue = docTrashedTrue;
    }
    
    public boolean isDocTrashedFalse() {
        return docTrashedFalse;
    }
    
    public void setDocTrashedFalse(boolean docTrashedFalse) {
        this.docTrashedFalse = docTrashedFalse;
    }
    
    public boolean isDocAdditionalProperty() {
        return docAdditionalProperty;
    }
    
    public void setDocAdditionalProperty(boolean docAdditionalProperty) {
        this.docAdditionalProperty = docAdditionalProperty;
    }
    
    public boolean isDocLanguageRemoved() {
        return docLanguageRemoved;
    }
    
    public void setDocLanguageRemoved(boolean docLanguageRemoved) {
        this.docLanguageRemoved = docLanguageRemoved;
    }
    
    public boolean isDocVersionRemoved() {
        return docVersionRemoved;
    }
    
    public void setDocVersionRemoved(boolean docVersionRemoved) {
        this.docVersionRemoved = docVersionRemoved;
    }
    
    public boolean isDlvTitle() {
        return dlvTitle;
    }
    
    public void setDlvTitle(boolean dlvTitle) {
        this.dlvTitle = dlvTitle;
    }
    
    public boolean isDlvAbstract() {
        return dlvAbstract;
    }
    
    public void setDlvAbstract(boolean dlvAbstract) {
        this.dlvAbstract = dlvAbstract;
    }
    
    public boolean isDlvValidBegin() {
        return dlvValidBegin;
    }
    
    public void setDlvValidBegin(boolean dlvValidBegin) {
        this.dlvValidBegin = dlvValidBegin;
    }
    
    public boolean isDlvValidEnd() {
        return dlvValidEnd;
    }
    
    public void setDlvValidEnd(boolean dlvValidEnd) {
        this.dlvValidEnd = dlvValidEnd;
    }
    
    public boolean isDlvMainFile() {
        return dlvMainFile;
    }
    
    public void setDlvMainFile(boolean dlvMainFile) {
        this.dlvMainFile = dlvMainFile;
    }
    
    public boolean isDlvAttachment() {
        return dlvAttachment;
    }
    
    public void setDlvAttachment(boolean dlvAttachment) {
        this.dlvAttachment = dlvAttachment;
    }
    
    public boolean isDlvReviewRequestGranted() {
        return dlvReviewRequestGranted;
    }
    
    public void setDlvReviewRequestGranted(boolean dlvReviewRequestGranted) {
        this.dlvReviewRequestGranted = dlvReviewRequestGranted;
    }
    
    public boolean isDlvReviewRequestDeclined() {
        return dlvReviewRequestDeclined;
    }
    
    public void setDlvReviewRequestDeclined(boolean dlvReviewRequestDeclined) {
        this.dlvReviewRequestDeclined = dlvReviewRequestDeclined;
    }
    
    public boolean isDlvReviewRequested() {
        return dlvReviewRequested;
    }
    
    public void setDlvReviewRequested(boolean dlvReviewRequested) {
        this.dlvReviewRequested = dlvReviewRequested;
    }
    
    public boolean isDlvExtensionValue() {
        return dlvExtensionValue;
    }
    
    public void setDlvExtensionValue(boolean dlvExtensionValue) {
        this.dlvExtensionValue = dlvExtensionValue;
    }
    
    public boolean isDlvPublished() {
        return dlvPublished;
    }
    
    public void setDlvPublished(boolean dlvPublished) {
        this.dlvPublished = dlvPublished;
    }
    
    /**
     * test-main: checks bitmask;
     */
    public static void main(String[] args) {
        long bitmask = 0L;
        if(args != null && args.length > 0) {
            bitmask = Long.parseLong(args[0]);
        }
        System.err.println("Checking bitmask " + bitmask);
        System.err.println();
        
        if((bitmask & DOC_VALID_TRUE) > 0) {
            System.err.println("DOC_VALID_TRUE");
        }
        if((bitmask & DOC_VALID_FALSE) > 0) {
            System.err.println("DOC_VALID_FALSE");
        }
        if((bitmask & DOC_VALID_BEGIN) > 0) {
            System.err.println("DOC_VALID_BEGIN");
        }
        if((bitmask & DOC_VALID_END) > 0) {
            System.err.println("DOC_VALID_END");
        }
        if((bitmask & DOC_ARCHIVED_TRUE) > 0) {
            System.err.println("DOC_ARCHIVED_TRUE");
        }
        if((bitmask & DOC_ARCHIVED_FALSE) > 0) {
            System.err.println("DOC_ARCHIVED_FALSE");
        }
        if((bitmask & DOC_ARCHIVED_BEGIN) > 0) {
            System.err.println("DOC_ARCHIVED_BEGIN");
        }
        if((bitmask & DOC_CATEGORY) > 0) {
            System.err.println("DOC_CATEGORY");
        }
        if((bitmask & DOC_PERMISSION) > 0) {
            System.err.println("DOC_PERMISSION");
        }
        if((bitmask & DOC_REVIEW_UNTIL) > 0) {
            System.err.println("DOC_REVIEW_UNTIL");
        }
        if((bitmask & DOC_TRASHED_TRUE) > 0) {
            System.err.println("DOC_TRASHED_TRUE");
        }
        if((bitmask & DOC_TRASHED_FALSE) > 0) {
            System.err.println("DOC_TRASHED_FALSE");
        }
        if((bitmask & DOC_ADDITIONAL_PROPERTY) > 0) {
            System.err.println("DOC_ADDITIONAL_PROPERTY");
        }
        if((bitmask & DOC_LANGUAGE_REMOVED) > 0) {
            System.err.println("DOC_LANGUAGE_REMOVED");
        }
        if((bitmask & DOC_VERSION_REMOVED) > 0) {
            System.err.println("DOC_VERSION_REMOVED");
        }
        if((bitmask & DLV_TITLE) > 0) {
            System.err.println("DLV_TITLE");
        }
        if((bitmask & DLV_ABSTRACT) > 0) {
            System.err.println("DLV_ABSTRACT");
        }
        if((bitmask & DLV_VALID_BEGIN) > 0) {
            System.err.println("DLV_VALID_BEGIN");
        }
        if((bitmask & DLV_VALID_END) > 0) {
            System.err.println("DLV_VALID_END");
        }
        if((bitmask & DLV_MAIN_FILE) > 0) {
            System.err.println("DLV_MAIN_FILE");
        }
        if((bitmask & DLV_ATTACHMENT) > 0) {
            System.err.println("DLV_ATTACHMENT");
        }
        if((bitmask & DLV_REVIEW_REQUEST_GRANTED) > 0) {
            System.err.println("DLV_REVIEW_REQUEST_GRANTED");
        }
        if((bitmask & DLV_REVIEW_REQUEST_DECLINED) > 0) {
            System.err.println("DLV_REVIEW_REQUEST_DECLINED");
        }
        if((bitmask & DLV_REVIEW_REQUESTED) > 0) {
            System.err.println("DLV_REVIEW_REQUESTED");
        }
        if((bitmask & DLV_EXTENSION_VALUE) > 0) {
            System.err.println("DLV_EXTENSION_VALUE");
        }
        if((bitmask & DLV_PUBLISHED) > 0) {
            System.err.println("DLV_PUBLISHED");
        }
    }

}
