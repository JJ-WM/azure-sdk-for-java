// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcompute.models.CloudMetadata;

public final class CloudMetadataTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CloudMetadata model = BinaryData.fromString("{\"provider\":\"tymw\"}").toObject(CloudMetadata.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CloudMetadata model = new CloudMetadata();
        model = BinaryData.fromObject(model).toObject(CloudMetadata.class);
    }
}
