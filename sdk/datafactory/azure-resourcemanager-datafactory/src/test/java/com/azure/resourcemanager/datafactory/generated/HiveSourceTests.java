// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.HiveSource;

public final class HiveSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HiveSource model = BinaryData.fromString(
            "{\"type\":\"xmnoa\",\"query\":\"datahoaqj\",\"queryTimeout\":\"datazqz\",\"additionalColumns\":\"datadipnhbsvrlr\",\"sourceRetryCount\":\"datayadyfnxtlln\",\"sourceRetryWait\":\"datamdgsvaekuovwi\",\"maxConcurrentConnections\":\"dataykprrddbenf\",\"disableMetricsCollection\":\"datafszmxpos\",\"\":{\"j\":\"datacvyuldkpdleeslj\"}}")
            .toObject(HiveSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HiveSource model = new HiveSource().withSourceRetryCount("datayadyfnxtlln")
            .withSourceRetryWait("datamdgsvaekuovwi")
            .withMaxConcurrentConnections("dataykprrddbenf")
            .withDisableMetricsCollection("datafszmxpos")
            .withQueryTimeout("datazqz")
            .withAdditionalColumns("datadipnhbsvrlr")
            .withQuery("datahoaqj");
        model = BinaryData.fromObject(model).toObject(HiveSource.class);
    }
}
