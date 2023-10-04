// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

/** Samples for DiskAccesses DeleteAPrivateEndpointConnection. */
public final class DiskAccessesDeleteAPrivateEndpointConnectionSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2023-04-02/examples/diskAccessExamples/DiskAccessPrivateEndpointConnection_Delete.json
     */
    /**
     * Sample code: Delete a private endpoint connection under a disk access resource.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deleteAPrivateEndpointConnectionUnderADiskAccessResource(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getDiskAccesses()
            .deleteAPrivateEndpointConnection(
                "myResourceGroup", "myDiskAccess", "myPrivateEndpointConnection", com.azure.core.util.Context.NONE);
    }
}
