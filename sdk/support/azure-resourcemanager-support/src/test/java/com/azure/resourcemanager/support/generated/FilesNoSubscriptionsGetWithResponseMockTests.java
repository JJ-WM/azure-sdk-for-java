// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.support.SupportManager;
import com.azure.resourcemanager.support.models.FileDetails;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class FilesNoSubscriptionsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"createdOn\":\"2021-05-29T18:36:16Z\",\"chunkSize\":2128381794,\"fileSize\":23704541,\"numberOfChunks\":654985035},\"id\":\"ltlwtjjguktalhs\",\"name\":\"vkcdmxzr\",\"type\":\"oaimlnw\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        SupportManager manager = SupportManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        FileDetails response = manager.filesNoSubscriptions()
            .getWithResponse("pimaqxzhemjyh", "hujswtwkozzwcul", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals(2128381794, response.chunkSize());
        Assertions.assertEquals(23704541, response.fileSize());
        Assertions.assertEquals(654985035, response.numberOfChunks());
    }
}
