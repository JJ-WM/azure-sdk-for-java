// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.FailoverProcessServerRequestProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class FailoverProcessServerRequestPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FailoverProcessServerRequestProperties model =
            BinaryData
                .fromString(
                    "{\"containerName\":\"l\",\"sourceProcessServerId\":\"u\",\"targetProcessServerId\":\"krlkhbzhfepg\",\"vmsToMigrate\":[\"e\"],\"updateType\":\"locx\"}")
                .toObject(FailoverProcessServerRequestProperties.class);
        Assertions.assertEquals("l", model.containerName());
        Assertions.assertEquals("u", model.sourceProcessServerId());
        Assertions.assertEquals("krlkhbzhfepg", model.targetProcessServerId());
        Assertions.assertEquals("e", model.vmsToMigrate().get(0));
        Assertions.assertEquals("locx", model.updateType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FailoverProcessServerRequestProperties model =
            new FailoverProcessServerRequestProperties()
                .withContainerName("l")
                .withSourceProcessServerId("u")
                .withTargetProcessServerId("krlkhbzhfepg")
                .withVmsToMigrate(Arrays.asList("e"))
                .withUpdateType("locx");
        model = BinaryData.fromObject(model).toObject(FailoverProcessServerRequestProperties.class);
        Assertions.assertEquals("l", model.containerName());
        Assertions.assertEquals("u", model.sourceProcessServerId());
        Assertions.assertEquals("krlkhbzhfepg", model.targetProcessServerId());
        Assertions.assertEquals("e", model.vmsToMigrate().get(0));
        Assertions.assertEquals("locx", model.updateType());
    }
}
