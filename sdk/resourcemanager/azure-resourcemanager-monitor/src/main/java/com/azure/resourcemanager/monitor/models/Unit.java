// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The unit of the metric.
 */
public final class Unit extends ExpandableStringEnum<Unit> {
    /**
     * Static value Count for Unit.
     */
    public static final Unit COUNT = fromString("Count");

    /**
     * Static value Bytes for Unit.
     */
    public static final Unit BYTES = fromString("Bytes");

    /**
     * Static value Seconds for Unit.
     */
    public static final Unit SECONDS = fromString("Seconds");

    /**
     * Static value CountPerSecond for Unit.
     */
    public static final Unit COUNT_PER_SECOND = fromString("CountPerSecond");

    /**
     * Static value BytesPerSecond for Unit.
     */
    public static final Unit BYTES_PER_SECOND = fromString("BytesPerSecond");

    /**
     * Static value Percent for Unit.
     */
    public static final Unit PERCENT = fromString("Percent");

    /**
     * Static value MilliSeconds for Unit.
     */
    public static final Unit MILLI_SECONDS = fromString("MilliSeconds");

    /**
     * Static value ByteSeconds for Unit.
     */
    public static final Unit BYTE_SECONDS = fromString("ByteSeconds");

    /**
     * Static value Unspecified for Unit.
     */
    public static final Unit UNSPECIFIED = fromString("Unspecified");

    /**
     * Static value Cores for Unit.
     */
    public static final Unit CORES = fromString("Cores");

    /**
     * Static value MilliCores for Unit.
     */
    public static final Unit MILLI_CORES = fromString("MilliCores");

    /**
     * Static value NanoCores for Unit.
     */
    public static final Unit NANO_CORES = fromString("NanoCores");

    /**
     * Static value BitsPerSecond for Unit.
     */
    public static final Unit BITS_PER_SECOND = fromString("BitsPerSecond");

    /**
     * Creates a new instance of Unit value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public Unit() {
    }

    /**
     * Creates or finds a Unit from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding Unit.
     */
    @JsonCreator
    public static Unit fromString(String name) {
        return fromString(name, Unit.class);
    }

    /**
     * Gets known Unit values.
     * 
     * @return known Unit values.
     */
    public static Collection<Unit> values() {
        return values(Unit.class);
    }
}
