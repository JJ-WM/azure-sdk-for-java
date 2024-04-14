// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SapHanaPartitionSettings;
import com.azure.resourcemanager.datafactory.models.SapHanaSource;

public final class SapHanaSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SapHanaSource model = BinaryData.fromString(
            "{\"type\":\"SapHanaSource\",\"query\":\"datamqwkfgmkpve\",\"packetSize\":\"datatzqzhdwrcajfersx\",\"partitionOption\":\"datalkcwjw\",\"partitionSettings\":{\"partitionColumnName\":\"datasksgxykdepqcy\"},\"queryTimeout\":\"datahwsxpzkmotgmd\",\"additionalColumns\":\"datawwqevbiuntp\",\"sourceRetryCount\":\"datamwjxlyce\",\"sourceRetryWait\":\"dataeqgywrauur\",\"maxConcurrentConnections\":\"datad\",\"disableMetricsCollection\":\"dataycnk\",\"\":{\"amhefuhnbdlza\":\"dataiecfmqcxmpcdbvcx\",\"cmpnk\":\"dataectzjjgvcbt\"}}")
            .toObject(SapHanaSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SapHanaSource model
            = new SapHanaSource().withSourceRetryCount("datamwjxlyce").withSourceRetryWait("dataeqgywrauur")
                .withMaxConcurrentConnections("datad").withDisableMetricsCollection("dataycnk")
                .withQueryTimeout("datahwsxpzkmotgmd").withAdditionalColumns("datawwqevbiuntp")
                .withQuery("datamqwkfgmkpve").withPacketSize("datatzqzhdwrcajfersx").withPartitionOption("datalkcwjw")
                .withPartitionSettings(new SapHanaPartitionSettings().withPartitionColumnName("datasksgxykdepqcy"));
        model = BinaryData.fromObject(model).toObject(SapHanaSource.class);
    }
}
