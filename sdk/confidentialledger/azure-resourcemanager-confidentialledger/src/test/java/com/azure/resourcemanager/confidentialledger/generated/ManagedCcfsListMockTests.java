// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confidentialledger.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.confidentialledger.ConfidentialLedgerManager;
import com.azure.resourcemanager.confidentialledger.models.LanguageRuntime;
import com.azure.resourcemanager.confidentialledger.models.ManagedCcf;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ManagedCcfsListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"appName\":\"h\",\"appUri\":\"pnvjtoqnermclf\",\"identityServiceUri\":\"phoxus\",\"memberIdentityCertificates\":[],\"deploymentType\":{\"languageRuntime\":\"CPP\",\"appSourceUri\":\"epsbjtazqu\"},\"provisioningState\":\"Canceled\",\"nodeCount\":856340492},\"location\":\"ueefjzwfqkqu\",\"tags\":{\"tcc\":\"suyonobglaocq\",\"udxytlmoyrx\":\"g\",\"qj\":\"wfudwpzntxhdzhl\"},\"id\":\"hckfrlhrx\",\"name\":\"bkyvp\",\"type\":\"ca\"}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        ConfidentialLedgerManager manager =
            ConfidentialLedgerManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<ManagedCcf> response = manager.managedCcfs().list("dhbt", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("ueefjzwfqkqu", response.iterator().next().location());
        Assertions.assertEquals("suyonobglaocq", response.iterator().next().tags().get("tcc"));
        Assertions
            .assertEquals(
                LanguageRuntime.CPP, response.iterator().next().properties().deploymentType().languageRuntime());
        Assertions.assertEquals("epsbjtazqu", response.iterator().next().properties().deploymentType().appSourceUri());
        Assertions.assertEquals(856340492, response.iterator().next().properties().nodeCount());
    }
}