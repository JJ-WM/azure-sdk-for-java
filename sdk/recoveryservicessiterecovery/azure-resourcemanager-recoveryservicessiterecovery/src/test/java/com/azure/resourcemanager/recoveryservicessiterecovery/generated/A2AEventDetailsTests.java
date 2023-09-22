// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.A2AEventDetails;
import org.junit.jupiter.api.Assertions;

public final class A2AEventDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        A2AEventDetails model =
            BinaryData
                .fromString(
                    "{\"instanceType\":\"A2A\",\"protectedItemName\":\"skndnelqkaadlknw\",\"fabricObjectId\":\"anniyopetxivcnr\",\"fabricName\":\"xnucaephblkwqp\",\"fabricLocation\":\"vbqsdt\",\"remoteFabricName\":\"bctvivuzqym\",\"remoteFabricLocation\":\"owog\"}")
                .toObject(A2AEventDetails.class);
        Assertions.assertEquals("skndnelqkaadlknw", model.protectedItemName());
        Assertions.assertEquals("anniyopetxivcnr", model.fabricObjectId());
        Assertions.assertEquals("xnucaephblkwqp", model.fabricName());
        Assertions.assertEquals("vbqsdt", model.fabricLocation());
        Assertions.assertEquals("bctvivuzqym", model.remoteFabricName());
        Assertions.assertEquals("owog", model.remoteFabricLocation());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        A2AEventDetails model =
            new A2AEventDetails()
                .withProtectedItemName("skndnelqkaadlknw")
                .withFabricObjectId("anniyopetxivcnr")
                .withFabricName("xnucaephblkwqp")
                .withFabricLocation("vbqsdt")
                .withRemoteFabricName("bctvivuzqym")
                .withRemoteFabricLocation("owog");
        model = BinaryData.fromObject(model).toObject(A2AEventDetails.class);
        Assertions.assertEquals("skndnelqkaadlknw", model.protectedItemName());
        Assertions.assertEquals("anniyopetxivcnr", model.fabricObjectId());
        Assertions.assertEquals("xnucaephblkwqp", model.fabricName());
        Assertions.assertEquals("vbqsdt", model.fabricLocation());
        Assertions.assertEquals("bctvivuzqym", model.remoteFabricName());
        Assertions.assertEquals("owog", model.remoteFabricLocation());
    }
}
