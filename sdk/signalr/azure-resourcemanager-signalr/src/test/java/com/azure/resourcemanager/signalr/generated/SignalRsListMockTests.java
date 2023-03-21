// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.signalr.SignalRManager;
import com.azure.resourcemanager.signalr.models.AclAction;
import com.azure.resourcemanager.signalr.models.ManagedIdentityType;
import com.azure.resourcemanager.signalr.models.ServiceKind;
import com.azure.resourcemanager.signalr.models.SignalRResource;
import com.azure.resourcemanager.signalr.models.SignalRSkuTier;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class SignalRsListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"sku\":{\"name\":\"yrnxxmueedn\",\"tier\":\"Basic\",\"size\":\"stkwqqtch\",\"family\":\"lmfmtdaay\",\"capacity\":76843266},\"properties\":{\"provisioningState\":\"Moving\",\"externalIP\":\"iohgwxrtfud\",\"hostName\":\"pxgy\",\"publicPort\":581712977,\"serverPort\":1910249555,\"version\":\"mnpkukghimdblxg\",\"privateEndpointConnections\":[],\"sharedPrivateLinkResources\":[],\"tls\":{\"clientCertEnabled\":false},\"hostNamePrefix\":\"xw\",\"features\":[],\"liveTraceConfiguration\":{\"enabled\":\"foqreyfkzik\",\"categories\":[]},\"resourceLogConfiguration\":{\"categories\":[]},\"cors\":{\"allowedOrigins\":[]},\"serverless\":{\"connectionTimeoutInSeconds\":841259449},\"upstream\":{\"templates\":[]},\"networkACLs\":{\"defaultAction\":\"Deny\",\"privateEndpoints\":[]},\"publicNetworkAccess\":\"irels\",\"disableLocalAuth\":false,\"disableAadAuth\":true},\"kind\":\"SignalR\",\"identity\":{\"type\":\"UserAssigned\",\"userAssignedIdentities\":{},\"principalId\":\"ddxbjhwuaanoz\",\"tenantId\":\"sphyoulpjrvxa\"},\"location\":\"rvimjwosytxitcsk\",\"tags\":{\"miekkezzikhlyfjh\":\"tq\"},\"id\":\"gqggebdunygae\",\"name\":\"idb\",\"type\":\"fatpxllrxcyjmoa\"}]}";

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

        SignalRManager manager =
            SignalRManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<SignalRResource> response = manager.signalRs().list(com.azure.core.util.Context.NONE);

        Assertions.assertEquals("rvimjwosytxitcsk", response.iterator().next().location());
        Assertions.assertEquals("tq", response.iterator().next().tags().get("miekkezzikhlyfjh"));
        Assertions.assertEquals("yrnxxmueedn", response.iterator().next().sku().name());
        Assertions.assertEquals(SignalRSkuTier.BASIC, response.iterator().next().sku().tier());
        Assertions.assertEquals(76843266, response.iterator().next().sku().capacity());
        Assertions.assertEquals(ServiceKind.SIGNALR, response.iterator().next().kind());
        Assertions.assertEquals(ManagedIdentityType.USER_ASSIGNED, response.iterator().next().identity().type());
        Assertions.assertEquals(false, response.iterator().next().tls().clientCertEnabled());
        Assertions.assertEquals("foqreyfkzik", response.iterator().next().liveTraceConfiguration().enabled());
        Assertions.assertEquals(841259449, response.iterator().next().serverless().connectionTimeoutInSeconds());
        Assertions.assertEquals(AclAction.DENY, response.iterator().next().networkACLs().defaultAction());
        Assertions.assertEquals("irels", response.iterator().next().publicNetworkAccess());
        Assertions.assertEquals(false, response.iterator().next().disableLocalAuth());
        Assertions.assertEquals(true, response.iterator().next().disableAadAuth());
    }
}
