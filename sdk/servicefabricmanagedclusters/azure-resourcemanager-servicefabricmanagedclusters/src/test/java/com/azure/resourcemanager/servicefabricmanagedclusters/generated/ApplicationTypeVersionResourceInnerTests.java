// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabricmanagedclusters.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.servicefabricmanagedclusters.fluent.models.ApplicationTypeVersionResourceInner;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ApplicationTypeVersionResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ApplicationTypeVersionResourceInner model = BinaryData.fromString(
            "{\"properties\":{\"provisioningState\":\"a\",\"appPackageUrl\":\"ithxqhabifpi\"},\"location\":\"wczbys\",\"tags\":{\"uhivyqniw\":\"q\"},\"id\":\"br\",\"name\":\"xvd\",\"type\":\"mjgr\"}")
            .toObject(ApplicationTypeVersionResourceInner.class);
        Assertions.assertEquals("wczbys", model.location());
        Assertions.assertEquals("q", model.tags().get("uhivyqniw"));
        Assertions.assertEquals("ithxqhabifpi", model.appPackageUrl());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ApplicationTypeVersionResourceInner model = new ApplicationTypeVersionResourceInner().withLocation("wczbys")
            .withTags(mapOf("uhivyqniw", "q"))
            .withAppPackageUrl("ithxqhabifpi");
        model = BinaryData.fromObject(model).toObject(ApplicationTypeVersionResourceInner.class);
        Assertions.assertEquals("wczbys", model.location());
        Assertions.assertEquals("q", model.tags().get("uhivyqniw"));
        Assertions.assertEquals("ithxqhabifpi", model.appPackageUrl());
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
