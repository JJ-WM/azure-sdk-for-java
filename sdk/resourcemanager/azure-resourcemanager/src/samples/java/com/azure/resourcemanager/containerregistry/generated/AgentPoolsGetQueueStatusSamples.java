// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated;

/**
 * Samples for AgentPools GetQueueStatus.
 */
public final class AgentPoolsGetQueueStatusSamples {
    /*
     * x-ms-original-file:
     * specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2019-06-01-preview/examples/
     * AgentPoolsGetQueueStatus.json
     */
    /**
     * Sample code: AgentPools_GetQueueStatus.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void agentPoolsGetQueueStatus(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.containerRegistries().manager().serviceClient().getAgentPools().getQueueStatusWithResponse(
            "myResourceGroup", "myRegistry", "myAgentPool", com.azure.core.util.Context.NONE);
    }
}
