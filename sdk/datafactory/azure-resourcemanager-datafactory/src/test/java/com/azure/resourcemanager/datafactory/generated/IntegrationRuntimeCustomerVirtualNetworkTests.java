// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeCustomerVirtualNetwork;
import org.junit.jupiter.api.Assertions;

public final class IntegrationRuntimeCustomerVirtualNetworkTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IntegrationRuntimeCustomerVirtualNetwork model
            = BinaryData.fromString("{\"subnetId\":\"ndyv\"}").toObject(IntegrationRuntimeCustomerVirtualNetwork.class);
        Assertions.assertEquals("ndyv", model.subnetId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IntegrationRuntimeCustomerVirtualNetwork model
            = new IntegrationRuntimeCustomerVirtualNetwork().withSubnetId("ndyv");
        model = BinaryData.fromObject(model).toObject(IntegrationRuntimeCustomerVirtualNetwork.class);
        Assertions.assertEquals("ndyv", model.subnetId());
    }
}
