// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.RetentionDuration;
import com.azure.resourcemanager.recoveryservicesbackup.models.RetentionDurationType;
import com.azure.resourcemanager.recoveryservicesbackup.models.SimpleRetentionPolicy;
import org.junit.jupiter.api.Assertions;

public final class SimpleRetentionPolicyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SimpleRetentionPolicy model = BinaryData.fromString(
            "{\"retentionPolicyType\":\"SimpleRetentionPolicy\",\"retentionDuration\":{\"count\":1612379087,\"durationType\":\"Months\"}}")
            .toObject(SimpleRetentionPolicy.class);
        Assertions.assertEquals(1612379087, model.retentionDuration().count());
        Assertions.assertEquals(RetentionDurationType.MONTHS, model.retentionDuration().durationType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SimpleRetentionPolicy model = new SimpleRetentionPolicy().withRetentionDuration(
            new RetentionDuration().withCount(1612379087).withDurationType(RetentionDurationType.MONTHS));
        model = BinaryData.fromObject(model).toObject(SimpleRetentionPolicy.class);
        Assertions.assertEquals(1612379087, model.retentionDuration().count());
        Assertions.assertEquals(RetentionDurationType.MONTHS, model.retentionDuration().durationType());
    }
}
