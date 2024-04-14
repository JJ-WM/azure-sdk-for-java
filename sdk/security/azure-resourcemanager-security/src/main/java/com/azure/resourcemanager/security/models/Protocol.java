// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for Protocol.
 */
public final class Protocol extends ExpandableStringEnum<Protocol> {
    /**
     * Static value TCP for Protocol.
     */
    public static final Protocol TCP = fromString("TCP");

    /**
     * Static value UDP for Protocol.
     */
    public static final Protocol UDP = fromString("UDP");

    /**
     * Static value * for Protocol.
     */
    public static final Protocol ASTERISK = fromString("*");

    /**
     * Creates a new instance of Protocol value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public Protocol() {
    }

    /**
     * Creates or finds a Protocol from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding Protocol.
     */
    @JsonCreator
    public static Protocol fromString(String name) {
        return fromString(name, Protocol.class);
    }

    /**
     * Gets known Protocol values.
     * 
     * @return known Protocol values.
     */
    public static Collection<Protocol> values() {
        return values(Protocol.class);
    }
}
