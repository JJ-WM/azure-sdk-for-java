// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for SourceTriggerEvent.
 */
public final class SourceTriggerEvent extends ExpandableStringEnum<SourceTriggerEvent> {
    /**
     * Static value commit for SourceTriggerEvent.
     */
    public static final SourceTriggerEvent COMMIT = fromString("commit");

    /**
     * Static value pullrequest for SourceTriggerEvent.
     */
    public static final SourceTriggerEvent PULLREQUEST = fromString("pullrequest");

    /**
     * Creates a new instance of SourceTriggerEvent value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SourceTriggerEvent() {
    }

    /**
     * Creates or finds a SourceTriggerEvent from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding SourceTriggerEvent.
     */
    @JsonCreator
    public static SourceTriggerEvent fromString(String name) {
        return fromString(name, SourceTriggerEvent.class);
    }

    /**
     * Gets known SourceTriggerEvent values.
     * 
     * @return known SourceTriggerEvent values.
     */
    public static Collection<SourceTriggerEvent> values() {
        return values(SourceTriggerEvent.class);
    }
}
