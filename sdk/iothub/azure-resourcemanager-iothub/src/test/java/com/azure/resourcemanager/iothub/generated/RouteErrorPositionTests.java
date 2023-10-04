// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.iothub.models.RouteErrorPosition;
import org.junit.jupiter.api.Assertions;

public final class RouteErrorPositionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RouteErrorPosition model =
            BinaryData.fromString("{\"line\":478734436,\"column\":829612504}").toObject(RouteErrorPosition.class);
        Assertions.assertEquals(478734436, model.line());
        Assertions.assertEquals(829612504, model.column());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RouteErrorPosition model = new RouteErrorPosition().withLine(478734436).withColumn(829612504);
        model = BinaryData.fromObject(model).toObject(RouteErrorPosition.class);
        Assertions.assertEquals(478734436, model.line());
        Assertions.assertEquals(829612504, model.column());
    }
}
