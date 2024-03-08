// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.connectedvmware.fluent.models.InventoryItemInner;
import com.azure.resourcemanager.connectedvmware.models.InventoryItemProperties;
import org.junit.jupiter.api.Assertions;

public final class InventoryItemInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InventoryItemInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"inventoryType\":\"InventoryItemProperties\",\"managedResourceId\":\"ezwwv\",\"moRefId\":\"qyuvvfonkp\",\"moName\":\"qyikvy\",\"provisioningState\":\"Failed\"},\"kind\":\"avluwmncs\",\"id\":\"ijf\",\"name\":\"bvpoekrsgsgbdhu\",\"type\":\"qgnjdgkynscli\"}")
                .toObject(InventoryItemInner.class);
        Assertions.assertEquals("ezwwv", model.properties().managedResourceId());
        Assertions.assertEquals("qyuvvfonkp", model.properties().moRefId());
        Assertions.assertEquals("qyikvy", model.properties().moName());
        Assertions.assertEquals("avluwmncs", model.kind());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InventoryItemInner model =
            new InventoryItemInner()
                .withProperties(
                    new InventoryItemProperties()
                        .withManagedResourceId("ezwwv")
                        .withMoRefId("qyuvvfonkp")
                        .withMoName("qyikvy"))
                .withKind("avluwmncs");
        model = BinaryData.fromObject(model).toObject(InventoryItemInner.class);
        Assertions.assertEquals("ezwwv", model.properties().managedResourceId());
        Assertions.assertEquals("qyuvvfonkp", model.properties().moRefId());
        Assertions.assertEquals("qyikvy", model.properties().moName());
        Assertions.assertEquals("avluwmncs", model.kind());
    }
}
