// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Configuration of the protocol.
 */
@Fluent
public final class ProtocolConfiguration {
    /*
     * HTTP configuration of the connectivity check.
     */
    @JsonProperty(value = "HTTPConfiguration")
    private HttpConfiguration httpConfiguration;

    /**
     * Creates an instance of ProtocolConfiguration class.
     */
    public ProtocolConfiguration() {
    }

    /**
     * Get the httpConfiguration property: HTTP configuration of the connectivity check.
     * 
     * @return the httpConfiguration value.
     */
    public HttpConfiguration httpConfiguration() {
        return this.httpConfiguration;
    }

    /**
     * Set the httpConfiguration property: HTTP configuration of the connectivity check.
     * 
     * @param httpConfiguration the httpConfiguration value to set.
     * @return the ProtocolConfiguration object itself.
     */
    public ProtocolConfiguration withHttpConfiguration(HttpConfiguration httpConfiguration) {
        this.httpConfiguration = httpConfiguration;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (httpConfiguration() != null) {
            httpConfiguration().validate();
        }
    }
}
