package com.matterial.mtr.api.object;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

import com.matterial.mtr.api.object.meta.Identifiable;
import com.matterial.mtr.api.object.meta.IndexableChild;

/**
 * Container representing a role
 */
@XmlRootElement
public class Role extends ListResultEntry implements Identifiable, IndexableChild {
    
    private static final long serialVersionUID = 1L;
    
    public static final String CLIENT_GATE_NAME = "roles.roleType.clientGate";
    public static final String CLIENT_GATE_DESCR = "roles.clientGate.description";
    
    private long id;
    private long clientId;
    private long entityTypeId;
    private String name;
    private String description;
    private long bitmask;
    private boolean notRemovable;
    private boolean initiallyAssignedToAccount;
    private long initiallyAssignedTypeToDocument;
    
    private Permissions permissions;
    
    /** this will only be set if role is of type 'personal' */
    private Person personalRolePerson;

    
    public Role() {
        // *** init permission;
        this.permissions = new Permissions();
    }
    
    public Role(long id, long clientId, long entityTypeId, String name, String description, long bitmask, 
                boolean notRemovable, boolean initiallyAssignedToAccount, long initiallyAssignedTypeToDocument) {
        this();
        this.id = id;
        this.clientId = clientId;
        this.entityTypeId = entityTypeId;
        this.name = name;
        this.description = description;
        this.notRemovable = notRemovable;
        this.initiallyAssignedToAccount = initiallyAssignedToAccount;
        this.initiallyAssignedTypeToDocument = initiallyAssignedTypeToDocument;
        // *** this also sets the "permissions"-object;
        this.setBitmask(bitmask);
    }
    
    @Override
    public long getId() {
        return id;
    }
    
    @Override
    public void setId(long id) {
        this.id = id;
    }
    
    public long getClientId() {
        return clientId;
    }
    
    public void setClientId(long clientId) {
        this.clientId = clientId;
    }
    
    public long getEntityTypeId() {
        return entityTypeId;
    }
    
    public void setEntityTypeId(long entityTypeId) {
        this.entityTypeId = entityTypeId;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public long getBitmask() {
        return bitmask;
    }
    
    public void setBitmask(long bitmask) {
        this.bitmask = bitmask;
        // *** sets the permissions;
        this.permissions = new Permissions(this.bitmask);
    }

    public Permissions getPermissions() {
        return permissions;
    }
    
    public boolean isNotRemovable() {
        return this.notRemovable;
    }

    public void setNotRemovable(boolean notRemovable) {
        this.notRemovable = notRemovable;
    }

    public boolean isInitiallyAssignedToAccount() {
        return this.initiallyAssignedToAccount;
    }

    public void setInitiallyAssignedToAccount(boolean initiallyAssignedToAccount) {
        this.initiallyAssignedToAccount = initiallyAssignedToAccount;
    }

    public long getInitiallyAssignedTypeToDocument() {
        return this.initiallyAssignedTypeToDocument;
    }

    public void setInitiallyAssignedTypeToDocument(long initiallyAssignedTypeToDocument) {
        this.initiallyAssignedTypeToDocument = initiallyAssignedTypeToDocument;
    }

    public void setPermissions(Permissions permissions) {
        this.permissions = permissions;
        // *** update bitmask from permissions;
        if(this.permissions != null) {
            this.bitmask = this.permissions.getBitmask();
        }
    }
    
    public Person getPersonalRolePerson() {
        return personalRolePerson;
    }

    public void setPersonalRolePerson(Person personalRolePerson) {
        this.personalRolePerson = personalRolePerson;
    }

    @Override
    public Map<String, Object> indexMap() {
        Map<String, Object> indexMap = new HashMap<>();
        indexMap.put("id", this.getId());
        indexMap.put("clientId", this.getClientId());
        indexMap.put("entityTypeId", this.getEntityTypeId());
        indexMap.put("name", this.getName());
        indexMap.put("description", this.getDescription());
        return indexMap;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Role)) {
            return false;
        }
        Role other = (Role) obj;
        if (id != other.id) {
            return false;
        }
        return true;
    }
}
