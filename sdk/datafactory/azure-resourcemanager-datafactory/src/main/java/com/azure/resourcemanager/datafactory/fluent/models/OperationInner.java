// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.datafactory.models.OperationDisplay;
import com.azure.resourcemanager.datafactory.models.OperationServiceSpecification;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Azure Data Factory API operation definition.
 */
@Fluent
public final class OperationInner {
    /*
     * Operation name: {provider}/{resource}/{operation}
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The intended executor of the operation.
     */
    @JsonProperty(value = "origin")
    private String origin;

    /*
     * Metadata associated with the operation.
     */
    @JsonProperty(value = "display")
    private OperationDisplay display;

    /*
     * Additional details about the operation.
     */
    @JsonProperty(value = "properties")
    private OperationProperties innerProperties;

    /**
     * Creates an instance of OperationInner class.
     */
    public OperationInner() {
    }

    /**
     * Get the name property: Operation name: {provider}/{resource}/{operation}.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Operation name: {provider}/{resource}/{operation}.
     * 
     * @param name the name value to set.
     * @return the OperationInner object itself.
     */
    public OperationInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the origin property: The intended executor of the operation.
     * 
     * @return the origin value.
     */
    public String origin() {
        return this.origin;
    }

    /**
     * Set the origin property: The intended executor of the operation.
     * 
     * @param origin the origin value to set.
     * @return the OperationInner object itself.
     */
    public OperationInner withOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    /**
     * Get the display property: Metadata associated with the operation.
     * 
     * @return the display value.
     */
    public OperationDisplay display() {
        return this.display;
    }

    /**
     * Set the display property: Metadata associated with the operation.
     * 
     * @param display the display value to set.
     * @return the OperationInner object itself.
     */
    public OperationInner withDisplay(OperationDisplay display) {
        this.display = display;
        return this;
    }

    /**
     * Get the innerProperties property: Additional details about the operation.
     * 
     * @return the innerProperties value.
     */
    private OperationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the serviceSpecification property: Details about a service operation.
     * 
     * @return the serviceSpecification value.
     */
    public OperationServiceSpecification serviceSpecification() {
        return this.innerProperties() == null ? null : this.innerProperties().serviceSpecification();
    }

    /**
     * Set the serviceSpecification property: Details about a service operation.
     * 
     * @param serviceSpecification the serviceSpecification value to set.
     * @return the OperationInner object itself.
     */
    public OperationInner withServiceSpecification(OperationServiceSpecification serviceSpecification) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OperationProperties();
        }
        this.innerProperties().withServiceSpecification(serviceSpecification);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (display() != null) {
            display().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
