// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** To check whether monitoring of internal network is enabled or not. */
public final class IsMonitoringEnabled extends ExpandableStringEnum<IsMonitoringEnabled> {
    /** Static value True for IsMonitoringEnabled. */
    public static final IsMonitoringEnabled TRUE = fromString("True");

    /** Static value False for IsMonitoringEnabled. */
    public static final IsMonitoringEnabled FALSE = fromString("False");

    /**
     * Creates a new instance of IsMonitoringEnabled value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public IsMonitoringEnabled() {
    }

    /**
     * Creates or finds a IsMonitoringEnabled from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding IsMonitoringEnabled.
     */
    @JsonCreator
    public static IsMonitoringEnabled fromString(String name) {
        return fromString(name, IsMonitoringEnabled.class);
    }

    /**
     * Gets known IsMonitoringEnabled values.
     *
     * @return known IsMonitoringEnabled values.
     */
    public static Collection<IsMonitoringEnabled> values() {
        return values(IsMonitoringEnabled.class);
    }
}
