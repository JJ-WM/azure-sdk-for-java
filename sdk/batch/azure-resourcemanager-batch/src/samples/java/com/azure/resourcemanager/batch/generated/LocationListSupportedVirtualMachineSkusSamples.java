// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

/**
 * Samples for Location ListSupportedVirtualMachineSkus.
 */
public final class LocationListSupportedVirtualMachineSkusSamples {
    /*
     * x-ms-original-file:
     * specification/batch/resource-manager/Microsoft.Batch/stable/2024-02-01/examples/LocationListVirtualMachineSkus.
     * json
     */
    /**
     * Sample code: LocationListVirtualMachineSkus.
     * 
     * @param manager Entry point to BatchManager.
     */
    public static void locationListVirtualMachineSkus(com.azure.resourcemanager.batch.BatchManager manager) {
        manager.locations().listSupportedVirtualMachineSkus("japaneast", null, null, com.azure.core.util.Context.NONE);
    }
}
