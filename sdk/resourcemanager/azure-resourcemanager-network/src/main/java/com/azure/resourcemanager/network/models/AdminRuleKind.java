// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Whether the rule is custom or default.
 */
public final class AdminRuleKind extends ExpandableStringEnum<AdminRuleKind> {
    /**
     * Static value Custom for AdminRuleKind.
     */
    public static final AdminRuleKind CUSTOM = fromString("Custom");

    /**
     * Static value Default for AdminRuleKind.
     */
    public static final AdminRuleKind DEFAULT = fromString("Default");

    /**
     * Creates a new instance of AdminRuleKind value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AdminRuleKind() {
    }

    /**
     * Creates or finds a AdminRuleKind from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AdminRuleKind.
     */
    @JsonCreator
    public static AdminRuleKind fromString(String name) {
        return fromString(name, AdminRuleKind.class);
    }

    /**
     * Gets known AdminRuleKind values.
     * 
     * @return known AdminRuleKind values.
     */
    public static Collection<AdminRuleKind> values() {
        return values(AdminRuleKind.class);
    }
}
