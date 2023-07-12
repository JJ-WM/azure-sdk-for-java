// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** community action types. Example: Permit | Deny. */
public final class CommunityActionTypes extends ExpandableStringEnum<CommunityActionTypes> {
    /** Static value Permit for CommunityActionTypes. */
    public static final CommunityActionTypes PERMIT = fromString("Permit");

    /** Static value Deny for CommunityActionTypes. */
    public static final CommunityActionTypes DENY = fromString("Deny");

    /**
     * Creates a new instance of CommunityActionTypes value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public CommunityActionTypes() {
    }

    /**
     * Creates or finds a CommunityActionTypes from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CommunityActionTypes.
     */
    @JsonCreator
    public static CommunityActionTypes fromString(String name) {
        return fromString(name, CommunityActionTypes.class);
    }

    /**
     * Gets known CommunityActionTypes values.
     *
     * @return known CommunityActionTypes values.
     */
    public static Collection<CommunityActionTypes> values() {
        return values(CommunityActionTypes.class);
    }
}
