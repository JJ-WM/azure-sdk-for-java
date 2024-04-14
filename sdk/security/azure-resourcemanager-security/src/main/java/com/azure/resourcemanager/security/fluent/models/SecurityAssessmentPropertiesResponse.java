// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.models.AssessmentStatusResponse;
import com.azure.resourcemanager.security.models.ResourceDetails;
import com.azure.resourcemanager.security.models.SecurityAssessmentPartnerData;
import com.azure.resourcemanager.security.models.SecurityAssessmentPropertiesBase;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * Describes properties of an assessment.
 */
@Fluent
public final class SecurityAssessmentPropertiesResponse extends SecurityAssessmentPropertiesBase {
    /*
     * The result of the assessment
     */
    @JsonProperty(value = "status", required = true)
    private AssessmentStatusResponse status;

    /**
     * Creates an instance of SecurityAssessmentPropertiesResponse class.
     */
    public SecurityAssessmentPropertiesResponse() {
    }

    /**
     * Get the status property: The result of the assessment.
     * 
     * @return the status value.
     */
    public AssessmentStatusResponse status() {
        return this.status;
    }

    /**
     * Set the status property: The result of the assessment.
     * 
     * @param status the status value to set.
     * @return the SecurityAssessmentPropertiesResponse object itself.
     */
    public SecurityAssessmentPropertiesResponse withStatus(AssessmentStatusResponse status) {
        this.status = status;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SecurityAssessmentPropertiesResponse withResourceDetails(ResourceDetails resourceDetails) {
        super.withResourceDetails(resourceDetails);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SecurityAssessmentPropertiesResponse withAdditionalData(Map<String, String> additionalData) {
        super.withAdditionalData(additionalData);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SecurityAssessmentPropertiesResponse withMetadata(SecurityAssessmentMetadataProperties metadata) {
        super.withMetadata(metadata);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SecurityAssessmentPropertiesResponse withPartnersData(SecurityAssessmentPartnerData partnersData) {
        super.withPartnersData(partnersData);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (status() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property status in model SecurityAssessmentPropertiesResponse"));
        } else {
            status().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SecurityAssessmentPropertiesResponse.class);
}
