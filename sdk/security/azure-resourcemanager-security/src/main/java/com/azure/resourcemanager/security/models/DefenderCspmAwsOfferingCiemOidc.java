// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defender CSPM CIEM AWS OIDC (open id connect) configuration.
 */
@Fluent
public final class DefenderCspmAwsOfferingCiemOidc {
    /*
     * The cloud role ARN in AWS for CIEM oidc connection
     */
    @JsonProperty(value = "cloudRoleArn")
    private String cloudRoleArn;

    /*
     * the azure active directory app name used of authenticating against AWS
     */
    @JsonProperty(value = "azureActiveDirectoryAppName")
    private String azureActiveDirectoryAppName;

    /**
     * Creates an instance of DefenderCspmAwsOfferingCiemOidc class.
     */
    public DefenderCspmAwsOfferingCiemOidc() {
    }

    /**
     * Get the cloudRoleArn property: The cloud role ARN in AWS for CIEM oidc connection.
     * 
     * @return the cloudRoleArn value.
     */
    public String cloudRoleArn() {
        return this.cloudRoleArn;
    }

    /**
     * Set the cloudRoleArn property: The cloud role ARN in AWS for CIEM oidc connection.
     * 
     * @param cloudRoleArn the cloudRoleArn value to set.
     * @return the DefenderCspmAwsOfferingCiemOidc object itself.
     */
    public DefenderCspmAwsOfferingCiemOidc withCloudRoleArn(String cloudRoleArn) {
        this.cloudRoleArn = cloudRoleArn;
        return this;
    }

    /**
     * Get the azureActiveDirectoryAppName property: the azure active directory app name used of authenticating against
     * AWS.
     * 
     * @return the azureActiveDirectoryAppName value.
     */
    public String azureActiveDirectoryAppName() {
        return this.azureActiveDirectoryAppName;
    }

    /**
     * Set the azureActiveDirectoryAppName property: the azure active directory app name used of authenticating against
     * AWS.
     * 
     * @param azureActiveDirectoryAppName the azureActiveDirectoryAppName value to set.
     * @return the DefenderCspmAwsOfferingCiemOidc object itself.
     */
    public DefenderCspmAwsOfferingCiemOidc withAzureActiveDirectoryAppName(String azureActiveDirectoryAppName) {
        this.azureActiveDirectoryAppName = azureActiveDirectoryAppName;
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
