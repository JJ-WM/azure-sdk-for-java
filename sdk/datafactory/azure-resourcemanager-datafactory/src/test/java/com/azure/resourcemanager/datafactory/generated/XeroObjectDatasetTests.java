// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.XeroObjectDataset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class XeroObjectDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        XeroObjectDataset model = BinaryData.fromString(
            "{\"type\":\"XeroObject\",\"typeProperties\":{\"tableName\":\"datadnpfcghdttowqx\"},\"description\":\"pbzxpzl\",\"structure\":\"datavhatiywtcvzuzp\",\"schema\":\"dataeomotq\",\"linkedServiceName\":{\"referenceName\":\"ql\",\"parameters\":{\"gq\":\"datai\",\"dpfvlsqmmetwtla\":\"datazk\"}},\"parameters\":{\"cgrllyyfsmoc\":{\"type\":\"String\",\"defaultValue\":\"dataefbdpnuvh\"},\"kgdskwvb\":{\"type\":\"SecureString\",\"defaultValue\":\"datarchmetvzhuugd\"}},\"annotations\":[\"datawwayqts\",\"datanyotgnmze\",\"datacreluedcmk\"],\"folder\":{\"name\":\"heexzhhllxwk\"},\"\":{\"tkqiymmddslwnlg\":\"dataxdjklfsd\",\"ybnnnlpqdnnska\":\"datadlhmks\"}}")
            .toObject(XeroObjectDataset.class);
        Assertions.assertEquals("pbzxpzl", model.description());
        Assertions.assertEquals("ql", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.STRING, model.parameters().get("cgrllyyfsmoc").type());
        Assertions.assertEquals("heexzhhllxwk", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        XeroObjectDataset model = new XeroObjectDataset().withDescription("pbzxpzl").withStructure("datavhatiywtcvzuzp")
            .withSchema("dataeomotq")
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("ql")
                .withParameters(mapOf("gq", "datai", "dpfvlsqmmetwtla", "datazk")))
            .withParameters(mapOf("cgrllyyfsmoc",
                new ParameterSpecification().withType(ParameterType.STRING).withDefaultValue("dataefbdpnuvh"),
                "kgdskwvb",
                new ParameterSpecification().withType(ParameterType.SECURE_STRING)
                    .withDefaultValue("datarchmetvzhuugd")))
            .withAnnotations(Arrays.asList("datawwayqts", "datanyotgnmze", "datacreluedcmk"))
            .withFolder(new DatasetFolder().withName("heexzhhllxwk")).withTableName("datadnpfcghdttowqx");
        model = BinaryData.fromObject(model).toObject(XeroObjectDataset.class);
        Assertions.assertEquals("pbzxpzl", model.description());
        Assertions.assertEquals("ql", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.STRING, model.parameters().get("cgrllyyfsmoc").type());
        Assertions.assertEquals("heexzhhllxwk", model.folder().name());
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
