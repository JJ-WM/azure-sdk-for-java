// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.generated;

/**
 * Samples for Applications Delete.
 */
public final class ApplicationsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/servicefabric/resource-manager/Microsoft.ServiceFabric/stable/2021-06-01/examples/
     * ApplicationDeleteOperation_example.json
     */
    /**
     * Sample code: Delete an application.
     * 
     * @param manager Entry point to ServiceFabricManager.
     */
    public static void deleteAnApplication(com.azure.resourcemanager.servicefabric.ServiceFabricManager manager) {
        manager.applications().delete("resRg", "myCluster", "myApp", com.azure.core.util.Context.NONE);
    }
}
