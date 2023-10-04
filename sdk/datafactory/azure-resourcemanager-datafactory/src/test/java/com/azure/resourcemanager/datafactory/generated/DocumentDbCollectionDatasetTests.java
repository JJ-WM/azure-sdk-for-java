// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.DocumentDbCollectionDataset;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DocumentDbCollectionDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DocumentDbCollectionDataset model =
            BinaryData
                .fromString(
                    "{\"type\":\"DocumentDbCollection\",\"typeProperties\":{\"collectionName\":\"datawxdowum\"},\"description\":\"ukrcdiohcl\",\"structure\":\"datadnhfknebwedd\",\"schema\":\"datayzcwy\",\"linkedServiceName\":{\"referenceName\":\"smkaqldqab\",\"parameters\":{\"qbqxfbbigcfd\":\"datap\",\"bmjyyrqaedwovoc\":\"dataofxn\",\"ayokrwfmihw\":\"datatjgo\"}},\"parameters\":{\"vothmkhjaoz\":{\"type\":\"Array\",\"defaultValue\":\"datadbfobdc\"},\"rhjvszfqbokndwpp\":{\"type\":\"Bool\",\"defaultValue\":\"datafcnjhbpoelhscmy\"},\"lynzlyvap\":{\"type\":\"SecureString\",\"defaultValue\":\"dataojoevzzufytdx\"},\"lcuhaizi\":{\"type\":\"Bool\",\"defaultValue\":\"databuoggtdl\"}},\"annotations\":[\"dataylzeohlpsftq\",\"datarvmhvbvvcpwt\",\"datasuspnhmzy\"],\"folder\":{\"name\":\"etevrntfknwacy\"},\"\":{\"atvcsxr\":\"dataotctkhfhf\",\"cubleh\":\"datahnmizhvprhqq\"}}")
                .toObject(DocumentDbCollectionDataset.class);
        Assertions.assertEquals("ukrcdiohcl", model.description());
        Assertions.assertEquals("smkaqldqab", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.ARRAY, model.parameters().get("vothmkhjaoz").type());
        Assertions.assertEquals("etevrntfknwacy", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DocumentDbCollectionDataset model =
            new DocumentDbCollectionDataset()
                .withDescription("ukrcdiohcl")
                .withStructure("datadnhfknebwedd")
                .withSchema("datayzcwy")
                .withLinkedServiceName(
                    new LinkedServiceReference()
                        .withReferenceName("smkaqldqab")
                        .withParameters(
                            mapOf("qbqxfbbigcfd", "datap", "bmjyyrqaedwovoc", "dataofxn", "ayokrwfmihw", "datatjgo")))
                .withParameters(
                    mapOf(
                        "vothmkhjaoz",
                        new ParameterSpecification().withType(ParameterType.ARRAY).withDefaultValue("datadbfobdc"),
                        "rhjvszfqbokndwpp",
                        new ParameterSpecification()
                            .withType(ParameterType.BOOL)
                            .withDefaultValue("datafcnjhbpoelhscmy"),
                        "lynzlyvap",
                        new ParameterSpecification()
                            .withType(ParameterType.SECURE_STRING)
                            .withDefaultValue("dataojoevzzufytdx"),
                        "lcuhaizi",
                        new ParameterSpecification().withType(ParameterType.BOOL).withDefaultValue("databuoggtdl")))
                .withAnnotations(Arrays.asList("dataylzeohlpsftq", "datarvmhvbvvcpwt", "datasuspnhmzy"))
                .withFolder(new DatasetFolder().withName("etevrntfknwacy"))
                .withCollectionName("datawxdowum");
        model = BinaryData.fromObject(model).toObject(DocumentDbCollectionDataset.class);
        Assertions.assertEquals("ukrcdiohcl", model.description());
        Assertions.assertEquals("smkaqldqab", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.ARRAY, model.parameters().get("vothmkhjaoz").type());
        Assertions.assertEquals("etevrntfknwacy", model.folder().name());
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
