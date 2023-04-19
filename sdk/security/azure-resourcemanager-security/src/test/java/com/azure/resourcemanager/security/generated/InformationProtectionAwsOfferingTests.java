// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.InformationProtectionAwsOffering;
import com.azure.resourcemanager.security.models.InformationProtectionAwsOfferingInformationProtection;
import org.junit.jupiter.api.Assertions;

public final class InformationProtectionAwsOfferingTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InformationProtectionAwsOffering model =
            BinaryData
                .fromString(
                    "{\"offeringType\":\"InformationProtectionAws\",\"informationProtection\":{\"cloudRoleArn\":\"ytt\"},\"description\":\"knwfrkebsmhpdujd\"}")
                .toObject(InformationProtectionAwsOffering.class);
        Assertions.assertEquals("ytt", model.informationProtection().cloudRoleArn());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InformationProtectionAwsOffering model =
            new InformationProtectionAwsOffering()
                .withInformationProtection(
                    new InformationProtectionAwsOfferingInformationProtection().withCloudRoleArn("ytt"));
        model = BinaryData.fromObject(model).toObject(InformationProtectionAwsOffering.class);
        Assertions.assertEquals("ytt", model.informationProtection().cloudRoleArn());
    }
}
