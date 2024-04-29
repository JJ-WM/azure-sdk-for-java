// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

/**
 * Samples for LinkedServices Get.
 */
public final class LinkedServicesGetSamples {
    /*
     * x-ms-original-file: specification/datafactory/resource-manager/Microsoft.DataFactory/stable/2018-06-01/examples/LinkedServices_Get.json
     */
    /**
     * Sample code: LinkedServices_Get.
     * 
     * @param manager Entry point to DataFactoryManager.
     */
    public static void linkedServicesGet(com.azure.resourcemanager.datafactory.DataFactoryManager manager) {
        manager.linkedServices()
            .getWithResponse("exampleResourceGroup", "exampleFactoryName", "exampleLinkedService", null,
                com.azure.core.util.Context.NONE);
    }
}
