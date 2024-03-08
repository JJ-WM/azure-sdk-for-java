// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.streamanalytics.fluent.models.CsvSerializationProperties;
import com.azure.resourcemanager.streamanalytics.models.Encoding;
import org.junit.jupiter.api.Assertions;

public final class CsvSerializationPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CsvSerializationProperties model
            = BinaryData.fromString("{\"fieldDelimiter\":\"rlkdmtncvokotl\",\"encoding\":\"UTF8\"}")
                .toObject(CsvSerializationProperties.class);
        Assertions.assertEquals("rlkdmtncvokotl", model.fieldDelimiter());
        Assertions.assertEquals(Encoding.UTF8, model.encoding());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CsvSerializationProperties model
            = new CsvSerializationProperties().withFieldDelimiter("rlkdmtncvokotl").withEncoding(Encoding.UTF8);
        model = BinaryData.fromObject(model).toObject(CsvSerializationProperties.class);
        Assertions.assertEquals("rlkdmtncvokotl", model.fieldDelimiter());
        Assertions.assertEquals(Encoding.UTF8, model.encoding());
    }
}
