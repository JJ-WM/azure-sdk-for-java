// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Indicates the error code if the background copy of a resource created via the CopyStart operation fails.
 */
public final class CopyCompletionErrorReason extends ExpandableStringEnum<CopyCompletionErrorReason> {
    /**
     * Static value CopySourceNotFound for CopyCompletionErrorReason.
     */
    public static final CopyCompletionErrorReason COPY_SOURCE_NOT_FOUND = fromString("CopySourceNotFound");

    /**
     * Creates a new instance of CopyCompletionErrorReason value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public CopyCompletionErrorReason() {
    }

    /**
     * Creates or finds a CopyCompletionErrorReason from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding CopyCompletionErrorReason.
     */
    @JsonCreator
    public static CopyCompletionErrorReason fromString(String name) {
        return fromString(name, CopyCompletionErrorReason.class);
    }

    /**
     * Gets known CopyCompletionErrorReason values.
     * 
     * @return known CopyCompletionErrorReason values.
     */
    public static Collection<CopyCompletionErrorReason> values() {
        return values(CopyCompletionErrorReason.class);
    }
}
