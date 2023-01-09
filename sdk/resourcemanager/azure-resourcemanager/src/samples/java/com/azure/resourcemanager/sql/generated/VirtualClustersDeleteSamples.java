// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.core.util.Context;

/** Samples for VirtualClusters Delete. */
public final class VirtualClustersDeleteSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/VirtualClusterDelete.json
     */
    /**
     * Sample code: Delete virtual cluster.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deleteVirtualCluster(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getVirtualClusters()
            .delete("testrg", "vc-subnet1-f769ed71-b3ad-491a-a9d5-26eeceaa6be2", Context.NONE);
    }
}
