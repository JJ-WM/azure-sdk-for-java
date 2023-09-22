// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.HyperVHostDetails;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.HyperVSiteDetails;
import java.util.Arrays;

public final class HyperVSiteDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HyperVSiteDetails model =
            BinaryData
                .fromString(
                    "{\"instanceType\":\"HyperVSite\",\"hyperVHosts\":[{\"id\":\"yldqpzfzxsox\",\"name\":\"unjlzkdrocq\",\"marsAgentVersion\":\"ytqqtcmi\"},{\"id\":\"w\",\"name\":\"vn\",\"marsAgentVersion\":\"ylajam\"},{\"id\":\"jyh\",\"name\":\"p\",\"marsAgentVersion\":\"rryklleynqan\"}]}")
                .toObject(HyperVSiteDetails.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HyperVSiteDetails model =
            new HyperVSiteDetails()
                .withHyperVHosts(
                    Arrays.asList(new HyperVHostDetails(), new HyperVHostDetails(), new HyperVHostDetails()));
        model = BinaryData.fromObject(model).toObject(HyperVSiteDetails.class);
    }
}
