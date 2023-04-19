// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ARC autoprovisioning configuration. */
@Fluent
public final class DefenderFoDatabasesAwsOfferingArcAutoProvisioning {
    /*
     * Is arc auto provisioning enabled
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /*
     * The cloud role ARN in AWS for this feature
     */
    @JsonProperty(value = "cloudRoleArn")
    private String cloudRoleArn;

    /*
     * Configuration for servers Arc auto provisioning
     */
    @JsonProperty(value = "configuration")
    private DefenderFoDatabasesAwsOfferingArcAutoProvisioningConfiguration configuration;

    /** Creates an instance of DefenderFoDatabasesAwsOfferingArcAutoProvisioning class. */
    public DefenderFoDatabasesAwsOfferingArcAutoProvisioning() {
    }

    /**
     * Get the enabled property: Is arc auto provisioning enabled.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Is arc auto provisioning enabled.
     *
     * @param enabled the enabled value to set.
     * @return the DefenderFoDatabasesAwsOfferingArcAutoProvisioning object itself.
     */
    public DefenderFoDatabasesAwsOfferingArcAutoProvisioning withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the cloudRoleArn property: The cloud role ARN in AWS for this feature.
     *
     * @return the cloudRoleArn value.
     */
    public String cloudRoleArn() {
        return this.cloudRoleArn;
    }

    /**
     * Set the cloudRoleArn property: The cloud role ARN in AWS for this feature.
     *
     * @param cloudRoleArn the cloudRoleArn value to set.
     * @return the DefenderFoDatabasesAwsOfferingArcAutoProvisioning object itself.
     */
    public DefenderFoDatabasesAwsOfferingArcAutoProvisioning withCloudRoleArn(String cloudRoleArn) {
        this.cloudRoleArn = cloudRoleArn;
        return this;
    }

    /**
     * Get the configuration property: Configuration for servers Arc auto provisioning.
     *
     * @return the configuration value.
     */
    public DefenderFoDatabasesAwsOfferingArcAutoProvisioningConfiguration configuration() {
        return this.configuration;
    }

    /**
     * Set the configuration property: Configuration for servers Arc auto provisioning.
     *
     * @param configuration the configuration value to set.
     * @return the DefenderFoDatabasesAwsOfferingArcAutoProvisioning object itself.
     */
    public DefenderFoDatabasesAwsOfferingArcAutoProvisioning withConfiguration(
        DefenderFoDatabasesAwsOfferingArcAutoProvisioningConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (configuration() != null) {
            configuration().validate();
        }
    }
}
