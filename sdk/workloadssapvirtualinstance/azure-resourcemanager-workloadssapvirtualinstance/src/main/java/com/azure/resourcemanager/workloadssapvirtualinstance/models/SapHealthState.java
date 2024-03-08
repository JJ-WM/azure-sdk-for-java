// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloadssapvirtualinstance.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines the health of SAP Instances.
 */
public final class SapHealthState extends ExpandableStringEnum<SapHealthState> {
    /**
     * Static value Unknown for SapHealthState.
     */
    public static final SapHealthState UNKNOWN = fromString("Unknown");

    /**
     * Static value Healthy for SapHealthState.
     */
    public static final SapHealthState HEALTHY = fromString("Healthy");

    /**
     * Static value Unhealthy for SapHealthState.
     */
    public static final SapHealthState UNHEALTHY = fromString("Unhealthy");

    /**
     * Static value Degraded for SapHealthState.
     */
    public static final SapHealthState DEGRADED = fromString("Degraded");

    /**
     * Creates a new instance of SapHealthState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SapHealthState() {
    }

    /**
     * Creates or finds a SapHealthState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding SapHealthState.
     */
    @JsonCreator
    public static SapHealthState fromString(String name) {
        return fromString(name, SapHealthState.class);
    }

    /**
     * Gets known SapHealthState values.
     * 
     * @return known SapHealthState values.
     */
    public static Collection<SapHealthState> values() {
        return values(SapHealthState.class);
    }
}
