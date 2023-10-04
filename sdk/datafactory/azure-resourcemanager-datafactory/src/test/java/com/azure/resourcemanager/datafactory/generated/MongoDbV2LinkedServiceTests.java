// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeReference;
import com.azure.resourcemanager.datafactory.models.MongoDbV2LinkedService;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class MongoDbV2LinkedServiceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MongoDbV2LinkedService model =
            BinaryData
                .fromString(
                    "{\"type\":\"MongoDbV2\",\"typeProperties\":{\"connectionString\":\"datajafbdvpcdzdbjz\",\"database\":\"datarpxj\"},\"connectVia\":{\"referenceName\":\"aup\",\"parameters\":{\"nkaqngvgjgcww\":\"datad\",\"n\":\"datausjjhtcy\",\"svwq\":\"datahighnxhgmfrnk\"}},\"description\":\"r\",\"parameters\":{\"uksttxime\":{\"type\":\"String\",\"defaultValue\":\"dataujmmkni\"},\"weo\":{\"type\":\"Float\",\"defaultValue\":\"datasflgme\"},\"agigbpabacpleirj\":{\"type\":\"Bool\",\"defaultValue\":\"datarptjwvzapybde\"}},\"annotations\":[\"datak\"],\"\":{\"bdukid\":\"datadubmazlx\",\"kpardo\":\"dataqeyqrlgpkypb\",\"yhbzmgzsyt\":\"datadtedxz\",\"sqsbq\":\"datapfslrx\"}}")
                .toObject(MongoDbV2LinkedService.class);
        Assertions.assertEquals("aup", model.connectVia().referenceName());
        Assertions.assertEquals("r", model.description());
        Assertions.assertEquals(ParameterType.STRING, model.parameters().get("uksttxime").type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MongoDbV2LinkedService model =
            new MongoDbV2LinkedService()
                .withConnectVia(
                    new IntegrationRuntimeReference()
                        .withReferenceName("aup")
                        .withParameters(
                            mapOf("nkaqngvgjgcww", "datad", "n", "datausjjhtcy", "svwq", "datahighnxhgmfrnk")))
                .withDescription("r")
                .withParameters(
                    mapOf(
                        "uksttxime",
                        new ParameterSpecification().withType(ParameterType.STRING).withDefaultValue("dataujmmkni"),
                        "weo",
                        new ParameterSpecification().withType(ParameterType.FLOAT).withDefaultValue("datasflgme"),
                        "agigbpabacpleirj",
                        new ParameterSpecification()
                            .withType(ParameterType.BOOL)
                            .withDefaultValue("datarptjwvzapybde")))
                .withAnnotations(Arrays.asList("datak"))
                .withConnectionString("datajafbdvpcdzdbjz")
                .withDatabase("datarpxj");
        model = BinaryData.fromObject(model).toObject(MongoDbV2LinkedService.class);
        Assertions.assertEquals("aup", model.connectVia().referenceName());
        Assertions.assertEquals("r", model.description());
        Assertions.assertEquals(ParameterType.STRING, model.parameters().get("uksttxime").type());
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
