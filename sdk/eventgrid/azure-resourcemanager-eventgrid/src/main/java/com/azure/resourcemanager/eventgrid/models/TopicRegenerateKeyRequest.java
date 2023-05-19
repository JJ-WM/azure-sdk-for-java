// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Topic regenerate share access key request. */
@Fluent
public final class TopicRegenerateKeyRequest {
    /*
     * Key name to regenerate key1 or key2
     */
    @JsonProperty(value = "keyName", required = true)
    private String keyName;

    /** Creates an instance of TopicRegenerateKeyRequest class. */
    public TopicRegenerateKeyRequest() {
    }

    /**
     * Get the keyName property: Key name to regenerate key1 or key2.
     *
     * @return the keyName value.
     */
    public String keyName() {
        return this.keyName;
    }

    /**
     * Set the keyName property: Key name to regenerate key1 or key2.
     *
     * @param keyName the keyName value to set.
     * @return the TopicRegenerateKeyRequest object itself.
     */
    public TopicRegenerateKeyRequest withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (keyName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property keyName in model TopicRegenerateKeyRequest"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(TopicRegenerateKeyRequest.class);
}
