// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.fluent.models.SystemTopicProperties;
import org.junit.jupiter.api.Assertions;

public final class SystemTopicPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SystemTopicProperties model = BinaryData.fromString(
            "{\"provisioningState\":\"Updating\",\"source\":\"eblydyv\",\"topicType\":\"kmrocxne\",\"metricResourceId\":\"sm\"}")
            .toObject(SystemTopicProperties.class);
        Assertions.assertEquals("eblydyv", model.source());
        Assertions.assertEquals("kmrocxne", model.topicType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SystemTopicProperties model = new SystemTopicProperties().withSource("eblydyv").withTopicType("kmrocxne");
        model = BinaryData.fromObject(model).toObject(SystemTopicProperties.class);
        Assertions.assertEquals("eblydyv", model.source());
        Assertions.assertEquals("kmrocxne", model.topicType());
    }
}
