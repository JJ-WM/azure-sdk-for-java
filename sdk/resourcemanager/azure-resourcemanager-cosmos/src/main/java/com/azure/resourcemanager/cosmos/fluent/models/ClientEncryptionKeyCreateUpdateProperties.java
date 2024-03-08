// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.models.ClientEncryptionKeyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties to create and update ClientEncryptionKey.
 */
@Fluent
public final class ClientEncryptionKeyCreateUpdateProperties {
    /*
     * The standard JSON format of a ClientEncryptionKey
     */
    @JsonProperty(value = "resource", required = true)
    private ClientEncryptionKeyResource resource;

    /**
     * Creates an instance of ClientEncryptionKeyCreateUpdateProperties class.
     */
    public ClientEncryptionKeyCreateUpdateProperties() {
    }

    /**
     * Get the resource property: The standard JSON format of a ClientEncryptionKey.
     * 
     * @return the resource value.
     */
    public ClientEncryptionKeyResource resource() {
        return this.resource;
    }

    /**
     * Set the resource property: The standard JSON format of a ClientEncryptionKey.
     * 
     * @param resource the resource value to set.
     * @return the ClientEncryptionKeyCreateUpdateProperties object itself.
     */
    public ClientEncryptionKeyCreateUpdateProperties withResource(ClientEncryptionKeyResource resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (resource() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property resource in model ClientEncryptionKeyCreateUpdateProperties"));
        } else {
            resource().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ClientEncryptionKeyCreateUpdateProperties.class);
}
