// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * User to specify which type of Autoscale to be implemented - Scheduled Based or Load Based.
 */
public final class AutoscaleType extends ExpandableStringEnum<AutoscaleType> {
    /**
     * Static value ScheduleBased for AutoscaleType.
     */
    public static final AutoscaleType SCHEDULE_BASED = fromString("ScheduleBased");

    /**
     * Static value LoadBased for AutoscaleType.
     */
    public static final AutoscaleType LOAD_BASED = fromString("LoadBased");

    /**
     * Creates a new instance of AutoscaleType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AutoscaleType() {
    }

    /**
     * Creates or finds a AutoscaleType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AutoscaleType.
     */
    @JsonCreator
    public static AutoscaleType fromString(String name) {
        return fromString(name, AutoscaleType.class);
    }

    /**
     * Gets known AutoscaleType values.
     * 
     * @return known AutoscaleType values.
     */
    public static Collection<AutoscaleType> values() {
        return values(AutoscaleType.class);
    }
}
