// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mobilenetwork.fluent.models.ServicePropertiesFormat;
import com.azure.resourcemanager.mobilenetwork.models.Ambr;
import com.azure.resourcemanager.mobilenetwork.models.PccRuleConfiguration;
import com.azure.resourcemanager.mobilenetwork.models.PccRuleQosPolicy;
import com.azure.resourcemanager.mobilenetwork.models.PreemptionCapability;
import com.azure.resourcemanager.mobilenetwork.models.PreemptionVulnerability;
import com.azure.resourcemanager.mobilenetwork.models.QosPolicy;
import com.azure.resourcemanager.mobilenetwork.models.SdfDirection;
import com.azure.resourcemanager.mobilenetwork.models.ServiceDataFlowTemplate;
import com.azure.resourcemanager.mobilenetwork.models.TrafficControlPermission;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ServicePropertiesFormatTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ServicePropertiesFormat model = BinaryData.fromString(
            "{\"provisioningState\":\"Canceled\",\"servicePrecedence\":1517246970,\"serviceQosPolicy\":{\"5qi\":2014449644,\"allocationAndRetentionPriorityLevel\":1407927145,\"preemptionCapability\":\"MayPreempt\",\"preemptionVulnerability\":\"Preemptable\",\"maximumBitRate\":{\"uplink\":\"pzbchck\",\"downlink\":\"qzqioxiysuiizy\"}},\"pccRules\":[{\"ruleName\":\"edyatrwyhqmibzyh\",\"rulePrecedence\":248570264,\"ruleQosPolicy\":{\"guaranteedBitRate\":{\"uplink\":\"mypyynpcdpu\",\"downlink\":\"nzgmwznmabik\"},\"5qi\":438726197,\"allocationAndRetentionPriorityLevel\":284256630,\"preemptionCapability\":\"NotPreempt\",\"preemptionVulnerability\":\"NotPreemptable\",\"maximumBitRate\":{\"uplink\":\"ldtlwwr\",\"downlink\":\"kdmtncvokotll\"}},\"trafficControl\":\"Enabled\",\"serviceDataFlowTemplates\":[{\"templateName\":\"gsyocogj\",\"direction\":\"Bidirectional\",\"protocol\":[\"tbnnha\",\"oocrkvcikhnv\"],\"remoteIpList\":[\"mqg\",\"qqu\",\"zikywgg\",\"kallatmel\"],\"ports\":[\"piccjzkzivgv\",\"c\"]}]}]}")
            .toObject(ServicePropertiesFormat.class);
        Assertions.assertEquals(1517246970, model.servicePrecedence());
        Assertions.assertEquals(2014449644, model.serviceQosPolicy().fiveQi());
        Assertions.assertEquals(1407927145, model.serviceQosPolicy().allocationAndRetentionPriorityLevel());
        Assertions.assertEquals(PreemptionCapability.MAY_PREEMPT, model.serviceQosPolicy().preemptionCapability());
        Assertions.assertEquals(PreemptionVulnerability.PREEMPTABLE,
            model.serviceQosPolicy().preemptionVulnerability());
        Assertions.assertEquals("pzbchck", model.serviceQosPolicy().maximumBitRate().uplink());
        Assertions.assertEquals("qzqioxiysuiizy", model.serviceQosPolicy().maximumBitRate().downlink());
        Assertions.assertEquals("edyatrwyhqmibzyh", model.pccRules().get(0).ruleName());
        Assertions.assertEquals(248570264, model.pccRules().get(0).rulePrecedence());
        Assertions.assertEquals(438726197, model.pccRules().get(0).ruleQosPolicy().fiveQi());
        Assertions.assertEquals(284256630,
            model.pccRules().get(0).ruleQosPolicy().allocationAndRetentionPriorityLevel());
        Assertions.assertEquals(PreemptionCapability.NOT_PREEMPT,
            model.pccRules().get(0).ruleQosPolicy().preemptionCapability());
        Assertions.assertEquals(PreemptionVulnerability.NOT_PREEMPTABLE,
            model.pccRules().get(0).ruleQosPolicy().preemptionVulnerability());
        Assertions.assertEquals("ldtlwwr", model.pccRules().get(0).ruleQosPolicy().maximumBitRate().uplink());
        Assertions.assertEquals("kdmtncvokotll", model.pccRules().get(0).ruleQosPolicy().maximumBitRate().downlink());
        Assertions.assertEquals("mypyynpcdpu", model.pccRules().get(0).ruleQosPolicy().guaranteedBitRate().uplink());
        Assertions.assertEquals("nzgmwznmabik", model.pccRules().get(0).ruleQosPolicy().guaranteedBitRate().downlink());
        Assertions.assertEquals(TrafficControlPermission.ENABLED, model.pccRules().get(0).trafficControl());
        Assertions.assertEquals("gsyocogj", model.pccRules().get(0).serviceDataFlowTemplates().get(0).templateName());
        Assertions.assertEquals(SdfDirection.BIDIRECTIONAL,
            model.pccRules().get(0).serviceDataFlowTemplates().get(0).direction());
        Assertions.assertEquals("tbnnha", model.pccRules().get(0).serviceDataFlowTemplates().get(0).protocol().get(0));
        Assertions.assertEquals("mqg", model.pccRules().get(0).serviceDataFlowTemplates().get(0).remoteIpList().get(0));
        Assertions.assertEquals("piccjzkzivgv",
            model.pccRules().get(0).serviceDataFlowTemplates().get(0).ports().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ServicePropertiesFormat model = new ServicePropertiesFormat().withServicePrecedence(1517246970)
            .withServiceQosPolicy(
                new QosPolicy().withFiveQi(2014449644).withAllocationAndRetentionPriorityLevel(1407927145)
                    .withPreemptionCapability(PreemptionCapability.MAY_PREEMPT)
                    .withPreemptionVulnerability(PreemptionVulnerability.PREEMPTABLE)
                    .withMaximumBitRate(new Ambr().withUplink("pzbchck").withDownlink("qzqioxiysuiizy")))
            .withPccRules(
                Arrays
                    .asList(new PccRuleConfiguration().withRuleName("edyatrwyhqmibzyh").withRulePrecedence(248570264)
                        .withRuleQosPolicy(new PccRuleQosPolicy().withFiveQi(438726197)
                            .withAllocationAndRetentionPriorityLevel(284256630)
                            .withPreemptionCapability(PreemptionCapability.NOT_PREEMPT)
                            .withPreemptionVulnerability(PreemptionVulnerability.NOT_PREEMPTABLE)
                            .withMaximumBitRate(new Ambr().withUplink("ldtlwwr").withDownlink("kdmtncvokotll"))
                            .withGuaranteedBitRate(new Ambr().withUplink("mypyynpcdpu").withDownlink("nzgmwznmabik")))
                        .withTrafficControl(TrafficControlPermission.ENABLED)
                        .withServiceDataFlowTemplates(Arrays.asList(new ServiceDataFlowTemplate()
                            .withTemplateName("gsyocogj").withDirection(SdfDirection.BIDIRECTIONAL)
                            .withProtocol(Arrays.asList("tbnnha", "oocrkvcikhnv"))
                            .withRemoteIpList(Arrays.asList("mqg", "qqu", "zikywgg", "kallatmel"))
                            .withPorts(Arrays.asList("piccjzkzivgv", "c"))))));
        model = BinaryData.fromObject(model).toObject(ServicePropertiesFormat.class);
        Assertions.assertEquals(1517246970, model.servicePrecedence());
        Assertions.assertEquals(2014449644, model.serviceQosPolicy().fiveQi());
        Assertions.assertEquals(1407927145, model.serviceQosPolicy().allocationAndRetentionPriorityLevel());
        Assertions.assertEquals(PreemptionCapability.MAY_PREEMPT, model.serviceQosPolicy().preemptionCapability());
        Assertions.assertEquals(PreemptionVulnerability.PREEMPTABLE,
            model.serviceQosPolicy().preemptionVulnerability());
        Assertions.assertEquals("pzbchck", model.serviceQosPolicy().maximumBitRate().uplink());
        Assertions.assertEquals("qzqioxiysuiizy", model.serviceQosPolicy().maximumBitRate().downlink());
        Assertions.assertEquals("edyatrwyhqmibzyh", model.pccRules().get(0).ruleName());
        Assertions.assertEquals(248570264, model.pccRules().get(0).rulePrecedence());
        Assertions.assertEquals(438726197, model.pccRules().get(0).ruleQosPolicy().fiveQi());
        Assertions.assertEquals(284256630,
            model.pccRules().get(0).ruleQosPolicy().allocationAndRetentionPriorityLevel());
        Assertions.assertEquals(PreemptionCapability.NOT_PREEMPT,
            model.pccRules().get(0).ruleQosPolicy().preemptionCapability());
        Assertions.assertEquals(PreemptionVulnerability.NOT_PREEMPTABLE,
            model.pccRules().get(0).ruleQosPolicy().preemptionVulnerability());
        Assertions.assertEquals("ldtlwwr", model.pccRules().get(0).ruleQosPolicy().maximumBitRate().uplink());
        Assertions.assertEquals("kdmtncvokotll", model.pccRules().get(0).ruleQosPolicy().maximumBitRate().downlink());
        Assertions.assertEquals("mypyynpcdpu", model.pccRules().get(0).ruleQosPolicy().guaranteedBitRate().uplink());
        Assertions.assertEquals("nzgmwznmabik", model.pccRules().get(0).ruleQosPolicy().guaranteedBitRate().downlink());
        Assertions.assertEquals(TrafficControlPermission.ENABLED, model.pccRules().get(0).trafficControl());
        Assertions.assertEquals("gsyocogj", model.pccRules().get(0).serviceDataFlowTemplates().get(0).templateName());
        Assertions.assertEquals(SdfDirection.BIDIRECTIONAL,
            model.pccRules().get(0).serviceDataFlowTemplates().get(0).direction());
        Assertions.assertEquals("tbnnha", model.pccRules().get(0).serviceDataFlowTemplates().get(0).protocol().get(0));
        Assertions.assertEquals("mqg", model.pccRules().get(0).serviceDataFlowTemplates().get(0).remoteIpList().get(0));
        Assertions.assertEquals("piccjzkzivgv",
            model.pccRules().get(0).serviceDataFlowTemplates().get(0).ports().get(0));
    }
}
