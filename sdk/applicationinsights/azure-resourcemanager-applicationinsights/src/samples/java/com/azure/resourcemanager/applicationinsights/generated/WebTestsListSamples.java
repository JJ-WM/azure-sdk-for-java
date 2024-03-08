// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated;

/** Samples for WebTests List. */
public final class WebTestsListSamples {
    /*
     * x-ms-original-file: specification/applicationinsights/resource-manager/Microsoft.Insights/stable/2022-06-15/examples/WebTestList.json
     */
    /**
     * Sample code: webTestList.
     *
     * @param manager Entry point to ApplicationInsightsManager.
     */
    public static void webTestList(com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager manager) {
        manager.webTests().list(com.azure.core.util.Context.NONE);
    }
}
