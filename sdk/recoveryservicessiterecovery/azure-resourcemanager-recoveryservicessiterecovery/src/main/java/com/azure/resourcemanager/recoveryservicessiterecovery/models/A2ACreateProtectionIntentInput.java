// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * A2A create protection intent input.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("A2A")
@Fluent
public final class A2ACreateProtectionIntentInput extends CreateProtectionIntentProviderSpecificDetails {
    /*
     * The fabric specific object Id of the virtual machine.
     */
    @JsonProperty(value = "fabricObjectId", required = true)
    private String fabricObjectId;

    /*
     * The primary location for the virtual machine.
     */
    @JsonProperty(value = "primaryLocation", required = true)
    private String primaryLocation;

    /*
     * The recovery location for the virtual machine.
     */
    @JsonProperty(value = "recoveryLocation", required = true)
    private String recoveryLocation;

    /*
     * The recovery subscription Id of the virtual machine.
     */
    @JsonProperty(value = "recoverySubscriptionId", required = true)
    private String recoverySubscriptionId;

    /*
     * The recovery availability type of the virtual machine.
     */
    @JsonProperty(value = "recoveryAvailabilityType", required = true)
    private A2ARecoveryAvailabilityType recoveryAvailabilityType;

    /*
     * The protection profile custom inputs.
     */
    @JsonProperty(value = "protectionProfileCustomInput")
    private ProtectionProfileCustomDetails protectionProfileCustomInput;

    /*
     * The recovery resource group Id. Valid for V2 scenarios.
     */
    @JsonProperty(value = "recoveryResourceGroupId", required = true)
    private String recoveryResourceGroupId;

    /*
     * The primary staging storage account input.
     */
    @JsonProperty(value = "primaryStagingStorageAccountCustomInput")
    private StorageAccountCustomDetails primaryStagingStorageAccountCustomInput;

    /*
     * The recovery availability set input.
     */
    @JsonProperty(value = "recoveryAvailabilitySetCustomInput")
    private RecoveryAvailabilitySetCustomDetails recoveryAvailabilitySetCustomInput;

    /*
     * The recovery virtual network input.
     */
    @JsonProperty(value = "recoveryVirtualNetworkCustomInput")
    private RecoveryVirtualNetworkCustomDetails recoveryVirtualNetworkCustomInput;

    /*
     * The recovery proximity placement group custom input.
     */
    @JsonProperty(value = "recoveryProximityPlacementGroupCustomInput")
    private RecoveryProximityPlacementGroupCustomDetails recoveryProximityPlacementGroupCustomInput;

    /*
     * A value indicating whether the auto protection is enabled.
     */
    @JsonProperty(value = "autoProtectionOfDataDisk")
    private AutoProtectionOfDataDisk autoProtectionOfDataDisk;

    /*
     * The list of vm disk inputs.
     */
    @JsonProperty(value = "vmDisks")
    private List<A2AProtectionIntentDiskInputDetails> vmDisks;

    /*
     * The list of vm managed disk inputs.
     */
    @JsonProperty(value = "vmManagedDisks")
    private List<A2AProtectionIntentManagedDiskInputDetails> vmManagedDisks;

    /*
     * The multi vm group name.
     */
    @JsonProperty(value = "multiVmGroupName")
    private String multiVmGroupName;

    /*
     * The multi vm group id.
     */
    @JsonProperty(value = "multiVmGroupId")
    private String multiVmGroupId;

    /*
     * The boot diagnostic storage account.
     */
    @JsonProperty(value = "recoveryBootDiagStorageAccount")
    private StorageAccountCustomDetails recoveryBootDiagStorageAccount;

    /*
     * The recovery disk encryption information (for two pass flows).
     */
    @JsonProperty(value = "diskEncryptionInfo")
    private DiskEncryptionInfo diskEncryptionInfo;

