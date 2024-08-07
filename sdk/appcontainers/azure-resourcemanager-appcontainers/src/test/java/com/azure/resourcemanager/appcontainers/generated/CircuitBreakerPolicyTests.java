// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.CircuitBreakerPolicy;
import org.junit.jupiter.api.Assertions;

public final class CircuitBreakerPolicyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CircuitBreakerPolicy model = BinaryData
            .fromString(
                "{\"consecutiveErrors\":1722437661,\"intervalInSeconds\":1946289710,\"maxEjectionPercent\":158340850}")
            .toObject(CircuitBreakerPolicy.class);
        Assertions.assertEquals(1722437661, model.consecutiveErrors());
        Assertions.assertEquals(1946289710, model.intervalInSeconds());
        Assertions.assertEquals(158340850, model.maxEjectionPercent());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CircuitBreakerPolicy model = new CircuitBreakerPolicy().withConsecutiveErrors(1722437661)
            .withIntervalInSeconds(1946289710)
            .withMaxEjectionPercent(158340850);
        model = BinaryData.fromObject(model).toObject(CircuitBreakerPolicy.class);
        Assertions.assertEquals(1722437661, model.consecutiveErrors());
        Assertions.assertEquals(1946289710, model.intervalInSeconds());
        Assertions.assertEquals(158340850, model.maxEjectionPercent());
    }
}
