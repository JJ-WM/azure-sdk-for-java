// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SapCloudForCustomerSink;
import com.azure.resourcemanager.datafactory.models.SapCloudForCustomerSinkWriteBehavior;
import org.junit.jupiter.api.Assertions;

public final class SapCloudForCustomerSinkTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SapCloudForCustomerSink model = BinaryData.fromString(
            "{\"type\":\"SapCloudForCustomerSink\",\"writeBehavior\":\"Update\",\"httpRequestTimeout\":\"datamophtkyzsgayng\",\"writeBatchSize\":\"datawvcnv\",\"writeBatchTimeout\":\"dataqxqhysu\",\"sinkRetryCount\":\"datadnslroqxrvycjdn\",\"sinkRetryWait\":\"datamggy\",\"maxConcurrentConnections\":\"datapmsacbamtoqse\",\"disableMetricsCollection\":\"dataoyxdig\",\"\":{\"osxdsxil\":\"datazmylqhq\"}}")
            .toObject(SapCloudForCustomerSink.class);
        Assertions.assertEquals(SapCloudForCustomerSinkWriteBehavior.UPDATE, model.writeBehavior());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SapCloudForCustomerSink model = new SapCloudForCustomerSink().withWriteBatchSize("datawvcnv")
            .withWriteBatchTimeout("dataqxqhysu").withSinkRetryCount("datadnslroqxrvycjdn")
            .withSinkRetryWait("datamggy").withMaxConcurrentConnections("datapmsacbamtoqse")
            .withDisableMetricsCollection("dataoyxdig").withWriteBehavior(SapCloudForCustomerSinkWriteBehavior.UPDATE)
            .withHttpRequestTimeout("datamophtkyzsgayng");
        model = BinaryData.fromObject(model).toObject(SapCloudForCustomerSink.class);
        Assertions.assertEquals(SapCloudForCustomerSinkWriteBehavior.UPDATE, model.writeBehavior());
    }
}
