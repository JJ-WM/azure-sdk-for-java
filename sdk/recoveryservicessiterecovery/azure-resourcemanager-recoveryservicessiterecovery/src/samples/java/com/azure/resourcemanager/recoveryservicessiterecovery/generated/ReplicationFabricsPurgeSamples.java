// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

/**
 * Samples for ReplicationFabrics Purge.
 */
public final class ReplicationFabricsPurgeSamples {
    /*
     * x-ms-original-file:
     * specification/recoveryservicessiterecovery/resource-manager/Microsoft.RecoveryServices/stable/2023-08-01/examples
     * /ReplicationFabrics_Purge.json
     */
    /**
     * Sample code: Purges the site.
     * 
     * @param manager Entry point to SiteRecoveryManager.
     */
    public static void
        purgesTheSite(com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager) {
        manager.replicationFabrics().purge("vault1", "resourceGroupPS1", "cloud1", com.azure.core.util.Context.NONE);
    }
}
