// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The OsProfileUpdateLinuxConfiguration model. */
@Fluent
public final class OsProfileUpdateLinuxConfiguration {
    /*
     * Used to indicate whether Arc for Servers agent onboarding should be triggered during the virtual machine
     * instance creation process.
     */
    @JsonProperty(value = "provisionVMAgent")
    private Boolean provisionVMAgent;

    /*
     * Used to indicate whether the VM Config Agent should be installed during the virtual machine creation process.
     */
    @JsonProperty(value = "provisionVMConfigAgent")
    private Boolean provisionVMConfigAgent;

    /** Creates an instance of OsProfileUpdateLinuxConfiguration class. */
    public OsProfileUpdateLinuxConfiguration() {
    }

    /**
     * Get the provisionVMAgent property: Used to indicate whether Arc for Servers agent onboarding should be triggered
     * during the virtual machine instance creation process.
     *
     * @return the provisionVMAgent value.
     */
    public Boolean provisionVMAgent() {
        return this.provisionVMAgent;
    }

    /**
     * Set the provisionVMAgent property: Used to indicate whether Arc for Servers agent onboarding should be triggered
     * during the virtual machine instance creation process.
     *
     * @param provisionVMAgent the provisionVMAgent value to set.
     * @return the OsProfileUpdateLinuxConfiguration object itself.
     */
    public OsProfileUpdateLinuxConfiguration withProvisionVMAgent(Boolean provisionVMAgent) {
        this.provisionVMAgent = provisionVMAgent;
        return this;
    }

    /**
     * Get the provisionVMConfigAgent property: Used to indicate whether the VM Config Agent should be installed during
     * the virtual machine creation process.
     *
     * @return the provisionVMConfigAgent value.
     */
    public Boolean provisionVMConfigAgent() {
        return this.provisionVMConfigAgent;
    }

    /**
     * Set the provisionVMConfigAgent property: Used to indicate whether the VM Config Agent should be installed during
     * the virtual machine creation process.
     *
     * @param provisionVMConfigAgent the provisionVMConfigAgent value to set.
     * @return the OsProfileUpdateLinuxConfiguration object itself.
     */
    public OsProfileUpdateLinuxConfiguration withProvisionVMConfigAgent(Boolean provisionVMConfigAgent) {
        this.provisionVMConfigAgent = provisionVMConfigAgent;
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
