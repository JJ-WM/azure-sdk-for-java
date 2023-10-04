// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.generated;

/** Samples for PrivateEndpointConnections Delete. */
public final class PrivateEndpointConnectionsDeleteSamples {
    /*
     * x-ms-original-file: specification/redis/resource-manager/Microsoft.Cache/stable/2023-08-01/examples/RedisCacheDeletePrivateEndpointConnection.json
     */
    /**
     * Sample code: RedisCacheDeletePrivateEndpointConnection.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void redisCacheDeletePrivateEndpointConnection(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .redisCaches()
            .manager()
            .serviceClient()
            .getPrivateEndpointConnections()
            .deleteWithResponse("rgtest01", "cachetest01", "pectest01", com.azure.core.util.Context.NONE);
    }
}
