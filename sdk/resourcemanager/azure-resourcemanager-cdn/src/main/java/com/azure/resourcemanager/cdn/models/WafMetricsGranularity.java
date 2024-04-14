// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for WafMetricsGranularity.
 */
public final class WafMetricsGranularity extends ExpandableStringEnum<WafMetricsGranularity> {
    /**
     * Static value PT5M for WafMetricsGranularity.
     */
    public static final WafMetricsGranularity PT5M = fromString("PT5M");

    /**
     * Static value PT1H for WafMetricsGranularity.
     */
    public static final WafMetricsGranularity PT1H = fromString("PT1H");

    /**
     * Static value P1D for WafMetricsGranularity.
     */
    public static final WafMetricsGranularity P1D = fromString("P1D");

    /**
     * Creates a new instance of WafMetricsGranularity value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public WafMetricsGranularity() {
    }

    /**
     * Creates or finds a WafMetricsGranularity from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding WafMetricsGranularity.
     */
    @JsonCreator
    public static WafMetricsGranularity fromString(String name) {
        return fromString(name, WafMetricsGranularity.class);
    }

    /**
     * Gets known WafMetricsGranularity values.
     * 
     * @return known WafMetricsGranularity values.
     */
    public static Collection<WafMetricsGranularity> values() {
        return values(WafMetricsGranularity.class);
    }
}
