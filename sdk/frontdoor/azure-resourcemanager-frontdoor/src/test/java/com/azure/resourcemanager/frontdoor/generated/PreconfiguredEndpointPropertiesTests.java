// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.frontdoor.fluent.models.PreconfiguredEndpointProperties;
import com.azure.resourcemanager.frontdoor.models.EndpointType;
import org.junit.jupiter.api.Assertions;

public final class PreconfiguredEndpointPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PreconfiguredEndpointProperties model = BinaryData.fromString(
            "{\"description\":\"cluqovekqvgqo\",\"endpoint\":\"ifzmpjwyivqi\",\"endpointType\":\"AzureRegion\",\"backend\":\"vhrfsphuagrt\"}")
            .toObject(PreconfiguredEndpointProperties.class);
        Assertions.assertEquals("cluqovekqvgqo", model.description());
        Assertions.assertEquals("ifzmpjwyivqi", model.endpoint());
        Assertions.assertEquals(EndpointType.AZURE_REGION, model.endpointType());
        Assertions.assertEquals("vhrfsphuagrt", model.backend());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PreconfiguredEndpointProperties model = new PreconfiguredEndpointProperties().withDescription("cluqovekqvgqo")
            .withEndpoint("ifzmpjwyivqi")
            .withEndpointType(EndpointType.AZURE_REGION)
            .withBackend("vhrfsphuagrt");
        model = BinaryData.fromObject(model).toObject(PreconfiguredEndpointProperties.class);
        Assertions.assertEquals("cluqovekqvgqo", model.description());
        Assertions.assertEquals("ifzmpjwyivqi", model.endpoint());
        Assertions.assertEquals(EndpointType.AZURE_REGION, model.endpointType());
        Assertions.assertEquals("vhrfsphuagrt", model.backend());
    }
}
