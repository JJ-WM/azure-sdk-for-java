// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The GroupQuotaSubscriptionIdProperties model.
 */
@Immutable
public final class GroupQuotaSubscriptionIdProperties {
    /*
     * An Azure subscriptionId.
     */
    @JsonProperty(value = "subscriptionId", access = JsonProperty.Access.WRITE_ONLY)
    private String subscriptionId;

    /*
     * Status of this subscriptionId being associated with the GroupQuotasEntity.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private RequestState provisioningState;

    /**
     * Creates an instance of GroupQuotaSubscriptionIdProperties class.
     */
    public GroupQuotaSubscriptionIdProperties() {
    }

    /**
     * Get the subscriptionId property: An Azure subscriptionId.
     * 
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Get the provisioningState property: Status of this subscriptionId being associated with the GroupQuotasEntity.
     * 
     * @return the provisioningState value.
     */
    public RequestState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
