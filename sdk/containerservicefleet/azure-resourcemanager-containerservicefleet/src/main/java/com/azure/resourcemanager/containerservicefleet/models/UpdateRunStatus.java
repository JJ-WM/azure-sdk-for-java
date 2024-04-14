// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The status of a UpdateRun.
 */
@Immutable
public final class UpdateRunStatus {
    /*
     * The status of the UpdateRun.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private UpdateStatus status;

    /*
     * The stages composing an update run. Stages are run sequentially withing an UpdateRun.
     */
    @JsonProperty(value = "stages", access = JsonProperty.Access.WRITE_ONLY)
    private List<UpdateStageStatus> stages;

    /*
     * The node image upgrade specs for the update run. It is only set in update run when `NodeImageSelection.type` is
     * `Consistent`.
     */
    @JsonProperty(value = "nodeImageSelection", access = JsonProperty.Access.WRITE_ONLY)
    private NodeImageSelectionStatus nodeImageSelection;

    /**
     * Creates an instance of UpdateRunStatus class.
     */
    public UpdateRunStatus() {
    }

    /**
     * Get the status property: The status of the UpdateRun.
     * 
     * @return the status value.
     */
    public UpdateStatus status() {
        return this.status;
    }

    /**
     * Get the stages property: The stages composing an update run. Stages are run sequentially withing an UpdateRun.
     * 
     * @return the stages value.
     */
    public List<UpdateStageStatus> stages() {
        return this.stages;
    }

    /**
     * Get the nodeImageSelection property: The node image upgrade specs for the update run. It is only set in update
     * run when `NodeImageSelection.type` is `Consistent`.
     * 
     * @return the nodeImageSelection value.
     */
    public NodeImageSelectionStatus nodeImageSelection() {
        return this.nodeImageSelection;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (status() != null) {
            status().validate();
        }
        if (stages() != null) {
            stages().forEach(e -> e.validate());
        }
        if (nodeImageSelection() != null) {
            nodeImageSelection().validate();
        }
    }
}
