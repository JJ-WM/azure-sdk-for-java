// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.generated;

/** Samples for Redis List. */
public final class RedisListSamples {
    /*
     * x-ms-original-file: specification/redis/resource-manager/Microsoft.Cache/stable/2023-08-01/examples/RedisCacheList.json
     */
    /**
     * Sample code: RedisCacheList.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void redisCacheList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.redisCaches().manager().serviceClient().getRedis().list(com.azure.core.util.Context.NONE);
    }
}
