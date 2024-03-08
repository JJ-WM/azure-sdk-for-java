// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hardwaresecuritymodules.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hardwaresecuritymodules.models.CloudHsmClusterSecurityDomainProperties;
import org.junit.jupiter.api.Assertions;

public final class CloudHsmClusterSecurityDomainPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CloudHsmClusterSecurityDomainProperties model
            = BinaryData.fromString("{\"fipsState\":1828393347,\"activationStatus\":\"smodmgloug\"}")
                .toObject(CloudHsmClusterSecurityDomainProperties.class);
        Assertions.assertEquals(1828393347, model.fipsState());
        Assertions.assertEquals("smodmgloug", model.activationStatus());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CloudHsmClusterSecurityDomainProperties model = new CloudHsmClusterSecurityDomainProperties()
            .withFipsState(1828393347).withActivationStatus("smodmgloug");
        model = BinaryData.fromObject(model).toObject(CloudHsmClusterSecurityDomainProperties.class);
        Assertions.assertEquals(1828393347, model.fipsState());
        Assertions.assertEquals("smodmgloug", model.activationStatus());
    }
}
