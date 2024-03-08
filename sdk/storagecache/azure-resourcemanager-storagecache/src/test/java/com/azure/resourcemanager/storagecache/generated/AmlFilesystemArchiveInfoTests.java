// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storagecache.models.AmlFilesystemArchiveInfo;
import org.junit.jupiter.api.Assertions;

public final class AmlFilesystemArchiveInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AmlFilesystemArchiveInfo model
            = BinaryData.fromString("{\"filesystemPath\":\"kocrcjdkwtnhx\"}").toObject(AmlFilesystemArchiveInfo.class);
        Assertions.assertEquals("kocrcjdkwtnhx", model.filesystemPath());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AmlFilesystemArchiveInfo model = new AmlFilesystemArchiveInfo().withFilesystemPath("kocrcjdkwtnhx");
        model = BinaryData.fromObject(model).toObject(AmlFilesystemArchiveInfo.class);
        Assertions.assertEquals("kocrcjdkwtnhx", model.filesystemPath());
    }
}
