// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Trigger DataMove Request.
 */
@Fluent
public final class TriggerDataMoveRequest {
    /*
     * ARM Id of source vault
     */
    @JsonProperty(value = "sourceResourceId", required = true)
    private String sourceResourceId;

    /*
     * Source Region
     */
    @JsonProperty(value = "sourceRegion", required = true)
    private String sourceRegion;

    /*
     * DataMove Level
     */
    @JsonProperty(value = "dataMoveLevel", required = true)
    private DataMoveLevel dataMoveLevel;

    /*
     * Correlation Id
     */
    @JsonProperty(value = "correlationId", required = true)
    private String correlationId;

    /*
     * Source Container ArmIds
     */
    @JsonProperty(value = "sourceContainerArmIds")
    private List<String> sourceContainerArmIds;

    /*
     * Pause GC
     */
    @JsonProperty(value = "pauseGC")
    private Boolean pauseGC;

    /**
     * Creates an instance of TriggerDataMoveRequest class.
     */
    public TriggerDataMoveRequest() {
    }

    /**
     * Get the sourceResourceId property: ARM Id of source vault.
     * 
     * @return the sourceResourceId value.
     */
    public String sourceResourceId() {
        return this.sourceResourceId;
    }

    /**
     * Set the sourceResourceId property: ARM Id of source vault.
     * 
     * @param sourceResourceId the sourceResourceId value to set.
     * @return the TriggerDataMoveRequest object itself.
     */
    public TriggerDataMoveRequest withSourceResourceId(String sourceResourceId) {
        this.sourceResourceId = sourceResourceId;
        return this;
    }

    /**
     * Get the sourceRegion property: Source Region.
     * 
     * @return the sourceRegion value.
     */
    public String sourceRegion() {
        return this.sourceRegion;
    }

    /**
     * Set the sourceRegion property: Source Region.
     * 
     * @param sourceRegion the sourceRegion value to set.
     * @return the TriggerDataMoveRequest object itself.
     */
    public TriggerDataMoveRequest withSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
        return this;
    }

    /**
     * Get the dataMoveLevel property: DataMove Level.
     * 
     * @return the dataMoveLevel value.
     */
    public DataMoveLevel dataMoveLevel() {
        return this.dataMoveLevel;
    }

    /**
     * Set the dataMoveLevel property: DataMove Level.
     * 
     * @param dataMoveLevel the dataMoveLevel value to set.
     * @return the TriggerDataMoveRequest object itself.
     */
    public TriggerDataMoveRequest withDataMoveLevel(DataMoveLevel dataMoveLevel) {
        this.dataMoveLevel = dataMoveLevel;
        return this;
    }

    /**
     * Get the correlationId property: Correlation Id.
     * 
     * @return the correlationId value.
     */
    public String correlationId() {
        return this.correlationId;
    }

    /**
     * Set the correlationId property: Correlation Id.
     * 
     * @param correlationId the correlationId value to set.
     * @return the TriggerDataMoveRequest object itself.
     */
    public TriggerDataMoveRequest withCorrelationId(String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     * Get the sourceContainerArmIds property: Source Container ArmIds.
     * 
     * @return the sourceContainerArmIds value.
     */
    public List<String> sourceContainerArmIds() {
        return this.sourceContainerArmIds;
    }

    /**
     * Set the sourceContainerArmIds property: Source Container ArmIds.
     * 
     * @param sourceContainerArmIds the sourceContainerArmIds value to set.
     * @return the TriggerDataMoveRequest object itself.
     */
    public TriggerDataMoveRequest withSourceContainerArmIds(List<String> sourceContainerArmIds) {
        this.sourceContainerArmIds = sourceContainerArmIds;
        return this;
    }

    /**
     * Get the pauseGC property: Pause GC.
     * 
     * @return the pauseGC value.
     */
    public Boolean pauseGC() {
        return this.pauseGC;
    }

    /**
     * Set the pauseGC property: Pause GC.
     * 
     * @param pauseGC the pauseGC value to set.
     * @return the TriggerDataMoveRequest object itself.
     */
    public TriggerDataMoveRequest withPauseGC(Boolean pauseGC) {
        this.pauseGC = pauseGC;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sourceResourceId() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property sourceResourceId in model TriggerDataMoveRequest"));
        }
        if (sourceRegion() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property sourceRegion in model TriggerDataMoveRequest"));
        }
        if (dataMoveLevel() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property dataMoveLevel in model TriggerDataMoveRequest"));
        }
        if (correlationId() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property correlationId in model TriggerDataMoveRequest"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(TriggerDataMoveRequest.class);
}
