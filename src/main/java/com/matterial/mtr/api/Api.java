package com.matterial.mtr.api;

/**
 * <strong>Api</strong> collectin of all resource-paths and -params.
 */
public interface Api {

    // *** MODULE;
    public static final String CATEGORY = "category";
    public static final String TYPE = "type";
    public static final String CLIENT = "client";
    public static final String PREFERENCE = "preference";
    public static final String COMMENT = "comment";
    public static final String CONVERSION = "conversion";
    public static final String DOCUMENT = "document";
    public static final String ADDITIONAL_PROPERTY = "additionalproperty";
    public static final String ATTACHMENT = "attachment";
    public static final String CHANGE_LOG = "changelog";
    public static final String EXTENSION_VALUE = "extensionvalue";
    public static final String LOCK = "lock";
    public static final String RATING = "rating";
    public static final String SAVED_SEARCH = "savedsearch";
    public static final String SKIN = "skin";
    public static final String TEMP_FILE = "tempfile";
    public static final String APP_INITIALIZER = "appinitializer";
    public static final String INSTANCE_CONTROL = "instancecontrol";
    public static final String LANGUAGE = "language";
    public static final String LICENCE = "licence";
    public static final String LOGON = "logon";
    public static final String AUTO = "auto";
    public static final String LTI = "lti";
    public static final String NTLM = "ntlm";
    public static final String OAUTH2 = "oauth2";
    public static final String COBOT = "cobot";
    public static final String GOOGLE = "google";
    public static final String MICROSOFT = "microsoft";
    public static final String PASSWORD_RESET = "passwordreset";
    public static final String SAML = "saml";
    public static final String MIGRATE = "migrate";
    public static final String NOTIFICATION = "notification";
    public static final String PERSON = "person";
    public static final String ACCOUNT_SETTING = "accountsetting";
    public static final String CONTACT_IMAGE = "contactimage";
    public static final String ROLE = "role";
    public static final String TASK = "task";
    public static final String STATUS = "status";
    public static final String TRACKING = "tracking";
    public static final String TEST = "test";
    public static final String VERSION = "version";

    // *** PATH;
    // *** general;
    public static final String CSV = "csv";
    public static final String VCARD = "vcard";
    public static final String ACTIVATE = "activate";
    public static final String DEACTIVATE = "deactivate";
    public static final String MAP = "map";
    public static final String AVAILABLE = "available";
    public static final String FOLLOW = "follow";
    public static final String UNFOLLOW = "unfollow";
    public static final String QUEUE = "queue";
    public static final String EXECUTE = "execute";
    public static final String CHECK = "check";
    public static final String CALLBACK = "callback";
    public static final String CONVERT = "convert";
    public static final String ASSIGN = "assign";
    // *** category;
    public static final String BY_TYPE = "bytype";
    public static final String UNASSIGN = "unassign";
    public static final String QUICK = "quick";
    public static final String TAG = "tag";
    // *** conversion;
    public static final String MARKDOWN_2_HTML = "markdown2html";
    public static final String MIME_TYPE = "mimetype";
    public static final String THUMBNAIL = "thumbnail";
    // *** document;
    public static final String FILE = "file";
    public static final String TRASH = "trash";
    public static final String UNTRASH = "untrash";
    public static final String ARCHIVE = "archive";
    public static final String UNARCHIVE = "unarchive";
    public static final String REVIEW = "review";
    public static final String REVIEW_DECLINE = "reviewdecline";
    public static final String REMOVAL = "removal";
    public static final String PDF_CONVERSION = "pdfconversion";
    public static final String SNAP = "snap";
    // *** skin;
    public static final String CUSTOMER_CSS = "customer.css";
    // *** app-initializer;
    public static final String RESET_DEMO_INSTANCE = "resetdemoinstance";
    // *** instance-control;
    public static final String BY_ID = "byid";
    public static final String INSTANCE = "instance";
    public static final String CREDENTIAL = "credential";
    public static final String INVITEE = "invitee";
    public static final String WITH_DATA_SOURCES = "withdatasources";
    public static final String FAV_DATA_SOURCE = "favdatasource";
    public static final String DISPLAY_NAME = "displayname";
    public static final String SIGNUP = "signup";
    public static final String DAYS = "days";
    public static final String UNLIMITED = "unlimited";
    public static final String LIST = "list";
    // *** preference;
    public static final String CACHE = "cache";
    public static final String REINIT = "reinit";
    public static final String BY_PREFERENCE_KEY = "bypreferencekey";
    public static final String BY_PERMISSION_FREE_KEY = "bypermissionfreekey";
    // *** licence;
    public static final String USAGE = "usage";
    public static final String GENERATE = "generate";
    // *** logon;
    public static final String LOGIN_DATA = "logindata";
    public static final String LOGOUT = "logout";
    public static final String IMPERSONATE = "impersonate";
    public static final String PRE_LOGIN = "prelogin";
    public static final String PRE_CHANGE_INSTANCE = "prechangeinstance";
    public static final String LOGIN = "login";
    // *** logon/saml;
    public static final String META_DATA = "metadata";
    public static final String LOGOUT_REQUEST = "logoutrequest";
    // *** notification;
    public static final String SESSION_COUNT = "sessioncount";
    // *** person;
    public static final String BY_ACCOUNT = "byaccount";
    public static final String BY_CONTACT = "bycontact";
    public static final String PERSONAL_DATA = "personaldata";
    public static final String INSTANCE_OWNER = "instanceowner";
    public static final String DEMO = "demo";
    // *** person/account-setting;
    public static final String ALL = "all";
    // *** search;
    public static final String SEARCH = "search";
    public static final String REINDEX_ALL = "reindexall";
    public static final String INDEX = "index";
    public static final String AUTOCOMPLETE = "autocomplete";

