// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** AuthenticationType to be used for connection. */
public final class SybaseAuthenticationType extends ExpandableStringEnum<SybaseAuthenticationType> {
    /** Static value Basic for SybaseAuthenticationType. */
    public static final SybaseAuthenticationType BASIC = fromString("Basic");

    /** Static value Windows for SybaseAuthenticationType. */
    public static final SybaseAuthenticationType WINDOWS = fromString("Windows");

    /**
     * Creates a new instance of SybaseAuthenticationType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SybaseAuthenticationType() {}

    /**
     * Creates or finds a SybaseAuthenticationType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SybaseAuthenticationType.
     */
    @JsonCreator
    public static SybaseAuthenticationType fromString(String name) {
        return fromString(name, SybaseAuthenticationType.class);
    }

    /**
     * Gets known SybaseAuthenticationType values.
     *
     * @return known SybaseAuthenticationType values.
     */
    public static Collection<SybaseAuthenticationType> values() {
        return values(SybaseAuthenticationType.class);
    }
}
