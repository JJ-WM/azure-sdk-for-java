// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ExecuteDataFlowActivityTypePropertiesCompute;

public final class ExecuteDataFlowActivityTypePropertiesComputeTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ExecuteDataFlowActivityTypePropertiesCompute model
            = BinaryData.fromString("{\"computeType\":\"datantnjnkvsnsiphl\",\"coreCount\":\"datacedz\"}")
                .toObject(ExecuteDataFlowActivityTypePropertiesCompute.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ExecuteDataFlowActivityTypePropertiesCompute model
            = new ExecuteDataFlowActivityTypePropertiesCompute().withComputeType("datantnjnkvsnsiphl")
                .withCoreCount("datacedz");
        model = BinaryData.fromObject(model).toObject(ExecuteDataFlowActivityTypePropertiesCompute.class);
    }
}
