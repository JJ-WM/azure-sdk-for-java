// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.security.fluent.models.CustomEntityStoreAssignmentRequestProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * describes the custom entity store assignment request.
 */
@Fluent
public final class CustomEntityStoreAssignmentRequest {
    /*
     * describes properties of custom entity store assignment request
     */
    @JsonProperty(value = "properties")
    private CustomEntityStoreAssignmentRequestProperties innerProperties;

    /**
     * Creates an instance of CustomEntityStoreAssignmentRequest class.
     */
    public CustomEntityStoreAssignmentRequest() {
    }

    /**
     * Get the innerProperties property: describes properties of custom entity store assignment request.
     * 
     * @return the innerProperties value.
     */
    private CustomEntityStoreAssignmentRequestProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the principal property: The principal assigned with entity store. If not provided, will use caller
     * principal. Format of principal is: [AAD type]=[PrincipalObjectId];[TenantId].
     * 
     * @return the principal value.
     */
    public String principal() {
        return this.innerProperties() == null ? null : this.innerProperties().principal();
    }

    /**
     * Set the principal property: The principal assigned with entity store. If not provided, will use caller
     * principal. Format of principal is: [AAD type]=[PrincipalObjectId];[TenantId].
     * 
     * @param principal the principal value to set.
     * @return the CustomEntityStoreAssignmentRequest object itself.
     */
    public CustomEntityStoreAssignmentRequest withPrincipal(String principal) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomEntityStoreAssignmentRequestProperties();
        }
        this.innerProperties().withPrincipal(principal);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
