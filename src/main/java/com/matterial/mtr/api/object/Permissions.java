package com.matterial.mtr.api.object;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * <strong>Permissions</strong>
 */
@XmlRootElement
public class Permissions implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    public static final long NO_RIGHT_REQUIRED = 0L;           // 0L;
    public static final long ADMINISTRATE_ALL = 1L << 0;       // 1L;
    public static final long EDIT_PERSON = 1L << 1;            // 2L;
    public static final long EDIT_DOCUMENT = 1L << 2;          // 4L;
    public static final long EDIT_DOCUMENT_TEMPLATE = 1L << 3; // 8L;
    public static final long EDIT_ROLE = 1L << 4;              // 16L;
    public static final long EDIT_CATEGORY = 1L << 5;          // 32L;
    public static final long EDIT_TASK = 1L << 6;
    public static final long COMMENT = 1L << 7;
    public static final long VIEW_ARCHIVE = 1L << 8;
    public static final long VIEW_STATISTIC = 1L << 9;
    public static final long SHOW_TRASH = 1L << 10;
    public static final long EDIT_GALLERY = 1L << 11;
    public static final long IMMEDIATE_REVIEW = 1L << 12;
    public static final long PUBLISH_UNREVIEWED = 1L << 13;
    public static final long EDIT_ADDITIONAL_PROPERTY = 1L << 14;
    public static final long EDIT_GLOBAL_SAVED_SEARCH = 1L << 15;
    
    public static final long ADMIN_BITMASK;
    
    public static final List<Permission> PERMISSIONS;
    static {
        List<Permission> l = new ArrayList<>();
        
        // *** standard-user-rights;
        l.add(new Permission(COMMENT, "permission.COMMENT", "permission.COMMENT_DESCRIPTION"));
        l.add(new Permission(VIEW_ARCHIVE, "permission.VIEW_ARCHIVE", "permission.VIEW_ARCHIVE_DESCRIPTION"));
        l.add(new Permission(EDIT_TASK, "permission.EDIT_TASK", "permission.EDIT_TASK_DESCRIPTION"));
        
        // *** standard-editor-rights;
        l.add(new Permission(EDIT_DOCUMENT, "permission.EDIT_DOCUMENT", "permission.EDIT_DOCUMENT_DESCRIPTION"));
        l.add(new Permission(PUBLISH_UNREVIEWED, "permission.PUBLISH_UNREVIEWED",
                             "permission.PUBLISH_UNREVIEWED_DESCRIPTION"));
        l.add(new Permission(EDIT_GALLERY, "permission.EDIT_GALLERY", "permission.EDIT_GALLERY_DESCRIPTION"));
        l.add(new Permission(EDIT_DOCUMENT_TEMPLATE, "permission.EDIT_DOCUMENT_TEMPLATE",
                             "permission.EDIT_DOCUMENT_TEMPLATE_DESCRIPTION"));
        l.add(new Permission(EDIT_CATEGORY, "permission.EDIT_CATEGORY", "permission.EDIT_CATEGORY_DESCRIPTION"));
        l.add(new Permission(IMMEDIATE_REVIEW, "permission.IMMEDIATE_REVIEW",
                             "permission.IMMEDIATE_REVIEW_DESCRIPTION"));
        
        // *** standard-admin-rights;
        l.add(new Permission(EDIT_GLOBAL_SAVED_SEARCH, "permission.EDIT_GLOBAL_SAVED_SEARCH", "permission.EDIT_GLOBAL_SAVED_SEARCH_DESCRIPTION"));
        l.add(new Permission(EDIT_ROLE, "permission.EDIT_ROLE", "permission.EDIT_ROLE_DESCRIPTION"));
        l.add(new Permission(EDIT_PERSON, "permission.EDIT_PERSON", "permission.EDIT_PERSON_DESCRIPTION"));
        l.add(new Permission(SHOW_TRASH, "permission.SHOW_TRASH", "permission.SHOW_TRASH_DESCRIPTION"));
        l.add(new Permission(VIEW_STATISTIC, "permission.VIEW_STATISTICS", "permission.VIEW_STATISTICS_DESCRIPTION"));
        l.add(new Permission(EDIT_ADDITIONAL_PROPERTY, "permission.EDIT_ADDITIONAL_PROPERTY", "permission.EDIT_ADDITIONAL_PROPERTY_DESCRIPTION"));
        l.add(new Permission(ADMINISTRATE_ALL, "permission.ADMINISTRATE_ALL",
                             "permission.ADMINISTRATE_ALL_DESCRIPTION"));
        
        long adminBitmask = 0L;
        for (Permission p : l) {
            adminBitmask |= p.getBit();
        }
        ADMIN_BITMASK = adminBitmask;
        
        PERMISSIONS = Collections.unmodifiableList(l);
    }
    
    /**
     * not related to bitmask;
     */
    private boolean systemAccount;

    private long bitmask;
    private boolean administrateAll;
    private boolean editPerson;
    private boolean editDocument;
    private boolean editDocumentTemplate;
    private boolean editRole;
    private boolean editCategory;
    private boolean editTask;
    private boolean comment;
    private boolean viewArchive;
    private boolean viewStatistic;
    private boolean showTrash;
    private boolean editGallery;
    private boolean immediateReview;
    private boolean publishUnreviewed;
    private boolean editAdditionalProperty;
    private boolean editGlobalSavedSearch;
    
    public Permissions() {
        // *** do nothing;
    }
    
    public Permissions(long bitmask, boolean systemAccount) {
        this(bitmask);
        this.systemAccount = systemAccount;
    }
    
    public Permissions(long bitmask) {
        this.systemAccount = false;
        this.bitmask = bitmask;
        this.administrateAll = ((bitmask & ADMINISTRATE_ALL) > 0);
        this.editPerson = ((bitmask & (EDIT_PERSON | ADMINISTRATE_ALL)) > 0);
        this.editDocument = ((bitmask & (EDIT_DOCUMENT | ADMINISTRATE_ALL)) > 0);
        this.editDocumentTemplate = ((bitmask & (EDIT_DOCUMENT_TEMPLATE | ADMINISTRATE_ALL)) > 0);
        this.editRole = ((bitmask & (EDIT_ROLE | ADMINISTRATE_ALL)) > 0);
        this.editCategory = ((bitmask & (EDIT_CATEGORY | ADMINISTRATE_ALL)) > 0);
        this.editTask = ((bitmask & (EDIT_TASK | ADMINISTRATE_ALL)) > 0);
        this.comment = ((bitmask & (COMMENT | ADMINISTRATE_ALL)) > 0);
        this.viewArchive = ((bitmask & (VIEW_ARCHIVE | ADMINISTRATE_ALL)) > 0);
        this.viewStatistic = ((bitmask & (VIEW_STATISTIC | ADMINISTRATE_ALL)) > 0);
        this.showTrash = ((bitmask & (SHOW_TRASH | ADMINISTRATE_ALL)) > 0);
        this.editGallery = ((bitmask & (EDIT_GALLERY | ADMINISTRATE_ALL)) > 0);
        this.immediateReview = ((bitmask & (IMMEDIATE_REVIEW | ADMINISTRATE_ALL)) > 0);
        this.publishUnreviewed = ((bitmask & (PUBLISH_UNREVIEWED | ADMINISTRATE_ALL)) > 0);
        this.editAdditionalProperty = ((bitmask & (EDIT_ADDITIONAL_PROPERTY | ADMINISTRATE_ALL)) > 0);
        this.editGlobalSavedSearch = ((bitmask & (EDIT_GLOBAL_SAVED_SEARCH | ADMINISTRATE_ALL)) > 0);
    }
    
    /**
     * updates the bitmask according to the boolean fields;
     */
    public void updateBitmask() {
        long bitmask = 0L;
        if (this.administrateAll) {
            bitmask |= ADMINISTRATE_ALL;
        }
        if (this.editPerson) {
            bitmask |= EDIT_PERSON;
        }
        if (this.editDocument) {
            bitmask |= EDIT_DOCUMENT;
        }
        if (this.editDocumentTemplate) {
            bitmask |= EDIT_DOCUMENT_TEMPLATE;
        }
        if (this.editRole) {
            bitmask |= EDIT_ROLE;
        }
        if (this.editCategory) {
            bitmask |= EDIT_CATEGORY;
        }
        if (this.editTask) {
            bitmask |= EDIT_TASK;
        }
        if (this.comment) {
            bitmask |= COMMENT;
        }
        if (this.viewArchive) {
            bitmask |= VIEW_ARCHIVE;
        }
        if (this.viewStatistic) {
            bitmask |= VIEW_STATISTIC;
        }
        if (this.showTrash) {
            bitmask |= SHOW_TRASH;
        }
        if (this.editGallery) {
            bitmask |= EDIT_GALLERY;
        }
        if (this.immediateReview) {
            bitmask |= IMMEDIATE_REVIEW;
        }
        if (this.publishUnreviewed) {
            bitmask |= PUBLISH_UNREVIEWED;
        }
        if (this.editAdditionalProperty) {
            bitmask |= EDIT_ADDITIONAL_PROPERTY;
        }
        if (this.editGlobalSavedSearch) {
            bitmask |= EDIT_GLOBAL_SAVED_SEARCH;
        }
        this.setBitmask(bitmask);
    }
    
    public boolean isSystemAccount() {
        return systemAccount;
    }
    
    public void setSystemAccount(boolean systemAccount) {
        this.systemAccount = systemAccount;
    }

    public long getBitmask() {
        return bitmask;
    }
    
    public void setBitmask(long bitmask) {
        this.bitmask = bitmask;
    }
    
    public boolean isAdministrateAll() {
        return administrateAll;
    }
    
    public void setAdministrateAll(boolean administrateAll) {
        this.administrateAll = administrateAll;
    }
    
    public boolean isEditPerson() {
        return editPerson;
    }
    
    public void setEditPerson(boolean editPerson) {
        this.editPerson = editPerson;
    }
    
    public boolean isEditDocument() {
        return editDocument;
    }
    
    public void setEditDocument(boolean editDocument) {
        this.editDocument = editDocument;
    }
    
    public boolean isEditDocumentTemplate() {
        return editDocumentTemplate;
    }
    
    public void setEditDocumentTemplate(boolean editDocumentTemplate) {
        this.editDocumentTemplate = editDocumentTemplate;
    }
    
    public boolean isEditRole() {
        return editRole;
    }
    
    public void setEditRole(boolean editRole) {
        this.editRole = editRole;
    }
    
    public boolean isEditCategory() {
        return editCategory;
    }
    
    public void setEditCategory(boolean editCategory) {
        this.editCategory = editCategory;
    }
    
    public boolean isEditTask() {
        return editTask;
    }
    
    public void setEditTask(boolean editTask) {
        this.editTask = editTask;
    }
    
    public boolean isComment() {
        return comment;
    }
    
    public void setComment(boolean comment) {
        this.comment = comment;
    }
    
    public boolean isViewArchive() {
        return viewArchive;
    }
    
    public void setViewArchive(boolean viewArchive) {
        this.viewArchive = viewArchive;
    }
    
    public boolean isViewStatistic() {
        return viewStatistic;
    }
    
    public void setViewStatistic(boolean viewStatistic) {
        this.viewStatistic = viewStatistic;
    }
    
    public boolean isShowTrash() {
        return showTrash;
    }
    
    public void setShowTrash(boolean showTrash) {
        this.showTrash = showTrash;
    }
    
    public boolean isEditGallery() {
        return editGallery;
    }
    
    public void setEditGallery(boolean editGallery) {
        this.editGallery = editGallery;
    }
    
    public boolean isImmediateReview() {
        return immediateReview;
    }
    
    public void setImmediateReview(boolean immediateReview) {
        this.immediateReview = immediateReview;
    }
    
    public boolean isPublishUnreviewed() {
        return publishUnreviewed;
    }
    
    public void setPublishUnreviewed(boolean publishUnreviewed) {
        this.publishUnreviewed = publishUnreviewed;
    }
    
    public boolean isEditAdditionalProperty() {
        return editAdditionalProperty;
    }
    
    public void setEditAdditionalProperty(boolean editAdditionalProperty) {
        this.editAdditionalProperty = editAdditionalProperty;
    }
    
    public boolean isEditGlobalSavedSearch() {
        return editGlobalSavedSearch;
    }
    
    public void setEditGlobalSavedSearch(boolean editGlobalSavedSearch) {
        this.editGlobalSavedSearch = editGlobalSavedSearch;
    }
    
    /**
     * test-main: checks bitmask;
     */
    public static void main(String[] args) {
        long bitmask = ADMIN_BITMASK;
        if(args != null && args.length > 0) {
            bitmask = Long.parseLong(args[0]);
        }
        System.err.println("Checking bitmask " + bitmask);
        System.err.println();
        
        if((bitmask & ADMINISTRATE_ALL) > 0) {
            System.err.println("ADMINISTRATE_ALL");
        }
        if((bitmask & EDIT_PERSON) > 0) {
            System.err.println("EDIT_PERSON");
        }
        if((bitmask & EDIT_DOCUMENT) > 0) {
            System.err.println("EDIT_DOCUMENT");
        }
        if((bitmask & EDIT_DOCUMENT_TEMPLATE) > 0) {
            System.err.println("EDIT_DOCUMENT_TEMPLATE");
        }
        if((bitmask & EDIT_ROLE) > 0) {
            System.err.println("EDIT_ROLE");
        }
        if((bitmask & EDIT_CATEGORY) > 0) {
            System.err.println("EDIT_CATEGORY");
        }
        if((bitmask & EDIT_TASK) > 0) {
            System.err.println("EDIT_TASK");
        }
        if((bitmask & COMMENT) > 0) {
            System.err.println("COMMENT");
        }
        if((bitmask & VIEW_ARCHIVE) > 0) {
            System.err.println("VIEW_ARCHIVE");
        }
        if((bitmask & VIEW_STATISTIC) > 0) {
            System.err.println("VIEW_STATISTIC");
        }
        if((bitmask & SHOW_TRASH) > 0) {
            System.err.println("SHOW_TRASH");
        }
        if((bitmask & EDIT_GALLERY) > 0) {
            System.err.println("EDIT_GALLERY");
        }
        if((bitmask & IMMEDIATE_REVIEW) > 0) {
            System.err.println("IMMEDIATE_REVIEW");
        }
        if((bitmask & PUBLISH_UNREVIEWED) > 0) {
            System.err.println("PUBLISH_UNREVIEWED");
        }
        if((bitmask & EDIT_ADDITIONAL_PROPERTY) > 0) {
            System.err.println("EDIT_ADDITIONAL_PROPERTY");
        }
        if((bitmask & EDIT_GLOBAL_SAVED_SEARCH) > 0) {
            System.err.println("EDIT_GLOBAL_SAVED_SEARCH");
        }
        
        System.err.println();
        System.err.println("AdminBitmask: " + 
                (ADMINISTRATE_ALL)); 
        System.err.println("Admin[light]Bitmask: " + 
                (EDIT_PERSON | 
                 EDIT_DOCUMENT |
                 EDIT_DOCUMENT_TEMPLATE |
                 EDIT_ROLE |
                 EDIT_CATEGORY |
                 EDIT_TASK |
                 COMMENT |
                 VIEW_ARCHIVE |
                 VIEW_STATISTIC |
                 SHOW_TRASH | 
                 EDIT_GALLERY | 
                 IMMEDIATE_REVIEW | 
                 PUBLISH_UNREVIEWED | 
                 EDIT_ADDITIONAL_PROPERTY |
                 EDIT_GLOBAL_SAVED_SEARCH));
        
        System.err.println("StandardRoleBitmask: " + 
                (COMMENT |
                 VIEW_ARCHIVE |
                 EDIT_TASK));
        
        System.err.println("EditorRoleBitmask: " + 
                (EDIT_DOCUMENT | 
                 PUBLISH_UNREVIEWED |
                 EDIT_GALLERY |
                 EDIT_DOCUMENT_TEMPLATE |
                 EDIT_CATEGORY | 
                 IMMEDIATE_REVIEW));

        Permissions p = new Permissions();
        p.setComment(true);
        p.setEditDocument(true);
        p.setEditPerson(true);
        p.updateBitmask();
        System.err.println("UPDATED BITMASK: " + p.getBitmask());
        
    }
    
}
