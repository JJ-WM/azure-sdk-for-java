// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated;

/** Samples for IotHubResource GetValidSkus. */
public final class IotHubResourceGetValidSkusSamples {
    /*
     * x-ms-original-file: specification/iothub/resource-manager/Microsoft.Devices/preview/2022-11-15-preview/examples/iothub_getskus.json
     */
    /**
     * Sample code: IotHubResource_GetValidSkus.
     *
     * @param manager Entry point to IotHubManager.
     */
    public static void iotHubResourceGetValidSkus(com.azure.resourcemanager.iothub.IotHubManager manager) {
        manager.iotHubResources().getValidSkus("myResourceGroup", "testHub", com.azure.core.util.Context.NONE);
    }
}
