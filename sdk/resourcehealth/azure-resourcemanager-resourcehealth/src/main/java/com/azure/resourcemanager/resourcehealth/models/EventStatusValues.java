// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcehealth.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Current status of event. */
public final class EventStatusValues extends ExpandableStringEnum<EventStatusValues> {
    /** Static value Active for EventStatusValues. */
    public static final EventStatusValues ACTIVE = fromString("Active");

    /** Static value Resolved for EventStatusValues. */
    public static final EventStatusValues RESOLVED = fromString("Resolved");

    /**
     * Creates a new instance of EventStatusValues value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public EventStatusValues() {
    }

    /**
     * Creates or finds a EventStatusValues from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding EventStatusValues.
     */
    @JsonCreator
    public static EventStatusValues fromString(String name) {
        return fromString(name, EventStatusValues.class);
    }

    /**
     * Gets known EventStatusValues values.
     *
     * @return known EventStatusValues values.
     */
    public static Collection<EventStatusValues> values() {
        return values(EventStatusValues.class);
    }
}
