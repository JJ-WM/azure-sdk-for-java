// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A collection of information about the state of the connection between service consumer and provider.
 */
@Fluent
public final class PrivateLinkServiceConnectionState {
    /*
     * Indicates whether the connection has been Approved/Rejected/Removed by the owner of the service.
     */
    @JsonProperty(value = "status")
    private PrivateEndpointServiceConnectionStatus status;

    /*
     * The reason for approval/rejection of the connection.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * A message indicating if changes on the service provider require any updates on the consumer.
     */
    @JsonProperty(value = "actionsRequired")
    private String actionsRequired;

    /**
     * Creates an instance of PrivateLinkServiceConnectionState class.
     */
    public PrivateLinkServiceConnectionState() {
    }

    /**
     * Get the status property: Indicates whether the connection has been Approved/Rejected/Removed by the owner of the
     * service.
     * 
     * @return the status value.
     */
    public PrivateEndpointServiceConnectionStatus status() {
        return this.status;
    }

    /**
     * Set the status property: Indicates whether the connection has been Approved/Rejected/Removed by the owner of the
     * service.
     * 
     * @param status the status value to set.
     * @return the PrivateLinkServiceConnectionState object itself.
     */
    public PrivateLinkServiceConnectionState withStatus(PrivateEndpointServiceConnectionStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the description property: The reason for approval/rejection of the connection.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The reason for approval/rejection of the connection.
     * 
     * @param description the description value to set.
     * @return the PrivateLinkServiceConnectionState object itself.
     */
    public PrivateLinkServiceConnectionState withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the actionsRequired property: A message indicating if changes on the service provider require any updates on
     * the consumer.
     * 
     * @return the actionsRequired value.
     */
    public String actionsRequired() {
        return this.actionsRequired;
    }

    /**
     * Set the actionsRequired property: A message indicating if changes on the service provider require any updates on
     * the consumer.
     * 
     * @param actionsRequired the actionsRequired value to set.
     * @return the PrivateLinkServiceConnectionState object itself.
     */
    public PrivateLinkServiceConnectionState withActionsRequired(String actionsRequired) {
        this.actionsRequired = actionsRequired;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
