// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sphere.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** OS feed type values. */
public final class OSFeedType extends ExpandableStringEnum<OSFeedType> {
    /** Static value Retail for OSFeedType. */
    public static final OSFeedType RETAIL = fromString("Retail");

    /** Static value RetailEval for OSFeedType. */
    public static final OSFeedType RETAIL_EVAL = fromString("RetailEval");

    /**
     * Creates a new instance of OSFeedType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public OSFeedType() {
    }

    /**
     * Creates or finds a OSFeedType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OSFeedType.
     */
    @JsonCreator
    public static OSFeedType fromString(String name) {
        return fromString(name, OSFeedType.class);
    }

    /**
     * Gets known OSFeedType values.
     *
     * @return known OSFeedType values.
     */
    public static Collection<OSFeedType> values() {
        return values(OSFeedType.class);
    }
}
