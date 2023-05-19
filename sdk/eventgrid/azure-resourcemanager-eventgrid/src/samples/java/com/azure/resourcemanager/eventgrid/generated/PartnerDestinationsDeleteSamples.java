// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

/** Samples for PartnerDestinations Delete. */
public final class PartnerDestinationsDeleteSamples {
    /*
     * x-ms-original-file: specification/eventgrid/resource-manager/Microsoft.EventGrid/preview/2023-06-01-preview/examples/PartnerDestinations_Delete.json
     */
    /**
     * Sample code: PartnerDestinations_Delete.
     *
     * @param manager Entry point to EventGridManager.
     */
    public static void partnerDestinationsDelete(com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        manager
            .partnerDestinations()
            .delete("examplerg", "examplePartnerDestinationName1", com.azure.core.util.Context.NONE);
    }
}
