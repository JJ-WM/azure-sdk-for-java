// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

/** Samples for ReplicationNetworkMappings ListByReplicationNetworks. */
public final class ReplicationNetworkMappingsListByReplicationNetw {
    /*
     * x-ms-original-file: specification/recoveryservicessiterecovery/resource-manager/Microsoft.RecoveryServices/stable/2023-06-01/examples/ReplicationNetworkMappings_ListByReplicationNetworks.json
     */
    /**
     * Sample code: Gets all the network mappings under a network.
     *
     * @param manager Entry point to SiteRecoveryManager.
     */
    public static void getsAllTheNetworkMappingsUnderANetwork(
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager) {
        manager
            .replicationNetworkMappings()
            .listByReplicationNetworks(
                "srce2avaultbvtaC27",
                "srcBvte2a14C27",
                "b0cef6e9a4437b81803d0b55ada4f700ab66caae59c35d62723a1589c0cd13ac",
                "e2267b5c-2650-49bd-ab3f-d66aae694c06",
                com.azure.core.util.Context.NONE);
    }
}
