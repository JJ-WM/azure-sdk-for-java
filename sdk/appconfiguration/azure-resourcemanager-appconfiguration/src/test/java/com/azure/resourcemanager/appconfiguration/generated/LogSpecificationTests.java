// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appconfiguration.models.LogSpecification;
import org.junit.jupiter.api.Assertions;

public final class LogSpecificationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LogSpecification model =
            BinaryData
                .fromString("{\"name\":\"jj\",\"displayName\":\"v\",\"blobDuration\":\"dgwdslfhot\"}")
                .toObject(LogSpecification.class);
        Assertions.assertEquals("jj", model.name());
        Assertions.assertEquals("v", model.displayName());
        Assertions.assertEquals("dgwdslfhot", model.blobDuration());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LogSpecification model =
            new LogSpecification().withName("jj").withDisplayName("v").withBlobDuration("dgwdslfhot");
        model = BinaryData.fromObject(model).toObject(LogSpecification.class);
        Assertions.assertEquals("jj", model.name());
        Assertions.assertEquals("v", model.displayName());
        Assertions.assertEquals("dgwdslfhot", model.blobDuration());
    }
}
