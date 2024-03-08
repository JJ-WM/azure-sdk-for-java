// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The access key regenerate action content.
 */
@Fluent
public final class RegenerateActionParameter {
    /*
     * The key type.
     */
    @JsonProperty(value = "keyType")
    private KeyType keyType;

    /**
     * Creates an instance of RegenerateActionParameter class.
     */
    public RegenerateActionParameter() {
    }

    /**
     * Get the keyType property: The key type.
     * 
     * @return the keyType value.
     */
    public KeyType keyType() {
        return this.keyType;
    }

    /**
     * Set the keyType property: The key type.
     * 
     * @param keyType the keyType value to set.
     * @return the RegenerateActionParameter object itself.
     */
    public RegenerateActionParameter withKeyType(KeyType keyType) {
        this.keyType = keyType;
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
