// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.CreateProtectionContainerMappingInputProperties;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ReplicationProviderSpecificContainerMappingInput;
import org.junit.jupiter.api.Assertions;

public final class CreateProtectionContainerMappingInputPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CreateProtectionContainerMappingInputProperties model =
            BinaryData
                .fromString(
                    "{\"targetProtectionContainerId\":\"qbmfpjbabwidf\",\"policyId\":\"sspuunnoxyhkx\",\"providerSpecificInput\":{\"instanceType\":\"ReplicationProviderSpecificContainerMappingInput\"}}")
                .toObject(CreateProtectionContainerMappingInputProperties.class);
        Assertions.assertEquals("qbmfpjbabwidf", model.targetProtectionContainerId());
        Assertions.assertEquals("sspuunnoxyhkx", model.policyId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CreateProtectionContainerMappingInputProperties model =
            new CreateProtectionContainerMappingInputProperties()
                .withTargetProtectionContainerId("qbmfpjbabwidf")
                .withPolicyId("sspuunnoxyhkx")
                .withProviderSpecificInput(new ReplicationProviderSpecificContainerMappingInput());
        model = BinaryData.fromObject(model).toObject(CreateProtectionContainerMappingInputProperties.class);
        Assertions.assertEquals("qbmfpjbabwidf", model.targetProtectionContainerId());
        Assertions.assertEquals("sspuunnoxyhkx", model.policyId());
    }
}
