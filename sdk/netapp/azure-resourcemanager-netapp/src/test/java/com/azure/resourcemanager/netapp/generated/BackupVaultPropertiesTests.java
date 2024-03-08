// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.BackupVaultProperties;

public final class BackupVaultPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BackupVaultProperties model
            = BinaryData.fromString("{\"provisioningState\":\"mfpjbabw\"}").toObject(BackupVaultProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BackupVaultProperties model = new BackupVaultProperties();
        model = BinaryData.fromObject(model).toObject(BackupVaultProperties.class);
    }
}
