// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.ResourceMoveDetails;
import org.junit.jupiter.api.Assertions;

public final class ResourceMoveDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceMoveDetails model =
            BinaryData
                .fromString(
                    "{\"operationId\":\"fxxypininmayhuy\",\"startTimeUtc\":\"kpode\",\"completionTimeUtc\":\"oginuvamiheognar\",\"sourceResourcePath\":\"xth\",\"targetResourcePath\":\"tusivyevcciqihn\"}")
                .toObject(ResourceMoveDetails.class);
        Assertions.assertEquals("fxxypininmayhuy", model.operationId());
        Assertions.assertEquals("kpode", model.startTimeUtc());
        Assertions.assertEquals("oginuvamiheognar", model.completionTimeUtc());
        Assertions.assertEquals("xth", model.sourceResourcePath());
        Assertions.assertEquals("tusivyevcciqihn", model.targetResourcePath());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResourceMoveDetails model =
            new ResourceMoveDetails()
                .withOperationId("fxxypininmayhuy")
                .withStartTimeUtc("kpode")
                .withCompletionTimeUtc("oginuvamiheognar")
                .withSourceResourcePath("xth")
                .withTargetResourcePath("tusivyevcciqihn");
        model = BinaryData.fromObject(model).toObject(ResourceMoveDetails.class);
        Assertions.assertEquals("fxxypininmayhuy", model.operationId());
        Assertions.assertEquals("kpode", model.startTimeUtc());
        Assertions.assertEquals("oginuvamiheognar", model.completionTimeUtc());
        Assertions.assertEquals("xth", model.sourceResourcePath());
        Assertions.assertEquals("tusivyevcciqihn", model.targetResourcePath());
    }
}
