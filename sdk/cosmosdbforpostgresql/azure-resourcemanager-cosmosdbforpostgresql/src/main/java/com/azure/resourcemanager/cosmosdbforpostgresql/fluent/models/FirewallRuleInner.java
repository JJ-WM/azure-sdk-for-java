// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmosdbforpostgresql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmosdbforpostgresql.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents a cluster firewall rule. */
@Fluent
public final class FirewallRuleInner extends ProxyResource {
    /*
     * The properties of a firewall rule.
     */
    @JsonProperty(value = "properties", required = true)
    private FirewallRuleProperties innerProperties = new FirewallRuleProperties();

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of FirewallRuleInner class. */
    public FirewallRuleInner() {
    }

    /**
     * Get the innerProperties property: The properties of a firewall rule.
     *
     * @return the innerProperties value.
     */
    private FirewallRuleProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the startIpAddress property: The start IP address of the cluster firewall rule. Must be IPv4 format.
     *
     * @return the startIpAddress value.
     */
    public String startIpAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().startIpAddress();
    }

    /**
     * Set the startIpAddress property: The start IP address of the cluster firewall rule. Must be IPv4 format.
     *
     * @param startIpAddress the startIpAddress value to set.
     * @return the FirewallRuleInner object itself.
     */
    public FirewallRuleInner withStartIpAddress(String startIpAddress) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FirewallRuleProperties();
        }
        this.innerProperties().withStartIpAddress(startIpAddress);
        return this;
    }

    /**
     * Get the endIpAddress property: The end IP address of the cluster firewall rule. Must be IPv4 format.
     *
     * @return the endIpAddress value.
     */
    public String endIpAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().endIpAddress();
    }

    /**
     * Set the endIpAddress property: The end IP address of the cluster firewall rule. Must be IPv4 format.
     *
     * @param endIpAddress the endIpAddress value to set.
     * @return the FirewallRuleInner object itself.
     */
    public FirewallRuleInner withEndIpAddress(String endIpAddress) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FirewallRuleProperties();
        }
        this.innerProperties().withEndIpAddress(endIpAddress);
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the firewall rule.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model FirewallRuleInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(FirewallRuleInner.class);
}
