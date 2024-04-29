// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.healthcareapis.models.PrivateEndpoint;
import com.azure.resourcemanager.healthcareapis.models.PrivateEndpointConnection;
import com.azure.resourcemanager.healthcareapis.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.healthcareapis.models.PrivateLinkServiceConnectionState;
import org.junit.jupiter.api.Assertions;

public final class PrivateEndpointConnectionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateEndpointConnection model = BinaryData.fromString(
            "{\"properties\":{\"privateEndpoint\":{\"id\":\"cmpoyfdkfogkny\"},\"privateLinkServiceConnectionState\":{\"status\":\"Rejected\",\"description\":\"jddeqsrdeupewnw\",\"actionsRequired\":\"itjz\"},\"provisioningState\":\"Creating\"},\"id\":\"usarhmofc\",\"name\":\"hs\",\"type\":\"yurkdtmlxhekuksj\"}")
            .toObject(PrivateEndpointConnection.class);
        Assertions.assertEquals(PrivateEndpointServiceConnectionStatus.REJECTED,
            model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("jddeqsrdeupewnw", model.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("itjz", model.privateLinkServiceConnectionState().actionsRequired());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateEndpointConnection model = new PrivateEndpointConnection().withPrivateEndpoint(new PrivateEndpoint())
            .withPrivateLinkServiceConnectionState(
                new PrivateLinkServiceConnectionState().withStatus(PrivateEndpointServiceConnectionStatus.REJECTED)
                    .withDescription("jddeqsrdeupewnw")
                    .withActionsRequired("itjz"));
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnection.class);
        Assertions.assertEquals(PrivateEndpointServiceConnectionStatus.REJECTED,
            model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("jddeqsrdeupewnw", model.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("itjz", model.privateLinkServiceConnectionState().actionsRequired());
    }
}
