package com.matterial.mtr.api.object;

import javax.xml.bind.annotation.XmlRootElement;

import com.matterial.mtr.api.object.meta.Identifiable;

/**
 * <strong>TrackingItem</strong>
 */
@XmlRootElement
public class TrackingItem implements Identifiable {

    private static final long serialVersionUID = 1L;

    private long id;
    private long userId;
    private long objectId;
    private long creationDateInSeconds;
    private String sessionId;
    private String appType;
    private String appInstance;
    private String actionType;
    private String actionId;
    private String objectRef;
    private String appContext;
    private String changeLog;

    public TrackingItem() {
        // *** do nothing;
    }

    public TrackingItem(
            long id, long userId, 
            long objectId, long creationDateInSeconds,
            String sessionId, String appType,
            String appInstance, String actionType,
            String actionId, String objectRef,
            String appContext, String changeLog) {
        this.id = id;
        this.userId = userId;
        this.objectId = objectId;
        this.creationDateInSeconds = creationDateInSeconds;
        this.sessionId = sessionId;
        this.appType = appType;
        this.appInstance = appInstance;
        this.actionType = actionType;
        this.actionId = actionId;
        this.objectRef = objectRef;
        this.appContext = appContext;
        this.changeLog = changeLog;
    }
    
    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getObjectId() {
        return objectId;
    }

    public void setObjectId(long objectId) {
        this.objectId = objectId;
    }

    public long getCreationDateInSeconds() {
        return creationDateInSeconds;
    }

    public void setCreationDateInSeconds(long creationDateInSeconds) {
        this.creationDateInSeconds = creationDateInSeconds;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }

    public String getAppInstance() {
        return appInstance;
    }

    public void setAppInstance(String appInstance) {
        this.appInstance = appInstance;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getActionId() {
        return actionId;
    }

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    public String getObjectRef() {
        return objectRef;
    }

    public void setObjectRef(String objectRef) {
        this.objectRef = objectRef;
    }

    public String getAppContext() {
        return appContext;
    }

    public void setAppContext(String appContext) {
        this.appContext = appContext;
    }

    public String getChangeLog() {
        return changeLog;
    }

    public void setChangeLog(String changeLog) {
        this.changeLog = changeLog;
    }

}
