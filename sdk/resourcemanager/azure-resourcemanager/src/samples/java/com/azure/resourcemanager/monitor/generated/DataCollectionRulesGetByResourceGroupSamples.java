// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated;

/**
 * Samples for DataCollectionRules GetByResourceGroup.
 */
public final class DataCollectionRulesGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/monitor/resource-manager/Microsoft.Insights/preview/2021-09-01-preview/examples/
     * DataCollectionRulesGet.json
     */
    /**
     * Sample code: Get data collection rule.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getDataCollectionRule(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.diagnosticSettings().manager().serviceClient().getDataCollectionRules()
            .getByResourceGroupWithResponse("myResourceGroup", "myCollectionRule", com.azure.core.util.Context.NONE);
    }
}