    /*
     * The recovery availability zone.
     */
    @JsonProperty(value = "recoveryAvailabilityZone")
    private String recoveryAvailabilityZone;

    /*
     * A value indicating whether the auto update is enabled.
     */
    @JsonProperty(value = "agentAutoUpdateStatus")
    private AgentAutoUpdateStatus agentAutoUpdateStatus;

    /*
     * A value indicating the authentication type for automation account. The default value is "RunAsAccount".
     */
    @JsonProperty(value = "automationAccountAuthenticationType")
    private AutomationAccountAuthenticationType automationAccountAuthenticationType;

    /*
     * The automation account arm id.
     */
    @JsonProperty(value = "automationAccountArmId")
    private String automationAccountArmId;

    /**
     * Creates an instance of A2ACreateProtectionIntentInput class.
     */
    public A2ACreateProtectionIntentInput() {
    }

    /**
     * Get the fabricObjectId property: The fabric specific object Id of the virtual machine.
     * 
     * @return the fabricObjectId value.
     */
    public String fabricObjectId() {
        return this.fabricObjectId;
    }

    /**
     * Set the fabricObjectId property: The fabric specific object Id of the virtual machine.
     * 
     * @param fabricObjectId the fabricObjectId value to set.
     * @return the A2ACreateProtectionIntentInput object itself.
     */
    public A2ACreateProtectionIntentInput withFabricObjectId(String fabricObjectId) {
        this.fabricObjectId = fabricObjectId;
        return this;
    }

    /**
     * Get the primaryLocation property: The primary location for the virtual machine.
     * 
     * @return the primaryLocation value.
     */
    public String primaryLocation() {
        return this.primaryLocation;
    }

    /**
     * Set the primaryLocation property: The primary location for the virtual machine.
     * 
     * @param primaryLocation the primaryLocation value to set.
     * @return the A2ACreateProtectionIntentInput object itself.
     */
    public A2ACreateProtectionIntentInput withPrimaryLocation(String primaryLocation) {
        this.primaryLocation = primaryLocation;
        return this;
    }

    /**
     * Get the recoveryLocation property: The recovery location for the virtual machine.
     * 
     * @return the recoveryLocation value.
     */
    public String recoveryLocation() {
        return this.recoveryLocation;
    }

    /**
     * Set the recoveryLocation property: The recovery location for the virtual machine.
     * 
     * @param recoveryLocation the recoveryLocation value to set.
     * @return the A2ACreateProtectionIntentInput object itself.
     */
    public A2ACreateProtectionIntentInput withRecoveryLocation(String recoveryLocation) {
        this.recoveryLocation = recoveryLocation;
        return this;
    }

    /**
     * Get the recoverySubscriptionId property: The recovery subscription Id of the virtual machine.
     * 
     * @return the recoverySubscriptionId value.
     */
    public String recoverySubscriptionId() {
        return this.recoverySubscriptionId;
    }

    /**
     * Set the recoverySubscriptionId property: The recovery subscription Id of the virtual machine.
     * 
     * @param recoverySubscriptionId the recoverySubscriptionId value to set.
     * @return the A2ACreateProtectionIntentInput object itself.
     */
    public A2ACreateProtectionIntentInput withRecoverySubscriptionId(String recoverySubscriptionId) {
        this.recoverySubscriptionId = recoverySubscriptionId;
        return this;
    }

    /**
     * Get the recoveryAvailabilityType property: The recovery availability type of the virtual machine.
     * 
     * @return the recoveryAvailabilityType value.
     */
    public A2ARecoveryAvailabilityType recoveryAvailabilityType() {
        return this.recoveryAvailabilityType;
    }

    /**
     * Set the recoveryAvailabilityType property: The recovery availability type of the virtual machine.
     * 
     * @param recoveryAvailabilityType the recoveryAvailabilityType value to set.
     * @return the A2ACreateProtectionIntentInput object itself.
     */
    public A2ACreateProtectionIntentInput
        withRecoveryAvailabilityType(A2ARecoveryAvailabilityType recoveryAvailabilityType) {
        this.recoveryAvailabilityType = recoveryAvailabilityType;
        return this;
    }

