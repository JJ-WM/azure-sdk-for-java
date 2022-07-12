// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

import com.azure.core.util.Context;

/** Samples for Collection ListUsages. */
public final class CollectionListUsagesSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2022-05-15/examples/CosmosDBCollectionGetUsages.json
     */
    /**
     * Sample code: CosmosDBCollectionGetUsages.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBCollectionGetUsages(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getCollections()
            .listUsages("rg1", "ddb1", "databaseRid", "collectionRid", "$filter=name.value eq 'Storage'", Context.NONE);
    }
}
