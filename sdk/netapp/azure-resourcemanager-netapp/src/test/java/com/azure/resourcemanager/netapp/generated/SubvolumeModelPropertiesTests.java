// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.SubvolumeModelProperties;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class SubvolumeModelPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SubvolumeModelProperties model = BinaryData.fromString(
            "{\"path\":\"uyqncygupkvipmd\",\"parentPath\":\"wx\",\"size\":9152224123184023671,\"bytesUsed\":7138744715268482510,\"permissions\":\"stotxh\",\"creationTimeStamp\":\"2021-02-09T01:55:57Z\",\"accessedTimeStamp\":\"2021-12-08T17:06:05Z\",\"modifiedTimeStamp\":\"2021-04-25T15:36:32Z\",\"changedTimeStamp\":\"2021-06-17T22:54:10Z\",\"provisioningState\":\"c\"}")
            .toObject(SubvolumeModelProperties.class);
        Assertions.assertEquals("uyqncygupkvipmd", model.path());
        Assertions.assertEquals("wx", model.parentPath());
        Assertions.assertEquals(9152224123184023671L, model.size());
        Assertions.assertEquals(7138744715268482510L, model.bytesUsed());
        Assertions.assertEquals("stotxh", model.permissions());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-09T01:55:57Z"), model.creationTimestamp());
        Assertions.assertEquals(OffsetDateTime.parse("2021-12-08T17:06:05Z"), model.accessedTimestamp());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-25T15:36:32Z"), model.modifiedTimestamp());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-17T22:54:10Z"), model.changedTimestamp());
        Assertions.assertEquals("c", model.provisioningState());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SubvolumeModelProperties model = new SubvolumeModelProperties().withPath("uyqncygupkvipmd").withParentPath("wx")
            .withSize(9152224123184023671L).withBytesUsed(7138744715268482510L).withPermissions("stotxh")
            .withCreationTimestamp(OffsetDateTime.parse("2021-02-09T01:55:57Z"))
            .withAccessedTimestamp(OffsetDateTime.parse("2021-12-08T17:06:05Z"))
            .withModifiedTimestamp(OffsetDateTime.parse("2021-04-25T15:36:32Z"))
            .withChangedTimestamp(OffsetDateTime.parse("2021-06-17T22:54:10Z")).withProvisioningState("c");
        model = BinaryData.fromObject(model).toObject(SubvolumeModelProperties.class);
        Assertions.assertEquals("uyqncygupkvipmd", model.path());
        Assertions.assertEquals("wx", model.parentPath());
        Assertions.assertEquals(9152224123184023671L, model.size());
        Assertions.assertEquals(7138744715268482510L, model.bytesUsed());
        Assertions.assertEquals("stotxh", model.permissions());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-09T01:55:57Z"), model.creationTimestamp());
        Assertions.assertEquals(OffsetDateTime.parse("2021-12-08T17:06:05Z"), model.accessedTimestamp());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-25T15:36:32Z"), model.modifiedTimestamp());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-17T22:54:10Z"), model.changedTimestamp());
        Assertions.assertEquals("c", model.provisioningState());
    }
}
