// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.NetworkFabricSkuProperties;
import org.junit.jupiter.api.Assertions;

public final class NetworkFabricSkuPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NetworkFabricSkuProperties model =
            BinaryData
                .fromString(
                    "{\"type\":\"zvhxnk\",\"maxComputeRacks\":144563900,\"minSupportedVer\":\"u\",\"maxSupportedVer\":\"tppn\",\"detailsUri\":\"xz\",\"provisioningState\":\"Canceled\"}")
                .toObject(NetworkFabricSkuProperties.class);
        Assertions.assertEquals(144563900, model.maxComputeRacks());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NetworkFabricSkuProperties model = new NetworkFabricSkuProperties().withMaxComputeRacks(144563900);
        model = BinaryData.fromObject(model).toObject(NetworkFabricSkuProperties.class);
        Assertions.assertEquals(144563900, model.maxComputeRacks());
    }
}
