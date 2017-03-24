package com.matterial.mtr.api.object.meta;

import java.io.Serializable;

/**
 * <strong>Identifiable</strong>
 */
public interface Identifiable extends Serializable {

    public long getId();
    public void setId(long id);
    
}
