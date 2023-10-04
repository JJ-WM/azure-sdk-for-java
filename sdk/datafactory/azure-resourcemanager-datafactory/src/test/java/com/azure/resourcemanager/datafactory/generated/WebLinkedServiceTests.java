// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.WebLinkedService;
import com.azure.resourcemanager.datafactory.models.WebLinkedServiceTypeProperties;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class WebLinkedServiceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WebLinkedService model =
            BinaryData
                .fromString(
                    "{\"type\":\"Web\",\"typeProperties\":{\"authenticationType\":\"WebLinkedServiceTypeProperties\",\"url\":\"datamlm\"},\"connectVia\":{\"referenceName\":\"qyek\",\"parameters\":{\"egumydogrtfwzecg\":\"datadxz\",\"anvgpxnaa\":\"dataxrcsevqjdxiiqwqb\"}},\"description\":\"tnkruywrxnks\",\"parameters\":{\"rqwfuxntuegy\":{\"type\":\"SecureString\",\"defaultValue\":\"datarxjsmrseauxeovb\"}},\"annotations\":[\"dataketkvi\"],\"\":{\"hbxgfhgkdms\":\"datahatfgk\"}}")
                .toObject(WebLinkedService.class);
        Assertions.assertEquals("qyek", model.connectVia().referenceName());
        Assertions.assertEquals("tnkruywrxnks", model.description());
        Assertions.assertEquals(ParameterType.SECURE_STRING, model.parameters().get("rqwfuxntuegy").type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WebLinkedService model =
            new WebLinkedService()
                .withConnectVia(
                    new IntegrationRuntimeReference()
                        .withReferenceName("qyek")
                        .withParameters(mapOf("egumydogrtfwzecg", "datadxz", "anvgpxnaa", "dataxrcsevqjdxiiqwqb")))
                .withDescription("tnkruywrxnks")
                .withParameters(
                    mapOf(
                        "rqwfuxntuegy",
                        new ParameterSpecification()
                            .withType(ParameterType.SECURE_STRING)
                            .withDefaultValue("datarxjsmrseauxeovb")))
                .withAnnotations(Arrays.asList("dataketkvi"))
                .withTypeProperties(new WebLinkedServiceTypeProperties().withUrl("datamlm"));
        model = BinaryData.fromObject(model).toObject(WebLinkedService.class);
        Assertions.assertEquals("qyek", model.connectVia().referenceName());
        Assertions.assertEquals("tnkruywrxnks", model.description());
        Assertions.assertEquals(ParameterType.SECURE_STRING, model.parameters().get("rqwfuxntuegy").type());
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
