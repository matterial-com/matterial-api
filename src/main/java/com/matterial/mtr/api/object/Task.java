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

    private Long documentLanguageVersionId; 
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
                Long documentLanguageVersionId, 
                long taskStatusId, 
                // *** assigned-role;
                Long assignedRoleId,
                // *** assigned-account;
                Long assignedAccountId) {
        this(id, creationDateInSeconds, description, dueDateInSeconds, 
             documentLanguageVersionId, taskStatusId, 
             // *** assigned-role;
             assignedRoleId, null, null, null, null,
             // *** assigned-account;
             assignedAccountId, null, null, null, null, null, null, null, null, null, null, null, null);
    }
    
    public Task(long id, 
                long creationDateInSeconds,
                String description, 
                Long dueDateInSeconds, 
                Long documentLanguageVersionId, 
                long taskStatusId, 
                // *** assigned-role;
                Long assignedRoleId,
                Long assignedRoleEntityTypeId, 
                String assignedRoleName, 
                String assignedRoleDescription, 
                Long assignedRoleBitmask,
                // *** assigned-account;
                Long acceptedAccountId,
                String acceptedAccountLogin,
                Integer acceptedAccountStatus,
                Long acceptedAccountSuperiorAccountId,
                Long acceptedAccountCreateTimeInSeconds,
                Long acceptedAccountLastLoginInSeconds,
                Boolean acceptedAccountInstanceAdmin,
                Long acceptedAccountContactId,
                String acceptedAccountFirstName,
                String acceptedAccountLastName,
                String acceptedAccountPosition,
                Long acceptedAccountBirthdayInSeconds,
                Integer acceptedAccountGender) {
        this(id, creationDateInSeconds, description, dueDateInSeconds, 
             documentLanguageVersionId, taskStatusId, 
             // *** assigned-role;
             assignedRoleId, assignedRoleEntityTypeId, 
             assignedRoleName, assignedRoleDescription, assignedRoleBitmask,
             // *** accepted-account;
             acceptedAccountId, acceptedAccountLogin, 
             acceptedAccountSuperiorAccountId, 
             acceptedAccountCreateTimeInSeconds, 
             acceptedAccountLastLoginInSeconds, acceptedAccountInstanceAdmin, 
             acceptedAccountContactId, acceptedAccountFirstName, acceptedAccountLastName, 
             acceptedAccountPosition, acceptedAccountBirthdayInSeconds, acceptedAccountGender,
             // *** skip: author-account;
             null, null, null, null, null, null, null, null, null, null, null, null);
    }
    
    public Task(long id, 
                long creationDateInSeconds,
                String description, 
                Long dueDateInSeconds, 
                Long documentLanguageVersionId, 
                long taskStatusId, 
                // *** assigned-role;
                Long assignedRoleId,
                Long assignedRoleEntityTypeId, 
                String assignedRoleName, 
                String assignedRoleDescription, 
                Long assignedRoleBitmask,
                // *** accepted-account;
                Long acceptedAccountId,
                String acceptedAccountLogin,
                Long acceptedAccountSuperiorAccountId,
                Long acceptedAccountCreateTimeInSeconds,
                Long acceptedAccountLastLoginInSeconds,
                Boolean acceptedAccountInstanceAdmin,
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
        this.documentLanguageVersionId = documentLanguageVersionId;
        this.taskStatusId = taskStatusId;
        // *** assigned-role;
        if(assignedRoleId != null && assignedRoleId > 0L && 
           assignedRoleEntityTypeId != null && assignedRoleBitmask != null) {
            this.assignedRole = new Role(assignedRoleId, assignedRoleEntityTypeId, 
                                         assignedRoleName, assignedRoleDescription, assignedRoleBitmask);
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

    public Long getDocumentLanguageVersionId() {
        return documentLanguageVersionId;
    }

    public void setDocumentLanguageVersionId(Long documentLanguageVersionId) {
        this.documentLanguageVersionId = documentLanguageVersionId;
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