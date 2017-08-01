package com.matterial.mtr.api.object;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * <strong>WildflyDataSource</strong>
 */
@XmlRootElement
public class WildflyDataSource implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private String dataSourceDisplayName;
    private String dataSourceReference;
    private Integer dataSourceActivationDays;
    private String connectionUrl;
    private String driverClass;
    private String driver;
    private String userName;
    private String password;
    private String checkValidConnectionSql;
    private int minPoolSize;
    private int maxPoolSize;
    private boolean poolPrefill;
    
    
    public WildflyDataSource() {
        this.checkValidConnectionSql = "SELECT 1";
        this.minPoolSize = 5;
        this.maxPoolSize = 15;
    }
    
    public WildflyDataSource(String dataSourceDisplayName,
                             String dataSourceReference,
                             Integer dataSourceActivationDays,
                             String connectionUrl,
                             String driverClass,
                             String driver,
                             String userName,
                             String password,
                             String checkValidConnectionSql,
                             int minPoolSize,
                             int maxPoolSize,
                             boolean poolPrefill) {
        // *** init with some defaults;
        this();
        this.dataSourceDisplayName = dataSourceDisplayName;
        this.dataSourceReference = dataSourceReference;
        this.dataSourceActivationDays = dataSourceActivationDays;
        this.connectionUrl = connectionUrl;
        this.driverClass = driverClass;
        this.driver = driver;
        this.userName = userName;
        this.password = password;
        if(checkValidConnectionSql != null && !checkValidConnectionSql.trim().isEmpty()) {
            this.checkValidConnectionSql = checkValidConnectionSql.trim();
        }
        if(minPoolSize > 0) {
            this.minPoolSize = minPoolSize;
        }
        if(maxPoolSize > 0) {
            this.maxPoolSize = maxPoolSize;
        }
        this.poolPrefill = poolPrefill;
    }
    
    public String getDataSourceDisplayName() {
        return dataSourceDisplayName;
    }
    
    public void setDataSourceDisplayName(String dataSourceDisplayName) {
        this.dataSourceDisplayName = dataSourceDisplayName;
    }
    
    public String getDataSourceReference() {
        return dataSourceReference;
    }
    
    public void setDataSourceReference(String dataSourceReference) {
        this.dataSourceReference = dataSourceReference;
    }
    
    public Integer getDataSourceActivationDays() {
        return this.dataSourceActivationDays;
    }
    
    public void setDataSourceActivationDays(Integer dataSourceActivationDays) {
        this.dataSourceActivationDays = dataSourceActivationDays;
    }
    
    public String getConnectionUrl() {
        return connectionUrl;
    }
    
    public void setConnectionUrl(String connectionUrl) {
        this.connectionUrl = connectionUrl;
    }
    
    public String getDriverClass() {
        return driverClass;
    }
    
    public void setDriverClass(String driverClass) {
        this.driverClass = driverClass;
    }
    
    public String getDriver() {
        return driver;
    }
    
    public void setDriver(String driver) {
        this.driver = driver;
    }
    
    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getCheckValidConnectionSql() {
        return checkValidConnectionSql;
    }
    
    public void setCheckValidConnectionSql(String checkValidConnectionSql) {
        this.checkValidConnectionSql = checkValidConnectionSql;
    }

    public int getMinPoolSize() {
        return minPoolSize;
    }

    public void setMinPoolSize(int minPoolSize) {
        this.minPoolSize = minPoolSize;
    }
    
    public int getMaxPoolSize() {
        return maxPoolSize;
    }

    public void setMaxPoolSize(int maxPoolSize) {
        this.maxPoolSize = maxPoolSize;
    }

    public boolean isPoolPrefill() {
        return poolPrefill;
    }
    
    public void setPoolPrefill(boolean poolPrefill) {
        this.poolPrefill = poolPrefill;
    }
    
    @Override
    public String toString() {
        return "WildflyDataSource [dataSourceDisplayName=" + dataSourceDisplayName + 
               ", dataSourceReference=" + dataSourceReference + ", connectionUrl=" + connectionUrl + 
               ", driverClass=" + driverClass + ", driver=" + driver + 
               ", userName=" + userName + ", password=***]";
    }

}
