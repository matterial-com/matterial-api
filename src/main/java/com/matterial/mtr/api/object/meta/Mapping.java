package com.matterial.mtr.api.object.meta;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.matterial.mtr.api.object.AdditionalProperty;
import com.matterial.mtr.api.object.Address;
import com.matterial.mtr.api.object.Client;
import com.matterial.mtr.api.object.CommunicationData;
import com.matterial.mtr.api.object.ContactImage;
import com.matterial.mtr.api.object.Document;
import com.matterial.mtr.api.object.ExtensionValue;
import com.matterial.mtr.api.object.Person;
import com.matterial.mtr.api.object.Role;
import com.matterial.mtr.api.object.RoleRight;

public class Mapping {

    public static final Map<String, Class<?>> FIELD_CLASS;
    static {
        Map<String, Class<?>> m = new HashMap<>();

        // *** document;
        m.put(Document.INDEX_FIELD_ROLE_RIGHTS, RoleRight.class);
        m.put(Document.INDEX_FIELD_RESPONSIBLES, Person.class);
        m.put(Document.INDEX_FIELD_FOLLOWERS, Person.class);
        m.put(Document.INDEX_FIELD_MARKED_AS_HELPFUL_BY, Person.class);
        m.put(Document.INDEX_FIELD_ADDITIONAL_PROPERTIES, AdditionalProperty.class);
        m.put(Document.INDEX_FIELD_EXTENSION_VALUES, ExtensionValue.class);
        // *** person;
        m.put(Person.INDEX_FIELD_ROLES_FUNCTIONAL, Role.class);
        m.put(Person.INDEX_FIELD_ROLES_CONTENT, Role.class);
        m.put(Person.INDEX_FIELD_ROLES_REVIEW, Role.class);
        m.put(Person.INDEX_FIELD_CLIENTS, Client.class);
        m.put(Person.INDEX_FIELD_ADDRESSES, Address.class);
        m.put(Person.INDEX_FIELD_COMMUNICATION_DATA, CommunicationData.class);
        m.put(Person.INDEX_FIELD_CONTACT_IMAGES, ContactImage.class);

        FIELD_CLASS = Collections.unmodifiableMap(m);
    }

}
