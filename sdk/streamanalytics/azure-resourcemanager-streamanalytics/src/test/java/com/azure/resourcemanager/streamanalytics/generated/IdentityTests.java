// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.streamanalytics.models.Identity;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class IdentityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Identity model = BinaryData.fromString(
            "{\"tenantId\":\"dtocj\",\"principalId\":\"hvpmoue\",\"type\":\"dzxibqeojnxqbzvd\",\"userAssignedIdentities\":{\"aoqvuh\":\"datawndeicbtwnp\"}}")
            .toObject(Identity.class);
        Assertions.assertEquals("dzxibqeojnxqbzvd", model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Identity model = new Identity().withType("dzxibqeojnxqbzvd")
            .withUserAssignedIdentities(mapOf("aoqvuh", "datawndeicbtwnp"));
        model = BinaryData.fromObject(model).toObject(Identity.class);
        Assertions.assertEquals("dzxibqeojnxqbzvd", model.type());
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
