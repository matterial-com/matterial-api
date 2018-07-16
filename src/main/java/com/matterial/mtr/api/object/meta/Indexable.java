package com.matterial.mtr.api.object.meta;

/**
 * Interface for classes to be indexable by the EmbeddedSearchServer
 */
//*** Indexable has to be a class (no interface), because of JAXB marshalling to XML will fail!
public abstract class Indexable extends IndexableChild {

    private static final long serialVersionUID = 1L;

    public enum Language {
        de,en,fr,it,es,sv //,zh
    }

    /**
     * Get id (unique for this type)
     */
    public abstract String indexId();

    /**
     * Get langauage that should be used for index analysis
     */
    public abstract Language indexLanguage();

    /**
     * Get the typeName to be used for indexing
     */
    public abstract String indexTypeName();

    /**
     * Textual information to be used for autocomplete<br/>
     * Be aware of memory consumption
     */
    public abstract String indexAutocompleteInput();

}
