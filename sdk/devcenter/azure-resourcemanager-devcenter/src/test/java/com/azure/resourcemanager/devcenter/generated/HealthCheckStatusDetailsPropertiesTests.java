// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.fluent.models.HealthCheckStatusDetailsProperties;

public final class HealthCheckStatusDetailsPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HealthCheckStatusDetailsProperties model = BinaryData.fromString(
            "{\"startDateTime\":\"2021-12-02T19:30Z\",\"endDateTime\":\"2021-02-22T04:35:52Z\",\"healthChecks\":[{\"status\":\"Passed\",\"displayName\":\"npjhlfzswpchwahf\",\"startDateTime\":\"2021-07-25T08:18:30Z\",\"endDateTime\":\"2021-04-23T04:46:24Z\",\"errorType\":\"epgfew\",\"recommendedAction\":\"wlyxgncxyk\",\"additionalDetails\":\"djhlimm\"},{\"status\":\"Unknown\",\"displayName\":\"h\",\"startDateTime\":\"2021-05-04T19:01:44Z\",\"endDateTime\":\"2021-08-24T02:48:56Z\",\"errorType\":\"vxcjzhqizxfpxtgq\",\"recommendedAction\":\"javftjuhdqa\",\"additionalDetails\":\"mtggu\"}]}")
            .toObject(HealthCheckStatusDetailsProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HealthCheckStatusDetailsProperties model = new HealthCheckStatusDetailsProperties();
        model = BinaryData.fromObject(model).toObject(HealthCheckStatusDetailsProperties.class);
    }
}
