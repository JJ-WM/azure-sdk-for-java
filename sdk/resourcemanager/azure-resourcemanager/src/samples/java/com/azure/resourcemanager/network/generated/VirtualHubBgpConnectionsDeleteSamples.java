// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/** Samples for VirtualHubBgpConnections Delete. */
public final class VirtualHubBgpConnectionsDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-02-01/examples/VirtualHubBgpConnectionDelete.json
     */
    /**
     * Sample code: VirtualHubRouteTableV2Delete.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void virtualHubRouteTableV2Delete(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getVirtualHubBgpConnections()
            .delete("rg1", "hub1", "conn1", com.azure.core.util.Context.NONE);
    }
}
