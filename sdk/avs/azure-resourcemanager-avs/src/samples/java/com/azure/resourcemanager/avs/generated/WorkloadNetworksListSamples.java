// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

/** Samples for WorkloadNetworks List. */
public final class WorkloadNetworksListSamples {
    /*
     * x-ms-original-file: specification/vmware/resource-manager/Microsoft.AVS/stable/2023-03-01/examples/WorkloadNetworks_List.json
     */
    /**
     * Sample code: WorkloadNetworks_List.
     *
     * @param manager Entry point to AvsManager.
     */
    public static void workloadNetworksList(com.azure.resourcemanager.avs.AvsManager manager) {
        manager.workloadNetworks().list("group1", "cloud1", com.azure.core.util.Context.NONE);
    }
}
