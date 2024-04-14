// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sphere.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Request of the action to create a signed device capability image.
 */
@Fluent
public final class GenerateCapabilityImageRequest {
    /*
     * List of capabilities to create
     */
    @JsonProperty(value = "capabilities", required = true)
    private List<CapabilityType> capabilities;

    /**
     * Creates an instance of GenerateCapabilityImageRequest class.
     */
    public GenerateCapabilityImageRequest() {
    }

    /**
     * Get the capabilities property: List of capabilities to create.
     * 
     * @return the capabilities value.
     */
    public List<CapabilityType> capabilities() {
        return this.capabilities;
    }

    /**
     * Set the capabilities property: List of capabilities to create.
     * 
     * @param capabilities the capabilities value to set.
     * @return the GenerateCapabilityImageRequest object itself.
     */
    public GenerateCapabilityImageRequest withCapabilities(List<CapabilityType> capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (capabilities() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property capabilities in model GenerateCapabilityImageRequest"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(GenerateCapabilityImageRequest.class);
}
