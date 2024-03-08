// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.generated;

/**
 * Samples for NetworkFunctions ListByResourceGroup.
 */
public final class NetworkFunctionsListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/hybridnetwork/resource-manager/Microsoft.HybridNetwork/stable/2023-09-01/examples/
     * NetworkFunctionListByResourceGroup.json
     */
    /**
     * Sample code: List network function in resource group.
     * 
     * @param manager Entry point to HybridNetworkManager.
     */
    public static void
        listNetworkFunctionInResourceGroup(com.azure.resourcemanager.hybridnetwork.HybridNetworkManager manager) {
        manager.networkFunctions().listByResourceGroup("rg", com.azure.core.util.Context.NONE);
    }
}
