// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storageactions.generated;

/**
 * Samples for Operations List.
 */
public final class OperationsListSamples {
    /*
     * x-ms-original-file:
     * specification/storageactions/resource-manager/Microsoft.StorageActions/stable/2023-01-01/examples/misc/
     * OperationsList.json
     */
    /**
     * Sample code: OperationsList.
     * 
     * @param manager Entry point to StorageActionsManager.
     */
    public static void operationsList(com.azure.resourcemanager.storageactions.StorageActionsManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
