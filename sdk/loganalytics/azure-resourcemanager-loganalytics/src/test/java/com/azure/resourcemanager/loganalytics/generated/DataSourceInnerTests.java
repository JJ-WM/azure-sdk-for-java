// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.loganalytics.fluent.models.DataSourceInner;
import com.azure.resourcemanager.loganalytics.models.DataSourceKind;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DataSourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DataSourceInner model =
            BinaryData
                .fromString(
                    "{\"properties\":\"datakbldngkpocipa\",\"etag\":\"xoegukgjnpiucgy\",\"kind\":\"LinuxChangeTrackingPath\",\"tags\":{\"izcdrqjsd\":\"zntypmrb\",\"cwif\":\"ydnfyhxdeoejz\"},\"id\":\"jttgzf\",\"name\":\"ishc\",\"type\":\"khaj\"}")
                .toObject(DataSourceInner.class);
        Assertions.assertEquals("xoegukgjnpiucgy", model.etag());
        Assertions.assertEquals(DataSourceKind.LINUX_CHANGE_TRACKING_PATH, model.kind());
        Assertions.assertEquals("zntypmrb", model.tags().get("izcdrqjsd"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DataSourceInner model =
            new DataSourceInner()
                .withProperties("datakbldngkpocipa")
                .withEtag("xoegukgjnpiucgy")
                .withKind(DataSourceKind.LINUX_CHANGE_TRACKING_PATH)
                .withTags(mapOf("izcdrqjsd", "zntypmrb", "cwif", "ydnfyhxdeoejz"));
        model = BinaryData.fromObject(model).toObject(DataSourceInner.class);
        Assertions.assertEquals("xoegukgjnpiucgy", model.etag());
        Assertions.assertEquals(DataSourceKind.LINUX_CHANGE_TRACKING_PATH, model.kind());
        Assertions.assertEquals("zntypmrb", model.tags().get("izcdrqjsd"));
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
