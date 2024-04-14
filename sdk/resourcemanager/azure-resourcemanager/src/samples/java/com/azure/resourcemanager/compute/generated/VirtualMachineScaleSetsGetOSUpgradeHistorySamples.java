// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

/**
 * Samples for VirtualMachineScaleSets GetOSUpgradeHistory.
 */
public final class VirtualMachineScaleSetsGetOSUpgradeHistorySamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2024-03-01/examples/
     * virtualMachineScaleSetExamples/VirtualMachineScaleSet_GetOSUpgradeHistory_MinimumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachineScaleSet_GetOSUpgradeHistory_MinimumSet_Gen.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        virtualMachineScaleSetGetOSUpgradeHistoryMinimumSetGen(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines().manager().serviceClient().getVirtualMachineScaleSets().getOSUpgradeHistory("rgcompute",
            "aaaaaaaaaaaaaaaaaaaaaaaaaa", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2024-03-01/examples/
     * virtualMachineScaleSetExamples/VirtualMachineScaleSet_GetOSUpgradeHistory_MaximumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachineScaleSet_GetOSUpgradeHistory_MaximumSet_Gen.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        virtualMachineScaleSetGetOSUpgradeHistoryMaximumSetGen(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines().manager().serviceClient().getVirtualMachineScaleSets().getOSUpgradeHistory("rgcompute",
            "aaaaaa", com.azure.core.util.Context.NONE);
    }
}
