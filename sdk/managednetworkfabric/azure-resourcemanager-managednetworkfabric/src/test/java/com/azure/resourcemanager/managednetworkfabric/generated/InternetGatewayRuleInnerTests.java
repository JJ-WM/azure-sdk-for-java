// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.InternetGatewayRuleInner;
import com.azure.resourcemanager.managednetworkfabric.models.Action;
import com.azure.resourcemanager.managednetworkfabric.models.RuleProperties;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class InternetGatewayRuleInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InternetGatewayRuleInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"ruleProperties\":{\"action\":\"Allow\",\"addressList\":[\"lc\"]},\"provisioningState\":\"Succeeded\",\"internetGatewayIds\":[\"rhyzdf\",\"rsofpltdbmairrh\",\"hfnrac\",\"npq\"],\"annotation\":\"tuujwouh\"},\"location\":\"wsigrbjbxsj\",\"tags\":{\"vqkjyaznu\":\"i\",\"lv\":\"tggmuwdchozfnkfe\",\"oaiknaqlnuwig\":\"noakiz\"},\"id\":\"yxl\",\"name\":\"kwph\",\"type\":\"xzcwxhmpejt\"}")
                .toObject(InternetGatewayRuleInner.class);
        Assertions.assertEquals("wsigrbjbxsj", model.location());
        Assertions.assertEquals("i", model.tags().get("vqkjyaznu"));
        Assertions.assertEquals(Action.ALLOW, model.ruleProperties().action());
        Assertions.assertEquals("lc", model.ruleProperties().addressList().get(0));
        Assertions.assertEquals("tuujwouh", model.annotation());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InternetGatewayRuleInner model =
            new InternetGatewayRuleInner()
                .withLocation("wsigrbjbxsj")
                .withTags(mapOf("vqkjyaznu", "i", "lv", "tggmuwdchozfnkfe", "oaiknaqlnuwig", "noakiz"))
                .withRuleProperties(new RuleProperties().withAction(Action.ALLOW).withAddressList(Arrays.asList("lc")))
                .withAnnotation("tuujwouh");
        model = BinaryData.fromObject(model).toObject(InternetGatewayRuleInner.class);
        Assertions.assertEquals("wsigrbjbxsj", model.location());
        Assertions.assertEquals("i", model.tags().get("vqkjyaznu"));
        Assertions.assertEquals(Action.ALLOW, model.ruleProperties().action());
        Assertions.assertEquals("lc", model.ruleProperties().addressList().get(0));
        Assertions.assertEquals("tuujwouh", model.annotation());
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
