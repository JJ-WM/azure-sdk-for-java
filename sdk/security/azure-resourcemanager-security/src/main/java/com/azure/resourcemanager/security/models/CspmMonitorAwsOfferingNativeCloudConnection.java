// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The native cloud connection configuration.
 */
@Fluent
public final class CspmMonitorAwsOfferingNativeCloudConnection {
    /*
     * The cloud role ARN in AWS for this feature
     */
    @JsonProperty(value = "cloudRoleArn")
    private String cloudRoleArn;

    /**
     * Creates an instance of CspmMonitorAwsOfferingNativeCloudConnection class.
     */
    public CspmMonitorAwsOfferingNativeCloudConnection() {
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
     * @return the CspmMonitorAwsOfferingNativeCloudConnection object itself.
     */
    public CspmMonitorAwsOfferingNativeCloudConnection withCloudRoleArn(String cloudRoleArn) {
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
