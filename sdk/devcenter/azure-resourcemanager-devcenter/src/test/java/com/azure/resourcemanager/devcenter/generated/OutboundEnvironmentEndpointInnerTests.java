// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.fluent.models.OutboundEnvironmentEndpointInner;

public final class OutboundEnvironmentEndpointInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OutboundEnvironmentEndpointInner model = BinaryData.fromString(
            "{\"category\":\"qzhzbezkgimsi\",\"endpoints\":[{\"domainName\":\"icddyvvjskgfmocw\",\"description\":\"pqg\",\"endpointDetails\":[{\"port\":184839469},{\"port\":1528539116},{\"port\":1199954406}]}]}")
            .toObject(OutboundEnvironmentEndpointInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OutboundEnvironmentEndpointInner model = new OutboundEnvironmentEndpointInner();
        model = BinaryData.fromObject(model).toObject(OutboundEnvironmentEndpointInner.class);
    }
}
