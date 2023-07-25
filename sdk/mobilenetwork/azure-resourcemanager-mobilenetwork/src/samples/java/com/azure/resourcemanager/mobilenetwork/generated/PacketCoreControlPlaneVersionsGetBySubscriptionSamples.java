// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

/** Samples for PacketCoreControlPlaneVersions GetBySubscription. */
public final class PacketCoreControlPlaneVersionsGetBySubscriptionSamples {
    /*
     * x-ms-original-file: specification/mobilenetwork/resource-manager/Microsoft.MobileNetwork/stable/2023-06-01/examples/PacketCoreControlPlaneVersionGetBySubscription.json
     */
    /**
     * Sample code: Get packet core control plane version by subscription.
     *
     * @param manager Entry point to MobileNetworkManager.
     */
    public static void getPacketCoreControlPlaneVersionBySubscription(
        com.azure.resourcemanager.mobilenetwork.MobileNetworkManager manager) {
        manager
            .packetCoreControlPlaneVersions()
            .getBySubscriptionWithResponse("PMN-4-11-1", com.azure.core.util.Context.NONE);
    }
}
