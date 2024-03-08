// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

/**
 * Samples for PrivateEndpointConnection Delete.
 */
public final class PrivateEndpointConnectionDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/stable/2023-06-01/examples/
     * PrivateEndpointConnection/DeletePrivateEndpointConnection.json
     */
    /**
     * Sample code: Delete PrivateEndpointConnection.
     * 
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void deletePrivateEndpointConnection(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager.privateEndpointConnections().delete("gaallavaultbvtd2msi", "gaallaRG",
            "gaallatestpe2.5704c932-249a-490b-a142-1396838cd3b", com.azure.core.util.Context.NONE);
    }
}
