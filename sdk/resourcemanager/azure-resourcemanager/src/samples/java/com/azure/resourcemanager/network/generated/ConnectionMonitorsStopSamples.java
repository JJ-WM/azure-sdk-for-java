// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for ConnectionMonitors Stop.
 */
public final class ConnectionMonitorsStopSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-09-01/examples/
     * NetworkWatcherConnectionMonitorStop.json
     */
    /**
     * Sample code: Stop connection monitor.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void stopConnectionMonitor(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getConnectionMonitors().stop("rg1", "nw1", "cm1",
            com.azure.core.util.Context.NONE);
    }
}
