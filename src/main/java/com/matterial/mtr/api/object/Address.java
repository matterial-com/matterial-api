package com.matterial.mtr.api.object;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

import com.matterial.mtr.api.object.meta.Identifiable;
import com.matterial.mtr.api.object.meta.IndexableChild;

/**
 * Container representing an address
 */
@XmlRootElement
public class Address implements Identifiable, IndexableChild {
    
    private static final long serialVersionUID = 1L;
    
    /** indicates that a commdata was imported from an external system (ldap) */
    public static final short STATUS_BIT_IMPORTED = 1 << 0;   // 1

    private long id;
    private String postalCode;
    private String city;
    private String country;
    private String street;
    private String houseNumber;
    private boolean imported;

    /**
     * Empty Constructor
     */
    public Address() {
        // *** empty;
    }
    
    /**
     * Constructor
     * @param id
     * @param postalCode
     * @param city
     * @param country
     * @param street
     * @param houseNumber
     * @param status 
     */
    public Address(long id, String postalCode, String city, String country, String street, String houseNumber, int status) {
        this.id = id;
        this.postalCode = postalCode;
        this.city = city;
        this.country = country;
        this.street = street;
        this.houseNumber = houseNumber;
        // *** status;
        if((status & STATUS_BIT_IMPORTED) > 0) {
            this.setImported(true);
        }    
    }
    
    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public boolean isImported() {
        return imported;
    }

    public void setImported(boolean imported) {
        this.imported = imported;
    }
    
    /**
     * @return true, if no attributes are filled
     */
    public boolean empty() {
        return ((postalCode == null  || postalCode.trim().length() == 0) &&
                (city == null        || city.trim().length() == 0) &&
                (country == null     || country.trim().length() == 0) &&
                (street == null      || street.trim().length() == 0) && 
                (houseNumber == null || houseNumber.trim().length() == 0)); 
    }

    @Override
    public Map<String, Object> indexMap() {
        Map<String, Object> indexMap = new HashMap<>();
        indexMap.put("id", this.getId());
        indexMap.put("postalCode", this.getPostalCode());
        indexMap.put("city", this.getCity());
        indexMap.put("country", this.getCountry());
        indexMap.put("street", this.getStreet());
        indexMap.put("houseNumber", this.getHouseNumber());
        indexMap.put("imported", this.isImported());
        return indexMap;
    }
}
