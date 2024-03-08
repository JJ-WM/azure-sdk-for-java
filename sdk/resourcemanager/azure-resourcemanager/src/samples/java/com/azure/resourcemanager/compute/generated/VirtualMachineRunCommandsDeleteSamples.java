// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

/**
 * Samples for VirtualMachineRunCommands Delete.
 */
public final class VirtualMachineRunCommandsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2023-09-01/examples/runCommandExamples/
     * VirtualMachineRunCommand_Delete.json
     */
    /**
     * Sample code: Delete a run command.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deleteARunCommand(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines().manager().serviceClient().getVirtualMachineRunCommands().delete("myResourceGroup",
            "myVM", "myRunCommand", com.azure.core.util.Context.NONE);
    }
}
