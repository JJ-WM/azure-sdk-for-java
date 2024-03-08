// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Provisioning state of the partner configuration.
 */
public final class PartnerConfigurationProvisioningState
    extends ExpandableStringEnum<PartnerConfigurationProvisioningState> {
    /**
     * Static value Creating for PartnerConfigurationProvisioningState.
     */
    public static final PartnerConfigurationProvisioningState CREATING = fromString("Creating");

    /**
     * Static value Updating for PartnerConfigurationProvisioningState.
     */
    public static final PartnerConfigurationProvisioningState UPDATING = fromString("Updating");

    /**
     * Static value Deleting for PartnerConfigurationProvisioningState.
     */
    public static final PartnerConfigurationProvisioningState DELETING = fromString("Deleting");

    /**
     * Static value Succeeded for PartnerConfigurationProvisioningState.
     */
    public static final PartnerConfigurationProvisioningState SUCCEEDED = fromString("Succeeded");

    /**
     * Static value Canceled for PartnerConfigurationProvisioningState.
     */
    public static final PartnerConfigurationProvisioningState CANCELED = fromString("Canceled");

    /**
     * Static value Failed for PartnerConfigurationProvisioningState.
     */
    public static final PartnerConfigurationProvisioningState FAILED = fromString("Failed");

    /**
     * Creates a new instance of PartnerConfigurationProvisioningState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PartnerConfigurationProvisioningState() {
    }

    /**
     * Creates or finds a PartnerConfigurationProvisioningState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding PartnerConfigurationProvisioningState.
     */
    @JsonCreator
    public static PartnerConfigurationProvisioningState fromString(String name) {
        return fromString(name, PartnerConfigurationProvisioningState.class);
    }

    /**
     * Gets known PartnerConfigurationProvisioningState values.
     * 
     * @return known PartnerConfigurationProvisioningState values.
     */
    public static Collection<PartnerConfigurationProvisioningState> values() {
        return values(PartnerConfigurationProvisioningState.class);
    }
}
