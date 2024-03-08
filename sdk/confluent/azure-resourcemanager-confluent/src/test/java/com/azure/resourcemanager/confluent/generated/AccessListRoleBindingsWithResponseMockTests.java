// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confluent.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.confluent.ConfluentManager;
import com.azure.resourcemanager.confluent.models.AccessListRoleBindingsSuccessResponse;
import com.azure.resourcemanager.confluent.models.ListAccessRequestModel;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class AccessListRoleBindingsWithResponseMockTests {
    @Test
    public void testListRoleBindingsWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"kind\":\"qcaaewdaomdjvl\",\"metadata\":{\"first\":\"xkzb\",\"last\":\"sgeivsiy\",\"prev\":\"kdncj\",\"next\":\"onbzoggculapzwy\",\"total_size\":1152319383},\"data\":[{\"kind\":\"qxepnylbfuaj\",\"id\":\"jtlvofqzhvfciby\",\"metadata\":{\"self\":\"wuxrkjpvdwxfzwi\",\"resource_name\":\"wzjbh\",\"created_at\":\"sxjrk\",\"updated_at\":\"btrnegvm\",\"deleted_at\":\"uqeqv\"},\"principal\":\"spastjbkkdmf\",\"role_name\":\"est\",\"crn_pattern\":\"lx\"},{\"kind\":\"ilozapeewchpxlk\",\"id\":\"kuziycsle\",\"metadata\":{\"self\":\"uztcktyhjtqed\",\"resource_name\":\"zulwmmrqzzrrj\",\"created_at\":\"gl\",\"updated_at\":\"zgkrvqe\",\"deleted_at\":\"toepryu\"},\"principal\":\"wytpzdmovz\",\"role_name\":\"va\",\"crn_pattern\":\"zqadf\"}]}";

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

        ConfluentManager manager = ConfluentManager.configure().withHttpClient(httpClient).authenticate(
            tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
            new AzureProfile("", "", AzureEnvironment.AZURE));

        AccessListRoleBindingsSuccessResponse response
            = manager.access()
                .listRoleBindingsWithResponse("xlllchp", "db",
                    new ListAccessRequestModel().withSearchFilters(mapOf("hfuk", "wrd", "fcvlerch", "vsjcswsmystuluqy",
                        "xsspuunnoxyhk", "qbmfpjbabwidf", "ddrihpf", "g")),
                    com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("qcaaewdaomdjvl", response.kind());
        Assertions.assertEquals("xkzb", response.metadata().first());
        Assertions.assertEquals("sgeivsiy", response.metadata().last());
        Assertions.assertEquals("kdncj", response.metadata().prev());
        Assertions.assertEquals("onbzoggculapzwy", response.metadata().next());
        Assertions.assertEquals(1152319383, response.metadata().totalSize());
        Assertions.assertEquals("qxepnylbfuaj", response.data().get(0).kind());
        Assertions.assertEquals("jtlvofqzhvfciby", response.data().get(0).id());
        Assertions.assertEquals("wuxrkjpvdwxfzwi", response.data().get(0).metadata().self());
        Assertions.assertEquals("wzjbh", response.data().get(0).metadata().resourceName());
        Assertions.assertEquals("sxjrk", response.data().get(0).metadata().createdAt());
        Assertions.assertEquals("btrnegvm", response.data().get(0).metadata().updatedAt());
        Assertions.assertEquals("uqeqv", response.data().get(0).metadata().deletedAt());
        Assertions.assertEquals("spastjbkkdmf", response.data().get(0).principal());
        Assertions.assertEquals("est", response.data().get(0).roleName());
        Assertions.assertEquals("lx", response.data().get(0).crnPattern());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
