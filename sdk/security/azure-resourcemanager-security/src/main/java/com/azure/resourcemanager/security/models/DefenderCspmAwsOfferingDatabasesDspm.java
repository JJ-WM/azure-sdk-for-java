// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The databases DSPM configuration.
 */
@Fluent
public final class DefenderCspmAwsOfferingDatabasesDspm {
    /*
     * Is databases DSPM protection enabled
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /*
     * The cloud role ARN in AWS for this feature
     */
    @JsonProperty(value = "cloudRoleArn")
    private String cloudRoleArn;

    /**
     * Creates an instance of DefenderCspmAwsOfferingDatabasesDspm class.
     */
    public DefenderCspmAwsOfferingDatabasesDspm() {
    }

    /**
     * Get the enabled property: Is databases DSPM protection enabled.
     * 
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Is databases DSPM protection enabled.
     * 
     * @param enabled the enabled value to set.
     * @return the DefenderCspmAwsOfferingDatabasesDspm object itself.
     */
    public DefenderCspmAwsOfferingDatabasesDspm withEnabled(Boolean enabled) {
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
     * @return the DefenderCspmAwsOfferingDatabasesDspm object itself.
     */
    public DefenderCspmAwsOfferingDatabasesDspm withCloudRoleArn(String cloudRoleArn) {
        this.cloudRoleArn = cloudRoleArn;
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