    /**
     * Get the protectionProfileCustomInput property: The protection profile custom inputs.
     * 
     * @return the protectionProfileCustomInput value.
     */
    public ProtectionProfileCustomDetails protectionProfileCustomInput() {
        return this.protectionProfileCustomInput;
    }

    /**
     * Set the protectionProfileCustomInput property: The protection profile custom inputs.
     * 
     * @param protectionProfileCustomInput the protectionProfileCustomInput value to set.
     * @return the A2ACreateProtectionIntentInput object itself.
     */
    public A2ACreateProtectionIntentInput
        withProtectionProfileCustomInput(ProtectionProfileCustomDetails protectionProfileCustomInput) {
        this.protectionProfileCustomInput = protectionProfileCustomInput;
        return this;
    }

    /**
     * Get the recoveryResourceGroupId property: The recovery resource group Id. Valid for V2 scenarios.
     * 
     * @return the recoveryResourceGroupId value.
     */
    public String recoveryResourceGroupId() {
        return this.recoveryResourceGroupId;
    }

    /**
     * Set the recoveryResourceGroupId property: The recovery resource group Id. Valid for V2 scenarios.
     * 
     * @param recoveryResourceGroupId the recoveryResourceGroupId value to set.
     * @return the A2ACreateProtectionIntentInput object itself.
     */
    public A2ACreateProtectionIntentInput withRecoveryResourceGroupId(String recoveryResourceGroupId) {
        this.recoveryResourceGroupId = recoveryResourceGroupId;
        return this;
    }

    /**
     * Get the primaryStagingStorageAccountCustomInput property: The primary staging storage account input.
     * 
     * @return the primaryStagingStorageAccountCustomInput value.
     */
    public StorageAccountCustomDetails primaryStagingStorageAccountCustomInput() {
        return this.primaryStagingStorageAccountCustomInput;
    }

    /**
     * Set the primaryStagingStorageAccountCustomInput property: The primary staging storage account input.
     * 
     * @param primaryStagingStorageAccountCustomInput the primaryStagingStorageAccountCustomInput value to set.
     * @return the A2ACreateProtectionIntentInput object itself.
     */
    public A2ACreateProtectionIntentInput withPrimaryStagingStorageAccountCustomInput(
        StorageAccountCustomDetails primaryStagingStorageAccountCustomInput) {
        this.primaryStagingStorageAccountCustomInput = primaryStagingStorageAccountCustomInput;
        return this;
    }

    /**
     * Get the recoveryAvailabilitySetCustomInput property: The recovery availability set input.
     * 
     * @return the recoveryAvailabilitySetCustomInput value.
     */
    public RecoveryAvailabilitySetCustomDetails recoveryAvailabilitySetCustomInput() {
        return this.recoveryAvailabilitySetCustomInput;
    }

    /**
     * Set the recoveryAvailabilitySetCustomInput property: The recovery availability set input.
     * 
     * @param recoveryAvailabilitySetCustomInput the recoveryAvailabilitySetCustomInput value to set.
     * @return the A2ACreateProtectionIntentInput object itself.
     */
    public A2ACreateProtectionIntentInput withRecoveryAvailabilitySetCustomInput(
        RecoveryAvailabilitySetCustomDetails recoveryAvailabilitySetCustomInput) {
        this.recoveryAvailabilitySetCustomInput = recoveryAvailabilitySetCustomInput;
        return this;
    }

    /**
     * Get the recoveryVirtualNetworkCustomInput property: The recovery virtual network input.
     * 
     * @return the recoveryVirtualNetworkCustomInput value.
     */
    public RecoveryVirtualNetworkCustomDetails recoveryVirtualNetworkCustomInput() {
        return this.recoveryVirtualNetworkCustomInput;
    }

