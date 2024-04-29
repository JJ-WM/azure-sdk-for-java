// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.quota.models.GroupingId;
import com.azure.resourcemanager.quota.models.GroupingIdType;
import org.junit.jupiter.api.Assertions;

public final class GroupingIdTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GroupingId model = BinaryData.fromString("{\"groupingIdType\":\"ServiceTreeId\",\"value\":\"c\"}")
            .toObject(GroupingId.class);
        Assertions.assertEquals(GroupingIdType.SERVICE_TREE_ID, model.groupingIdType());
        Assertions.assertEquals("c", model.value());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GroupingId model = new GroupingId().withGroupingIdType(GroupingIdType.SERVICE_TREE_ID).withValue("c");
        model = BinaryData.fromObject(model).toObject(GroupingId.class);
        Assertions.assertEquals(GroupingIdType.SERVICE_TREE_ID, model.groupingIdType());
        Assertions.assertEquals("c", model.value());
    }
}
