// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.DaprComponentResiliencyPolicyCircuitBreakerPolicyConfiguration;
import org.junit.jupiter.api.Assertions;

public final class DaprComponentResiliencyPolicyCircuitBreakerPolicyConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DaprComponentResiliencyPolicyCircuitBreakerPolicyConfiguration model = BinaryData
            .fromString(
                "{\"consecutiveErrors\":1053497499,\"timeoutInSeconds\":729007822,\"intervalInSeconds\":367318900}")
            .toObject(DaprComponentResiliencyPolicyCircuitBreakerPolicyConfiguration.class);
        Assertions.assertEquals(1053497499, model.consecutiveErrors());
        Assertions.assertEquals(729007822, model.timeoutInSeconds());
        Assertions.assertEquals(367318900, model.intervalInSeconds());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DaprComponentResiliencyPolicyCircuitBreakerPolicyConfiguration model
            = new DaprComponentResiliencyPolicyCircuitBreakerPolicyConfiguration().withConsecutiveErrors(1053497499)
                .withTimeoutInSeconds(729007822).withIntervalInSeconds(367318900);
        model = BinaryData.fromObject(model)
            .toObject(DaprComponentResiliencyPolicyCircuitBreakerPolicyConfiguration.class);
        Assertions.assertEquals(1053497499, model.consecutiveErrors());
        Assertions.assertEquals(729007822, model.timeoutInSeconds());
        Assertions.assertEquals(367318900, model.intervalInSeconds());
    }
}