    /**
     * Set the recoveryVirtualNetworkCustomInput property: The recovery virtual network input.
     * 
     * @param recoveryVirtualNetworkCustomInput the recoveryVirtualNetworkCustomInput value to set.
     * @return the A2ACreateProtectionIntentInput object itself.
     */
    public A2ACreateProtectionIntentInput
        withRecoveryVirtualNetworkCustomInput(RecoveryVirtualNetworkCustomDetails recoveryVirtualNetworkCustomInput) {
        this.recoveryVirtualNetworkCustomInput = recoveryVirtualNetworkCustomInput;
        return this;
    }

    /**
     * Get the recoveryProximityPlacementGroupCustomInput property: The recovery proximity placement group custom
     * input.
     * 
     * @return the recoveryProximityPlacementGroupCustomInput value.
     */
    public RecoveryProximityPlacementGroupCustomDetails recoveryProximityPlacementGroupCustomInput() {
        return this.recoveryProximityPlacementGroupCustomInput;
    }

    /**
     * Set the recoveryProximityPlacementGroupCustomInput property: The recovery proximity placement group custom
     * input.
     * 
     * @param recoveryProximityPlacementGroupCustomInput the recoveryProximityPlacementGroupCustomInput value to set.
     * @return the A2ACreateProtectionIntentInput object itself.
     */
    public A2ACreateProtectionIntentInput withRecoveryProximityPlacementGroupCustomInput(
        RecoveryProximityPlacementGroupCustomDetails recoveryProximityPlacementGroupCustomInput) {
        this.recoveryProximityPlacementGroupCustomInput = recoveryProximityPlacementGroupCustomInput;
        return this;
    }

    /**
     * Get the autoProtectionOfDataDisk property: A value indicating whether the auto protection is enabled.
     * 
     * @return the autoProtectionOfDataDisk value.
     */
    public AutoProtectionOfDataDisk autoProtectionOfDataDisk() {
        return this.autoProtectionOfDataDisk;
    }

    /**
     * Set the autoProtectionOfDataDisk property: A value indicating whether the auto protection is enabled.
     * 
     * @param autoProtectionOfDataDisk the autoProtectionOfDataDisk value to set.
     * @return the A2ACreateProtectionIntentInput object itself.
     */
    public A2ACreateProtectionIntentInput
        withAutoProtectionOfDataDisk(AutoProtectionOfDataDisk autoProtectionOfDataDisk) {
        this.autoProtectionOfDataDisk = autoProtectionOfDataDisk;
        return this;
    }

    /**
     * Get the vmDisks property: The list of vm disk inputs.
     * 
     * @return the vmDisks value.
     */
    public List<A2AProtectionIntentDiskInputDetails> vmDisks() {
        return this.vmDisks;
    }

    /**
     * Set the vmDisks property: The list of vm disk inputs.
     * 
     * @param vmDisks the vmDisks value to set.
     * @return the A2ACreateProtectionIntentInput object itself.
     */
    public A2ACreateProtectionIntentInput withVmDisks(List<A2AProtectionIntentDiskInputDetails> vmDisks) {
        this.vmDisks = vmDisks;
        return this;
    }

    /**
     * Get the vmManagedDisks property: The list of vm managed disk inputs.
     * 
     * @return the vmManagedDisks value.
     */
    public List<A2AProtectionIntentManagedDiskInputDetails> vmManagedDisks() {
        return this.vmManagedDisks;
    }

    /**
     * Set the vmManagedDisks property: The list of vm managed disk inputs.
     * 
     * @param vmManagedDisks the vmManagedDisks value to set.
     * @return the A2ACreateProtectionIntentInput object itself.
     */
    public A2ACreateProtectionIntentInput
        withVmManagedDisks(List<A2AProtectionIntentManagedDiskInputDetails> vmManagedDisks) {
        this.vmManagedDisks = vmManagedDisks;
        return this;
    }

