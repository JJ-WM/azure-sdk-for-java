/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The configuration parameters used while performing a rolling upgrade.
 */
public class RollingUpgradePolicy {
    /**
     * Allow VMSS to ignore AZ boundaries when constructing upgrade batches.
     * Take into consideration the Update Domain and maxBatchInstancePercent to
     * determine the batch size. This field is able to be set to true or false
     * only when using NodePlacementConfiguration as Zonal.
     */
    @JsonProperty(value = "enableCrossZoneUpgrade")
    private Boolean enableCrossZoneUpgrade;

    /**
     * The maximum percent of total virtual machine instances that will be
     * upgraded simultaneously by the rolling upgrade in one batch. As this is
     * a maximum, unhealthy instances in previous or future batches can cause
     * the percentage of instances in a batch to decrease to ensure higher
     * reliability. The value of this field should be between 5 and 100,
     * inclusive. If both maxBatchInstancePercent and
     * maxUnhealthyInstancePercent are assigned with value, the value of
     * maxBatchInstancePercent should not be more than
     * maxUnhealthyInstancePercent.
     */
    @JsonProperty(value = "maxBatchInstancePercent")
    private Integer maxBatchInstancePercent;

    /**
     * The maximum percentage of the total virtual machine instances in the
     * scale set that can be simultaneously unhealthy, either as a result of
     * being upgraded, or by being found in an unhealthy state by the virtual
     * machine health checks before the rolling upgrade aborts. This constraint
     * will be checked prior to starting any batch. The value of this field
     * should be between 5 and 100, inclusive. If both maxBatchInstancePercent
     * and maxUnhealthyInstancePercent are assigned with value, the value of
     * maxBatchInstancePercent should not be more than
     * maxUnhealthyInstancePercent.
     */
    @JsonProperty(value = "maxUnhealthyInstancePercent")
    private Integer maxUnhealthyInstancePercent;

    /**
     * The maximum percentage of upgraded virtual machine instances that can be
     * found to be in an unhealthy state. This check will happen after each
     * batch is upgraded. If this percentage is ever exceeded, the rolling
     * update aborts. The value of this field should be between 0 and 100,
     * inclusive.
     */
    @JsonProperty(value = "maxUnhealthyUpgradedInstancePercent")
    private Integer maxUnhealthyUpgradedInstancePercent;

    /**
     * The wait time between completing the update for all virtual machines in
     * one batch and starting the next batch. The time duration should be
     * specified in ISO 8601 format.
     */
    @JsonProperty(value = "pauseTimeBetweenBatches")
    private String pauseTimeBetweenBatches;

    /**
     * Upgrade all unhealthy instances in a scale set before any healthy
     * instances.
     */
    @JsonProperty(value = "prioritizeUnhealthyInstances")
    private Boolean prioritizeUnhealthyInstances;

    /**
     * Rollback failed instances to previous model if the Rolling Upgrade
     * policy is violated.
     */
    @JsonProperty(value = "rollbackFailedInstancesOnPolicyBreach")
    private Boolean rollbackFailedInstancesOnPolicyBreach;

    /**
     * Get allow VMSS to ignore AZ boundaries when constructing upgrade batches. Take into consideration the Update Domain and maxBatchInstancePercent to determine the batch size. This field is able to be set to true or false only when using NodePlacementConfiguration as Zonal.
     *
     * @return the enableCrossZoneUpgrade value
     */
    public Boolean enableCrossZoneUpgrade() {
        return this.enableCrossZoneUpgrade;
    }

    /**
     * Set allow VMSS to ignore AZ boundaries when constructing upgrade batches. Take into consideration the Update Domain and maxBatchInstancePercent to determine the batch size. This field is able to be set to true or false only when using NodePlacementConfiguration as Zonal.
     *
     * @param enableCrossZoneUpgrade the enableCrossZoneUpgrade value to set
     * @return the RollingUpgradePolicy object itself.
     */
    public RollingUpgradePolicy withEnableCrossZoneUpgrade(Boolean enableCrossZoneUpgrade) {
        this.enableCrossZoneUpgrade = enableCrossZoneUpgrade;
        return this;
    }

    /**
     * Get the maximum percent of total virtual machine instances that will be upgraded simultaneously by the rolling upgrade in one batch. As this is a maximum, unhealthy instances in previous or future batches can cause the percentage of instances in a batch to decrease to ensure higher reliability. The value of this field should be between 5 and 100, inclusive. If both maxBatchInstancePercent and maxUnhealthyInstancePercent are assigned with value, the value of maxBatchInstancePercent should not be more than maxUnhealthyInstancePercent.
     *
     * @return the maxBatchInstancePercent value
     */
    public Integer maxBatchInstancePercent() {
        return this.maxBatchInstancePercent;
    }

    /**
     * Set the maximum percent of total virtual machine instances that will be upgraded simultaneously by the rolling upgrade in one batch. As this is a maximum, unhealthy instances in previous or future batches can cause the percentage of instances in a batch to decrease to ensure higher reliability. The value of this field should be between 5 and 100, inclusive. If both maxBatchInstancePercent and maxUnhealthyInstancePercent are assigned with value, the value of maxBatchInstancePercent should not be more than maxUnhealthyInstancePercent.
     *
     * @param maxBatchInstancePercent the maxBatchInstancePercent value to set
     * @return the RollingUpgradePolicy object itself.
     */
    public RollingUpgradePolicy withMaxBatchInstancePercent(Integer maxBatchInstancePercent) {
        this.maxBatchInstancePercent = maxBatchInstancePercent;
        return this;
    }

