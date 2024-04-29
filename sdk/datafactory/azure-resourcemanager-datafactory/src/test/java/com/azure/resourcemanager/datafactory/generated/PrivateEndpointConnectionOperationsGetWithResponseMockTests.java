// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.datafactory.DataFactoryManager;
import com.azure.resourcemanager.datafactory.models.PrivateEndpointConnectionResource;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class PrivateEndpointConnectionOperationsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"provisioningState\":\"lkoduxmi\",\"privateEndpoint\":{\"id\":\"ty\"},\"privateLinkServiceConnectionState\":{\"status\":\"fhzluvlyewepzvfg\",\"description\":\"zxwpqykogbppux\",\"actionsRequired\":\"uldar\"}},\"name\":\"lbkaipapktxe\",\"type\":\"fogs\",\"etag\":\"vn\",\"id\":\"vskdqersaw\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DataFactoryManager manager = DataFactoryManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PrivateEndpointConnectionResource response = manager.privateEndpointConnectionOperations()
            .getWithResponse("lsddaw", "waiviktuxnj", "zdmvrsckc", "rlojgzzfevjexy", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("vskdqersaw", response.id());
        Assertions.assertEquals("fhzluvlyewepzvfg", response.properties().privateLinkServiceConnectionState().status());
        Assertions.assertEquals("zxwpqykogbppux",
            response.properties().privateLinkServiceConnectionState().description());
        Assertions.assertEquals("uldar", response.properties().privateLinkServiceConnectionState().actionsRequired());
    }
}
