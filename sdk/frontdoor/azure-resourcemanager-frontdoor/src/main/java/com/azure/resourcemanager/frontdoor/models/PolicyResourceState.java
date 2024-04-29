// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Resource status of the policy.
 */
public final class PolicyResourceState extends ExpandableStringEnum<PolicyResourceState> {
    /**
     * Static value Creating for PolicyResourceState.
     */
    public static final PolicyResourceState CREATING = fromString("Creating");

    /**
     * Static value Enabling for PolicyResourceState.
     */
    public static final PolicyResourceState ENABLING = fromString("Enabling");

    /**
     * Static value Enabled for PolicyResourceState.
     */
    public static final PolicyResourceState ENABLED = fromString("Enabled");

    /**
     * Static value Disabling for PolicyResourceState.
     */
    public static final PolicyResourceState DISABLING = fromString("Disabling");

    /**
     * Static value Disabled for PolicyResourceState.
     */
    public static final PolicyResourceState DISABLED = fromString("Disabled");

    /**
     * Static value Deleting for PolicyResourceState.
     */
    public static final PolicyResourceState DELETING = fromString("Deleting");

    /**
     * Creates a new instance of PolicyResourceState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PolicyResourceState() {
    }

    /**
     * Creates or finds a PolicyResourceState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding PolicyResourceState.
     */
    @JsonCreator
    public static PolicyResourceState fromString(String name) {
        return fromString(name, PolicyResourceState.class);
    }

    /**
     * Gets known PolicyResourceState values.
     * 
     * @return known PolicyResourceState values.
     */
    public static Collection<PolicyResourceState> values() {
        return values(PolicyResourceState.class);
    }
}
