// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The rule set status.
 */
public final class ApplicationGatewayRuleSetStatusOptions
    extends ExpandableStringEnum<ApplicationGatewayRuleSetStatusOptions> {
    /**
     * Static value Preview for ApplicationGatewayRuleSetStatusOptions.
     */
    public static final ApplicationGatewayRuleSetStatusOptions PREVIEW = fromString("Preview");

    /**
     * Static value GA for ApplicationGatewayRuleSetStatusOptions.
     */
    public static final ApplicationGatewayRuleSetStatusOptions GA = fromString("GA");

    /**
     * Static value Supported for ApplicationGatewayRuleSetStatusOptions.
     */
    public static final ApplicationGatewayRuleSetStatusOptions SUPPORTED = fromString("Supported");

    /**
     * Static value Deprecated for ApplicationGatewayRuleSetStatusOptions.
     */
    public static final ApplicationGatewayRuleSetStatusOptions DEPRECATED = fromString("Deprecated");

    /**
     * Creates a new instance of ApplicationGatewayRuleSetStatusOptions value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ApplicationGatewayRuleSetStatusOptions() {
    }

    /**
     * Creates or finds a ApplicationGatewayRuleSetStatusOptions from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ApplicationGatewayRuleSetStatusOptions.
     */
    @JsonCreator
    public static ApplicationGatewayRuleSetStatusOptions fromString(String name) {
        return fromString(name, ApplicationGatewayRuleSetStatusOptions.class);
    }

    /**
     * Gets known ApplicationGatewayRuleSetStatusOptions values.
     * 
     * @return known ApplicationGatewayRuleSetStatusOptions values.
     */
    public static Collection<ApplicationGatewayRuleSetStatusOptions> values() {
        return values(ApplicationGatewayRuleSetStatusOptions.class);
    }
}
