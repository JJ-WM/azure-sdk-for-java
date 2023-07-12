// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Primary encryption key status for Data encryption enabled server. */
public final class KeyStatusEnum extends ExpandableStringEnum<KeyStatusEnum> {
    /** Static value Valid for KeyStatusEnum. */
    public static final KeyStatusEnum VALID = fromString("Valid");

    /** Static value Invalid for KeyStatusEnum. */
    public static final KeyStatusEnum INVALID = fromString("Invalid");

    /**
     * Creates a new instance of KeyStatusEnum value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public KeyStatusEnum() {
    }

    /**
     * Creates or finds a KeyStatusEnum from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding KeyStatusEnum.
     */
    @JsonCreator
    public static KeyStatusEnum fromString(String name) {
        return fromString(name, KeyStatusEnum.class);
    }

    /**
     * Gets known KeyStatusEnum values.
     *
     * @return known KeyStatusEnum values.
     */
    public static Collection<KeyStatusEnum> values() {
        return values(KeyStatusEnum.class);
    }
}
