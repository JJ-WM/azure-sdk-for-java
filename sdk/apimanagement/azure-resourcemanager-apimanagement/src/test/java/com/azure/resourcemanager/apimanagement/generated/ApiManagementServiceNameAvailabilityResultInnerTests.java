// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.fluent.models.ApiManagementServiceNameAvailabilityResultInner;
import com.azure.resourcemanager.apimanagement.models.NameAvailabilityReason;
import org.junit.jupiter.api.Assertions;

public final class ApiManagementServiceNameAvailabilityResultInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ApiManagementServiceNameAvailabilityResultInner model =
            BinaryData
                .fromString("{\"nameAvailable\":true,\"message\":\"ap\",\"reason\":\"Invalid\"}")
                .toObject(ApiManagementServiceNameAvailabilityResultInner.class);
        Assertions.assertEquals(NameAvailabilityReason.INVALID, model.reason());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ApiManagementServiceNameAvailabilityResultInner model =
            new ApiManagementServiceNameAvailabilityResultInner().withReason(NameAvailabilityReason.INVALID);
        model = BinaryData.fromObject(model).toObject(ApiManagementServiceNameAvailabilityResultInner.class);
        Assertions.assertEquals(NameAvailabilityReason.INVALID, model.reason());
    }
}
