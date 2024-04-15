// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.frontdoor.models.FrontendEndpointUpdateParameters;
import com.azure.resourcemanager.frontdoor.models.FrontendEndpointUpdateParametersWebApplicationFirewallPolicyLink;
import com.azure.resourcemanager.frontdoor.models.SessionAffinityEnabledState;
import org.junit.jupiter.api.Assertions;

public final class FrontendEndpointUpdateParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FrontendEndpointUpdateParameters model = BinaryData.fromString(
            "{\"hostName\":\"ybvpay\",\"sessionAffinityEnabledState\":\"Disabled\",\"sessionAffinityTtlSeconds\":240734224,\"webApplicationFirewallPolicyLink\":{\"id\":\"xgwjplmagstcyoh\"}}")
            .toObject(FrontendEndpointUpdateParameters.class);
        Assertions.assertEquals("ybvpay", model.hostname());
        Assertions.assertEquals(SessionAffinityEnabledState.DISABLED, model.sessionAffinityEnabledState());
        Assertions.assertEquals(240734224, model.sessionAffinityTtlSeconds());
        Assertions.assertEquals("xgwjplmagstcyoh", model.webApplicationFirewallPolicyLink().id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FrontendEndpointUpdateParameters model = new FrontendEndpointUpdateParameters().withHostname("ybvpay")
            .withSessionAffinityEnabledState(SessionAffinityEnabledState.DISABLED)
            .withSessionAffinityTtlSeconds(240734224)
            .withWebApplicationFirewallPolicyLink(
                new FrontendEndpointUpdateParametersWebApplicationFirewallPolicyLink().withId("xgwjplmagstcyoh"));
        model = BinaryData.fromObject(model).toObject(FrontendEndpointUpdateParameters.class);
        Assertions.assertEquals("ybvpay", model.hostname());
        Assertions.assertEquals(SessionAffinityEnabledState.DISABLED, model.sessionAffinityEnabledState());
        Assertions.assertEquals(240734224, model.sessionAffinityTtlSeconds());
        Assertions.assertEquals("xgwjplmagstcyoh", model.webApplicationFirewallPolicyLink().id());
    }
}
