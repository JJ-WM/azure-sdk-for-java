// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

/** Samples for DomainTopicEventSubscriptions GetFullUrl. */
public final class DomainTopicEventSubscriptionsGetFullUrlSamples {
    /*
     * x-ms-original-file: specification/eventgrid/resource-manager/Microsoft.EventGrid/preview/2023-06-01-preview/examples/DomainTopicEventSubscriptions_GetFullUrl.json
     */
    /**
     * Sample code: DomainTopicEventSubscriptions_GetFullUrl.
     *
     * @param manager Entry point to EventGridManager.
     */
    public static void domainTopicEventSubscriptionsGetFullUrl(
        com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        manager
            .domainTopicEventSubscriptions()
            .getFullUrlWithResponse(
                "examplerg",
                "exampleDomain1",
                "exampleDomainTopic1",
                "examplesubscription1",
                com.azure.core.util.Context.NONE);
    }
}
