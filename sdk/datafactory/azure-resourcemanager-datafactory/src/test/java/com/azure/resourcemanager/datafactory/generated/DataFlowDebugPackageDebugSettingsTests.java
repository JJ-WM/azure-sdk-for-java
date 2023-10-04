// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DataFlowDebugPackageDebugSettings;
import com.azure.resourcemanager.datafactory.models.DataFlowSourceSetting;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DataFlowDebugPackageDebugSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DataFlowDebugPackageDebugSettings model =
            BinaryData
                .fromString(
                    "{\"sourceSettings\":[{\"sourceName\":\"cnqmxqpsw\",\"rowLimit\":2027239261,\"\":{\"gdhbe\":\"datahl\"}},{\"sourceName\":\"qkzszuwiwtglxxh\",\"rowLimit\":1438070602,\"\":{\"pqcbfrmbodthsq\":\"datapicrmnzhrgmqgjsx\",\"fr\":\"datagvriibakclac\"}},{\"sourceName\":\"ousxauzlwvsgmw\",\"rowLimit\":414245170,\"\":{\"mmkjsvthnwpztek\":\"dataizvu\",\"gplucfotangcfhny\":\"datavmribiat\",\"vtxnjmxmcuqud\":\"datazcugswvxwlmzqw\"}}],\"parameters\":{\"dkvgfabuiyjibuzp\":\"dataclxyn\"},\"datasetParameters\":\"dataugneikn\"}")
                .toObject(DataFlowDebugPackageDebugSettings.class);
        Assertions.assertEquals("cnqmxqpsw", model.sourceSettings().get(0).sourceName());
        Assertions.assertEquals(2027239261, model.sourceSettings().get(0).rowLimit());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DataFlowDebugPackageDebugSettings model =
            new DataFlowDebugPackageDebugSettings()
                .withSourceSettings(
                    Arrays
                        .asList(
                            new DataFlowSourceSetting()
                                .withSourceName("cnqmxqpsw")
                                .withRowLimit(2027239261)
                                .withAdditionalProperties(mapOf()),
                            new DataFlowSourceSetting()
                                .withSourceName("qkzszuwiwtglxxh")
                                .withRowLimit(1438070602)
                                .withAdditionalProperties(mapOf()),
                            new DataFlowSourceSetting()
                                .withSourceName("ousxauzlwvsgmw")
                                .withRowLimit(414245170)
                                .withAdditionalProperties(mapOf())))
                .withParameters(mapOf("dkvgfabuiyjibuzp", "dataclxyn"))
                .withDatasetParameters("dataugneikn");
        model = BinaryData.fromObject(model).toObject(DataFlowDebugPackageDebugSettings.class);
        Assertions.assertEquals("cnqmxqpsw", model.sourceSettings().get(0).sourceName());
        Assertions.assertEquals(2027239261, model.sourceSettings().get(0).rowLimit());
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
