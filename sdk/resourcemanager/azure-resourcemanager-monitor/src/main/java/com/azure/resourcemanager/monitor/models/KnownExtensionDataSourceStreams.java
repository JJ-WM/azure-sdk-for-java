// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for KnownExtensionDataSourceStreams.
 */
public final class KnownExtensionDataSourceStreams extends ExpandableStringEnum<KnownExtensionDataSourceStreams> {
    /**
     * Static value Microsoft-Event for KnownExtensionDataSourceStreams.
     */
    public static final KnownExtensionDataSourceStreams MICROSOFT_EVENT = fromString("Microsoft-Event");

    /**
     * Static value Microsoft-InsightsMetrics for KnownExtensionDataSourceStreams.
     */
    public static final KnownExtensionDataSourceStreams MICROSOFT_INSIGHTS_METRICS
        = fromString("Microsoft-InsightsMetrics");

    /**
     * Static value Microsoft-Perf for KnownExtensionDataSourceStreams.
     */
    public static final KnownExtensionDataSourceStreams MICROSOFT_PERF = fromString("Microsoft-Perf");

    /**
     * Static value Microsoft-Syslog for KnownExtensionDataSourceStreams.
     */
    public static final KnownExtensionDataSourceStreams MICROSOFT_SYSLOG = fromString("Microsoft-Syslog");

    /**
     * Static value Microsoft-WindowsEvent for KnownExtensionDataSourceStreams.
     */
    public static final KnownExtensionDataSourceStreams MICROSOFT_WINDOWS_EVENT = fromString("Microsoft-WindowsEvent");

    /**
     * Creates a new instance of KnownExtensionDataSourceStreams value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public KnownExtensionDataSourceStreams() {
    }

    /**
     * Creates or finds a KnownExtensionDataSourceStreams from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding KnownExtensionDataSourceStreams.
     */
    @JsonCreator
    public static KnownExtensionDataSourceStreams fromString(String name) {
        return fromString(name, KnownExtensionDataSourceStreams.class);
    }

    /**
     * Gets known KnownExtensionDataSourceStreams values.
     * 
     * @return known KnownExtensionDataSourceStreams values.
     */
    public static Collection<KnownExtensionDataSourceStreams> values() {
        return values(KnownExtensionDataSourceStreams.class);
    }
}
