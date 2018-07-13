package com.matterial.mtr.api.object;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

import com.matterial.mtr.api.object.meta.EntityType;
import com.matterial.mtr.api.object.meta.Identifiable;
import com.matterial.mtr.api.object.meta.Indexable;

/**
 * Container representing a person
 */
@XmlRootElement
public class Person extends ListResultEntry implements Identifiable, Indexable {

    private static final long serialVersionUID = 1L;

    public static final String INDEX_TYPE_NAME = Person.class.getSimpleName().toLowerCase();

    public static final String INDEX_FIELD_ACCOUNT_ID = "accountId";
    public static final String INDEX_FIELD_ACCOUNT_LOGIN = "accountLogin";
    public static final String INDEX_FIELD_SUPERIOR_ACCOUNT_ID = "superiorAccountId";
    public static final String INDEX_FIELD_ACCOUNT_CREATE_TIME_IN_SECONDS = "accountCreateTimeInSeconds";
    public static final String INDEX_FIELD_ACCOUNT_LAST_LOGIN_IN_SECONDS = "accountLastLoginInSeconds";
    public static final String INDEX_FIELD_INSTANCE_OWNER = "instanceOwner";
    public static final String INDEX_FIELD_LIMITED = "limited";

    public static final String INDEX_FIELD_CONTACT_ID = "contactId";
    public static final String INDEX_FIELD_FIRST_NAME = "firstName";
    public static final String INDEX_FIELD_LAST_NAME = "lastName";
    public static final String INDEX_FIELD_POSITION = "position";
    public static final String INDEX_FIELD_BIRTHDAY_IN_SECONDS = "birthdayInSeconds";
    public static final String INDEX_FIELD_GENDER = "gender";

    public static final String INDEX_FIELD_CONTACT_IMAGE = "contactImage";
    public static final String INDEX_FIELD_ROLE_PERSONAL = "rolePersonal";
    public static final String INDEX_FIELD_ROLE_CLIENT_GATE = "roleClientGate";

    public static final String INDEX_FIELD_ROLES_FUNCTIONAL = "rolesFunctional";
    public static final String INDEX_FIELD_ROLES_CONTENT = "rolesContent";
    public static final String INDEX_FIELD_ROLES_REVIEW = "rolesReview";
    public static final String INDEX_FIELD_CLIENTS = "clients";
    public static final String INDEX_FIELD_ADDRESSES = "addresses";
    public static final String INDEX_FIELD_COMMUNICATION_DATA = "communicationData";
    public static final String INDEX_FIELD_CONTACT_IMAGES = "contactImages";


    private long accountId;
    private String accountLogin;
    private Long superiorAccountId;
    private Long accountCreateTimeInSeconds;
    private Long accountLastLoginInSeconds;
    private boolean instanceOwner;
    private boolean limited;

    private long contactId;
    private String firstName;
    private String lastName;
    private String position;
    private Long birthdayInSeconds;
    private Integer gender;

    private ContactImage contactImage;
    private Role rolePersonal;
    private Role roleClientGate;

    private List<Role> rolesFunctional;
    private List<Role> rolesContent;
    private List<Role> rolesReview;
    private List<Client> clients;
    private List<Address> addresses;
    private List<CommunicationData> communicationData;
    private List<ContactImage> contactImages;

    public Person() {
        // *** empty;
    }

    /**
     * Constructor
     */
    public Person(long accountId,
                  String accountLogin,
                  Long superiorAccountId,
                  Long accountCreateTimeInSeconds,
                  Long accountLastLoginInSeconds,
                  Boolean instanceOwner,
                  Boolean limited,
                  long contactId,
                  String firstName,
                  String lastName,
                  String position,
                  Long birthdayInSeconds,
                  Integer gender) {
        this.accountId = accountId;
        this.accountLogin = accountLogin;
        this.superiorAccountId = superiorAccountId;
        this.accountCreateTimeInSeconds = accountCreateTimeInSeconds;
        this.accountLastLoginInSeconds = accountLastLoginInSeconds;
        // *** no acount => no instance-owner;
        this.instanceOwner = instanceOwner==null?false:instanceOwner;
        this.limited = limited==null?false:limited;
        this.contactId = contactId;
        this.firstName = "";
        if(firstName != null) {
            this.firstName = firstName;
        }
        this.lastName = lastName;
        this.position = position;
        this.birthdayInSeconds = birthdayInSeconds;
        this.gender = gender;
    }

    public Person(long accountId, long contactId) {
        this.accountId = accountId;
        this.contactId = contactId;
    }

    /**
     * alias for accountId;
     */
    @Override
    public long getId() {
        return this.getAccountId();
    }

