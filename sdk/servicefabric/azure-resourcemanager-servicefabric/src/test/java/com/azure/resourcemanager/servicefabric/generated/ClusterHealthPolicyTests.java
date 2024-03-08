// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.servicefabric.models.ApplicationHealthPolicy;
import com.azure.resourcemanager.servicefabric.models.ClusterHealthPolicy;
import com.azure.resourcemanager.servicefabric.models.ServiceTypeHealthPolicy;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ClusterHealthPolicyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterHealthPolicy model = BinaryData.fromString(
            "{\"maxPercentUnhealthyNodes\":180815183,\"maxPercentUnhealthyApplications\":1181425969,\"applicationHealthPolicies\":{\"eotusivyevc\":{\"defaultServiceTypeHealthPolicy\":{\"maxPercentUnhealthyServices\":1824195045},\"serviceTypeHealthPolicies\":{\"pdvhpfxxypin\":{\"maxPercentUnhealthyServices\":864037829},\"ayhuy\":{\"maxPercentUnhealthyServices\":2146603578},\"podepoo\":{\"maxPercentUnhealthyServices\":1192352775},\"uvamiheognarxzxt\":{\"maxPercentUnhealthyServices\":895630833}}},\"kufubljo\":{\"defaultServiceTypeHealthPolicy\":{\"maxPercentUnhealthyServices\":1522291140},\"serviceTypeHealthPolicies\":{\"ngbwjz\":{\"maxPercentUnhealthyServices\":422843266},\"ygxgispemvtz\":{\"maxPercentUnhealthyServices\":1668036347}}},\"jqul\":{\"defaultServiceTypeHealthPolicy\":{\"maxPercentUnhealthyServices\":111264928},\"serviceTypeHealthPolicies\":{\"e\":{\"maxPercentUnhealthyServices\":1330720242},\"qjbasvms\":{\"maxPercentUnhealthyServices\":565226786}}}}}")
            .toObject(ClusterHealthPolicy.class);
        Assertions.assertEquals(180815183, model.maxPercentUnhealthyNodes());
        Assertions.assertEquals(1181425969, model.maxPercentUnhealthyApplications());
        Assertions.assertEquals(1824195045, model.applicationHealthPolicies().get("eotusivyevc")
            .defaultServiceTypeHealthPolicy().maxPercentUnhealthyServices());
        Assertions.assertEquals(864037829, model.applicationHealthPolicies().get("eotusivyevc")
            .serviceTypeHealthPolicies().get("pdvhpfxxypin").maxPercentUnhealthyServices());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterHealthPolicy model = new ClusterHealthPolicy().withMaxPercentUnhealthyNodes(180815183)
            .withMaxPercentUnhealthyApplications(1181425969)
            .withApplicationHealthPolicies(mapOf("eotusivyevc", new ApplicationHealthPolicy()
                .withDefaultServiceTypeHealthPolicy(
                    new ServiceTypeHealthPolicy().withMaxPercentUnhealthyServices(1824195045))
                .withServiceTypeHealthPolicies(
                    mapOf("pdvhpfxxypin", new ServiceTypeHealthPolicy().withMaxPercentUnhealthyServices(864037829),
                        "ayhuy", new ServiceTypeHealthPolicy().withMaxPercentUnhealthyServices(2146603578), "podepoo",
                        new ServiceTypeHealthPolicy().withMaxPercentUnhealthyServices(1192352775), "uvamiheognarxzxt",
                        new ServiceTypeHealthPolicy().withMaxPercentUnhealthyServices(895630833))),
                "kufubljo",
                new ApplicationHealthPolicy()
                    .withDefaultServiceTypeHealthPolicy(
                        new ServiceTypeHealthPolicy().withMaxPercentUnhealthyServices(1522291140))
                    .withServiceTypeHealthPolicies(
                        mapOf("ngbwjz", new ServiceTypeHealthPolicy().withMaxPercentUnhealthyServices(422843266),
                            "ygxgispemvtz", new ServiceTypeHealthPolicy().withMaxPercentUnhealthyServices(1668036347))),
                "jqul",
                new ApplicationHealthPolicy()
                    .withDefaultServiceTypeHealthPolicy(
                        new ServiceTypeHealthPolicy().withMaxPercentUnhealthyServices(111264928))
                    .withServiceTypeHealthPolicies(
                        mapOf("e", new ServiceTypeHealthPolicy().withMaxPercentUnhealthyServices(1330720242),
                            "qjbasvms", new ServiceTypeHealthPolicy().withMaxPercentUnhealthyServices(565226786)))));
        model = BinaryData.fromObject(model).toObject(ClusterHealthPolicy.class);
        Assertions.assertEquals(180815183, model.maxPercentUnhealthyNodes());
        Assertions.assertEquals(1181425969, model.maxPercentUnhealthyApplications());
        Assertions.assertEquals(1824195045, model.applicationHealthPolicies().get("eotusivyevc")
            .defaultServiceTypeHealthPolicy().maxPercentUnhealthyServices());
        Assertions.assertEquals(864037829, model.applicationHealthPolicies().get("eotusivyevc")
            .serviceTypeHealthPolicies().get("pdvhpfxxypin").maxPercentUnhealthyServices());
    }

    // Use "Map.of" if available
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
