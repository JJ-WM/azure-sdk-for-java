// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.models.BackupSchedule;
import com.azure.resourcemanager.appservice.models.DatabaseBackupSetting;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * BackupRequest resource specific properties.
 */
@Fluent
public final class BackupRequestProperties {
    /*
     * Name of the backup.
     */
    @JsonProperty(value = "backupName")
    private String backupName;

    /*
     * True if the backup schedule is enabled (must be included in that case), false if the backup schedule should be
     * disabled.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /*
     * SAS URL to the container.
     */
    @JsonProperty(value = "storageAccountUrl", required = true)
    private String storageAccountUrl;

    /*
     * Schedule for the backup if it is executed periodically.
     */
    @JsonProperty(value = "backupSchedule")
    private BackupSchedule backupSchedule;

    /*
     * Databases included in the backup.
     */
    @JsonProperty(value = "databases")
    private List<DatabaseBackupSetting> databases;

    /**
     * Creates an instance of BackupRequestProperties class.
     */
    public BackupRequestProperties() {
    }

    /**
     * Get the backupName property: Name of the backup.
     * 
     * @return the backupName value.
     */
    public String backupName() {
        return this.backupName;
    }

    /**
     * Set the backupName property: Name of the backup.
     * 
     * @param backupName the backupName value to set.
     * @return the BackupRequestProperties object itself.
     */
    public BackupRequestProperties withBackupName(String backupName) {
        this.backupName = backupName;
        return this;
    }

    /**
     * Get the enabled property: True if the backup schedule is enabled (must be included in that case), false if the
     * backup schedule should be disabled.
     * 
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: True if the backup schedule is enabled (must be included in that case), false if the
     * backup schedule should be disabled.
     * 
     * @param enabled the enabled value to set.
     * @return the BackupRequestProperties object itself.
     */
    public BackupRequestProperties withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the storageAccountUrl property: SAS URL to the container.
     * 
     * @return the storageAccountUrl value.
     */
    public String storageAccountUrl() {
        return this.storageAccountUrl;
    }

    /**
     * Set the storageAccountUrl property: SAS URL to the container.
     * 
     * @param storageAccountUrl the storageAccountUrl value to set.
     * @return the BackupRequestProperties object itself.
     */
    public BackupRequestProperties withStorageAccountUrl(String storageAccountUrl) {
        this.storageAccountUrl = storageAccountUrl;
        return this;
    }

    /**
     * Get the backupSchedule property: Schedule for the backup if it is executed periodically.
     * 
     * @return the backupSchedule value.
     */
    public BackupSchedule backupSchedule() {
        return this.backupSchedule;
    }

    /**
     * Set the backupSchedule property: Schedule for the backup if it is executed periodically.
     * 
     * @param backupSchedule the backupSchedule value to set.
     * @return the BackupRequestProperties object itself.
     */
    public BackupRequestProperties withBackupSchedule(BackupSchedule backupSchedule) {
        this.backupSchedule = backupSchedule;
        return this;
    }

    /**
     * Get the databases property: Databases included in the backup.
     * 
     * @return the databases value.
     */
    public List<DatabaseBackupSetting> databases() {
        return this.databases;
    }

    /**
     * Set the databases property: Databases included in the backup.
     * 
     * @param databases the databases value to set.
     * @return the BackupRequestProperties object itself.
     */
    public BackupRequestProperties withDatabases(List<DatabaseBackupSetting> databases) {
        this.databases = databases;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (storageAccountUrl() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property storageAccountUrl in model BackupRequestProperties"));
        }
        if (backupSchedule() != null) {
            backupSchedule().validate();
        }
        if (databases() != null) {
            databases().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(BackupRequestProperties.class);
}
