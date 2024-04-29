// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.MongoDbV2Sink;

public final class MongoDbV2SinkTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MongoDbV2Sink model = BinaryData.fromString(
            "{\"type\":\"mazdgeablknqnq\",\"writeBehavior\":\"datanjegom\",\"writeBatchSize\":\"datagiy\",\"writeBatchTimeout\":\"datadeo\",\"sinkRetryCount\":\"datawlpopjlg\",\"sinkRetryWait\":\"dataswqxeva\",\"maxConcurrentConnections\":\"dataoxmxtcnmo\",\"disableMetricsCollection\":\"datakpgnagncguq\",\"\":{\"wdez\":\"datammved\",\"lmvvbw\":\"datatpbezlucxbudaj\",\"myvbiuvxlhf\":\"dataunr\",\"hqzvfzxseqscoy\":\"datakllxoahfvkyhfd\"}}")
            .toObject(MongoDbV2Sink.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MongoDbV2Sink model = new MongoDbV2Sink().withWriteBatchSize("datagiy")
            .withWriteBatchTimeout("datadeo")
            .withSinkRetryCount("datawlpopjlg")
            .withSinkRetryWait("dataswqxeva")
            .withMaxConcurrentConnections("dataoxmxtcnmo")
            .withDisableMetricsCollection("datakpgnagncguq")
            .withWriteBehavior("datanjegom");
        model = BinaryData.fromObject(model).toObject(MongoDbV2Sink.class);
    }
}
