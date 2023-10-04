// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.SapEccResourceDataset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class SapEccResourceDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SapEccResourceDataset model =
            BinaryData
                .fromString(
                    "{\"type\":\"SapEccResource\",\"typeProperties\":{\"path\":\"datagblcyeqdobobaq\"},\"description\":\"bebckce\",\"structure\":\"datasixwnlpjcxbjgf\",\"schema\":\"dataqyyfrridzfpsfyak\",\"linkedServiceName\":{\"referenceName\":\"dfhmlx\",\"parameters\":{\"mkqafzvptriy\":\"dataekn\",\"dvvoydwedggwgcl\":\"datajrgtruwpuqpsrce\",\"drjbjngoars\":\"databwatz\"}},\"parameters\":{\"rqw\":{\"type\":\"Float\",\"defaultValue\":\"dataemzcyniapypimrx\"},\"stuinytkmlfupjzc\":{\"type\":\"Object\",\"defaultValue\":\"datae\"},\"yxjg\":{\"type\":\"Array\",\"defaultValue\":\"datazj\"}},\"annotations\":[\"datauerrdaktnytkbc\",\"datarfcvcp\"],\"folder\":{\"name\":\"j\"},\"\":{\"vlhnhhcikhleb\":\"datapw\",\"giflr\":\"datajgylsac\"}}")
                .toObject(SapEccResourceDataset.class);
        Assertions.assertEquals("bebckce", model.description());
        Assertions.assertEquals("dfhmlx", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.FLOAT, model.parameters().get("rqw").type());
        Assertions.assertEquals("j", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SapEccResourceDataset model =
            new SapEccResourceDataset()
                .withDescription("bebckce")
                .withStructure("datasixwnlpjcxbjgf")
                .withSchema("dataqyyfrridzfpsfyak")
                .withLinkedServiceName(
                    new LinkedServiceReference()
                        .withReferenceName("dfhmlx")
                        .withParameters(
                            mapOf(
                                "mkqafzvptriy",
                                "dataekn",
                                "dvvoydwedggwgcl",
                                "datajrgtruwpuqpsrce",
                                "drjbjngoars",
                                "databwatz")))
                .withParameters(
                    mapOf(
                        "rqw",
                        new ParameterSpecification()
                            .withType(ParameterType.FLOAT)
                            .withDefaultValue("dataemzcyniapypimrx"),
                        "stuinytkmlfupjzc",
                        new ParameterSpecification().withType(ParameterType.OBJECT).withDefaultValue("datae"),
                        "yxjg",
                        new ParameterSpecification().withType(ParameterType.ARRAY).withDefaultValue("datazj")))
                .withAnnotations(Arrays.asList("datauerrdaktnytkbc", "datarfcvcp"))
                .withFolder(new DatasetFolder().withName("j"))
                .withPath("datagblcyeqdobobaq");
        model = BinaryData.fromObject(model).toObject(SapEccResourceDataset.class);
        Assertions.assertEquals("bebckce", model.description());
        Assertions.assertEquals("dfhmlx", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.FLOAT, model.parameters().get("rqw").type());
        Assertions.assertEquals("j", model.folder().name());
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
