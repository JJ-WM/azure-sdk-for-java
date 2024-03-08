// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.UpdateMobilityServiceRequest;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.UpdateMobilityServiceRequestProperties;
import org.junit.jupiter.api.Assertions;

public final class UpdateMobilityServiceRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UpdateMobilityServiceRequest model
            = BinaryData.fromString("{\"properties\":{\"runAsAccountId\":\"bdyhgkfminsgowz\"}}")
                .toObject(UpdateMobilityServiceRequest.class);
        Assertions.assertEquals("bdyhgkfminsgowz", model.properties().runAsAccountId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UpdateMobilityServiceRequest model = new UpdateMobilityServiceRequest()
            .withProperties(new UpdateMobilityServiceRequestProperties().withRunAsAccountId("bdyhgkfminsgowz"));
        model = BinaryData.fromObject(model).toObject(UpdateMobilityServiceRequest.class);
        Assertions.assertEquals("bdyhgkfminsgowz", model.properties().runAsAccountId());
    }
}
