// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.astro.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Various states of the SSO resource.
 */
public final class SingleSignOnStates extends ExpandableStringEnum<SingleSignOnStates> {
    /**
     * Static value Initial for SingleSignOnStates.
     */
    public static final SingleSignOnStates INITIAL = fromString("Initial");

    /**
     * Static value Enable for SingleSignOnStates.
     */
    public static final SingleSignOnStates ENABLE = fromString("Enable");

    /**
     * Static value Disable for SingleSignOnStates.
     */
    public static final SingleSignOnStates DISABLE = fromString("Disable");

    /**
     * Creates a new instance of SingleSignOnStates value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SingleSignOnStates() {
    }

    /**
     * Creates or finds a SingleSignOnStates from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding SingleSignOnStates.
     */
    @JsonCreator
    public static SingleSignOnStates fromString(String name) {
        return fromString(name, SingleSignOnStates.class);
    }

    /**
     * Gets known SingleSignOnStates values.
     * 
     * @return known SingleSignOnStates values.
     */
    public static Collection<SingleSignOnStates> values() {
        return values(SingleSignOnStates.class);
    }
}
