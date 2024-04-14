// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Collection of Storage for Environments.
 */
@Fluent
public final class ManagedEnvironmentStoragesCollectionInner {
    /*
     * Collection of storage resources.
     */
    @JsonProperty(value = "value", required = true)
    private List<ManagedEnvironmentStorageInner> value;

    /**
     * Creates an instance of ManagedEnvironmentStoragesCollectionInner class.
     */
    public ManagedEnvironmentStoragesCollectionInner() {
    }

    /**
     * Get the value property: Collection of storage resources.
     * 
     * @return the value value.
     */
    public List<ManagedEnvironmentStorageInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Collection of storage resources.
     * 
     * @param value the value value to set.
     * @return the ManagedEnvironmentStoragesCollectionInner object itself.
     */
    public ManagedEnvironmentStoragesCollectionInner withValue(List<ManagedEnvironmentStorageInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property value in model ManagedEnvironmentStoragesCollectionInner"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ManagedEnvironmentStoragesCollectionInner.class);
}
