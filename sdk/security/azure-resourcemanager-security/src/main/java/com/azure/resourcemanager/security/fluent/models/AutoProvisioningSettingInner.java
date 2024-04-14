// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.security.models.AutoProvision;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto provisioning setting.
 */
@Fluent
public final class AutoProvisioningSettingInner extends ProxyResource {
    /*
     * Auto provisioning setting data
     */
    @JsonProperty(value = "properties")
    private AutoProvisioningSettingProperties innerProperties;

    /**
     * Creates an instance of AutoProvisioningSettingInner class.
     */
    public AutoProvisioningSettingInner() {
    }

    /**
     * Get the innerProperties property: Auto provisioning setting data.
     * 
     * @return the innerProperties value.
     */
    private AutoProvisioningSettingProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the autoProvision property: Describes what kind of security agent provisioning action to take.
     * 
     * @return the autoProvision value.
     */
    public AutoProvision autoProvision() {
        return this.innerProperties() == null ? null : this.innerProperties().autoProvision();
    }

    /**
     * Set the autoProvision property: Describes what kind of security agent provisioning action to take.
     * 
     * @param autoProvision the autoProvision value to set.
     * @return the AutoProvisioningSettingInner object itself.
     */
    public AutoProvisioningSettingInner withAutoProvision(AutoProvision autoProvision) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AutoProvisioningSettingProperties();
        }
        this.innerProperties().withAutoProvision(autoProvision);
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
