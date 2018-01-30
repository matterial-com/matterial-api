package com.matterial.mtr.api.object;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

import javax.xml.bind.annotation.XmlRootElement;

import com.matterial.mtr.api.object.meta.Identifiable;
import com.matterial.mtr.api.object.meta.Indexable;

/**
 * Container representing documents
 */
@XmlRootElement
public class Document extends ListResultEntry implements Identifiable, Indexable {

    private static final long serialVersionUID = 1L;

    /**
     * usage:
     * PATTERN_FILE_NAME.matcher(name).replaceAll("_");
     * officially not allowed within windows-filenames: \/:"*?<>|
     */
    private static final Pattern PATTERN_FILE_NAME = Pattern.compile("[^\\w\\.\\-&\\[\\]!§$%&()={}~#\\+,@ ]", Pattern.UNICODE_CHARACTER_CLASS);
    private static final Pattern PATTERN_FILE_NAME_SUFFIX = Pattern.compile("\\.[^.]+$", Pattern.UNICODE_CHARACTER_CLASS);

    public static String fileNameCleaned(String fileName) {
        String fileNameCleaned = null;
        if(fileName != null) {
            fileNameCleaned = PATTERN_FILE_NAME.matcher(fileName).replaceAll("_");
        }
        return fileNameCleaned;
    }

    public static String fileNameCleanedWithoutSuffix(String fileName) {
        String fileNameCleaned = null;
        if(fileName != null) {
            fileNameCleaned = Document.fileNameCleaned(fileName);
            fileNameCleaned = Document.PATTERN_FILE_NAME_SUFFIX.matcher(fileNameCleaned).replaceAll("");
        }
        return fileNameCleaned;
    }

    public static final String INDEX_FIELD_ID = "id";
    public static final String INDEX_FIELD_CREATE_TIME_IN_SECONDS = "createTimeInSeconds";
    public static final String INDEX_FIELD_VALID = "valid";
    public static final String INDEX_FIELD_VALID_BEGIN_IN_SECONDS = "validBeginInSeconds";
    public static final String INDEX_FIELD_VALID_END_IN_SECONDS = "validEndInSeconds";
    public static final String INDEX_FIELD_REMOVED = "removed";
    public static final String INDEX_FIELD_REMOVE_TIME_IN_SECONDS = "removeTimeInSeconds";
    public static final String INDEX_FIELD_ARCHIVED = "archived";
    public static final String INDEX_FIELD_ARCHIVED_BEGIN_IN_SECONDS = "archivedBeginInSeconds";
    public static final String INDEX_FIELD_CATEGORY_IDS = "categoryIds";
    public static final String INDEX_FIELD_SUM_RATING = "sumRating";
    public static final String INDEX_FIELD_REVIEW_UNTIL_IN_SECONDS = "reviewUntilInSeconds";
    public static final String INDEX_FIELD_LANGUAGE_VERSION_ID = "languageVersionId";
    public static final String INDEX_FIELD_LANGUAGE_VERSION_ABSTRACT = "languageVersionAbstract";
    public static final String INDEX_FIELD_LANGUAGE_VERSIONS_TITLE = "languageVersionTitle";
    public static final String INDEX_FIELD_LANGUAGE_VERSION_VERSION = "languageVersionVersion";
    public static final String INDEX_FIELD_LANGUAGE_VERSION_CREATE_TIME_IN_SECONDS = "languageVersionCreateTimeInSeconds";
    public static final String INDEX_FIELD_LANGUAGE_VERSION_LAST_CHANGE_IN_SECONDS = "languageVersionLastChangeInSeconds";
    public static final String INDEX_FIELD_LANGUAGE_VERSION_VALID_BEGIN_IN_SECONDS = "languageVersionValidBeginInSeconds";
    public static final String INDEX_FIELD_LANGUAGE_VERSION_VALID_END_IN_SECONDS = "languageVersionValidEndInSeconds";
    public static final String INDEX_FIELD_LANGUAGE_VERSION_LANGUAGE_ID = "languageVersionLanguageId";
    public static final String INDEX_FIELD_LANGUAGE_VERSION_LANGUAGE_KEY = "languageVersionLanguageKey";
    public static final String INDEX_FIELD_LANGUAGE_VERSION_MIME_TYPE = "languageVersionMimeType";
    public static final String INDEX_FIELD_LANGUAGE_VERSION_STATUS = "languageVersionStatus";
    public static final String INDEX_FIELD_LANGUAGE_VERSION_CURRENTLY_IN_PROCESSING = "languageVersionCurrentlyInProcessing";
    public static final String INDEX_FIELD_LANGUAGE_VERSION_READY = "languageVersionReady";
    public static final String INDEX_FIELD_LANGUAGE_VERSION_REVIEWED = "languageVersionReviewed";
    public static final String INDEX_FIELD_LANGUAGE_VERSION_REVIEW_REQUESTED = "languageVersionReviewRequested";
    public static final String INDEX_FIELD_FIRST_READ_TIMES_IN_SECONDS = "firstReadTimesInSeconds";
    public static final String INDEX_FIELD_LAST_WRITE_TIMES_IN_SECONDS = "lastWriteTimesInSeconds";
    public static final String INDEX_FIELD_ROLE_RIGHTS = "roleRights";
    public static final String INDEX_FIELD_FOLLOWERS = "followers";
    public static final String INDEX_FIELD_MARKED_AS_HELPFUL_BY = "markedAsHelpfulBy";
    public static final String INDEX_FIELD_RESPONSIBLES = "responsibles";
    public static final String INDEX_FIELD_ADDITIONAL_PROPERTY_IDS = "additionalPropertyIds";
    public static final String INDEX_FIELD_ADDITIONAL_PROPERTY_TYPES = "additionalPropertyTypes";

