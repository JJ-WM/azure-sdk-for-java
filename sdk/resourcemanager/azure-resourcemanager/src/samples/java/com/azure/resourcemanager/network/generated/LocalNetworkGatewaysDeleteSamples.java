// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/** Samples for LocalNetworkGateways Delete. */
public final class LocalNetworkGatewaysDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-05-01/examples/LocalNetworkGatewayDelete.json
     */
    /**
     * Sample code: DeleteLocalNetworkGateway.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deleteLocalNetworkGateway(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getLocalNetworkGateways()
            .delete("rg1", "localgw", com.azure.core.util.Context.NONE);
    }
}
