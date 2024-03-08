// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.StagingSettings;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class StagingSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        StagingSettings model = BinaryData.fromString(
            "{\"linkedServiceName\":{\"referenceName\":\"h\",\"parameters\":{\"unicgrxce\":\"datatgwerbpobvj\",\"mztrnniarje\":\"datavvmdtkllqhznutrx\",\"xiqfoqwesqykqfs\":\"datajh\",\"wmzgvnojgmobkali\":\"datarlsaipshheta\"}},\"path\":\"dataikkehpdssvlubd\",\"enableCompression\":\"dataowxsxbxd\",\"\":{\"tghmtb\":\"dataxurcekcqmjqqau\",\"shlhe\":\"datafkcnkghkrbi\"}}")
            .toObject(StagingSettings.class);
        Assertions.assertEquals("h", model.linkedServiceName().referenceName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        StagingSettings model = new StagingSettings()
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("h")
                .withParameters(mapOf("unicgrxce", "datatgwerbpobvj", "mztrnniarje", "datavvmdtkllqhznutrx",
                    "xiqfoqwesqykqfs", "datajh", "wmzgvnojgmobkali", "datarlsaipshheta")))
            .withPath("dataikkehpdssvlubd").withEnableCompression("dataowxsxbxd").withAdditionalProperties(mapOf());
        model = BinaryData.fromObject(model).toObject(StagingSettings.class);
        Assertions.assertEquals("h", model.linkedServiceName().referenceName());
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
