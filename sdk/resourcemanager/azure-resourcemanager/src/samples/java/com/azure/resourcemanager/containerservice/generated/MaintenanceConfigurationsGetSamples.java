// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated;

/** Samples for MaintenanceConfigurations Get. */
public final class MaintenanceConfigurationsGetSamples {
    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2023-06-01/examples/MaintenanceConfigurationsGet.json
     */
    /**
     * Sample code: Get Maintenance Configuration.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getMaintenanceConfiguration(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .kubernetesClusters()
            .manager()
            .serviceClient()
            .getMaintenanceConfigurations()
            .getWithResponse("rg1", "clustername1", "default", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2023-06-01/examples/MaintenanceConfigurationsGet_MaintenanceWindow.json
     */
    /**
     * Sample code: Get Maintenance Configuration Configured With Maintenance Window.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getMaintenanceConfigurationConfiguredWithMaintenanceWindow(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .kubernetesClusters()
            .manager()
            .serviceClient()
            .getMaintenanceConfigurations()
            .getWithResponse(
                "rg1", "clustername1", "aksManagedNodeOSUpgradeSchedule", com.azure.core.util.Context.NONE);
    }
}
