package com.matterial.mtr.api.object;

import java.util.ArrayList;
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
public class Person extends ListResultEntry implements Identifiable, Indexable{
    
    private static final long serialVersionUID = 1L;
    /**
     * typeNAme to be used in index
     */
    public static final String INDEX_TYPE_NAME  = "person";
    
    private long accountId;
    private String accountLogin;
    private Long superiorAccountId;
    private Long accountCreateTimeInSeconds;
    private Long accountLastLoginInSeconds;
    
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
     * @param accountId
     * @param accountLogin
     * @param superiorAccountId
     * @param accountCreateTimeInSeconds
     * @param accountLastLoginInSeconds
     * @param contactId
     * @param firstName
     * @param lastName
     * @param title
     * @param birthdayInSeconds
     * @param gender 
     */
    public Person(long accountId, String accountLogin, Long superiorAccountId, Long accountCreateTimeInSeconds, Long accountLastLoginInSeconds, long contactId, String firstName, String lastName, String position, Long birthdayInSeconds, Integer gender) {
        this.accountId = accountId;
        this.accountLogin = accountLogin;
        this.superiorAccountId = superiorAccountId;
        this.accountCreateTimeInSeconds = accountCreateTimeInSeconds;
        this.accountLastLoginInSeconds = accountLastLoginInSeconds;
        this.contactId = contactId;
        this.firstName = firstName;
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

    @Override
    public Map<String, Object> indexMap() {
        Map<String, Object> indexMap = new HashMap<>();
        indexMap.put("accountCreateTimeInSeconds", this.getAccountCreateTimeInSeconds());
        indexMap.put("accountId", this.getAccountId());
        indexMap.put("accountLastLoginInSeconds", this.getAccountLastLoginInSeconds());
        indexMap.put("accountLogin", this.getAccountLogin());
        indexMap.put("birthdayInSeconds", this.getBirthdayInSeconds());
        
        List<Map<String, Object>> addressMap = new ArrayList<>();
        if(this.getAddresses() != null){
            this.getAddresses().stream().forEach((add) -> {
                addressMap.add(add.indexMap());
            });
        }
        indexMap.put("addresses", addressMap);
        
        List<Map<String, Object>> communicationDataMap = new ArrayList<>();
        if(this.getCommunicationData() != null){
            this.getCommunicationData().stream().forEach((cd) -> {
                communicationDataMap.add(cd.indexMap());
            });
        }
        indexMap.put("communicationData", communicationDataMap);
        
        if(this.getContactImage() != null){
            indexMap.put("contactImage", this.getContactImage().indexMap());
        }
        
        indexMap.put("contactId", this.getContactId());
        indexMap.put("firstName", this.getFirstName());
        indexMap.put("gender", this.getGender());
        indexMap.put("lastName", this.getLastName());
        indexMap.put("superiorAccountId", this.getSuperiorAccountId());
        indexMap.put("position", this.getPosition());
        
        if(this.getRolePersonal() != null){
            indexMap.put("rolePersonal", this.getRolePersonal().indexMap());
        }
        if(this.getRoleClientGate() != null){
            indexMap.put("roleClientGate", this.getRoleClientGate().indexMap());
        }
    
        List<Map<String, Object>> rolesFunctionalMap = new ArrayList<>();
        if(this.getRolesFunctional()!= null){
            this.getRolesFunctional().stream().forEach((role) -> {
                rolesFunctionalMap.add(role.indexMap());
            });
        }
        indexMap.put("rolesFunctional", rolesFunctionalMap);
    
        List<Map<String, Object>> rolesContentMap = new ArrayList<>();
        if(this.getRolesContent()!= null){
            this.getRolesContent().stream().forEach((role) -> {
                rolesContentMap.add(role.indexMap());
            });
        }
        indexMap.put("rolesContent", rolesContentMap);
    
        List<Map<String, Object>> rolesReviewMap = new ArrayList<>();
        if(this.getRolesReview()!= null){
            this.getRolesReview().stream().forEach((role) -> {
                rolesReviewMap.add(role.indexMap());
            });
        }
        indexMap.put("rolesReview", rolesReviewMap);
        
        List<Map<String, Object>> clientsMap = new ArrayList<>();
        if(this.getClients()!= null){
            this.getClients().stream().forEach((client) -> {
                clientsMap.add(client.indexMap());
            });
        }
        indexMap.put("clients", clientsMap);
        
        return indexMap;
    }

    @Override
    public Indexable.Language indexLanguage() {
        return null;
    }

    @Override
    public String indexTypeName() {
        return INDEX_TYPE_NAME;
    }

    @Override
    public String indexAutocompleteInput() {
        return null;
    }
}
