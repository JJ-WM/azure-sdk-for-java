// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

/** Samples for ClusterManagers Delete. */
public final class ClusterManagersDeleteSamples {
    /*
     * x-ms-original-file: specification/networkcloud/resource-manager/Microsoft.NetworkCloud/preview/2023-05-01-preview/examples/ClusterManagers_Delete.json
     */
    /**
     * Sample code: Delete cluster manager.
     *
     * @param manager Entry point to NetworkCloudManager.
     */
    public static void deleteClusterManager(com.azure.resourcemanager.networkcloud.NetworkCloudManager manager) {
        manager.clusterManagers().delete("resourceGroupName", "clusterManagerName", com.azure.core.util.Context.NONE);
    }
}
