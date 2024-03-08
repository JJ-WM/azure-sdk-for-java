// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Virtual Hub identifier.
 */
@Fluent
public final class VirtualHubId {
    /*
     * The resource URI for the Virtual Hub where the ExpressRoute gateway is or will be deployed. The Virtual Hub
     * resource and the ExpressRoute gateway resource reside in the same subscription.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Creates an instance of VirtualHubId class.
     */
    public VirtualHubId() {
    }

    /**
     * Get the id property: The resource URI for the Virtual Hub where the ExpressRoute gateway is or will be deployed.
     * The Virtual Hub resource and the ExpressRoute gateway resource reside in the same subscription.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The resource URI for the Virtual Hub where the ExpressRoute gateway is or will be deployed.
     * The Virtual Hub resource and the ExpressRoute gateway resource reside in the same subscription.
     * 
     * @param id the id value to set.
     * @return the VirtualHubId object itself.
     */
    public VirtualHubId withId(String id) {
        this.id = id;
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
