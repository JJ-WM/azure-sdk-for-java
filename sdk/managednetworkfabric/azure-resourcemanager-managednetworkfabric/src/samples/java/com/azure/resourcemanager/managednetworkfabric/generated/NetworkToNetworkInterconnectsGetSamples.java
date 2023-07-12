// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

/** Samples for NetworkToNetworkInterconnects Get. */
public final class NetworkToNetworkInterconnectsGetSamples {
    /*
     * x-ms-original-file: specification/managednetworkfabric/resource-manager/Microsoft.ManagedNetworkFabric/preview/2023-02-01-preview/examples/NetworkToNetworkInterconnects_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: NetworkToNetworkInterconnects_Get_MaximumSet_Gen.
     *
     * @param manager Entry point to ManagedNetworkFabricManager.
     */
    public static void networkToNetworkInterconnectsGetMaximumSetGen(
        com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager manager) {
        manager
            .networkToNetworkInterconnects()
            .getWithResponse("resourceGroupName", "FabricName", "DefaultNNI", com.azure.core.util.Context.NONE);
    }
}
