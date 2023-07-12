// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.models.CommunityActionTypes;
import com.azure.resourcemanager.managednetworkfabric.models.Condition;
import com.azure.resourcemanager.managednetworkfabric.models.IpPrefixPropertiesIpPrefixRulesItem;
import org.junit.jupiter.api.Assertions;

public final class IpPrefixPropertiesIpPrefixRulesItemTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IpPrefixPropertiesIpPrefixRulesItem model =
            BinaryData
                .fromString(
                    "{\"action\":\"Permit\",\"sequenceNumber\":247152507284848729,\"networkPrefix\":\"mddystkiiux\",\"condition\":\"LesserThanOrEqualTo\",\"subnetMaskLength\":1167674004}")
                .toObject(IpPrefixPropertiesIpPrefixRulesItem.class);
        Assertions.assertEquals(CommunityActionTypes.PERMIT, model.action());
        Assertions.assertEquals(247152507284848729L, model.sequenceNumber());
        Assertions.assertEquals("mddystkiiux", model.networkPrefix());
        Assertions.assertEquals(Condition.LESSER_THAN_OR_EQUAL_TO, model.condition());
        Assertions.assertEquals(1167674004, model.subnetMaskLength());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IpPrefixPropertiesIpPrefixRulesItem model =
            new IpPrefixPropertiesIpPrefixRulesItem()
                .withAction(CommunityActionTypes.PERMIT)
                .withSequenceNumber(247152507284848729L)
                .withNetworkPrefix("mddystkiiux")
                .withCondition(Condition.LESSER_THAN_OR_EQUAL_TO)
                .withSubnetMaskLength(1167674004);
        model = BinaryData.fromObject(model).toObject(IpPrefixPropertiesIpPrefixRulesItem.class);
        Assertions.assertEquals(CommunityActionTypes.PERMIT, model.action());
        Assertions.assertEquals(247152507284848729L, model.sequenceNumber());
        Assertions.assertEquals("mddystkiiux", model.networkPrefix());
        Assertions.assertEquals(Condition.LESSER_THAN_OR_EQUAL_TO, model.condition());
        Assertions.assertEquals(1167674004, model.subnetMaskLength());
    }
}
