// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

/** Samples for NetworkDeviceSkus Get. */
public final class NetworkDeviceSkusGetSamples {
    /*
     * x-ms-original-file: specification/managednetworkfabric/resource-manager/Microsoft.ManagedNetworkFabric/preview/2023-02-01-preview/examples/NetworkDeviceSkus_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: NetworkDeviceSkus_Get_MaximumSet_Gen.
     *
     * @param manager Entry point to ManagedNetworkFabricManager.
     */
    public static void networkDeviceSkusGetMaximumSetGen(
        com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager manager) {
        manager.networkDeviceSkus().getWithResponse("DefaultSku", com.azure.core.util.Context.NONE);
    }
}
