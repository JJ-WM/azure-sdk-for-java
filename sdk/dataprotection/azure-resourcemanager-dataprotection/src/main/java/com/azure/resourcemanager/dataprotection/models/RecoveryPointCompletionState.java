// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Specifies recovery point completeness. Partial (i.e., only some of the intended items were backed up), or Completed
 * (i.e., ALL intended items were backed up).
 */
public final class RecoveryPointCompletionState extends ExpandableStringEnum<RecoveryPointCompletionState> {
    /**
     * Static value Completed for RecoveryPointCompletionState.
     */
    public static final RecoveryPointCompletionState COMPLETED = fromString("Completed");

    /**
     * Static value Partial for RecoveryPointCompletionState.
     */
    public static final RecoveryPointCompletionState PARTIAL = fromString("Partial");

    /**
     * Creates a new instance of RecoveryPointCompletionState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public RecoveryPointCompletionState() {
    }

    /**
     * Creates or finds a RecoveryPointCompletionState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding RecoveryPointCompletionState.
     */
    public static RecoveryPointCompletionState fromString(String name) {
        return fromString(name, RecoveryPointCompletionState.class);
    }

    /**
     * Gets known RecoveryPointCompletionState values.
     * 
     * @return known RecoveryPointCompletionState values.
     */
    public static Collection<RecoveryPointCompletionState> values() {
        return values(RecoveryPointCompletionState.class);
    }
}
