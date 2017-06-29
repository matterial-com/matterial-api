package com.matterial.mtr.api.object;

import javax.xml.bind.annotation.XmlRootElement;

import com.matterial.mtr.api.object.meta.Identifiable;

/**
 * Container representing a comment
 */
@XmlRootElement
public class Comment extends ListResultEntry implements Identifiable {

    private static final long serialVersionUID = 1L;

    private long id;
    private long createTimeInSeconds;
    private String text;

    private long documentLanguageVersionId;
    private Person person;

    /**
     * Empty Constructor
     */
    public Comment() {
    }

    /**
     * Constructor
     *
     * @param id
     * @param createTimeInSeconds
     * @param text
     * @param documentLanguageVersionId
     * @param person
     */
    public Comment(long id, long createTimeInSeconds, String text, long documentLanguageVersionId, Person person) {
        this.id = id;
        this.createTimeInSeconds = createTimeInSeconds;
        this.text = text;
        this.documentLanguageVersionId = documentLanguageVersionId;
        this.person = person;
    }

    /**
     * Constructor (implicit Person construction)
     *
     * @param id
     * @param createTimeInSeconds
     * @param text
     * @param documentLanguageVersionId
     * @param person
     */
    public Comment(long id,
            long createTimeInSeconds,
            String text,
            long documentLanguageVersionId,
            Long accountId,
            String accountLogin,
            Long superiorAccountId,
            long accountCreateTimeInSeconds,
            Long accountLastLoginInSeconds,
            boolean instanceAdmin,
            boolean limited,
            long contactId,
            String firstName,
            String lastName,
            String position,
            Long birthdayInSeconds,
            Integer gender) {
        this.id = id;
        this.createTimeInSeconds = createTimeInSeconds;
        this.text = text;
        this.documentLanguageVersionId = documentLanguageVersionId;
        this.person = new Person(accountId, accountLogin, superiorAccountId, 
                                 accountCreateTimeInSeconds, accountLastLoginInSeconds, 
                                 instanceAdmin, limited, 
                                 contactId, firstName, lastName, position, birthdayInSeconds, gender);
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    public long getCreateTimeInSeconds() {
        return createTimeInSeconds;
    }

    public void setCreateTimeInSeconds(long createTimeInSeconds) {
        this.createTimeInSeconds = createTimeInSeconds;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public long getDocumentLanguageVersionId() {
        return documentLanguageVersionId;
    }

    public void setDocumentLanguageVersionId(long documentLanguageVersionId) {
        this.documentLanguageVersionId = documentLanguageVersionId;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
