// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservices.fluent.models.OperationResourceInner;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class OperationResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationResourceInner model = BinaryData.fromString(
            "{\"endTime\":\"2021-02-11T06:40:02Z\",\"id\":\"tlmoyrx\",\"name\":\"fudwpznt\",\"status\":\"dzhlrq\",\"startTime\":\"2021-03-06T10:40:17Z\"}")
            .toObject(OperationResourceInner.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-11T06:40:02Z"), model.endTime());
        Assertions.assertEquals("tlmoyrx", model.id());
        Assertions.assertEquals("fudwpznt", model.name());
        Assertions.assertEquals("dzhlrq", model.status());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-06T10:40:17Z"), model.startTime());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationResourceInner model
            = new OperationResourceInner().withEndTime(OffsetDateTime.parse("2021-02-11T06:40:02Z"))
                .withId("tlmoyrx")
                .withName("fudwpznt")
                .withStatus("dzhlrq")
                .withStartTime(OffsetDateTime.parse("2021-03-06T10:40:17Z"));
        model = BinaryData.fromObject(model).toObject(OperationResourceInner.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-11T06:40:02Z"), model.endTime());
        Assertions.assertEquals("tlmoyrx", model.id());
        Assertions.assertEquals("fudwpznt", model.name());
        Assertions.assertEquals("dzhlrq", model.status());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-06T10:40:17Z"), model.startTime());
    }
}
