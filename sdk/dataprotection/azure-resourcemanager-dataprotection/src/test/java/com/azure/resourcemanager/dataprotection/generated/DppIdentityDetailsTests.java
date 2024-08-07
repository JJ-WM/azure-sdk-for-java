// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.DppIdentityDetails;
import com.azure.resourcemanager.dataprotection.models.UserAssignedIdentity;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DppIdentityDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DppIdentityDetails model = BinaryData.fromString(
            "{\"principalId\":\"s\",\"tenantId\":\"zgvfcjrwz\",\"type\":\"xjtfelluwfzit\",\"userAssignedIdentities\":{\"fpjkjlxofp\":{\"principalId\":\"a5595328-c851-42a7-8364-f7fcfe736d42\",\"clientId\":\"6cf410a6-6afd-43f4-96f9-f388eb421f51\"},\"pfxxy\":{\"principalId\":\"52ec4462-df47-41cf-bfdb-3e287d3ab6a6\",\"clientId\":\"ca7e3a46-8992-416c-a7d1-ee88f864f555\"},\"i\":{\"principalId\":\"bf3c27d0-22cf-4ef5-8f58-656935c9baf9\",\"clientId\":\"da9cfb28-23ea-417f-ab03-e5e708da9d00\"}}}")
            .toObject(DppIdentityDetails.class);
        Assertions.assertEquals("xjtfelluwfzit", model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DppIdentityDetails model = new DppIdentityDetails().withType("xjtfelluwfzit")
            .withUserAssignedIdentities(mapOf("fpjkjlxofp", new UserAssignedIdentity(), "pfxxy",
                new UserAssignedIdentity(), "i", new UserAssignedIdentity()));
        model = BinaryData.fromObject(model).toObject(DppIdentityDetails.class);
        Assertions.assertEquals("xjtfelluwfzit", model.type());
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
