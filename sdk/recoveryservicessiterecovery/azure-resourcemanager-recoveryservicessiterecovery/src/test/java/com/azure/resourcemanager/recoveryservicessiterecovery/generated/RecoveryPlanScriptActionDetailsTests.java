// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RecoveryPlanActionLocation;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RecoveryPlanScriptActionDetails;
import org.junit.jupiter.api.Assertions;

public final class RecoveryPlanScriptActionDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RecoveryPlanScriptActionDetails model =
            BinaryData
                .fromString(
                    "{\"instanceType\":\"ScriptActionDetails\",\"path\":\"kyvscbgngcrus\",\"timeout\":\"ircpgcvsvkk\",\"fabricLocation\":\"Recovery\"}")
                .toObject(RecoveryPlanScriptActionDetails.class);
        Assertions.assertEquals("kyvscbgngcrus", model.path());
        Assertions.assertEquals("ircpgcvsvkk", model.timeout());
        Assertions.assertEquals(RecoveryPlanActionLocation.RECOVERY, model.fabricLocation());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RecoveryPlanScriptActionDetails model =
            new RecoveryPlanScriptActionDetails()
                .withPath("kyvscbgngcrus")
                .withTimeout("ircpgcvsvkk")
                .withFabricLocation(RecoveryPlanActionLocation.RECOVERY);
        model = BinaryData.fromObject(model).toObject(RecoveryPlanScriptActionDetails.class);
        Assertions.assertEquals("kyvscbgngcrus", model.path());
        Assertions.assertEquals("ircpgcvsvkk", model.timeout());
        Assertions.assertEquals(RecoveryPlanActionLocation.RECOVERY, model.fabricLocation());
    }
}
