// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mysqlflexibleserver.fluent.models.AzureADAdministratorInner;
import com.azure.resourcemanager.mysqlflexibleserver.models.AdministratorType;
import org.junit.jupiter.api.Assertions;

public final class AzureADAdministratorInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureADAdministratorInner model = BinaryData.fromString(
            "{\"properties\":{\"administratorType\":\"ActiveDirectory\",\"login\":\"uv\",\"sid\":\"xpyb\",\"tenantId\":\"m\",\"identityResourceId\":\"mtz\"},\"id\":\"bsphrupidgsybbe\",\"name\":\"hphoycm\",\"type\":\"xaobhdxbmtqioqjz\"}")
            .toObject(AzureADAdministratorInner.class);
        Assertions.assertEquals(AdministratorType.ACTIVE_DIRECTORY, model.administratorType());
        Assertions.assertEquals("uv", model.login());
        Assertions.assertEquals("xpyb", model.sid());
        Assertions.assertEquals("m", model.tenantId());
        Assertions.assertEquals("mtz", model.identityResourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureADAdministratorInner model
            = new AzureADAdministratorInner().withAdministratorType(AdministratorType.ACTIVE_DIRECTORY)
                .withLogin("uv")
                .withSid("xpyb")
                .withTenantId("m")
                .withIdentityResourceId("mtz");
        model = BinaryData.fromObject(model).toObject(AzureADAdministratorInner.class);
        Assertions.assertEquals(AdministratorType.ACTIVE_DIRECTORY, model.administratorType());
        Assertions.assertEquals("uv", model.login());
        Assertions.assertEquals("xpyb", model.sid());
        Assertions.assertEquals("m", model.tenantId());
        Assertions.assertEquals("mtz", model.identityResourceId());
    }
}
