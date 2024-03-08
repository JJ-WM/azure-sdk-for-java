// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents capability of a fast provisioning edition.
 */
@Immutable
public final class FastProvisioningEditionCapability extends CapabilityBase {
    /*
     * Fast provisioning supported tier name
     */
    @JsonProperty(value = "supportedTier", access = JsonProperty.Access.WRITE_ONLY)
    private String supportedTier;

    /*
     * Fast provisioning supported sku name
     */
    @JsonProperty(value = "supportedSku", access = JsonProperty.Access.WRITE_ONLY)
    private String supportedSku;

    /*
     * Fast provisioning supported storage in Gb
     */
    @JsonProperty(value = "supportedStorageGb", access = JsonProperty.Access.WRITE_ONLY)
    private Integer supportedStorageGb;

    /*
     * Fast provisioning supported version
     */
    @JsonProperty(value = "supportedServerVersions", access = JsonProperty.Access.WRITE_ONLY)
    private String supportedServerVersions;

    /*
     * Count of servers in cache matching the spec
     */
    @JsonProperty(value = "serverCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer serverCount;

    /**
     * Creates an instance of FastProvisioningEditionCapability class.
     */
    public FastProvisioningEditionCapability() {
    }

    /**
     * Get the supportedTier property: Fast provisioning supported tier name.
     * 
     * @return the supportedTier value.
     */
    public String supportedTier() {
        return this.supportedTier;
    }

    /**
     * Get the supportedSku property: Fast provisioning supported sku name.
     * 
     * @return the supportedSku value.
     */
    public String supportedSku() {
        return this.supportedSku;
    }

    /**
     * Get the supportedStorageGb property: Fast provisioning supported storage in Gb.
     * 
     * @return the supportedStorageGb value.
     */
    public Integer supportedStorageGb() {
        return this.supportedStorageGb;
    }

    /**
     * Get the supportedServerVersions property: Fast provisioning supported version.
     * 
     * @return the supportedServerVersions value.
     */
    public String supportedServerVersions() {
        return this.supportedServerVersions;
    }

    /**
     * Get the serverCount property: Count of servers in cache matching the spec.
     * 
     * @return the serverCount value.
     */
    public Integer serverCount() {
        return this.serverCount;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
