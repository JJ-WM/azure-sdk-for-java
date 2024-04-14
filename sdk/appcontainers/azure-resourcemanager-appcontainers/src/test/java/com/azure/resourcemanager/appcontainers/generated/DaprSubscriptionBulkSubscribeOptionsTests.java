// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.DaprSubscriptionBulkSubscribeOptions;
import org.junit.jupiter.api.Assertions;

public final class DaprSubscriptionBulkSubscribeOptionsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DaprSubscriptionBulkSubscribeOptions model = BinaryData
            .fromString("{\"enabled\":false,\"maxMessagesCount\":2076319922,\"maxAwaitDurationMs\":1797276638}")
            .toObject(DaprSubscriptionBulkSubscribeOptions.class);
        Assertions.assertEquals(false, model.enabled());
        Assertions.assertEquals(2076319922, model.maxMessagesCount());
        Assertions.assertEquals(1797276638, model.maxAwaitDurationMs());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DaprSubscriptionBulkSubscribeOptions model = new DaprSubscriptionBulkSubscribeOptions().withEnabled(false)
            .withMaxMessagesCount(2076319922).withMaxAwaitDurationMs(1797276638);
        model = BinaryData.fromObject(model).toObject(DaprSubscriptionBulkSubscribeOptions.class);
        Assertions.assertEquals(false, model.enabled());
        Assertions.assertEquals(2076319922, model.maxMessagesCount());
        Assertions.assertEquals(1797276638, model.maxAwaitDurationMs());
    }
}
