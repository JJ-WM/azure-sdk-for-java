// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.MongoDbCollectionDatasetTypeProperties;

public final class MongoDbCollectionDatasetTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MongoDbCollectionDatasetTypeProperties model = BinaryData.fromString("{\"collectionName\":\"datamxvps\"}")
            .toObject(MongoDbCollectionDatasetTypeProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MongoDbCollectionDatasetTypeProperties model
            = new MongoDbCollectionDatasetTypeProperties().withCollectionName("datamxvps");
        model = BinaryData.fromObject(model).toObject(MongoDbCollectionDatasetTypeProperties.class);
    }
}
