package com.matterial.mtr.api.object;

import javax.xml.bind.annotation.XmlRootElement;

import com.matterial.mtr.api.object.meta.IndexableChild;

/**
 * Container representing a right of a role for a document
 */
@XmlRootElement
public class RoleRight implements IndexableChild, Comparable<RoleRight> {

    private static final long serialVersionUID = 1L;

    public static final long READ = 1L;
    public static final long EDIT = 2L;

    private Role role;
    private long type;

    public RoleRight() {
        // *** do nothing;
    }

    public RoleRight(long roleId,
                     long roleClientId,
                     long roleEntityTypeId,
                     String roleName,
                     String roleDescription,
                     long roleBitmask,
                     long type) {
        this(new Role(roleId,
                      roleClientId,
                      roleEntityTypeId,
                      roleName,
                      roleDescription,
                      roleBitmask,
                      false,
                      false,
                      0), type);
    }

    public RoleRight(Role role, long type) {
        this.role = role;
        this.type = type;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public long getType() {
        return type;
    }

    public void setType(long type) {
        this.type = type;
    }

    @Override
    public int compareTo(RoleRight o) {
        int result = -1;
        if( this.role != null && o.getRole() != null &&
            this.role.getId() == o.getRole().getId() &&
            this.type == o.getType()){
            result = 0;
        }
        return result;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((role == null) ? 0 : role.hashCode());
        result = prime * result + (int) (type ^ (type >>> 32));
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
        if (!(obj instanceof RoleRight)) {
            return false;
        }
        RoleRight other = (RoleRight) obj;
        if (role == null) {
            if (other.role != null) {
                return false;
            }
        }
        else if (!role.equals(other.role)) {
            return false;
        }
        if (type != other.type) {
            return false;
        }
        return true;
    }

}
