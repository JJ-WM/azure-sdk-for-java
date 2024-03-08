// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceupdate.generated;

import com.azure.resourcemanager.deviceupdate.models.PrivateLinkServiceConnection;
import com.azure.resourcemanager.deviceupdate.models.PrivateLinkServiceProxy;
import com.azure.resourcemanager.deviceupdate.models.RemotePrivateEndpoint;
import java.util.Arrays;

/**
 * Samples for PrivateEndpointConnectionProxies CreateOrUpdate.
 */
public final class PrivateEndpointConnectionProxiesCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/deviceupdate/resource-manager/Microsoft.DeviceUpdate/stable/2023-07-01/examples/
     * PrivateEndpointConnectionProxies/PrivateEndpointConnectionProxy_CreateOrUpdate.json
     */
    /**
     * Sample code: PrivateEndpointConnectionProxyCreateOrUpdate.
     * 
     * @param manager Entry point to DeviceUpdateManager.
     */
    public static void privateEndpointConnectionProxyCreateOrUpdate(
        com.azure.resourcemanager.deviceupdate.DeviceUpdateManager manager) {
        manager.privateEndpointConnectionProxies().define("peexample01").withExistingAccount("test-rg", "contoso")
            .withRemotePrivateEndpoint(new RemotePrivateEndpoint().withId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/test-rg/providers/Microsoft.Network/privateEndpoints/{peName}")
                .withLocation("westus2").withImmutableSubscriptionId("00000000-0000-0000-0000-000000000000")
                .withImmutableResourceId(
                    "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/test-rg/providers/Microsoft.Network/privateEndpoints/{peName}")
                .withManualPrivateLinkServiceConnections(Arrays.asList(new PrivateLinkServiceConnection()
                    .withName("{privateEndpointConnectionProxyId}").withGroupIds(Arrays.asList("DeviceUpdate"))
                    .withRequestMessage("Please approve my connection, thanks.")))
                .withPrivateLinkServiceProxies(Arrays.asList(new PrivateLinkServiceProxy().withId(
                    "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/test-rg/providers/Microsoft.Network/privateEndpoints/{privateEndpointConnectionProxyId}/privateLinkServiceProxies/{privateEndpointConnectionProxyId}")
                    .withGroupConnectivityInformation(Arrays.asList()))))
            .create();
    }
}
