// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

/**
 * Samples for DevBoxDefinitions Get.
 */
public final class DevBoxDefinitionsGetSamples {
    /*
     * x-ms-original-file: specification/devcenter/resource-manager/Microsoft.DevCenter/stable/2024-02-01/examples/DevBoxDefinitions_Get.json
     */
    /**
     * Sample code: DevBoxDefinitions_Get.
     * 
     * @param manager Entry point to DevCenterManager.
     */
    public static void devBoxDefinitionsGet(com.azure.resourcemanager.devcenter.DevCenterManager manager) {
        manager.devBoxDefinitions().getWithResponse("rg1", "Contoso", "WebDevBox", com.azure.core.util.Context.NONE);
    }
}
