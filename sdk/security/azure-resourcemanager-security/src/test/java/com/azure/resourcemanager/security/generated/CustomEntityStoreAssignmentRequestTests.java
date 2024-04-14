// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.CustomEntityStoreAssignmentRequest;
import org.junit.jupiter.api.Assertions;

public final class CustomEntityStoreAssignmentRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CustomEntityStoreAssignmentRequest model
            = BinaryData.fromString("{\"properties\":{\"principal\":\"ylhalnswhcc\"}}")
                .toObject(CustomEntityStoreAssignmentRequest.class);
        Assertions.assertEquals("ylhalnswhcc", model.principal());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CustomEntityStoreAssignmentRequest model
            = new CustomEntityStoreAssignmentRequest().withPrincipal("ylhalnswhcc");
        model = BinaryData.fromObject(model).toObject(CustomEntityStoreAssignmentRequest.class);
        Assertions.assertEquals("ylhalnswhcc", model.principal());
    }
}
