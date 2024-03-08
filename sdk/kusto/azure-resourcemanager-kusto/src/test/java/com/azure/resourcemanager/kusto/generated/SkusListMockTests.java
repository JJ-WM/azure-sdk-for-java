// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.kusto.KustoManager;
import com.azure.resourcemanager.kusto.models.SkuDescription;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class SkusListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"resourceType\":\"whixmonstsh\",\"name\":\"xgvelfclduccbird\",\"tier\":\"uwc\",\"locations\":[\"egstmninwjizci\",\"nghgshej\"],\"locationInfo\":[{\"location\":\"xqmul\",\"zones\":[\"xqzv\",\"ers\"],\"zoneDetails\":[{\"name\":[\"rwnamikzeb\",\"qbsms\",\"ziqgfuh\"],\"capabilities\":[{},{}]},{\"name\":[\"swhvhczznvfbycj\",\"xjww\",\"xzv\",\"mwmxqhndvnoamld\"],\"capabilities\":[{},{},{},{}]},{\"name\":[\"hdjhhflz\",\"kxcoxpelnje\",\"agltsxoa\"],\"capabilities\":[{},{}]}]},{\"location\":\"g\",\"zones\":[\"pbswvefloccsrm\"],\"zoneDetails\":[{\"name\":[\"ipgawtxx\"],\"capabilities\":[{}]},{\"name\":[\"xcjxgrytfmpcy\",\"ilrmcaykggnox\"],\"capabilities\":[{}]},{\"name\":[\"sxwpndfcpfnznthj\",\"wkjaos\"],\"capabilities\":[{},{},{},{}]},{\"name\":[\"oamktcq\",\"os\",\"gbzahgxqdlyr\",\"ltlaprltzkatbhj\"],\"capabilities\":[{},{},{}]}]}],\"restrictions\":[\"datas\",\"dataqeqala\",\"datavlagun\"]}]}";

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

        KustoManager manager =
            KustoManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<SkuDescription> response = manager.skus().list("yinljqe", com.azure.core.util.Context.NONE);
    }
}
