// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.AzureMLBatchExecutionActivityTypeProperties;
import com.azure.resourcemanager.datafactory.models.AzureMLWebServiceFile;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AzureMLBatchExecutionActivityTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureMLBatchExecutionActivityTypeProperties model = BinaryData.fromString(
            "{\"globalParameters\":{\"imo\":\"dataagxj\"},\"webServiceOutputs\":{\"jk\":{\"filePath\":\"datafpscrfbdt\",\"linkedServiceName\":{\"referenceName\":\"cfw\",\"parameters\":{\"lola\":\"datauwjgfi\",\"kjbhsnyycya\":\"dataorzbkfefxvg\",\"el\":\"dataijzrtlfngonhmblk\"}}}},\"webServiceInputs\":{\"hygbe\":{\"filePath\":\"dataneuhpyne\",\"linkedServiceName\":{\"referenceName\":\"cafkqvcfzrg\",\"parameters\":{\"vxcrzpdqwa\":\"dataczwxyghspp\"}}}}}")
            .toObject(AzureMLBatchExecutionActivityTypeProperties.class);
        Assertions.assertEquals("cfw", model.webServiceOutputs().get("jk").linkedServiceName().referenceName());
        Assertions.assertEquals("cafkqvcfzrg",
            model.webServiceInputs().get("hygbe").linkedServiceName().referenceName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureMLBatchExecutionActivityTypeProperties model
            = new AzureMLBatchExecutionActivityTypeProperties().withGlobalParameters(mapOf("imo", "dataagxj"))
                .withWebServiceOutputs(mapOf("jk", new AzureMLWebServiceFile().withFilePath("datafpscrfbdt")
                    .withLinkedServiceName(new LinkedServiceReference().withReferenceName("cfw").withParameters(
                        mapOf("lola", "datauwjgfi", "kjbhsnyycya", "dataorzbkfefxvg", "el", "dataijzrtlfngonhmblk")))))
                .withWebServiceInputs(mapOf("hygbe",
                    new AzureMLWebServiceFile().withFilePath("dataneuhpyne")
                        .withLinkedServiceName(new LinkedServiceReference().withReferenceName("cafkqvcfzrg")
                            .withParameters(mapOf("vxcrzpdqwa", "dataczwxyghspp")))));
        model = BinaryData.fromObject(model).toObject(AzureMLBatchExecutionActivityTypeProperties.class);
        Assertions.assertEquals("cfw", model.webServiceOutputs().get("jk").linkedServiceName().referenceName());
        Assertions.assertEquals("cafkqvcfzrg",
            model.webServiceInputs().get("hygbe").linkedServiceName().referenceName());
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
