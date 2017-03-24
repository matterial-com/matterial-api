package com.matterial.mtr.api.object;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.matterial.mtr.api.object.meta.Identifiable;

/**
 * <strong>SavedSearch</strong>
 */
@XmlRootElement
public class SavedSearch implements Identifiable {
    
    private static final long serialVersionUID = 1L;
    
    private long id;
    private String name;
    private int dashboardPrio;
    private boolean global;
    private List<SavedSearchParameter> params;
    // *** temp-attributes;
    private long paramId;
    private String paramKey;
    private String paramValue;
    
    public SavedSearch() {
        // *** empty;
    }
    
    public SavedSearch(long id, String name, int dashboardPrio, boolean global) {
        this.id = id;
        this.name = name;
        this.dashboardPrio = dashboardPrio;
        this.global = global;
    }

    /**
     * constructor used to load from db: removes "entity-key-prefix" of all keys;
     */
    public SavedSearch(Number id, String name, Number dashboardPrio, Number accountId, Number paramId, String paramKey, String paramValue) {
        this((id==null)?0L:id.longValue(), name, (dashboardPrio==null)?0:dashboardPrio.intValue(), (accountId == null));
        this.paramId = (paramId==null)?0L:paramId.longValue();
        this.paramKey = paramKey;
        this.paramValue = paramValue;
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
    
    public int getDashboardPrio() {
        return dashboardPrio;
    }

    public void setDashboardPrio(int dashboardPrio) {
        this.dashboardPrio = dashboardPrio;
    }
    
    public boolean isGlobal() {
        return global;
    }

    public void setGlobal(boolean global) {
        this.global = global;
    }
    
    public List<SavedSearchParameter> getParams() {
        if(params == null) {
            this.params = new ArrayList<>();
        }
        return params;
    }
    
    public void setParams(List<SavedSearchParameter> params) {
        this.params = params;
    }
    
    public static Collection<SavedSearch> groupById(List<Object[]> rows) {
        // *** key: id, value: SavedSearch;
        LinkedHashMap<Long, SavedSearch> map = new LinkedHashMap<>();
        //Map<Long, SavedSearch> map = new HashMap<>();
        if(rows != null) {
            for (Object[] row : rows) {
                if(row != null && row.length == 7) {
                    SavedSearch entry = new SavedSearch((Number)row[0], 
                                                        (String)row[1], 
                                                        (Number)row[2],
                                                        (Number)row[3], 
                                                        (Number)row[4], 
                                                        (String)row[5], 
                                                        (String)row[6]);
                    SavedSearch savedSearch = map.get(entry.getId());
                    if(savedSearch == null) {
                        savedSearch = new SavedSearch(entry.getId(), entry.getName(), entry.getDashboardPrio(), entry.isGlobal());
                        map.put(entry.getId(), savedSearch);
                    }
                    savedSearch.getParams().add(new SavedSearchParameter(entry.paramId, entry.paramKey, entry.paramValue));
                }
            }
        }
        return map.values();
    }

}
