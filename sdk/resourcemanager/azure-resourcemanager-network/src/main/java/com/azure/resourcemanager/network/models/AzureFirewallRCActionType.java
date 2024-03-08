// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The action type of a rule collection.
 */
public final class AzureFirewallRCActionType extends ExpandableStringEnum<AzureFirewallRCActionType> {
    /**
     * Static value Allow for AzureFirewallRCActionType.
     */
    public static final AzureFirewallRCActionType ALLOW = fromString("Allow");

    /**
     * Static value Deny for AzureFirewallRCActionType.
     */
    public static final AzureFirewallRCActionType DENY = fromString("Deny");

    /**
     * Creates a new instance of AzureFirewallRCActionType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AzureFirewallRCActionType() {
    }

    /**
     * Creates or finds a AzureFirewallRCActionType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AzureFirewallRCActionType.
     */
    @JsonCreator
    public static AzureFirewallRCActionType fromString(String name) {
        return fromString(name, AzureFirewallRCActionType.class);
    }

    /**
     * Gets known AzureFirewallRCActionType values.
     * 
     * @return known AzureFirewallRCActionType values.
     */
    public static Collection<AzureFirewallRCActionType> values() {
        return values(AzureFirewallRCActionType.class);
    }
}
