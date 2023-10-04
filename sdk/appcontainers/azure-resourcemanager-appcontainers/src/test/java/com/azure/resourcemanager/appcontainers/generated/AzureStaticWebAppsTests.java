// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.AzureStaticWebApps;
import com.azure.resourcemanager.appcontainers.models.AzureStaticWebAppsRegistration;
import org.junit.jupiter.api.Assertions;

public final class AzureStaticWebAppsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureStaticWebApps model =
            BinaryData
                .fromString("{\"enabled\":false,\"registration\":{\"clientId\":\"icbtwnpzao\"}}")
                .toObject(AzureStaticWebApps.class);
        Assertions.assertEquals(false, model.enabled());
        Assertions.assertEquals("icbtwnpzao", model.registration().clientId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureStaticWebApps model =
            new AzureStaticWebApps()
                .withEnabled(false)
                .withRegistration(new AzureStaticWebAppsRegistration().withClientId("icbtwnpzao"));
        model = BinaryData.fromObject(model).toObject(AzureStaticWebApps.class);
        Assertions.assertEquals(false, model.enabled());
        Assertions.assertEquals("icbtwnpzao", model.registration().clientId());
    }
}
