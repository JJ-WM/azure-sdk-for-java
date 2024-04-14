// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

/**
 * Samples for ClusterAvailableUpgrades List.
 */
public final class ClusterAvailableUpgradesListSamples {
    /*
     * x-ms-original-file:
     * specification/hdinsight/resource-manager/Microsoft.HDInsight/HDInsightOnAks/preview/2023-11-01-preview/examples/
     * ListClusterAvailableUpgrades.json
     */
    /**
     * Sample code: GetClusterAvailableUpgrade.
     * 
     * @param manager Entry point to HDInsightContainersManager.
     */
    public static void
        getClusterAvailableUpgrade(com.azure.resourcemanager.hdinsight.containers.HDInsightContainersManager manager) {
        manager.clusterAvailableUpgrades().list("hiloResourcegroup", "clusterpool1", "cluster1",
            com.azure.core.util.Context.NONE);
    }
}
