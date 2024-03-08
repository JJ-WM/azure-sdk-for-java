// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.resourcemover.models.Display;
import org.junit.jupiter.api.Assertions;

public final class DisplayTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Display model =
            BinaryData
                .fromString(
                    "{\"provider\":\"hzdobpxjmflbvvnc\",\"resource\":\"kcciwwzjuqkhr\",\"operation\":\"jiwkuofoskghsau\",\"description\":\"mjmvxieduugidyjr\"}")
                .toObject(Display.class);
        Assertions.assertEquals("hzdobpxjmflbvvnc", model.provider());
        Assertions.assertEquals("kcciwwzjuqkhr", model.resource());
        Assertions.assertEquals("jiwkuofoskghsau", model.operation());
        Assertions.assertEquals("mjmvxieduugidyjr", model.description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Display model =
            new Display()
                .withProvider("hzdobpxjmflbvvnc")
                .withResource("kcciwwzjuqkhr")
                .withOperation("jiwkuofoskghsau")
                .withDescription("mjmvxieduugidyjr");
        model = BinaryData.fromObject(model).toObject(Display.class);
        Assertions.assertEquals("hzdobpxjmflbvvnc", model.provider());
        Assertions.assertEquals("kcciwwzjuqkhr", model.resource());
        Assertions.assertEquals("jiwkuofoskghsau", model.operation());
        Assertions.assertEquals("mjmvxieduugidyjr", model.description());
    }
}
