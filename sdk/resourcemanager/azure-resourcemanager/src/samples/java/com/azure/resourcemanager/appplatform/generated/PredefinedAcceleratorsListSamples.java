// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated;

/**
 * Samples for PredefinedAccelerators List.
 */
public final class PredefinedAcceleratorsListSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/stable/2023-12-01/examples/
     * PredefinedAccelerators_List.json
     */
    /**
     * Sample code: PredefinedAccelerators_List.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void predefinedAcceleratorsList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.springServices()
            .manager()
            .serviceClient()
            .getPredefinedAccelerators()
            .list("myResourceGroup", "myservice", "default", com.azure.core.util.Context.NONE);
    }
}
