// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for AlertQueryTimeMode.
 */
public final class AlertQueryTimeMode extends ExpandableStringEnum<AlertQueryTimeMode> {
    /**
     * Static value AnomalyTime for AlertQueryTimeMode.
     */
    public static final AlertQueryTimeMode ANOMALY_TIME = fromString("AnomalyTime");

    /**
     * Static value CreatedTime for AlertQueryTimeMode.
     */
    public static final AlertQueryTimeMode CREATED_TIME = fromString("CreatedTime");

    /**
     * Static value ModifiedTime for AlertQueryTimeMode.
     */
    public static final AlertQueryTimeMode MODIFIED_TIME = fromString("ModifiedTime");

    /**
     * Constructs a AlertQueryTimeMode object.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AlertQueryTimeMode() {
    }

    /**
     * Creates or finds a AlertQueryTimeMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AlertQueryTimeMode.
     */
    public static AlertQueryTimeMode fromString(String name) {
        return fromString(name, AlertQueryTimeMode.class);
    }

    /**
     * Returns the known AlertQueryTimeMode values.
     *
     * @return known AlertQueryTimeMode values.
     */
    public static Collection<AlertQueryTimeMode> values() {
        return values(AlertQueryTimeMode.class);
    }
}
