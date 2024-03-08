// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.resourcemanager.network.fluent.models.NetworkManagerInner;
import com.azure.resourcemanager.network.models.ConfigurationType;
import com.azure.resourcemanager.network.models.NetworkManagerPropertiesNetworkManagerScopes;
import java.util.Arrays;

/**
 * Samples for NetworkManagers CreateOrUpdate.
 */
public final class NetworkManagersCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2023-09-01/examples/NetworkManagerPut.json
     */
    /**
     * Sample code: Put Network Manager.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void putNetworkManager(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getNetworkManagers().createOrUpdateWithResponse("rg1",
            "TestNetworkManager",
            new NetworkManagerInner().withDescription("My Test Network Manager")
                .withNetworkManagerScopes(new NetworkManagerPropertiesNetworkManagerScopes()
                    .withManagementGroups(Arrays.asList("/Microsoft.Management/testmg"))
                    .withSubscriptions(Arrays.asList("/subscriptions/00000000-0000-0000-0000-000000000000")))
                .withNetworkManagerScopeAccesses(Arrays.asList(ConfigurationType.CONNECTIVITY)),
            com.azure.core.util.Context.NONE);
    }
}
