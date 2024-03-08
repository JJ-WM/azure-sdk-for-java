// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apicenter.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Assignment metadata.
 */
@Fluent
public final class MetadataAssignment {
    /*
     * The entities this metadata schema component gets applied to.
     */
    @JsonProperty(value = "entity")
    private MetadataAssignmentEntity entity;

    /*
     * Required assignment
     */
    @JsonProperty(value = "required")
    private Boolean required;

    /*
     * Deprecated assignment
     */
    @JsonProperty(value = "deprecated")
    private Boolean deprecated;

    /**
     * Creates an instance of MetadataAssignment class.
     */
    public MetadataAssignment() {
    }

    /**
     * Get the entity property: The entities this metadata schema component gets applied to.
     * 
     * @return the entity value.
     */
    public MetadataAssignmentEntity entity() {
        return this.entity;
    }

    /**
     * Set the entity property: The entities this metadata schema component gets applied to.
     * 
     * @param entity the entity value to set.
     * @return the MetadataAssignment object itself.
     */
    public MetadataAssignment withEntity(MetadataAssignmentEntity entity) {
        this.entity = entity;
        return this;
    }

    /**
     * Get the required property: Required assignment.
     * 
     * @return the required value.
     */
    public Boolean required() {
        return this.required;
    }

    /**
     * Set the required property: Required assignment.
     * 
     * @param required the required value to set.
     * @return the MetadataAssignment object itself.
     */
    public MetadataAssignment withRequired(Boolean required) {
        this.required = required;
        return this;
    }

    /**
     * Get the deprecated property: Deprecated assignment.
     * 
     * @return the deprecated value.
     */
    public Boolean deprecated() {
        return this.deprecated;
    }

    /**
     * Set the deprecated property: Deprecated assignment.
     * 
     * @param deprecated the deprecated value to set.
     * @return the MetadataAssignment object itself.
     */
    public MetadataAssignment withDeprecated(Boolean deprecated) {
        this.deprecated = deprecated;
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