    public static final String ORDER_BY_ID = "id";
    public static final String ORDER_BY_VALID = "valid";
    public static final String ORDER_BY_ARCHVED = "archived";
    public static final String ORDER_BY_ARCHIVED_BEGIN_IN_SECONDS = "archivedBeginInSeconds";
    public static final String ORDER_BY_REMOVED = "removed";
    public static final String ORDER_BY_CLICK_COUNT = "clickCount";
    public static final String ORDER_BY_VALID_END_IN_SECONDS = "validEndInSeconds";
    public static final String ORDER_BY_CREATE_TIME_IN_SECONDS = "createTimeInSeconds";
    public static final String ORDER_BY_VALID_BEGIN_OR_CREATE_TIME = "validBeginOrCreateTime";
    public static final String ORDER_BY_FIRST_READ_TIME_AND_VALID_BEGIN = "firstReadTimeAndValidBegin";
    public static final String ORDER_BY_LANGUAGE_VERSION_TITLE = "languageVersionTitle";
    public static final String ORDER_BY_LANGUAGE_VERSION_LANGUAGE_PRIO = "languageVersionLanguagePrio";
    public static final String ORDER_BY_LANGUAGE_VERSION_VERSION = "languageVersionVersion";
    public static final String ORDER_BY_LAST_READ_TIME = "lastReadTime";
    public static final String ORDER_BY_LANGUAGE_VERSION_LAST_CHANGE_IN_SECONDS = "languageVersionLastChangeInSeconds";
    public static final String ORDER_BY_LANGUAGE_VERSION_CREATE_TIME_IN_SECONDS = "languageVersionCreateTimeInSeconds";
    public static final String ORDER_BY_LANGUAGE_VERSION_STATUS = "languageVersionStatus";
    public static final String ORDER_BY_SUM_RATING = "sumRating";
    public static final String ORDER_BY_FIRST_READ_TIME_AND_LAST_CHANGE = "firstReadTimeAndLastChange";
    public static final String ORDER_BY_LAST_WRITE_TIME = "lastWriteTime";

    /**
     * author marked this version as "ready".
     * every "ready" version could not be overwritten, mtr will generate a new version automatically.
     * ready means, this version was saved with one of these "review"-options set:
     * 1) no review, 2) reviewed by myself, 3) review requested
     * this version will be saved without "ready"-bit set as long as no review-option was chosen.
     */
    public static final int STATUS_BIT_READY = 1;
    /**
     * "currently in processing" marks the version, which should be opened in editor and showed to users with edit-right.
     */
    public static final int STATUS_BIT_CURRENTLY_IN_PROCESSING = 2;
    /**
     * this bit marks the version as reviewed;
     */
    public static final int STATUS_BIT_REVIEWED = 4;

    public static final int EDITOR_TYPE_MARKDOWN = 0;
    public static final int EDITOR_TYPE_WYSIWYG = 1;

    /**
     * typeName to be used in index
     */
    public static final String INDEX_TYPE_NAME  = "document";

    // list of keys for specific partial index updates
    private static final List<String> PARTIAL_UPDATE_KEYSET_FOLLOWERS = Arrays.asList("id","languageVersionId","languageVersionLanguageKey","followers");
    private static final List<String> PARTIAL_UPDATE_KEYSET_MARKED_HELPFUL_BY = Arrays.asList("id","languageVersionId","languageVersionLanguageKey","sumRating","markedAsHelpfulBy");
    private static final List<String> PARTIAL_UPDATE_KEYSET_FIRST_READ_TIME = Arrays.asList("id","languageVersionId","languageVersionLanguageKey","firstReadTimesInSeconds");
    private static final List<String> PARTIAL_UPDATE_KEYSET_CATEGORIES = Arrays.asList("id","languageVersionId","languageVersionLanguageKey","categoryIds");

    private boolean partialUpdateFollowers;
    private boolean partialUpdateMarkedHelpfulBy;
    private boolean partialUpdateFirstReadTime;
    private boolean partialUpdateCategories;

