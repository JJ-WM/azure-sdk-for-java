// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The reason why the name is not available. 'Invalid' indicates the name provided does not match the naming
 * requirements (incorrect length, unsupported characters, etc.). 'AlreadyExists' indicates that the name is already in
 * use and is therefore unavailable.
 */
public final class UnavailableNameReason extends ExpandableStringEnum<UnavailableNameReason> {
    /** Static value Invalid for UnavailableNameReason. */
    public static final UnavailableNameReason INVALID = fromString("Invalid");

    /** Static value AlreadyExists for UnavailableNameReason. */
    public static final UnavailableNameReason ALREADY_EXISTS = fromString("AlreadyExists");

    /**
     * Creates a new instance of UnavailableNameReason value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public UnavailableNameReason() {
    }

    /**
     * Creates or finds a UnavailableNameReason from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding UnavailableNameReason.
     */
    @JsonCreator
    public static UnavailableNameReason fromString(String name) {
        return fromString(name, UnavailableNameReason.class);
    }

    /**
     * Gets known UnavailableNameReason values.
     *
     * @return known UnavailableNameReason values.
     */
    public static Collection<UnavailableNameReason> values() {
        return values(UnavailableNameReason.class);
    }
}
