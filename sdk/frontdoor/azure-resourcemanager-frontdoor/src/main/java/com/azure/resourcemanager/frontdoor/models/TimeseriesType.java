// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The type of Timeseries.
 */
public final class TimeseriesType extends ExpandableStringEnum<TimeseriesType> {
    /**
     * Static value MeasurementCounts for TimeseriesType.
     */
    public static final TimeseriesType MEASUREMENT_COUNTS = fromString("MeasurementCounts");

    /**
     * Static value LatencyP50 for TimeseriesType.
     */
    public static final TimeseriesType LATENCY_P50 = fromString("LatencyP50");

    /**
     * Static value LatencyP75 for TimeseriesType.
     */
    public static final TimeseriesType LATENCY_P75 = fromString("LatencyP75");

    /**
     * Static value LatencyP95 for TimeseriesType.
     */
    public static final TimeseriesType LATENCY_P95 = fromString("LatencyP95");

    /**
     * Creates a new instance of TimeseriesType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public TimeseriesType() {
    }

    /**
     * Creates or finds a TimeseriesType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding TimeseriesType.
     */
    @JsonCreator
    public static TimeseriesType fromString(String name) {
        return fromString(name, TimeseriesType.class);
    }

    /**
     * Gets known TimeseriesType values.
     * 
     * @return known TimeseriesType values.
     */
    public static Collection<TimeseriesType> values() {
        return values(TimeseriesType.class);
    }
}
