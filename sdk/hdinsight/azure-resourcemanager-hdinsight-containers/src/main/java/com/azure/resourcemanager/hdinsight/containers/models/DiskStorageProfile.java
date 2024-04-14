// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Kafka disk storage profile.
 */
@Fluent
public final class DiskStorageProfile {
    /*
     * Managed Disk size in GB. The maximum supported disk size for Standard and Premium HDD/SSD is 32TB, except for
     * Premium SSD v2, which supports up to 64TB.
     */
    @JsonProperty(value = "dataDiskSize", required = true)
    private int dataDiskSize;

    /*
     * Managed Disk Type.
     */
    @JsonProperty(value = "dataDiskType", required = true)
    private DataDiskType dataDiskType;

    /**
     * Creates an instance of DiskStorageProfile class.
     */
    public DiskStorageProfile() {
    }

    /**
     * Get the dataDiskSize property: Managed Disk size in GB. The maximum supported disk size for Standard and Premium
     * HDD/SSD is 32TB, except for Premium SSD v2, which supports up to 64TB.
     * 
     * @return the dataDiskSize value.
     */
    public int dataDiskSize() {
        return this.dataDiskSize;
    }

    /**
     * Set the dataDiskSize property: Managed Disk size in GB. The maximum supported disk size for Standard and Premium
     * HDD/SSD is 32TB, except for Premium SSD v2, which supports up to 64TB.
     * 
     * @param dataDiskSize the dataDiskSize value to set.
     * @return the DiskStorageProfile object itself.
     */
    public DiskStorageProfile withDataDiskSize(int dataDiskSize) {
        this.dataDiskSize = dataDiskSize;
        return this;
    }

    /**
     * Get the dataDiskType property: Managed Disk Type.
     * 
     * @return the dataDiskType value.
     */
    public DataDiskType dataDiskType() {
        return this.dataDiskType;
    }

    /**
     * Set the dataDiskType property: Managed Disk Type.
     * 
     * @param dataDiskType the dataDiskType value to set.
     * @return the DiskStorageProfile object itself.
     */
    public DiskStorageProfile withDataDiskType(DataDiskType dataDiskType) {
        this.dataDiskType = dataDiskType;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dataDiskType() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property dataDiskType in model DiskStorageProfile"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DiskStorageProfile.class);
}
