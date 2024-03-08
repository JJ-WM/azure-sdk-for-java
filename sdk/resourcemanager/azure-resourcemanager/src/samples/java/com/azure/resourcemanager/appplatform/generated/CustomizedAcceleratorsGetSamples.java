// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated;

/**
 * Samples for CustomizedAccelerators Get.
 */
public final class CustomizedAcceleratorsGetSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/stable/2023-12-01/examples/
     * CustomizedAccelerators_Get.json
     */
    /**
     * Sample code: CustomizedAccelerators_Get.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void customizedAcceleratorsGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.springServices().manager().serviceClient().getCustomizedAccelerators().getWithResponse("myResourceGroup",
            "myservice", "default", "acc-name", com.azure.core.util.Context.NONE);
    }
}
