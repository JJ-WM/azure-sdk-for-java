// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** VMwareCbt provider specific settings. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("VMwareCbt")
@Fluent
public final class VMwareCbtMigrationDetails extends MigrationProviderSpecificSettings {
    /*
     * The ARM Id of the VM discovered in VMware.
     */
    @JsonProperty(value = "vmwareMachineId", access = JsonProperty.Access.WRITE_ONLY)
    private String vmwareMachineId;

    /*
     * The type of the OS on the VM.
     */
    @JsonProperty(value = "osType", access = JsonProperty.Access.WRITE_ONLY)
    private String osType;

    /*
     * The name of the OS on the VM.
     */
    @JsonProperty(value = "osName", access = JsonProperty.Access.WRITE_ONLY)
    private String osName;

    /*
     * The firmware type.
     */
    @JsonProperty(value = "firmwareType", access = JsonProperty.Access.WRITE_ONLY)
    private String firmwareType;

    /*
     * The target generation.
     */
    @JsonProperty(value = "targetGeneration", access = JsonProperty.Access.WRITE_ONLY)
    private String targetGeneration;

    /*
     * License Type of the VM to be used.
     */
    @JsonProperty(value = "licenseType")
    private String licenseType;

    /*
     * The SQL Server license type.
     */
    @JsonProperty(value = "sqlServerLicenseType")
    private String sqlServerLicenseType;

    /*
     * The data mover run as account Id.
     */
    @JsonProperty(value = "dataMoverRunAsAccountId", access = JsonProperty.Access.WRITE_ONLY)
    private String dataMoverRunAsAccountId;

    /*
     * The snapshot run as account Id.
     */
    @JsonProperty(value = "snapshotRunAsAccountId", access = JsonProperty.Access.WRITE_ONLY)
    private String snapshotRunAsAccountId;

    /*
     * The replication storage account ARM Id. This is applicable only for the blob based replication test hook.
     */
    @JsonProperty(value = "storageAccountId", access = JsonProperty.Access.WRITE_ONLY)
    private String storageAccountId;

    /*
     * Target VM name.
     */
    @JsonProperty(value = "targetVmName")
    private String targetVmName;

    /*
     * The target VM size.
     */
    @JsonProperty(value = "targetVmSize")
    private String targetVmSize;

    /*
     * The target location.
     */
    @JsonProperty(value = "targetLocation", access = JsonProperty.Access.WRITE_ONLY)
    private String targetLocation;

    /*
     * The target resource group Id.
     */
    @JsonProperty(value = "targetResourceGroupId")
    private String targetResourceGroupId;

    /*
     * The target availability set Id.
     */
    @JsonProperty(value = "targetAvailabilitySetId")
    private String targetAvailabilitySetId;

    /*
     * The target availability zone.
     */
    @JsonProperty(value = "targetAvailabilityZone")
    private String targetAvailabilityZone;

    /*
     * The target proximity placement group Id.
     */
    @JsonProperty(value = "targetProximityPlacementGroupId")
    private String targetProximityPlacementGroupId;

    /*
     * The confidential VM key vault Id for ADE installation.
     */
    @JsonProperty(value = "confidentialVmKeyVaultId")
    private String confidentialVmKeyVaultId;

    /*
     * The target VM security profile.
     */
    @JsonProperty(value = "targetVmSecurityProfile")
    private VMwareCbtSecurityProfileProperties targetVmSecurityProfile;

    /*
     * The target boot diagnostics storage account ARM Id.
     */
    @JsonProperty(value = "targetBootDiagnosticsStorageAccountId")
    private String targetBootDiagnosticsStorageAccountId;

