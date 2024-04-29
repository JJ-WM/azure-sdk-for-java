// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.ChainingTriggerTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Trigger that allows the referenced pipeline to depend on other pipeline runs based on runDimension Name/Value pairs.
 * Upstream pipelines should declare the same runDimension Name and their runs should have the values for those
 * runDimensions. The referenced pipeline run would be triggered if the values for the runDimension match for all
 * upstream pipeline runs.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", defaultImpl = ChainingTrigger.class, visible = true)
@JsonTypeName("ChainingTrigger")
@Fluent
public final class ChainingTrigger extends Trigger {
    /*
     * Trigger type.
     */
    @JsonTypeId
    @JsonProperty(value = "type", required = true)
    private String type = "ChainingTrigger";

    /*
     * Pipeline for which runs are created when all upstream pipelines complete successfully.
     */
    @JsonProperty(value = "pipeline", required = true)
    private TriggerPipelineReference pipeline;

    /*
     * Chaining Trigger properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private ChainingTriggerTypeProperties innerTypeProperties = new ChainingTriggerTypeProperties();

    /**
     * Creates an instance of ChainingTrigger class.
     */
    public ChainingTrigger() {
    }

    /**
     * Get the type property: Trigger type.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the pipeline property: Pipeline for which runs are created when all upstream pipelines complete successfully.
     * 
     * @return the pipeline value.
     */
    public TriggerPipelineReference pipeline() {
        return this.pipeline;
    }

    /**
     * Set the pipeline property: Pipeline for which runs are created when all upstream pipelines complete successfully.
     * 
     * @param pipeline the pipeline value to set.
     * @return the ChainingTrigger object itself.
     */
    public ChainingTrigger withPipeline(TriggerPipelineReference pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /**
     * Get the innerTypeProperties property: Chaining Trigger properties.
     * 
     * @return the innerTypeProperties value.
     */
    private ChainingTriggerTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChainingTrigger withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChainingTrigger withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Get the dependsOn property: Upstream Pipelines.
     * 
     * @return the dependsOn value.
     */
    public List<PipelineReference> dependsOn() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().dependsOn();
    }

    /**
     * Set the dependsOn property: Upstream Pipelines.
     * 
     * @param dependsOn the dependsOn value to set.
     * @return the ChainingTrigger object itself.
     */
    public ChainingTrigger withDependsOn(List<PipelineReference> dependsOn) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ChainingTriggerTypeProperties();
        }
        this.innerTypeProperties().withDependsOn(dependsOn);
        return this;
    }

    /**
     * Get the runDimension property: Run Dimension property that needs to be emitted by upstream pipelines.
     * 
     * @return the runDimension value.
     */
    public String runDimension() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().runDimension();
    }

    /**
     * Set the runDimension property: Run Dimension property that needs to be emitted by upstream pipelines.
     * 
     * @param runDimension the runDimension value to set.
     * @return the ChainingTrigger object itself.
     */
    public ChainingTrigger withRunDimension(String runDimension) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ChainingTriggerTypeProperties();
        }
        this.innerTypeProperties().withRunDimension(runDimension);
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
        if (pipeline() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property pipeline in model ChainingTrigger"));
        } else {
            pipeline().validate();
        }
        if (innerTypeProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property innerTypeProperties in model ChainingTrigger"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ChainingTrigger.class);
}
