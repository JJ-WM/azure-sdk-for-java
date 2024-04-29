// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Specifies the patch service used for the operation.
 */
public final class PatchServiceUsed extends ExpandableStringEnum<PatchServiceUsed> {
    /**
     * Static value Unknown for PatchServiceUsed.
     */
    public static final PatchServiceUsed UNKNOWN = fromString("Unknown");

    /**
     * Static value WU for PatchServiceUsed.
     */
    public static final PatchServiceUsed WU = fromString("WU");

    /**
     * Static value WU_WSUS for PatchServiceUsed.
     */
    public static final PatchServiceUsed WU_WSUS = fromString("WU_WSUS");

    /**
     * Static value YUM for PatchServiceUsed.
     */
    public static final PatchServiceUsed YUM = fromString("YUM");

    /**
     * Static value APT for PatchServiceUsed.
     */
    public static final PatchServiceUsed APT = fromString("APT");

    /**
     * Static value Zypper for PatchServiceUsed.
     */
    public static final PatchServiceUsed ZYPPER = fromString("Zypper");

    /**
     * Creates a new instance of PatchServiceUsed value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PatchServiceUsed() {
    }

    /**
     * Creates or finds a PatchServiceUsed from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding PatchServiceUsed.
     */
    @JsonCreator
    public static PatchServiceUsed fromString(String name) {
        return fromString(name, PatchServiceUsed.class);
    }

    /**
     * Gets known PatchServiceUsed values.
     * 
     * @return known PatchServiceUsed values.
     */
    public static Collection<PatchServiceUsed> values() {
        return values(PatchServiceUsed.class);
    }
}
