// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.models.NetworkFeatures;
import com.azure.resourcemanager.netapp.models.UpdateNetworkSiblingSetRequest;
import org.junit.jupiter.api.Assertions;

public final class UpdateNetworkSiblingSetRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UpdateNetworkSiblingSetRequest model = BinaryData.fromString(
            "{\"networkSiblingSetId\":\"ctyqik\",\"subnetId\":\"bbovplwzbhvgyugu\",\"networkSiblingSetStateId\":\"svmkfssxquk\",\"networkFeatures\":\"Basic\"}")
            .toObject(UpdateNetworkSiblingSetRequest.class);
        Assertions.assertEquals("ctyqik", model.networkSiblingSetId());
        Assertions.assertEquals("bbovplwzbhvgyugu", model.subnetId());
        Assertions.assertEquals("svmkfssxquk", model.networkSiblingSetStateId());
        Assertions.assertEquals(NetworkFeatures.BASIC, model.networkFeatures());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UpdateNetworkSiblingSetRequest model
            = new UpdateNetworkSiblingSetRequest().withNetworkSiblingSetId("ctyqik").withSubnetId("bbovplwzbhvgyugu")
                .withNetworkSiblingSetStateId("svmkfssxquk").withNetworkFeatures(NetworkFeatures.BASIC);
        model = BinaryData.fromObject(model).toObject(UpdateNetworkSiblingSetRequest.class);
        Assertions.assertEquals("ctyqik", model.networkSiblingSetId());
        Assertions.assertEquals("bbovplwzbhvgyugu", model.subnetId());
        Assertions.assertEquals("svmkfssxquk", model.networkSiblingSetStateId());
        Assertions.assertEquals(NetworkFeatures.BASIC, model.networkFeatures());
    }
}
