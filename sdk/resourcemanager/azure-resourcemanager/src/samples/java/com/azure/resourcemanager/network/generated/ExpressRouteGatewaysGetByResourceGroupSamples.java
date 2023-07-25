// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/** Samples for ExpressRouteGateways GetByResourceGroup. */
public final class ExpressRouteGatewaysGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-02-01/examples/ExpressRouteGatewayGet.json
     */
    /**
     * Sample code: ExpressRouteGatewayGet.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void expressRouteGatewayGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getExpressRouteGateways()
            .getByResourceGroupWithResponse(
                "resourceGroupName", "expressRouteGatewayName", com.azure.core.util.Context.NONE);
    }
}
