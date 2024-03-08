// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.servicefabric.models.ClusterEnvironment;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The detail of the Service Fabric runtime version result.
 */
@Fluent
public final class ClusterVersionDetails {
    /*
     * The Service Fabric runtime version of the cluster.
     */
    @JsonProperty(value = "codeVersion")
    private String codeVersion;

    /*
     * The date of expiry of support of the version.
     */
    @JsonProperty(value = "supportExpiryUtc")
    private String supportExpiryUtc;

    /*
     * Indicates if this version is for Windows or Linux operating system.
     */
    @JsonProperty(value = "environment")
    private ClusterEnvironment environment;

    /**
     * Creates an instance of ClusterVersionDetails class.
     */
    public ClusterVersionDetails() {
    }

    /**
     * Get the codeVersion property: The Service Fabric runtime version of the cluster.
     * 
     * @return the codeVersion value.
     */
    public String codeVersion() {
        return this.codeVersion;
    }

    /**
     * Set the codeVersion property: The Service Fabric runtime version of the cluster.
     * 
     * @param codeVersion the codeVersion value to set.
     * @return the ClusterVersionDetails object itself.
     */
    public ClusterVersionDetails withCodeVersion(String codeVersion) {
        this.codeVersion = codeVersion;
        return this;
    }

    /**
     * Get the supportExpiryUtc property: The date of expiry of support of the version.
     * 
     * @return the supportExpiryUtc value.
     */
    public String supportExpiryUtc() {
        return this.supportExpiryUtc;
    }

    /**
     * Set the supportExpiryUtc property: The date of expiry of support of the version.
     * 
     * @param supportExpiryUtc the supportExpiryUtc value to set.
     * @return the ClusterVersionDetails object itself.
     */
    public ClusterVersionDetails withSupportExpiryUtc(String supportExpiryUtc) {
        this.supportExpiryUtc = supportExpiryUtc;
        return this;
    }

    /**
     * Get the environment property: Indicates if this version is for Windows or Linux operating system.
     * 
     * @return the environment value.
     */
    public ClusterEnvironment environment() {
        return this.environment;
    }

    /**
     * Set the environment property: Indicates if this version is for Windows or Linux operating system.
     * 
     * @param environment the environment value to set.
     * @return the ClusterVersionDetails object itself.
     */
    public ClusterVersionDetails withEnvironment(ClusterEnvironment environment) {
        this.environment = environment;
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
