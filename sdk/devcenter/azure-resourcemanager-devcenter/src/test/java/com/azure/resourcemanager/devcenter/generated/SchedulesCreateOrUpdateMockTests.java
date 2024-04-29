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
import com.azure.resourcemanager.devcenter.models.Schedule;
import com.azure.resourcemanager.devcenter.models.ScheduledFrequency;
import com.azure.resourcemanager.devcenter.models.ScheduledType;
import com.azure.resourcemanager.devcenter.models.ScheduleEnableStatus;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class SchedulesCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        String responseStr
            = "{\"properties\":{\"provisioningState\":\"Succeeded\",\"type\":\"StopDevBox\",\"frequency\":\"Daily\",\"time\":\"jhvefgwbmqjchnt\",\"timeZone\":\"faymxbulpz\",\"state\":\"Enabled\",\"tags\":{\"mbtsuahxsg\":\"qkyojwyvf\",\"wsdrnpxqwodif\":\"jcmmzrrscub\",\"jogjonmc\":\"jxcjrmmuabwib\",\"oyzbamwineofvf\":\"e\"},\"location\":\"kpoldtvevboc\"},\"id\":\"hzjkn\",\"name\":\"uxgvttxpnr\",\"type\":\"pzaamrdixtreki\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DevCenterManager manager = DevCenterManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        Schedule response = manager.schedules()
            .define("qm")
            .withExistingPool("upbezqccydrt", "eukdqkkyih", "tg")
            .withRegion("djfbocyv")
            .withTags(mapOf("weftkwq", "sjvh", "vssehaepw", "jp", "euknijduyyes", "mcxtczhu"))
            .withTypePropertiesType(ScheduledType.STOP_DEV_BOX)
            .withFrequency(ScheduledFrequency.DAILY)
            .withTime("chillcecf")
            .withTimeZone("uwaoaguhicqlli")
            .withState(ScheduleEnableStatus.ENABLED)
            .withTop(1636214642)
            .create();

        Assertions.assertEquals(ScheduledType.STOP_DEV_BOX, response.typePropertiesType());
        Assertions.assertEquals(ScheduledFrequency.DAILY, response.frequency());
        Assertions.assertEquals("jhvefgwbmqjchnt", response.time());
        Assertions.assertEquals("faymxbulpz", response.timeZone());
        Assertions.assertEquals(ScheduleEnableStatus.ENABLED, response.state());
        Assertions.assertEquals("qkyojwyvf", response.tags().get("mbtsuahxsg"));
        Assertions.assertEquals("kpoldtvevboc", response.location());
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
