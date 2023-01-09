// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.core.util.Context;

/** Samples for JobAgents ListByServer. */
public final class JobAgentsListByServerSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/ListJobAgentsByServer.json
     */
    /**
     * Sample code: List job agents in a server.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listJobAgentsInAServer(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers().manager().serviceClient().getJobAgents().listByServer("group1", "server1", Context.NONE);
    }
}
