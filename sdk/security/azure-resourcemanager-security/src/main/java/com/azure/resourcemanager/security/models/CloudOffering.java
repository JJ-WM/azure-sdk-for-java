// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The security offering details. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "offeringType",
    defaultImpl = CloudOffering.class)
@JsonTypeName("CloudOffering")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "CspmMonitorAws", value = CspmMonitorAwsOffering.class),
    @JsonSubTypes.Type(name = "DefenderForContainersAws", value = DefenderForContainersAwsOffering.class),
    @JsonSubTypes.Type(name = "DefenderForServersAws", value = DefenderForServersAwsOffering.class),
    @JsonSubTypes.Type(name = "DefenderForDatabasesAws", value = DefenderFoDatabasesAwsOffering.class),
    @JsonSubTypes.Type(name = "InformationProtectionAws", value = InformationProtectionAwsOffering.class),
    @JsonSubTypes.Type(name = "CspmMonitorGcp", value = CspmMonitorGcpOffering.class),
    @JsonSubTypes.Type(name = "DefenderForServersGcp", value = DefenderForServersGcpOffering.class),
    @JsonSubTypes.Type(name = "DefenderForDatabasesGcp", value = DefenderForDatabasesGcpOffering.class),
    @JsonSubTypes.Type(name = "DefenderForContainersGcp", value = DefenderForContainersGcpOffering.class),
    @JsonSubTypes.Type(name = "CspmMonitorGithub", value = CspmMonitorGithubOffering.class),
    @JsonSubTypes.Type(name = "CspmMonitorAzureDevOps", value = CspmMonitorAzureDevOpsOffering.class),
    @JsonSubTypes.Type(name = "DefenderCspmAws", value = DefenderCspmAwsOffering.class),
    @JsonSubTypes.Type(name = "DefenderCspmGcp", value = DefenderCspmGcpOffering.class),
    @JsonSubTypes.Type(name = "DefenderForDevOpsGithub", value = DefenderForDevOpsGithubOffering.class),
    @JsonSubTypes.Type(name = "DefenderForDevOpsAzureDevOps", value = DefenderForDevOpsAzureDevOpsOffering.class),
    @JsonSubTypes.Type(name = "CspmMonitorGitLab", value = CspmMonitorGitLabOffering.class),
    @JsonSubTypes.Type(name = "DefenderForDevOpsGitLab", value = DefenderForDevOpsGitLabOffering.class)
})
@Immutable
public class CloudOffering {
    /*
     * The offering description.
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /** Creates an instance of CloudOffering class. */
    public CloudOffering() {
    }

    /**
     * Get the description property: The offering description.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
