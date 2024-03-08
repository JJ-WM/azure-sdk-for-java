// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The limit object type.
 */
public final class LimitType extends ExpandableStringEnum<LimitType> {
    /**
     * Static value LimitValue for LimitType.
     */
    public static final LimitType LIMIT_VALUE = fromString("LimitValue");

    /**
     * Creates a new instance of LimitType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public LimitType() {
    }

    /**
     * Creates or finds a LimitType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding LimitType.
     */
    @JsonCreator
    public static LimitType fromString(String name) {
        return fromString(name, LimitType.class);
    }

    /**
     * Gets known LimitType values.
     * 
     * @return known LimitType values.
     */
    public static Collection<LimitType> values() {
        return values(LimitType.class);
    }
}
