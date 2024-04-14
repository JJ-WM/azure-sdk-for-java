// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotfirmwaredefense.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.iotfirmwaredefense.fluent.models.WorkspaceInner;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class WorkspaceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WorkspaceInner model = BinaryData.fromString(
            "{\"properties\":{\"provisioningState\":\"Accepted\"},\"location\":\"ualaexqpvfadmw\",\"tags\":{\"vxpvgomz\":\"r\",\"bnbbeldawkz\":\"fmisg\",\"urqhaka\":\"ali\"},\"id\":\"hashsfwxosow\",\"name\":\"xcug\",\"type\":\"cjooxdjebwpucwwf\"}")
            .toObject(WorkspaceInner.class);
        Assertions.assertEquals("ualaexqpvfadmw", model.location());
        Assertions.assertEquals("r", model.tags().get("vxpvgomz"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WorkspaceInner model = new WorkspaceInner().withLocation("ualaexqpvfadmw")
            .withTags(mapOf("vxpvgomz", "r", "bnbbeldawkz", "fmisg", "urqhaka", "ali"));
        model = BinaryData.fromObject(model).toObject(WorkspaceInner.class);
        Assertions.assertEquals("ualaexqpvfadmw", model.location());
        Assertions.assertEquals("r", model.tags().get("vxpvgomz"));
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
