// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sphere.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.sphere.models.CatalogUpdate;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class CatalogUpdateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CatalogUpdate model =
            BinaryData
                .fromString(
                    "{\"tags\":{\"xpaojakhmsbz\":\"fdosyg\",\"hlxaolthqtr\":\"hcrzevd\",\"gvfcj\":\"qjbpfzfsin\"}}")
                .toObject(CatalogUpdate.class);
        Assertions.assertEquals("fdosyg", model.tags().get("xpaojakhmsbz"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CatalogUpdate model =
            new CatalogUpdate()
                .withTags(mapOf("xpaojakhmsbz", "fdosyg", "hlxaolthqtr", "hcrzevd", "gvfcj", "qjbpfzfsin"));
        model = BinaryData.fromObject(model).toObject(CatalogUpdate.class);
        Assertions.assertEquals("fdosyg", model.tags().get("xpaojakhmsbz"));
    }

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
