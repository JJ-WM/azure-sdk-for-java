// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.edgezones.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.edgezones.EdgeZonesManager;
import com.azure.resourcemanager.edgezones.models.ExtendedZone;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ExtendedZonesGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"provisioningState\":\"Deleting\",\"registrationState\":\"PendingUnregister\",\"displayName\":\"xhocdgeablgphuti\",\"regionalDisplayName\":\"ndv\",\"regionType\":\"aozwyiftyhxhu\",\"regionCategory\":\"okftyxolniwpwcuk\",\"geography\":\"fkgiawxk\",\"geographyGroup\":\"ryplwckbasyypn\",\"longitude\":\"dhsgcba\",\"latitude\":\"phejkotynqgoulz\",\"homeLocation\":\"dlikwyqkgfgibma\"},\"id\":\"akeqs\",\"name\":\"xybz\",\"type\":\"qedqytbciqfoufl\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        EdgeZonesManager manager = EdgeZonesManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        ExtendedZone response
            = manager.extendedZones().getWithResponse("nhutjeltmrldhugj", com.azure.core.util.Context.NONE).getValue();

    }
}
