// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.resourcemanager.network.models.FilterItems;
import com.azure.resourcemanager.network.models.FirewallPolicyIdpsQuerySortOrder;
import com.azure.resourcemanager.network.models.IdpsQueryObject;
import com.azure.resourcemanager.network.models.OrderBy;
import java.util.Arrays;

/** Samples for FirewallPolicyIdpsSignatures List. */
public final class FirewallPolicyIdpsSignaturesListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-02-01/examples/FirewallPolicyQuerySignatureOverrides.json
     */
    /**
     * Sample code: query signature overrides.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void querySignatureOverrides(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getFirewallPolicyIdpsSignatures()
            .listWithResponse(
                "rg1",
                "firewallPolicy",
                new IdpsQueryObject()
                    .withFilters(Arrays.asList(new FilterItems().withField("Mode").withValues(Arrays.asList("Deny"))))
                    .withSearch("")
                    .withOrderBy(
                        new OrderBy().withField("severity").withOrder(FirewallPolicyIdpsQuerySortOrder.ASCENDING))
                    .withResultsPerPage(20)
                    .withSkip(0),
                com.azure.core.util.Context.NONE);
    }
}
