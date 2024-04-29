// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

/**
 * Samples for PrivateLinkResources ListByPrivateLinkScope.
 */
public final class PrivateLinkResourcesListByPrivateLinkScopeSamples {
    /*
     * x-ms-original-file: specification/hybridcompute/resource-manager/Microsoft.HybridCompute/preview/2023-10-03-preview/examples/privateLinkScope/PrivateLinkScopePrivateLinkResource_ListGet.json
     */
    /**
     * Sample code: Gets private endpoint connection.
     * 
     * @param manager Entry point to HybridComputeManager.
     */
    public static void
        getsPrivateEndpointConnection(com.azure.resourcemanager.hybridcompute.HybridComputeManager manager) {
        manager.privateLinkResources()
            .listByPrivateLinkScope("myResourceGroup", "myPrivateLinkScope", com.azure.core.util.Context.NONE);
    }
}
