// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.generated;

/** Samples for Projects CreateOrUpdate. */
public final class ProjectsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/storagemover/resource-manager/Microsoft.StorageMover/preview/2023-07-01-preview/examples/Projects_CreateOrUpdate.json
     */
    /**
     * Sample code: Projects_CreateOrUpdate.
     *
     * @param manager Entry point to StorageMoverManager.
     */
    public static void projectsCreateOrUpdate(com.azure.resourcemanager.storagemover.StorageMoverManager manager) {
        manager
            .projects()
            .define("examples-projectName")
            .withExistingStorageMover("examples-rg", "examples-storageMoverName")
            .withDescription("Example Project Description")
            .create();
    }
}
