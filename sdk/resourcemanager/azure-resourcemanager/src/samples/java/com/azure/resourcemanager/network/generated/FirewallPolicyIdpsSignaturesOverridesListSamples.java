// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/** Samples for FirewallPolicyIdpsSignaturesOverrides List. */
public final class FirewallPolicyIdpsSignaturesOverridesListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-05-01/examples/FirewallPolicySignatureOverridesList.json
     */
    /**
     * Sample code: get signature overrides.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getSignatureOverrides(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getFirewallPolicyIdpsSignaturesOverrides()
            .listWithResponse("rg1", "firewallPolicy", com.azure.core.util.Context.NONE);
    }
}
