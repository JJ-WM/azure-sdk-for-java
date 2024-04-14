// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.resourcemanager.mobilenetwork.models.Slice;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Slices UpdateTags.
 */
public final class SlicesUpdateTagsSamples {
    /*
     * x-ms-original-file:
     * specification/mobilenetwork/resource-manager/Microsoft.MobileNetwork/stable/2024-02-01/examples/SliceUpdateTags.
     * json
     */
    /**
     * Sample code: Update network slice tags.
     * 
     * @param manager Entry point to MobileNetworkManager.
     */
    public static void updateNetworkSliceTags(com.azure.resourcemanager.mobilenetwork.MobileNetworkManager manager) {
        Slice resource = manager.slices()
            .getWithResponse("rg1", "testMobileNetwork", "testSlice", com.azure.core.util.Context.NONE).getValue();
        resource.update().withTags(mapOf("tag1", "value1", "tag2", "value2")).apply();
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
