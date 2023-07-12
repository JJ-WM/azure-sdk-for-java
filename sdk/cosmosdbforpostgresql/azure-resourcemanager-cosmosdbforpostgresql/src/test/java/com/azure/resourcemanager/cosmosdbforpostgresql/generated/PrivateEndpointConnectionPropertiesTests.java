// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmosdbforpostgresql.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.cosmosdbforpostgresql.fluent.models.PrivateEndpointConnectionProperties;
import com.azure.resourcemanager.cosmosdbforpostgresql.models.PrivateEndpoint;
import com.azure.resourcemanager.cosmosdbforpostgresql.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.cosmosdbforpostgresql.models.PrivateLinkServiceConnectionState;
import org.junit.jupiter.api.Assertions;

public final class PrivateEndpointConnectionPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateEndpointConnectionProperties model =
            BinaryData
                .fromString(
                    "{\"groupIds\":[\"exxbczwtr\",\"wiqzbqjvsovmyo\",\"acspkwl\"],\"privateEndpoint\":{\"id\":\"obpxjmflbvvn\"},\"privateLinkServiceConnectionState\":{\"status\":\"Rejected\",\"description\":\"cciw\",\"actionsRequired\":\"juqk\"},\"provisioningState\":\"Succeeded\"}")
                .toObject(PrivateEndpointConnectionProperties.class);
        Assertions
            .assertEquals(
                PrivateEndpointServiceConnectionStatus.REJECTED, model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("cciw", model.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("juqk", model.privateLinkServiceConnectionState().actionsRequired());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateEndpointConnectionProperties model =
            new PrivateEndpointConnectionProperties()
                .withPrivateEndpoint(new PrivateEndpoint())
                .withPrivateLinkServiceConnectionState(
                    new PrivateLinkServiceConnectionState()
                        .withStatus(PrivateEndpointServiceConnectionStatus.REJECTED)
                        .withDescription("cciw")
                        .withActionsRequired("juqk"));
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionProperties.class);
        Assertions
            .assertEquals(
                PrivateEndpointServiceConnectionStatus.REJECTED, model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("cciw", model.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("juqk", model.privateLinkServiceConnectionState().actionsRequired());
    }
}
