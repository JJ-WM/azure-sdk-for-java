// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

/** Samples for MetricsConfigurations Delete. */
public final class MetricsConfigurationsDeleteSamples {
    /*
     * x-ms-original-file: specification/networkcloud/resource-manager/Microsoft.NetworkCloud/preview/2023-05-01-preview/examples/ClusterMetricsConfigurations_Delete.json
     */
    /**
     * Sample code: Delete metrics configuration of cluster.
     *
     * @param manager Entry point to NetworkCloudManager.
     */
    public static void deleteMetricsConfigurationOfCluster(
        com.azure.resourcemanager.networkcloud.NetworkCloudManager manager) {
        manager
            .metricsConfigurations()
            .delete("resourceGroupName", "clusterName", "default", com.azure.core.util.Context.NONE);
    }
}
