// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.communication.generated;

import com.azure.resourcemanager.communication.models.LinkNotificationHubParameters;

/** Samples for CommunicationServices LinkNotificationHub. */
public final class CommunicationServicesLinkNotificationHubSamples {
    /*
     * x-ms-original-file: specification/communication/resource-manager/Microsoft.Communication/preview/2023-04-01-preview/examples/communicationServices/linkNotificationHub.json
     */
    /**
     * Sample code: Link notification hub.
     *
     * @param manager Entry point to CommunicationManager.
     */
    public static void linkNotificationHub(com.azure.resourcemanager.communication.CommunicationManager manager) {
        manager
            .communicationServices()
            .linkNotificationHubWithResponse(
                "MyResourceGroup",
                "MyCommunicationResource",
                new LinkNotificationHubParameters()
                    .withResourceId(
                        "/subscriptions/11112222-3333-4444-5555-666677778888/resourceGroups/MyOtherResourceGroup/providers/Microsoft.NotificationHubs/namespaces/MyNamespace/notificationHubs/MyHub")
                    .withConnectionString("Endpoint=sb://MyNamespace.servicebus.windows.net/;SharedAccessKey=abcd1234"),
                com.azure.core.util.Context.NONE);
    }
}
