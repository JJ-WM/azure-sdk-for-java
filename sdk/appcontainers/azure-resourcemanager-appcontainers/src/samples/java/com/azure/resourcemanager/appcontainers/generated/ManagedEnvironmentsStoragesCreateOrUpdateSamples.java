// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.resourcemanager.appcontainers.models.AccessMode;
import com.azure.resourcemanager.appcontainers.models.AzureFileProperties;
import com.azure.resourcemanager.appcontainers.models.ManagedEnvironmentStorageProperties;
import com.azure.resourcemanager.appcontainers.models.NfsAzureFileProperties;

/**
 * Samples for ManagedEnvironmentsStorages CreateOrUpdate.
 */
public final class ManagedEnvironmentsStoragesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/preview/2023-11-02-preview/examples/
     * ManagedEnvironmentsStorages_CreateOrUpdate_NfsAzureFile.json
     */
    /**
     * Sample code: Create or update environments storage for NFS Azure file.
     * 
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void createOrUpdateEnvironmentsStorageForNFSAzureFile(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.managedEnvironmentsStorages().define("jlaw-demo1")
            .withExistingManagedEnvironment("examplerg", "managedEnv")
            .withProperties(new ManagedEnvironmentStorageProperties().withNfsAzureFile(new NfsAzureFileProperties()
                .withServer("server1").withAccessMode(AccessMode.READ_ONLY).withShareName("share1")))
            .create();
    }

    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/preview/2023-11-02-preview/examples/
     * ManagedEnvironmentsStorages_CreateOrUpdate.json
     */
    /**
     * Sample code: Create or update environments storage.
     * 
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void
        createOrUpdateEnvironmentsStorage(com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.managedEnvironmentsStorages().define("jlaw-demo1")
            .withExistingManagedEnvironment("examplerg", "managedEnv")
            .withProperties(new ManagedEnvironmentStorageProperties().withAzureFile(
                new AzureFileProperties().withAccountName("account1").withAccountKey("fakeTokenPlaceholder")
                    .withAccessMode(AccessMode.READ_ONLY).withShareName("share1")))
            .create();
    }
}
