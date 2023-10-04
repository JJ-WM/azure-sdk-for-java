// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.maintenance.MaintenanceManager;
import com.azure.resourcemanager.maintenance.models.MaintenanceConfiguration;
import com.azure.resourcemanager.maintenance.models.MaintenanceScope;
import com.azure.resourcemanager.maintenance.models.RebootOptions;
import com.azure.resourcemanager.maintenance.models.Visibility;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class MaintenanceConfigurationsDeleteByResourceGroupWithResponseMockTests {
    @Test
    public void testDeleteWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"location\":\"jmfxumvf\",\"tags\":{\"wxnb\":\"yo\",\"rujbzbomvzzbtdc\":\"fezzxscyhwzdg\"},\"properties\":{\"namespace\":\"niyujv\",\"extensionProperties\":{\"ssnrbgye\":\"wdsh\"},\"maintenanceScope\":\"Extension\",\"maintenanceWindow\":{\"startDateTime\":\"gaojf\",\"expirationDateTime\":\"nc\",\"duration\":\"mrfhirctymox\",\"timeZone\":\"tpipiwyczuhx\",\"recurEvery\":\"pqjlihhyusps\"},\"visibility\":\"Public\",\"installPatches\":{\"rebootSetting\":\"IfRequired\",\"windowsParameters\":{\"kbNumbersToExclude\":[\"dgzxulucvpamrsr\",\"uzvx\",\"risjnhnytxifqjz\"],\"kbNumbersToInclude\":[\"rhublwpcesutrg\",\"upauut\",\"woqhihe\"],\"classificationsToInclude\":[\"w\"],\"excludeKbsRequiringReboot\":false},\"linuxParameters\":{\"packageNameMasksToExclude\":[\"tcypsxjvfoim\"],\"packageNameMasksToInclude\":[\"lirc\",\"zjxvydfcea\"],\"classificationsToInclude\":[\"hvygdyftumr\",\"wnawjslbiw\",\"ojgcyzt\"]}}},\"id\":\"mznbaeqphch\",\"name\":\"nrnrp\",\"type\":\"ehuwrykqgaifmvik\"}";

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

        MaintenanceManager manager =
            MaintenanceManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        MaintenanceConfiguration response =
            manager
                .maintenanceConfigurations()
                .deleteByResourceGroupWithResponse("hhavgrvkffovjz", "pjbi", com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("jmfxumvf", response.location());
        Assertions.assertEquals("yo", response.tags().get("wxnb"));
        Assertions.assertEquals("niyujv", response.namespace());
        Assertions.assertEquals("wdsh", response.extensionProperties().get("ssnrbgye"));
        Assertions.assertEquals(MaintenanceScope.EXTENSION, response.maintenanceScope());
        Assertions.assertEquals(Visibility.PUBLIC, response.visibility());
        Assertions.assertEquals(RebootOptions.IF_REQUIRED, response.installPatches().rebootSetting());
        Assertions
            .assertEquals("dgzxulucvpamrsr", response.installPatches().windowsParameters().kbNumbersToExclude().get(0));
        Assertions
            .assertEquals("rhublwpcesutrg", response.installPatches().windowsParameters().kbNumbersToInclude().get(0));
        Assertions.assertEquals("w", response.installPatches().windowsParameters().classificationsToInclude().get(0));
        Assertions.assertEquals(false, response.installPatches().windowsParameters().excludeKbsRequiringReboot());
        Assertions
            .assertEquals(
                "tcypsxjvfoim", response.installPatches().linuxParameters().packageNameMasksToExclude().get(0));
        Assertions.assertEquals("lirc", response.installPatches().linuxParameters().packageNameMasksToInclude().get(0));
        Assertions
            .assertEquals("hvygdyftumr", response.installPatches().linuxParameters().classificationsToInclude().get(0));
        Assertions.assertEquals("gaojf", response.startDateTime());
        Assertions.assertEquals("nc", response.expirationDateTime());
        Assertions.assertEquals("mrfhirctymox", response.duration());
        Assertions.assertEquals("tpipiwyczuhx", response.timeZone());
        Assertions.assertEquals("pqjlihhyusps", response.recurEvery());
    }
}
