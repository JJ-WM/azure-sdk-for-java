// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.A2APolicyCreationInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.SetMultiVmSyncStatus;
import org.junit.jupiter.api.Assertions;

public final class A2APolicyCreationInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        A2APolicyCreationInput model = BinaryData.fromString(
            "{\"instanceType\":\"A2A\",\"recoveryPointHistory\":723936709,\"crashConsistentFrequencyInMinutes\":1450165650,\"appConsistentFrequencyInMinutes\":1593194036,\"multiVmSyncStatus\":\"Disable\"}")
            .toObject(A2APolicyCreationInput.class);
        Assertions.assertEquals(723936709, model.recoveryPointHistory());
        Assertions.assertEquals(1450165650, model.crashConsistentFrequencyInMinutes());
        Assertions.assertEquals(1593194036, model.appConsistentFrequencyInMinutes());
        Assertions.assertEquals(SetMultiVmSyncStatus.DISABLE, model.multiVmSyncStatus());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        A2APolicyCreationInput model = new A2APolicyCreationInput().withRecoveryPointHistory(723936709)
            .withCrashConsistentFrequencyInMinutes(1450165650).withAppConsistentFrequencyInMinutes(1593194036)
            .withMultiVmSyncStatus(SetMultiVmSyncStatus.DISABLE);
        model = BinaryData.fromObject(model).toObject(A2APolicyCreationInput.class);
        Assertions.assertEquals(723936709, model.recoveryPointHistory());
        Assertions.assertEquals(1450165650, model.crashConsistentFrequencyInMinutes());
        Assertions.assertEquals(1593194036, model.appConsistentFrequencyInMinutes());
        Assertions.assertEquals(SetMultiVmSyncStatus.DISABLE, model.multiVmSyncStatus());
    }
}
