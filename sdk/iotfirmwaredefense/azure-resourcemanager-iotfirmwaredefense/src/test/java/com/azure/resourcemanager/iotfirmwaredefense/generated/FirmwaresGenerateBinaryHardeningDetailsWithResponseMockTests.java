// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotfirmwaredefense.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.iotfirmwaredefense.IoTFirmwareDefenseManager;
import com.azure.resourcemanager.iotfirmwaredefense.models.BinaryHardening;
import com.azure.resourcemanager.iotfirmwaredefense.models.CanaryFlag;
import com.azure.resourcemanager.iotfirmwaredefense.models.NxFlag;
import com.azure.resourcemanager.iotfirmwaredefense.models.PieFlag;
import com.azure.resourcemanager.iotfirmwaredefense.models.RelroFlag;
import com.azure.resourcemanager.iotfirmwaredefense.models.StrippedFlag;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class FirmwaresGenerateBinaryHardeningDetailsWithResponseMockTests {
    @Test
    public void testGenerateBinaryHardeningDetailsWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"binaryHardeningId\":\"fm\",\"features\":{\"nx\":\"True\",\"pie\":\"True\",\"relro\":\"True\",\"canary\":\"False\",\"stripped\":\"True\"},\"architecture\":\"hahvljuahaq\",\"path\":\"c\",\"class\":\"mdua\",\"runpath\":\"exq\",\"rpath\":\"fadmws\"}";

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

        IoTFirmwareDefenseManager manager =
            IoTFirmwareDefenseManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        BinaryHardening response =
            manager
                .firmwares()
                .generateBinaryHardeningDetailsWithResponse("v", "us", "tslhspkdeem", com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("fm", response.binaryHardeningId());
        Assertions.assertEquals("hahvljuahaq", response.architecture());
        Assertions.assertEquals("c", response.path());
        Assertions.assertEquals("mdua", response.classProperty());
        Assertions.assertEquals("exq", response.runpath());
        Assertions.assertEquals("fadmws", response.rpath());
        Assertions.assertEquals(NxFlag.TRUE, response.nx());
        Assertions.assertEquals(PieFlag.TRUE, response.pie());
        Assertions.assertEquals(RelroFlag.TRUE, response.relro());
        Assertions.assertEquals(CanaryFlag.FALSE, response.canary());
        Assertions.assertEquals(StrippedFlag.TRUE, response.stripped());
    }
}
