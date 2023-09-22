// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.InMagePolicyDetails;
import org.junit.jupiter.api.Assertions;

public final class InMagePolicyDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InMagePolicyDetails model =
            BinaryData
                .fromString(
                    "{\"instanceType\":\"InMage\",\"recoveryPointThresholdInMinutes\":841361482,\"recoveryPointHistory\":1070639613,\"appConsistentFrequencyInMinutes\":977949832,\"multiVmSyncStatus\":\"ac\"}")
                .toObject(InMagePolicyDetails.class);
        Assertions.assertEquals(841361482, model.recoveryPointThresholdInMinutes());
        Assertions.assertEquals(1070639613, model.recoveryPointHistory());
        Assertions.assertEquals(977949832, model.appConsistentFrequencyInMinutes());
        Assertions.assertEquals("ac", model.multiVmSyncStatus());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InMagePolicyDetails model =
            new InMagePolicyDetails()
                .withRecoveryPointThresholdInMinutes(841361482)
                .withRecoveryPointHistory(1070639613)
                .withAppConsistentFrequencyInMinutes(977949832)
                .withMultiVmSyncStatus("ac");
        model = BinaryData.fromObject(model).toObject(InMagePolicyDetails.class);
        Assertions.assertEquals(841361482, model.recoveryPointThresholdInMinutes());
        Assertions.assertEquals(1070639613, model.recoveryPointHistory());
        Assertions.assertEquals(977949832, model.appConsistentFrequencyInMinutes());
        Assertions.assertEquals("ac", model.multiVmSyncStatus());
    }
}
