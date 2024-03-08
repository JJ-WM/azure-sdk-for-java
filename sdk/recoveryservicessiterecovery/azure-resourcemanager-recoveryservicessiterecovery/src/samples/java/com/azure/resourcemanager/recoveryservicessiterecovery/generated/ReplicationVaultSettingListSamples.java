// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

/**
 * Samples for ReplicationVaultSetting List.
 */
public final class ReplicationVaultSettingListSamples {
    /*
     * x-ms-original-file:
     * specification/recoveryservicessiterecovery/resource-manager/Microsoft.RecoveryServices/stable/2023-08-01/examples
     * /ReplicationVaultSetting_List.json
     */
    /**
     * Sample code: Gets the list of vault setting.
     * 
     * @param manager Entry point to SiteRecoveryManager.
     */
    public static void
        getsTheListOfVaultSetting(com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager) {
        manager.replicationVaultSettings().list("vault1", "resourceGroupPS1", com.azure.core.util.Context.NONE);
    }
}
