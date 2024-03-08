// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

import com.azure.resourcemanager.compute.models.ThrottledRequestsInput;
import java.time.OffsetDateTime;

/**
 * Samples for LogAnalytics ExportThrottledRequests.
 */
public final class LogAnalyticsExportThrottledRequestsSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2023-09-01/examples/logAnalyticExamples
     * /LogAnalytics_ThrottledRequests.json
     */
    /**
     * Sample code: Export logs which contain all throttled Api requests made to Compute Resource Provider within the
     * given time period.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        exportLogsWhichContainAllThrottledApiRequestsMadeToComputeResourceProviderWithinTheGivenTimePeriod(
            com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines().manager().serviceClient().getLogAnalytics().exportThrottledRequests("westus",
            new ThrottledRequestsInput().withBlobContainerSasUri("https://somesasuri")
                .withFromTime(OffsetDateTime.parse("2018-01-21T01:54:06.862601Z"))
                .withToTime(OffsetDateTime.parse("2018-01-23T01:54:06.862601Z")).withGroupByOperationName(true)
                .withGroupByResourceName(false).withGroupByClientApplicationId(false).withGroupByUserAgent(false),
            com.azure.core.util.Context.NONE);
    }
}
