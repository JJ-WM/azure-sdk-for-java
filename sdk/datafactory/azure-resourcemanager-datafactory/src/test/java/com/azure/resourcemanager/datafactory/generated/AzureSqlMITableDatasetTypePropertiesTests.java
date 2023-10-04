// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.AzureSqlMITableDatasetTypeProperties;

public final class AzureSqlMITableDatasetTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureSqlMITableDatasetTypeProperties model =
            BinaryData
                .fromString("{\"tableName\":\"datariwhjdfrwp\",\"schema\":\"datah\",\"table\":\"datankcclpctuog\"}")
                .toObject(AzureSqlMITableDatasetTypeProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureSqlMITableDatasetTypeProperties model =
            new AzureSqlMITableDatasetTypeProperties()
                .withTableName("datariwhjdfrwp")
                .withSchema("datah")
                .withTable("datankcclpctuog");
        model = BinaryData.fromObject(model).toObject(AzureSqlMITableDatasetTypeProperties.class);
    }
}
