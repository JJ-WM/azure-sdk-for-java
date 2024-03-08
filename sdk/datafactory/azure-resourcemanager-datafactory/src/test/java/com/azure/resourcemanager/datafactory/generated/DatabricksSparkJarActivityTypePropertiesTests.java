// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.DatabricksSparkJarActivityTypeProperties;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class DatabricksSparkJarActivityTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DatabricksSparkJarActivityTypeProperties model = BinaryData.fromString(
            "{\"mainClassName\":\"dataqtjacnbe\",\"parameters\":[\"datahpkaamoovrbv\",\"datauoqbclhn\",\"dataqxuxrggx\"],\"libraries\":[{\"cjawqhpijurqoi\":\"dataqpkckwaafuy\",\"m\":\"dataxibji\"},{\"a\":\"datatkvfurdjjzsijm\"},{\"jmnvukovxfkxnevc\":\"datanbluxomzg\",\"oco\":\"datawuiopgyunf\",\"pqmdii\":\"datacgdki\"},{\"ppcpwcxfn\":\"datapmfakinode\"}]}")
            .toObject(DatabricksSparkJarActivityTypeProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DatabricksSparkJarActivityTypeProperties model
            = new DatabricksSparkJarActivityTypeProperties().withMainClassName("dataqtjacnbe")
                .withParameters(Arrays.asList("datahpkaamoovrbv", "datauoqbclhn", "dataqxuxrggx"))
                .withLibraries(Arrays.asList(mapOf("cjawqhpijurqoi", "dataqpkckwaafuy", "m", "dataxibji"),
                    mapOf("a", "datatkvfurdjjzsijm"),
                    mapOf("jmnvukovxfkxnevc", "datanbluxomzg", "oco", "datawuiopgyunf", "pqmdii", "datacgdki"),
                    mapOf("ppcpwcxfn", "datapmfakinode")));
        model = BinaryData.fromObject(model).toObject(DatabricksSparkJarActivityTypeProperties.class);
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
