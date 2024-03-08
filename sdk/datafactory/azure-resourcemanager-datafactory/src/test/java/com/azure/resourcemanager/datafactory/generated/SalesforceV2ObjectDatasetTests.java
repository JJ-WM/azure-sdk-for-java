// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.SalesforceV2ObjectDataset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class SalesforceV2ObjectDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SalesforceV2ObjectDataset model = BinaryData.fromString(
            "{\"type\":\"SalesforceV2Object\",\"typeProperties\":{\"objectApiName\":\"datamajokbxxcdkhxjwt\",\"reportId\":\"datatgzljuepm\"},\"description\":\"sjpgbmlbxjhgvte\",\"structure\":\"datarunudmakkshrna\",\"schema\":\"dataczkwohdigeyuocf\",\"linkedServiceName\":{\"referenceName\":\"samodwq\",\"parameters\":{\"xerowuzvrnnb\":\"datat\",\"dofmazhk\":\"datagrafeonmtojx\"}},\"parameters\":{\"szbwgpmdmwi\":{\"type\":\"String\",\"defaultValue\":\"datana\"},\"hh\":{\"type\":\"SecureString\",\"defaultValue\":\"datavesw\"}},\"annotations\":[\"datahdldarg\",\"datawimtcceeeuquu\",\"dataczzc\",\"datajwx\"],\"folder\":{\"name\":\"irgkn\"},\"\":{\"wdajyd\":\"datala\"}}")
            .toObject(SalesforceV2ObjectDataset.class);
        Assertions.assertEquals("sjpgbmlbxjhgvte", model.description());
        Assertions.assertEquals("samodwq", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.STRING, model.parameters().get("szbwgpmdmwi").type());
        Assertions.assertEquals("irgkn", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SalesforceV2ObjectDataset model = new SalesforceV2ObjectDataset().withDescription("sjpgbmlbxjhgvte")
            .withStructure("datarunudmakkshrna").withSchema("dataczkwohdigeyuocf")
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("samodwq")
                .withParameters(mapOf("xerowuzvrnnb", "datat", "dofmazhk", "datagrafeonmtojx")))
            .withParameters(mapOf("szbwgpmdmwi",
                new ParameterSpecification().withType(ParameterType.STRING).withDefaultValue("datana"), "hh",
                new ParameterSpecification().withType(ParameterType.SECURE_STRING).withDefaultValue("datavesw")))
            .withAnnotations(Arrays.asList("datahdldarg", "datawimtcceeeuquu", "dataczzc", "datajwx"))
            .withFolder(new DatasetFolder().withName("irgkn")).withObjectApiName("datamajokbxxcdkhxjwt")
            .withReportId("datatgzljuepm");
        model = BinaryData.fromObject(model).toObject(SalesforceV2ObjectDataset.class);
        Assertions.assertEquals("sjpgbmlbxjhgvte", model.description());
        Assertions.assertEquals("samodwq", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.STRING, model.parameters().get("szbwgpmdmwi").type());
        Assertions.assertEquals("irgkn", model.folder().name());
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
