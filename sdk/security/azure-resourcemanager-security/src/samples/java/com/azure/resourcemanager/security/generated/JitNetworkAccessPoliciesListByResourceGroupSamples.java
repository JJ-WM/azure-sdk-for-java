// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

/**
 * Samples for JitNetworkAccessPolicies ListByResourceGroup.
 */
public final class JitNetworkAccessPoliciesListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/security/resource-manager/Microsoft.Security/stable/2020-01-01/examples/JitNetworkAccessPolicies/
     * GetJitNetworkAccessPoliciesResourceGroup_example.json
     */
    /**
     * Sample code: Get JIT network access policies on a resource group.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void
        getJITNetworkAccessPoliciesOnAResourceGroup(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.jitNetworkAccessPolicies().listByResourceGroup("myRg1", com.azure.core.util.Context.NONE);
    }
}
