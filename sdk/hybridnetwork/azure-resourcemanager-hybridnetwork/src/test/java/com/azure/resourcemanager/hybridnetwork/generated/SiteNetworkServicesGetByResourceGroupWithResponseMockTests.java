// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.hybridnetwork.HybridNetworkManager;
import com.azure.resourcemanager.hybridnetwork.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.hybridnetwork.models.SiteNetworkService;
import com.azure.resourcemanager.hybridnetwork.models.SkuName;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class SiteNetworkServicesGetByResourceGroupWithResponseMockTests {
    @Test
    public void testGetByResourceGroupWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"properties\":{\"provisioningState\":\"Canceled\",\"managedResourceGroupConfiguration\":{\"name\":\"k\",\"location\":\"rhtssr\"},\"siteReference\":{\"id\":\"mdvhazcvjy\"},\"publisherName\":\"qswbqerzwx\",\"publisherScope\":\"Unknown\",\"networkServiceDesignGroupName\":\"tdgukvlbp\",\"networkServiceDesignVersionName\":\"gdstyouam\",\"networkServiceDesignVersionOfferingLocation\":\"wreswmowegm\",\"networkServiceDesignVersionResourceReference\":{\"idType\":\"DeploymentResourceIdReference\"},\"desiredStateConfigurationGroupValueReferences\":{\"qigijiitnspxlzde\":{\"id\":\"xeyg\"},\"ueqfrojsyd\":{\"id\":\"grijwaiufanrayb\"},\"dkygywezski\":{\"id\":\"h\"}},\"lastStateNetworkServiceDesignVersionName\":\"afygzmxieqvds\",\"lastStateConfigurationGroupValueReferences\":{\"ijpodtblxpkkwj\":{\"id\":\"ixqcahyhxalybxaw\"},\"ncn\":{\"id\":\"odqhyk\"},\"oqodkadpp\":{\"id\":\"mehllizhceu\"},\"hydt\":{\"id\":\"bngqladywrx\"}}},\"identity\":{\"principalId\":\"f64cb821-1af6-4ecd-b2bf-f8f3c7bc2dc7\",\"tenantId\":\"b8931f8c-cc35-4c3d-baaf-dd917149ea38\",\"type\":\"SystemAssigned\",\"userAssignedIdentities\":{\"snuyemlowuowhl\":{\"principalId\":\"1b305406-ab40-4eb8-99f1-275932a8f97c\",\"clientId\":\"910f3f2c-8b00-4c42-9fc3-9664ff207ecb\"},\"wyrmouv\":{\"principalId\":\"e81abe59-5d90-44d2-9359-842d060d5233\",\"clientId\":\"c11fdb58-2b70-44b8-baa8-480278446cd0\"},\"mo\":{\"principalId\":\"dbc5b7c1-e9d9-4666-97ca-ca0f72c191ab\",\"clientId\":\"6891e437-ea25-4b22-b602-452c8df29fba\"},\"ltrfowtdvrf\":{\"principalId\":\"a751995c-ff13-450d-a4da-fa9394c8ec78\",\"clientId\":\"05a63493-4043-49fd-bddb-7d2f7aeafe4a\"}}},\"sku\":{\"name\":\"Standard\",\"tier\":\"Basic\"},\"location\":\"vjdrqcrjidhftuk\",\"tags\":{\"fqz\":\"xlwyoj\",\"xmbjroum\":\"kfnjyixhafrat\",\"l\":\"znv\"},\"id\":\"jrhuzgf\",\"name\":\"on\",\"type\":\"tpusllywp\"}";

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

        HybridNetworkManager manager = HybridNetworkManager.configure().withHttpClient(httpClient).authenticate(
            tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
            new AzureProfile("", "", AzureEnvironment.AZURE));

        SiteNetworkService response = manager.siteNetworkServices()
            .getByResourceGroupWithResponse("clid", "tujwjju", com.azure.core.util.Context.NONE).getValue();

        Assertions.assertEquals("vjdrqcrjidhftuk", response.location());
        Assertions.assertEquals("xlwyoj", response.tags().get("fqz"));
        Assertions.assertEquals("k", response.properties().managedResourceGroupConfiguration().name());
        Assertions.assertEquals("rhtssr", response.properties().managedResourceGroupConfiguration().location());
        Assertions.assertEquals("mdvhazcvjy", response.properties().siteReference().id());
        Assertions.assertEquals("xeyg",
            response.properties().desiredStateConfigurationGroupValueReferences().get("qigijiitnspxlzde").id());
        Assertions.assertEquals(ManagedServiceIdentityType.SYSTEM_ASSIGNED, response.identity().type());
        Assertions.assertEquals(SkuName.STANDARD, response.sku().name());
    }
}
