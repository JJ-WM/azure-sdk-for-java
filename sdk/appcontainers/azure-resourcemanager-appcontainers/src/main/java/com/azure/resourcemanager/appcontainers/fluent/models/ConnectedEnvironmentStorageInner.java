// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.appcontainers.models.ConnectedEnvironmentStorageProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Storage resource for connectedEnvironment.
 */
@Fluent
public final class ConnectedEnvironmentStorageInner extends ProxyResource {
    /*
     * Storage properties
     */
    @JsonProperty(value = "properties")
    private ConnectedEnvironmentStorageProperties properties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Creates an instance of ConnectedEnvironmentStorageInner class.
     */
    public ConnectedEnvironmentStorageInner() {
    }

    /**
     * Get the properties property: Storage properties.
     * 
     * @return the properties value.
     */
    public ConnectedEnvironmentStorageProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Storage properties.
     * 
     * @param properties the properties value to set.
     * @return the ConnectedEnvironmentStorageInner object itself.
     */
    public ConnectedEnvironmentStorageInner withProperties(ConnectedEnvironmentStorageProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