    /*
     * The target VM tags.
     */
    @JsonProperty(value = "targetVmTags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> targetVmTags;

    /*
     * The list of protected disks.
     */
    @JsonProperty(value = "protectedDisks")
    private List<VMwareCbtProtectedDiskDetails> protectedDisks;

    /*
     * The target network Id.
     */
    @JsonProperty(value = "targetNetworkId")
    private String targetNetworkId;

    /*
     * The test network Id.
     */
    @JsonProperty(value = "testNetworkId")
    private String testNetworkId;

    /*
     * The network details.
     */
    @JsonProperty(value = "vmNics")
    private List<VMwareCbtNicDetails> vmNics;

    /*
     * The tags for the target NICs.
     */
    @JsonProperty(value = "targetNicTags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> targetNicTags;

    /*
     * The recovery point Id to which the VM was migrated.
     */
    @JsonProperty(value = "migrationRecoveryPointId", access = JsonProperty.Access.WRITE_ONLY)
    private String migrationRecoveryPointId;

    /*
     * The last recovery point received time.
     */
    @JsonProperty(value = "lastRecoveryPointReceived", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastRecoveryPointReceived;

    /*
     * The last recovery point Id.
     */
    @JsonProperty(value = "lastRecoveryPointId", access = JsonProperty.Access.WRITE_ONLY)
    private String lastRecoveryPointId;

    /*
     * The initial seeding progress percentage.
     */
    @JsonProperty(value = "initialSeedingProgressPercentage", access = JsonProperty.Access.WRITE_ONLY)
    private Integer initialSeedingProgressPercentage;

    /*
     * The migration progress percentage.
     */
    @JsonProperty(value = "migrationProgressPercentage", access = JsonProperty.Access.WRITE_ONLY)
    private Integer migrationProgressPercentage;

    /*
     * The resync progress percentage.
     */
    @JsonProperty(value = "resyncProgressPercentage", access = JsonProperty.Access.WRITE_ONLY)
    private Integer resyncProgressPercentage;

    /*
     * The resume progress percentage.
     */
    @JsonProperty(value = "resumeProgressPercentage", access = JsonProperty.Access.WRITE_ONLY)
    private Integer resumeProgressPercentage;

    /*
     * The delta sync progress percentage.
     */
    @JsonProperty(value = "deltaSyncProgressPercentage", access = JsonProperty.Access.WRITE_ONLY)
    private Integer deltaSyncProgressPercentage;

    /*
     * A value indicating whether checksum resync cycle is in progress.
     */
    @JsonProperty(value = "isCheckSumResyncCycle", access = JsonProperty.Access.WRITE_ONLY)
    private String isCheckSumResyncCycle;

    /*
     * The initial seeding retry count.
     */
    @JsonProperty(value = "initialSeedingRetryCount", access = JsonProperty.Access.WRITE_ONLY)
    private Long initialSeedingRetryCount;

    /*
     * The resync retry count.
     */
    @JsonProperty(value = "resyncRetryCount", access = JsonProperty.Access.WRITE_ONLY)
    private Long resyncRetryCount;

    /*
     * The resume retry count.
     */
    @JsonProperty(value = "resumeRetryCount", access = JsonProperty.Access.WRITE_ONLY)
    private Long resumeRetryCount;

    /*
     * The delta sync retry count.
     */
    @JsonProperty(value = "deltaSyncRetryCount", access = JsonProperty.Access.WRITE_ONLY)
    private Long deltaSyncRetryCount;

    /*
     * A value indicating whether resync is required.
     */
    @JsonProperty(value = "resyncRequired", access = JsonProperty.Access.WRITE_ONLY)
    private String resyncRequired;

    /*
     * The resync state.
     */
    @JsonProperty(value = "resyncState", access = JsonProperty.Access.WRITE_ONLY)
    private ResyncState resyncState;

    /*
     * A value indicating whether auto resync is to be done.
     */
    @JsonProperty(value = "performAutoResync")
    private String performAutoResync;

    /*
     * The tags for the seed disks.
     */
    @JsonProperty(value = "seedDiskTags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> seedDiskTags;

    /*
     * The tags for the target disks.
     */
    @JsonProperty(value = "targetDiskTags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> targetDiskTags;

    /*
     * A value indicating the inplace OS Upgrade version.
     */
    @JsonProperty(value = "supportedOSVersions")
    private List<String> supportedOSVersions;

    /*
     * A value indicating the appliance monitoring details.
     */
    @JsonProperty(value = "applianceMonitoringDetails", access = JsonProperty.Access.WRITE_ONLY)
    private ApplianceMonitoringDetails applianceMonitoringDetails;

    /*
     * A value indicating the gateway operation details.
     */
    @JsonProperty(value = "gatewayOperationDetails", access = JsonProperty.Access.WRITE_ONLY)
    private GatewayOperationDetails gatewayOperationDetails;

    /*
     * A value indicating the SRS operation name.
     */
    @JsonProperty(value = "operationName", access = JsonProperty.Access.WRITE_ONLY)
    private String operationName;

    /** Creates an instance of VMwareCbtMigrationDetails class. */
    public VMwareCbtMigrationDetails() {
    }

    /**
     * Get the vmwareMachineId property: The ARM Id of the VM discovered in VMware.
     *
     * @return the vmwareMachineId value.
     */
    public String vmwareMachineId() {
        return this.vmwareMachineId;
    }

    /**
     * Get the osType property: The type of the OS on the VM.
     *
     * @return the osType value.
     */
    public String osType() {
        return this.osType;
    }

    /**
     * Get the osName property: The name of the OS on the VM.
     *
     * @return the osName value.
     */
    public String osName() {
        return this.osName;
    }

    /**
     * Get the firmwareType property: The firmware type.
     *
     * @return the firmwareType value.
     */
    public String firmwareType() {
        return this.firmwareType;
    }

    /**
     * Get the targetGeneration property: The target generation.
     *
     * @return the targetGeneration value.
     */
    public String targetGeneration() {
        return this.targetGeneration;
    }

    /**
     * Get the licenseType property: License Type of the VM to be used.
     *
     * @return the licenseType value.
     */
    public String licenseType() {
        return this.licenseType;
    }

    /**
     * Set the licenseType property: License Type of the VM to be used.
     *
     * @param licenseType the licenseType value to set.
     * @return the VMwareCbtMigrationDetails object itself.
     */
    public VMwareCbtMigrationDetails withLicenseType(String licenseType) {
        this.licenseType = licenseType;
        return this;
    }

    /**
     * Get the sqlServerLicenseType property: The SQL Server license type.
     *
     * @return the sqlServerLicenseType value.
     */
    public String sqlServerLicenseType() {
        return this.sqlServerLicenseType;
    }

    /**
     * Set the sqlServerLicenseType property: The SQL Server license type.
     *
     * @param sqlServerLicenseType the sqlServerLicenseType value to set.
     * @return the VMwareCbtMigrationDetails object itself.
     */
    public VMwareCbtMigrationDetails withSqlServerLicenseType(String sqlServerLicenseType) {
        this.sqlServerLicenseType = sqlServerLicenseType;
        return this;
    }

    /**
     * Get the dataMoverRunAsAccountId property: The data mover run as account Id.
     *
     * @return the dataMoverRunAsAccountId value.
     */
    public String dataMoverRunAsAccountId() {
        return this.dataMoverRunAsAccountId;
    }

    /**
     * Get the snapshotRunAsAccountId property: The snapshot run as account Id.
     *
     * @return the snapshotRunAsAccountId value.
     */
    public String snapshotRunAsAccountId() {
        return this.snapshotRunAsAccountId;
    }

    /**
     * Get the storageAccountId property: The replication storage account ARM Id. This is applicable only for the blob
     * based replication test hook.
     *
     * @return the storageAccountId value.
     */
    public String storageAccountId() {
        return this.storageAccountId;
    }

    /**
     * Get the targetVmName property: Target VM name.
     *
     * @return the targetVmName value.
     */
    public String targetVmName() {
        return this.targetVmName;
    }

    /**
     * Set the targetVmName property: Target VM name.
     *
     * @param targetVmName the targetVmName value to set.
     * @return the VMwareCbtMigrationDetails object itself.
     */
    public VMwareCbtMigrationDetails withTargetVmName(String targetVmName) {
        this.targetVmName = targetVmName;
        return this;
    }

    /**
     * Get the targetVmSize property: The target VM size.
     *
     * @return the targetVmSize value.
     */
    public String targetVmSize() {
        return this.targetVmSize;
    }

    /**
     * Set the targetVmSize property: The target VM size.
     *
     * @param targetVmSize the targetVmSize value to set.
     * @return the VMwareCbtMigrationDetails object itself.
     */
    public VMwareCbtMigrationDetails withTargetVmSize(String targetVmSize) {
        this.targetVmSize = targetVmSize;
        return this;
    }

    /**
     * Get the targetLocation property: The target location.
     *
     * @return the targetLocation value.
     */
    public String targetLocation() {
        return this.targetLocation;
    }

    /**
     * Get the targetResourceGroupId property: The target resource group Id.
     *
     * @return the targetResourceGroupId value.
     */
    public String targetResourceGroupId() {
        return this.targetResourceGroupId;
    }

    /**
     * Set the targetResourceGroupId property: The target resource group Id.
     *
     * @param targetResourceGroupId the targetResourceGroupId value to set.
     * @return the VMwareCbtMigrationDetails object itself.
     */
    public VMwareCbtMigrationDetails withTargetResourceGroupId(String targetResourceGroupId) {
        this.targetResourceGroupId = targetResourceGroupId;
        return this;
    }

    /**
     * Get the targetAvailabilitySetId property: The target availability set Id.
     *
     * @return the targetAvailabilitySetId value.
     */
    public String targetAvailabilitySetId() {
        return this.targetAvailabilitySetId;
    }

    /**
     * Set the targetAvailabilitySetId property: The target availability set Id.
     *
     * @param targetAvailabilitySetId the targetAvailabilitySetId value to set.
     * @return the VMwareCbtMigrationDetails object itself.
     */
    public VMwareCbtMigrationDetails withTargetAvailabilitySetId(String targetAvailabilitySetId) {
        this.targetAvailabilitySetId = targetAvailabilitySetId;
        return this;
    }

    /**
     * Get the targetAvailabilityZone property: The target availability zone.
     *
     * @return the targetAvailabilityZone value.
     */
    public String targetAvailabilityZone() {
        return this.targetAvailabilityZone;
    }

    /**
     * Set the targetAvailabilityZone property: The target availability zone.
     *
     * @param targetAvailabilityZone the targetAvailabilityZone value to set.
     * @return the VMwareCbtMigrationDetails object itself.
     */
    public VMwareCbtMigrationDetails withTargetAvailabilityZone(String targetAvailabilityZone) {
        this.targetAvailabilityZone = targetAvailabilityZone;
        return this;
    }

    /**
     * Get the targetProximityPlacementGroupId property: The target proximity placement group Id.
     *
     * @return the targetProximityPlacementGroupId value.
     */
    public String targetProximityPlacementGroupId() {
        return this.targetProximityPlacementGroupId;
    }

    /**
     * Set the targetProximityPlacementGroupId property: The target proximity placement group Id.
     *
     * @param targetProximityPlacementGroupId the targetProximityPlacementGroupId value to set.
     * @return the VMwareCbtMigrationDetails object itself.
     */
    public VMwareCbtMigrationDetails withTargetProximityPlacementGroupId(String targetProximityPlacementGroupId) {
        this.targetProximityPlacementGroupId = targetProximityPlacementGroupId;
        return this;
    }

    /**
     * Get the confidentialVmKeyVaultId property: The confidential VM key vault Id for ADE installation.
     *
     * @return the confidentialVmKeyVaultId value.
     */
    public String confidentialVmKeyVaultId() {
        return this.confidentialVmKeyVaultId;
    }

    /**
     * Set the confidentialVmKeyVaultId property: The confidential VM key vault Id for ADE installation.
     *
     * @param confidentialVmKeyVaultId the confidentialVmKeyVaultId value to set.
     * @return the VMwareCbtMigrationDetails object itself.
     */
    public VMwareCbtMigrationDetails withConfidentialVmKeyVaultId(String confidentialVmKeyVaultId) {
        this.confidentialVmKeyVaultId = confidentialVmKeyVaultId;
        return this;
    }

    /**
     * Get the targetVmSecurityProfile property: The target VM security profile.
     *
     * @return the targetVmSecurityProfile value.
     */
    public VMwareCbtSecurityProfileProperties targetVmSecurityProfile() {
        return this.targetVmSecurityProfile;
    }

    /**
     * Set the targetVmSecurityProfile property: The target VM security profile.
     *
     * @param targetVmSecurityProfile the targetVmSecurityProfile value to set.
     * @return the VMwareCbtMigrationDetails object itself.
     */
    public VMwareCbtMigrationDetails withTargetVmSecurityProfile(
        VMwareCbtSecurityProfileProperties targetVmSecurityProfile) {
        this.targetVmSecurityProfile = targetVmSecurityProfile;
        return this;
    }

    /**
     * Get the targetBootDiagnosticsStorageAccountId property: The target boot diagnostics storage account ARM Id.
     *
     * @return the targetBootDiagnosticsStorageAccountId value.
     */
    public String targetBootDiagnosticsStorageAccountId() {
        return this.targetBootDiagnosticsStorageAccountId;
    }

    /**
     * Set the targetBootDiagnosticsStorageAccountId property: The target boot diagnostics storage account ARM Id.
     *
     * @param targetBootDiagnosticsStorageAccountId the targetBootDiagnosticsStorageAccountId value to set.
     * @return the VMwareCbtMigrationDetails object itself.
     */
    public VMwareCbtMigrationDetails withTargetBootDiagnosticsStorageAccountId(
        String targetBootDiagnosticsStorageAccountId) {
        this.targetBootDiagnosticsStorageAccountId = targetBootDiagnosticsStorageAccountId;
        return this;
    }

    /**
     * Get the targetVmTags property: The target VM tags.
     *
     * @return the targetVmTags value.
     */
    public Map<String, String> targetVmTags() {
        return this.targetVmTags;
    }

    /**
     * Set the targetVmTags property: The target VM tags.
     *
     * @param targetVmTags the targetVmTags value to set.
     * @return the VMwareCbtMigrationDetails object itself.
     */
    public VMwareCbtMigrationDetails withTargetVmTags(Map<String, String> targetVmTags) {
        this.targetVmTags = targetVmTags;
        return this;
    }

    /**
     * Get the protectedDisks property: The list of protected disks.
     *
     * @return the protectedDisks value.
     */
    public List<VMwareCbtProtectedDiskDetails> protectedDisks() {
        return this.protectedDisks;
    }

    /**
     * Set the protectedDisks property: The list of protected disks.
     *
     * @param protectedDisks the protectedDisks value to set.
     * @return the VMwareCbtMigrationDetails object itself.
     */
    public VMwareCbtMigrationDetails withProtectedDisks(List<VMwareCbtProtectedDiskDetails> protectedDisks) {
        this.protectedDisks = protectedDisks;
        return this;
    }

    /**
     * Get the targetNetworkId property: The target network Id.
     *
     * @return the targetNetworkId value.
     */
    public String targetNetworkId() {
        return this.targetNetworkId;
    }

    /**
     * Set the targetNetworkId property: The target network Id.
     *
     * @param targetNetworkId the targetNetworkId value to set.
     * @return the VMwareCbtMigrationDetails object itself.
     */
    public VMwareCbtMigrationDetails withTargetNetworkId(String targetNetworkId) {
        this.targetNetworkId = targetNetworkId;
        return this;
    }

    /**
     * Get the testNetworkId property: The test network Id.
     *
     * @return the testNetworkId value.
     */
    public String testNetworkId() {
        return this.testNetworkId;
    }

    /**
     * Set the testNetworkId property: The test network Id.
     *
     * @param testNetworkId the testNetworkId value to set.
     * @return the VMwareCbtMigrationDetails object itself.
     */
    public VMwareCbtMigrationDetails withTestNetworkId(String testNetworkId) {
        this.testNetworkId = testNetworkId;
        return this;
    }

    /**
     * Get the vmNics property: The network details.
     *
     * @return the vmNics value.
     */
    public List<VMwareCbtNicDetails> vmNics() {
        return this.vmNics;
    }

    /**
     * Set the vmNics property: The network details.
     *
     * @param vmNics the vmNics value to set.
     * @return the VMwareCbtMigrationDetails object itself.
     */
    public VMwareCbtMigrationDetails withVmNics(List<VMwareCbtNicDetails> vmNics) {
        this.vmNics = vmNics;
        return this;
    }

    /**
     * Get the targetNicTags property: The tags for the target NICs.
     *
     * @return the targetNicTags value.
     */
    public Map<String, String> targetNicTags() {
        return this.targetNicTags;
    }

    /**
     * Set the targetNicTags property: The tags for the target NICs.
     *
     * @param targetNicTags the targetNicTags value to set.
     * @return the VMwareCbtMigrationDetails object itself.
     */
    public VMwareCbtMigrationDetails withTargetNicTags(Map<String, String> targetNicTags) {
        this.targetNicTags = targetNicTags;
        return this;
    }

    /**
     * Get the migrationRecoveryPointId property: The recovery point Id to which the VM was migrated.
     *
     * @return the migrationRecoveryPointId value.
     */
    public String migrationRecoveryPointId() {
        return this.migrationRecoveryPointId;
    }

    /**
     * Get the lastRecoveryPointReceived property: The last recovery point received time.
     *
     * @return the lastRecoveryPointReceived value.
     */
    public OffsetDateTime lastRecoveryPointReceived() {
        return this.lastRecoveryPointReceived;
    }

    /**
     * Get the lastRecoveryPointId property: The last recovery point Id.
     *
     * @return the lastRecoveryPointId value.
     */
    public String lastRecoveryPointId() {
        return this.lastRecoveryPointId;
    }

    /**
     * Get the initialSeedingProgressPercentage property: The initial seeding progress percentage.
     *
     * @return the initialSeedingProgressPercentage value.
     */
    public Integer initialSeedingProgressPercentage() {
        return this.initialSeedingProgressPercentage;
    }

    /**
     * Get the migrationProgressPercentage property: The migration progress percentage.
     *
     * @return the migrationProgressPercentage value.
     */
    public Integer migrationProgressPercentage() {
        return this.migrationProgressPercentage;
    }

    /**
     * Get the resyncProgressPercentage property: The resync progress percentage.
     *
     * @return the resyncProgressPercentage value.
     */
    public Integer resyncProgressPercentage() {
        return this.resyncProgressPercentage;
    }

    /**
     * Get the resumeProgressPercentage property: The resume progress percentage.
     *
     * @return the resumeProgressPercentage value.
     */
    public Integer resumeProgressPercentage() {
        return this.resumeProgressPercentage;
    }

    /**
     * Get the deltaSyncProgressPercentage property: The delta sync progress percentage.
     *
     * @return the deltaSyncProgressPercentage value.
     */
    public Integer deltaSyncProgressPercentage() {
        return this.deltaSyncProgressPercentage;
    }

    /**
     * Get the isCheckSumResyncCycle property: A value indicating whether checksum resync cycle is in progress.
     *
     * @return the isCheckSumResyncCycle value.
     */
    public String isCheckSumResyncCycle() {
        return this.isCheckSumResyncCycle;
    }

    /**
     * Get the initialSeedingRetryCount property: The initial seeding retry count.
     *
     * @return the initialSeedingRetryCount value.
     */
    public Long initialSeedingRetryCount() {
        return this.initialSeedingRetryCount;
    }

    /**
     * Get the resyncRetryCount property: The resync retry count.
     *
     * @return the resyncRetryCount value.
     */
    public Long resyncRetryCount() {
        return this.resyncRetryCount;
    }

    /**
     * Get the resumeRetryCount property: The resume retry count.
     *
     * @return the resumeRetryCount value.
     */
    public Long resumeRetryCount() {
        return this.resumeRetryCount;
    }

    /**
     * Get the deltaSyncRetryCount property: The delta sync retry count.
     *
     * @return the deltaSyncRetryCount value.
     */
    public Long deltaSyncRetryCount() {
        return this.deltaSyncRetryCount;
    }

    /**
     * Get the resyncRequired property: A value indicating whether resync is required.
     *
     * @return the resyncRequired value.
     */
    public String resyncRequired() {
        return this.resyncRequired;
    }

    /**
     * Get the resyncState property: The resync state.
     *
     * @return the resyncState value.
     */
    public ResyncState resyncState() {
        return this.resyncState;
    }

    /**
     * Get the performAutoResync property: A value indicating whether auto resync is to be done.
     *
     * @return the performAutoResync value.
     */
    public String performAutoResync() {
        return this.performAutoResync;
    }

    /**
     * Set the performAutoResync property: A value indicating whether auto resync is to be done.
     *
     * @param performAutoResync the performAutoResync value to set.
     * @return the VMwareCbtMigrationDetails object itself.
     */
    public VMwareCbtMigrationDetails withPerformAutoResync(String performAutoResync) {
        this.performAutoResync = performAutoResync;
        return this;
    }

    /**
     * Get the seedDiskTags property: The tags for the seed disks.
     *
     * @return the seedDiskTags value.
     */
    public Map<String, String> seedDiskTags() {
        return this.seedDiskTags;
    }

    /**
     * Set the seedDiskTags property: The tags for the seed disks.
     *
     * @param seedDiskTags the seedDiskTags value to set.
     * @return the VMwareCbtMigrationDetails object itself.
     */
    public VMwareCbtMigrationDetails withSeedDiskTags(Map<String, String> seedDiskTags) {
        this.seedDiskTags = seedDiskTags;
        return this;
    }

    /**
     * Get the targetDiskTags property: The tags for the target disks.
     *
     * @return the targetDiskTags value.
     */
    public Map<String, String> targetDiskTags() {
        return this.targetDiskTags;
    }

    /**
     * Set the targetDiskTags property: The tags for the target disks.
     *
     * @param targetDiskTags the targetDiskTags value to set.
     * @return the VMwareCbtMigrationDetails object itself.
     */
    public VMwareCbtMigrationDetails withTargetDiskTags(Map<String, String> targetDiskTags) {
        this.targetDiskTags = targetDiskTags;
        return this;
    }

    /**
     * Get the supportedOSVersions property: A value indicating the inplace OS Upgrade version.
     *
     * @return the supportedOSVersions value.
     */
    public List<String> supportedOSVersions() {
        return this.supportedOSVersions;
    }

    /**
     * Set the supportedOSVersions property: A value indicating the inplace OS Upgrade version.
     *
     * @param supportedOSVersions the supportedOSVersions value to set.
     * @return the VMwareCbtMigrationDetails object itself.
     */
    public VMwareCbtMigrationDetails withSupportedOSVersions(List<String> supportedOSVersions) {
        this.supportedOSVersions = supportedOSVersions;
        return this;
    }

    /**
     * Get the applianceMonitoringDetails property: A value indicating the appliance monitoring details.
     *
     * @return the applianceMonitoringDetails value.
     */
    public ApplianceMonitoringDetails applianceMonitoringDetails() {
        return this.applianceMonitoringDetails;
    }

    /**
     * Get the gatewayOperationDetails property: A value indicating the gateway operation details.
     *
     * @return the gatewayOperationDetails value.
     */
    public GatewayOperationDetails gatewayOperationDetails() {
        return this.gatewayOperationDetails;
    }

    /**
     * Get the operationName property: A value indicating the SRS operation name.
     *
     * @return the operationName value.
     */
    public String operationName() {
        return this.operationName;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (targetVmSecurityProfile() != null) {
            targetVmSecurityProfile().validate();
        }
        if (protectedDisks() != null) {
            protectedDisks().forEach(e -> e.validate());
        }
        if (vmNics() != null) {
            vmNics().forEach(e -> e.validate());
        }
        if (applianceMonitoringDetails() != null) {
            applianceMonitoringDetails().validate();
        }
        if (gatewayOperationDetails() != null) {
            gatewayOperationDetails().validate();
        }
    }
}
