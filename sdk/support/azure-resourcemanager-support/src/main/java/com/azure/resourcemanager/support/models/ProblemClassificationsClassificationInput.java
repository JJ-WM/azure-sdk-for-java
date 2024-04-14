// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Input to problem classification Classification API.
 */
@Fluent
public final class ProblemClassificationsClassificationInput {
    /*
     * Natural language description of the customer’s issue.
     */
    @JsonProperty(value = "issueSummary", required = true)
    private String issueSummary;

    /*
     * ARM resource Id of the resource that is having the issue.
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /**
     * Creates an instance of ProblemClassificationsClassificationInput class.
     */
    public ProblemClassificationsClassificationInput() {
    }

    /**
     * Get the issueSummary property: Natural language description of the customer’s issue.
     * 
     * @return the issueSummary value.
     */
    public String issueSummary() {
        return this.issueSummary;
    }

    /**
     * Set the issueSummary property: Natural language description of the customer’s issue.
     * 
     * @param issueSummary the issueSummary value to set.
     * @return the ProblemClassificationsClassificationInput object itself.
     */
    public ProblemClassificationsClassificationInput withIssueSummary(String issueSummary) {
        this.issueSummary = issueSummary;
        return this;
    }

    /**
     * Get the resourceId property: ARM resource Id of the resource that is having the issue.
     * 
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: ARM resource Id of the resource that is having the issue.
     * 
     * @param resourceId the resourceId value to set.
     * @return the ProblemClassificationsClassificationInput object itself.
     */
    public ProblemClassificationsClassificationInput withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (issueSummary() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property issueSummary in model ProblemClassificationsClassificationInput"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ProblemClassificationsClassificationInput.class);
}
