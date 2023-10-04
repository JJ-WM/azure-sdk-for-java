// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.fluent.models.GatewayCertificateAuthorityContractInner;
import org.junit.jupiter.api.Assertions;

public final class GatewayCertificateAuthorityContractInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GatewayCertificateAuthorityContractInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"isTrusted\":true},\"id\":\"uscstunmlh\",\"name\":\"dfb\",\"type\":\"lciichgjs\"}")
                .toObject(GatewayCertificateAuthorityContractInner.class);
        Assertions.assertEquals(true, model.isTrusted());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GatewayCertificateAuthorityContractInner model =
            new GatewayCertificateAuthorityContractInner().withIsTrusted(true);
        model = BinaryData.fromObject(model).toObject(GatewayCertificateAuthorityContractInner.class);
        Assertions.assertEquals(true, model.isTrusted());
    }
}
