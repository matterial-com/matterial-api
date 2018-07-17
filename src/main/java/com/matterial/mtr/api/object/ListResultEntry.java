package com.matterial.mtr.api.object;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

/**
 * <strong>ListResultEntry</strong>
 */
@XmlRootElement
@XmlSeeAlso({AdditionalProperty.class,
             Address.class,
             Client.class,
             CommunicationData.class,
             Comment.class,
             ContactImage.class,
             DataSource.class,
             Document.class,
             DocumentChangeLog.class,
             ExtensionValue.class,
             Person.class,
             Role.class,
             RoleRight.class,
             SearchResultEntry.class,
             SimpleValue.class,
             Task.class,
             TrackingItem.class})
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,
              include = As.EXISTING_PROPERTY,
              property = "jsonType")
@JsonSubTypes({@JsonSubTypes.Type(AdditionalProperty.class),
               @JsonSubTypes.Type(Address.class),
               @JsonSubTypes.Type(Client.class),
               @JsonSubTypes.Type(CommunicationData.class),
               @JsonSubTypes.Type(Comment.class),
               @JsonSubTypes.Type(ContactImage.class),
               @JsonSubTypes.Type(DataSource.class),
               @JsonSubTypes.Type(Document.class),
               @JsonSubTypes.Type(DocumentChangeLog.class),
               @JsonSubTypes.Type(ExtensionValue.class),
               @JsonSubTypes.Type(Person.class),
               @JsonSubTypes.Type(Role.class),
               @JsonSubTypes.Type(RoleRight.class),
               @JsonSubTypes.Type(SearchResultEntry.class),
               @JsonSubTypes.Type(SimpleValue.class),
               @JsonSubTypes.Type(Task.class),
               @JsonSubTypes.Type(TrackingItem.class)})
public class ListResultEntry implements Serializable {

    private static final long serialVersionUID = 1L;

    public String getJsonType() {
        return this.getClass().getSimpleName();
    }

    public void setJsonType(String jsonType) {
        // *** do nothing;
    }

}
