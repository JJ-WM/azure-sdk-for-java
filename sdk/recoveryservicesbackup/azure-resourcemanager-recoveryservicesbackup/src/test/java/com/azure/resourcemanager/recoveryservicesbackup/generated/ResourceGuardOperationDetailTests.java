// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.ResourceGuardOperationDetail;
import org.junit.jupiter.api.Assertions;

public final class ResourceGuardOperationDetailTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceGuardOperationDetail model = BinaryData
            .fromString("{\"vaultCriticalOperation\":\"aysjkixqtnqttez\",\"defaultResourceRequest\":\"fffiak\"}")
            .toObject(ResourceGuardOperationDetail.class);
        Assertions.assertEquals("aysjkixqtnqttez", model.vaultCriticalOperation());
        Assertions.assertEquals("fffiak", model.defaultResourceRequest());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResourceGuardOperationDetail model = new ResourceGuardOperationDetail()
            .withVaultCriticalOperation("aysjkixqtnqttez").withDefaultResourceRequest("fffiak");
        model = BinaryData.fromObject(model).toObject(ResourceGuardOperationDetail.class);
        Assertions.assertEquals("aysjkixqtnqttez", model.vaultCriticalOperation());
        Assertions.assertEquals("fffiak", model.defaultResourceRequest());
    }
}
