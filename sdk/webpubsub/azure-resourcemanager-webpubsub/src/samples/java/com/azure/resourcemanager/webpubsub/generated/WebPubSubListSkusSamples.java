// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

/** Samples for WebPubSub ListSkus. */
public final class WebPubSubListSkusSamples {
    /*
     * x-ms-original-file: specification/webpubsub/resource-manager/Microsoft.SignalRService/preview/2023-08-01-preview/examples/WebPubSub_ListSkus.json
     */
    /**
     * Sample code: WebPubSub_ListSkus.
     *
     * @param manager Entry point to WebPubSubManager.
     */
    public static void webPubSubListSkus(com.azure.resourcemanager.webpubsub.WebPubSubManager manager) {
        manager
            .webPubSubs()
            .listSkusWithResponse("myResourceGroup", "myWebPubSubService", com.azure.core.util.Context.NONE);
    }
}
