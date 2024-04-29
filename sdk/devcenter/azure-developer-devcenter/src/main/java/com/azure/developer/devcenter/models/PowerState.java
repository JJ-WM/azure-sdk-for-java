// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.developer.devcenter.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The power states of a Dev Box.
 */
public final class PowerState extends ExpandableStringEnum<PowerState> {

    /**
     * The Dev Box power state is not known.
     */
    @Generated
    public static final PowerState UNKNOWN = fromString("Unknown");

    /**
     * The Dev Box is running.
     */
    @Generated
    public static final PowerState RUNNING = fromString("Running");

    /**
     * The Dev Box is deallocated.
     */
    @Generated
    public static final PowerState DEALLOCATED = fromString("Deallocated");

    /**
     * The Dev Box is powered off.
     */
    @Generated
    public static final PowerState POWERED_OFF = fromString("PoweredOff");

    /**
     * The Dev Box is hibernated.
     */
    @Generated
    public static final PowerState HIBERNATED = fromString("Hibernated");

    /**
     * Creates a new instance of PowerState value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public PowerState() {
    }

    /**
     * Creates or finds a PowerState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PowerState.
     */
    @Generated
    public static PowerState fromString(String name) {
        return fromString(name, PowerState.class);
    }

    /**
     * Gets known PowerState values.
     *
     * @return known PowerState values.
     */
    @Generated
    public static Collection<PowerState> values() {
        return values(PowerState.class);
    }
}