    /**
     * Get the maximum percentage of the total virtual machine instances in the scale set that can be simultaneously unhealthy, either as a result of being upgraded, or by being found in an unhealthy state by the virtual machine health checks before the rolling upgrade aborts. This constraint will be checked prior to starting any batch. The value of this field should be between 5 and 100, inclusive. If both maxBatchInstancePercent and maxUnhealthyInstancePercent are assigned with value, the value of maxBatchInstancePercent should not be more than maxUnhealthyInstancePercent.
     *
     * @return the maxUnhealthyInstancePercent value
     */
    public Integer maxUnhealthyInstancePercent() {
        return this.maxUnhealthyInstancePercent;
    }

    /**
     * Set the maximum percentage of the total virtual machine instances in the scale set that can be simultaneously unhealthy, either as a result of being upgraded, or by being found in an unhealthy state by the virtual machine health checks before the rolling upgrade aborts. This constraint will be checked prior to starting any batch. The value of this field should be between 5 and 100, inclusive. If both maxBatchInstancePercent and maxUnhealthyInstancePercent are assigned with value, the value of maxBatchInstancePercent should not be more than maxUnhealthyInstancePercent.
     *
     * @param maxUnhealthyInstancePercent the maxUnhealthyInstancePercent value to set
     * @return the RollingUpgradePolicy object itself.
     */
    public RollingUpgradePolicy withMaxUnhealthyInstancePercent(Integer maxUnhealthyInstancePercent) {
        this.maxUnhealthyInstancePercent = maxUnhealthyInstancePercent;
        return this;
    }

    /**
     * Get the maximum percentage of upgraded virtual machine instances that can be found to be in an unhealthy state. This check will happen after each batch is upgraded. If this percentage is ever exceeded, the rolling update aborts. The value of this field should be between 0 and 100, inclusive.
     *
     * @return the maxUnhealthyUpgradedInstancePercent value
     */
    public Integer maxUnhealthyUpgradedInstancePercent() {
        return this.maxUnhealthyUpgradedInstancePercent;
    }

    /**
     * Set the maximum percentage of upgraded virtual machine instances that can be found to be in an unhealthy state. This check will happen after each batch is upgraded. If this percentage is ever exceeded, the rolling update aborts. The value of this field should be between 0 and 100, inclusive.
     *
     * @param maxUnhealthyUpgradedInstancePercent the maxUnhealthyUpgradedInstancePercent value to set
     * @return the RollingUpgradePolicy object itself.
     */
    public RollingUpgradePolicy withMaxUnhealthyUpgradedInstancePercent(Integer maxUnhealthyUpgradedInstancePercent) {
        this.maxUnhealthyUpgradedInstancePercent = maxUnhealthyUpgradedInstancePercent;
        return this;
    }

    /**
     * Get the wait time between completing the update for all virtual machines in one batch and starting the next batch. The time duration should be specified in ISO 8601 format.
     *
     * @return the pauseTimeBetweenBatches value
     */
    public String pauseTimeBetweenBatches() {
        return this.pauseTimeBetweenBatches;
    }

    /**
     * Set the wait time between completing the update for all virtual machines in one batch and starting the next batch. The time duration should be specified in ISO 8601 format.
     *
     * @param pauseTimeBetweenBatches the pauseTimeBetweenBatches value to set
     * @return the RollingUpgradePolicy object itself.
     */
    public RollingUpgradePolicy withPauseTimeBetweenBatches(String pauseTimeBetweenBatches) {
        this.pauseTimeBetweenBatches = pauseTimeBetweenBatches;
        return this;
    }

    /**
     * Get upgrade all unhealthy instances in a scale set before any healthy instances.
     *
     * @return the prioritizeUnhealthyInstances value
     */
    public Boolean prioritizeUnhealthyInstances() {
        return this.prioritizeUnhealthyInstances;
    }

    /**
     * Set upgrade all unhealthy instances in a scale set before any healthy instances.
     *
     * @param prioritizeUnhealthyInstances the prioritizeUnhealthyInstances value to set
     * @return the RollingUpgradePolicy object itself.
     */
    public RollingUpgradePolicy withPrioritizeUnhealthyInstances(Boolean prioritizeUnhealthyInstances) {
        this.prioritizeUnhealthyInstances = prioritizeUnhealthyInstances;
        return this;
    }

    /**
     * Get rollback failed instances to previous model if the Rolling Upgrade policy is violated.
     *
     * @return the rollbackFailedInstancesOnPolicyBreach value
     */
    public Boolean rollbackFailedInstancesOnPolicyBreach() {
        return this.rollbackFailedInstancesOnPolicyBreach;
    }

    /**
     * Set rollback failed instances to previous model if the Rolling Upgrade policy is violated.
     *
     * @param rollbackFailedInstancesOnPolicyBreach the rollbackFailedInstancesOnPolicyBreach value to set
     * @return the RollingUpgradePolicy object itself.
     */
    public RollingUpgradePolicy withRollbackFailedInstancesOnPolicyBreach(Boolean rollbackFailedInstancesOnPolicyBreach) {
        this.rollbackFailedInstancesOnPolicyBreach = rollbackFailedInstancesOnPolicyBreach;
        return this;
    }

}