    // *** document-poperties;
    private long id;
    private int editorType;
    private Long createTimeInSeconds;
    private int clickCount;
    private boolean valid;
    private Long validBeginInSeconds;
    private Long validEndInSeconds;
    private boolean removed;
    private boolean archived;
    private Long archivedBeginInSeconds;
    private Long reviewUntilInSeconds;
    private Long removeTimeInSeconds;
    private int downloadCount;
    private boolean template;
    // *** document-language-version-properties;
    private long languageVersionId;
    private int languageVersionVersion;
    private String languageVersionTitle;
    private String languageVersionAbstract;
    private String languageVersionVersionComment;
    private int languageVersionStatus;
    private boolean languageVersionCurrentlyInProcessing;
    private boolean languageVersionReady;
    private boolean languageVersionReviewed;
    private boolean languageVersionReviewRequested;
    private boolean languageVersionNotifyOnReview;
    private String languageVersionCasId;
    private String languageVersionCasIdPdf;
    private String languageVersionCasIdThumbnail;
    private String languageVersionCasMd5;
    private Long languageVersionFileSize;
    private Long languageVersionFileSizePdf;
    private Long languageVersionFileSizeThumbnail;
    private Long languageVersionCreateTimeInSeconds;
    private Long languageVersionLastChangeInSeconds;
    private Long languageVersionValidBeginInSeconds;
    private Long languageVersionValidEndInSeconds;
    private String languageVersionMimeType;
    private long languageVersionLanguageId;
    private String languageVersionLanguageKey;
    // *** additional-properties;
    private Long successorId;
    // *** key: accountId, value: firstReadTime;
    private Map<Long, Long> firstReadTimesInSeconds;
    private Long lastReadTimeInSeconds;
    private Map<Long, Long> lastWriteTimesInSeconds;
    private Long lastWriteTimeInSeconds;
    private long roleRelationType;
    private Long sumRating;
    private boolean reviewRight;

    private Set<Long> categoryIds;
    private Set<Long> relatedDocumentIds;

    private List<RoleRight> roleRights;
    private List<Person> responsibles;
    private List<Person> followers;
    private List<Person> markedAsHelpfulBy;
    private List<Attachment> attachments;
    private List<Attachment> languageAttachments;
    private List<Attachment> documentAttachments;
    private List<AdditionalProperty> additionalProperties;
    private List<ExtensionValue> extensionValues;

    public Document() {
        // *** do nothing;
    }

    public Document(long id, int editorType, Long createTimeInSeconds, int clickCount, boolean valid, Long validBeginInSeconds, Long validEndInSeconds,
                    boolean removed, boolean archived, Long archivedBeginInSeconds, Long reviewUntilInSeconds,
                    Long removeTimeInSeconds, int downloadCount, boolean template, long languageVersionId,
                    int languageVersionVersion, String languageVersionTitle, String languageVersionAbstract,
                    String languageVersionVersionComment, int languageVersionStatus,
                    boolean languageVersionReviewRequested, boolean languageVersionNotifyOnReview,
                    String languageVersionCasId, String languageVersionCasIdPdf, String languageVersionCasIdThumbnail, String languageVersionCasMd5,
                    Long languageVersionFileSize, Long languageVersionFileSizePdf, Long languageVersionFileSizeThumbnail,
                    Long languageVersionCreateTimeInSeconds,
                    Long languageVersionLastChangeInSeconds, Long languageVersionValidBeginInSeconds,
                    Long languageVersionValidEndInSeconds, String languageVersionMimeType,
                    long languageVersionLanguageId, String languageVersionLanguageKey, Long successorId,
                    Long firstReadTimeInSeconds, Long lastReadTimeInSeconds, Number lastWriteTimeInSeconds,
                    Number roleRelationType, Number sumRating, Number countOfRelatedReviewRoles, Number accountId) {
        this.setId(id);
        this.editorType = editorType;
        this.createTimeInSeconds = createTimeInSeconds;
        this.clickCount = clickCount;
        this.valid = valid;
        this.validBeginInSeconds = validBeginInSeconds;
        this.validEndInSeconds = validEndInSeconds;
        this.removed = removed;
        this.archived = archived;
        this.archivedBeginInSeconds = archivedBeginInSeconds;
        this.reviewUntilInSeconds = reviewUntilInSeconds;
        this.removeTimeInSeconds = removeTimeInSeconds;
        this.downloadCount = downloadCount;
        this.template = template;
        this.languageVersionId = languageVersionId;
        this.languageVersionVersion = languageVersionVersion;
        this.languageVersionTitle = languageVersionTitle;
        this.languageVersionAbstract = languageVersionAbstract;
        this.languageVersionVersionComment = languageVersionVersionComment;
        this.languageVersionStatus = languageVersionStatus;
        this.languageVersionReviewRequested = languageVersionReviewRequested;
        this.languageVersionNotifyOnReview = languageVersionNotifyOnReview;
        this.languageVersionCasId = languageVersionCasId;
        this.languageVersionCasIdPdf = languageVersionCasIdPdf;
        this.languageVersionCasIdThumbnail = languageVersionCasIdThumbnail;
        this.languageVersionCasMd5 = languageVersionCasMd5;
        this.languageVersionFileSize = languageVersionFileSize;
        this.languageVersionFileSizePdf = languageVersionFileSizePdf;
        this.languageVersionFileSizeThumbnail = languageVersionFileSizeThumbnail;
        this.languageVersionCreateTimeInSeconds = languageVersionCreateTimeInSeconds;
        this.languageVersionLastChangeInSeconds = languageVersionLastChangeInSeconds;
        this.languageVersionValidBeginInSeconds = languageVersionValidBeginInSeconds;
        this.languageVersionValidEndInSeconds = languageVersionValidEndInSeconds;
        this.languageVersionMimeType = languageVersionMimeType;
        this.languageVersionLanguageId = languageVersionLanguageId;
        this.languageVersionLanguageKey = languageVersionLanguageKey;
        this.successorId = successorId;
        if(accountId != null && firstReadTimeInSeconds != null) {
            this.getFirstReadTimesInSeconds().put(accountId.longValue(), firstReadTimeInSeconds);
        }
        this.lastReadTimeInSeconds = lastReadTimeInSeconds;
        this.roleRelationType = roleRelationType.longValue();
        if((languageVersionStatus & STATUS_BIT_CURRENTLY_IN_PROCESSING) > 0) {
            this.setLanguageVersionCurrentlyInProcessing(true);
        }
        if((languageVersionStatus & STATUS_BIT_READY) > 0) {
            this.setLanguageVersionReady(true);
        }
        if((languageVersionStatus & STATUS_BIT_REVIEWED) > 0) {
            this.setLanguageVersionReviewed(true);
        }
        if(lastWriteTimeInSeconds != null && lastWriteTimeInSeconds.longValue() > 0L) {
            this.lastWriteTimeInSeconds = lastWriteTimeInSeconds.longValue();
        }
        if (sumRating != null) {
            this.sumRating = sumRating.longValue();
        }
        if (countOfRelatedReviewRoles != null &&
            countOfRelatedReviewRoles.longValue() > 0) {
            this.reviewRight = true;
        }
    }