    @Override
    public void setId(long id) {
        this.setAccountId(id);
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public String getAccountLogin() {
        return accountLogin;
    }

    public void setAccountLogin(String accountLogin) {
        this.accountLogin = accountLogin;
    }

    public Long getSuperiorAccountId() {
        return superiorAccountId;
    }

    public void setSuperiorAccountId(Long superiorAccountId) {
        this.superiorAccountId = superiorAccountId;
    }

    public Long getAccountCreateTimeInSeconds() {
        return accountCreateTimeInSeconds;
    }

    public void setAccountCreateTimeInSeconds(Long accountCreateTimeInSeconds) {
        this.accountCreateTimeInSeconds = accountCreateTimeInSeconds;
    }

    public Long getAccountLastLoginInSeconds() {
        return accountLastLoginInSeconds;
    }

    public void setAccountLastLoginInSeconds(Long accountLastLoginInSeconds) {
        this.accountLastLoginInSeconds = accountLastLoginInSeconds;
    }

    public boolean isInstanceOwner() {
        return this.instanceOwner;
    }

    public void setInstanceOwner(boolean instanceOwner) {
        this.instanceOwner = instanceOwner;
    }

    public boolean isLimited() {
        return this.limited;
    }

    public void setLimited(boolean limited) {
        this.limited = limited;
    }

    public long getContactId() {
        return contactId;
    }

    public void setContactId(long contactId) {
        this.contactId = contactId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Long getBirthdayInSeconds() {
        return birthdayInSeconds;
    }

    public void setBirthdayInSeconds(Long birthdayInSeconds) {
        this.birthdayInSeconds = birthdayInSeconds;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public ContactImage getContactImage() {
        return contactImage;
    }

    public void setContactImage(ContactImage contactImage) {
        this.contactImage = contactImage;
    }

    public Role getRolePersonal() {
        return rolePersonal;
    }

    public void setRolePersonal(Role rolePersonal) {
        this.rolePersonal = rolePersonal;
    }

    public Role getRoleClientGate() {
        return roleClientGate;
    }

    public void setRoleClientGate(Role roleClientGate) {
        this.roleClientGate = roleClientGate;
    }

    public List<Role> getRolesFunctional() {
        if(this.rolesFunctional == null) {
            this.rolesFunctional = new ArrayList<>();
        }
        return rolesFunctional;
    }

    public void setRolesFunctional(List<Role> rolesFunctional) {
        this.rolesFunctional = rolesFunctional;
    }

    public List<Role> getRolesContent() {
        if(this.rolesContent == null) {
            this.rolesContent = new ArrayList<>();
        }
        return rolesContent;
    }

    public void setRolesContent(List<Role> rolesContent) {
        this.rolesContent = rolesContent;
    }

    public List<Role> getRolesReview() {
        if(this.rolesReview == null) {
            this.rolesReview = new ArrayList<>();
        }
        return rolesReview;
    }

    public void setRolesReview(List<Role> rolesReview) {
        this.rolesReview = rolesReview;
    }

    public List<Client> getClients() {
        if(this.clients == null) {
            this.clients = new ArrayList<>();
        }
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public List<Address> getAddresses() {
        if(this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<CommunicationData> getCommunicationData() {
        if(this.communicationData == null) {
            this.communicationData = new ArrayList<>();
        }
        return communicationData;
    }

    public void setCommunicationData(List<CommunicationData> communicationData) {
        this.communicationData = communicationData;
    }

    public List<ContactImage> getContactImages() {
        if(this.contactImages == null) {
            this.contactImages = new ArrayList<>();
        }
        return contactImages;
    }

    public void setContactImages(List<ContactImage> contactImages) {
        this.contactImages = contactImages;
    }

    public void addRole(Role r) {
        if(r != null) {
            if(r.getEntityTypeId() == EntityType.ROLE_CLIENT_GATE) {
                this.setRoleClientGate(r);
            }
            else if(r.getEntityTypeId() == EntityType.ROLE_CONTENT) {
                this.getRolesContent().add(r);
            }
            else if(r.getEntityTypeId() == EntityType.ROLE_FUNCTIONAL) {
                this.getRolesFunctional().add(r);
            }
            else if(r.getEntityTypeId() == EntityType.ROLE_PERSONAL) {
                this.setRolePersonal(r);
            }
            else if(r.getEntityTypeId() == EntityType.ROLE_REVIEW) {
                this.getRolesReview().add(r);
            }
        }
    }

    @Override
    public String indexId() {
        return this.getAccountId()+"";
    }

    /**
     * Return a minimal/light indexMap only
     */
    public Map<String, Object> indexMapLight() {
        Map<String, Object> indexMap = new HashMap<>();
        indexMap.put("accountId", this.getAccountId());
        indexMap.put("contactId", this.getContactId());
        return indexMap;
    }

    @Override
    public Map<String, Object> indexMap() {
        // *** overwritten, to set doNotIndexKeys;
        return this.indexMap(Arrays.asList("contactImages"));
    }

    @Override
    public Indexable.Language indexLanguage() {
        return null;
    }

    @Override
    public String indexAutocompleteInput() {
        return null;
    }

    /**
     * @return firstName lastName
     */
    public String toName() {
        StringBuilder buffer = new StringBuilder();
        if(this.getFirstName() != null && !this.getFirstName().trim().isEmpty()) {
            buffer.append(this.getFirstName().trim());
            buffer.append(" ");
        }
        if(this.getLastName() != null && !this.getLastName().trim().isEmpty()) {
            buffer.append(this.getLastName().trim());
        }
        // *** empty buffer;
        if(buffer.length() == 0) {
            buffer.append(this.getAccountLogin());
        }
        return buffer.toString();
    }

    @Override
    public String indexTypeName() {
        return INDEX_TYPE_NAME;
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("FirstName: ");
        buffer.append(this.getFirstName());
        buffer.append("\n");
        buffer.append("LastName: ");
        buffer.append(this.getLastName());
        buffer.append("\n");
        buffer.append("AccountLogin: ");
        buffer.append(this.getAccountLogin());
        buffer.append("\n");
        return buffer.toString();
    }

}
