// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

/**
 * Samples for PartnerTopicEventSubscriptions GetFullUrl.
 */
public final class PartnerTopicEventSubscriptionsGetFullUrlSamples {
    /*
     * x-ms-original-file: specification/eventgrid/resource-manager/Microsoft.EventGrid/preview/2024-06-01-preview/examples/PartnerTopicEventSubscriptions_GetFullUrl.json
     */
    /**
     * Sample code: PartnerTopicEventSubscriptions_GetFullUrl.
     * 
     * @param manager Entry point to EventGridManager.
     */
    public static void
        partnerTopicEventSubscriptionsGetFullUrl(com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        manager.partnerTopicEventSubscriptions()
            .getFullUrlWithResponse("examplerg", "examplePartnerTopic1", "examplesubscription1",
                com.azure.core.util.Context.NONE);
    }
}
