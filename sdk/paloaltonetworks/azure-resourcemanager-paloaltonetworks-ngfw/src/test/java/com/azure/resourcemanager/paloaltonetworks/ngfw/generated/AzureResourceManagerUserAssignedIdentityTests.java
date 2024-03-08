// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.AzureResourceManagerUserAssignedIdentity;
import org.junit.jupiter.api.Assertions;

public final class AzureResourceManagerUserAssignedIdentityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureResourceManagerUserAssignedIdentity model
            = BinaryData.fromString("{\"clientId\":\"odgmaajrmvdjwz\",\"principalId\":\"ovmclwhijcoejct\"}")
                .toObject(AzureResourceManagerUserAssignedIdentity.class);
        Assertions.assertEquals("odgmaajrmvdjwz", model.clientId());
        Assertions.assertEquals("ovmclwhijcoejct", model.principalId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureResourceManagerUserAssignedIdentity model = new AzureResourceManagerUserAssignedIdentity()
            .withClientId("odgmaajrmvdjwz").withPrincipalId("ovmclwhijcoejct");
        model = BinaryData.fromObject(model).toObject(AzureResourceManagerUserAssignedIdentity.class);
        Assertions.assertEquals("odgmaajrmvdjwz", model.clientId());
        Assertions.assertEquals("ovmclwhijcoejct", model.principalId());
    }
}
