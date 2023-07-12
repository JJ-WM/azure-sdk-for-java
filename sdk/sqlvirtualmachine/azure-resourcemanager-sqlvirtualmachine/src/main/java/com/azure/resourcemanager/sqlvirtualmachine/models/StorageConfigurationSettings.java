// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Storage Configurations for SQL Data, Log and TempDb. */
@Fluent
public final class StorageConfigurationSettings {
    /*
     * SQL Server Data Storage Settings.
     */
    @JsonProperty(value = "sqlDataSettings")
    private SqlStorageSettings sqlDataSettings;

    /*
     * SQL Server Log Storage Settings.
     */
    @JsonProperty(value = "sqlLogSettings")
    private SqlStorageSettings sqlLogSettings;

    /*
     * SQL Server TempDb Storage Settings.
     */
    @JsonProperty(value = "sqlTempDbSettings")
    private SqlTempDbSettings sqlTempDbSettings;

    /*
     * SQL Server SystemDb Storage on DataPool if true.
     */
    @JsonProperty(value = "sqlSystemDbOnDataDisk")
    private Boolean sqlSystemDbOnDataDisk;

    /*
     * Disk configuration to apply to SQL Server.
     */
    @JsonProperty(value = "diskConfigurationType")
    private DiskConfigurationType diskConfigurationType;

    /*
     * Storage workload type.
     */
    @JsonProperty(value = "storageWorkloadType")
    private StorageWorkloadType storageWorkloadType;

    /** Creates an instance of StorageConfigurationSettings class. */
    public StorageConfigurationSettings() {
    }

    /**
     * Get the sqlDataSettings property: SQL Server Data Storage Settings.
     *
     * @return the sqlDataSettings value.
     */
    public SqlStorageSettings sqlDataSettings() {
        return this.sqlDataSettings;
    }

    /**
     * Set the sqlDataSettings property: SQL Server Data Storage Settings.
     *
     * @param sqlDataSettings the sqlDataSettings value to set.
     * @return the StorageConfigurationSettings object itself.
     */
    public StorageConfigurationSettings withSqlDataSettings(SqlStorageSettings sqlDataSettings) {
        this.sqlDataSettings = sqlDataSettings;
        return this;
    }

    /**
     * Get the sqlLogSettings property: SQL Server Log Storage Settings.
     *
     * @return the sqlLogSettings value.
     */
    public SqlStorageSettings sqlLogSettings() {
        return this.sqlLogSettings;
    }

    /**
     * Set the sqlLogSettings property: SQL Server Log Storage Settings.
     *
     * @param sqlLogSettings the sqlLogSettings value to set.
     * @return the StorageConfigurationSettings object itself.
     */
    public StorageConfigurationSettings withSqlLogSettings(SqlStorageSettings sqlLogSettings) {
        this.sqlLogSettings = sqlLogSettings;
        return this;
    }

    /**
     * Get the sqlTempDbSettings property: SQL Server TempDb Storage Settings.
     *
     * @return the sqlTempDbSettings value.
     */
    public SqlTempDbSettings sqlTempDbSettings() {
        return this.sqlTempDbSettings;
    }

    /**
     * Set the sqlTempDbSettings property: SQL Server TempDb Storage Settings.
     *
     * @param sqlTempDbSettings the sqlTempDbSettings value to set.
     * @return the StorageConfigurationSettings object itself.
     */
    public StorageConfigurationSettings withSqlTempDbSettings(SqlTempDbSettings sqlTempDbSettings) {
        this.sqlTempDbSettings = sqlTempDbSettings;
        return this;
    }

    /**
     * Get the sqlSystemDbOnDataDisk property: SQL Server SystemDb Storage on DataPool if true.
     *
     * @return the sqlSystemDbOnDataDisk value.
     */
    public Boolean sqlSystemDbOnDataDisk() {
        return this.sqlSystemDbOnDataDisk;
    }

    /**
     * Set the sqlSystemDbOnDataDisk property: SQL Server SystemDb Storage on DataPool if true.
     *
     * @param sqlSystemDbOnDataDisk the sqlSystemDbOnDataDisk value to set.
     * @return the StorageConfigurationSettings object itself.
     */
    public StorageConfigurationSettings withSqlSystemDbOnDataDisk(Boolean sqlSystemDbOnDataDisk) {
        this.sqlSystemDbOnDataDisk = sqlSystemDbOnDataDisk;
        return this;
    }

    /**
     * Get the diskConfigurationType property: Disk configuration to apply to SQL Server.
     *
     * @return the diskConfigurationType value.
     */
    public DiskConfigurationType diskConfigurationType() {
        return this.diskConfigurationType;
    }

    /**
     * Set the diskConfigurationType property: Disk configuration to apply to SQL Server.
     *
     * @param diskConfigurationType the diskConfigurationType value to set.
     * @return the StorageConfigurationSettings object itself.
     */
    public StorageConfigurationSettings withDiskConfigurationType(DiskConfigurationType diskConfigurationType) {
        this.diskConfigurationType = diskConfigurationType;
        return this;
    }

    /**
     * Get the storageWorkloadType property: Storage workload type.
     *
     * @return the storageWorkloadType value.
     */
    public StorageWorkloadType storageWorkloadType() {
        return this.storageWorkloadType;
    }

    /**
     * Set the storageWorkloadType property: Storage workload type.
     *
     * @param storageWorkloadType the storageWorkloadType value to set.
     * @return the StorageConfigurationSettings object itself.
     */
    public StorageConfigurationSettings withStorageWorkloadType(StorageWorkloadType storageWorkloadType) {
        this.storageWorkloadType = storageWorkloadType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sqlDataSettings() != null) {
            sqlDataSettings().validate();
        }
        if (sqlLogSettings() != null) {
            sqlLogSettings().validate();
        }
        if (sqlTempDbSettings() != null) {
            sqlTempDbSettings().validate();
        }
    }
}
