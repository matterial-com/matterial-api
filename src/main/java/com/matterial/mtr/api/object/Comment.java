package com.matterial.mtr.api.object;

import java.util.List;

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
    private String textHtml;

    private long documentId;
    private long documentLanguageVersionId;
    private int documentLanguageVersionVersion;
    private String documentLanguageVersionTitle;
    private String documentLanguageVersionLanguageKey;
    private Person person;

    private List<Long> mentionedAccountIds;

    /**
     * Empty Constructor
     */
    public Comment() {
        // *** do nothing;
    }

    /**
     * Constructor
     */
    public Comment(long id,
                   long createTimeInSeconds,
                   String text,
                   long documentId,
                   long documentLanguageVersionId,
                   int documentLanguageVersionVersion,
                   String documentLanguageVersionTitle,
                   String documentLanguageVersionLanguageKey,
                   Person person) {
        this.id = id;
        this.createTimeInSeconds = createTimeInSeconds;
        this.text = text;
        this.documentLanguageVersionId = documentLanguageVersionId;
        this.person = person;
    }

    /**
     * Constructor (implicit Person construction)
     */
    public Comment(long id,
                   long createTimeInSeconds,
                   String text,
                   long documentId,
                   long documentLanguageVersionId,
                   int documentLanguageVersionVersion,
                   String documentLanguageVersionTitle,
                   String documentLanguageVersionLanguageKey,
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
        this(id,
             createTimeInSeconds,
             text,
             documentId,
             documentLanguageVersionId,
             documentLanguageVersionVersion,
             documentLanguageVersionTitle,
             documentLanguageVersionLanguageKey,
             new Person(accountId, accountLogin, superiorAccountId,
                        accountCreateTimeInSeconds, accountLastLoginInSeconds,
                        instanceAdmin, limited,
                        contactId, firstName, lastName, position, birthdayInSeconds, gender));
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

    public String getTextHtml() {
        return textHtml;
    }

    public void setTextHtml(String textHtml) {
        this.textHtml = textHtml;
    }

    public long getDocumentId() {
        return documentId;
    }

    public void setDocumentId(long documentId) {
        this.documentId = documentId;
    }

    public long getDocumentLanguageVersionId() {
        return documentLanguageVersionId;
    }

    public void setDocumentLanguageVersionId(long documentLanguageVersionId) {
        this.documentLanguageVersionId = documentLanguageVersionId;
    }

    public int getDocumentLanguageVersionVersion() {
        return documentLanguageVersionVersion;
    }

    public void setDocumentLanguageVersionVersion(int documentLanguageVersionVersion) {
        this.documentLanguageVersionVersion = documentLanguageVersionVersion;
    }

    public String getDocumentLanguageVersionTitle() {
        return documentLanguageVersionTitle;
    }

    public void setDocumentLanguageVersionTitle(String documentLanguageVersionTitle) {
        this.documentLanguageVersionTitle = documentLanguageVersionTitle;
    }

    public String getDocumentLanguageVersionLanguageKey() {
        return documentLanguageVersionLanguageKey;
    }

    public void setDocumentLanguageVersionLanguageKey(String documentLanguageVersionLanguageKey) {
        this.documentLanguageVersionLanguageKey = documentLanguageVersionLanguageKey;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public List<Long> getMentionedAccountIds() {
        return mentionedAccountIds;
    }

    public void setMentionedAccountIds(List<Long> mentionedAccountIds) {
        this.mentionedAccountIds = mentionedAccountIds;
    }

}
