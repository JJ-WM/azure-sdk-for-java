// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.BinarySink;
import com.azure.resourcemanager.datafactory.models.MetadataItem;
import com.azure.resourcemanager.datafactory.models.StoreWriteSettings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class BinarySinkTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BinarySink model = BinaryData.fromString(
            "{\"type\":\"jyfbutqlotojfvba\",\"storeSettings\":{\"type\":\"islcfxs\",\"maxConcurrentConnections\":\"datadiqemcghorrj\",\"disableMetricsCollection\":\"datafczb\",\"copyBehavior\":\"datarmvhtmzwg\",\"metadata\":[{\"name\":\"datanzpybrflqv\",\"value\":\"datalqwpmmmhupv\"},{\"name\":\"datahpsugebgboq\",\"value\":\"dataiiiwu\"},{\"name\":\"dataofgfqge\",\"value\":\"dataypxm\"}],\"\":{\"fdsogl\":\"datajonasjdaxe\",\"duwncaifwogq\":\"dataih\",\"fachkzzn\":\"datadxtp\",\"oxhzcmgm\":\"datakmmsfnig\"}},\"writeBatchSize\":\"datawjgjlo\",\"writeBatchTimeout\":\"datahhkxlquupbihui\",\"sinkRetryCount\":\"datay\",\"sinkRetryWait\":\"dataqweptejryvvuktc\",\"maxConcurrentConnections\":\"datatp\",\"disableMetricsCollection\":\"datawjbmrkcqpyxjj\",\"\":{\"lyvqycknqmb\":\"dataovhuif\",\"i\":\"datassjbyneusnncnn\"}}")
            .toObject(BinarySink.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BinarySink model = new BinarySink().withWriteBatchSize("datawjgjlo")
            .withWriteBatchTimeout("datahhkxlquupbihui")
            .withSinkRetryCount("datay")
            .withSinkRetryWait("dataqweptejryvvuktc")
            .withMaxConcurrentConnections("datatp")
            .withDisableMetricsCollection("datawjbmrkcqpyxjj")
            .withStoreSettings(new StoreWriteSettings().withMaxConcurrentConnections("datadiqemcghorrj")
                .withDisableMetricsCollection("datafczb")
                .withCopyBehavior("datarmvhtmzwg")
                .withMetadata(Arrays.asList(new MetadataItem().withName("datanzpybrflqv").withValue("datalqwpmmmhupv"),
                    new MetadataItem().withName("datahpsugebgboq").withValue("dataiiiwu"),
                    new MetadataItem().withName("dataofgfqge").withValue("dataypxm")))
                .withAdditionalProperties(mapOf("type", "islcfxs")));
        model = BinaryData.fromObject(model).toObject(BinarySink.class);
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
