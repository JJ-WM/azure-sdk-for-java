// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.DefenderCspmGcpOfferingDataSensitivityDiscovery;
import org.junit.jupiter.api.Assertions;

public final class DefenderCspmGcpOfferingDataSensitivityDiscoveryTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DefenderCspmGcpOfferingDataSensitivityDiscovery model = BinaryData.fromString(
            "{\"enabled\":true,\"workloadIdentityProviderId\":\"uidpmtonvhg\",\"serviceAccountEmailAddress\":\"tmeplhbpj\"}")
            .toObject(DefenderCspmGcpOfferingDataSensitivityDiscovery.class);
        Assertions.assertEquals(true, model.enabled());
        Assertions.assertEquals("uidpmtonvhg", model.workloadIdentityProviderId());
        Assertions.assertEquals("tmeplhbpj", model.serviceAccountEmailAddress());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DefenderCspmGcpOfferingDataSensitivityDiscovery model
            = new DefenderCspmGcpOfferingDataSensitivityDiscovery().withEnabled(true)
                .withWorkloadIdentityProviderId("uidpmtonvhg").withServiceAccountEmailAddress("tmeplhbpj");
        model = BinaryData.fromObject(model).toObject(DefenderCspmGcpOfferingDataSensitivityDiscovery.class);
        Assertions.assertEquals(true, model.enabled());
        Assertions.assertEquals("uidpmtonvhg", model.workloadIdentityProviderId());
        Assertions.assertEquals("tmeplhbpj", model.serviceAccountEmailAddress());
    }
}
