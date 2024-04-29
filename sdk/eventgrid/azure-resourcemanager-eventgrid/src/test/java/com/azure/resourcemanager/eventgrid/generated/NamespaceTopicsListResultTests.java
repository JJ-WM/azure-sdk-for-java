// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.fluent.models.NamespaceTopicInner;
import com.azure.resourcemanager.eventgrid.models.EventInputSchema;
import com.azure.resourcemanager.eventgrid.models.NamespaceTopicsListResult;
import com.azure.resourcemanager.eventgrid.models.PublisherType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class NamespaceTopicsListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NamespaceTopicsListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"provisioningState\":\"Deleted\",\"publisherType\":\"Custom\",\"inputSchema\":\"CloudEventSchemaV1_0\",\"eventRetentionInDays\":1694439284},\"id\":\"y\",\"name\":\"vpo\",\"type\":\"krsgsgb\"},{\"properties\":{\"provisioningState\":\"Deleted\",\"publisherType\":\"Custom\",\"inputSchema\":\"CloudEventSchemaV1_0\",\"eventRetentionInDays\":308026039},\"id\":\"ynscl\",\"name\":\"qhzvhxnkomt\",\"type\":\"u\"}],\"nextLink\":\"tppn\"}")
            .toObject(NamespaceTopicsListResult.class);
        Assertions.assertEquals(PublisherType.CUSTOM, model.value().get(0).publisherType());
        Assertions.assertEquals(EventInputSchema.CLOUD_EVENT_SCHEMA_V1_0, model.value().get(0).inputSchema());
        Assertions.assertEquals(1694439284, model.value().get(0).eventRetentionInDays());
        Assertions.assertEquals("tppn", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NamespaceTopicsListResult model = new NamespaceTopicsListResult().withValue(Arrays.asList(
            new NamespaceTopicInner().withPublisherType(PublisherType.CUSTOM)
                .withInputSchema(EventInputSchema.CLOUD_EVENT_SCHEMA_V1_0)
                .withEventRetentionInDays(1694439284),
            new NamespaceTopicInner().withPublisherType(PublisherType.CUSTOM)
                .withInputSchema(EventInputSchema.CLOUD_EVENT_SCHEMA_V1_0)
                .withEventRetentionInDays(308026039)))
            .withNextLink("tppn");
        model = BinaryData.fromObject(model).toObject(NamespaceTopicsListResult.class);
        Assertions.assertEquals(PublisherType.CUSTOM, model.value().get(0).publisherType());
        Assertions.assertEquals(EventInputSchema.CLOUD_EVENT_SCHEMA_V1_0, model.value().get(0).inputSchema());
        Assertions.assertEquals(1694439284, model.value().get(0).eventRetentionInDays());
        Assertions.assertEquals("tppn", model.nextLink());
    }
}
