// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

/** Samples for GlobalRulestack Commit. */
public final class GlobalRulestackCommitSamples {
    /*
     * x-ms-original-file: specification/paloaltonetworks/resource-manager/PaloAltoNetworks.Cloudngfw/preview/2022-08-29-preview/examples/GlobalRulestack_commit_MaximumSet_Gen.json
     */
    /**
     * Sample code: GlobalRulestack_commit_MaximumSet_Gen.
     *
     * @param manager Entry point to PaloAltoNetworksNgfwManager.
     */
    public static void globalRulestackCommitMaximumSetGen(
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager) {
        manager.globalRulestacks().commit("praval", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/paloaltonetworks/resource-manager/PaloAltoNetworks.Cloudngfw/preview/2022-08-29-preview/examples/GlobalRulestack_commit_MinimumSet_Gen.json
     */
    /**
     * Sample code: GlobalRulestack_commit_MinimumSet_Gen.
     *
     * @param manager Entry point to PaloAltoNetworksNgfwManager.
     */
    public static void globalRulestackCommitMinimumSetGen(
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager) {
        manager.globalRulestacks().commit("praval", com.azure.core.util.Context.NONE);
    }
}
