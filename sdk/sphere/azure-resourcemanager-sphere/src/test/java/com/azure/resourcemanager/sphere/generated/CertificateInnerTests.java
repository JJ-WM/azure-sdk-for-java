// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sphere.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.sphere.fluent.models.CertificateInner;
import com.azure.resourcemanager.sphere.models.CertificateProperties;

public final class CertificateInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CertificateInner model = BinaryData.fromString(
            "{\"properties\":{\"certificate\":\"oc\",\"status\":\"Inactive\",\"subject\":\"blgphuticn\",\"thumbprint\":\"kao\",\"expiryUtc\":\"2021-10-08T07:48:08Z\",\"notBeforeUtc\":\"2021-02-22T11:39:16Z\",\"provisioningState\":\"Updating\"},\"id\":\"xhurok\",\"name\":\"tyxolniwpwc\",\"type\":\"kjfkg\"}")
            .toObject(CertificateInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CertificateInner model = new CertificateInner().withProperties(new CertificateProperties());
        model = BinaryData.fromObject(model).toObject(CertificateInner.class);
    }
}
