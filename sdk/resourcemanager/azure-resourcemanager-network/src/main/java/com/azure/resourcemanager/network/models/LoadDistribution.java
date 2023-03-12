// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The load distribution policy for this rule. */
public final class LoadDistribution extends ExpandableStringEnum<LoadDistribution> {
    /** Static value Default for LoadDistribution. */
    public static final LoadDistribution DEFAULT = fromString("Default");

    /** Static value SourceIP for LoadDistribution. */
    public static final LoadDistribution SOURCE_IP = fromString("SourceIP");

    /** Static value SourceIPProtocol for LoadDistribution. */
    public static final LoadDistribution SOURCE_IPPROTOCOL = fromString("SourceIPProtocol");

    /**
     * Creates a new instance of LoadDistribution value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public LoadDistribution() {
    }

    /**
     * Creates or finds a LoadDistribution from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding LoadDistribution.
     */
    @JsonCreator
    public static LoadDistribution fromString(String name) {
        return fromString(name, LoadDistribution.class);
    }

    /**
     * Gets known LoadDistribution values.
     *
     * @return known LoadDistribution values.
     */
    public static Collection<LoadDistribution> values() {
        return values(LoadDistribution.class);
    }
}
