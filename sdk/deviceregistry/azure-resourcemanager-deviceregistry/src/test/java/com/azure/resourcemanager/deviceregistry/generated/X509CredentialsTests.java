// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.deviceregistry.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.deviceregistry.models.X509Credentials;
import org.junit.jupiter.api.Assertions;

public final class X509CredentialsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        X509Credentials model
            = BinaryData.fromString("{\"certificateReference\":\"ehoqfbowskan\"}").toObject(X509Credentials.class);
        Assertions.assertEquals("ehoqfbowskan", model.certificateReference());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        X509Credentials model = new X509Credentials().withCertificateReference("ehoqfbowskan");
        model = BinaryData.fromObject(model).toObject(X509Credentials.class);
        Assertions.assertEquals("ehoqfbowskan", model.certificateReference());
    }
}
