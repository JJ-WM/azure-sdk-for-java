// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Routing identity info for topic spaces configuration. */
@Fluent
public final class RoutingIdentityInfo {
    /*
     * The type property.
     */
    @JsonProperty(value = "type")
    private RoutingIdentityType type;

    /*
     * The userAssignedIdentity property.
     */
    @JsonProperty(value = "userAssignedIdentity")
    private String userAssignedIdentity;

    /** Creates an instance of RoutingIdentityInfo class. */
    public RoutingIdentityInfo() {
    }

    /**
     * Get the type property: The type property.
     *
     * @return the type value.
     */
    public RoutingIdentityType type() {
        return this.type;
    }

    /**
     * Set the type property: The type property.
     *
     * @param type the type value to set.
     * @return the RoutingIdentityInfo object itself.
     */
    public RoutingIdentityInfo withType(RoutingIdentityType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the userAssignedIdentity property: The userAssignedIdentity property.
     *
     * @return the userAssignedIdentity value.
     */
    public String userAssignedIdentity() {
        return this.userAssignedIdentity;
    }

    /**
     * Set the userAssignedIdentity property: The userAssignedIdentity property.
     *
     * @param userAssignedIdentity the userAssignedIdentity value to set.
     * @return the RoutingIdentityInfo object itself.
     */
    public RoutingIdentityInfo withUserAssignedIdentity(String userAssignedIdentity) {
        this.userAssignedIdentity = userAssignedIdentity;
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
