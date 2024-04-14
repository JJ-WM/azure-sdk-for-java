// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

/**
 * Samples for Volumes DeleteReplication.
 */
public final class VolumesDeleteReplicationSamples {
    /*
     * x-ms-original-file:
     * specification/netapp/resource-manager/Microsoft.NetApp/stable/2023-07-01/examples/Volumes_DeleteReplication.json
     */
    /**
     * Sample code: Volumes_DeleteReplication.
     * 
     * @param manager Entry point to NetAppFilesManager.
     */
    public static void volumesDeleteReplication(com.azure.resourcemanager.netapp.NetAppFilesManager manager) {
        manager.volumes().deleteReplication("myRG", "account1", "pool1", "volume1", com.azure.core.util.Context.NONE);
    }
}
