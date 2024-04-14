// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Configuration of Open Telemetry traces.
 */
@Fluent
public final class TracesConfiguration {
    /*
     * Open telemetry traces destinations
     */
    @JsonProperty(value = "destinations")
    private List<String> destinations;

    /**
     * Creates an instance of TracesConfiguration class.
     */
    public TracesConfiguration() {
    }

    /**
     * Get the destinations property: Open telemetry traces destinations.
     * 
     * @return the destinations value.
     */
    public List<String> destinations() {
        return this.destinations;
    }

    /**
     * Set the destinations property: Open telemetry traces destinations.
     * 
     * @param destinations the destinations value to set.
     * @return the TracesConfiguration object itself.
     */
    public TracesConfiguration withDestinations(List<String> destinations) {
        this.destinations = destinations;
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
