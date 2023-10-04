// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.AlternateLocationRecoveryOption;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.DataSyncStatus;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RecoveryPlanHyperVReplicaAzureFailbackInput;
import org.junit.jupiter.api.Assertions;

public final class RecoveryPlanHyperVReplicaAzureFailbackInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RecoveryPlanHyperVReplicaAzureFailbackInput model =
            BinaryData
                .fromString(
                    "{\"instanceType\":\"HyperVReplicaAzureFailback\",\"dataSyncOption\":\"ForSynchronization\",\"recoveryVmCreationOption\":\"CreateVmIfNotFound\"}")
                .toObject(RecoveryPlanHyperVReplicaAzureFailbackInput.class);
        Assertions.assertEquals(DataSyncStatus.FOR_SYNCHRONIZATION, model.dataSyncOption());
        Assertions
            .assertEquals(AlternateLocationRecoveryOption.CREATE_VM_IF_NOT_FOUND, model.recoveryVmCreationOption());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RecoveryPlanHyperVReplicaAzureFailbackInput model =
            new RecoveryPlanHyperVReplicaAzureFailbackInput()
                .withDataSyncOption(DataSyncStatus.FOR_SYNCHRONIZATION)
                .withRecoveryVmCreationOption(AlternateLocationRecoveryOption.CREATE_VM_IF_NOT_FOUND);
        model = BinaryData.fromObject(model).toObject(RecoveryPlanHyperVReplicaAzureFailbackInput.class);
        Assertions.assertEquals(DataSyncStatus.FOR_SYNCHRONIZATION, model.dataSyncOption());
        Assertions
            .assertEquals(AlternateLocationRecoveryOption.CREATE_VM_IF_NOT_FOUND, model.recoveryVmCreationOption());
    }
}
