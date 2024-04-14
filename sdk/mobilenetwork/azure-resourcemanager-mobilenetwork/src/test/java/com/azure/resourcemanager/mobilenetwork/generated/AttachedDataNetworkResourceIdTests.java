// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mobilenetwork.models.AttachedDataNetworkResourceId;
import org.junit.jupiter.api.Assertions;

public final class AttachedDataNetworkResourceIdTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AttachedDataNetworkResourceId model
            = BinaryData.fromString("{\"id\":\"bdeibqipqk\"}").toObject(AttachedDataNetworkResourceId.class);
        Assertions.assertEquals("bdeibqipqk", model.id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AttachedDataNetworkResourceId model = new AttachedDataNetworkResourceId().withId("bdeibqipqk");
        model = BinaryData.fromObject(model).toObject(AttachedDataNetworkResourceId.class);
        Assertions.assertEquals("bdeibqipqk", model.id());
    }
}
