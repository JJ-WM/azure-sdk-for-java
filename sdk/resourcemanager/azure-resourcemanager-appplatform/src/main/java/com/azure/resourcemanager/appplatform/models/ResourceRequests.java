// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Deployment resource request payload.
 */
@Fluent
public final class ResourceRequests {
    /*
     * Required CPU. 1 core can be represented by 1 or 1000m. This should be 500m or 1 for Basic tier, and {500m, 1, 2,
     * 3, 4} for Standard tier.
     */
    @JsonProperty(value = "cpu")
    private String cpu;

    /*
     * Required memory. 1 GB can be represented by 1Gi or 1024Mi. This should be {512Mi, 1Gi, 2Gi} for Basic tier, and
     * {512Mi, 1Gi, 2Gi, ..., 8Gi} for Standard tier.
     */
    @JsonProperty(value = "memory")
    private String memory;

    /**
     * Creates an instance of ResourceRequests class.
     */
    public ResourceRequests() {
    }

    /**
     * Get the cpu property: Required CPU. 1 core can be represented by 1 or 1000m. This should be 500m or 1 for Basic
     * tier, and {500m, 1, 2, 3, 4} for Standard tier.
     * 
     * @return the cpu value.
     */
    public String cpu() {
        return this.cpu;
    }

    /**
     * Set the cpu property: Required CPU. 1 core can be represented by 1 or 1000m. This should be 500m or 1 for Basic
     * tier, and {500m, 1, 2, 3, 4} for Standard tier.
     * 
     * @param cpu the cpu value to set.
     * @return the ResourceRequests object itself.
     */
    public ResourceRequests withCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * Get the memory property: Required memory. 1 GB can be represented by 1Gi or 1024Mi. This should be {512Mi, 1Gi,
     * 2Gi} for Basic tier, and {512Mi, 1Gi, 2Gi, ..., 8Gi} for Standard tier.
     * 
     * @return the memory value.
     */
    public String memory() {
        return this.memory;
    }

    /**
     * Set the memory property: Required memory. 1 GB can be represented by 1Gi or 1024Mi. This should be {512Mi, 1Gi,
     * 2Gi} for Basic tier, and {512Mi, 1Gi, 2Gi, ..., 8Gi} for Standard tier.
     * 
     * @param memory the memory value to set.
     * @return the ResourceRequests object itself.
     */
    public ResourceRequests withMemory(String memory) {
        this.memory = memory;
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
