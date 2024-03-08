// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.azurestackhci.models.IpPool;
import com.azure.resourcemanager.azurestackhci.models.IpPoolInfo;
import com.azure.resourcemanager.azurestackhci.models.IpPoolTypeEnum;
import org.junit.jupiter.api.Assertions;

public final class IpPoolTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IpPool model =
            BinaryData
                .fromString(
                    "{\"name\":\"seiphe\",\"ipPoolType\":\"vm\",\"start\":\"keyyi\",\"end\":\"jbdlwtgrhpdjpju\",\"info\":{\"used\":\"xazjpqyegual\",\"available\":\"xxhejjzzvd\"}}")
                .toObject(IpPool.class);
        Assertions.assertEquals("seiphe", model.name());
        Assertions.assertEquals(IpPoolTypeEnum.VM, model.ipPoolType());
        Assertions.assertEquals("keyyi", model.start());
        Assertions.assertEquals("jbdlwtgrhpdjpju", model.end());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IpPool model =
            new IpPool()
                .withName("seiphe")
                .withIpPoolType(IpPoolTypeEnum.VM)
                .withStart("keyyi")
                .withEnd("jbdlwtgrhpdjpju")
                .withInfo(new IpPoolInfo());
        model = BinaryData.fromObject(model).toObject(IpPool.class);
        Assertions.assertEquals("seiphe", model.name());
        Assertions.assertEquals(IpPoolTypeEnum.VM, model.ipPoolType());
        Assertions.assertEquals("keyyi", model.start());
        Assertions.assertEquals("jbdlwtgrhpdjpju", model.end());
    }
}
