// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.MigrateInputProperties;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.MigrateProviderSpecificInput;

public final class MigrateInputPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MigrateInputProperties model =
            BinaryData
                .fromString("{\"providerSpecificDetails\":{\"instanceType\":\"MigrateProviderSpecificInput\"}}")
                .toObject(MigrateInputProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MigrateInputProperties model =
            new MigrateInputProperties().withProviderSpecificDetails(new MigrateProviderSpecificInput());
        model = BinaryData.fromObject(model).toObject(MigrateInputProperties.class);
    }
}
