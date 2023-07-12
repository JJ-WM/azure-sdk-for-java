// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated;

/** Samples for ManagedRuleSets List. */
public final class ManagedRuleSetsListSamples {
    /*
     * x-ms-original-file: specification/frontdoor/resource-manager/Microsoft.Network/stable/2022-05-01/examples/WafListManagedRuleSets.json
     */
    /**
     * Sample code: List Policies ManagedRuleSets in a Resource Group.
     *
     * @param manager Entry point to FrontDoorManager.
     */
    public static void listPoliciesManagedRuleSetsInAResourceGroup(
        com.azure.resourcemanager.frontdoor.FrontDoorManager manager) {
        manager.managedRuleSets().list(com.azure.core.util.Context.NONE);
    }
}
