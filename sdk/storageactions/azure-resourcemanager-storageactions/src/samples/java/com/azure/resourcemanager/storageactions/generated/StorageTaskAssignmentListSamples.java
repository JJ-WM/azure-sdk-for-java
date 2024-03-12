// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storageactions.generated;

/**
 * Samples for StorageTaskAssignment List.
 */
public final class StorageTaskAssignmentListSamples {
    /*
     * x-ms-original-file:
     * specification/storageactions/resource-manager/Microsoft.StorageActions/stable/2023-01-01/examples/
     * storageTasksList/ListStorageTaskAssignmentIds.json
     */
    /**
     * Sample code: ListStorageTaskAssignmentsByResourceGroup.
     * 
     * @param manager Entry point to StorageActionsManager.
     */
    public static void listStorageTaskAssignmentsByResourceGroup(
        com.azure.resourcemanager.storageactions.StorageActionsManager manager) {
        manager.storageTaskAssignments().list("rgroup1", "mytask1", null, com.azure.core.util.Context.NONE);
    }
}
