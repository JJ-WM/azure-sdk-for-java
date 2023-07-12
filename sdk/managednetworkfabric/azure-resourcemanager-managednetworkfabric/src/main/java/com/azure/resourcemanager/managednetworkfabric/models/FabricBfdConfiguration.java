// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** BFD Configuration properties. */
@Immutable
public final class FabricBfdConfiguration {
    /*
     * interval in seconds. Example: 300.
     */
    @JsonProperty(value = "interval", access = JsonProperty.Access.WRITE_ONLY)
    private Integer interval;

    /*
     * multiplier. Example: 3.
     */
    @JsonProperty(value = "multiplier", access = JsonProperty.Access.WRITE_ONLY)
    private Integer multiplier;

    /** Creates an instance of FabricBfdConfiguration class. */
    public FabricBfdConfiguration() {
    }

    /**
     * Get the interval property: interval in seconds. Example: 300.
     *
     * @return the interval value.
     */
    public Integer interval() {
        return this.interval;
    }

    /**
     * Get the multiplier property: multiplier. Example: 3.
     *
     * @return the multiplier value.
     */
    public Integer multiplier() {
        return this.multiplier;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
