// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.standbypool.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Details of the StandbyVirtualMachinePool.
 */
@Fluent
public final class StandbyVirtualMachinePoolResourceProperties {
    /*
     * Specifies the elasticity profile of the standby virtual machine pools.
     */
    @JsonProperty(value = "elasticityProfile")
    private StandbyVirtualMachinePoolElasticityProfile elasticityProfile;

    /*
     * Specifies the desired state of virtual machines in the pool.
     */
    @JsonProperty(value = "virtualMachineState", required = true)
    private VirtualMachineState virtualMachineState;

    /*
     * Specifies the fully qualified resource ID of a virtual machine scale set the pool is attached to.
     */
    @JsonProperty(value = "attachedVirtualMachineScaleSetId")
    private String attachedVirtualMachineScaleSetId;

    /*
     * The status of the last operation.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of StandbyVirtualMachinePoolResourceProperties class.
     */
    public StandbyVirtualMachinePoolResourceProperties() {
    }

    /**
     * Get the elasticityProfile property: Specifies the elasticity profile of the standby virtual machine pools.
     * 
     * @return the elasticityProfile value.
     */
    public StandbyVirtualMachinePoolElasticityProfile elasticityProfile() {
        return this.elasticityProfile;
    }

    /**
     * Set the elasticityProfile property: Specifies the elasticity profile of the standby virtual machine pools.
     * 
     * @param elasticityProfile the elasticityProfile value to set.
     * @return the StandbyVirtualMachinePoolResourceProperties object itself.
     */
    public StandbyVirtualMachinePoolResourceProperties
        withElasticityProfile(StandbyVirtualMachinePoolElasticityProfile elasticityProfile) {
        this.elasticityProfile = elasticityProfile;
        return this;
    }

    /**
     * Get the virtualMachineState property: Specifies the desired state of virtual machines in the pool.
     * 
     * @return the virtualMachineState value.
     */
    public VirtualMachineState virtualMachineState() {
        return this.virtualMachineState;
    }

    /**
     * Set the virtualMachineState property: Specifies the desired state of virtual machines in the pool.
     * 
     * @param virtualMachineState the virtualMachineState value to set.
     * @return the StandbyVirtualMachinePoolResourceProperties object itself.
     */
    public StandbyVirtualMachinePoolResourceProperties
        withVirtualMachineState(VirtualMachineState virtualMachineState) {
        this.virtualMachineState = virtualMachineState;
        return this;
    }

    /**
     * Get the attachedVirtualMachineScaleSetId property: Specifies the fully qualified resource ID of a virtual machine
     * scale set the pool is attached to.
     * 
     * @return the attachedVirtualMachineScaleSetId value.
     */
    public String attachedVirtualMachineScaleSetId() {
        return this.attachedVirtualMachineScaleSetId;
    }

    /**
     * Set the attachedVirtualMachineScaleSetId property: Specifies the fully qualified resource ID of a virtual machine
     * scale set the pool is attached to.
     * 
     * @param attachedVirtualMachineScaleSetId the attachedVirtualMachineScaleSetId value to set.
     * @return the StandbyVirtualMachinePoolResourceProperties object itself.
     */
    public StandbyVirtualMachinePoolResourceProperties
        withAttachedVirtualMachineScaleSetId(String attachedVirtualMachineScaleSetId) {
        this.attachedVirtualMachineScaleSetId = attachedVirtualMachineScaleSetId;
        return this;
    }

    /**
     * Get the provisioningState property: The status of the last operation.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (elasticityProfile() != null) {
            elasticityProfile().validate();
        }
        if (virtualMachineState() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property virtualMachineState in model StandbyVirtualMachinePoolResourceProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(StandbyVirtualMachinePoolResourceProperties.class);
}
