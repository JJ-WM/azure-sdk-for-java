// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.models.PowerEnd;
import com.azure.resourcemanager.managednetworkfabric.models.State;
import com.azure.resourcemanager.managednetworkfabric.models.UpdatePowerCycleProperties;
import org.junit.jupiter.api.Assertions;

public final class UpdatePowerCyclePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UpdatePowerCycleProperties model =
            BinaryData
                .fromString("{\"powerEnd\":\"Primary\",\"state\":\"On\"}")
                .toObject(UpdatePowerCycleProperties.class);
        Assertions.assertEquals(PowerEnd.PRIMARY, model.powerEnd());
        Assertions.assertEquals(State.ON, model.state());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UpdatePowerCycleProperties model =
            new UpdatePowerCycleProperties().withPowerEnd(PowerEnd.PRIMARY).withState(State.ON);
        model = BinaryData.fromObject(model).toObject(UpdatePowerCycleProperties.class);
        Assertions.assertEquals(PowerEnd.PRIMARY, model.powerEnd());
        Assertions.assertEquals(State.ON, model.state());
    }
}
