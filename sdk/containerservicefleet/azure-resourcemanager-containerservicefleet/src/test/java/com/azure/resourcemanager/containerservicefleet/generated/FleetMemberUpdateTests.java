// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.containerservicefleet.models.FleetMemberUpdate;
import org.junit.jupiter.api.Assertions;

public final class FleetMemberUpdateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FleetMemberUpdate model =
            BinaryData.fromString("{\"properties\":{\"group\":\"qqedqytbciqfou\"}}").toObject(FleetMemberUpdate.class);
        Assertions.assertEquals("qqedqytbciqfou", model.group());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FleetMemberUpdate model = new FleetMemberUpdate().withGroup("qqedqytbciqfou");
        model = BinaryData.fromObject(model).toObject(FleetMemberUpdate.class);
        Assertions.assertEquals("qqedqytbciqfou", model.group());
    }
}
