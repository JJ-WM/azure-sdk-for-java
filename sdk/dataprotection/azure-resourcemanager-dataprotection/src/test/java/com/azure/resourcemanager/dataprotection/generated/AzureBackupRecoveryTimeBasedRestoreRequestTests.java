// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.AzureBackupRecoveryTimeBasedRestoreRequest;
import com.azure.resourcemanager.dataprotection.models.RecoveryOption;
import com.azure.resourcemanager.dataprotection.models.RestoreTargetInfoBase;
import com.azure.resourcemanager.dataprotection.models.SourceDataStoreType;
import org.junit.jupiter.api.Assertions;

public final class AzureBackupRecoveryTimeBasedRestoreRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureBackupRecoveryTimeBasedRestoreRequest model =
            BinaryData
                .fromString(
                    "{\"objectType\":\"AzureBackupRecoveryTimeBasedRestoreRequest\",\"recoveryPointTime\":\"grtwae\",\"restoreTargetInfo\":{\"objectType\":\"RestoreTargetInfoBase\",\"recoveryOption\":\"FailIfExists\",\"restoreLocation\":\"zkopb\"},\"sourceDataStoreType\":\"OperationalStore\",\"sourceResourceId\":\"rfdwoyu\"}")
                .toObject(AzureBackupRecoveryTimeBasedRestoreRequest.class);
        Assertions.assertEquals(RecoveryOption.FAIL_IF_EXISTS, model.restoreTargetInfo().recoveryOption());
        Assertions.assertEquals("zkopb", model.restoreTargetInfo().restoreLocation());
        Assertions.assertEquals(SourceDataStoreType.OPERATIONAL_STORE, model.sourceDataStoreType());
        Assertions.assertEquals("rfdwoyu", model.sourceResourceId());
        Assertions.assertEquals("grtwae", model.recoveryPointTime());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureBackupRecoveryTimeBasedRestoreRequest model =
            new AzureBackupRecoveryTimeBasedRestoreRequest()
                .withRestoreTargetInfo(
                    new RestoreTargetInfoBase()
                        .withRecoveryOption(RecoveryOption.FAIL_IF_EXISTS)
                        .withRestoreLocation("zkopb"))
                .withSourceDataStoreType(SourceDataStoreType.OPERATIONAL_STORE)
                .withSourceResourceId("rfdwoyu")
                .withRecoveryPointTime("grtwae");
        model = BinaryData.fromObject(model).toObject(AzureBackupRecoveryTimeBasedRestoreRequest.class);
        Assertions.assertEquals(RecoveryOption.FAIL_IF_EXISTS, model.restoreTargetInfo().recoveryOption());
        Assertions.assertEquals("zkopb", model.restoreTargetInfo().restoreLocation());
        Assertions.assertEquals(SourceDataStoreType.OPERATIONAL_STORE, model.sourceDataStoreType());
        Assertions.assertEquals("rfdwoyu", model.sourceResourceId());
        Assertions.assertEquals("grtwae", model.recoveryPointTime());
    }
}
