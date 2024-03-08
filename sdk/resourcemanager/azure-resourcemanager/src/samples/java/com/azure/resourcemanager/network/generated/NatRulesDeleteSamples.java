// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for NatRules Delete.
 */
public final class NatRulesDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2023-09-01/examples/NatRuleDelete.json
     */
    /**
     * Sample code: NatRuleDelete.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void natRuleDelete(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getNatRules().delete("rg1", "gateway1", "natRule1",
            com.azure.core.util.Context.NONE);
    }
}