    /**
     * Get the multiVmGroupName property: The multi vm group name.
     * 
     * @return the multiVmGroupName value.
     */
    public String multiVmGroupName() {
        return this.multiVmGroupName;
    }

    /**
     * Set the multiVmGroupName property: The multi vm group name.
     * 
     * @param multiVmGroupName the multiVmGroupName value to set.
     * @return the A2ACreateProtectionIntentInput object itself.
     */
    public A2ACreateProtectionIntentInput withMultiVmGroupName(String multiVmGroupName) {
        this.multiVmGroupName = multiVmGroupName;
        return this;
    }

    /**
     * Get the multiVmGroupId property: The multi vm group id.
     * 
     * @return the multiVmGroupId value.
     */
    public String multiVmGroupId() {
        return this.multiVmGroupId;
    }

    /**
     * Set the multiVmGroupId property: The multi vm group id.
     * 
     * @param multiVmGroupId the multiVmGroupId value to set.
     * @return the A2ACreateProtectionIntentInput object itself.
     */
    public A2ACreateProtectionIntentInput withMultiVmGroupId(String multiVmGroupId) {
        this.multiVmGroupId = multiVmGroupId;
        return this;
    }

    /**
     * Get the recoveryBootDiagStorageAccount property: The boot diagnostic storage account.
     * 
     * @return the recoveryBootDiagStorageAccount value.
     */
    public StorageAccountCustomDetails recoveryBootDiagStorageAccount() {
        return this.recoveryBootDiagStorageAccount;
    }

    /**
     * Set the recoveryBootDiagStorageAccount property: The boot diagnostic storage account.
     * 
     * @param recoveryBootDiagStorageAccount the recoveryBootDiagStorageAccount value to set.
     * @return the A2ACreateProtectionIntentInput object itself.
     */
    public A2ACreateProtectionIntentInput
        withRecoveryBootDiagStorageAccount(StorageAccountCustomDetails recoveryBootDiagStorageAccount) {
        this.recoveryBootDiagStorageAccount = recoveryBootDiagStorageAccount;
        return this;
    }

    /**
     * Get the diskEncryptionInfo property: The recovery disk encryption information (for two pass flows).
     * 
     * @return the diskEncryptionInfo value.
     */
    public DiskEncryptionInfo diskEncryptionInfo() {
        return this.diskEncryptionInfo;
    }

    /**
     * Set the diskEncryptionInfo property: The recovery disk encryption information (for two pass flows).
     * 
     * @param diskEncryptionInfo the diskEncryptionInfo value to set.
     * @return the A2ACreateProtectionIntentInput object itself.
     */
    public A2ACreateProtectionIntentInput withDiskEncryptionInfo(DiskEncryptionInfo diskEncryptionInfo) {
        this.diskEncryptionInfo = diskEncryptionInfo;
        return this;
    }

    /**
     * Get the recoveryAvailabilityZone property: The recovery availability zone.
     * 
     * @return the recoveryAvailabilityZone value.
     */
    public String recoveryAvailabilityZone() {
        return this.recoveryAvailabilityZone;
    }

    /**
     * Set the recoveryAvailabilityZone property: The recovery availability zone.
     * 
     * @param recoveryAvailabilityZone the recoveryAvailabilityZone value to set.
     * @return the A2ACreateProtectionIntentInput object itself.
     */
    public A2ACreateProtectionIntentInput withRecoveryAvailabilityZone(String recoveryAvailabilityZone) {
        this.recoveryAvailabilityZone = recoveryAvailabilityZone;
        return this;
    }

    /**
     * Get the agentAutoUpdateStatus property: A value indicating whether the auto update is enabled.
     * 
     * @return the agentAutoUpdateStatus value.
     */
    public AgentAutoUpdateStatus agentAutoUpdateStatus() {
        return this.agentAutoUpdateStatus;
    }

