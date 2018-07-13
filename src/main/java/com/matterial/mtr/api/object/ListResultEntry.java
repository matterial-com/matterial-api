package com.matterial.mtr.api.object;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * <strong>ListResultEntry</strong>
 */
@XmlRootElement
@XmlSeeAlso({Document.class,
             Role.class,
             Comment.class,
             Task.class,
             Person.class,
             DocumentChangeLog.class,
             DataSource.class,
             TrackingItem.class,
             SimpleValue.class,
             SearchResultEntry.class})
public class ListResultEntry implements Serializable {

    private static final long serialVersionUID = 1L;

}
