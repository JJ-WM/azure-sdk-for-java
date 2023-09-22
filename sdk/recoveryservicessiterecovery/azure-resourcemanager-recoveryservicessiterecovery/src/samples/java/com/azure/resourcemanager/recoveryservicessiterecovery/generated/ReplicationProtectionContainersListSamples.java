// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

/** Samples for ReplicationProtectionContainers List. */
public final class ReplicationProtectionContainersListSamples {
    /*
     * x-ms-original-file: specification/recoveryservicessiterecovery/resource-manager/Microsoft.RecoveryServices/stable/2023-06-01/examples/ReplicationProtectionContainers_List.json
     */
    /**
     * Sample code: Gets the list of all protection containers in a vault.
     *
     * @param manager Entry point to SiteRecoveryManager.
     */
    public static void getsTheListOfAllProtectionContainersInAVault(
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager) {
        manager.replicationProtectionContainers().list("vault1", "resourceGroupPS1", com.azure.core.util.Context.NONE);
    }
}
