// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.generated;

/** Samples for SignalR ListSkus. */
public final class SignalRListSkusSamples {
    /*
     * x-ms-original-file: specification/signalr/resource-manager/Microsoft.SignalRService/preview/2023-06-01-preview/examples/SignalR_ListSkus.json
     */
    /**
     * Sample code: SignalR_ListSkus.
     *
     * @param manager Entry point to SignalRManager.
     */
    public static void signalRListSkus(com.azure.resourcemanager.signalr.SignalRManager manager) {
        manager
            .signalRs()
            .listSkusWithResponse("myResourceGroup", "mySignalRService", com.azure.core.util.Context.NONE);
    }
}
