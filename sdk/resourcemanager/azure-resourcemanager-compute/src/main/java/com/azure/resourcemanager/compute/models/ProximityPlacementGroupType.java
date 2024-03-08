// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Specifies the type of the proximity placement group. Possible values are: **Standard** : Co-locate resources within
 * an Azure region or Availability Zone. **Ultra** : For future use.
 */
public final class ProximityPlacementGroupType extends ExpandableStringEnum<ProximityPlacementGroupType> {
    /**
     * Static value Standard for ProximityPlacementGroupType.
     */
    public static final ProximityPlacementGroupType STANDARD = fromString("Standard");

    /**
     * Static value Ultra for ProximityPlacementGroupType.
     */
    public static final ProximityPlacementGroupType ULTRA = fromString("Ultra");

    /**
     * Creates a new instance of ProximityPlacementGroupType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ProximityPlacementGroupType() {
    }

    /**
     * Creates or finds a ProximityPlacementGroupType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ProximityPlacementGroupType.
     */
    @JsonCreator
    public static ProximityPlacementGroupType fromString(String name) {
        return fromString(name, ProximityPlacementGroupType.class);
    }

    /**
     * Gets known ProximityPlacementGroupType values.
     * 
     * @return known ProximityPlacementGroupType values.
     */
    public static Collection<ProximityPlacementGroupType> values() {
        return values(ProximityPlacementGroupType.class);
    }
}
