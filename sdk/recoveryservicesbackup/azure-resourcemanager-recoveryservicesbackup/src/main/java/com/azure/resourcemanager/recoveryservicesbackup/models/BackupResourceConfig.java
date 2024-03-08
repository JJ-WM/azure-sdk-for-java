// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The resource storage details.
 */
@Fluent
public final class BackupResourceConfig {
    /*
     * Storage type
     */
    @JsonProperty(value = "storageModelType")
    private StorageType storageModelType;

    /*
     * Storage type.
     */
    @JsonProperty(value = "storageType")
    private StorageType storageType;

    /*
     * Locked or Unlocked. Once a machine is registered against a resource, the storageTypeState is always Locked.
     */
    @JsonProperty(value = "storageTypeState")
    private StorageTypeState storageTypeState;

    /*
     * Opt in details of Cross Region Restore feature.
     */
    @JsonProperty(value = "crossRegionRestoreFlag")
    private Boolean crossRegionRestoreFlag;

    /*
     * Vault Dedup state
     */
    @JsonProperty(value = "dedupState")
    private DedupState dedupState;

    /*
     * Vault x-cool state
     */
    @JsonProperty(value = "xcoolState")
    private XcoolState xcoolState;

    /**
     * Creates an instance of BackupResourceConfig class.
     */
    public BackupResourceConfig() {
    }

    /**
     * Get the storageModelType property: Storage type.
     * 
     * @return the storageModelType value.
     */
    public StorageType storageModelType() {
        return this.storageModelType;
    }

    /**
     * Set the storageModelType property: Storage type.
     * 
     * @param storageModelType the storageModelType value to set.
     * @return the BackupResourceConfig object itself.
     */
    public BackupResourceConfig withStorageModelType(StorageType storageModelType) {
        this.storageModelType = storageModelType;
        return this;
    }

    /**
     * Get the storageType property: Storage type.
     * 
     * @return the storageType value.
     */
    public StorageType storageType() {
        return this.storageType;
    }

    /**
     * Set the storageType property: Storage type.
     * 
     * @param storageType the storageType value to set.
     * @return the BackupResourceConfig object itself.
     */
    public BackupResourceConfig withStorageType(StorageType storageType) {
        this.storageType = storageType;
        return this;
    }

    /**
     * Get the storageTypeState property: Locked or Unlocked. Once a machine is registered against a resource, the
     * storageTypeState is always Locked.
     * 
     * @return the storageTypeState value.
     */
    public StorageTypeState storageTypeState() {
        return this.storageTypeState;
    }

    /**
     * Set the storageTypeState property: Locked or Unlocked. Once a machine is registered against a resource, the
     * storageTypeState is always Locked.
     * 
     * @param storageTypeState the storageTypeState value to set.
     * @return the BackupResourceConfig object itself.
     */
    public BackupResourceConfig withStorageTypeState(StorageTypeState storageTypeState) {
        this.storageTypeState = storageTypeState;
        return this;
    }

    /**
     * Get the crossRegionRestoreFlag property: Opt in details of Cross Region Restore feature.
     * 
     * @return the crossRegionRestoreFlag value.
     */
    public Boolean crossRegionRestoreFlag() {
        return this.crossRegionRestoreFlag;
    }

    /**
     * Set the crossRegionRestoreFlag property: Opt in details of Cross Region Restore feature.
     * 
     * @param crossRegionRestoreFlag the crossRegionRestoreFlag value to set.
     * @return the BackupResourceConfig object itself.
     */
    public BackupResourceConfig withCrossRegionRestoreFlag(Boolean crossRegionRestoreFlag) {
        this.crossRegionRestoreFlag = crossRegionRestoreFlag;
        return this;
    }

    /**
     * Get the dedupState property: Vault Dedup state.
     * 
     * @return the dedupState value.
     */
    public DedupState dedupState() {
        return this.dedupState;
    }

    /**
     * Set the dedupState property: Vault Dedup state.
     * 
     * @param dedupState the dedupState value to set.
     * @return the BackupResourceConfig object itself.
     */
    public BackupResourceConfig withDedupState(DedupState dedupState) {
        this.dedupState = dedupState;
        return this;
    }

    /**
     * Get the xcoolState property: Vault x-cool state.
     * 
     * @return the xcoolState value.
     */
    public XcoolState xcoolState() {
        return this.xcoolState;
    }

    /**
     * Set the xcoolState property: Vault x-cool state.
     * 
     * @param xcoolState the xcoolState value to set.
     * @return the BackupResourceConfig object itself.
     */
    public BackupResourceConfig withXcoolState(XcoolState xcoolState) {
        this.xcoolState = xcoolState;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
