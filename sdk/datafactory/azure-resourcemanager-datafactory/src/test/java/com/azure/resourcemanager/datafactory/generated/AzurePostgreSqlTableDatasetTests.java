// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzurePostgreSqlTableDataset;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AzurePostgreSqlTableDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzurePostgreSqlTableDataset model =
            BinaryData
                .fromString(
                    "{\"type\":\"AzurePostgreSqlTable\",\"typeProperties\":{\"tableName\":\"dataj\",\"table\":\"datawrduxntpfxxgja\",\"schema\":\"dataxfwf\"},\"description\":\"qv\",\"structure\":\"datafbkqynlzxem\",\"schema\":\"dataupjckiehdm\",\"linkedServiceName\":{\"referenceName\":\"foyrxxxffgmcua\",\"parameters\":{\"csapvbcqpfus\":\"dataeervgc\",\"k\":\"datakijhmine\",\"rkvorlfqmljewyn\":\"dataivp\",\"vlnpbsotmynklnm\":\"datafvvcwvurkmjufa\"}},\"parameters\":{\"keipxutc\":{\"type\":\"Int\",\"defaultValue\":\"datavrkkfcwxizkstxne\"},\"tvsayyaeiiv\":{\"type\":\"Array\",\"defaultValue\":\"dataiuvnfaz\"},\"xqetxtdqius\":{\"type\":\"Float\",\"defaultValue\":\"dataqtjwrvewojoq\"},\"mjsisfqqhc\":{\"type\":\"Array\",\"defaultValue\":\"datazljvgjijzqjhljsa\"}},\"annotations\":[\"dataagsbfeiir\",\"datanjygllfkchhgsj\"],\"folder\":{\"name\":\"c\"},\"\":{\"khdhpmkxdujkxpuq\":\"datawmqcycabaam\",\"ezxiz\":\"datadyoqywsuarpzhry\",\"azccouhwivkd\":\"datasyxbfjilb\",\"pi\":\"datavjsknrbxz\"}}")
                .toObject(AzurePostgreSqlTableDataset.class);
        Assertions.assertEquals("qv", model.description());
        Assertions.assertEquals("foyrxxxffgmcua", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.INT, model.parameters().get("keipxutc").type());
        Assertions.assertEquals("c", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzurePostgreSqlTableDataset model =
            new AzurePostgreSqlTableDataset()
                .withDescription("qv")
                .withStructure("datafbkqynlzxem")
                .withSchema("dataupjckiehdm")
                .withLinkedServiceName(
                    new LinkedServiceReference()
                        .withReferenceName("foyrxxxffgmcua")
                        .withParameters(
                            mapOf(
                                "csapvbcqpfus",
                                "dataeervgc",
                                "k",
                                "datakijhmine",
                                "rkvorlfqmljewyn",
                                "dataivp",
                                "vlnpbsotmynklnm",
                                "datafvvcwvurkmjufa")))
                .withParameters(
                    mapOf(
                        "keipxutc",
                        new ParameterSpecification()
                            .withType(ParameterType.INT)
                            .withDefaultValue("datavrkkfcwxizkstxne"),
                        "tvsayyaeiiv",
                        new ParameterSpecification().withType(ParameterType.ARRAY).withDefaultValue("dataiuvnfaz"),
                        "xqetxtdqius",
                        new ParameterSpecification().withType(ParameterType.FLOAT).withDefaultValue("dataqtjwrvewojoq"),
                        "mjsisfqqhc",
                        new ParameterSpecification()
                            .withType(ParameterType.ARRAY)
                            .withDefaultValue("datazljvgjijzqjhljsa")))
                .withAnnotations(Arrays.asList("dataagsbfeiir", "datanjygllfkchhgsj"))
                .withFolder(new DatasetFolder().withName("c"))
                .withTableName("dataj")
                .withTable("datawrduxntpfxxgja")
                .withSchemaTypePropertiesSchema("dataxfwf");
        model = BinaryData.fromObject(model).toObject(AzurePostgreSqlTableDataset.class);
        Assertions.assertEquals("qv", model.description());
        Assertions.assertEquals("foyrxxxffgmcua", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.INT, model.parameters().get("keipxutc").type());
        Assertions.assertEquals("c", model.folder().name());
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
