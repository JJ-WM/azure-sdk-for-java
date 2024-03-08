// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.fluent.models.ClientGroupProperties;
import org.junit.jupiter.api.Assertions;

public final class ClientGroupPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClientGroupProperties model
            = BinaryData.fromString("{\"description\":\"mqc\",\"query\":\"q\",\"provisioningState\":\"Succeeded\"}")
                .toObject(ClientGroupProperties.class);
        Assertions.assertEquals("mqc", model.description());
        Assertions.assertEquals("q", model.query());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClientGroupProperties model = new ClientGroupProperties().withDescription("mqc").withQuery("q");
        model = BinaryData.fromObject(model).toObject(ClientGroupProperties.class);
        Assertions.assertEquals("mqc", model.description());
        Assertions.assertEquals("q", model.query());
    }
}
