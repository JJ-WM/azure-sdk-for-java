// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

/**
 * Samples for ApplicationPackage Get.
 */
public final class ApplicationPackageGetSamples {
    /*
     * x-ms-original-file:
     * specification/batch/resource-manager/Microsoft.Batch/stable/2024-02-01/examples/ApplicationPackageGet.json
     */
    /**
     * Sample code: ApplicationPackageGet.
     * 
     * @param manager Entry point to BatchManager.
     */
    public static void applicationPackageGet(com.azure.resourcemanager.batch.BatchManager manager) {
        manager.applicationPackages().getWithResponse("default-azurebatch-japaneast", "sampleacct", "app1", "1",
            com.azure.core.util.Context.NONE);
    }
}
