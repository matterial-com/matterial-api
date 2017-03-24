package com.matterial.mtr.api.object;

import javax.xml.bind.annotation.XmlRootElement;

import com.matterial.mtr.api.object.meta.Identifiable;

/**
 * Container representing a language
 * @author Philipp
 */
@XmlRootElement
public class Language implements Identifiable {
    
    private static final long serialVersionUID = 1L;
    
    public static final long ANY = -1L;
    public static final long DE = 1L;
    public static final long EN = 2L;
    public static final long FR = 3L;
    public static final long IT = 4L;
    public static final long ES = 5L;
    public static final long SV = 6L;
    public static final long ZH = 7L;
    public static final long EU = 8L;
    
    private long id;
    private String name;
    private String i18nKey;
    private boolean active;
    private int prio;

    public Language(){}
    
    public Language(long id, String name, String i18nKey, boolean active, int prio) {
        this.id = id;
        this.name = name;
        this.i18nKey = i18nKey;
        this.active = active;
        this.prio = prio;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getI18nKey() {
        return i18nKey;
    }

    public void setI18nKey(String i18nKey) {
        this.i18nKey = i18nKey;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getPrio() {
        return prio;
    }
    
    public void setPrio(int prio) {
        this.prio = prio;
    }

}
