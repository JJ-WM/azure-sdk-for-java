// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * This property defines the upgrade mode for the virtual machine scale set, it is mandatory if a node type with
 * multiple Availability Zones is added.
 */
public final class VmssZonalUpgradeMode extends ExpandableStringEnum<VmssZonalUpgradeMode> {
    /**
     * Static value Parallel for VmssZonalUpgradeMode.
     */
    public static final VmssZonalUpgradeMode PARALLEL = fromString("Parallel");

    /**
     * Static value Hierarchical for VmssZonalUpgradeMode.
     */
    public static final VmssZonalUpgradeMode HIERARCHICAL = fromString("Hierarchical");

    /**
     * Creates a new instance of VmssZonalUpgradeMode value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public VmssZonalUpgradeMode() {
    }

    /**
     * Creates or finds a VmssZonalUpgradeMode from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding VmssZonalUpgradeMode.
     */
    @JsonCreator
    public static VmssZonalUpgradeMode fromString(String name) {
        return fromString(name, VmssZonalUpgradeMode.class);
    }

    /**
     * Gets known VmssZonalUpgradeMode values.
     * 
     * @return known VmssZonalUpgradeMode values.
     */
    public static Collection<VmssZonalUpgradeMode> values() {
        return values(VmssZonalUpgradeMode.class);
    }
}