    /**
     * Set the agentAutoUpdateStatus property: A value indicating whether the auto update is enabled.
     * 
     * @param agentAutoUpdateStatus the agentAutoUpdateStatus value to set.
     * @return the A2ACreateProtectionIntentInput object itself.
     */
    public A2ACreateProtectionIntentInput withAgentAutoUpdateStatus(AgentAutoUpdateStatus agentAutoUpdateStatus) {
        this.agentAutoUpdateStatus = agentAutoUpdateStatus;
        return this;
    }

    /**
     * Get the automationAccountAuthenticationType property: A value indicating the authentication type for automation
     * account. The default value is "RunAsAccount".
     * 
     * @return the automationAccountAuthenticationType value.
     */
    public AutomationAccountAuthenticationType automationAccountAuthenticationType() {
        return this.automationAccountAuthenticationType;
    }

    /**
     * Set the automationAccountAuthenticationType property: A value indicating the authentication type for automation
     * account. The default value is "RunAsAccount".
     * 
     * @param automationAccountAuthenticationType the automationAccountAuthenticationType value to set.
     * @return the A2ACreateProtectionIntentInput object itself.
     */
    public A2ACreateProtectionIntentInput withAutomationAccountAuthenticationType(
        AutomationAccountAuthenticationType automationAccountAuthenticationType) {
        this.automationAccountAuthenticationType = automationAccountAuthenticationType;
        return this;
    }

    /**
     * Get the automationAccountArmId property: The automation account arm id.
     * 
     * @return the automationAccountArmId value.
     */
    public String automationAccountArmId() {
        return this.automationAccountArmId;
    }

    /**
     * Set the automationAccountArmId property: The automation account arm id.
     * 
     * @param automationAccountArmId the automationAccountArmId value to set.
     * @return the A2ACreateProtectionIntentInput object itself.
     */
    public A2ACreateProtectionIntentInput withAutomationAccountArmId(String automationAccountArmId) {
        this.automationAccountArmId = automationAccountArmId;
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
        if (fabricObjectId() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property fabricObjectId in model A2ACreateProtectionIntentInput"));
        }
        if (primaryLocation() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property primaryLocation in model A2ACreateProtectionIntentInput"));
        }
        if (recoveryLocation() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property recoveryLocation in model A2ACreateProtectionIntentInput"));
        }
        if (recoverySubscriptionId() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property recoverySubscriptionId in model A2ACreateProtectionIntentInput"));
        }
        if (recoveryAvailabilityType() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property recoveryAvailabilityType in model A2ACreateProtectionIntentInput"));
        }
        if (protectionProfileCustomInput() != null) {
            protectionProfileCustomInput().validate();
        }
        if (recoveryResourceGroupId() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property recoveryResourceGroupId in model A2ACreateProtectionIntentInput"));
        }
        if (primaryStagingStorageAccountCustomInput() != null) {
            primaryStagingStorageAccountCustomInput().validate();
        }
        if (recoveryAvailabilitySetCustomInput() != null) {
            recoveryAvailabilitySetCustomInput().validate();
        }
        if (recoveryVirtualNetworkCustomInput() != null) {
            recoveryVirtualNetworkCustomInput().validate();
        }
        if (recoveryProximityPlacementGroupCustomInput() != null) {
            recoveryProximityPlacementGroupCustomInput().validate();
        }
        if (vmDisks() != null) {
            vmDisks().forEach(e -> e.validate());
        }
        if (vmManagedDisks() != null) {
            vmManagedDisks().forEach(e -> e.validate());
        }
        if (recoveryBootDiagStorageAccount() != null) {
            recoveryBootDiagStorageAccount().validate();
        }
        if (diskEncryptionInfo() != null) {
            diskEncryptionInfo().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(A2ACreateProtectionIntentInput.class);
}
