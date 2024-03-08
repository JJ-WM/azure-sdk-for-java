// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Provisioning state of the Client resource.
 */
public final class ClientProvisioningState extends ExpandableStringEnum<ClientProvisioningState> {
    /**
     * Static value Creating for ClientProvisioningState.
     */
    public static final ClientProvisioningState CREATING = fromString("Creating");

    /**
     * Static value Updating for ClientProvisioningState.
     */
    public static final ClientProvisioningState UPDATING = fromString("Updating");

    /**
     * Static value Deleting for ClientProvisioningState.
     */
    public static final ClientProvisioningState DELETING = fromString("Deleting");

    /**
     * Static value Succeeded for ClientProvisioningState.
     */
    public static final ClientProvisioningState SUCCEEDED = fromString("Succeeded");

    /**
     * Static value Canceled for ClientProvisioningState.
     */
    public static final ClientProvisioningState CANCELED = fromString("Canceled");

    /**
     * Static value Failed for ClientProvisioningState.
     */
    public static final ClientProvisioningState FAILED = fromString("Failed");

    /**
     * Static value Deleted for ClientProvisioningState.
     */
    public static final ClientProvisioningState DELETED = fromString("Deleted");

    /**
     * Creates a new instance of ClientProvisioningState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ClientProvisioningState() {
    }

    /**
     * Creates or finds a ClientProvisioningState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ClientProvisioningState.
     */
    @JsonCreator
    public static ClientProvisioningState fromString(String name) {
        return fromString(name, ClientProvisioningState.class);
    }

    /**
     * Gets known ClientProvisioningState values.
     * 
     * @return known ClientProvisioningState values.
     */
    public static Collection<ClientProvisioningState> values() {
        return values(ClientProvisioningState.class);
    }
}
