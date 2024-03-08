// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.FetchTieringCostInfoForRehydrationRequest;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointTierType;
import com.azure.resourcemanager.recoveryservicesbackup.models.RehydrationPriority;
import org.junit.jupiter.api.Assertions;

public final class FetchTieringCostInfoForRehydrationRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FetchTieringCostInfoForRehydrationRequest model = BinaryData.fromString(
            "{\"objectType\":\"FetchTieringCostInfoForRehydrationRequest\",\"containerName\":\"wdchozfn\",\"protectedItemName\":\"fexl\",\"recoveryPointId\":\"xn\",\"rehydrationPriority\":\"High\",\"sourceTierType\":\"InstantRP\",\"targetTierType\":\"ArchivedRP\"}")
            .toObject(FetchTieringCostInfoForRehydrationRequest.class);
        Assertions.assertEquals(RecoveryPointTierType.INSTANT_RP, model.sourceTierType());
        Assertions.assertEquals(RecoveryPointTierType.ARCHIVED_RP, model.targetTierType());
        Assertions.assertEquals("wdchozfn", model.containerName());
        Assertions.assertEquals("fexl", model.protectedItemName());
        Assertions.assertEquals("xn", model.recoveryPointId());
        Assertions.assertEquals(RehydrationPriority.HIGH, model.rehydrationPriority());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FetchTieringCostInfoForRehydrationRequest model = new FetchTieringCostInfoForRehydrationRequest()
            .withSourceTierType(RecoveryPointTierType.INSTANT_RP).withTargetTierType(RecoveryPointTierType.ARCHIVED_RP)
            .withContainerName("wdchozfn").withProtectedItemName("fexl").withRecoveryPointId("xn")
            .withRehydrationPriority(RehydrationPriority.HIGH);
        model = BinaryData.fromObject(model).toObject(FetchTieringCostInfoForRehydrationRequest.class);
        Assertions.assertEquals(RecoveryPointTierType.INSTANT_RP, model.sourceTierType());
        Assertions.assertEquals(RecoveryPointTierType.ARCHIVED_RP, model.targetTierType());
        Assertions.assertEquals("wdchozfn", model.containerName());
        Assertions.assertEquals("fexl", model.protectedItemName());
        Assertions.assertEquals("xn", model.recoveryPointId());
        Assertions.assertEquals(RehydrationPriority.HIGH, model.rehydrationPriority());
    }
}
