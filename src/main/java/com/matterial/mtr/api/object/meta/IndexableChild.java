package com.matterial.mtr.api.object.meta;

import java.io.Serializable;
import java.util.Map;

/**
 * Interface for classes to be indexable by the EmbeddedSearchServer
 */
public interface IndexableChild extends Serializable {
    
    public static final String INDEX_KEY_AUTOCOMPLETE = "autocomplete";
    
    /**
     * Get a map of all key/values that should be indexed
     * @return Map&lt;String, Object&gt;
     */
    public Map<String, Object> indexMap();
}