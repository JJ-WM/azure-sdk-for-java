// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.frontdoor.FrontDoorManager;
import com.azure.resourcemanager.frontdoor.models.Profile;
import com.azure.resourcemanager.frontdoor.models.State;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class NetworkExperimentProfilesListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"resourceState\":\"Enabled\",\"enabledState\":\"Enabled\"},\"etag\":\"rbxrblmliowxihsp\",\"location\":\"xwqagnepzw\",\"tags\":{\"qqqagwwrxaomzi\":\"sbs\"},\"id\":\"glrrczez\",\"name\":\"hhltnjadhqo\",\"type\":\"wjqo\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        FrontDoorManager manager = FrontDoorManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Profile> response = manager.networkExperimentProfiles().list(com.azure.core.util.Context.NONE);

        Assertions.assertEquals("xwqagnepzw", response.iterator().next().location());
        Assertions.assertEquals("sbs", response.iterator().next().tags().get("qqqagwwrxaomzi"));
        Assertions.assertEquals("rbxrblmliowxihsp", response.iterator().next().etag());
        Assertions.assertEquals(State.ENABLED, response.iterator().next().enabledState());
    }
}
