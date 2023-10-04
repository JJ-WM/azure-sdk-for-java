// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/** Samples for LoadBalancerBackendAddressPools List. */
public final class LoadBalancerBackendAddressPoolsListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-05-01/examples/LBBackendAddressPoolListWithBackendAddressesPoolType.json
     */
    /**
     * Sample code: Load balancer with BackendAddressPool containing BackendAddresses.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void loadBalancerWithBackendAddressPoolContainingBackendAddresses(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getLoadBalancerBackendAddressPools()
            .list("testrg", "lb", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-05-01/examples/LoadBalancerBackendAddressPoolList.json
     */
    /**
     * Sample code: LoadBalancerBackendAddressPoolList.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void loadBalancerBackendAddressPoolList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getLoadBalancerBackendAddressPools()
            .list("testrg", "lb", com.azure.core.util.Context.NONE);
    }
}
