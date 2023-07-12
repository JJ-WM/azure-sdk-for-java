// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.resourcemanager.managednetworkfabric.models.CommunityActionTypes;
import com.azure.resourcemanager.managednetworkfabric.models.Condition;
import com.azure.resourcemanager.managednetworkfabric.models.IpPrefixPropertiesIpPrefixRulesItem;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for IpPrefixes Create. */
public final class IpPrefixesCreateSamples {
    /*
     * x-ms-original-file: specification/managednetworkfabric/resource-manager/Microsoft.ManagedNetworkFabric/preview/2023-02-01-preview/examples/IpPrefixes_Create_MaximumSet_Gen.json
     */
    /**
     * Sample code: IpPrefixes_Create_MaximumSet_Gen.
     *
     * @param manager Entry point to ManagedNetworkFabricManager.
     */
    public static void ipPrefixesCreateMaximumSetGen(
        com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager manager) {
        manager
            .ipPrefixes()
            .define("example-ipPrefix")
            .withRegion("EastUS")
            .withExistingResourceGroup("resourcegroupname")
            .withIpPrefixRules(
                Arrays
                    .asList(
                        new IpPrefixPropertiesIpPrefixRulesItem()
                            .withAction(CommunityActionTypes.PERMIT)
                            .withSequenceNumber(12L)
                            .withNetworkPrefix("1.1.1.0/24")
                            .withCondition(Condition.EQUAL_TO)
                            .withSubnetMaskLength(28)))
            .withTags(mapOf("key6404", ""))
            .withAnnotation("annotationValue")
            .create();
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
