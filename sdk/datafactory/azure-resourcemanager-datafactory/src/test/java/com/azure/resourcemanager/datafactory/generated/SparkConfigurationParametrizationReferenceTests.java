// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SparkConfigurationParametrizationReference;
import com.azure.resourcemanager.datafactory.models.SparkConfigurationReferenceType;
import org.junit.jupiter.api.Assertions;

public final class SparkConfigurationParametrizationReferenceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SparkConfigurationParametrizationReference model =
            BinaryData
                .fromString("{\"type\":\"SparkConfigurationReference\",\"referenceName\":\"datadd\"}")
                .toObject(SparkConfigurationParametrizationReference.class);
        Assertions.assertEquals(SparkConfigurationReferenceType.SPARK_CONFIGURATION_REFERENCE, model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SparkConfigurationParametrizationReference model =
            new SparkConfigurationParametrizationReference()
                .withType(SparkConfigurationReferenceType.SPARK_CONFIGURATION_REFERENCE)
                .withReferenceName("datadd");
        model = BinaryData.fromObject(model).toObject(SparkConfigurationParametrizationReference.class);
        Assertions.assertEquals(SparkConfigurationReferenceType.SPARK_CONFIGURATION_REFERENCE, model.type());
    }
}
