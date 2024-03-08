// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.models.TopicsConfiguration;

public final class TopicsConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TopicsConfiguration model
            = BinaryData.fromString("{\"hostname\":\"vtylbfpncu\"}").toObject(TopicsConfiguration.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TopicsConfiguration model = new TopicsConfiguration();
        model = BinaryData.fromObject(model).toObject(TopicsConfiguration.class);
    }
}
