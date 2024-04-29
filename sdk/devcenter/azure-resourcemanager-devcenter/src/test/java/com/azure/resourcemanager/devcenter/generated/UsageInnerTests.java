// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.fluent.models.UsageInner;
import com.azure.resourcemanager.devcenter.models.UsageName;
import com.azure.resourcemanager.devcenter.models.UsageUnit;
import org.junit.jupiter.api.Assertions;

public final class UsageInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UsageInner model = BinaryData.fromString(
            "{\"currentValue\":6174770568857951171,\"limit\":6143780622017155787,\"unit\":\"Count\",\"name\":{\"localizedValue\":\"hzovaj\",\"value\":\"iuxxpshneekulfg\"},\"id\":\"qubkw\"}")
            .toObject(UsageInner.class);
        Assertions.assertEquals(6174770568857951171L, model.currentValue());
        Assertions.assertEquals(6143780622017155787L, model.limit());
        Assertions.assertEquals(UsageUnit.COUNT, model.unit());
        Assertions.assertEquals("hzovaj", model.name().localizedValue());
        Assertions.assertEquals("iuxxpshneekulfg", model.name().value());
        Assertions.assertEquals("qubkw", model.id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UsageInner model = new UsageInner().withCurrentValue(6174770568857951171L)
            .withLimit(6143780622017155787L)
            .withUnit(UsageUnit.COUNT)
            .withName(new UsageName().withLocalizedValue("hzovaj").withValue("iuxxpshneekulfg"))
            .withId("qubkw");
        model = BinaryData.fromObject(model).toObject(UsageInner.class);
        Assertions.assertEquals(6174770568857951171L, model.currentValue());
        Assertions.assertEquals(6143780622017155787L, model.limit());
        Assertions.assertEquals(UsageUnit.COUNT, model.unit());
        Assertions.assertEquals("hzovaj", model.name().localizedValue());
        Assertions.assertEquals("iuxxpshneekulfg", model.name().value());
        Assertions.assertEquals("qubkw", model.id());
    }
}
