// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apicenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apicenter.models.ServiceUpdate;

public final class ServiceUpdateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ServiceUpdate model =
            BinaryData.fromString("{\"properties\":{\"provisioningState\":\"Failed\"}}").toObject(ServiceUpdate.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ServiceUpdate model = new ServiceUpdate();
        model = BinaryData.fromObject(model).toObject(ServiceUpdate.class);
    }
}
