package com.matterial.mtr.api.object;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * <strong>PersonContainer</strong>
 */
@XmlRootElement
public class PersonContainer implements Serializable {

    private static final long serialVersionUID = 1L;

    private Person person;
    /** key: instance/datasource, value: list of clients */
    private Map<String, List<PersonClientContainer>> instanceWithPersonClientContainers;
    private boolean updatePosition;
    private boolean updateName;
    private boolean updateAddress;
    private boolean updateCommunicationData;
    private boolean impersonate;

    public PersonContainer() {
        // *** do nothing;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Map<String, List<PersonClientContainer>> getInstanceWithPersonClientContainers() {
        return instanceWithPersonClientContainers;
    }

    public void setInstanceWithPersonClientContainers(Map<String, List<PersonClientContainer>> instanceWithPersonClientContainers) {
        this.instanceWithPersonClientContainers = instanceWithPersonClientContainers;
    }

    public List<PersonClientContainer> loadPersonClientContainers(String instance) {
        if(this.instanceWithPersonClientContainers == null) {
            this.instanceWithPersonClientContainers = new HashMap<>();
        }
        return this.instanceWithPersonClientContainers.get(instance);
    }

    public boolean isUpdatePosition() {
        return updatePosition;
    }

    public void setUpdatePosition(boolean updatePosition) {
        this.updatePosition = updatePosition;
    }

    public boolean isUpdateName() {
        return updateName;
    }

    public void setUpdateName(boolean updateName) {
        this.updateName = updateName;
    }

    public boolean isUpdateAddress() {
        return updateAddress;
    }

    public void setUpdateAddress(boolean updateAddress) {
        this.updateAddress = updateAddress;
    }

    public boolean isUpdateCommunicationData() {
        return updateCommunicationData;
    }

    public void setUpdateCommunicationData(boolean updateCommunicationData) {
        this.updateCommunicationData = updateCommunicationData;
    }

    public boolean isImpersonate() {
        return impersonate;
    }

    public void setImpersonate(boolean impersonate) {
        this.impersonate = impersonate;
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        if(this.person != null) {
            buffer.append(this.person.toString());
        }
        return buffer.toString();
    }

}
