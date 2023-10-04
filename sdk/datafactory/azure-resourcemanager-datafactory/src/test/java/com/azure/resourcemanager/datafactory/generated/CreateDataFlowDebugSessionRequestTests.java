// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.CreateDataFlowDebugSessionRequest;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntime;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeDebugResource;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class CreateDataFlowDebugSessionRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CreateDataFlowDebugSessionRequest model =
            BinaryData
                .fromString(
                    "{\"computeType\":\"foudor\",\"coreCount\":199814192,\"timeToLive\":1885072328,\"integrationRuntime\":{\"properties\":{\"type\":\"IntegrationRuntime\",\"description\":\"otwypundmb\",\"\":{\"or\":\"datagcmjkavl\",\"jltfvnzcyjtotpv\":\"datamftpmdtz\",\"qwthmky\":\"datapvpbdbzqgqqiheds\",\"gqcwdhohsdtmc\":\"databcysih\"}},\"name\":\"sufco\"}}")
                .toObject(CreateDataFlowDebugSessionRequest.class);
        Assertions.assertEquals("foudor", model.computeType());
        Assertions.assertEquals(199814192, model.coreCount());
        Assertions.assertEquals(1885072328, model.timeToLive());
        Assertions.assertEquals("sufco", model.integrationRuntime().name());
        Assertions.assertEquals("otwypundmb", model.integrationRuntime().properties().description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CreateDataFlowDebugSessionRequest model =
            new CreateDataFlowDebugSessionRequest()
                .withComputeType("foudor")
                .withCoreCount(199814192)
                .withTimeToLive(1885072328)
                .withIntegrationRuntime(
                    new IntegrationRuntimeDebugResource()
                        .withName("sufco")
                        .withProperties(
                            new IntegrationRuntime()
                                .withDescription("otwypundmb")
                                .withAdditionalProperties(mapOf("type", "IntegrationRuntime"))));
        model = BinaryData.fromObject(model).toObject(CreateDataFlowDebugSessionRequest.class);
        Assertions.assertEquals("foudor", model.computeType());
        Assertions.assertEquals(199814192, model.coreCount());
        Assertions.assertEquals(1885072328, model.timeToLive());
        Assertions.assertEquals("sufco", model.integrationRuntime().name());
        Assertions.assertEquals("otwypundmb", model.integrationRuntime().properties().description());
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
