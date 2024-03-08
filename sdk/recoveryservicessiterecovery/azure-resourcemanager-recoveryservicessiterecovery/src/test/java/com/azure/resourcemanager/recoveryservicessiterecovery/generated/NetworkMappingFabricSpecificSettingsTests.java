// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.NetworkMappingFabricSpecificSettings;

public final class NetworkMappingFabricSpecificSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NetworkMappingFabricSpecificSettings model
            = BinaryData.fromString("{\"instanceType\":\"NetworkMappingFabricSpecificSettings\"}")
                .toObject(NetworkMappingFabricSpecificSettings.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NetworkMappingFabricSpecificSettings model = new NetworkMappingFabricSpecificSettings();
        model = BinaryData.fromObject(model).toObject(NetworkMappingFabricSpecificSettings.class);
    }
}
