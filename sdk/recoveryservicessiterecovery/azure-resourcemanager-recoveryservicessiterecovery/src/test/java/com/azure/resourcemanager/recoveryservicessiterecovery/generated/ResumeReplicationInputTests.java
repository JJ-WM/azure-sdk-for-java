// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ResumeReplicationInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ResumeReplicationInputProperties;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ResumeReplicationProviderSpecificInput;

public final class ResumeReplicationInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResumeReplicationInput model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"providerSpecificDetails\":{\"instanceType\":\"ResumeReplicationProviderSpecificInput\"}}}")
                .toObject(ResumeReplicationInput.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResumeReplicationInput model =
            new ResumeReplicationInput()
                .withProperties(
                    new ResumeReplicationInputProperties()
                        .withProviderSpecificDetails(new ResumeReplicationProviderSpecificInput()));
        model = BinaryData.fromObject(model).toObject(ResumeReplicationInput.class);
    }
}
