// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.AzureBlobFSDatasetTypeProperties;
import com.azure.resourcemanager.datafactory.models.DatasetCompression;
import com.azure.resourcemanager.datafactory.models.DatasetStorageFormat;
import java.util.HashMap;
import java.util.Map;

public final class AzureBlobFSDatasetTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureBlobFSDatasetTypeProperties model = BinaryData.fromString(
            "{\"folderPath\":\"datayjulskwwnqhq\",\"fileName\":\"datagpwxtvce\",\"format\":{\"type\":\"vbvx\",\"serializer\":\"dataegenlrj\",\"deserializer\":\"datamwevguyflnxel\",\"\":{\"owwe\":\"datafzcde\",\"sfqbirtybcelfjn\":\"datahyfkdilbwqlqa\",\"el\":\"dataodnjyhzfaxskdv\",\"qxsorchaz\":\"datamodpe\"}},\"compression\":{\"type\":\"datao\",\"level\":\"datayhl\",\"\":{\"b\":\"datavhs\",\"gf\":\"datapwxslaj\",\"awkmibu\":\"datagaef\"}}}")
            .toObject(AzureBlobFSDatasetTypeProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureBlobFSDatasetTypeProperties model
            = new AzureBlobFSDatasetTypeProperties().withFolderPath("datayjulskwwnqhq")
                .withFileName("datagpwxtvce")
                .withFormat(new DatasetStorageFormat().withSerializer("dataegenlrj")
                    .withDeserializer("datamwevguyflnxel")
                    .withAdditionalProperties(mapOf("type", "vbvx")))
                .withCompression(
                    new DatasetCompression().withType("datao").withLevel("datayhl").withAdditionalProperties(mapOf()));
        model = BinaryData.fromObject(model).toObject(AzureBlobFSDatasetTypeProperties.class);
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
