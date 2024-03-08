// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.resourcemover.models.DiscardRequest;
import com.azure.resourcemanager.resourcemover.models.MoveResourceInputType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class DiscardRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DiscardRequest model =
            BinaryData
                .fromString(
                    "{\"validateOnly\":false,\"moveResources\":[\"fizuckyf\",\"hr\",\"idf\"],\"moveResourceInputType\":\"MoveResourceSourceId\"}")
                .toObject(DiscardRequest.class);
        Assertions.assertEquals(false, model.validateOnly());
        Assertions.assertEquals("fizuckyf", model.moveResources().get(0));
        Assertions.assertEquals(MoveResourceInputType.MOVE_RESOURCE_SOURCE_ID, model.moveResourceInputType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DiscardRequest model =
            new DiscardRequest()
                .withValidateOnly(false)
                .withMoveResources(Arrays.asList("fizuckyf", "hr", "idf"))
                .withMoveResourceInputType(MoveResourceInputType.MOVE_RESOURCE_SOURCE_ID);
        model = BinaryData.fromObject(model).toObject(DiscardRequest.class);
        Assertions.assertEquals(false, model.validateOnly());
        Assertions.assertEquals("fizuckyf", model.moveResources().get(0));
        Assertions.assertEquals(MoveResourceInputType.MOVE_RESOURCE_SOURCE_ID, model.moveResourceInputType());
    }
}