    public Document(long id, long languageVersionId) {
        this.setId(id);
        this.languageVersionId = languageVersionId;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    public int getEditorType() {
        return editorType;
    }

    public void setEditorType(int editorType) {
        this.editorType = editorType;
    }

    public Long getCreateTimeInSeconds() {
        return createTimeInSeconds;
    }

    public void setCreateTimeInSeconds(Long createTimeInSeconds) {
        this.createTimeInSeconds = createTimeInSeconds;
    }

    public int getClickCount() {
        return clickCount;
    }

    public void setClickCount(int clickCount) {
        this.clickCount = clickCount;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public Long getValidBeginInSeconds() {
        return validBeginInSeconds;
    }

    public void setValidBeginInSeconds(Long validBeginInSeconds) {
        this.validBeginInSeconds = validBeginInSeconds;
    }

    public Long getValidEndInSeconds() {
        return validEndInSeconds;
    }

    public void setValidEndInSeconds(Long validEndInSeconds) {
        this.validEndInSeconds = validEndInSeconds;
    }

    public boolean isRemoved() {
        return removed;
    }

    public void setRemoved(boolean removed) {
        this.removed = removed;
    }

    public boolean isArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public Long getArchivedBeginInSeconds() {
        return archivedBeginInSeconds;
    }

    public void setArchivedBeginInSeconds(Long archivedBeginInSeconds) {
        this.archivedBeginInSeconds = archivedBeginInSeconds;
    }

    public Long getReviewUntilInSeconds() {
        return reviewUntilInSeconds;
    }

    public void setReviewUntilInSeconds(Long reviewUntilInSeconds) {
        this.reviewUntilInSeconds = reviewUntilInSeconds;
    }

    public Long getRemoveTimeInSeconds() {
        return removeTimeInSeconds;
    }

    public void setRemoveTimeInSeconds(Long removeTimeInSeconds) {
        this.removeTimeInSeconds = removeTimeInSeconds;
    }

    public int getDownloadCount() {
        return downloadCount;
    }

    public void setDownloadCount(int downloadCount) {
        this.downloadCount = downloadCount;
    }

    public boolean isTemplate() {
        return template;
    }

    public void setTemplate(boolean template) {
        this.template = template;
    }

    public long getLanguageVersionId() {
        return languageVersionId;
    }

    public void setLanguageVersionId(long languageVersionId) {
        this.languageVersionId = languageVersionId;
    }

    public int getLanguageVersionVersion() {
        return languageVersionVersion;
    }

    public void setLanguageVersionVersion(int languageVersionVersion) {
        this.languageVersionVersion = languageVersionVersion;
    }

    public String getLanguageVersionTitle() {
        return languageVersionTitle;
    }

    public void setLanguageVersionTitle(String languageVersionTitle) {
        this.languageVersionTitle = languageVersionTitle;
    }

    public String getLanguageVersionAbstract() {
        return languageVersionAbstract;
    }

    public void setLanguageVersionAbstract(String languageVersionAbstract) {
        this.languageVersionAbstract = languageVersionAbstract;
    }

    public String getLanguageVersionVersionComment() {
        return languageVersionVersionComment;
    }

    public void setLanguageVersionVersionComment(String languageVersionVersionComment) {
        this.languageVersionVersionComment = languageVersionVersionComment;
    }

    public int getLanguageVersionStatus() {
        return languageVersionStatus;
    }

    public void setLanguageVersionStatus(int languageVersionStatus) {
        this.languageVersionStatus = languageVersionStatus;
    }

    public boolean isLanguageVersionCurrentlyInProcessing() {
        return languageVersionCurrentlyInProcessing;
    }

    public void setLanguageVersionCurrentlyInProcessing(boolean languageVersionCurrentlyInProcessing) {
        this.languageVersionCurrentlyInProcessing = languageVersionCurrentlyInProcessing;
    }

    public boolean isLanguageVersionReady() {
        return languageVersionReady;
    }

    public void setLanguageVersionReady(boolean languageVersionReady) {
        this.languageVersionReady = languageVersionReady;
    }

    public boolean isLanguageVersionReviewed() {
        return languageVersionReviewed;
    }

    public void setLanguageVersionReviewed(boolean languageVersionReviewed) {
        this.languageVersionReviewed = languageVersionReviewed;
    }

    public boolean isLanguageVersionReviewRequested() {
        return languageVersionReviewRequested;
    }

    public void setLanguageVersionReviewRequested(boolean languageVersionReviewRequested) {
        this.languageVersionReviewRequested = languageVersionReviewRequested;
    }

    public boolean isLanguageVersionNotifyOnReview() {
        return languageVersionNotifyOnReview;
    }

    public void setLanguageVersionNotifyOnReview(boolean languageVersionNotifyOnReview) {
        this.languageVersionNotifyOnReview = languageVersionNotifyOnReview;
    }

    public String getLanguageVersionCasId() {
        return languageVersionCasId;
    }

    public void setLanguageVersionCasId(String languageVersionCasId) {
        this.languageVersionCasId = languageVersionCasId;
    }

    public String getLanguageVersionCasIdPdf() {
        return languageVersionCasIdPdf;
    }

    public void setLanguageVersionCasIdPdf(String languageVersionCasIdPdf) {
        this.languageVersionCasIdPdf = languageVersionCasIdPdf;
    }

    public String getLanguageVersionCasIdThumbnail() {
        return languageVersionCasIdThumbnail;
    }

    public void setLanguageVersionCasIdThumbnail(String languageVersionCasIdThumbnail) {
        this.languageVersionCasIdThumbnail = languageVersionCasIdThumbnail;
    }

    public String getLanguageVersionCasMd5() {
        return languageVersionCasMd5;
    }

    public void setLanguageVersionCasMd5(String languageVersionCasMd5) {
        this.languageVersionCasMd5 = languageVersionCasMd5;
    }

    public Long getLanguageVersionFileSize() {
        return languageVersionFileSize;
    }

    public void setLanguageVersionFileSize(Long languageVersionFileSize) {
        this.languageVersionFileSize = languageVersionFileSize;
    }

    public Long getLanguageVersionFileSizePdf() {
        return languageVersionFileSizePdf;
    }

    public void setLanguageVersionFileSizePdf(Long languageVersionFileSizePdf) {
        this.languageVersionFileSizePdf = languageVersionFileSizePdf;
    }

    public Long getLanguageVersionFileSizeThumbnail() {
        return languageVersionFileSizeThumbnail;
    }

    public void setLanguageVersionFileSizeThumbnail(Long languageVersionFileSizeThumbnail) {
        this.languageVersionFileSizeThumbnail = languageVersionFileSizeThumbnail;
    }

    public Long getLanguageVersionCreateTimeInSeconds() {
        return languageVersionCreateTimeInSeconds;
    }

    public void setLanguageVersionCreateTimeInSeconds(Long languageVersionCreateTimeInSeconds) {
        this.languageVersionCreateTimeInSeconds = languageVersionCreateTimeInSeconds;
    }

    public Long getLanguageVersionLastChangeInSeconds() {
        return languageVersionLastChangeInSeconds;
    }

    public void setLanguageVersionLastChangeInSeconds(Long languageVersionLastChangeInSeconds) {
        this.languageVersionLastChangeInSeconds = languageVersionLastChangeInSeconds;
    }

    public Long getLanguageVersionValidBeginInSeconds() {
        return languageVersionValidBeginInSeconds;
    }

    public void setLanguageVersionValidBeginInSeconds(Long languageVersionValidBeginInSeconds) {
        this.languageVersionValidBeginInSeconds = languageVersionValidBeginInSeconds;
    }

    public Long getLanguageVersionValidEndInSeconds() {
        return languageVersionValidEndInSeconds;
    }

    public void setLanguageVersionValidEndInSeconds(Long languageVersionValidEndInSeconds) {
        this.languageVersionValidEndInSeconds = languageVersionValidEndInSeconds;
    }

    public String getLanguageVersionMimeType() {
        return languageVersionMimeType;
    }

    public void setLanguageVersionMimeType(String languageVersionMimeType) {
        this.languageVersionMimeType = languageVersionMimeType;
    }

    public long getLanguageVersionLanguageId() {
        return languageVersionLanguageId;
    }

    public void setLanguageVersionLanguageId(long languageVersionLanguageId) {
        this.languageVersionLanguageId = languageVersionLanguageId;
    }

    public String getLanguageVersionLanguageKey() {
        return languageVersionLanguageKey;
    }

    public void setLanguageVersionLanguageKey(String languageVersionLanguageKey) {
        this.languageVersionLanguageKey = languageVersionLanguageKey;
    }

    public Long getSuccessorId() {
        return successorId;
    }

    public void setSuccessorId(Long successorId) {
        this.successorId = successorId;
    }

    public Map<Long, Long> getFirstReadTimesInSeconds() {
        if(this.firstReadTimesInSeconds == null) {
            this.firstReadTimesInSeconds = new HashMap<>();
        }
        return this.firstReadTimesInSeconds;
    }

    public void setFirstReadTimesInSeconds(Map<Long, Long> firstReadTimesInSeconds) {
        this.firstReadTimesInSeconds = firstReadTimesInSeconds;
    }

    public Map<Long, Long> getLastWriteTimesInSeconds() {
        if(this.lastWriteTimesInSeconds == null) {
            this.lastWriteTimesInSeconds = new HashMap<>();
        }
        return this.lastWriteTimesInSeconds;
    }

    public void setLastWriteTimesInSeconds(Map<Long, Long> lastWriteTimesInSeconds) {
        this.lastWriteTimesInSeconds = lastWriteTimesInSeconds;
    }

    public Long getLastReadTimeInSeconds() {
        return lastReadTimeInSeconds;
    }

    public void setLastReadTimeInSeconds(Long lastReadTimeInSeconds) {
        this.lastReadTimeInSeconds = lastReadTimeInSeconds;
    }

    public Long getLastWriteTimeInSeconds() {
        return lastWriteTimeInSeconds;
    }

    public void setLastWriteTimeInSeconds(Long lastWriteTimeInSeconds) {
        this.lastWriteTimeInSeconds = lastWriteTimeInSeconds;
    }

    public long getRoleRelationType() {
        return roleRelationType;
    }

    public void setRoleRelationType(long roleRelationType) {
        this.roleRelationType = roleRelationType;
    }

    public Long getSumRating() {
        return sumRating;
    }

    public void setSumRating(Long sumRating) {
        this.sumRating = sumRating;
    }

    public boolean isReviewRight() {
        return reviewRight;
    }

    public void setReviewRight(boolean reviewRight) {
        this.reviewRight = reviewRight;
    }

    public Set<Long> getCategoryIds() {
        if(this.categoryIds == null) {
            this.categoryIds = new HashSet<>();
        }
        return this.categoryIds;
    }

    public void setCategoryIds(Set<Long> categoryIds) {
        this.categoryIds = categoryIds;
    }

    public Set<Long> getRelatedDocumentIds() {
        if(this.relatedDocumentIds == null) {
            this.relatedDocumentIds = new HashSet<>();
        }
        return relatedDocumentIds;
    }

    public void setRelatedDocumentIds(Set<Long> relatedDocumentIds) {
        this.relatedDocumentIds = relatedDocumentIds;
    }

    public List<RoleRight> getRoleRights() {
        if(this.roleRights == null) {
            this.roleRights = new ArrayList<>();
        }
        return roleRights;
    }

    public void setRoleRights(List<RoleRight> roleRights) {
        this.roleRights = roleRights;
    }

    public List<Person> getResponsibles() {
        if(this.responsibles == null) {
            this.responsibles = new ArrayList<>();
        }
        return responsibles;
    }

    public void setResponsibles(List<Person> responsibles) {
        this.responsibles = responsibles;
    }

    public List<Person> getFollowers() {
        if(this.followers == null) {
            this.followers = new ArrayList<>();
        }
        return followers;
    }

    public void setFollowers(List<Person> followers) {
        this.followers = followers;
    }

    public List<Person> getMarkedAsHelpfulBy() {
        if(this.markedAsHelpfulBy == null) {
            this.markedAsHelpfulBy = new ArrayList<>();
        }
        return markedAsHelpfulBy;
    }

    public void setMarkedAsHelpfulBy(List<Person> markedAsHelpfulBy) {
        this.markedAsHelpfulBy = markedAsHelpfulBy;
    }

    public List<Attachment> getAttachments() {
        if(this.attachments == null) {
            this.attachments = new ArrayList<>();
        }
        return attachments;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    public List<Attachment> getLanguageAttachments() {
        if(this.languageAttachments == null) {
            this.languageAttachments = new ArrayList<>();
        }
        return languageAttachments;
    }

    public void setLanguageAttachments(List<Attachment> languageAttachments) {
        this.languageAttachments = languageAttachments;
    }

    public List<Attachment> getDocumentAttachments() {
        if(this.documentAttachments == null) {
            this.documentAttachments = new ArrayList<>();
        }
        return documentAttachments;
    }

    public void setDocumentAttachments(List<Attachment> documentAttachments) {
        this.documentAttachments = documentAttachments;
    }

    public List<AdditionalProperty> getAdditionalProperties() {
        if(this.additionalProperties == null) {
            this.additionalProperties = new ArrayList<>();
        }
        return additionalProperties;
    }

    public void setAdditionalProperties(List<AdditionalProperty> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    public List<ExtensionValue> getExtensionValues() {
        if(this.extensionValues == null) {
            this.extensionValues = new ArrayList<>();
        }
        return extensionValues;
    }

    public void setExtensionValues(List<ExtensionValue> extensionValues) {
        this.extensionValues = extensionValues;
    }

    public boolean isPartialUpdateFollowers() {
        return partialUpdateFollowers;
    }

    public void setPartialUpdateFollowers(boolean partialUpdateFollowers) {
        this.partialUpdateFollowers = partialUpdateFollowers;
    }

    public boolean isPartialUpdateMarkedHelpfulBy() {
        return partialUpdateMarkedHelpfulBy;
    }

    public void setPartialUpdateMarkedHelpfulBy(boolean partialUpdateMarkedHelpfulBy) {
        this.partialUpdateMarkedHelpfulBy = partialUpdateMarkedHelpfulBy;
    }

    public boolean isPartialUpdateFirstReadTime() {
        return partialUpdateFirstReadTime;
    }

    public void setPartialUpdateFirstReadTime(boolean partialUpdateFirstReadTime) {
        this.partialUpdateFirstReadTime = partialUpdateFirstReadTime;
    }

    public boolean isPartialUpdateCategories() {
        return partialUpdateCategories;
    }

    public void setPartialUpdateCategories(boolean partialUpdateCategories) {
        this.partialUpdateCategories = partialUpdateCategories;
    }

    public boolean isPartialUpdate() {
        return this.isPartialUpdateFollowers() ||
               this.isPartialUpdateMarkedHelpfulBy() ||
               this.isPartialUpdateFirstReadTime() ||
               this.isPartialUpdateCategories();
    }

    public void setPartialUpdate(boolean partialUpdate) {
        // *** do nothing;
    }

    @Override
    public String indexId() {
        return this.getLanguageVersionId()+"";
    }

    @Override
    public Map<String, Object> indexMap() {
        // *** creating index-map;
        Map<String, Object> indexMap = new HashMap<>();
        // *** simple fields;
        indexMap.put(INDEX_FIELD_ID, this.getId());
        indexMap.put(INDEX_FIELD_CREATE_TIME_IN_SECONDS, this.getCreateTimeInSeconds());
        indexMap.put(INDEX_FIELD_VALID, this.isValid());
        indexMap.put(INDEX_FIELD_VALID_BEGIN_IN_SECONDS, this.getValidBeginInSeconds());
        indexMap.put(INDEX_FIELD_VALID_END_IN_SECONDS, this.getValidEndInSeconds());
        indexMap.put(INDEX_FIELD_REMOVED, this.isRemoved());
        indexMap.put(INDEX_FIELD_REMOVE_TIME_IN_SECONDS, this.getRemoveTimeInSeconds());
        indexMap.put(INDEX_FIELD_ARCHIVED, this.isArchived());
        indexMap.put(INDEX_FIELD_ARCHIVED_BEGIN_IN_SECONDS, this.getArchivedBeginInSeconds());
        indexMap.put(INDEX_FIELD_CATEGORY_IDS, this.getCategoryIds());
        indexMap.put(INDEX_FIELD_SUM_RATING, this.getSumRating());
        indexMap.put(INDEX_FIELD_REVIEW_UNTIL_IN_SECONDS, this.getReviewUntilInSeconds());
        indexMap.put(INDEX_FIELD_LANGUAGE_VERSION_ID, this.getLanguageVersionId());
        indexMap.put(INDEX_FIELD_LANGUAGE_VERSION_ABSTRACT, this.getLanguageVersionAbstract());
        indexMap.put(INDEX_FIELD_LANGUAGE_VERSIONS_TITLE, this.getLanguageVersionTitle());
        indexMap.put(INDEX_FIELD_LANGUAGE_VERSION_VERSION, this.getLanguageVersionVersion());
        indexMap.put(INDEX_FIELD_LANGUAGE_VERSION_CREATE_TIME_IN_SECONDS, this.getLanguageVersionCreateTimeInSeconds());
        indexMap.put(INDEX_FIELD_LANGUAGE_VERSION_LAST_CHANGE_IN_SECONDS, this.getLanguageVersionLastChangeInSeconds());
        indexMap.put(INDEX_FIELD_LANGUAGE_VERSION_VALID_BEGIN_IN_SECONDS, this.getLanguageVersionValidBeginInSeconds());
        indexMap.put(INDEX_FIELD_LANGUAGE_VERSION_VALID_END_IN_SECONDS, this.getLanguageVersionValidEndInSeconds());
        indexMap.put(INDEX_FIELD_LANGUAGE_VERSION_LANGUAGE_ID, this.getLanguageVersionLanguageId());
        indexMap.put(INDEX_FIELD_LANGUAGE_VERSION_LANGUAGE_KEY, this.getLanguageVersionLanguageKey());
        indexMap.put(INDEX_FIELD_LANGUAGE_VERSION_MIME_TYPE, this.getLanguageVersionMimeType());
        indexMap.put(INDEX_FIELD_LANGUAGE_VERSION_STATUS, this.getLanguageVersionStatus());
        indexMap.put(INDEX_FIELD_LANGUAGE_VERSION_CURRENTLY_IN_PROCESSING, this.isLanguageVersionCurrentlyInProcessing());
        indexMap.put(INDEX_FIELD_LANGUAGE_VERSION_READY, this.isLanguageVersionReady());
        indexMap.put(INDEX_FIELD_LANGUAGE_VERSION_REVIEWED, this.isLanguageVersionReviewed());
        indexMap.put(INDEX_FIELD_LANGUAGE_VERSION_REVIEW_REQUESTED, this.isLanguageVersionReviewRequested());
        // *** currently unused;
        //indexMap.put("clickCount", this.getClickCount());
        //indexMap.put("downloadCount", this.getDownloadCount());
        //indexMap.put("successorId", this.getSuccessorId());
        //indexMap.put("languageVersionVersionComment", this.getLanguageVersionVersionComment());
        // *** not neccessary;
        //indexMap.put("languageVersionCasId", this.getLanguageVersionCasId());
        //indexMap.put("languageVersionCasIdPdf", this.getLanguageVersionCasIdPdf());
        //indexMap.put("languageVersionCasIdThumbnail", this.getLanguageVersionCasIdThumbnail());
        //indexMap.put("languageVersionCasMd5", this.getLanguageVersionCasMd5());

        // *** handling map of firstReadTimes;
        // *** maps can only be indexed if key is a string;
        Map<String, Long> firstReadTimesInSecondsMap = new HashMap<>();
        for (Long accountId : this.getFirstReadTimesInSeconds().keySet()) {
            if(accountId != null) {
                // *** add accountId as string, keep "firstReadTime" as Long;
                firstReadTimesInSecondsMap.put(accountId.toString(), this.getFirstReadTimesInSeconds().get(accountId));
            }
        }
        indexMap.put(INDEX_FIELD_FIRST_READ_TIMES_IN_SECONDS, firstReadTimesInSecondsMap);

        // *** handling map of lastWriteTimes AKA authors;
        // *** maps can only be indexed if key is a string;
        Map<String, Long> lastWriteTimesInSecondsMap = new HashMap<>();
        for (Long accountId : this.getLastWriteTimesInSeconds().keySet()) {
            if(accountId != null) {
                // *** add accountId as string, keep "lastWriteReadTime" as Long;
                lastWriteTimesInSecondsMap.put(accountId.toString(), this.getLastWriteTimesInSeconds().get(accountId));
            }
        }
        indexMap.put(INDEX_FIELD_LAST_WRITE_TIMES_IN_SECONDS, lastWriteTimesInSecondsMap);

        // *** roleRights;
        List<Map<String, Object>> roleRightsListMap = new ArrayList<>();
        if(this.getRoleRights() != null){
            this.getRoleRights().stream().forEach((rdr) -> {
                roleRightsListMap.add(rdr.indexMap());
            });
        }
        indexMap.put(INDEX_FIELD_ROLE_RIGHTS, roleRightsListMap);

        // *** follower;
        List<Map<String, Object>> followersMap = new ArrayList<>();
        if(this.getFollowers() != null){
            this.getFollowers().stream().forEach((followerPerson) -> {
                followersMap.add(followerPerson.indexMapLight());
            });
        }
        indexMap.put(INDEX_FIELD_FOLLOWERS, followersMap);

        // *** helpful;
        List<Map<String, Object>> markedAsHelpfulByMap = new ArrayList<>();
        if(this.getMarkedAsHelpfulBy() != null){
            this.getMarkedAsHelpfulBy().stream().forEach((markedAsHelpfulByPerson) -> {
                markedAsHelpfulByMap.add(markedAsHelpfulByPerson.indexMapLight());
            });
        }
        indexMap.put(INDEX_FIELD_MARKED_AS_HELPFUL_BY, markedAsHelpfulByMap);

        // *** responsible;
        List<Map<String, Object>> responsiblesMap = new ArrayList<>();
        if(this.getResponsibles() != null){
            this.getResponsibles().stream().forEach((respPerson) -> {
                responsiblesMap.add(respPerson.indexMapLight());
            });
        }
        indexMap.put(INDEX_FIELD_RESPONSIBLES, responsiblesMap);

        // *** additional-property;
        List<Long> additionalPropertyIds = new ArrayList<>();
        List<Integer> additionalPropertyTypes = new ArrayList<>();
        if(this.getAdditionalProperties() != null){
            this.getAdditionalProperties().stream().forEach((ap) -> {
                additionalPropertyIds.add(ap.getId());
                if(ap.getPropertyType() != null && ap.getPropertyType() > 0) {
                    additionalPropertyTypes.add(ap.getPropertyType());
                }
            });
        }
        indexMap.put(INDEX_FIELD_ADDITIONAL_PROPERTY_IDS, additionalPropertyIds);
        indexMap.put(INDEX_FIELD_ADDITIONAL_PROPERTY_TYPES, additionalPropertyTypes);

        // *** extension-values;
        this.getExtensionValues().stream().forEach((ev) -> {
            indexMap.put(ev.getKey(), ev.getValue());
        });

        final List<String> partialUpdateKeys;
        if(this.isPartialUpdateFollowers()) {
            partialUpdateKeys = PARTIAL_UPDATE_KEYSET_FOLLOWERS;
        }
        else if(this.isPartialUpdateMarkedHelpfulBy()) {
            partialUpdateKeys = PARTIAL_UPDATE_KEYSET_MARKED_HELPFUL_BY;
        }
        else if(this.isPartialUpdateFirstReadTime()) {
            partialUpdateKeys = PARTIAL_UPDATE_KEYSET_FIRST_READ_TIME;
        }
        else if(this.isPartialUpdateCategories()) {
            partialUpdateKeys = PARTIAL_UPDATE_KEYSET_CATEGORIES;
        }
        else {
            partialUpdateKeys = null;
        }

        if(partialUpdateKeys != null && partialUpdateKeys.size() > 0){
            // clean indexMap if there are partialUpdate keys defined
            indexMap.entrySet().removeIf(e -> (partialUpdateKeys.indexOf(e.getKey()) < 0));
        }

        return indexMap;
    }

    @Override
    public Language indexLanguage() {
        // ** fallback en;
        Language lang = Language.en;
        try {
            lang = Language.valueOf(this.getLanguageVersionLanguageKey());
        }
        catch(Exception e) {
            // *** do nothing;
            lang = Language.en;
        }
        return lang;
    }

    @Override
    public String indexTypeName() {
        return INDEX_TYPE_NAME;
    }

    @Override
    public String indexAutocompleteInput() {
        return  this.getLanguageVersionTitle()
                +" "+
                (this.getLanguageVersionAbstract() != null ? this.getLanguageVersionAbstract() : "");
    }

}
