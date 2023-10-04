// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.resourcemanager.network.models.TopologyParameters;

/** Samples for NetworkWatchers GetTopology. */
public final class NetworkWatchersGetTopologySamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-05-01/examples/NetworkWatcherTopologyGet.json
     */
    /**
     * Sample code: Get Topology.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getTopology(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getNetworkWatchers()
            .getTopologyWithResponse(
                "rg1",
                "nw1",
                new TopologyParameters().withTargetResourceGroupName("rg2"),
                com.azure.core.util.Context.NONE);
    }
}
