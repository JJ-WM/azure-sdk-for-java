// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.resourcemanager.managednetworkfabric.models.BooleanEnumProperty;
import com.azure.resourcemanager.managednetworkfabric.models.Layer2Configuration;
import com.azure.resourcemanager.managednetworkfabric.models.Layer3Configuration;
import com.azure.resourcemanager.managednetworkfabric.models.NniType;

/** Samples for NetworkToNetworkInterconnects Create. */
public final class NetworkToNetworkInterconnectsCreateSamples {
    /*
     * x-ms-original-file: specification/managednetworkfabric/resource-manager/Microsoft.ManagedNetworkFabric/preview/2023-02-01-preview/examples/NetworkToNetworkInterconnects_Create_MaximumSet_Gen.json
     */
    /**
     * Sample code: NetworkToNetworkInterconnects_Create_MaximumSet_Gen.
     *
     * @param manager Entry point to ManagedNetworkFabricManager.
     */
    public static void networkToNetworkInterconnectsCreateMaximumSetGen(
        com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager manager) {
        manager
            .networkToNetworkInterconnects()
            .define("DefaultNNI")
            .withExistingNetworkFabric("resourceGroupName", "FabricName")
            .withNniType(NniType.CE)
            .withIsManagementType(BooleanEnumProperty.TRUE)
            .withUseOptionB(BooleanEnumProperty.FALSE)
            .withLayer2Configuration(new Layer2Configuration().withPortCount(10).withMtu(1500))
            .withLayer3Configuration(
                new Layer3Configuration()
                    .withPrimaryIpv4Prefix("172.31.0.0/31")
                    .withPrimaryIpv6Prefix("3FFE:FFFF:0:CD30::a0/126")
                    .withSecondaryIpv4Prefix("172.31.0.20/31")
                    .withSecondaryIpv6Prefix("3FFE:FFFF:0:CD30::a4/126")
                    .withImportRoutePolicyId(
                        "/subscriptions/subscriptionId/resourceGroups/resourceGroupName/providers/Microsoft.ManagedNetworkFabric/routePolicies/routePolicyName1")
                    .withExportRoutePolicyId(
                        "/subscriptions/subscriptionId/resourceGroups/resourceGroupName/providers/Microsoft.ManagedNetworkFabric/routePolicies/routePolicyName2")
                    .withPeerAsn(50272)
                    .withVlanId(2064))
            .create();
    }
}
