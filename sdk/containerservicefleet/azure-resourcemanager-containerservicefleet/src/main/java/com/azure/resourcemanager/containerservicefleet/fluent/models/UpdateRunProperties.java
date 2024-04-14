// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.containerservicefleet.models.ManagedClusterUpdate;
import com.azure.resourcemanager.containerservicefleet.models.UpdateRunProvisioningState;
import com.azure.resourcemanager.containerservicefleet.models.UpdateRunStatus;
import com.azure.resourcemanager.containerservicefleet.models.UpdateRunStrategy;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties of the UpdateRun.
 */
@Fluent
public final class UpdateRunProperties {
    /*
     * The provisioning state of the UpdateRun resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private UpdateRunProvisioningState provisioningState;

    /*
     * The resource id of the FleetUpdateStrategy resource to reference.
     * 
     * When creating a new run, there are three ways to define a strategy for the run:
     * 1. Define a new strategy in place: Set the "strategy" field.
     * 2. Use an existing strategy: Set the "updateStrategyId" field. (since 2023-08-15-preview)
     * 3. Use the default strategy to update all the members one by one: Leave both "updateStrategyId" and "strategy"
     * unset. (since 2023-08-15-preview)
     * 
     * Setting both "updateStrategyId" and "strategy" is invalid.
     * 
     * UpdateRuns created by "updateStrategyId" snapshot the referenced UpdateStrategy at the time of creation and
     * store it in the "strategy" field.
     * Subsequent changes to the referenced FleetUpdateStrategy resource do not propagate.
     * UpdateRunStrategy changes can be made directly on the "strategy" field before launching the UpdateRun.
     */
    @JsonProperty(value = "updateStrategyId")
    private String updateStrategyId;

    /*
     * The strategy defines the order in which the clusters will be updated.
     * If not set, all members will be updated sequentially. The UpdateRun status will show a single UpdateStage and a
     * single UpdateGroup targeting all members.
     * The strategy of the UpdateRun can be modified until the run is started.
     */
    @JsonProperty(value = "strategy")
    private UpdateRunStrategy strategy;

    /*
     * The update to be applied to all clusters in the UpdateRun. The managedClusterUpdate can be modified until the
     * run is started.
     */
    @JsonProperty(value = "managedClusterUpdate", required = true)
    private ManagedClusterUpdate managedClusterUpdate;

    /*
     * The status of the UpdateRun.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private UpdateRunStatus status;

    /**
     * Creates an instance of UpdateRunProperties class.
     */
    public UpdateRunProperties() {
    }

    /**
     * Get the provisioningState property: The provisioning state of the UpdateRun resource.
     * 
     * @return the provisioningState value.
     */
    public UpdateRunProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the updateStrategyId property: The resource id of the FleetUpdateStrategy resource to reference.
     * 
     * When creating a new run, there are three ways to define a strategy for the run:
     * 1. Define a new strategy in place: Set the "strategy" field.
     * 2. Use an existing strategy: Set the "updateStrategyId" field. (since 2023-08-15-preview)
     * 3. Use the default strategy to update all the members one by one: Leave both "updateStrategyId" and "strategy"
     * unset. (since 2023-08-15-preview)
     * 
     * Setting both "updateStrategyId" and "strategy" is invalid.
     * 
     * UpdateRuns created by "updateStrategyId" snapshot the referenced UpdateStrategy at the time of creation and
     * store it in the "strategy" field.
     * Subsequent changes to the referenced FleetUpdateStrategy resource do not propagate.
     * UpdateRunStrategy changes can be made directly on the "strategy" field before launching the UpdateRun.
     * 
     * @return the updateStrategyId value.
     */
    public String updateStrategyId() {
        return this.updateStrategyId;
    }

    /**
     * Set the updateStrategyId property: The resource id of the FleetUpdateStrategy resource to reference.
     * 
     * When creating a new run, there are three ways to define a strategy for the run:
     * 1. Define a new strategy in place: Set the "strategy" field.
     * 2. Use an existing strategy: Set the "updateStrategyId" field. (since 2023-08-15-preview)
     * 3. Use the default strategy to update all the members one by one: Leave both "updateStrategyId" and "strategy"
     * unset. (since 2023-08-15-preview)
     * 
     * Setting both "updateStrategyId" and "strategy" is invalid.
     * 
     * UpdateRuns created by "updateStrategyId" snapshot the referenced UpdateStrategy at the time of creation and
     * store it in the "strategy" field.
     * Subsequent changes to the referenced FleetUpdateStrategy resource do not propagate.
     * UpdateRunStrategy changes can be made directly on the "strategy" field before launching the UpdateRun.
     * 
     * @param updateStrategyId the updateStrategyId value to set.
     * @return the UpdateRunProperties object itself.
     */
    public UpdateRunProperties withUpdateStrategyId(String updateStrategyId) {
        this.updateStrategyId = updateStrategyId;
        return this;
    }

    /**
     * Get the strategy property: The strategy defines the order in which the clusters will be updated.
     * If not set, all members will be updated sequentially. The UpdateRun status will show a single UpdateStage and a
     * single UpdateGroup targeting all members.
     * The strategy of the UpdateRun can be modified until the run is started.
     * 
     * @return the strategy value.
     */
    public UpdateRunStrategy strategy() {
        return this.strategy;
    }

    /**
     * Set the strategy property: The strategy defines the order in which the clusters will be updated.
     * If not set, all members will be updated sequentially. The UpdateRun status will show a single UpdateStage and a
     * single UpdateGroup targeting all members.
     * The strategy of the UpdateRun can be modified until the run is started.
     * 
     * @param strategy the strategy value to set.
     * @return the UpdateRunProperties object itself.
     */
    public UpdateRunProperties withStrategy(UpdateRunStrategy strategy) {
        this.strategy = strategy;
        return this;
    }

    /**
     * Get the managedClusterUpdate property: The update to be applied to all clusters in the UpdateRun. The
     * managedClusterUpdate can be modified until the run is started.
     * 
     * @return the managedClusterUpdate value.
     */
    public ManagedClusterUpdate managedClusterUpdate() {
        return this.managedClusterUpdate;
    }

    /**
     * Set the managedClusterUpdate property: The update to be applied to all clusters in the UpdateRun. The
     * managedClusterUpdate can be modified until the run is started.
     * 
     * @param managedClusterUpdate the managedClusterUpdate value to set.
     * @return the UpdateRunProperties object itself.
     */
    public UpdateRunProperties withManagedClusterUpdate(ManagedClusterUpdate managedClusterUpdate) {
        this.managedClusterUpdate = managedClusterUpdate;
        return this;
    }

    /**
     * Get the status property: The status of the UpdateRun.
     * 
     * @return the status value.
     */
    public UpdateRunStatus status() {
        return this.status;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (strategy() != null) {
            strategy().validate();
        }
        if (managedClusterUpdate() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property managedClusterUpdate in model UpdateRunProperties"));
        } else {
            managedClusterUpdate().validate();
        }
        if (status() != null) {
            status().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(UpdateRunProperties.class);
}
