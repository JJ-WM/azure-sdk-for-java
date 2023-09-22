// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

/** Samples for ReplicationProtectionContainerMappings Get. */
public final class ReplicationProtectionContainerMappingsGetSamples {
    /*
     * x-ms-original-file: specification/recoveryservicessiterecovery/resource-manager/Microsoft.RecoveryServices/stable/2023-06-01/examples/ReplicationProtectionContainerMappings_Get.json
     */
    /**
     * Sample code: Gets a protection container mapping.
     *
     * @param manager Entry point to SiteRecoveryManager.
     */
    public static void getsAProtectionContainerMapping(
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager) {
        manager
            .replicationProtectionContainerMappings()
            .getWithResponse(
                "vault1",
                "resourceGroupPS1",
                "cloud1",
                "cloud_6d224fc6-f326-5d35-96de-fbf51efb3179",
                "cloud1protectionprofile1",
                com.azure.core.util.Context.NONE);
    }
}
