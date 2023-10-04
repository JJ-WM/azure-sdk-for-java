// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.VaultSettingCreationInputProperties;
import org.junit.jupiter.api.Assertions;

public final class VaultSettingCreationInputPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VaultSettingCreationInputProperties model =
            BinaryData
                .fromString("{\"migrationSolutionId\":\"yxp\",\"vmwareToAzureProviderType\":\"tweialwvskbuhzac\"}")
                .toObject(VaultSettingCreationInputProperties.class);
        Assertions.assertEquals("yxp", model.migrationSolutionId());
        Assertions.assertEquals("tweialwvskbuhzac", model.vmwareToAzureProviderType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VaultSettingCreationInputProperties model =
            new VaultSettingCreationInputProperties()
                .withMigrationSolutionId("yxp")
                .withVmwareToAzureProviderType("tweialwvskbuhzac");
        model = BinaryData.fromObject(model).toObject(VaultSettingCreationInputProperties.class);
        Assertions.assertEquals("yxp", model.migrationSolutionId());
        Assertions.assertEquals("tweialwvskbuhzac", model.vmwareToAzureProviderType());
    }
}
