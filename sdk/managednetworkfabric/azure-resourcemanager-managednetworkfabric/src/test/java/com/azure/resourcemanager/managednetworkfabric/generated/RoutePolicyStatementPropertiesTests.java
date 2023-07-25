// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.models.ActionIpCommunityProperties;
import com.azure.resourcemanager.managednetworkfabric.models.ActionIpExtendedCommunityProperties;
import com.azure.resourcemanager.managednetworkfabric.models.IpCommunityIdList;
import com.azure.resourcemanager.managednetworkfabric.models.IpExtendedCommunityIdList;
import com.azure.resourcemanager.managednetworkfabric.models.RoutePolicyActionType;
import com.azure.resourcemanager.managednetworkfabric.models.RoutePolicyConditionType;
import com.azure.resourcemanager.managednetworkfabric.models.RoutePolicyStatementProperties;
import com.azure.resourcemanager.managednetworkfabric.models.StatementActionProperties;
import com.azure.resourcemanager.managednetworkfabric.models.StatementConditionProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class RoutePolicyStatementPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RoutePolicyStatementProperties model =
            BinaryData
                .fromString(
                    "{\"sequenceNumber\":4122338443565753396,\"condition\":{\"type\":\"And\",\"ipPrefixId\":\"au\",\"ipExtendedCommunityIds\":[\"udzpsjqrmlujmt\"],\"ipCommunityIds\":[\"ofwuzeb\",\"qvmpjb\",\"zyenfspet\",\"eudwkhdlckdoxocj\"]},\"action\":{\"localPreference\":4325038435220146940,\"actionType\":\"Deny\",\"ipCommunityProperties\":{\"delete\":{\"ipCommunityIds\":[\"ortwwyjm\",\"vrlhfxmrhjn\",\"h\"]},\"set\":{\"ipCommunityIds\":[\"wkdywkszavuafan\"]},\"add\":{\"ipCommunityIds\":[\"tptplkossjbzvx\",\"zw\"]}},\"ipExtendedCommunityProperties\":{\"delete\":{\"ipExtendedCommunityIds\":[\"fgti\",\"czhfjdcc\",\"nyuvbtcuhjcgjt\",\"kntomnlz\"]},\"set\":{\"ipExtendedCommunityIds\":[\"bszsbzrrxey\"]},\"add\":{\"ipExtendedCommunityIds\":[\"owlrmbdctqxav\",\"joezvw\",\"ryzgavpln\"]}}},\"annotation\":\"dfiekkiskyy\"}")
                .toObject(RoutePolicyStatementProperties.class);
        Assertions.assertEquals("dfiekkiskyy", model.annotation());
        Assertions.assertEquals(4122338443565753396L, model.sequenceNumber());
        Assertions.assertEquals("ofwuzeb", model.condition().ipCommunityIds().get(0));
        Assertions.assertEquals(RoutePolicyConditionType.AND, model.condition().type());
        Assertions.assertEquals("au", model.condition().ipPrefixId());
        Assertions.assertEquals("udzpsjqrmlujmt", model.condition().ipExtendedCommunityIds().get(0));
        Assertions.assertEquals(4325038435220146940L, model.action().localPreference());
        Assertions.assertEquals(RoutePolicyActionType.DENY, model.action().actionType());
        Assertions.assertEquals("tptplkossjbzvx", model.action().ipCommunityProperties().add().ipCommunityIds().get(0));
        Assertions.assertEquals("ortwwyjm", model.action().ipCommunityProperties().delete().ipCommunityIds().get(0));
        Assertions
            .assertEquals("wkdywkszavuafan", model.action().ipCommunityProperties().set().ipCommunityIds().get(0));
        Assertions
            .assertEquals(
                "owlrmbdctqxav", model.action().ipExtendedCommunityProperties().add().ipExtendedCommunityIds().get(0));
        Assertions
            .assertEquals(
                "fgti", model.action().ipExtendedCommunityProperties().delete().ipExtendedCommunityIds().get(0));
        Assertions
            .assertEquals(
                "bszsbzrrxey", model.action().ipExtendedCommunityProperties().set().ipExtendedCommunityIds().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RoutePolicyStatementProperties model =
            new RoutePolicyStatementProperties()
                .withAnnotation("dfiekkiskyy")
                .withSequenceNumber(4122338443565753396L)
                .withCondition(
                    new StatementConditionProperties()
                        .withIpCommunityIds(Arrays.asList("ofwuzeb", "qvmpjb", "zyenfspet", "eudwkhdlckdoxocj"))
                        .withType(RoutePolicyConditionType.AND)
                        .withIpPrefixId("au")
                        .withIpExtendedCommunityIds(Arrays.asList("udzpsjqrmlujmt")))
                .withAction(
                    new StatementActionProperties()
                        .withLocalPreference(4325038435220146940L)
                        .withActionType(RoutePolicyActionType.DENY)
                        .withIpCommunityProperties(
                            new ActionIpCommunityProperties()
                                .withAdd(
                                    new IpCommunityIdList().withIpCommunityIds(Arrays.asList("tptplkossjbzvx", "zw")))
                                .withDelete(
                                    new IpCommunityIdList()
                                        .withIpCommunityIds(Arrays.asList("ortwwyjm", "vrlhfxmrhjn", "h")))
                                .withSet(new IpCommunityIdList().withIpCommunityIds(Arrays.asList("wkdywkszavuafan"))))
                        .withIpExtendedCommunityProperties(
                            new ActionIpExtendedCommunityProperties()
                                .withAdd(
                                    new IpExtendedCommunityIdList()
                                        .withIpExtendedCommunityIds(
                                            Arrays.asList("owlrmbdctqxav", "joezvw", "ryzgavpln")))
                                .withDelete(
                                    new IpExtendedCommunityIdList()
                                        .withIpExtendedCommunityIds(
                                            Arrays.asList("fgti", "czhfjdcc", "nyuvbtcuhjcgjt", "kntomnlz")))
                                .withSet(
                                    new IpExtendedCommunityIdList()
                                        .withIpExtendedCommunityIds(Arrays.asList("bszsbzrrxey")))));
        model = BinaryData.fromObject(model).toObject(RoutePolicyStatementProperties.class);
        Assertions.assertEquals("dfiekkiskyy", model.annotation());
        Assertions.assertEquals(4122338443565753396L, model.sequenceNumber());
        Assertions.assertEquals("ofwuzeb", model.condition().ipCommunityIds().get(0));
        Assertions.assertEquals(RoutePolicyConditionType.AND, model.condition().type());
        Assertions.assertEquals("au", model.condition().ipPrefixId());
        Assertions.assertEquals("udzpsjqrmlujmt", model.condition().ipExtendedCommunityIds().get(0));
        Assertions.assertEquals(4325038435220146940L, model.action().localPreference());
        Assertions.assertEquals(RoutePolicyActionType.DENY, model.action().actionType());
        Assertions.assertEquals("tptplkossjbzvx", model.action().ipCommunityProperties().add().ipCommunityIds().get(0));
        Assertions.assertEquals("ortwwyjm", model.action().ipCommunityProperties().delete().ipCommunityIds().get(0));
        Assertions
            .assertEquals("wkdywkszavuafan", model.action().ipCommunityProperties().set().ipCommunityIds().get(0));
        Assertions
            .assertEquals(
                "owlrmbdctqxav", model.action().ipExtendedCommunityProperties().add().ipExtendedCommunityIds().get(0));
        Assertions
            .assertEquals(
                "fgti", model.action().ipExtendedCommunityProperties().delete().ipExtendedCommunityIds().get(0));
        Assertions
            .assertEquals(
                "bszsbzrrxey", model.action().ipExtendedCommunityProperties().set().ipExtendedCommunityIds().get(0));
    }
}
