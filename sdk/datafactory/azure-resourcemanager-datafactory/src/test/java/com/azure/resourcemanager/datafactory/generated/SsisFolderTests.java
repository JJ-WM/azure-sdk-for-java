// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SsisFolder;
import org.junit.jupiter.api.Assertions;

public final class SsisFolderTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SsisFolder model =
            BinaryData
                .fromString(
                    "{\"type\":\"Folder\",\"id\":273426490491628940,\"name\":\"qpzmodwhqu\",\"description\":\"ochtuxapewzwqlb\"}")
                .toObject(SsisFolder.class);
        Assertions.assertEquals(273426490491628940L, model.id());
        Assertions.assertEquals("qpzmodwhqu", model.name());
        Assertions.assertEquals("ochtuxapewzwqlb", model.description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SsisFolder model =
            new SsisFolder().withId(273426490491628940L).withName("qpzmodwhqu").withDescription("ochtuxapewzwqlb");
        model = BinaryData.fromObject(model).toObject(SsisFolder.class);
        Assertions.assertEquals(273426490491628940L, model.id());
        Assertions.assertEquals("qpzmodwhqu", model.name());
        Assertions.assertEquals("ochtuxapewzwqlb", model.description());
    }
}
