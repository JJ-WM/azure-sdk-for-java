// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.generated;

/**
 * Samples for Operations List.
 */
public final class OperationsListSamples {
    /*
     * x-ms-original-file:
     * specification/containerinstance/resource-manager/Microsoft.ContainerInstance/stable/2023-05-01/examples/
     * OperationsList.json
     */
    /**
     * Sample code: OperationsList.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void operationsList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.containerGroups().manager().serviceClient().getOperations().list(com.azure.core.util.Context.NONE);
    }
}
