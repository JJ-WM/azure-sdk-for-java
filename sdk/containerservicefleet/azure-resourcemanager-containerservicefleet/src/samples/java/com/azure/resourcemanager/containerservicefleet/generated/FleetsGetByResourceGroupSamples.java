// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.generated;

/** Samples for Fleets GetByResourceGroup. */
public final class FleetsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/fleet/preview/2023-03-15-preview/examples/Fleets_Get.json
     */
    /**
     * Sample code: Gets a Fleet resource.
     *
     * @param manager Entry point to ContainerServiceFleetManager.
     */
    public static void getsAFleetResource(
        com.azure.resourcemanager.containerservicefleet.ContainerServiceFleetManager manager) {
        manager.fleets().getByResourceGroupWithResponse("rg1", "fleet1", com.azure.core.util.Context.NONE);
    }
}
