// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The current scope connection state.
 */
public final class ScopeConnectionState extends ExpandableStringEnum<ScopeConnectionState> {
    /**
     * Static value Connected for ScopeConnectionState.
     */
    public static final ScopeConnectionState CONNECTED = fromString("Connected");

    /**
     * Static value Pending for ScopeConnectionState.
     */
    public static final ScopeConnectionState PENDING = fromString("Pending");

    /**
     * Static value Conflict for ScopeConnectionState.
     */
    public static final ScopeConnectionState CONFLICT = fromString("Conflict");

    /**
     * Static value Revoked for ScopeConnectionState.
     */
    public static final ScopeConnectionState REVOKED = fromString("Revoked");

    /**
     * Static value Rejected for ScopeConnectionState.
     */
    public static final ScopeConnectionState REJECTED = fromString("Rejected");

    /**
     * Creates a new instance of ScopeConnectionState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ScopeConnectionState() {
    }

    /**
     * Creates or finds a ScopeConnectionState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ScopeConnectionState.
     */
    @JsonCreator
    public static ScopeConnectionState fromString(String name) {
        return fromString(name, ScopeConnectionState.class);
    }

    /**
     * Gets known ScopeConnectionState values.
     * 
     * @return known ScopeConnectionState values.
     */
    public static Collection<ScopeConnectionState> values() {
        return values(ScopeConnectionState.class);
    }
}
