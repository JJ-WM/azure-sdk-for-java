// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.costmanagement.models.CostDetailsTimePeriod;
import org.junit.jupiter.api.Assertions;

public final class CostDetailsTimePeriodTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CostDetailsTimePeriod model =
            BinaryData.fromString("{\"start\":\"nswhcc\",\"end\":\"ph\"}").toObject(CostDetailsTimePeriod.class);
        Assertions.assertEquals("nswhcc", model.start());
        Assertions.assertEquals("ph", model.end());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CostDetailsTimePeriod model = new CostDetailsTimePeriod().withStart("nswhcc").withEnd("ph");
        model = BinaryData.fromObject(model).toObject(CostDetailsTimePeriod.class);
        Assertions.assertEquals("nswhcc", model.start());
        Assertions.assertEquals("ph", model.end());
    }
}
