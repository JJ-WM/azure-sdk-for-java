// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sphere.generated;

/**
 * Samples for Catalogs Delete.
 */
public final class CatalogsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/sphere/resource-manager/Microsoft.AzureSphere/stable/2024-04-01/examples/DeleteCatalog.json
     */
    /**
     * Sample code: Catalogs_Delete.
     * 
     * @param manager Entry point to AzureSphereManager.
     */
    public static void catalogsDelete(com.azure.resourcemanager.sphere.AzureSphereManager manager) {
        manager.catalogs().delete("MyResourceGroup1", "MyCatalog1", com.azure.core.util.Context.NONE);
    }
}
