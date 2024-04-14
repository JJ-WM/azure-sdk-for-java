// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IoT Security solution analytics severity metrics.
 */
@Fluent
public final class IoTSeverityMetrics {
    /*
     * Count of high severity alerts/recommendations.
     */
    @JsonProperty(value = "high")
    private Long high;

    /*
     * Count of medium severity alerts/recommendations.
     */
    @JsonProperty(value = "medium")
    private Long medium;

    /*
     * Count of low severity alerts/recommendations.
     */
    @JsonProperty(value = "low")
    private Long low;

    /**
     * Creates an instance of IoTSeverityMetrics class.
     */
    public IoTSeverityMetrics() {
    }

    /**
     * Get the high property: Count of high severity alerts/recommendations.
     * 
     * @return the high value.
     */
    public Long high() {
        return this.high;
    }

    /**
     * Set the high property: Count of high severity alerts/recommendations.
     * 
     * @param high the high value to set.
     * @return the IoTSeverityMetrics object itself.
     */
    public IoTSeverityMetrics withHigh(Long high) {
        this.high = high;
        return this;
    }

    /**
     * Get the medium property: Count of medium severity alerts/recommendations.
     * 
     * @return the medium value.
     */
    public Long medium() {
        return this.medium;
    }

    /**
     * Set the medium property: Count of medium severity alerts/recommendations.
     * 
     * @param medium the medium value to set.
     * @return the IoTSeverityMetrics object itself.
     */
    public IoTSeverityMetrics withMedium(Long medium) {
        this.medium = medium;
        return this;
    }

    /**
     * Get the low property: Count of low severity alerts/recommendations.
     * 
     * @return the low value.
     */
    public Long low() {
        return this.low;
    }

    /**
     * Set the low property: Count of low severity alerts/recommendations.
     * 
     * @param low the low value to set.
     * @return the IoTSeverityMetrics object itself.
     */
    public IoTSeverityMetrics withLow(Long low) {
        this.low = low;
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
