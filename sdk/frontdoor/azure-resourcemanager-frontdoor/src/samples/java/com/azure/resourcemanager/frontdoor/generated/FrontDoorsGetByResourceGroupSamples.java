// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated;

/** Samples for FrontDoors GetByResourceGroup. */
public final class FrontDoorsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/frontdoor/resource-manager/Microsoft.Network/stable/2021-06-01/examples/FrontdoorGet.json
     */
    /**
     * Sample code: Get Front Door.
     *
     * @param manager Entry point to FrontDoorManager.
     */
    public static void getFrontDoor(com.azure.resourcemanager.frontdoor.FrontDoorManager manager) {
        manager.frontDoors().getByResourceGroupWithResponse("rg1", "frontDoor1", com.azure.core.util.Context.NONE);
    }
}
