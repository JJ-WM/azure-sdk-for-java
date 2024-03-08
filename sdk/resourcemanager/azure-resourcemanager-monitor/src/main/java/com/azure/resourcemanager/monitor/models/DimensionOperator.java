// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Operator for dimension values.
 */
public final class DimensionOperator extends ExpandableStringEnum<DimensionOperator> {
    /**
     * Static value Include for DimensionOperator.
     */
    public static final DimensionOperator INCLUDE = fromString("Include");

    /**
     * Static value Exclude for DimensionOperator.
     */
    public static final DimensionOperator EXCLUDE = fromString("Exclude");

    /**
     * Creates a new instance of DimensionOperator value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DimensionOperator() {
    }

    /**
     * Creates or finds a DimensionOperator from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DimensionOperator.
     */
    @JsonCreator
    public static DimensionOperator fromString(String name) {
        return fromString(name, DimensionOperator.class);
    }

    /**
     * Gets known DimensionOperator values.
     * 
     * @return known DimensionOperator values.
     */
    public static Collection<DimensionOperator> values() {
        return values(DimensionOperator.class);
    }
}
