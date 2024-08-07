// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.Applicability;
import com.azure.resourcemanager.appcontainers.models.AvailableWorkloadProfileProperties;
import org.junit.jupiter.api.Assertions;

public final class AvailableWorkloadProfilePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AvailableWorkloadProfileProperties model = BinaryData.fromString(
            "{\"category\":\"f\",\"applicability\":\"LocationDefault\",\"cores\":1825333220,\"memoryGiB\":500448783,\"gpus\":608072417,\"displayName\":\"xxbczwtr\"}")
            .toObject(AvailableWorkloadProfileProperties.class);
        Assertions.assertEquals("f", model.category());
        Assertions.assertEquals(Applicability.LOCATION_DEFAULT, model.applicability());
        Assertions.assertEquals(1825333220, model.cores());
        Assertions.assertEquals(500448783, model.memoryGiB());
        Assertions.assertEquals(608072417, model.gpus());
        Assertions.assertEquals("xxbczwtr", model.displayName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AvailableWorkloadProfileProperties model = new AvailableWorkloadProfileProperties().withCategory("f")
            .withApplicability(Applicability.LOCATION_DEFAULT)
            .withCores(1825333220)
            .withMemoryGiB(500448783)
            .withGpus(608072417)
            .withDisplayName("xxbczwtr");
        model = BinaryData.fromObject(model).toObject(AvailableWorkloadProfileProperties.class);
        Assertions.assertEquals("f", model.category());
        Assertions.assertEquals(Applicability.LOCATION_DEFAULT, model.applicability());
        Assertions.assertEquals(1825333220, model.cores());
        Assertions.assertEquals(500448783, model.memoryGiB());
        Assertions.assertEquals(608072417, model.gpus());
        Assertions.assertEquals("xxbczwtr", model.displayName());
    }
}
