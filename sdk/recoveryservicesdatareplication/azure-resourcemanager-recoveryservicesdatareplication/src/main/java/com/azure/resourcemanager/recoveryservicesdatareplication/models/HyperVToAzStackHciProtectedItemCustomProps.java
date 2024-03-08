// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.List;

/** HyperV to AzStackHCI Protected item model custom properties. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("HyperVToAzStackHCI")
@Fluent
public final class HyperVToAzStackHciProtectedItemCustomProps extends ProtectedItemModelCustomProperties {
    /*
     * Gets or sets the location of the protected item.
     */
    @JsonProperty(value = "activeLocation", access = JsonProperty.Access.WRITE_ONLY)
    private ProtectedItemActiveLocation activeLocation;

    /*
     * Gets or sets the Target HCI Cluster ARM Id.
     */
    @JsonProperty(value = "targetHciClusterId", required = true)
    private String targetHciClusterId;

    /*
     * Gets or sets the Target Arc Cluster Custom Location ARM Id.
     */
    @JsonProperty(value = "targetArcClusterCustomLocationId", required = true)
    private String targetArcClusterCustomLocationId;

    /*
     * Gets or sets the Target AzStackHCI cluster name.
     */
    @JsonProperty(value = "targetAzStackHciClusterName", access = JsonProperty.Access.WRITE_ONLY)
    private String targetAzStackHciClusterName;

    /*
     * Gets or sets the ARM Id of the discovered machine.
     */
    @JsonProperty(value = "fabricDiscoveryMachineId", required = true)
    private String fabricDiscoveryMachineId;

    /*
     * Gets or sets the list of disks to replicate.
     */
    @JsonProperty(value = "disksToInclude", required = true)
    private List<HyperVToAzStackHciDiskInput> disksToInclude;

    /*
     * Gets or sets the list of VM NIC to replicate.
     */
    @JsonProperty(value = "nicsToInclude", required = true)
    private List<HyperVToAzStackHciNicInput> nicsToInclude;

    /*
     * Gets or sets the source VM display name.
     */
    @JsonProperty(value = "sourceVmName", access = JsonProperty.Access.WRITE_ONLY)
    private String sourceVmName;

    /*
     * Gets or sets the source VM CPU cores.
     */
    @JsonProperty(value = "sourceCpuCores", access = JsonProperty.Access.WRITE_ONLY)
    private Integer sourceCpuCores;

    /*
     * Gets or sets the source VM ram memory size in megabytes.
     */
    @JsonProperty(value = "sourceMemoryInMegaBytes", access = JsonProperty.Access.WRITE_ONLY)
    private Double sourceMemoryInMegaBytes;

    /*
     * Gets or sets the target VM display name.
     */
    @JsonProperty(value = "targetVmName")
    private String targetVmName;

    /*
     * Gets or sets the target resource group ARM Id.
     */
    @JsonProperty(value = "targetResourceGroupId", required = true)
    private String targetResourceGroupId;

    /*
     * Gets or sets the target storage container ARM Id.
     */
    @JsonProperty(value = "storageContainerId", required = true)
    private String storageContainerId;

    /*
     * Gets or sets the hypervisor generation of the virtual machine.
     */
    @JsonProperty(value = "hyperVGeneration", required = true)
    private String hyperVGeneration;

    /*
     * Gets or sets the target network Id within AzStackHCI Cluster.
     */
    @JsonProperty(value = "targetNetworkId")
    private String targetNetworkId;

    /*
     * Gets or sets the target test network Id within AzStackHCI Cluster.
     */
    @JsonProperty(value = "testNetworkId")
    private String testNetworkId;

    /*
     * Gets or sets the target CPU cores.
     */
    @JsonProperty(value = "targetCpuCores")
    private Integer targetCpuCores;

    /*
     * Gets or sets a value indicating whether memory is dynamical.
     */
    @JsonProperty(value = "isDynamicRam")
    private Boolean isDynamicRam;

    /*
     * Protected item dynamic memory config.
     */
    @JsonProperty(value = "dynamicMemoryConfig")
    private ProtectedItemDynamicMemoryConfig dynamicMemoryConfig;

    /*
     * Gets or sets the target memory in mega-bytes.
     */
    @JsonProperty(value = "targetMemoryInMegaBytes")
    private Integer targetMemoryInMegaBytes;

    /*
     * Gets or sets the Run As account Id.
     */
    @JsonProperty(value = "runAsAccountId", required = true)
    private String runAsAccountId;

    /*
     * Gets or sets the source DRA name.
     */
    @JsonProperty(value = "sourceDraName", required = true)
    private String sourceDraName;

    /*
     * Gets or sets the target DRA name.
     */
    @JsonProperty(value = "targetDraName", required = true)
    private String targetDraName;

    /*
     * Gets or sets the source appliance name.
     */
    @JsonProperty(value = "sourceApplianceName", access = JsonProperty.Access.WRITE_ONLY)
    private String sourceApplianceName;

    /*
     * Gets or sets the target appliance name.
     */
    @JsonProperty(value = "targetApplianceName", access = JsonProperty.Access.WRITE_ONLY)
    private String targetApplianceName;

    /*
     * Gets or sets the type of the OS.
     */
    @JsonProperty(value = "osType", access = JsonProperty.Access.WRITE_ONLY)
    private String osType;

    /*
     * Gets or sets the name of the OS.
     */
    @JsonProperty(value = "osName", access = JsonProperty.Access.WRITE_ONLY)
    private String osName;

    /*
     * Gets or sets the firmware type.
     */
    @JsonProperty(value = "firmwareType", access = JsonProperty.Access.WRITE_ONLY)
    private String firmwareType;

    /*
     * Gets or sets the target location.
     */
    @JsonProperty(value = "targetLocation", access = JsonProperty.Access.WRITE_ONLY)
    private String targetLocation;

    /*
     * Gets or sets the location of Azure Arc HCI custom location resource.
     */
    @JsonProperty(value = "customLocationRegion", required = true)
    private String customLocationRegion;

    /*
     * Gets or sets the recovery point Id to which the VM was failed over.
     */
    @JsonProperty(value = "failoverRecoveryPointId", access = JsonProperty.Access.WRITE_ONLY)
    private String failoverRecoveryPointId;

    /*
     * Gets or sets the last recovery point received time.
     */
    @JsonProperty(value = "lastRecoveryPointReceived", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastRecoveryPointReceived;

    /*
     * Gets or sets the last recovery point Id.
     */
    @JsonProperty(value = "lastRecoveryPointId", access = JsonProperty.Access.WRITE_ONLY)
    private String lastRecoveryPointId;

    /*
     * Gets or sets the initial replication progress percentage. This is calculated based on
     * total bytes processed for all disks in the source VM.
     */
    @JsonProperty(value = "initialReplicationProgressPercentage", access = JsonProperty.Access.WRITE_ONLY)
    private Integer initialReplicationProgressPercentage;

    /*
     * Gets or sets the resync progress percentage. This is calculated based on total bytes
     * processed for all disks in the source VM.
     */
    @JsonProperty(value = "resyncProgressPercentage", access = JsonProperty.Access.WRITE_ONLY)
    private Integer resyncProgressPercentage;

    /*
     * Gets or sets the list of protected disks.
     */
    @JsonProperty(value = "protectedDisks", access = JsonProperty.Access.WRITE_ONLY)
    private List<HyperVToAzStackHciProtectedDiskProperties> protectedDisks;

    /*
     * Gets or sets the VM NIC details.
     */
    @JsonProperty(value = "protectedNics", access = JsonProperty.Access.WRITE_ONLY)
    private List<HyperVToAzStackHciProtectedNicProperties> protectedNics;

    /*
     * Gets or sets the BIOS Id of the target AzStackHCI VM.
     */
    @JsonProperty(value = "targetVmBiosId", access = JsonProperty.Access.WRITE_ONLY)
    private String targetVmBiosId;

    /*
     * Gets or sets the latest timestamp that replication status is updated.
     */
    @JsonProperty(value = "lastReplicationUpdateTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastReplicationUpdateTime;

    /** Creates an instance of HyperVToAzStackHciProtectedItemCustomProps class. */
    public HyperVToAzStackHciProtectedItemCustomProps() {
    }

    /**
     * Get the activeLocation property: Gets or sets the location of the protected item.
     *
     * @return the activeLocation value.
     */
    public ProtectedItemActiveLocation activeLocation() {
        return this.activeLocation;
    }

    /**
     * Get the targetHciClusterId property: Gets or sets the Target HCI Cluster ARM Id.
     *
     * @return the targetHciClusterId value.
     */
    public String targetHciClusterId() {
        return this.targetHciClusterId;
    }

    /**
     * Set the targetHciClusterId property: Gets or sets the Target HCI Cluster ARM Id.
     *
     * @param targetHciClusterId the targetHciClusterId value to set.
     * @return the HyperVToAzStackHciProtectedItemCustomProps object itself.
     */
    public HyperVToAzStackHciProtectedItemCustomProps withTargetHciClusterId(String targetHciClusterId) {
        this.targetHciClusterId = targetHciClusterId;
        return this;
    }

    /**
     * Get the targetArcClusterCustomLocationId property: Gets or sets the Target Arc Cluster Custom Location ARM Id.
     *
     * @return the targetArcClusterCustomLocationId value.
     */
    public String targetArcClusterCustomLocationId() {
        return this.targetArcClusterCustomLocationId;
    }

    /**
     * Set the targetArcClusterCustomLocationId property: Gets or sets the Target Arc Cluster Custom Location ARM Id.
     *
     * @param targetArcClusterCustomLocationId the targetArcClusterCustomLocationId value to set.
     * @return the HyperVToAzStackHciProtectedItemCustomProps object itself.
     */
    public HyperVToAzStackHciProtectedItemCustomProps withTargetArcClusterCustomLocationId(
        String targetArcClusterCustomLocationId) {
        this.targetArcClusterCustomLocationId = targetArcClusterCustomLocationId;
        return this;
    }

    /**
     * Get the targetAzStackHciClusterName property: Gets or sets the Target AzStackHCI cluster name.
     *
     * @return the targetAzStackHciClusterName value.
     */
    public String targetAzStackHciClusterName() {
        return this.targetAzStackHciClusterName;
    }

    /**
     * Get the fabricDiscoveryMachineId property: Gets or sets the ARM Id of the discovered machine.
     *
     * @return the fabricDiscoveryMachineId value.
     */
    public String fabricDiscoveryMachineId() {
        return this.fabricDiscoveryMachineId;
    }

    /**
     * Set the fabricDiscoveryMachineId property: Gets or sets the ARM Id of the discovered machine.
     *
     * @param fabricDiscoveryMachineId the fabricDiscoveryMachineId value to set.
     * @return the HyperVToAzStackHciProtectedItemCustomProps object itself.
     */
    public HyperVToAzStackHciProtectedItemCustomProps withFabricDiscoveryMachineId(String fabricDiscoveryMachineId) {
        this.fabricDiscoveryMachineId = fabricDiscoveryMachineId;
        return this;
    }

    /**
     * Get the disksToInclude property: Gets or sets the list of disks to replicate.
     *
     * @return the disksToInclude value.
     */
    public List<HyperVToAzStackHciDiskInput> disksToInclude() {
        return this.disksToInclude;
    }

    /**
     * Set the disksToInclude property: Gets or sets the list of disks to replicate.
     *
     * @param disksToInclude the disksToInclude value to set.
     * @return the HyperVToAzStackHciProtectedItemCustomProps object itself.
     */
    public HyperVToAzStackHciProtectedItemCustomProps withDisksToInclude(
        List<HyperVToAzStackHciDiskInput> disksToInclude) {
        this.disksToInclude = disksToInclude;
        return this;
    }

    /**
     * Get the nicsToInclude property: Gets or sets the list of VM NIC to replicate.
     *
     * @return the nicsToInclude value.
     */
    public List<HyperVToAzStackHciNicInput> nicsToInclude() {
        return this.nicsToInclude;
    }

    /**
     * Set the nicsToInclude property: Gets or sets the list of VM NIC to replicate.
     *
     * @param nicsToInclude the nicsToInclude value to set.
     * @return the HyperVToAzStackHciProtectedItemCustomProps object itself.
     */
    public HyperVToAzStackHciProtectedItemCustomProps withNicsToInclude(
        List<HyperVToAzStackHciNicInput> nicsToInclude) {
        this.nicsToInclude = nicsToInclude;
        return this;
    }

    /**
     * Get the sourceVmName property: Gets or sets the source VM display name.
     *
     * @return the sourceVmName value.
     */
    public String sourceVmName() {
        return this.sourceVmName;
    }

    /**
     * Get the sourceCpuCores property: Gets or sets the source VM CPU cores.
     *
     * @return the sourceCpuCores value.
     */
    public Integer sourceCpuCores() {
        return this.sourceCpuCores;
    }

    /**
     * Get the sourceMemoryInMegaBytes property: Gets or sets the source VM ram memory size in megabytes.
     *
     * @return the sourceMemoryInMegaBytes value.
     */
    public Double sourceMemoryInMegaBytes() {
        return this.sourceMemoryInMegaBytes;
    }

    /**
     * Get the targetVmName property: Gets or sets the target VM display name.
     *
     * @return the targetVmName value.
     */
    public String targetVmName() {
        return this.targetVmName;
    }

    /**
     * Set the targetVmName property: Gets or sets the target VM display name.
     *
     * @param targetVmName the targetVmName value to set.
     * @return the HyperVToAzStackHciProtectedItemCustomProps object itself.
     */
    public HyperVToAzStackHciProtectedItemCustomProps withTargetVmName(String targetVmName) {
        this.targetVmName = targetVmName;
        return this;
    }

    /**
     * Get the targetResourceGroupId property: Gets or sets the target resource group ARM Id.
     *
     * @return the targetResourceGroupId value.
     */
    public String targetResourceGroupId() {
        return this.targetResourceGroupId;
    }

    /**
     * Set the targetResourceGroupId property: Gets or sets the target resource group ARM Id.
     *
     * @param targetResourceGroupId the targetResourceGroupId value to set.
     * @return the HyperVToAzStackHciProtectedItemCustomProps object itself.
     */
    public HyperVToAzStackHciProtectedItemCustomProps withTargetResourceGroupId(String targetResourceGroupId) {
        this.targetResourceGroupId = targetResourceGroupId;
        return this;
    }

    /**
     * Get the storageContainerId property: Gets or sets the target storage container ARM Id.
     *
     * @return the storageContainerId value.
     */
    public String storageContainerId() {
        return this.storageContainerId;
    }

    /**
     * Set the storageContainerId property: Gets or sets the target storage container ARM Id.
     *
     * @param storageContainerId the storageContainerId value to set.
     * @return the HyperVToAzStackHciProtectedItemCustomProps object itself.
     */
    public HyperVToAzStackHciProtectedItemCustomProps withStorageContainerId(String storageContainerId) {
        this.storageContainerId = storageContainerId;
        return this;
    }

    /**
     * Get the hyperVGeneration property: Gets or sets the hypervisor generation of the virtual machine.
     *
     * @return the hyperVGeneration value.
     */
    public String hyperVGeneration() {
        return this.hyperVGeneration;
    }

    /**
     * Set the hyperVGeneration property: Gets or sets the hypervisor generation of the virtual machine.
     *
     * @param hyperVGeneration the hyperVGeneration value to set.
     * @return the HyperVToAzStackHciProtectedItemCustomProps object itself.
     */
    public HyperVToAzStackHciProtectedItemCustomProps withHyperVGeneration(String hyperVGeneration) {
        this.hyperVGeneration = hyperVGeneration;
        return this;
    }

    /**
     * Get the targetNetworkId property: Gets or sets the target network Id within AzStackHCI Cluster.
     *
     * @return the targetNetworkId value.
     */
    public String targetNetworkId() {
        return this.targetNetworkId;
    }

    /**
     * Set the targetNetworkId property: Gets or sets the target network Id within AzStackHCI Cluster.
     *
     * @param targetNetworkId the targetNetworkId value to set.
     * @return the HyperVToAzStackHciProtectedItemCustomProps object itself.
     */
    public HyperVToAzStackHciProtectedItemCustomProps withTargetNetworkId(String targetNetworkId) {
        this.targetNetworkId = targetNetworkId;
        return this;
    }

    /**
     * Get the testNetworkId property: Gets or sets the target test network Id within AzStackHCI Cluster.
     *
     * @return the testNetworkId value.
     */
    public String testNetworkId() {
        return this.testNetworkId;
    }

    /**
     * Set the testNetworkId property: Gets or sets the target test network Id within AzStackHCI Cluster.
     *
     * @param testNetworkId the testNetworkId value to set.
     * @return the HyperVToAzStackHciProtectedItemCustomProps object itself.
     */
    public HyperVToAzStackHciProtectedItemCustomProps withTestNetworkId(String testNetworkId) {
        this.testNetworkId = testNetworkId;
        return this;
    }

    /**
     * Get the targetCpuCores property: Gets or sets the target CPU cores.
     *
     * @return the targetCpuCores value.
     */
    public Integer targetCpuCores() {
        return this.targetCpuCores;
    }

    /**
     * Set the targetCpuCores property: Gets or sets the target CPU cores.
     *
     * @param targetCpuCores the targetCpuCores value to set.
     * @return the HyperVToAzStackHciProtectedItemCustomProps object itself.
     */
    public HyperVToAzStackHciProtectedItemCustomProps withTargetCpuCores(Integer targetCpuCores) {
        this.targetCpuCores = targetCpuCores;
        return this;
    }

    /**
     * Get the isDynamicRam property: Gets or sets a value indicating whether memory is dynamical.
     *
     * @return the isDynamicRam value.
     */
    public Boolean isDynamicRam() {
        return this.isDynamicRam;
    }

    /**
     * Set the isDynamicRam property: Gets or sets a value indicating whether memory is dynamical.
     *
     * @param isDynamicRam the isDynamicRam value to set.
     * @return the HyperVToAzStackHciProtectedItemCustomProps object itself.
     */
    public HyperVToAzStackHciProtectedItemCustomProps withIsDynamicRam(Boolean isDynamicRam) {
        this.isDynamicRam = isDynamicRam;
        return this;
    }

    /**
     * Get the dynamicMemoryConfig property: Protected item dynamic memory config.
     *
     * @return the dynamicMemoryConfig value.
     */
    public ProtectedItemDynamicMemoryConfig dynamicMemoryConfig() {
        return this.dynamicMemoryConfig;
    }

    /**
     * Set the dynamicMemoryConfig property: Protected item dynamic memory config.
     *
     * @param dynamicMemoryConfig the dynamicMemoryConfig value to set.
     * @return the HyperVToAzStackHciProtectedItemCustomProps object itself.
     */
    public HyperVToAzStackHciProtectedItemCustomProps withDynamicMemoryConfig(
        ProtectedItemDynamicMemoryConfig dynamicMemoryConfig) {
        this.dynamicMemoryConfig = dynamicMemoryConfig;
        return this;
    }

    /**
     * Get the targetMemoryInMegaBytes property: Gets or sets the target memory in mega-bytes.
     *
     * @return the targetMemoryInMegaBytes value.
     */
    public Integer targetMemoryInMegaBytes() {
        return this.targetMemoryInMegaBytes;
    }

    /**
     * Set the targetMemoryInMegaBytes property: Gets or sets the target memory in mega-bytes.
     *
     * @param targetMemoryInMegaBytes the targetMemoryInMegaBytes value to set.
     * @return the HyperVToAzStackHciProtectedItemCustomProps object itself.
     */
    public HyperVToAzStackHciProtectedItemCustomProps withTargetMemoryInMegaBytes(Integer targetMemoryInMegaBytes) {
        this.targetMemoryInMegaBytes = targetMemoryInMegaBytes;
        return this;
    }

    /**
     * Get the runAsAccountId property: Gets or sets the Run As account Id.
     *
     * @return the runAsAccountId value.
     */
    public String runAsAccountId() {
        return this.runAsAccountId;
    }

    /**
     * Set the runAsAccountId property: Gets or sets the Run As account Id.
     *
     * @param runAsAccountId the runAsAccountId value to set.
     * @return the HyperVToAzStackHciProtectedItemCustomProps object itself.
     */
    public HyperVToAzStackHciProtectedItemCustomProps withRunAsAccountId(String runAsAccountId) {
        this.runAsAccountId = runAsAccountId;
        return this;
    }

    /**
     * Get the sourceDraName property: Gets or sets the source DRA name.
     *
     * @return the sourceDraName value.
     */
    public String sourceDraName() {
        return this.sourceDraName;
    }

    /**
     * Set the sourceDraName property: Gets or sets the source DRA name.
     *
     * @param sourceDraName the sourceDraName value to set.
     * @return the HyperVToAzStackHciProtectedItemCustomProps object itself.
     */
    public HyperVToAzStackHciProtectedItemCustomProps withSourceDraName(String sourceDraName) {
        this.sourceDraName = sourceDraName;
        return this;
    }

    /**
     * Get the targetDraName property: Gets or sets the target DRA name.
     *
     * @return the targetDraName value.
     */
    public String targetDraName() {
        return this.targetDraName;
    }

    /**
     * Set the targetDraName property: Gets or sets the target DRA name.
     *
     * @param targetDraName the targetDraName value to set.
     * @return the HyperVToAzStackHciProtectedItemCustomProps object itself.
     */
    public HyperVToAzStackHciProtectedItemCustomProps withTargetDraName(String targetDraName) {
        this.targetDraName = targetDraName;
        return this;
    }

    /**
     * Get the sourceApplianceName property: Gets or sets the source appliance name.
     *
     * @return the sourceApplianceName value.
     */
    public String sourceApplianceName() {
        return this.sourceApplianceName;
    }

    /**
     * Get the targetApplianceName property: Gets or sets the target appliance name.
     *
     * @return the targetApplianceName value.
     */
    public String targetApplianceName() {
        return this.targetApplianceName;
    }

    /**
     * Get the osType property: Gets or sets the type of the OS.
     *
     * @return the osType value.
     */
    public String osType() {
        return this.osType;
    }

    /**
     * Get the osName property: Gets or sets the name of the OS.
     *
     * @return the osName value.
     */
    public String osName() {
        return this.osName;
    }

    /**
     * Get the firmwareType property: Gets or sets the firmware type.
     *
     * @return the firmwareType value.
     */
    public String firmwareType() {
        return this.firmwareType;
    }

    /**
     * Get the targetLocation property: Gets or sets the target location.
     *
     * @return the targetLocation value.
     */
    public String targetLocation() {
        return this.targetLocation;
    }

    /**
     * Get the customLocationRegion property: Gets or sets the location of Azure Arc HCI custom location resource.
     *
     * @return the customLocationRegion value.
     */
    public String customLocationRegion() {
        return this.customLocationRegion;
    }

    /**
     * Set the customLocationRegion property: Gets or sets the location of Azure Arc HCI custom location resource.
     *
     * @param customLocationRegion the customLocationRegion value to set.
     * @return the HyperVToAzStackHciProtectedItemCustomProps object itself.
     */
    public HyperVToAzStackHciProtectedItemCustomProps withCustomLocationRegion(String customLocationRegion) {
        this.customLocationRegion = customLocationRegion;
        return this;
    }

    /**
     * Get the failoverRecoveryPointId property: Gets or sets the recovery point Id to which the VM was failed over.
     *
     * @return the failoverRecoveryPointId value.
     */
    public String failoverRecoveryPointId() {
        return this.failoverRecoveryPointId;
    }

    /**
     * Get the lastRecoveryPointReceived property: Gets or sets the last recovery point received time.
     *
     * @return the lastRecoveryPointReceived value.
     */
    public OffsetDateTime lastRecoveryPointReceived() {
        return this.lastRecoveryPointReceived;
    }

    /**
     * Get the lastRecoveryPointId property: Gets or sets the last recovery point Id.
     *
     * @return the lastRecoveryPointId value.
     */
    public String lastRecoveryPointId() {
        return this.lastRecoveryPointId;
    }

    /**
     * Get the initialReplicationProgressPercentage property: Gets or sets the initial replication progress percentage.
     * This is calculated based on total bytes processed for all disks in the source VM.
     *
     * @return the initialReplicationProgressPercentage value.
     */
    public Integer initialReplicationProgressPercentage() {
        return this.initialReplicationProgressPercentage;
    }

    /**
     * Get the resyncProgressPercentage property: Gets or sets the resync progress percentage. This is calculated based
     * on total bytes processed for all disks in the source VM.
     *
     * @return the resyncProgressPercentage value.
     */
    public Integer resyncProgressPercentage() {
        return this.resyncProgressPercentage;
    }

    /**
     * Get the protectedDisks property: Gets or sets the list of protected disks.
     *
     * @return the protectedDisks value.
     */
    public List<HyperVToAzStackHciProtectedDiskProperties> protectedDisks() {
        return this.protectedDisks;
    }

    /**
     * Get the protectedNics property: Gets or sets the VM NIC details.
     *
     * @return the protectedNics value.
     */
    public List<HyperVToAzStackHciProtectedNicProperties> protectedNics() {
        return this.protectedNics;
    }

    /**
     * Get the targetVmBiosId property: Gets or sets the BIOS Id of the target AzStackHCI VM.
     *
     * @return the targetVmBiosId value.
     */
    public String targetVmBiosId() {
        return this.targetVmBiosId;
    }

    /**
     * Get the lastReplicationUpdateTime property: Gets or sets the latest timestamp that replication status is updated.
     *
     * @return the lastReplicationUpdateTime value.
     */
    public OffsetDateTime lastReplicationUpdateTime() {
        return this.lastReplicationUpdateTime;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (targetHciClusterId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property targetHciClusterId in model"
                            + " HyperVToAzStackHciProtectedItemCustomProps"));
        }
        if (targetArcClusterCustomLocationId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property targetArcClusterCustomLocationId in model"
                            + " HyperVToAzStackHciProtectedItemCustomProps"));
        }
        if (fabricDiscoveryMachineId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property fabricDiscoveryMachineId in model"
                            + " HyperVToAzStackHciProtectedItemCustomProps"));
        }
        if (disksToInclude() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property disksToInclude in model"
                            + " HyperVToAzStackHciProtectedItemCustomProps"));
        } else {
            disksToInclude().forEach(e -> e.validate());
        }
        if (nicsToInclude() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property nicsToInclude in model HyperVToAzStackHciProtectedItemCustomProps"));
        } else {
            nicsToInclude().forEach(e -> e.validate());
        }
        if (targetResourceGroupId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property targetResourceGroupId in model"
                            + " HyperVToAzStackHciProtectedItemCustomProps"));
        }
        if (storageContainerId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property storageContainerId in model"
                            + " HyperVToAzStackHciProtectedItemCustomProps"));
        }
        if (hyperVGeneration() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property hyperVGeneration in model"
                            + " HyperVToAzStackHciProtectedItemCustomProps"));
        }
        if (dynamicMemoryConfig() != null) {
            dynamicMemoryConfig().validate();
        }
        if (runAsAccountId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property runAsAccountId in model"
                            + " HyperVToAzStackHciProtectedItemCustomProps"));
        }
        if (sourceDraName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property sourceDraName in model HyperVToAzStackHciProtectedItemCustomProps"));
        }
        if (targetDraName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property targetDraName in model HyperVToAzStackHciProtectedItemCustomProps"));
        }
        if (customLocationRegion() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property customLocationRegion in model"
                            + " HyperVToAzStackHciProtectedItemCustomProps"));
        }
        if (protectedDisks() != null) {
            protectedDisks().forEach(e -> e.validate());
        }
        if (protectedNics() != null) {
            protectedNics().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(HyperVToAzStackHciProtectedItemCustomProps.class);
}
