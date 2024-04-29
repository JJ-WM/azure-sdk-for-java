// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.SalesforceServiceCloudV2ObjectDataset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class SalesforceServiceCloudV2ObjectDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SalesforceServiceCloudV2ObjectDataset model = BinaryData.fromString(
            "{\"type\":\"bmljrjyfj\",\"typeProperties\":{\"objectApiName\":\"dataulbyzzcxs\",\"reportId\":\"dataaoymyckdpzb\"},\"description\":\"uxixkpsjldgnimqo\",\"structure\":\"datafq\",\"schema\":\"datajziqcso\",\"linkedServiceName\":{\"referenceName\":\"wq\",\"parameters\":{\"mgmgnddaxaog\":\"datadcdefqoe\",\"mbipysehyyb\":\"datakhcm\",\"bpgdiwdy\":\"databfjcvmk\"}},\"parameters\":{\"qwvcwce\":{\"type\":\"Bool\",\"defaultValue\":\"dataembr\"}},\"annotations\":[\"datatrgpd\",\"databtbxhyfwjf\",\"dataktuzrltpe\",\"datasdkbqfzbvttqjntv\"],\"folder\":{\"name\":\"pbhj\"},\"\":{\"xyeeafd\":\"datacupcyfrhooyvmv\"}}")
            .toObject(SalesforceServiceCloudV2ObjectDataset.class);
        Assertions.assertEquals("uxixkpsjldgnimqo", model.description());
        Assertions.assertEquals("wq", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.BOOL, model.parameters().get("qwvcwce").type());
        Assertions.assertEquals("pbhj", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SalesforceServiceCloudV2ObjectDataset model = new SalesforceServiceCloudV2ObjectDataset()
            .withDescription("uxixkpsjldgnimqo")
            .withStructure("datafq")
            .withSchema("datajziqcso")
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("wq")
                .withParameters(
                    mapOf("mgmgnddaxaog", "datadcdefqoe", "mbipysehyyb", "datakhcm", "bpgdiwdy", "databfjcvmk")))
            .withParameters(mapOf("qwvcwce",
                new ParameterSpecification().withType(ParameterType.BOOL).withDefaultValue("dataembr")))
            .withAnnotations(Arrays.asList("datatrgpd", "databtbxhyfwjf", "dataktuzrltpe", "datasdkbqfzbvttqjntv"))
            .withFolder(new DatasetFolder().withName("pbhj"))
            .withObjectApiName("dataulbyzzcxs")
            .withReportId("dataaoymyckdpzb");
        model = BinaryData.fromObject(model).toObject(SalesforceServiceCloudV2ObjectDataset.class);
        Assertions.assertEquals("uxixkpsjldgnimqo", model.description());
        Assertions.assertEquals("wq", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.BOOL, model.parameters().get("qwvcwce").type());
        Assertions.assertEquals("pbhj", model.folder().name());
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
