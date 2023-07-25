// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

import com.azure.resourcemanager.webpubsub.models.EventHandler;
import com.azure.resourcemanager.webpubsub.models.EventHubEndpoint;
import com.azure.resourcemanager.webpubsub.models.EventListener;
import com.azure.resourcemanager.webpubsub.models.EventNameFilter;
import com.azure.resourcemanager.webpubsub.models.ManagedIdentitySettings;
import com.azure.resourcemanager.webpubsub.models.UpstreamAuthSettings;
import com.azure.resourcemanager.webpubsub.models.UpstreamAuthType;
import com.azure.resourcemanager.webpubsub.models.WebPubSubHubProperties;
import java.util.Arrays;

/** Samples for WebPubSubHubs CreateOrUpdate. */
public final class WebPubSubHubsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/webpubsub/resource-manager/Microsoft.SignalRService/preview/2023-06-01-preview/examples/WebPubSubHubs_CreateOrUpdate.json
     */
    /**
     * Sample code: WebPubSubHubs_CreateOrUpdate.
     *
     * @param manager Entry point to WebPubSubManager.
     */
    public static void webPubSubHubsCreateOrUpdate(com.azure.resourcemanager.webpubsub.WebPubSubManager manager) {
        manager
            .webPubSubHubs()
            .define("exampleHub")
            .withExistingWebPubSub("myResourceGroup", "myWebPubSubService")
            .withProperties(
                new WebPubSubHubProperties()
                    .withEventHandlers(
                        Arrays
                            .asList(
                                new EventHandler()
                                    .withUrlTemplate("http://host.com")
                                    .withUserEventPattern("*")
                                    .withSystemEvents(Arrays.asList("connect", "connected"))
                                    .withAuth(
                                        new UpstreamAuthSettings()
                                            .withType(UpstreamAuthType.MANAGED_IDENTITY)
                                            .withManagedIdentity(new ManagedIdentitySettings().withResource("abc")))))
                    .withEventListeners(
                        Arrays
                            .asList(
                                new EventListener()
                                    .withFilter(
                                        new EventNameFilter()
                                            .withSystemEvents(Arrays.asList("connected", "disconnected"))
                                            .withUserEventPattern("*"))
                                    .withEndpoint(
                                        new EventHubEndpoint()
                                            .withFullyQualifiedNamespace("example.servicebus.windows.net")
                                            .withEventHubName("eventHubName1"))))
                    .withAnonymousConnectPolicy("allow"))
            .create();
    }
}
