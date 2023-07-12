// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

/** Samples for NetworkFabrics ListByResourceGroup. */
public final class NetworkFabricsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/managednetworkfabric/resource-manager/Microsoft.ManagedNetworkFabric/preview/2023-02-01-preview/examples/NetworkFabrics_ListByResourceGroup_MaximumSet_Gen.json
     */
    /**
     * Sample code: NetworkFabrics_ListByResourceGroup_MaximumSet_Gen.
     *
     * @param manager Entry point to ManagedNetworkFabricManager.
     */
    public static void networkFabricsListByResourceGroupMaximumSetGen(
        com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager manager) {
        manager.networkFabrics().listByResourceGroup("rgNetworkFabrics", com.azure.core.util.Context.NONE);
    }
}
