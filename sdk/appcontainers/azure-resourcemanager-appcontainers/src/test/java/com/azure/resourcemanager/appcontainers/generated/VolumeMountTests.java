// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.VolumeMount;
import org.junit.jupiter.api.Assertions;

public final class VolumeMountTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VolumeMount model
            = BinaryData.fromString("{\"volumeName\":\"mc\",\"mountPath\":\"hixbjxyfwnyl\",\"subPath\":\"ool\"}")
                .toObject(VolumeMount.class);
        Assertions.assertEquals("mc", model.volumeName());
        Assertions.assertEquals("hixbjxyfwnyl", model.mountPath());
        Assertions.assertEquals("ool", model.subPath());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VolumeMount model = new VolumeMount().withVolumeName("mc").withMountPath("hixbjxyfwnyl").withSubPath("ool");
        model = BinaryData.fromObject(model).toObject(VolumeMount.class);
        Assertions.assertEquals("mc", model.volumeName());
        Assertions.assertEquals("hixbjxyfwnyl", model.mountPath());
        Assertions.assertEquals("ool", model.subPath());
    }
}
