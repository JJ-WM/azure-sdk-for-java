// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.DefenderForServersAwsOfferingVaAutoProvisioningConfiguration;
import com.azure.resourcemanager.security.models.Type;
import org.junit.jupiter.api.Assertions;

public final class DefenderForServersAwsOfferingVaAutoProvisioningConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DefenderForServersAwsOfferingVaAutoProvisioningConfiguration model
            = BinaryData.fromString("{\"type\":\"Qualys\"}")
                .toObject(DefenderForServersAwsOfferingVaAutoProvisioningConfiguration.class);
        Assertions.assertEquals(Type.QUALYS, model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DefenderForServersAwsOfferingVaAutoProvisioningConfiguration model
            = new DefenderForServersAwsOfferingVaAutoProvisioningConfiguration().withType(Type.QUALYS);
        model
            = BinaryData.fromObject(model).toObject(DefenderForServersAwsOfferingVaAutoProvisioningConfiguration.class);
        Assertions.assertEquals(Type.QUALYS, model.type());
    }
}
