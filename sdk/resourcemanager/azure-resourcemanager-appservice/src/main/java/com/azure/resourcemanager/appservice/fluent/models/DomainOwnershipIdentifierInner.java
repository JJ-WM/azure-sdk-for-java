// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Domain ownership Identifier.
 */
@Fluent
public final class DomainOwnershipIdentifierInner extends ProxyOnlyResource {
    /*
     * DomainOwnershipIdentifier resource specific properties
     */
    @JsonProperty(value = "properties")
    private DomainOwnershipIdentifierProperties innerProperties;

    /**
     * Creates an instance of DomainOwnershipIdentifierInner class.
     */
    public DomainOwnershipIdentifierInner() {
    }

    /**
     * Get the innerProperties property: DomainOwnershipIdentifier resource specific properties.
     * 
     * @return the innerProperties value.
     */
    private DomainOwnershipIdentifierProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DomainOwnershipIdentifierInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the ownershipId property: Ownership Id.
     * 
     * @return the ownershipId value.
     */
    public String ownershipId() {
        return this.innerProperties() == null ? null : this.innerProperties().ownershipId();
    }

    /**
     * Set the ownershipId property: Ownership Id.
     * 
     * @param ownershipId the ownershipId value to set.
     * @return the DomainOwnershipIdentifierInner object itself.
     */
    public DomainOwnershipIdentifierInner withOwnershipId(String ownershipId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DomainOwnershipIdentifierProperties();
        }
        this.innerProperties().withOwnershipId(ownershipId);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
