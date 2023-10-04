// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/** Samples for ConnectionMonitors List. */
public final class ConnectionMonitorsListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-05-01/examples/NetworkWatcherConnectionMonitorList.json
     */
    /**
     * Sample code: List connection monitors.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listConnectionMonitors(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getConnectionMonitors()
            .list("rg1", "nw1", com.azure.core.util.Context.NONE);
    }
}
