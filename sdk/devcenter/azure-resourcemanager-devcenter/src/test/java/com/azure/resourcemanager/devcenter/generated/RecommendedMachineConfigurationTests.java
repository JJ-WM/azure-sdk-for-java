// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.models.RecommendedMachineConfiguration;

public final class RecommendedMachineConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RecommendedMachineConfiguration model = BinaryData
            .fromString(
                "{\"memory\":{\"min\":38172527,\"max\":1341187268},\"vCPUs\":{\"min\":1152812045,\"max\":827449551}}")
            .toObject(RecommendedMachineConfiguration.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RecommendedMachineConfiguration model = new RecommendedMachineConfiguration();
        model = BinaryData.fromObject(model).toObject(RecommendedMachineConfiguration.class);
    }
}
