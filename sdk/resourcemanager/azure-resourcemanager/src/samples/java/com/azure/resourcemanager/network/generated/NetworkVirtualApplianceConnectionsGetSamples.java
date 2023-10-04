// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/** Samples for NetworkVirtualApplianceConnections Get. */
public final class NetworkVirtualApplianceConnectionsGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-05-01/examples/NetworkVirtualApplianceConnectionGet.json
     */
    /**
     * Sample code: NetworkVirtualApplianceConnectionGet.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void networkVirtualApplianceConnectionGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getNetworkVirtualApplianceConnections()
            .getWithResponse("rg1", "nva1", "connection1", com.azure.core.util.Context.NONE);
    }
}
