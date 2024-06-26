// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dnsresolver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dnsresolver.fluent.models.ForwardingRuleInner;
import com.azure.resourcemanager.dnsresolver.models.ForwardingRuleListResult;
import com.azure.resourcemanager.dnsresolver.models.ForwardingRuleState;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ForwardingRuleListResultTests {
    @Test
    public void testDeserialize() {
        ForwardingRuleListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"etag\":\"hfiqscjeypvhe\",\"properties\":{\"domainName\":\"rkgqhcjrefo\",\"targetDnsServers\":[],\"metadata\":{},\"forwardingRuleState\":\"Disabled\",\"provisioningState\":\"Failed\"},\"id\":\"eyyvxyqjpkcat\",\"name\":\"pngjcrcczsqpjhvm\",\"type\":\"ajvnysounqe\"},{\"etag\":\"noae\",\"properties\":{\"domainName\":\"pfhyhl\",\"targetDnsServers\":[],\"metadata\":{},\"forwardingRuleState\":\"Enabled\",\"provisioningState\":\"Creating\"},\"id\":\"mcmatuokthfuiu\",\"name\":\"odsfcpkvxodpuozm\",\"type\":\"zydagfuaxbezyiuo\"},{\"etag\":\"twhrdxwzywqsm\",\"properties\":{\"domainName\":\"surex\",\"targetDnsServers\":[],\"metadata\":{},\"forwardingRuleState\":\"Disabled\",\"provisioningState\":\"Deleting\"},\"id\":\"fsfksymddyst\",\"name\":\"i\",\"type\":\"uxh\"},{\"etag\":\"udxorrqn\",\"properties\":{\"domainName\":\"poczvyifqrvkdvjs\",\"targetDnsServers\":[],\"metadata\":{},\"forwardingRuleState\":\"Enabled\",\"provisioningState\":\"Canceled\"},\"id\":\"f\",\"name\":\"atkpnp\",\"type\":\"lexxbczwtru\"}],\"nextLink\":\"qzbqjvsov\"}")
                .toObject(ForwardingRuleListResult.class);
        Assertions.assertEquals("rkgqhcjrefo", model.value().get(0).domainName());
        Assertions.assertEquals(ForwardingRuleState.DISABLED, model.value().get(0).forwardingRuleState());
    }

    @Test
    public void testSerialize() {
        ForwardingRuleListResult model =
            new ForwardingRuleListResult()
                .withValue(
                    Arrays
                        .asList(
                            new ForwardingRuleInner()
                                .withDomainName("rkgqhcjrefo")
                                .withTargetDnsServers(Arrays.asList())
                                .withMetadata(mapOf())
                                .withForwardingRuleState(ForwardingRuleState.DISABLED),
                            new ForwardingRuleInner()
                                .withDomainName("pfhyhl")
                                .withTargetDnsServers(Arrays.asList())
                                .withMetadata(mapOf())
                                .withForwardingRuleState(ForwardingRuleState.ENABLED),
                            new ForwardingRuleInner()
                                .withDomainName("surex")
                                .withTargetDnsServers(Arrays.asList())
                                .withMetadata(mapOf())
                                .withForwardingRuleState(ForwardingRuleState.DISABLED),
                            new ForwardingRuleInner()
                                .withDomainName("poczvyifqrvkdvjs")
                                .withTargetDnsServers(Arrays.asList())
                                .withMetadata(mapOf())
                                .withForwardingRuleState(ForwardingRuleState.ENABLED)));
        model = BinaryData.fromObject(model).toObject(ForwardingRuleListResult.class);
        Assertions.assertEquals("rkgqhcjrefo", model.value().get(0).domainName());
        Assertions.assertEquals(ForwardingRuleState.DISABLED, model.value().get(0).forwardingRuleState());
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
