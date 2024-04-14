// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.ConnectableResource;

public final class ConnectableResourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ConnectableResource model = BinaryData.fromString(
            "{\"id\":\"iqbplvfidusz\",\"inboundConnectedResources\":[{\"connectedResourceId\":\"byjgmsfepx\",\"tcpPorts\":\"hpqadagrhrdicxdw\",\"udpPorts\":\"fowxwyovcxjsgbi\"},{\"connectedResourceId\":\"ukdveksbuhoduc\",\"tcpPorts\":\"lscrdpibfdyjduss\",\"udpPorts\":\"szekbh\"}],\"outboundConnectedResources\":[{\"connectedResourceId\":\"aggkrehbfrn\",\"tcpPorts\":\"bffljfiimreoag\",\"udpPorts\":\"taadu\"},{\"connectedResourceId\":\"e\",\"tcpPorts\":\"f\",\"udpPorts\":\"sqwudohzilfmnli\"},{\"connectedResourceId\":\"simsfeypofqpmb\",\"tcpPorts\":\"qgsdr\",\"udpPorts\":\"ttjxophgerhsmvgo\"}]}")
            .toObject(ConnectableResource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ConnectableResource model = new ConnectableResource();
        model = BinaryData.fromObject(model).toObject(ConnectableResource.class);
    }
}
