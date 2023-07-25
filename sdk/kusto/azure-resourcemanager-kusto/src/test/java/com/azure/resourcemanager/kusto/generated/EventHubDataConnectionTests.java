// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.models.Compression;
import com.azure.resourcemanager.kusto.models.DatabaseRouting;
import com.azure.resourcemanager.kusto.models.EventHubDataConnection;
import com.azure.resourcemanager.kusto.models.EventHubDataFormat;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class EventHubDataConnectionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EventHubDataConnection model =
            BinaryData
                .fromString(
                    "{\"kind\":\"EventHub\",\"properties\":{\"eventHubResourceId\":\"ywdxsmic\",\"consumerGroup\":\"wrwfscjfnyns\",\"tableName\":\"ujiz\",\"mappingRuleName\":\"oqytibyowbblgy\",\"dataFormat\":\"CSV\",\"eventSystemProperties\":[\"thjoxoism\",\"ksbpimlqoljx\"],\"compression\":\"GZip\",\"provisioningState\":\"Running\",\"managedIdentityResourceId\":\"xsffgcviz\",\"managedIdentityObjectId\":\"dwl\",\"databaseRouting\":\"Multi\",\"retrievalStartDate\":\"2021-03-22T22:39:30Z\"},\"location\":\"pfgfbkjub\",\"id\":\"yhgk\",\"name\":\"minsgowzf\",\"type\":\"tsttktlahbq\"}")
                .toObject(EventHubDataConnection.class);
        Assertions.assertEquals("pfgfbkjub", model.location());
        Assertions.assertEquals("ywdxsmic", model.eventHubResourceId());
        Assertions.assertEquals("wrwfscjfnyns", model.consumerGroup());
        Assertions.assertEquals("ujiz", model.tableName());
        Assertions.assertEquals("oqytibyowbblgy", model.mappingRuleName());
        Assertions.assertEquals(EventHubDataFormat.CSV, model.dataFormat());
        Assertions.assertEquals("thjoxoism", model.eventSystemProperties().get(0));
        Assertions.assertEquals(Compression.GZIP, model.compression());
        Assertions.assertEquals("xsffgcviz", model.managedIdentityResourceId());
        Assertions.assertEquals(DatabaseRouting.MULTI, model.databaseRouting());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-22T22:39:30Z"), model.retrievalStartDate());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        EventHubDataConnection model =
            new EventHubDataConnection()
                .withLocation("pfgfbkjub")
                .withEventHubResourceId("ywdxsmic")
                .withConsumerGroup("wrwfscjfnyns")
                .withTableName("ujiz")
                .withMappingRuleName("oqytibyowbblgy")
                .withDataFormat(EventHubDataFormat.CSV)
                .withEventSystemProperties(Arrays.asList("thjoxoism", "ksbpimlqoljx"))
                .withCompression(Compression.GZIP)
                .withManagedIdentityResourceId("xsffgcviz")
                .withDatabaseRouting(DatabaseRouting.MULTI)
                .withRetrievalStartDate(OffsetDateTime.parse("2021-03-22T22:39:30Z"));
        model = BinaryData.fromObject(model).toObject(EventHubDataConnection.class);
        Assertions.assertEquals("pfgfbkjub", model.location());
        Assertions.assertEquals("ywdxsmic", model.eventHubResourceId());
        Assertions.assertEquals("wrwfscjfnyns", model.consumerGroup());
        Assertions.assertEquals("ujiz", model.tableName());
        Assertions.assertEquals("oqytibyowbblgy", model.mappingRuleName());
        Assertions.assertEquals(EventHubDataFormat.CSV, model.dataFormat());
        Assertions.assertEquals("thjoxoism", model.eventSystemProperties().get(0));
        Assertions.assertEquals(Compression.GZIP, model.compression());
        Assertions.assertEquals("xsffgcviz", model.managedIdentityResourceId());
        Assertions.assertEquals(DatabaseRouting.MULTI, model.databaseRouting());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-22T22:39:30Z"), model.retrievalStartDate());
    }
}
