// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.networkcloud.NetworkCloudManager;
import com.azure.resourcemanager.networkcloud.models.HybridAksIpamEnabled;
import com.azure.resourcemanager.networkcloud.models.HybridAksPluginType;
import com.azure.resourcemanager.networkcloud.models.IpAllocationType;
import com.azure.resourcemanager.networkcloud.models.L3Network;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class L3NetworksListByResourceGroupMockTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"extendedLocation\":{\"name\":\"apeqiscrpil\",\"type\":\"ftr\"},\"properties\":{\"associatedResourceIds\":[\"jdaahuqimldahlfx\",\"muifmuadjnfsn\",\"skiioshjgczetybn\"],\"clusterId\":\"ztlcgc\",\"detailedStatus\":\"Error\",\"detailedStatusMessage\":\"fjvmy\",\"hybridAksClustersAssociatedIds\":[\"ebecuvlbefv\",\"cljkxpyl\"],\"hybridAksIpamEnabled\":\"True\",\"hybridAksPluginType\":\"SRIOV\",\"interfaceName\":\"wpsyxjij\",\"ipAllocationType\":\"IPV6\",\"ipv4ConnectedPrefix\":\"vrbkerdkdkgaw\",\"ipv6ConnectedPrefix\":\"jxildfkcef\",\"l3IsolationDomainId\":\"ygzqpjoisfmn\",\"provisioningState\":\"Accepted\",\"virtualMachinesAssociatedIds\":[\"nxumentqo\",\"tw\",\"ymxymu\"],\"vlan\":2243722311789555333},\"location\":\"qtow\",\"tags\":{\"ajcywhjqw\":\"sycoybajasqub\",\"ymjzpwdlvwtiws\":\"chqohtfxcpupuk\"},\"id\":\"osaonhqnamppu\",\"name\":\"tassaekewna\",\"type\":\"eajbkajlcyizyddc\"}]}";

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

        NetworkCloudManager manager =
            NetworkCloudManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<L3Network> response =
            manager.l3Networks().listByResourceGroup("xcbccwkqmt", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("qtow", response.iterator().next().location());
        Assertions.assertEquals("sycoybajasqub", response.iterator().next().tags().get("ajcywhjqw"));
        Assertions.assertEquals("apeqiscrpil", response.iterator().next().extendedLocation().name());
        Assertions.assertEquals("ftr", response.iterator().next().extendedLocation().type());
        Assertions.assertEquals(HybridAksIpamEnabled.TRUE, response.iterator().next().hybridAksIpamEnabled());
        Assertions.assertEquals(HybridAksPluginType.SRIOV, response.iterator().next().hybridAksPluginType());
        Assertions.assertEquals("wpsyxjij", response.iterator().next().interfaceName());
        Assertions.assertEquals(IpAllocationType.IPV6, response.iterator().next().ipAllocationType());
        Assertions.assertEquals("vrbkerdkdkgaw", response.iterator().next().ipv4ConnectedPrefix());
        Assertions.assertEquals("jxildfkcef", response.iterator().next().ipv6ConnectedPrefix());
        Assertions.assertEquals("ygzqpjoisfmn", response.iterator().next().l3IsolationDomainId());
        Assertions.assertEquals(2243722311789555333L, response.iterator().next().vlan());
    }
}
