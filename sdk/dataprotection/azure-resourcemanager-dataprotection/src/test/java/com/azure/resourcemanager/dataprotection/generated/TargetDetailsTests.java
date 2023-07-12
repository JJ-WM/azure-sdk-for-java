// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.RestoreTargetLocationType;
import com.azure.resourcemanager.dataprotection.models.TargetDetails;
import org.junit.jupiter.api.Assertions;

public final class TargetDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TargetDetails model =
            BinaryData
                .fromString(
                    "{\"filePrefix\":\"bnhlmc\",\"restoreTargetLocationType\":\"Invalid\",\"url\":\"p\",\"targetResourceArmId\":\"gitvg\"}")
                .toObject(TargetDetails.class);
        Assertions.assertEquals("bnhlmc", model.filePrefix());
        Assertions.assertEquals(RestoreTargetLocationType.INVALID, model.restoreTargetLocationType());
        Assertions.assertEquals("p", model.url());
        Assertions.assertEquals("gitvg", model.targetResourceArmId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TargetDetails model =
            new TargetDetails()
                .withFilePrefix("bnhlmc")
                .withRestoreTargetLocationType(RestoreTargetLocationType.INVALID)
                .withUrl("p")
                .withTargetResourceArmId("gitvg");
        model = BinaryData.fromObject(model).toObject(TargetDetails.class);
        Assertions.assertEquals("bnhlmc", model.filePrefix());
        Assertions.assertEquals(RestoreTargetLocationType.INVALID, model.restoreTargetLocationType());
        Assertions.assertEquals("p", model.url());
        Assertions.assertEquals("gitvg", model.targetResourceArmId());
    }
}
