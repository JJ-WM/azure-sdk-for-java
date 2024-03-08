// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.models.ComputeNodeDeallocationOption;
import com.azure.resourcemanager.batch.models.FixedScaleSettings;
import java.time.Duration;
import org.junit.jupiter.api.Assertions;

public final class FixedScaleSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FixedScaleSettings model = BinaryData.fromString(
            "{\"resizeTimeout\":\"PT10H38M25S\",\"targetDedicatedNodes\":1187113167,\"targetLowPriorityNodes\":931979220,\"nodeDeallocationOption\":\"TaskCompletion\"}")
            .toObject(FixedScaleSettings.class);
        Assertions.assertEquals(Duration.parse("PT10H38M25S"), model.resizeTimeout());
        Assertions.assertEquals(1187113167, model.targetDedicatedNodes());
        Assertions.assertEquals(931979220, model.targetLowPriorityNodes());
        Assertions.assertEquals(ComputeNodeDeallocationOption.TASK_COMPLETION, model.nodeDeallocationOption());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FixedScaleSettings model = new FixedScaleSettings().withResizeTimeout(Duration.parse("PT10H38M25S"))
            .withTargetDedicatedNodes(1187113167).withTargetLowPriorityNodes(931979220)
            .withNodeDeallocationOption(ComputeNodeDeallocationOption.TASK_COMPLETION);
        model = BinaryData.fromObject(model).toObject(FixedScaleSettings.class);
        Assertions.assertEquals(Duration.parse("PT10H38M25S"), model.resizeTimeout());
        Assertions.assertEquals(1187113167, model.targetDedicatedNodes());
        Assertions.assertEquals(931979220, model.targetLowPriorityNodes());
        Assertions.assertEquals(ComputeNodeDeallocationOption.TASK_COMPLETION, model.nodeDeallocationOption());
    }
}
