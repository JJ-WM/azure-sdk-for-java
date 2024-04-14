// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

/**
 * Samples for BillingMeters Get.
 */
public final class BillingMetersGetSamples {
    /*
     * x-ms-original-file:
     * specification/app/resource-manager/Microsoft.App/preview/2023-11-02-preview/examples/BillingMeters_Get.json
     */
    /**
     * Sample code: BillingMeters_Get.
     * 
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void billingMetersGet(com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.billingMeters().getWithResponse("East US", com.azure.core.util.Context.NONE);
    }
}
