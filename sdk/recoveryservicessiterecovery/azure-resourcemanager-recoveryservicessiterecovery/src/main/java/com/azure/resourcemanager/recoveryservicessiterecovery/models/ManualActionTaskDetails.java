// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * This class represents the manual action task details.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("ManualActionTaskDetails")
@Fluent
public final class ManualActionTaskDetails extends TaskTypeDetails {
    /*
     * The name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The instructions.
     */
    @JsonProperty(value = "instructions")
    private String instructions;

    /*
     * The observation.
     */
    @JsonProperty(value = "observation")
    private String observation;

    /**
     * Creates an instance of ManualActionTaskDetails class.
     */
    public ManualActionTaskDetails() {
    }

    /**
     * Get the name property: The name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name.
     * 
     * @param name the name value to set.
     * @return the ManualActionTaskDetails object itself.
     */
    public ManualActionTaskDetails withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the instructions property: The instructions.
     * 
     * @return the instructions value.
     */
    public String instructions() {
        return this.instructions;
    }

    /**
     * Set the instructions property: The instructions.
     * 
     * @param instructions the instructions value to set.
     * @return the ManualActionTaskDetails object itself.
     */
    public ManualActionTaskDetails withInstructions(String instructions) {
        this.instructions = instructions;
        return this;
    }

    /**
     * Get the observation property: The observation.
     * 
     * @return the observation value.
     */
    public String observation() {
        return this.observation;
    }

    /**
     * Set the observation property: The observation.
     * 
     * @param observation the observation value to set.
     * @return the ManualActionTaskDetails object itself.
     */
    public ManualActionTaskDetails withObservation(String observation) {
        this.observation = observation;
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
    }
}
