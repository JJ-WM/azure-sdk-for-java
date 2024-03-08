// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

import com.azure.resourcemanager.paloaltonetworks.ngfw.models.SecurityServicesTypeEnum;

/**
 * Samples for GlobalRulestack ListSecurityServices.
 */
public final class GlobalRulestackListSecurityServicesSamples {
    /*
     * x-ms-original-file:
     * specification/paloaltonetworks/resource-manager/PaloAltoNetworks.Cloudngfw/stable/2023-09-01/examples/
     * GlobalRulestack_listSecurityServices_MinimumSet_Gen.json
     */
    /**
     * Sample code: GlobalRulestack_listSecurityServices_MinimumSet_Gen.
     * 
     * @param manager Entry point to PaloAltoNetworksNgfwManager.
     */
    public static void globalRulestackListSecurityServicesMinimumSetGen(
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager) {
        manager.globalRulestacks().listSecurityServicesWithResponse("praval",
            SecurityServicesTypeEnum.fromString("globalRulestacks"), null, null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/paloaltonetworks/resource-manager/PaloAltoNetworks.Cloudngfw/stable/2023-09-01/examples/
     * GlobalRulestack_listSecurityServices_MaximumSet_Gen.json
     */
    /**
     * Sample code: GlobalRulestack_listSecurityServices_MaximumSet_Gen.
     * 
     * @param manager Entry point to PaloAltoNetworksNgfwManager.
     */
    public static void globalRulestackListSecurityServicesMaximumSetGen(
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager) {
        manager.globalRulestacks().listSecurityServicesWithResponse("praval",
            SecurityServicesTypeEnum.fromString("globalRulestacks"), "a6a321", 20, com.azure.core.util.Context.NONE);
    }
}
