// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.generated;

/** Samples for Services List. */
public final class ServicesListSamples {
    /*
     * x-ms-original-file: specification/support/resource-manager/Microsoft.Support/preview/2022-09-01-preview/examples/ListServices.json
     */
    /**
     * Sample code: Gets list of services for which a support ticket can be created.
     *
     * @param manager Entry point to SupportManager.
     */
    public static void getsListOfServicesForWhichASupportTicketCanBeCreated(
        com.azure.resourcemanager.support.SupportManager manager) {
        manager.services().list(com.azure.core.util.Context.NONE);
    }
}
