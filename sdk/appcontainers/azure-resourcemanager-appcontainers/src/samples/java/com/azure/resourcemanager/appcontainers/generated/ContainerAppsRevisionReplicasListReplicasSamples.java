// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

/** Samples for ContainerAppsRevisionReplicas ListReplicas. */
public final class ContainerAppsRevisionReplicasListReplicasSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2023-05-01/examples/Replicas_List.json
     */
    /**
     * Sample code: List Container App's replicas.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void listContainerAppSReplicas(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager
            .containerAppsRevisionReplicas()
            .listReplicasWithResponse("workerapps-rg-xj", "myapp", "myapp--0wlqy09", com.azure.core.util.Context.NONE);
    }
}
