// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Protected item dynamic memory config. */
@Fluent
public final class ProtectedItemDynamicMemoryConfig {
    /*
     * Gets or sets maximum memory in MB.
     */
    @JsonProperty(value = "maximumMemoryInMegaBytes", required = true)
    private long maximumMemoryInMegaBytes;

    /*
     * Gets or sets minimum memory in MB.
     */
    @JsonProperty(value = "minimumMemoryInMegaBytes", required = true)
    private long minimumMemoryInMegaBytes;

    /*
     * Gets or sets target memory buffer in %.
     */
    @JsonProperty(value = "targetMemoryBufferPercentage", required = true)
    private int targetMemoryBufferPercentage;

    /** Creates an instance of ProtectedItemDynamicMemoryConfig class. */
    public ProtectedItemDynamicMemoryConfig() {
    }

    /**
     * Get the maximumMemoryInMegaBytes property: Gets or sets maximum memory in MB.
     *
     * @return the maximumMemoryInMegaBytes value.
     */
    public long maximumMemoryInMegaBytes() {
        return this.maximumMemoryInMegaBytes;
    }

    /**
     * Set the maximumMemoryInMegaBytes property: Gets or sets maximum memory in MB.
     *
     * @param maximumMemoryInMegaBytes the maximumMemoryInMegaBytes value to set.
     * @return the ProtectedItemDynamicMemoryConfig object itself.
     */
    public ProtectedItemDynamicMemoryConfig withMaximumMemoryInMegaBytes(long maximumMemoryInMegaBytes) {
        this.maximumMemoryInMegaBytes = maximumMemoryInMegaBytes;
        return this;
    }

    /**
     * Get the minimumMemoryInMegaBytes property: Gets or sets minimum memory in MB.
     *
     * @return the minimumMemoryInMegaBytes value.
     */
    public long minimumMemoryInMegaBytes() {
        return this.minimumMemoryInMegaBytes;
    }

    /**
     * Set the minimumMemoryInMegaBytes property: Gets or sets minimum memory in MB.
     *
     * @param minimumMemoryInMegaBytes the minimumMemoryInMegaBytes value to set.
     * @return the ProtectedItemDynamicMemoryConfig object itself.
     */
    public ProtectedItemDynamicMemoryConfig withMinimumMemoryInMegaBytes(long minimumMemoryInMegaBytes) {
        this.minimumMemoryInMegaBytes = minimumMemoryInMegaBytes;
        return this;
    }

    /**
     * Get the targetMemoryBufferPercentage property: Gets or sets target memory buffer in %.
     *
     * @return the targetMemoryBufferPercentage value.
     */
    public int targetMemoryBufferPercentage() {
        return this.targetMemoryBufferPercentage;
    }

    /**
     * Set the targetMemoryBufferPercentage property: Gets or sets target memory buffer in %.
     *
     * @param targetMemoryBufferPercentage the targetMemoryBufferPercentage value to set.
     * @return the ProtectedItemDynamicMemoryConfig object itself.
     */
    public ProtectedItemDynamicMemoryConfig withTargetMemoryBufferPercentage(int targetMemoryBufferPercentage) {
        this.targetMemoryBufferPercentage = targetMemoryBufferPercentage;
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
