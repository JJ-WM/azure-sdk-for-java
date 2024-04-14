// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The details about the project represented by the security connector.
 */
@Fluent
public final class GcpProjectDetails {
    /*
     * The unique GCP Project number
     */
    @JsonProperty(value = "projectNumber")
    private String projectNumber;

    /*
     * The GCP Project id
     */
    @JsonProperty(value = "projectId")
    private String projectId;

    /*
     * The GCP workload identity federation pool id
     */
    @JsonProperty(value = "workloadIdentityPoolId", access = JsonProperty.Access.WRITE_ONLY)
    private String workloadIdentityPoolId;

    /*
     * GCP project name
     */
    @JsonProperty(value = "projectName", access = JsonProperty.Access.WRITE_ONLY)
    private String projectName;

    /**
     * Creates an instance of GcpProjectDetails class.
     */
    public GcpProjectDetails() {
    }

    /**
     * Get the projectNumber property: The unique GCP Project number.
     * 
     * @return the projectNumber value.
     */
    public String projectNumber() {
        return this.projectNumber;
    }

    /**
     * Set the projectNumber property: The unique GCP Project number.
     * 
     * @param projectNumber the projectNumber value to set.
     * @return the GcpProjectDetails object itself.
     */
    public GcpProjectDetails withProjectNumber(String projectNumber) {
        this.projectNumber = projectNumber;
        return this;
    }

    /**
     * Get the projectId property: The GCP Project id.
     * 
     * @return the projectId value.
     */
    public String projectId() {
        return this.projectId;
    }

    /**
     * Set the projectId property: The GCP Project id.
     * 
     * @param projectId the projectId value to set.
     * @return the GcpProjectDetails object itself.
     */
    public GcpProjectDetails withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * Get the workloadIdentityPoolId property: The GCP workload identity federation pool id.
     * 
     * @return the workloadIdentityPoolId value.
     */
    public String workloadIdentityPoolId() {
        return this.workloadIdentityPoolId;
    }

    /**
     * Get the projectName property: GCP project name.
     * 
     * @return the projectName value.
     */
    public String projectName() {
        return this.projectName;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
