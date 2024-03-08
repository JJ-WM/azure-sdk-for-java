// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloadssapvirtualinstance.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The SAP Availability Zone Pair.
 */
@Fluent
public final class SapAvailabilityZonePair {
    /*
     * The zone A.
     */
    @JsonProperty(value = "zoneA")
    private Long zoneA;

    /*
     * The zone B.
     */
    @JsonProperty(value = "zoneB")
    private Long zoneB;

    /**
     * Creates an instance of SapAvailabilityZonePair class.
     */
    public SapAvailabilityZonePair() {
    }

    /**
     * Get the zoneA property: The zone A.
     * 
     * @return the zoneA value.
     */
    public Long zoneA() {
        return this.zoneA;
    }

    /**
     * Set the zoneA property: The zone A.
     * 
     * @param zoneA the zoneA value to set.
     * @return the SapAvailabilityZonePair object itself.
     */
    public SapAvailabilityZonePair withZoneA(Long zoneA) {
        this.zoneA = zoneA;
        return this;
    }

    /**
     * Get the zoneB property: The zone B.
     * 
     * @return the zoneB value.
     */
    public Long zoneB() {
        return this.zoneB;
    }

    /**
     * Set the zoneB property: The zone B.
     * 
     * @param zoneB the zoneB value to set.
     * @return the SapAvailabilityZonePair object itself.
     */
    public SapAvailabilityZonePair withZoneB(Long zoneB) {
        this.zoneB = zoneB;
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
