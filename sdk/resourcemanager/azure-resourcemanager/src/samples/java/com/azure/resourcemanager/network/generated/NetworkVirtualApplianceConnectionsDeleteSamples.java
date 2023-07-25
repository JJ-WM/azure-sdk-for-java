// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/** Samples for NetworkVirtualApplianceConnections Delete. */
public final class NetworkVirtualApplianceConnectionsDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-02-01/examples/NetworkVirtualApplianceConnectionDelete.json
     */
    /**
     * Sample code: NetworkVirtualApplianceConnectionDelete.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void networkVirtualApplianceConnectionDelete(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getNetworkVirtualApplianceConnections()
            .delete("rg1", "nva1", "connection1", com.azure.core.util.Context.NONE);
    }
}
