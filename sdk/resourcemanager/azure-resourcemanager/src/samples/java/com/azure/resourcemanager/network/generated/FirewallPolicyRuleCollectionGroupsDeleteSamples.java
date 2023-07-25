// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/** Samples for FirewallPolicyRuleCollectionGroups Delete. */
public final class FirewallPolicyRuleCollectionGroupsDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-02-01/examples/FirewallPolicyRuleCollectionGroupDelete.json
     */
    /**
     * Sample code: Delete FirewallPolicyRuleCollectionGroup.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deleteFirewallPolicyRuleCollectionGroup(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getFirewallPolicyRuleCollectionGroups()
            .delete("rg1", "firewallPolicy", "ruleCollectionGroup1", com.azure.core.util.Context.NONE);
    }
}
