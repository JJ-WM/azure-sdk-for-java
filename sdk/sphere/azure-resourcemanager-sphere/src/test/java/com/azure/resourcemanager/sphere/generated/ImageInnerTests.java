// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sphere.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.sphere.fluent.models.ImageInner;
import com.azure.resourcemanager.sphere.models.RegionalDataBoundary;
import org.junit.jupiter.api.Assertions;

public final class ImageInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ImageInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"image\":\"mbe\",\"imageId\":\"pbhtqqrolfpfpsa\",\"imageName\":\"bquxigjy\",\"regionalDataBoundary\":\"EU\",\"uri\":\"aoyfhrtxilnerkuj\",\"description\":\"vlejuvfqa\",\"componentId\":\"lyxwjkcprbnwbx\",\"imageType\":\"OneBl\",\"provisioningState\":\"Provisioning\"},\"id\":\"vpys\",\"name\":\"zdn\",\"type\":\"uj\"}")
                .toObject(ImageInner.class);
        Assertions.assertEquals("mbe", model.image());
        Assertions.assertEquals("pbhtqqrolfpfpsa", model.imageId());
        Assertions.assertEquals(RegionalDataBoundary.EU, model.regionalDataBoundary());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ImageInner model =
            new ImageInner()
                .withImage("mbe")
                .withImageId("pbhtqqrolfpfpsa")
                .withRegionalDataBoundary(RegionalDataBoundary.EU);
        model = BinaryData.fromObject(model).toObject(ImageInner.class);
        Assertions.assertEquals("mbe", model.image());
        Assertions.assertEquals("pbhtqqrolfpfpsa", model.imageId());
        Assertions.assertEquals(RegionalDataBoundary.EU, model.regionalDataBoundary());
    }
}
