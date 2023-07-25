// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.RoutePolicyInner;
import com.azure.resourcemanager.managednetworkfabric.models.AddressFamilyType;
import com.azure.resourcemanager.managednetworkfabric.models.RoutePoliciesListResult;
import com.azure.resourcemanager.managednetworkfabric.models.RoutePolicyActionType;
import com.azure.resourcemanager.managednetworkfabric.models.RoutePolicyStatementProperties;
import com.azure.resourcemanager.managednetworkfabric.models.StatementActionProperties;
import com.azure.resourcemanager.managednetworkfabric.models.StatementConditionProperties;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class RoutePoliciesListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RoutePoliciesListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"networkFabricId\":\"mrvnuvqkrrsguogk\",\"addressFamilyType\":\"IPv6\",\"configurationState\":\"Rejected\",\"provisioningState\":\"Deleting\",\"administrativeState\":\"MAT\",\"statements\":[{\"sequenceNumber\":300365337719306636,\"condition\":{},\"action\":{\"actionType\":\"Deny\"},\"annotation\":\"wpftvvqtmvifgcvs\"}],\"annotation\":\"alb\"},\"location\":\"icxgosnx\",\"tags\":{\"zxaoxlhmvjcnnls\":\"tcdf\"},\"id\":\"nucqxhpaqo\",\"name\":\"bvejo\",\"type\":\"soxovlznkleld\"},{\"properties\":{\"networkFabricId\":\"qdlqqhntqrykkxak\",\"addressFamilyType\":\"IPv6\",\"configurationState\":\"Deprovisioned\",\"provisioningState\":\"Failed\",\"administrativeState\":\"Disabled\",\"statements\":[{\"sequenceNumber\":6972584664296828431,\"condition\":{},\"action\":{\"actionType\":\"Permit\"},\"annotation\":\"ccnpxiemacmzt\"}],\"annotation\":\"kxsnnbrysgkt\"},\"location\":\"ocnqbblr\",\"tags\":{\"hocqxugjx\":\"fzghfuifwxudyn\",\"hmhurosdjlzb\":\"gdcrrfbpl\",\"dghq\":\"m\"},\"id\":\"uyaorservpv\",\"name\":\"sorsbegcl\",\"type\":\"ex\"}],\"nextLink\":\"jqzyhzydy\"}")
                .toObject(RoutePoliciesListResult.class);
        Assertions.assertEquals("icxgosnx", model.value().get(0).location());
        Assertions.assertEquals("tcdf", model.value().get(0).tags().get("zxaoxlhmvjcnnls"));
        Assertions.assertEquals("mrvnuvqkrrsguogk", model.value().get(0).networkFabricId());
        Assertions.assertEquals(AddressFamilyType.IPV6, model.value().get(0).addressFamilyType());
        Assertions.assertEquals("wpftvvqtmvifgcvs", model.value().get(0).statements().get(0).annotation());
        Assertions.assertEquals(300365337719306636L, model.value().get(0).statements().get(0).sequenceNumber());
        Assertions
            .assertEquals(RoutePolicyActionType.DENY, model.value().get(0).statements().get(0).action().actionType());
        Assertions.assertEquals("alb", model.value().get(0).annotation());
        Assertions.assertEquals("jqzyhzydy", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RoutePoliciesListResult model =
            new RoutePoliciesListResult()
                .withValue(
                    Arrays
                        .asList(
                            new RoutePolicyInner()
                                .withLocation("icxgosnx")
                                .withTags(mapOf("zxaoxlhmvjcnnls", "tcdf"))
                                .withNetworkFabricId("mrvnuvqkrrsguogk")
                                .withAddressFamilyType(AddressFamilyType.IPV6)
                                .withStatements(
                                    Arrays
                                        .asList(
                                            new RoutePolicyStatementProperties()
                                                .withAnnotation("wpftvvqtmvifgcvs")
                                                .withSequenceNumber(300365337719306636L)
                                                .withCondition(new StatementConditionProperties())
                                                .withAction(
                                                    new StatementActionProperties()
                                                        .withActionType(RoutePolicyActionType.DENY))))
                                .withAnnotation("alb"),
                            new RoutePolicyInner()
                                .withLocation("ocnqbblr")
                                .withTags(
                                    mapOf("hocqxugjx", "fzghfuifwxudyn", "hmhurosdjlzb", "gdcrrfbpl", "dghq", "m"))
                                .withNetworkFabricId("qdlqqhntqrykkxak")
                                .withAddressFamilyType(AddressFamilyType.IPV6)
                                .withStatements(
                                    Arrays
                                        .asList(
                                            new RoutePolicyStatementProperties()
                                                .withAnnotation("ccnpxiemacmzt")
                                                .withSequenceNumber(6972584664296828431L)
                                                .withCondition(new StatementConditionProperties())
                                                .withAction(
                                                    new StatementActionProperties()
                                                        .withActionType(RoutePolicyActionType.PERMIT))))
                                .withAnnotation("kxsnnbrysgkt")))
                .withNextLink("jqzyhzydy");
        model = BinaryData.fromObject(model).toObject(RoutePoliciesListResult.class);
        Assertions.assertEquals("icxgosnx", model.value().get(0).location());
        Assertions.assertEquals("tcdf", model.value().get(0).tags().get("zxaoxlhmvjcnnls"));
        Assertions.assertEquals("mrvnuvqkrrsguogk", model.value().get(0).networkFabricId());
        Assertions.assertEquals(AddressFamilyType.IPV6, model.value().get(0).addressFamilyType());
        Assertions.assertEquals("wpftvvqtmvifgcvs", model.value().get(0).statements().get(0).annotation());
        Assertions.assertEquals(300365337719306636L, model.value().get(0).statements().get(0).sequenceNumber());
        Assertions
            .assertEquals(RoutePolicyActionType.DENY, model.value().get(0).statements().get(0).action().actionType());
        Assertions.assertEquals("alb", model.value().get(0).annotation());
        Assertions.assertEquals("jqzyhzydy", model.nextLink());
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
