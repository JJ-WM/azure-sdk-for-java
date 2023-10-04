// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.generated;

/** Samples for SignalRPrivateEndpointConnections Get. */
public final class SignalRPrivateEndpointConnectionsGetSamples {
    /*
     * x-ms-original-file: specification/signalr/resource-manager/Microsoft.SignalRService/preview/2023-06-01-preview/examples/SignalRPrivateEndpointConnections_Get.json
     */
    /**
     * Sample code: SignalRPrivateEndpointConnections_Get.
     *
     * @param manager Entry point to SignalRManager.
     */
    public static void signalRPrivateEndpointConnectionsGet(com.azure.resourcemanager.signalr.SignalRManager manager) {
        manager
            .signalRPrivateEndpointConnections()
            .getWithResponse(
                "mysignalrservice.1fa229cd-bf3f-47f0-8c49-afb36723997e",
                "myResourceGroup",
                "mySignalRService",
                com.azure.core.util.Context.NONE);
    }
}
