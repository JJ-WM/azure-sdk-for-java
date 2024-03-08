// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloadssapvirtualinstance.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines the provisioning states.
 */
public final class SapVirtualInstanceProvisioningState
    extends ExpandableStringEnum<SapVirtualInstanceProvisioningState> {
    /**
     * Static value Succeeded for SapVirtualInstanceProvisioningState.
     */
    public static final SapVirtualInstanceProvisioningState SUCCEEDED = fromString("Succeeded");

    /**
     * Static value Updating for SapVirtualInstanceProvisioningState.
     */
    public static final SapVirtualInstanceProvisioningState UPDATING = fromString("Updating");

    /**
     * Static value Creating for SapVirtualInstanceProvisioningState.
     */
    public static final SapVirtualInstanceProvisioningState CREATING = fromString("Creating");

    /**
     * Static value Failed for SapVirtualInstanceProvisioningState.
     */
    public static final SapVirtualInstanceProvisioningState FAILED = fromString("Failed");

    /**
     * Static value Deleting for SapVirtualInstanceProvisioningState.
     */
    public static final SapVirtualInstanceProvisioningState DELETING = fromString("Deleting");

    /**
     * Static value Canceled for SapVirtualInstanceProvisioningState.
     */
    public static final SapVirtualInstanceProvisioningState CANCELED = fromString("Canceled");

    /**
     * Creates a new instance of SapVirtualInstanceProvisioningState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SapVirtualInstanceProvisioningState() {
    }

    /**
     * Creates or finds a SapVirtualInstanceProvisioningState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding SapVirtualInstanceProvisioningState.
     */
    @JsonCreator
    public static SapVirtualInstanceProvisioningState fromString(String name) {
        return fromString(name, SapVirtualInstanceProvisioningState.class);
    }

    /**
     * Gets known SapVirtualInstanceProvisioningState values.
     * 
     * @return known SapVirtualInstanceProvisioningState values.
     */
    public static Collection<SapVirtualInstanceProvisioningState> values() {
        return values(SapVirtualInstanceProvisioningState.class);
    }
}
