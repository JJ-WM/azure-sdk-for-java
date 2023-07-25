// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager;
import com.azure.resourcemanager.managednetworkfabric.models.CommunityActionTypes;
import com.azure.resourcemanager.managednetworkfabric.models.IpExtendedCommunity;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class IpExtendedCommunitiesListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"configurationState\":\"Accepted\",\"provisioningState\":\"Updating\",\"administrativeState\":\"RMA\",\"ipExtendedCommunityRules\":[{\"action\":\"Permit\",\"sequenceNumber\":4789727866315544593,\"routeTargets\":[\"gdkvviilyeshoxf\"]},{\"action\":\"Deny\",\"sequenceNumber\":4281146841382395738,\"routeTargets\":[\"upbusxyugoz\",\"plxzg\"]}],\"annotation\":\"mnotiixk\"},\"location\":\"ygbgi\",\"tags\":{\"httyizo\":\"yshybb\",\"hzzcarciuo\":\"zsurqcojasf\",\"sgnspu\":\"yipdthjfvnh\"},\"id\":\"felfchnuf\",\"name\":\"sjgbfbbach\",\"type\":\"xczzunfnbphcee\"}]}";

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

        ManagedNetworkFabricManager manager =
            ManagedNetworkFabricManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<IpExtendedCommunity> response =
            manager.ipExtendedCommunities().list(com.azure.core.util.Context.NONE);

        Assertions.assertEquals("ygbgi", response.iterator().next().location());
        Assertions.assertEquals("yshybb", response.iterator().next().tags().get("httyizo"));
        Assertions
            .assertEquals(
                CommunityActionTypes.PERMIT, response.iterator().next().ipExtendedCommunityRules().get(0).action());
        Assertions
            .assertEquals(
                4789727866315544593L, response.iterator().next().ipExtendedCommunityRules().get(0).sequenceNumber());
        Assertions
            .assertEquals(
                "gdkvviilyeshoxf", response.iterator().next().ipExtendedCommunityRules().get(0).routeTargets().get(0));
        Assertions.assertEquals("mnotiixk", response.iterator().next().annotation());
    }
}
