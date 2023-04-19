// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

/** Samples for PostRules RefreshCounters. */
public final class PostRulesRefreshCountersSamples {
    /*
     * x-ms-original-file: specification/paloaltonetworks/resource-manager/PaloAltoNetworks.Cloudngfw/preview/2022-08-29-preview/examples/PostRules_refreshCounters_MaximumSet_Gen.json
     */
    /**
     * Sample code: PostRules_refreshCounters_MaximumSet_Gen.
     *
     * @param manager Entry point to PaloAltoNetworksNgfwManager.
     */
    public static void postRulesRefreshCountersMaximumSetGen(
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager) {
        manager.postRules().refreshCountersWithResponse("lrs1", "1", "firewall1", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/paloaltonetworks/resource-manager/PaloAltoNetworks.Cloudngfw/preview/2022-08-29-preview/examples/PostRules_refreshCounters_MinimumSet_Gen.json
     */
    /**
     * Sample code: PostRules_refreshCounters_MinimumSet_Gen.
     *
     * @param manager Entry point to PaloAltoNetworksNgfwManager.
     */
    public static void postRulesRefreshCountersMinimumSetGen(
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager) {
        manager.postRules().refreshCountersWithResponse("lrs1", "1", null, com.azure.core.util.Context.NONE);
    }
}
