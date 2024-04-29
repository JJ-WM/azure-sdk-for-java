// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.devcenter.DevCenterManager;
import com.azure.resourcemanager.devcenter.models.EnvironmentType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class EnvironmentTypesCreateOrUpdateWithResponseMockTests {
    @Test
    public void testCreateOrUpdateWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"provisioningState\":\"Canceled\",\"displayName\":\"gueiookjbsahrtdt\"},\"tags\":{\"cslmotoebnfxo\":\"lq\",\"razftxejwabmdujt\":\"vcjkgd\",\"m\":\"vcopex\"},\"id\":\"rbuhhlky\",\"name\":\"ltqs\",\"type\":\"ogtu\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DevCenterManager manager = DevCenterManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        EnvironmentType response = manager.environmentTypes()
            .define("ewmrswnjlxu")
            .withExistingDevcenter("ey", "tuhxuicb")
            .withTags(mapOf("xncnwfe", "hzjqatucoige", "cgbjbgdlfgt", "bnwgfmxj", "naquflq", "y", "zeqyjleziun",
                "ctqhamzjrwdk"))
            .withDisplayName("usxjbaqehg")
            .create();

        Assertions.assertEquals("lq", response.tags().get("cslmotoebnfxo"));
        Assertions.assertEquals("gueiookjbsahrtdt", response.displayName());
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
