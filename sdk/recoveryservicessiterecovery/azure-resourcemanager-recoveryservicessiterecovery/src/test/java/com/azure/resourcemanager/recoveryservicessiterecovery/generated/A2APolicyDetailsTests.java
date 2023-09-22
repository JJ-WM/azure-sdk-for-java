// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.A2APolicyDetails;
import org.junit.jupiter.api.Assertions;

public final class A2APolicyDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        A2APolicyDetails model =
            BinaryData
                .fromString(
                    "{\"instanceType\":\"A2A\",\"recoveryPointThresholdInMinutes\":1604436828,\"recoveryPointHistory\":1284284541,\"appConsistentFrequencyInMinutes\":409182858,\"multiVmSyncStatus\":\"qi\",\"crashConsistentFrequencyInMinutes\":1105579119}")
                .toObject(A2APolicyDetails.class);
        Assertions.assertEquals(1604436828, model.recoveryPointThresholdInMinutes());
        Assertions.assertEquals(1284284541, model.recoveryPointHistory());
        Assertions.assertEquals(409182858, model.appConsistentFrequencyInMinutes());
        Assertions.assertEquals("qi", model.multiVmSyncStatus());
        Assertions.assertEquals(1105579119, model.crashConsistentFrequencyInMinutes());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        A2APolicyDetails model =
            new A2APolicyDetails()
                .withRecoveryPointThresholdInMinutes(1604436828)
                .withRecoveryPointHistory(1284284541)
                .withAppConsistentFrequencyInMinutes(409182858)
                .withMultiVmSyncStatus("qi")
                .withCrashConsistentFrequencyInMinutes(1105579119);
        model = BinaryData.fromObject(model).toObject(A2APolicyDetails.class);
        Assertions.assertEquals(1604436828, model.recoveryPointThresholdInMinutes());
        Assertions.assertEquals(1284284541, model.recoveryPointHistory());
        Assertions.assertEquals(409182858, model.appConsistentFrequencyInMinutes());
        Assertions.assertEquals("qi", model.multiVmSyncStatus());
        Assertions.assertEquals(1105579119, model.crashConsistentFrequencyInMinutes());
    }
}
