// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mobilenetwork.models.PdnType;
import com.azure.resourcemanager.mobilenetwork.models.UeIpAddress;
import com.azure.resourcemanager.mobilenetwork.models.UeSessionInfo4G;
import org.junit.jupiter.api.Assertions;

public final class UeSessionInfo4GTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UeSessionInfo4G model = BinaryData.fromString(
            "{\"ebi\":499643337,\"apn\":\"jbjsvgjrwh\",\"ueIpAddress\":{\"ipV4Addr\":\"vyc\"},\"pdnType\":\"IPV4\"}")
            .toObject(UeSessionInfo4G.class);
        Assertions.assertEquals(499643337, model.ebi());
        Assertions.assertEquals("jbjsvgjrwh", model.apn());
        Assertions.assertEquals("vyc", model.ueIpAddress().ipV4Addr());
        Assertions.assertEquals(PdnType.IPV4, model.pdnType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UeSessionInfo4G model = new UeSessionInfo4G().withEbi(499643337).withApn("jbjsvgjrwh")
            .withUeIpAddress(new UeIpAddress().withIpV4Addr("vyc")).withPdnType(PdnType.IPV4);
        model = BinaryData.fromObject(model).toObject(UeSessionInfo4G.class);
        Assertions.assertEquals(499643337, model.ebi());
        Assertions.assertEquals("jbjsvgjrwh", model.apn());
        Assertions.assertEquals("vyc", model.ueIpAddress().ipV4Addr());
        Assertions.assertEquals(PdnType.IPV4, model.pdnType());
    }
}
