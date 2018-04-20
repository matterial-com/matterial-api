package com.matterial.mtr.api.object;

import javax.xml.bind.annotation.XmlRootElement;

import com.matterial.mtr.api.object.meta.Identifiable;

/**
 * Container representing a task
 */
@XmlRootElement
public class Task extends ListResultEntry implements Identifiable {

    private static final long serialVersionUID = 1L;

    private long id;
    private long creationDateInSeconds;
    private String description;
    private Long dueDateInSeconds;
    private boolean snap;

    private Long documentId;
    private Long documentLanguageVersionId;
    private Integer documentLanguageVersionVersion;
    private String documentLanguageVersionTitle;
    private String documentLanguageVersionLanguageKey;
    private long taskStatusId;

    private Role assignedRole;
    private Person acceptedAccount;
    private Person authorAccount;

    public Task() {
        // *** do nothing;
    }

    public Task(long id,
                long creationDateInSeconds,
                String description,
                Long dueDateInSeconds,
                Long documentId,
                Long documentLanguageVersionId,
                Integer documentLanguageVersionVersion,
                String documentLanguageVersionTitle,
                String documentLanguageVersionLanguageKey,
                long taskStatusId,
                // *** assigned-role;
                Long assignedRoleId,
                // *** assigned-account;
                Long assignedAccountId) {
        this(id, creationDateInSeconds, description, dueDateInSeconds,
             documentId, documentLanguageVersionId, documentLanguageVersionVersion, documentLanguageVersionTitle, documentLanguageVersionLanguageKey, taskStatusId,
             // *** assigned-role;
             assignedRoleId, null, null, null, null, null, null, null, null,
             // *** assigned-account;
             assignedAccountId, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public Task(long id,
                long creationDateInSeconds,
                String description,
                Long dueDateInSeconds,
                Long documentId,
                Long documentLanguageVersionId,
                Integer documentLanguageVersionVersion,
                String documentLanguageVersionTitle,
                String documentLanguageVersionLanguageKey,
                long taskStatusId,
                // *** assigned-role;
                Long assignedRoleId,
                Long assignedRoleClientId,
                Long assignedRoleEntityTypeId,
                String assignedRoleName,
                String assignedRoleDescription,
                Long assignedRoleBitmask,
                Boolean assignedRoleNotRemovable,
                Boolean assignedRoleInitiallyAssignedToAccount,
                Long assignedRoleInitiallyAssignedTypeToDocument,
                // *** assigned-account;
                Long acceptedAccountId,
                String acceptedAccountLogin,
                Integer acceptedAccountStatus,
                Long acceptedAccountSuperiorAccountId,
                Long acceptedAccountCreateTimeInSeconds,
                Long acceptedAccountLastLoginInSeconds,
                Boolean acceptedAccountInstanceAdmin,
                Boolean acceptedAccountLimited,
                Long acceptedAccountContactId,
                String acceptedAccountFirstName,
                String acceptedAccountLastName,
                String acceptedAccountPosition,
                Long acceptedAccountBirthdayInSeconds,
                Integer acceptedAccountGender) {
        this(id, creationDateInSeconds, description, dueDateInSeconds,
             documentId, documentLanguageVersionId, documentLanguageVersionVersion, documentLanguageVersionTitle, documentLanguageVersionLanguageKey, taskStatusId,
             // *** assigned-role;
             assignedRoleId, assignedRoleClientId, assignedRoleEntityTypeId,
             assignedRoleName, assignedRoleDescription, assignedRoleBitmask,
             assignedRoleNotRemovable, assignedRoleInitiallyAssignedToAccount, assignedRoleInitiallyAssignedTypeToDocument,
             // *** accepted-account;
             acceptedAccountId, acceptedAccountLogin,
             acceptedAccountSuperiorAccountId,
             acceptedAccountCreateTimeInSeconds,
             acceptedAccountLastLoginInSeconds, acceptedAccountInstanceAdmin, acceptedAccountLimited,
             acceptedAccountContactId, acceptedAccountFirstName, acceptedAccountLastName,
             acceptedAccountPosition, acceptedAccountBirthdayInSeconds, acceptedAccountGender,
             // *** skip: author-account;
             null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public Task(long id,
                long creationDateInSeconds,
                String description,
                Long dueDateInSeconds,
                Long documentId,
                Long documentLanguageVersionId,
                Integer documentLanguageVersionVersion,
                String documentLanguageVersionTitle,
                String documentLanguageVersionLanguageKey,
                long taskStatusId,
                // *** assigned-role;
                Long assignedRoleId,
                Long assignedRoleClientId,
                Long assignedRoleEntityTypeId,
                String assignedRoleName,
                String assignedRoleDescription,
                Long assignedRoleBitmask,
                Boolean assignedRoleNotRemovable,
                Boolean assignedRoleInitiallyAssignedToAccount,
                Long assignedRoleInitiallyAssignedTypeToDocument,
                // *** accepted-account;
                Long acceptedAccountId,
                String acceptedAccountLogin,
                Long acceptedAccountSuperiorAccountId,
                Long acceptedAccountCreateTimeInSeconds,
                Long acceptedAccountLastLoginInSeconds,
                Boolean acceptedAccountInstanceAdmin,
                Boolean acceptedAccountLimited,
                Long acceptedAccountContactId,
                String acceptedAccountFirstName,
                String acceptedAccountLastName,
                String acceptedAccountPosition,
                Long acceptedAccountBirthdayInSeconds,
                Integer acceptedAccountGender,
                // *** author-account;
                Long authorAccountId,
                String authorAccountLogin,
                Long authorAccountSuperiorAccountId,
                Long authorAccountCreateTimeInSeconds,
                Long authorAccountLastLoginInSeconds,
                Boolean authorAccountInstanceAdmin,
                Boolean authorAccountLimited,
                Long authorAccountContactId,
                String authorAccountFirstName,
                String authorAccountLastName,
                String authorAccountPosition,
                Long authorAccountBirthdayInSeconds,
                Integer authorAccountGender) {
        this.id = id;
        this.creationDateInSeconds = creationDateInSeconds;
        this.description = description;
        this.dueDateInSeconds = dueDateInSeconds;
        this.documentId = documentId;
        this.documentLanguageVersionId = documentLanguageVersionId;
        this.documentLanguageVersionVersion = documentLanguageVersionVersion;
        this.documentLanguageVersionTitle = documentLanguageVersionTitle;
        this.documentLanguageVersionLanguageKey = documentLanguageVersionLanguageKey;
        this.taskStatusId = taskStatusId;
        // *** assigned-role;
        if(assignedRoleId != null && assignedRoleId > 0L &&
           assignedRoleEntityTypeId != null && assignedRoleBitmask != null &&
           assignedRoleNotRemovable != null &&
           assignedRoleInitiallyAssignedToAccount != null &&
           assignedRoleInitiallyAssignedTypeToDocument != null) {
            this.assignedRole = new Role(assignedRoleId, assignedRoleClientId, assignedRoleEntityTypeId,
                                         assignedRoleName, assignedRoleDescription, assignedRoleBitmask,
                                         assignedRoleNotRemovable, assignedRoleInitiallyAssignedToAccount,
                                         assignedRoleInitiallyAssignedTypeToDocument);
        }
        else if(assignedRoleId != null && assignedRoleId > 0L) {
            this.assignedRole = new Role();
            this.assignedRole.setId(assignedRoleId);
        }
        // *** accepted-account;
        if(acceptedAccountId != null && acceptedAccountId > 0L &&
           acceptedAccountContactId != null) {
            this.acceptedAccount = new Person(acceptedAccountId, acceptedAccountLogin,
                                              acceptedAccountSuperiorAccountId,
                                              acceptedAccountCreateTimeInSeconds,
                                              acceptedAccountLastLoginInSeconds,
                                              acceptedAccountInstanceAdmin,
                                              acceptedAccountLimited,
                                              acceptedAccountContactId, acceptedAccountFirstName, acceptedAccountLastName,
                                              acceptedAccountPosition, acceptedAccountBirthdayInSeconds, acceptedAccountGender);
        }
        else if(acceptedAccountId != null && acceptedAccountId > 0L) {
            this.acceptedAccount = new Person();
            this.acceptedAccount.setAccountId(acceptedAccountId);
        }
        // *** author-account;
        if(authorAccountId != null && authorAccountId > 0L &&
           authorAccountContactId != null) {
            this.authorAccount = new Person(authorAccountId, authorAccountLogin,
                                            authorAccountSuperiorAccountId,
                                            authorAccountCreateTimeInSeconds,
                                            authorAccountLastLoginInSeconds,
                                            authorAccountInstanceAdmin,
                                            authorAccountLimited,
                                            authorAccountContactId, authorAccountFirstName, authorAccountLastName,
                                            authorAccountPosition, authorAccountBirthdayInSeconds, authorAccountGender);
        }
        else if(authorAccountId != null && authorAccountId > 0L) {
            this.authorAccount = new Person();
            this.authorAccount.setAccountId(authorAccountId);
        }
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    public long getCreationDateInSeconds() {
        return creationDateInSeconds;
    }

    public void setCreationDateInSeconds(long creationDateInSeconds) {
        this.creationDateInSeconds = creationDateInSeconds;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getDueDateInSeconds() {
        return dueDateInSeconds;
    }

    public void setDueDateInSeconds(Long dueDateInSeconds) {
        this.dueDateInSeconds = dueDateInSeconds;
    }

    public boolean isSnap() {
        return snap;
    }

    public void setSnap(boolean snap) {
        this.snap = snap;
    }

    public Long getDocumentId() {
        return documentId;
    }

    public void setDocumentId(Long documentId) {
        this.documentId = documentId;
    }

    public Long getDocumentLanguageVersionId() {
        return documentLanguageVersionId;
    }

    public void setDocumentLanguageVersionId(Long documentLanguageVersionId) {
        this.documentLanguageVersionId = documentLanguageVersionId;
    }

    public Integer getDocumentLanguageVersionVersion() {
        return documentLanguageVersionVersion;
    }

    public void setDocumentLanguageVersionVersion(Integer documentLanguageVersionVersion) {
        this.documentLanguageVersionVersion = documentLanguageVersionVersion;
    }

    public String getDocumentLanguageVersionTitle() {
        return documentLanguageVersionTitle;
    }

    public void setDocumentLanguageVersionTitle(String documentLanguageVersionTitle) {
        this.documentLanguageVersionTitle = documentLanguageVersionTitle;
    }

    public String getDocumentLanguageVersionLanguageKey() {
        return documentLanguageVersionLanguageKey;
    }

    public void setDocumentLanguageVersionLanguageKey(String documentLanguageVersionLanguageKey) {
        this.documentLanguageVersionLanguageKey = documentLanguageVersionLanguageKey;
    }

    public long getTaskStatusId() {
        return taskStatusId;
    }

    public void setTaskStatusId(long taskStatusId) {
        this.taskStatusId = taskStatusId;
    }

    public Role getAssignedRole() {
        return assignedRole;
    }

    public void setAssignedRole(Role assignedRole) {
        this.assignedRole = assignedRole;
    }

    public Person getAcceptedAccount() {
        return acceptedAccount;
    }

    public void setAcceptedAccount(Person acceptedAccount) {
        this.acceptedAccount = acceptedAccount;
    }

    public Person getAuthorAccount() {
        return authorAccount;
    }

    public void setAuthorAccount(Person authorAccount) {
        this.authorAccount = authorAccount;
    }

}