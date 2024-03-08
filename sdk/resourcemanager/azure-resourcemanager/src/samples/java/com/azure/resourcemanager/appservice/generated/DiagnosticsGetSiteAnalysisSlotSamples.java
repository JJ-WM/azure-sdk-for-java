// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

/**
 * Samples for Diagnostics GetSiteAnalysisSlot.
 */
public final class DiagnosticsGetSiteAnalysisSlotSamples {
    /*
     * x-ms-original-file:
     * specification/web/resource-manager/Microsoft.Web/stable/2023-01-01/examples/Diagnostics_GetSiteAnalysisSlot.json
     */
    /**
     * Sample code: Get App Slot Analysis.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAppSlotAnalysis(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps().manager().serviceClient().getDiagnostics().getSiteAnalysisSlotWithResponse(
            "Sample-WestUSResourceGroup", "SampleApp", "availability", "appanalysis", "staging",
            com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/web/resource-manager/Microsoft.Web/stable/2023-01-01/examples/Diagnostics_GetSiteAnalysis.json
     */
    /**
     * Sample code: Get App Analysis.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAppAnalysis(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps().manager().serviceClient().getDiagnostics().getSiteAnalysisSlotWithResponse(
            "Sample-WestUSResourceGroup", "SampleApp", "availability", "appanalysis", "Production",
            com.azure.core.util.Context.NONE);
    }
}
