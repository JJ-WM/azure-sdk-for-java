// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kubernetesconfiguration.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kubernetesconfiguration.models.Identity;
import com.azure.resourcemanager.kubernetesconfiguration.models.ResourceIdentityType;
import org.junit.jupiter.api.Assertions;

public final class IdentityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Identity model =
            BinaryData
                .fromString("{\"principalId\":\"okjye\",\"tenantId\":\"kvnipjoxz\",\"type\":\"SystemAssigned\"}")
                .toObject(Identity.class);
        Assertions.assertEquals(ResourceIdentityType.SYSTEM_ASSIGNED, model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Identity model = new Identity().withType(ResourceIdentityType.SYSTEM_ASSIGNED);
        model = BinaryData.fromObject(model).toObject(Identity.class);
        Assertions.assertEquals(ResourceIdentityType.SYSTEM_ASSIGNED, model.type());
    }
}
