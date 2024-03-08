// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.playwrighttesting.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.playwrighttesting.models.FreeTrialProperties;

public final class FreeTrialPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FreeTrialProperties model = BinaryData.fromString(
            "{\"accountId\":\"qjbasvms\",\"createdAt\":\"2021-01-21T06:57:24Z\",\"expiryAt\":\"2021-08-09T10:57:51Z\",\"allocatedValue\":2070892597,\"usedValue\":2084272233,\"state\":\"Expired\"}")
            .toObject(FreeTrialProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FreeTrialProperties model = new FreeTrialProperties();
        model = BinaryData.fromObject(model).toObject(FreeTrialProperties.class);
    }
}
