// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * IaaS VM workload-specific backup item representing an Azure Resource Manager virtual machine.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "containerType")
@JsonTypeName("Microsoft.Compute/virtualMachines")
@Fluent
public final class AzureIaaSComputeVMContainer extends IaaSvmContainer {
    /**
     * Creates an instance of AzureIaaSComputeVMContainer class.
     */
    public AzureIaaSComputeVMContainer() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureIaaSComputeVMContainer withVirtualMachineId(String virtualMachineId) {
        super.withVirtualMachineId(virtualMachineId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureIaaSComputeVMContainer withVirtualMachineVersion(String virtualMachineVersion) {
        super.withVirtualMachineVersion(virtualMachineVersion);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureIaaSComputeVMContainer withResourceGroup(String resourceGroup) {
        super.withResourceGroup(resourceGroup);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureIaaSComputeVMContainer withFriendlyName(String friendlyName) {
        super.withFriendlyName(friendlyName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureIaaSComputeVMContainer withBackupManagementType(BackupManagementType backupManagementType) {
        super.withBackupManagementType(backupManagementType);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureIaaSComputeVMContainer withRegistrationStatus(String registrationStatus) {
        super.withRegistrationStatus(registrationStatus);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureIaaSComputeVMContainer withHealthStatus(String healthStatus) {
        super.withHealthStatus(healthStatus);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureIaaSComputeVMContainer withProtectableObjectType(String protectableObjectType) {
        super.withProtectableObjectType(protectableObjectType);
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
