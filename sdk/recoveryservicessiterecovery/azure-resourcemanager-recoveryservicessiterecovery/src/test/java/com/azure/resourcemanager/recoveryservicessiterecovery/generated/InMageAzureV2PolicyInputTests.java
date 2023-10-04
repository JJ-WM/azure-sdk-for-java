// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.InMageAzureV2PolicyInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.SetMultiVmSyncStatus;
import org.junit.jupiter.api.Assertions;

public final class InMageAzureV2PolicyInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InMageAzureV2PolicyInput model =
            BinaryData
                .fromString(
                    "{\"instanceType\":\"InMageAzureV2\",\"recoveryPointThresholdInMinutes\":1444761559,\"recoveryPointHistory\":2116742025,\"crashConsistentFrequencyInMinutes\":852718126,\"appConsistentFrequencyInMinutes\":1922243610,\"multiVmSyncStatus\":\"Enable\"}")
                .toObject(InMageAzureV2PolicyInput.class);
        Assertions.assertEquals(1444761559, model.recoveryPointThresholdInMinutes());
        Assertions.assertEquals(2116742025, model.recoveryPointHistory());
        Assertions.assertEquals(852718126, model.crashConsistentFrequencyInMinutes());
        Assertions.assertEquals(1922243610, model.appConsistentFrequencyInMinutes());
        Assertions.assertEquals(SetMultiVmSyncStatus.ENABLE, model.multiVmSyncStatus());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InMageAzureV2PolicyInput model =
            new InMageAzureV2PolicyInput()
                .withRecoveryPointThresholdInMinutes(1444761559)
                .withRecoveryPointHistory(2116742025)
                .withCrashConsistentFrequencyInMinutes(852718126)
                .withAppConsistentFrequencyInMinutes(1922243610)
                .withMultiVmSyncStatus(SetMultiVmSyncStatus.ENABLE);
        model = BinaryData.fromObject(model).toObject(InMageAzureV2PolicyInput.class);
        Assertions.assertEquals(1444761559, model.recoveryPointThresholdInMinutes());
        Assertions.assertEquals(2116742025, model.recoveryPointHistory());
        Assertions.assertEquals(852718126, model.crashConsistentFrequencyInMinutes());
        Assertions.assertEquals(1922243610, model.appConsistentFrequencyInMinutes());
        Assertions.assertEquals(SetMultiVmSyncStatus.ENABLE, model.multiVmSyncStatus());
    }
}
