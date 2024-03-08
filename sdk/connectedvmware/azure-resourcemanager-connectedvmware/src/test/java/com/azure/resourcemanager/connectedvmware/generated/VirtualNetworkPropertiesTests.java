// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.connectedvmware.fluent.models.VirtualNetworkProperties;
import org.junit.jupiter.api.Assertions;

public final class VirtualNetworkPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VirtualNetworkProperties model =
            BinaryData
                .fromString(
                    "{\"uuid\":\"dftuljltduce\",\"vCenterId\":\"tmczuomejwcwwqi\",\"moRefId\":\"nssxmojmsvpk\",\"inventoryItemId\":\"rvkwc\",\"moName\":\"ql\",\"customResourceName\":\"x\",\"statuses\":[{\"type\":\"heyd\",\"status\":\"dshmkxmaehvbbx\",\"reason\":\"iplt\",\"message\":\"htba\",\"severity\":\"gx\",\"lastUpdatedAt\":\"2021-06-15T04:05:50Z\"},{\"type\":\"kpyklyhp\",\"status\":\"odpvruudlgzib\",\"reason\":\"ostgkts\",\"message\":\"dxeclzedqbcvh\",\"severity\":\"h\",\"lastUpdatedAt\":\"2021-02-21T17:52:27Z\"}],\"provisioningState\":\"Canceled\"}")
                .toObject(VirtualNetworkProperties.class);
        Assertions.assertEquals("tmczuomejwcwwqi", model.vCenterId());
        Assertions.assertEquals("nssxmojmsvpk", model.moRefId());
        Assertions.assertEquals("rvkwc", model.inventoryItemId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VirtualNetworkProperties model =
            new VirtualNetworkProperties()
                .withVCenterId("tmczuomejwcwwqi")
                .withMoRefId("nssxmojmsvpk")
                .withInventoryItemId("rvkwc");
        model = BinaryData.fromObject(model).toObject(VirtualNetworkProperties.class);
        Assertions.assertEquals("tmczuomejwcwwqi", model.vCenterId());
        Assertions.assertEquals("nssxmojmsvpk", model.moRefId());
        Assertions.assertEquals("rvkwc", model.inventoryItemId());
    }
}
