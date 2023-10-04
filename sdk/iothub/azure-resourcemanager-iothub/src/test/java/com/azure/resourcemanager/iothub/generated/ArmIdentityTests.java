// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.iothub.models.ArmIdentity;
import com.azure.resourcemanager.iothub.models.ArmUserIdentity;
import com.azure.resourcemanager.iothub.models.ResourceIdentityType;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ArmIdentityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ArmIdentity model =
            BinaryData
                .fromString(
                    "{\"principalId\":\"glcuhxwtctyqi\",\"tenantId\":\"bbovplwzbhvgyugu\",\"type\":\"SystemAssigned,"
                        + " UserAssigned\",\"userAssignedIdentities\":{\"nkjzkdeslpvlop\":{\"principalId\":\"ss\",\"clientId\":\"ukkfplgmgs\"},\"iuebbaumny\":{\"principalId\":\"yighxpk\",\"clientId\":\"zb\"},\"bckhsmtxpsi\":{\"principalId\":\"ped\",\"clientId\":\"jn\"}}}")
                .toObject(ArmIdentity.class);
        Assertions.assertEquals(ResourceIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED, model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ArmIdentity model =
            new ArmIdentity()
                .withType(ResourceIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED)
                .withUserAssignedIdentities(
                    mapOf(
                        "nkjzkdeslpvlop",
                        new ArmUserIdentity(),
                        "iuebbaumny",
                        new ArmUserIdentity(),
                        "bckhsmtxpsi",
                        new ArmUserIdentity()));
        model = BinaryData.fromObject(model).toObject(ArmIdentity.class);
        Assertions.assertEquals(ResourceIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED, model.type());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
