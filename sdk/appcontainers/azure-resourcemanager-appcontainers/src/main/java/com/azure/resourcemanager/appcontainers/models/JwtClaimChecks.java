// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The configuration settings of the checks that should be made while validating the JWT Claims.
 */
@Fluent
public final class JwtClaimChecks {
    /*
     * The list of the allowed groups.
     */
    @JsonProperty(value = "allowedGroups")
    private List<String> allowedGroups;

    /*
     * The list of the allowed client applications.
     */
    @JsonProperty(value = "allowedClientApplications")
    private List<String> allowedClientApplications;

    /**
     * Creates an instance of JwtClaimChecks class.
     */
    public JwtClaimChecks() {
    }

    /**
     * Get the allowedGroups property: The list of the allowed groups.
     * 
     * @return the allowedGroups value.
     */
    public List<String> allowedGroups() {
        return this.allowedGroups;
    }

    /**
     * Set the allowedGroups property: The list of the allowed groups.
     * 
     * @param allowedGroups the allowedGroups value to set.
     * @return the JwtClaimChecks object itself.
     */
    public JwtClaimChecks withAllowedGroups(List<String> allowedGroups) {
        this.allowedGroups = allowedGroups;
        return this;
    }

    /**
     * Get the allowedClientApplications property: The list of the allowed client applications.
     * 
     * @return the allowedClientApplications value.
     */
    public List<String> allowedClientApplications() {
        return this.allowedClientApplications;
    }

    /**
     * Set the allowedClientApplications property: The list of the allowed client applications.
     * 
     * @param allowedClientApplications the allowedClientApplications value to set.
     * @return the JwtClaimChecks object itself.
     */
    public JwtClaimChecks withAllowedClientApplications(List<String> allowedClientApplications) {
        this.allowedClientApplications = allowedClientApplications;
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
