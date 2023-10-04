// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.SapOpenHubTableDataset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class SapOpenHubTableDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SapOpenHubTableDataset model =
            BinaryData
                .fromString(
                    "{\"type\":\"SapOpenHubTable\",\"typeProperties\":{\"openHubDestinationName\":\"datauky\",\"excludeLastRequest\":\"dataxrjiqoqovqhg\",\"baseRequestId\":\"datagxuwudgcyqru\"},\"description\":\"mryddnqivahfcq\",\"structure\":\"datajzebp\",\"schema\":\"dataciyoypoedk\",\"linkedServiceName\":{\"referenceName\":\"pwwibpybqeig\",\"parameters\":{\"nhcgn\":\"dataxsxteuikhznff\"}},\"parameters\":{\"rkrgsdc\":{\"type\":\"SecureString\",\"defaultValue\":\"datarfqd\"},\"zfutgpbygbnb\":{\"type\":\"Int\",\"defaultValue\":\"datamgqlwyqznbbyzpo\"},\"ewflwzhxzuxe\":{\"type\":\"Array\",\"defaultValue\":\"dataiqgtzpv\"},\"ajdqxymxx\":{\"type\":\"Float\",\"defaultValue\":\"dataywlrkqsqvvdkfpfj\"}},\"annotations\":[\"datadjidcetfvgwfws\",\"datadigwoup\"],\"folder\":{\"name\":\"ddqsvclrsnxfrp\"},\"\":{\"tfxxepzpxzxlcqz\":\"dataqclmd\",\"jbsmkirpqni\":\"dataxaitiqm\",\"uzltenlb\":\"dataudmhkcomeobwk\",\"uomtxj\":\"dataxlmxozesndo\"}}")
                .toObject(SapOpenHubTableDataset.class);
        Assertions.assertEquals("mryddnqivahfcq", model.description());
        Assertions.assertEquals("pwwibpybqeig", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.SECURE_STRING, model.parameters().get("rkrgsdc").type());
        Assertions.assertEquals("ddqsvclrsnxfrp", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SapOpenHubTableDataset model =
            new SapOpenHubTableDataset()
                .withDescription("mryddnqivahfcq")
                .withStructure("datajzebp")
                .withSchema("dataciyoypoedk")
                .withLinkedServiceName(
                    new LinkedServiceReference()
                        .withReferenceName("pwwibpybqeig")
                        .withParameters(mapOf("nhcgn", "dataxsxteuikhznff")))
                .withParameters(
                    mapOf(
                        "rkrgsdc",
                        new ParameterSpecification().withType(ParameterType.SECURE_STRING).withDefaultValue("datarfqd"),
                        "zfutgpbygbnb",
                        new ParameterSpecification()
                            .withType(ParameterType.INT)
                            .withDefaultValue("datamgqlwyqznbbyzpo"),
                        "ewflwzhxzuxe",
                        new ParameterSpecification().withType(ParameterType.ARRAY).withDefaultValue("dataiqgtzpv"),
                        "ajdqxymxx",
                        new ParameterSpecification()
                            .withType(ParameterType.FLOAT)
                            .withDefaultValue("dataywlrkqsqvvdkfpfj")))
                .withAnnotations(Arrays.asList("datadjidcetfvgwfws", "datadigwoup"))
                .withFolder(new DatasetFolder().withName("ddqsvclrsnxfrp"))
                .withOpenHubDestinationName("datauky")
                .withExcludeLastRequest("dataxrjiqoqovqhg")
                .withBaseRequestId("datagxuwudgcyqru");
        model = BinaryData.fromObject(model).toObject(SapOpenHubTableDataset.class);
        Assertions.assertEquals("mryddnqivahfcq", model.description());
        Assertions.assertEquals("pwwibpybqeig", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.SECURE_STRING, model.parameters().get("rkrgsdc").type());
        Assertions.assertEquals("ddqsvclrsnxfrp", model.folder().name());
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
