// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmosdbforpostgresql.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.cosmosdbforpostgresql.CosmosDBForPostgreSqlManager;
import com.azure.resourcemanager.cosmosdbforpostgresql.fluent.models.ServerConfigurationInner;
import com.azure.resourcemanager.cosmosdbforpostgresql.models.ServerConfiguration;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ConfigurationsUpdateOnNodeMockTests {
    @Test
    public void testUpdateOnNode() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"properties\":{\"value\":\"c\",\"source\":\"fwdsj\",\"description\":\"aljutiiswac\",\"defaultValue\":\"gdkz\",\"dataType\":\"Enumeration\",\"allowedValues\":\"fvhqc\",\"requiresRestart\":true,\"provisioningState\":\"Succeeded\"},\"id\":\"n\",\"name\":\"pfuflrw\",\"type\":\"mh\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito.when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito.when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito.when(httpClient.send(httpRequest.capture(), Mockito.any())).thenReturn(Mono.defer(() -> {
            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
            return Mono.just(httpResponse);
        }));

        CosmosDBForPostgreSqlManager manager = CosmosDBForPostgreSqlManager.configure().withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        ServerConfiguration response = manager.configurations().updateOnNode("wlauwzizxbmpg", "jefuzmuvpbttdumo", "p",
            new ServerConfigurationInner().withValue("ebmnzbtbhjpglk"), com.azure.core.util.Context.NONE);

        Assertions.assertEquals("c", response.value());
    }
}
