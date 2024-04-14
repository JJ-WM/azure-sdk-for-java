// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.security.fluent.models.ExternalSecuritySolutionInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Represents an AAD identity protection solution which sends logs to an OMS workspace.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("AAD")
@Fluent
public final class AadExternalSecuritySolution extends ExternalSecuritySolutionInner {
    /*
     * The external security solution properties for AAD solutions
     */
    @JsonProperty(value = "properties")
    private AadSolutionProperties properties;

    /**
     * Creates an instance of AadExternalSecuritySolution class.
     */
    public AadExternalSecuritySolution() {
    }

    /**
     * Get the properties property: The external security solution properties for AAD solutions.
     * 
     * @return the properties value.
     */
    public AadSolutionProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The external security solution properties for AAD solutions.
     * 
     * @param properties the properties value to set.
     * @return the AadExternalSecuritySolution object itself.
     */
    public AadExternalSecuritySolution withProperties(AadSolutionProperties properties) {
        this.properties = properties;
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
        if (properties() != null) {
            properties().validate();
        }
    }
}
