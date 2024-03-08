// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Sorting order of the parameter.
 */
public final class RunQueryOrder extends ExpandableStringEnum<RunQueryOrder> {
    /**
     * Static value ASC for RunQueryOrder.
     */
    public static final RunQueryOrder ASC = fromString("ASC");

    /**
     * Static value DESC for RunQueryOrder.
     */
    public static final RunQueryOrder DESC = fromString("DESC");

    /**
     * Creates a new instance of RunQueryOrder value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public RunQueryOrder() {
    }

    /**
     * Creates or finds a RunQueryOrder from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding RunQueryOrder.
     */
    @JsonCreator
    public static RunQueryOrder fromString(String name) {
        return fromString(name, RunQueryOrder.class);
    }

    /**
     * Gets known RunQueryOrder values.
     * 
     * @return known RunQueryOrder values.
     */
    public static Collection<RunQueryOrder> values() {
        return values(RunQueryOrder.class);
    }
}
