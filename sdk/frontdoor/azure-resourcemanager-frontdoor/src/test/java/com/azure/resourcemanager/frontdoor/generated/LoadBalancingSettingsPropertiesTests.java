// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.frontdoor.fluent.models.LoadBalancingSettingsProperties;
import org.junit.jupiter.api.Assertions;

public final class LoadBalancingSettingsPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LoadBalancingSettingsProperties model = BinaryData.fromString(
            "{\"resourceState\":\"Migrating\",\"sampleSize\":325411087,\"successfulSamplesRequired\":1219456707,\"additionalLatencyMilliseconds\":98859103}")
            .toObject(LoadBalancingSettingsProperties.class);
        Assertions.assertEquals(325411087, model.sampleSize());
        Assertions.assertEquals(1219456707, model.successfulSamplesRequired());
        Assertions.assertEquals(98859103, model.additionalLatencyMilliseconds());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LoadBalancingSettingsProperties model = new LoadBalancingSettingsProperties().withSampleSize(325411087)
            .withSuccessfulSamplesRequired(1219456707)
            .withAdditionalLatencyMilliseconds(98859103);
        model = BinaryData.fromObject(model).toObject(LoadBalancingSettingsProperties.class);
        Assertions.assertEquals(325411087, model.sampleSize());
        Assertions.assertEquals(1219456707, model.successfulSamplesRequired());
        Assertions.assertEquals(98859103, model.additionalLatencyMilliseconds());
    }
}
