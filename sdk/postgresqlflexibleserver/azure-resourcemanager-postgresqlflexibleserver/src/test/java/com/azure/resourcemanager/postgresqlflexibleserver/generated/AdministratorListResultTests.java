// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.ActiveDirectoryAdministratorInner;
import com.azure.resourcemanager.postgresqlflexibleserver.models.AdministratorListResult;
import com.azure.resourcemanager.postgresqlflexibleserver.models.PrincipalType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AdministratorListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AdministratorListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"principalType\":\"User\",\"principalName\":\"xrifkwmrvkts\",\"objectId\":\"nt\",\"tenantId\":\"ipa\"},\"id\":\"ajpsquc\",\"name\":\"poyfdkfogkn\",\"type\":\"gjofjd\"},{\"properties\":{\"principalType\":\"Unknown\",\"principalName\":\"rd\",\"objectId\":\"pewnw\",\"tenantId\":\"itjz\"},\"id\":\"lusarh\",\"name\":\"ofcqhsm\",\"type\":\"urkdtmlx\"},{\"properties\":{\"principalType\":\"Group\",\"principalName\":\"k\",\"objectId\":\"txukcdmp\",\"tenantId\":\"cryuan\"},\"id\":\"uxzdxtay\",\"name\":\"lhmwhfpmrqobm\",\"type\":\"u\"},{\"properties\":{\"principalType\":\"User\",\"principalName\":\"yrtih\",\"objectId\":\"tijbpzvgnwzsymgl\",\"tenantId\":\"fcyzkohdbihanufh\"},\"id\":\"bj\",\"name\":\"s\",\"type\":\"git\"}],\"nextLink\":\"qhabifpikxwcz\"}")
            .toObject(AdministratorListResult.class);
        Assertions.assertEquals(PrincipalType.USER, model.value().get(0).principalType());
        Assertions.assertEquals("xrifkwmrvkts", model.value().get(0).principalName());
        Assertions.assertEquals("nt", model.value().get(0).objectId());
        Assertions.assertEquals("ipa", model.value().get(0).tenantId());
        Assertions.assertEquals("qhabifpikxwcz", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AdministratorListResult model
            = new AdministratorListResult()
                .withValue(Arrays.asList(
                    new ActiveDirectoryAdministratorInner().withPrincipalType(PrincipalType.USER)
                        .withPrincipalName("xrifkwmrvkts").withObjectId("nt").withTenantId("ipa"),
                    new ActiveDirectoryAdministratorInner().withPrincipalType(PrincipalType.UNKNOWN)
                        .withPrincipalName("rd").withObjectId("pewnw").withTenantId("itjz"),
                    new ActiveDirectoryAdministratorInner().withPrincipalType(PrincipalType.GROUP)
                        .withPrincipalName("k").withObjectId("txukcdmp").withTenantId("cryuan"),
                    new ActiveDirectoryAdministratorInner().withPrincipalType(PrincipalType.USER)
                        .withPrincipalName("yrtih").withObjectId("tijbpzvgnwzsymgl").withTenantId("fcyzkohdbihanufh")))
                .withNextLink("qhabifpikxwcz");
        model = BinaryData.fromObject(model).toObject(AdministratorListResult.class);
        Assertions.assertEquals(PrincipalType.USER, model.value().get(0).principalType());
        Assertions.assertEquals("xrifkwmrvkts", model.value().get(0).principalName());
        Assertions.assertEquals("nt", model.value().get(0).objectId());
        Assertions.assertEquals("ipa", model.value().get(0).tenantId());
        Assertions.assertEquals("qhabifpikxwcz", model.nextLink());
    }
}
