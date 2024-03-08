// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

/**
 * Samples for ResourceProvider GetOperationStatus.
 */
public final class ResourceProviderGetOperationStatusSamples {
    /*
     * x-ms-original-file:
     * specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/stable/2023-06-01/examples/
     * BackupDataMove/BackupDataMoveOperationStatus_Get.json
     */
    /**
     * Sample code: Get OperationStatus.
     * 
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void
        getOperationStatus(com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager.resourceProviders().getOperationStatusWithResponse("source-rsv", "sourceRG",
            "00000000-0000-0000-0000-000000000000", com.azure.core.util.Context.NONE);
    }
}
