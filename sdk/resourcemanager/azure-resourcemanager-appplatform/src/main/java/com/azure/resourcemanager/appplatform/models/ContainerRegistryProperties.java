// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Container registry resource payload.
 */
@Fluent
public final class ContainerRegistryProperties {
    /*
     * The credentials of the container registry resource.
     */
    @JsonProperty(value = "credentials", required = true)
    private ContainerRegistryCredentials credentials;

    /*
     * State of the Container Registry.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ContainerRegistryProvisioningState provisioningState;

    /**
     * Creates an instance of ContainerRegistryProperties class.
     */
    public ContainerRegistryProperties() {
    }

    /**
     * Get the credentials property: The credentials of the container registry resource.
     * 
     * @return the credentials value.
     */
    public ContainerRegistryCredentials credentials() {
        return this.credentials;
    }

    /**
     * Set the credentials property: The credentials of the container registry resource.
     * 
     * @param credentials the credentials value to set.
     * @return the ContainerRegistryProperties object itself.
     */
    public ContainerRegistryProperties withCredentials(ContainerRegistryCredentials credentials) {
        this.credentials = credentials;
        return this;
    }

    /**
     * Get the provisioningState property: State of the Container Registry.
     * 
     * @return the provisioningState value.
     */
    public ContainerRegistryProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (credentials() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property credentials in model ContainerRegistryProperties"));
        } else {
            credentials().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ContainerRegistryProperties.class);
}
