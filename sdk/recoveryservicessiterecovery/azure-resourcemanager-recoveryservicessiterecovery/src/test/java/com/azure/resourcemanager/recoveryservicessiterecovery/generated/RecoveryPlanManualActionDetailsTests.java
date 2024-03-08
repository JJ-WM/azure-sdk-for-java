// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RecoveryPlanManualActionDetails;
import org.junit.jupiter.api.Assertions;

public final class RecoveryPlanManualActionDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RecoveryPlanManualActionDetails model
            = BinaryData.fromString("{\"instanceType\":\"ManualActionDetails\",\"description\":\"imcwqxynqjgsa\"}")
                .toObject(RecoveryPlanManualActionDetails.class);
        Assertions.assertEquals("imcwqxynqjgsa", model.description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RecoveryPlanManualActionDetails model = new RecoveryPlanManualActionDetails().withDescription("imcwqxynqjgsa");
        model = BinaryData.fromObject(model).toObject(RecoveryPlanManualActionDetails.class);
        Assertions.assertEquals("imcwqxynqjgsa", model.description());
    }
}
