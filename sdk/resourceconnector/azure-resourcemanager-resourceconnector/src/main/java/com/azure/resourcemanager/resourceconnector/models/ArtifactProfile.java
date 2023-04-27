// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourceconnector.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Appliance ArtifactProfile definition. */
@Immutable
public final class ArtifactProfile {
    /*
     * Endpoint is the URL to upload artifacts to.
     */
    @JsonProperty(value = "endpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String endpoint;

    /** Creates an instance of ArtifactProfile class. */
    public ArtifactProfile() {
    }

    /**
     * Get the endpoint property: Endpoint is the URL to upload artifacts to.
     *
     * @return the endpoint value.
     */
    public String endpoint() {
        return this.endpoint;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}