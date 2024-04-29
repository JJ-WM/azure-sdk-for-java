// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.support.SupportManager;
import com.azure.resourcemanager.support.models.ChatTranscriptDetails;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ChatTranscriptsNoSubscriptionsListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"messages\":[{\"communicationDirection\":\"inbound\",\"sender\":\"omtkub\",\"body\":\"ppnvdxz\",\"createdDate\":\"2021-01-05T01:25:57Z\"},{\"communicationDirection\":\"inbound\",\"sender\":\"b\",\"body\":\"vqagtltdhlf\",\"createdDate\":\"2021-10-11T23:31:22Z\"}],\"startTime\":\"2021-08-08T09:12:47Z\"},\"id\":\"kvgtrdcn\",\"name\":\"fmzzsdymbrny\",\"type\":\"u\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        SupportManager manager = SupportManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<ChatTranscriptDetails> response
            = manager.chatTranscriptsNoSubscriptions().list("qgnjdgkynscli", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("omtkub", response.iterator().next().messages().get(0).sender());
        Assertions.assertEquals("ppnvdxz", response.iterator().next().messages().get(0).body());
    }
}
