// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quantum.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information about a Provider. A Provider is an entity that offers Targets to run Azure Quantum Jobs. */
@Fluent
public final class Provider {
    /*
     * Unique id of this provider.
     */
    @JsonProperty(value = "providerId")
    private String providerId;

    /*
     * The sku associated with pricing information for this provider.
     */
    @JsonProperty(value = "providerSku")
    private String providerSku;

    /*
     * A Uri identifying the specific instance of this provider.
     */
    @JsonProperty(value = "instanceUri")
    private String instanceUri;

    /*
     * The provider's marketplace application display name.
     */
    @JsonProperty(value = "applicationName")
    private String applicationName;

    /*
     * Provisioning status field
     */
    @JsonProperty(value = "provisioningState")
    private Status provisioningState;

    /*
     * Id to track resource usage for the provider.
     */
    @JsonProperty(value = "resourceUsageId")
    private String resourceUsageId;

    /** Creates an instance of Provider class. */
    public Provider() {
    }

    /**
     * Get the providerId property: Unique id of this provider.
     *
     * @return the providerId value.
     */
    public String providerId() {
        return this.providerId;
    }

    /**
     * Set the providerId property: Unique id of this provider.
     *
     * @param providerId the providerId value to set.
     * @return the Provider object itself.
     */
    public Provider withProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }

    /**
     * Get the providerSku property: The sku associated with pricing information for this provider.
     *
     * @return the providerSku value.
     */
    public String providerSku() {
        return this.providerSku;
    }

    /**
     * Set the providerSku property: The sku associated with pricing information for this provider.
     *
     * @param providerSku the providerSku value to set.
     * @return the Provider object itself.
     */
    public Provider withProviderSku(String providerSku) {
        this.providerSku = providerSku;
        return this;
    }

    /**
     * Get the instanceUri property: A Uri identifying the specific instance of this provider.
     *
     * @return the instanceUri value.
     */
    public String instanceUri() {
        return this.instanceUri;
    }

    /**
     * Set the instanceUri property: A Uri identifying the specific instance of this provider.
     *
     * @param instanceUri the instanceUri value to set.
     * @return the Provider object itself.
     */
    public Provider withInstanceUri(String instanceUri) {
        this.instanceUri = instanceUri;
        return this;
    }

    /**
     * Get the applicationName property: The provider's marketplace application display name.
     *
     * @return the applicationName value.
     */
    public String applicationName() {
        return this.applicationName;
    }

    /**
     * Set the applicationName property: The provider's marketplace application display name.
     *
     * @param applicationName the applicationName value to set.
     * @return the Provider object itself.
     */
    public Provider withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning status field.
     *
     * @return the provisioningState value.
     */
    public Status provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: Provisioning status field.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the Provider object itself.
     */
    public Provider withProvisioningState(Status provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the resourceUsageId property: Id to track resource usage for the provider.
     *
     * @return the resourceUsageId value.
     */
    public String resourceUsageId() {
        return this.resourceUsageId;
    }

    /**
     * Set the resourceUsageId property: Id to track resource usage for the provider.
     *
     * @param resourceUsageId the resourceUsageId value to set.
     * @return the Provider object itself.
     */
    public Provider withResourceUsageId(String resourceUsageId) {
        this.resourceUsageId = resourceUsageId;
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
