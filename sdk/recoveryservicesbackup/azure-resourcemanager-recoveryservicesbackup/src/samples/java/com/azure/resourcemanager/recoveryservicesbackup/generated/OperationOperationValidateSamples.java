// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.resourcemanager.recoveryservicesbackup.models.EncryptionDetails;
import com.azure.resourcemanager.recoveryservicesbackup.models.IaasVMRestoreRequest;
import com.azure.resourcemanager.recoveryservicesbackup.models.IdentityBasedRestoreDetails;
import com.azure.resourcemanager.recoveryservicesbackup.models.IdentityInfo;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryType;
import com.azure.resourcemanager.recoveryservicesbackup.models.ValidateIaasVMRestoreOperationRequest;
import com.azure.resourcemanager.recoveryservicesbackup.models.ValidateOperationRequestResource;

/**
 * Samples for OperationOperation Validate.
 */
public final class OperationOperationValidateSamples {
    /*
     * x-ms-original-file:
     * specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/stable/2023-06-01/examples/
     * AzureIaasVm/ValidateOperation_RestoreDisk.json
     */
    /**
     * Sample code: Validate Operation.
     * 
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void
        validateOperation(com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager.operationOperations().validateWithResponse("testVault", "testRG", new ValidateOperationRequestResource()
            .withId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/testVault/providers/Microsoft.RecoveryServices/vaults/testVault/backupFabrics/Azure/protectionContainers/IaasVMContainer;iaasvmcontainerv2;testRG;testvmName/protectedItems/VM;iaasvmcontainerv2;testRG;testvmName/recoveryPoints/348916168024334")
            .withProperties(new ValidateIaasVMRestoreOperationRequest().withRestoreRequest(new IaasVMRestoreRequest()
                .withRecoveryPointId("348916168024334").withRecoveryType(RecoveryType.RESTORE_DISKS)
                .withSourceResourceId(
                    "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/netsdktestrg/providers/Microsoft.Compute/virtualMachines/netvmtestv2vm1")
                .withStorageAccountId(
                    "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/testingRg/providers/Microsoft.Storage/storageAccounts/testAccount")
                .withRegion("southeastasia").withCreateNewCloudService(true).withOriginalStorageAccountOption(false)
                .withEncryptionDetails(new EncryptionDetails().withEncryptionEnabled(false))
                .withIdentityInfo(new IdentityInfo().withIsSystemAssignedIdentity(false).withManagedIdentityResourceId(
                    "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/asmaskarRG1/providers/Microsoft.ManagedIdentity/userAssignedIdentities/asmaskartestmsi")))),
            com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/stable/2023-06-01/examples/
     * AzureIaasVm/ValidateOperation_RestoreDisk_IdentityBasedRestoreDetails.json
     */
    /**
     * Sample code: Validate Operation with identityBasedRestoreDetails.
     * 
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void validateOperationWithIdentityBasedRestoreDetails(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager.operationOperations().validateWithResponse("testVault", "testRG", new ValidateOperationRequestResource()
            .withId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/testVault/providers/Microsoft.RecoveryServices/vaults/testVault/backupFabrics/Azure/protectionContainers/IaasVMContainer;iaasvmcontainerv2;testRG;testvmName/protectedItems/VM;iaasvmcontainerv2;testRG;testvmName/recoveryPoints/348916168024334")
            .withProperties(new ValidateIaasVMRestoreOperationRequest().withRestoreRequest(new IaasVMRestoreRequest()
                .withRecoveryPointId("348916168024334").withRecoveryType(RecoveryType.RESTORE_DISKS)
                .withSourceResourceId(
                    "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/netsdktestrg/providers/Microsoft.Compute/virtualMachines/netvmtestv2vm1")
                .withRegion("southeastasia").withCreateNewCloudService(true).withOriginalStorageAccountOption(false)
                .withEncryptionDetails(new EncryptionDetails().withEncryptionEnabled(false))
                .withIdentityInfo(new IdentityInfo().withIsSystemAssignedIdentity(false).withManagedIdentityResourceId(
                    "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/asmaskarRG1/providers/Microsoft.ManagedIdentity/userAssignedIdentities/asmaskartestmsi"))
                .withIdentityBasedRestoreDetails(new IdentityBasedRestoreDetails().withTargetStorageAccountId(
                    "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/testingRg/providers/Microsoft.Storage/storageAccounts/testAccount")))),
            com.azure.core.util.Context.NONE);
    }
}
