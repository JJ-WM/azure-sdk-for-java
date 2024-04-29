// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Pipeline reference type.
 */
@Fluent
public final class PipelineReference {
    /*
     * Pipeline reference type.
     */
    @JsonProperty(value = "type", required = true)
    private String type = "PipelineReference";

    /*
     * Reference pipeline name.
     */
    @JsonProperty(value = "referenceName", required = true)
    private String referenceName;

    /*
     * Reference name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Creates an instance of PipelineReference class.
     */
    public PipelineReference() {
    }

    /**
     * Get the type property: Pipeline reference type.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Pipeline reference type.
     * 
     * @param type the type value to set.
     * @return the PipelineReference object itself.
     */
    public PipelineReference withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the referenceName property: Reference pipeline name.
     * 
     * @return the referenceName value.
     */
    public String referenceName() {
        return this.referenceName;
    }

    /**
     * Set the referenceName property: Reference pipeline name.
     * 
     * @param referenceName the referenceName value to set.
     * @return the PipelineReference object itself.
     */
    public PipelineReference withReferenceName(String referenceName) {
        this.referenceName = referenceName;
        return this;
    }

    /**
     * Get the name property: Reference name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Reference name.
     * 
     * @param name the name value to set.
     * @return the PipelineReference object itself.
     */
    public PipelineReference withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (referenceName() == null) {
            throw LOGGER.atError()
                .log(
                    new IllegalArgumentException("Missing required property referenceName in model PipelineReference"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PipelineReference.class);
}
