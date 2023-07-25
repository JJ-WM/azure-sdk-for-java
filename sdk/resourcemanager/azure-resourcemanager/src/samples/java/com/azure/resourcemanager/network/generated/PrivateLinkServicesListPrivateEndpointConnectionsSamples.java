// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/** Samples for PrivateLinkServices ListPrivateEndpointConnections. */
public final class PrivateLinkServicesListPrivateEndpointConnectionsSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-02-01/examples/PrivateLinkServiceListPrivateEndpointConnection.json
     */
    /**
     * Sample code: List private link service in resource group.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listPrivateLinkServiceInResourceGroup(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getPrivateLinkServices()
            .listPrivateEndpointConnections("rg1", "testPls", com.azure.core.util.Context.NONE);
    }
}