    // *** PARAM;
    // *** general;
    public static final String PARAM_COUNT = "count";
    public static final String PARAM_OFFSET = "offset";
    public static final String PARAM_LIMIT = "limit";
    public static final String PARAM_ORDER_BY = "orderBy";
    public static final String PARAM_ORDER_DIR = "orderDir";
    public static final String PARAM_LANGUAGE_KEY = "languageKey";
    public static final String PARAM_ACTIVE = "active";
    public static final String PARAM_REGENERATE = "regenerate";
    public static final String PARAM_ENTITY_TYPE_ID = "entityTypeId";
    // *** category;
    public static final String PARAM_CATEGORY_ID = "categoryId";
    public static final String PARAM_PERSONAL = "personal";
    public static final String PARAM_QUICK = "quick";
    public static final String PARAM_LOAD_USAGE = "loadUsage";
    // *** category-type;
    public static final String PARAM_CATEGORY_TYPE_ID = "categoryTypeId";
    public static final String PARAM_TAG = "tag";
    // *** client;
    public static final String PARAM_CLIENT_ID = "clientId";
    public static final String PARAM_LOAD_CLIENT_PREFERENCES = "loadClientPreferences";
    // *** comment;
    public static final String PARAM_COMMENT_ID = "commentId";
    public static final String PARAM_MENTIONED_ACCOUNT_ID = "mentionedAccountId";
    // *** document;
    public static final String PARAM_DOCUMENT_ID = "documentId";
    public static final String PARAM_DOCUMENT_LANGUAGE_VERSION_ID = "documentLanguageVersionId";
    public static final String PARAM_DOCUMENT_LANGUAGE_VERSION_CAS_ID = "documentLanguageVersionCasId";
    public static final String PARAM_ALL_LANGUAGES = "allLanguages";
    public static final String PARAM_ALL_VERSIONS = "allVersions";
    public static final String PARAM_LANGUAGE_PREFER = "languagePrefer";
    public static final String PARAM_LANGUAGE_EXCLUDE = "languageExclude";
    public static final String PARAM_CATEGORY_IDS_AND = "categoryIdsAnd";
    public static final String PARAM_CATEGORY_IDS_OR = "categoryIdsOr";
    public static final String PARAM_LANGUAGE_AGGREGATIONS = "languageAggregations";
    public static final String PARAM_LAST_CHANGE_AGGREGATIONS = "lastChangeAggregations";
    public static final String PARAM_READ = "read";
    public static final String PARAM_UPDATE_READ_TIME = "updateReadTime";
    public static final String PARAM_RELATED_DOCUMENT_ID = "relatedDocumentId";
    public static final String PARAM_TEMPLATE = "template";
    public static final String PARAM_SHOW_ARCHIVED = "showArchived";
    public static final String PARAM_SHOW_REMOVED = "showRemoved";
    public static final String PARAM_SHOW_ARCHIVED_ONLY = "showArchivedOnly";
    public static final String PARAM_SHOW_REMOVED_ONLY = "showRemovedOnly";
    public static final String PARAM_DOCUMENT_VALID = "documentValid";
    public static final String PARAM_FOLLOWER_ACCOUNT_ID = "followerAccountId";
    public static final String PARAM_FOLLOWING = "following";
    public static final String PARAM_CATEGORY_FOLLOWER_ACCOUNT_ID = "categoryFollowerAccountId";
    public static final String PARAM_CATEGORY_FOLLOWING = "categoryFollowing";
    public static final String PARAM_MARKED_HELPFUL_BY_CONTACT_ID = "markedHelpfulByContactId";
    public static final String PARAM_LAST_CHANGED_SINCE_DAYS = "lastChangedSinceDays";
    public static final String PARAM_LAST_CHANGED_SINCE = "lastChangedSince";
    public static final String PARAM_RESPONSIBLE_CONTACT_ID = "responsibleContactId";
    public static final String PARAM_AUTHORSHIP_ACCOUNT_ID = "authorshipAccountId";
    public static final String PARAM_AUTHORSHIP = "authorship";
    public static final String PARAM_DOCUMENT_EXPIRES_IN_DAYS = "documentExpiresInDays";
    public static final String PARAM_DOCUMENT_EXPIRES_ON = "documentExpiresOn";
    public static final String PARAM_DOCUMENT_EXPIRES = "documentExpires";
    public static final String PARAM_DOCUMENT_HAS_ARCHIVED_BEGIN = "documentHasArchivedBegin";
    public static final String PARAM_SHOW_LANGUAGE_VERSION_REVIEWED_ONLY = "showLanguageVersionReviewedOnly";
    public static final String PARAM_HIDE_LANGUAGE_VERSION_REVIEWED = "hideLanguageVersionReviewed";
    public static final String PARAM_SHOW_LANGUAGE_VERSION_READY_ONLY = "showLanguageVersionReadyOnly";
    public static final String PARAM_HIDE_LANGUAGE_VERSION_READY = "hideLanguageVersionReady";
    public static final String PARAM_SHOW_LANGUAGE_VERSION_REVIEW_REQUESTED_ONLY = "showLanguageVersionReviewRequestedOnly";
    public static final String PARAM_HIDE_LANGUAGE_VERSION_REVIEW_REQUESTED = "hideLanguageVersionReviewRequested";
    public static final String PARAM_SHOW_SNAP_ONLY = "showSnapOnly";
    public static final String PARAM_HIDE_SNAP = "hideSnap";
    public static final String PARAM_MIME_TYPE_ID = "mimeTypeId";
    public static final String PARAM_MIME_TYPE = "mimeType";
    public static final String PARAM_MENTIONED_ACCOUNT_ID_IN_COMMENT = "mentionedAccountIdInComment";
    public static final String PARAM_MENTIONED_ACCOUNT_ID_IN_COMMENT_UNREAD = "mentionedAccountIdInCommentUnread";
    public static final String PARAM_DISABLE_RIGHTS_CHECK = "disableRightsCheck";
    public static final String PARAM_LOAD_RESPONSIBLES = "loadResponsibles";
    public static final String PARAM_LOAD_AUTHORS = "loadAuthors";
    public static final String PARAM_LOAD_LAST_AUTHOR_ONLY = "loadLastAuthorOnly";
    public static final String PARAM_LOAD_FOLLOWERS = "loadFollowers";
    public static final String PARAM_LOAD_AM_I_FOLLOWING = "loadAmIFollowing";
    public static final String PARAM_LOAD_MARKED_AS_HELPFUL_BY = "loadMarkedAsHelpfulBy";
    /** load attachments related to current version */
    public static final String PARAM_LOAD_ATTACHMENTS = "loadAttachments";
    /** load attachments related to current language */
    public static final String PARAM_LOAD_LANGUAGE_ATTACHMENTS = "loadLanguageAttachments";
    /** load attachments related to whole document */
    public static final String PARAM_LOAD_DOCUMENT_ATTACHMENTS = "loadDocumentAttachments";
    public static final String PARAM_LOAD_RELATED_DOCUMENT_IDS = "loadRelatedDocumentIds";
    public static final String PARAM_LOAD_ADDITIONAL_PROPERTIES = "loadAdditionalProperties";
    public static final String PARAM_LOAD_EXTENSION_VALUES = "loadExtensionValues";
    public static final String PARAM_LOAD_FIRST_READ_TIMES = "loadFirstReadTimes";
    public static final String PARAM_LOAD_SNAP_FLAG = "loadSnapFlag";
    public static final String PARAM_LOAD_ROLE_RIGHTS = "loadRoleRights";
    public static final String PARAM_IGNORE_REMOVE_TIME = "ignoreRemoveTime";
    public static final String PARAM_PUBLISH_REQUEST = "publishRequest";
    public static final String PARAM_VALID_BEGIN_IN_SECONDS_REQUEST = "validBeginInSecondsRequest";
    public static final String PARAM_ARCHIVED_BEGIN_IN_SECONDS_REQUEST = "archivedBeginInSecondsRequest";
    public static final String PARAM_MARKDOWN_TO_HTML = "markdownToHtml";
    public static final String PARAM_LOAD_PDF = "loadPdf";
    public static final String PARAM_LOAD_THUMBNAIL = "loadThumbnail";
    public static final String PARAM_LOAD_CATEGORY_IDS = "loadCategoryIds";
    // *** additional-property;
    public static final String PARAM_ADDITIONAL_PROPERTY_ID = "additionalPropertyId";
    public static final String PARAM_ADDITIONAL_PROPERTY_TYPE = "additionalPropertyType";
    public static final String PARAM_PROPERTY_TYPE = "propertyType";
    // *** attachment;
    public static final String PARAM_ATTACHMENT_ID = "attachmentId";
    // *** saved-search;
    public static final String PARAM_SAVED_SEARCH_ID = "savedSearchId";
    public static final String PARAM_ON_DASHBOARD = "onDashboard";
    public static final String PARAM_GLOBAL = "global";
    // *** temp-file;
    public static final String PARAM_CONTEXT_TOKEN = "contextToken";
    public static final String PARAM_FILE_TOKEN = "fileToken";
    public static final String PARAM_FILE_TYPE = "fileType";
    // *** instance-control;
    public static final String PARAM_INSTANCE_ID = "instanceId";
    public static final String PARAM_INSTANCE = "instance";
    public static final String PARAM_CREDENTIAL_ID = "credentialId";
    public static final String PARAM_DATA_SOURCE_ID = "dataSourceId";
    public static final String PARAM_DATA_SOURCE_NAME = "dataSourceName";
    public static final String PARAM_DATA_SOURCE_REFERENCE = "dataSourceReference";
    public static final String PARAM_DAYS = "days";
    public static final String PARAM_DISPLAY_NAME = "displayName";
    // *** preference;
    public static final String PARAM_PREFERENCE_ID = "preferenceId";
    public static final String PARAM_PREFERENCE_KEY = "preferenceKey";
    // *** language;
    public static final String PARAM_LANGUAGE_ID = "languageId";
    // *** logon;
    public static final String PARAM_REMEMBER_ME = "rememberMe";
    public static final String PARAM_OVERWRITE_SERVER_URL = "overwriteServerUrl";
    // *** logon/auto;
    public static final String PARAM_LOGIN_TOKEN_SERIES_ID_BASE64 = "loginTokenSeriesIdBase64";
    public static final String PARAM_LOGIN_TOKEN_BASE64 = "loginTokenBase64";
    // *** person;
    public static final String PARAM_ACCOUNT_ID = "accountId";
    public static final String PARAM_CONTACT_ID = "contactId";
    public static final String PARAM_INCLUDE_SYSTEM_USER = "includeSystemUser";
    public static final String PARAM_RESPONSIBLE_FOR_DOCUMENT_ID = "responsibleForDocumentId";
    public static final String PARAM_AUTHORSHIP_FOR_DOCUMENT_ID = "authorshipForDocumentId";
    public static final String PARAM_AUTHORSHIP_FOR_LANGUAGE_VERSION_ID = "authorshipForLanguageVersionId";
    public static final String PARAM_AUTHORSHIP_FOR_LANGUAGE_ID = "authorshipForLanguageId";
    public static final String PARAM_ACCOUNT_LOGIN = "accountLogin";
    public static final String PARAM_INSTANCE_OWNER = "instanceOwner";
    public static final String PARAM_FOLLOWED_CATEGORY_ID = "followedCategoryId";
    public static final String PARAM_FOLLOWED_DOCUMENT_ID = "followedDocumentId";
    public static final String PARAM_FOLLOWED_LANGUAGE_ID = "followedLanguageId";
    public static final String PARAM_MARKED_AS_HELPFUL_DOCUMENT_ID = "markedAsHelpfulDocumentId";
    public static final String PARAM_MARKED_AS_HELPFUL_DOCUMENT_LANGUAGE_VERSION_ID = "markedAsHelpfulDocumentLanguageVersionId";
    public static final String PARAM_MARKED_AS_HELPFUL_LANGUAGE_ID = "markedAsHelpfulLanguageId";
    public static final String PARAM_LOAD_CLIENTS= "loadClients";
    public static final String PARAM_LOAD_ADDRESSES= "loadAddresses";
    public static final String PARAM_LOAD_COMMUNICATION_DATA = "loadCommunicationData";
    public static final String PARAM_LOAD_ROLES = "loadRoles";
    public static final String PARAM_LOAD_CONTACT_IMAGES = "loadContactImages";
    // *** person/contact-image;
    public static final String PARAM_CONTACT_IMAGE_ID = "contactImageId";
    // *** role;
    public static final String PARAM_ROLE_ID = "roleId";
    public static final String PARAM_NOT_REMOVABLE = "notRemovable";
    public static final String PARAM_INITIALLY_ASSIGNED_TO_ACCOUNT = "initiallyAssignedToAccount";
    public static final String PARAM_INITIALLY_ASSIGNED_TYPE_TO_DOCUMENT = "initiallyAssignedTypeToDocument";
    // *** search;
    public static final String PARAM_QUERY= "query";
    public static final String PARAM_INCLUDE_PERSONS = "includePersons";
    public static final String PARAM_CATEGORY_AGGREGATIONS = "categoryAggregations";
    public static final String PARAM_HIGHLIGHT_FIELD = "highlightField";
    // *** task;
    public static final String PARAM_TASK_ID = "taskId";
    public static final String PARAM_AUTHOR_ACCOUNT_ID = "authorAccountId";
    public static final String PARAM_ASSIGNED_ONLY = "assignedOnly";
    // *** task/status;
    public static final String PARAM_STATUS_ID = "statusId";
    public static final String PARAM_STATUS_ID_EXCLUDE = "statusIdExclude";

    // *** VALUE;
    // *** document;
    public static final String VALUE_READ = "true";
    public static final String VALUE_UNREAD = "false";
    public static final String VALUE_UNREAD_SINCE_ACCOUNT_CREATION = "unreadSinceAccountCreation";
    public static final String VALUE_UNREAD_SINCE_LAST_LOGIN = "unreadSinceLastLogin";
    public static final String VALUE_PUBLISH_REQUEST_UNREVIEWED = "unreviewed";
    public static final String VALUE_PUBLISH_REQUEST_REVIEWED = "reviewed";
    public static final String VALUE_PUBLISH_REQUEST_REVIEW_REQUESTED= "reviewRequested";
    public static final String VALUE_UPDATE_READ_TIME_ALL = "all";

}
