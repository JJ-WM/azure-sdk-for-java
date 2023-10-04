// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.CosmosDbSqlApiCollectionDatasetTypeProperties;

public final class CosmosDbSqlApiCollectionDatasetTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CosmosDbSqlApiCollectionDatasetTypeProperties model =
            BinaryData
                .fromString("{\"collectionName\":\"dataruptsyqcjnq\"}")
                .toObject(CosmosDbSqlApiCollectionDatasetTypeProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CosmosDbSqlApiCollectionDatasetTypeProperties model =
            new CosmosDbSqlApiCollectionDatasetTypeProperties().withCollectionName("dataruptsyqcjnq");
        model = BinaryData.fromObject(model).toObject(CosmosDbSqlApiCollectionDatasetTypeProperties.class);
    }
}
