// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.PatchDetailsNewLayer;
import org.junit.jupiter.api.Assertions;

public final class PatchDetailsNewLayerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PatchDetailsNewLayer model = BinaryData
            .fromString(
                "{\"name\":\"xkbsazgakgac\",\"frameworkAndVersion\":\"cmjdmspof\",\"osAndVersion\":\"vuhrylni\"}")
            .toObject(PatchDetailsNewLayer.class);
        Assertions.assertEquals("xkbsazgakgac", model.name());
        Assertions.assertEquals("cmjdmspof", model.frameworkAndVersion());
        Assertions.assertEquals("vuhrylni", model.osAndVersion());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PatchDetailsNewLayer model = new PatchDetailsNewLayer().withName("xkbsazgakgac")
            .withFrameworkAndVersion("cmjdmspof")
            .withOsAndVersion("vuhrylni");
        model = BinaryData.fromObject(model).toObject(PatchDetailsNewLayer.class);
        Assertions.assertEquals("xkbsazgakgac", model.name());
        Assertions.assertEquals("cmjdmspof", model.frameworkAndVersion());
        Assertions.assertEquals("vuhrylni", model.osAndVersion());
    }
}
