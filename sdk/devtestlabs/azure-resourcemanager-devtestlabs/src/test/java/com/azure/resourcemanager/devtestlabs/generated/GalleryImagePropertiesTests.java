// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devtestlabs.fluent.models.GalleryImageProperties;
import com.azure.resourcemanager.devtestlabs.models.GalleryImageReference;
import org.junit.jupiter.api.Assertions;

public final class GalleryImagePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GalleryImageProperties model =
            BinaryData
                .fromString(
                    "{\"author\":\"btx\",\"createdDate\":\"2021-01-25T07:52:30Z\",\"description\":\"wsrt\",\"imageReference\":{\"offer\":\"oezbrhubsk\",\"publisher\":\"dyg\",\"sku\":\"okkqfqjbvleo\",\"osType\":\"ml\",\"version\":\"qtqzfavyv\"},\"icon\":\"qybaryeua\",\"enabled\":false,\"planId\":\"abqgzslesjcbh\",\"isPlanAuthorized\":false}")
                .toObject(GalleryImageProperties.class);
        Assertions.assertEquals("btx", model.author());
        Assertions.assertEquals("wsrt", model.description());
        Assertions.assertEquals("oezbrhubsk", model.imageReference().offer());
        Assertions.assertEquals("dyg", model.imageReference().publisher());
        Assertions.assertEquals("okkqfqjbvleo", model.imageReference().sku());
        Assertions.assertEquals("ml", model.imageReference().osType());
        Assertions.assertEquals("qtqzfavyv", model.imageReference().version());
        Assertions.assertEquals("qybaryeua", model.icon());
        Assertions.assertEquals(false, model.enabled());
        Assertions.assertEquals("abqgzslesjcbh", model.planId());
        Assertions.assertEquals(false, model.isPlanAuthorized());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GalleryImageProperties model =
            new GalleryImageProperties()
                .withAuthor("btx")
                .withDescription("wsrt")
                .withImageReference(
                    new GalleryImageReference()
                        .withOffer("oezbrhubsk")
                        .withPublisher("dyg")
                        .withSku("okkqfqjbvleo")
                        .withOsType("ml")
                        .withVersion("qtqzfavyv"))
                .withIcon("qybaryeua")
                .withEnabled(false)
                .withPlanId("abqgzslesjcbh")
                .withIsPlanAuthorized(false);
        model = BinaryData.fromObject(model).toObject(GalleryImageProperties.class);
        Assertions.assertEquals("btx", model.author());
        Assertions.assertEquals("wsrt", model.description());
        Assertions.assertEquals("oezbrhubsk", model.imageReference().offer());
        Assertions.assertEquals("dyg", model.imageReference().publisher());
        Assertions.assertEquals("okkqfqjbvleo", model.imageReference().sku());
        Assertions.assertEquals("ml", model.imageReference().osType());
        Assertions.assertEquals("qtqzfavyv", model.imageReference().version());
        Assertions.assertEquals("qybaryeua", model.icon());
        Assertions.assertEquals(false, model.enabled());
        Assertions.assertEquals("abqgzslesjcbh", model.planId());
        Assertions.assertEquals(false, model.isPlanAuthorized());
    }
}
