// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.UpdateIntegrationRuntimeNodeRequest;
import org.junit.jupiter.api.Assertions;

public final class UpdateIntegrationRuntimeNodeRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UpdateIntegrationRuntimeNodeRequest model =
            BinaryData
                .fromString("{\"concurrentJobsLimit\":712721872}")
                .toObject(UpdateIntegrationRuntimeNodeRequest.class);
        Assertions.assertEquals(712721872, model.concurrentJobsLimit());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UpdateIntegrationRuntimeNodeRequest model =
            new UpdateIntegrationRuntimeNodeRequest().withConcurrentJobsLimit(712721872);
        model = BinaryData.fromObject(model).toObject(UpdateIntegrationRuntimeNodeRequest.class);
        Assertions.assertEquals(712721872, model.concurrentJobsLimit());
    }
}
