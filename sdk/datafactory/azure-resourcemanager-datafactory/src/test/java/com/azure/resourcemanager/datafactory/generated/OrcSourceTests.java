// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.OrcSource;
import com.azure.resourcemanager.datafactory.models.StoreReadSettings;
import java.util.HashMap;
import java.util.Map;

public final class OrcSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OrcSource model = BinaryData.fromString(
            "{\"type\":\"OrcSource\",\"storeSettings\":{\"type\":\"StoreReadSettings\",\"maxConcurrentConnections\":\"dataz\",\"disableMetricsCollection\":\"datamcmlzmfetidne\",\"\":{\"gowdavpqyhax\":\"datajgwnmxc\",\"gkwpbnefabgt\":\"dataorzozf\",\"ugddycfyfau\":\"dataggoppmxcm\"}},\"additionalColumns\":\"datamzq\",\"sourceRetryCount\":\"datawkesxvzcxxf\",\"sourceRetryWait\":\"dataj\",\"maxConcurrentConnections\":\"dataqwbrzkmgyl\",\"disableMetricsCollection\":\"datacxmh\",\"\":{\"hjhrkfptiiommis\":\"dataecoiqwnqlizlc\",\"vbwawymahboi\":\"datafmbvmajcmpohjdvf\",\"gcjssqpk\":\"datadiuyqdjk\",\"zqwwttqjyiw\":\"databryhvshkvup\"}}")
            .toObject(OrcSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OrcSource model = new OrcSource().withSourceRetryCount("datawkesxvzcxxf").withSourceRetryWait("dataj")
            .withMaxConcurrentConnections("dataqwbrzkmgyl").withDisableMetricsCollection("datacxmh")
            .withStoreSettings(new StoreReadSettings().withMaxConcurrentConnections("dataz")
                .withDisableMetricsCollection("datamcmlzmfetidne")
                .withAdditionalProperties(mapOf("type", "StoreReadSettings")))
            .withAdditionalColumns("datamzq");
        model = BinaryData.fromObject(model).toObject(OrcSource.class);
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
