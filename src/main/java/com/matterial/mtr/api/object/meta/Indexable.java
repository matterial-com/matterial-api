package com.matterial.mtr.api.object.meta;


/**
 * Interface for classes to be indexable by the EmbeddedSearchServer
 */
public interface Indexable extends IndexableChild {

    public enum Language {
        de,en,fr,it,es,sv //,zh
    }

    /**
     * Get id (unique for this type)
     * @return String
     */
    public String indexId();

    /**
     * Get langauage that should be used for index analysis
     * @return Indexable.Language
     */
    public Language indexLanguage();

    /**
     * Get the typeName to be used for indexing
     * @return String
     */
    public String indexTypeName();

    /**
     * Textual information to be used for autocomplete<br/>
     * Be aware of memory consumption
     * @return String
     */
    public String indexAutocompleteInput();

}
