// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.NetworkMappingFabricSpecificSettings;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.NetworkMappingProperties;
import org.junit.jupiter.api.Assertions;

public final class NetworkMappingPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NetworkMappingProperties model =
            BinaryData
                .fromString(
                    "{\"state\":\"gigr\",\"primaryNetworkFriendlyName\":\"burvjxxjnspy\",\"primaryNetworkId\":\"tko\",\"primaryFabricFriendlyName\":\"kouknvudwtiu\",\"recoveryNetworkFriendlyName\":\"ldngkpoci\",\"recoveryNetworkId\":\"z\",\"recoveryFabricArmId\":\"o\",\"recoveryFabricFriendlyName\":\"ukgjnpiucgygevq\",\"fabricSpecificSettings\":{\"instanceType\":\"NetworkMappingFabricSpecificSettings\"}}")
                .toObject(NetworkMappingProperties.class);
        Assertions.assertEquals("gigr", model.state());
        Assertions.assertEquals("burvjxxjnspy", model.primaryNetworkFriendlyName());
        Assertions.assertEquals("tko", model.primaryNetworkId());
        Assertions.assertEquals("kouknvudwtiu", model.primaryFabricFriendlyName());
        Assertions.assertEquals("ldngkpoci", model.recoveryNetworkFriendlyName());
        Assertions.assertEquals("z", model.recoveryNetworkId());
        Assertions.assertEquals("o", model.recoveryFabricArmId());
        Assertions.assertEquals("ukgjnpiucgygevq", model.recoveryFabricFriendlyName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NetworkMappingProperties model =
            new NetworkMappingProperties()
                .withState("gigr")
                .withPrimaryNetworkFriendlyName("burvjxxjnspy")
                .withPrimaryNetworkId("tko")
                .withPrimaryFabricFriendlyName("kouknvudwtiu")
                .withRecoveryNetworkFriendlyName("ldngkpoci")
                .withRecoveryNetworkId("z")
                .withRecoveryFabricArmId("o")
                .withRecoveryFabricFriendlyName("ukgjnpiucgygevq")
                .withFabricSpecificSettings(new NetworkMappingFabricSpecificSettings());
        model = BinaryData.fromObject(model).toObject(NetworkMappingProperties.class);
        Assertions.assertEquals("gigr", model.state());
        Assertions.assertEquals("burvjxxjnspy", model.primaryNetworkFriendlyName());
        Assertions.assertEquals("tko", model.primaryNetworkId());
        Assertions.assertEquals("kouknvudwtiu", model.primaryFabricFriendlyName());
        Assertions.assertEquals("ldngkpoci", model.recoveryNetworkFriendlyName());
        Assertions.assertEquals("z", model.recoveryNetworkId());
        Assertions.assertEquals("o", model.recoveryFabricArmId());
        Assertions.assertEquals("ukgjnpiucgygevq", model.recoveryFabricFriendlyName());
    }
}
