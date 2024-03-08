// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Properties of a private link resource.
 */
@Fluent
public final class ApplicationGatewayPrivateLinkResourceProperties {
    /*
     * Group identifier of private link resource.
     */
    @JsonProperty(value = "groupId", access = JsonProperty.Access.WRITE_ONLY)
    private String groupId;

    /*
     * Required member names of private link resource.
     */
    @JsonProperty(value = "requiredMembers", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> requiredMembers;

    /*
     * Required DNS zone names of the the private link resource.
     */
    @JsonProperty(value = "requiredZoneNames")
    private List<String> requiredZoneNames;

    /**
     * Creates an instance of ApplicationGatewayPrivateLinkResourceProperties class.
     */
    public ApplicationGatewayPrivateLinkResourceProperties() {
    }

    /**
     * Get the groupId property: Group identifier of private link resource.
     * 
     * @return the groupId value.
     */
    public String groupId() {
        return this.groupId;
    }

    /**
     * Get the requiredMembers property: Required member names of private link resource.
     * 
     * @return the requiredMembers value.
     */
    public List<String> requiredMembers() {
        return this.requiredMembers;
    }

    /**
     * Get the requiredZoneNames property: Required DNS zone names of the the private link resource.
     * 
     * @return the requiredZoneNames value.
     */
    public List<String> requiredZoneNames() {
        return this.requiredZoneNames;
    }

    /**
     * Set the requiredZoneNames property: Required DNS zone names of the the private link resource.
     * 
     * @param requiredZoneNames the requiredZoneNames value to set.
     * @return the ApplicationGatewayPrivateLinkResourceProperties object itself.
     */
    public ApplicationGatewayPrivateLinkResourceProperties withRequiredZoneNames(List<String> requiredZoneNames) {
        this.requiredZoneNames = requiredZoneNames;
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
