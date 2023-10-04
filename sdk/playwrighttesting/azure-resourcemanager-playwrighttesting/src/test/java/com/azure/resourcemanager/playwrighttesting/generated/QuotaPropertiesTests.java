// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.playwrighttesting.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.playwrighttesting.fluent.models.QuotaProperties;
import com.azure.resourcemanager.playwrighttesting.models.FreeTrialProperties;

public final class QuotaPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        QuotaProperties model =
            BinaryData
                .fromString(
                    "{\"freeTrial\":{\"accountId\":\"ubljofxqe\",\"createdAt\":\"2021-05-14T22:11:20Z\",\"expiryAt\":\"2021-02-25T06:04:33Z\",\"allocatedValue\":1330720242,\"usedValue\":56034680,\"state\":\"Active\"},\"provisioningState\":\"Canceled\"}")
                .toObject(QuotaProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        QuotaProperties model = new QuotaProperties().withFreeTrial(new FreeTrialProperties());
        model = BinaryData.fromObject(model).toObject(QuotaProperties.class);
    }
}
