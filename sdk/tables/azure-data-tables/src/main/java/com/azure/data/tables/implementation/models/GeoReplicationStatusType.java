// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.data.tables.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The status of the secondary location.
 */
public final class GeoReplicationStatusType extends ExpandableStringEnum<GeoReplicationStatusType> {
    /**
     * Static value live for GeoReplicationStatusType.
     */
    public static final GeoReplicationStatusType LIVE = fromString("live");

    /**
     * Static value bootstrap for GeoReplicationStatusType.
     */
    public static final GeoReplicationStatusType BOOTSTRAP = fromString("bootstrap");

    /**
     * Static value unavailable for GeoReplicationStatusType.
     */
    public static final GeoReplicationStatusType UNAVAILABLE = fromString("unavailable");

    /**
     * Creates a new instance of GeoReplicationStatusType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public GeoReplicationStatusType() {
    }

    /**
     * Creates or finds a GeoReplicationStatusType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding GeoReplicationStatusType.
     */
    public static GeoReplicationStatusType fromString(String name) {
        return fromString(name, GeoReplicationStatusType.class);
    }

    /**
     * Gets known GeoReplicationStatusType values.
     * 
     * @return known GeoReplicationStatusType values.
     */
    public static Collection<GeoReplicationStatusType> values() {
        return values(GeoReplicationStatusType.class);
    }
}
