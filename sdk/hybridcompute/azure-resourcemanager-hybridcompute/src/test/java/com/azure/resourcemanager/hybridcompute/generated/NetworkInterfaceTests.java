// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcompute.models.IpAddress;
import com.azure.resourcemanager.hybridcompute.models.NetworkInterface;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class NetworkInterfaceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NetworkInterface model = BinaryData.fromString(
            "{\"ipAddresses\":[{\"address\":\"cciw\",\"ipAddressVersion\":\"juqk\",\"subnet\":{\"addressPrefix\":\"ajiwkuo\"}},{\"address\":\"skghsauuimj\",\"ipAddressVersion\":\"xieduugidyjrr\",\"subnet\":{\"addressPrefix\":\"aos\"}},{\"address\":\"xc\",\"ipAddressVersion\":\"npc\",\"subnet\":{\"addressPrefix\":\"cohslkev\"}}]}")
            .toObject(NetworkInterface.class);
        Assertions.assertEquals("cciw", model.ipAddresses().get(0).address());
        Assertions.assertEquals("juqk", model.ipAddresses().get(0).ipAddressVersion());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NetworkInterface model = new NetworkInterface()
            .withIpAddresses(Arrays.asList(new IpAddress().withAddress("cciw").withIpAddressVersion("juqk"),
                new IpAddress().withAddress("skghsauuimj").withIpAddressVersion("xieduugidyjrr"),
                new IpAddress().withAddress("xc").withIpAddressVersion("npc")));
        model = BinaryData.fromObject(model).toObject(NetworkInterface.class);
        Assertions.assertEquals("cciw", model.ipAddresses().get(0).address());
        Assertions.assertEquals("juqk", model.ipAddresses().get(0).ipAddressVersion());
    }
}
