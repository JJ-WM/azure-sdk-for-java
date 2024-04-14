// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.support.fluent.models.CommunicationDetailsInner;
import com.azure.resourcemanager.support.models.CommunicationsListResult;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class CommunicationsListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CommunicationsListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"communicationType\":\"phone\",\"communicationDirection\":\"outbound\",\"sender\":\"dagxtibqd\",\"subject\":\"bxwakbog\",\"body\":\"xndlkzgxhu\",\"createdDate\":\"2021-03-23T13:44:10Z\"},\"id\":\"lbpodxunk\",\"name\":\"ebxmubyynt\",\"type\":\"lrb\"},{\"properties\":{\"communicationType\":\"phone\",\"communicationDirection\":\"outbound\",\"sender\":\"seotgqrllt\",\"subject\":\"u\",\"body\":\"lauwzizxbmpgcjef\",\"createdDate\":\"2021-09-15T06:09:09Z\"},\"id\":\"uvpb\",\"name\":\"tdum\",\"type\":\"rp\"},{\"properties\":{\"communicationType\":\"phone\",\"communicationDirection\":\"inbound\",\"sender\":\"btbhjpglkfgohd\",\"subject\":\"euel\",\"body\":\"phsdyhto\",\"createdDate\":\"2021-12-10T07:50:41Z\"},\"id\":\"kd\",\"name\":\"wwquuvxzxclvithh\",\"type\":\"zonosgg\"}],\"nextLink\":\"c\"}")
            .toObject(CommunicationsListResult.class);
        Assertions.assertEquals("dagxtibqd", model.value().get(0).sender());
        Assertions.assertEquals("bxwakbog", model.value().get(0).subject());
        Assertions.assertEquals("xndlkzgxhu", model.value().get(0).body());
        Assertions.assertEquals("c", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CommunicationsListResult model = new CommunicationsListResult()
            .withValue(Arrays.asList(
                new CommunicationDetailsInner().withSender("dagxtibqd").withSubject("bxwakbog").withBody("xndlkzgxhu"),
                new CommunicationDetailsInner().withSender("seotgqrllt").withSubject("u").withBody("lauwzizxbmpgcjef"),
                new CommunicationDetailsInner().withSender("btbhjpglkfgohd").withSubject("euel").withBody("phsdyhto")))
            .withNextLink("c");
        model = BinaryData.fromObject(model).toObject(CommunicationsListResult.class);
        Assertions.assertEquals("dagxtibqd", model.value().get(0).sender());
        Assertions.assertEquals("bxwakbog", model.value().get(0).subject());
        Assertions.assertEquals("xndlkzgxhu", model.value().get(0).body());
        Assertions.assertEquals("c", model.nextLink());
    }
}
