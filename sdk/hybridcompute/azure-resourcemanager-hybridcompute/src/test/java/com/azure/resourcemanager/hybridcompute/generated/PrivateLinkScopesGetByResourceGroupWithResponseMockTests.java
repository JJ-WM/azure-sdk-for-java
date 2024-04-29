// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.hybridcompute.HybridComputeManager;
import com.azure.resourcemanager.hybridcompute.models.HybridComputePrivateLinkScope;
import com.azure.resourcemanager.hybridcompute.models.PublicNetworkAccessType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class PrivateLinkScopesGetByResourceGroupWithResponseMockTests {
    @Test
    public void testGetByResourceGroupWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"publicNetworkAccess\":\"Enabled\",\"provisioningState\":\"yhyhsgzfczb\",\"privateLinkScopeId\":\"mfg\",\"privateEndpointConnections\":[{\"id\":\"qgleohibetnluank\",\"name\":\"fxeeebtijvacvbm\",\"type\":\"bqqxlaj\",\"properties\":{\"privateEndpoint\":{},\"privateLinkServiceConnectionState\":{\"status\":\"acevehjkuyx\",\"description\":\"afgaoqlt\"},\"provisioningState\":\"eyl\",\"groupIds\":[\"fgvxirpghriypoqe\",\"hlqhykprlpy\",\"nuciqdsmexiit\",\"fuxtyasiibmiybnn\"]}},{\"id\":\"tgnljhnmgixhcmav\",\"name\":\"foudor\",\"type\":\"gyyprotwy\",\"properties\":{\"privateEndpoint\":{},\"privateLinkServiceConnectionState\":{\"status\":\"mbxhugcmjkav\",\"description\":\"gorbmftpm\"},\"provisioningState\":\"zfjltfvnzcyjto\",\"groupIds\":[\"opv\",\"bdb\"]}}]},\"location\":\"gqqihedsvqwt\",\"tags\":{\"ihsgq\":\"yibcy\"},\"id\":\"wdhohsdtmcdzsu\",\"name\":\"cohdx\",\"type\":\"zlmcmuapcvhdb\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        HybridComputeManager manager = HybridComputeManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        HybridComputePrivateLinkScope response = manager.privateLinkScopes()
            .getByResourceGroupWithResponse("fdgugeyzi", "grkyuizabsnmfpph", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("gqqihedsvqwt", response.location());
        Assertions.assertEquals("yibcy", response.tags().get("ihsgq"));
        Assertions.assertEquals(PublicNetworkAccessType.ENABLED, response.properties().publicNetworkAccess());
    }
}
