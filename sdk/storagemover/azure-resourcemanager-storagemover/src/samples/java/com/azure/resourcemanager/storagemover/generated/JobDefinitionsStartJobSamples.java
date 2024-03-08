// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.generated;

/** Samples for JobDefinitions StartJob. */
public final class JobDefinitionsStartJobSamples {
    /*
     * x-ms-original-file: specification/storagemover/resource-manager/Microsoft.StorageMover/stable/2023-10-01/examples/JobDefinitions_StartJob.json
     */
    /**
     * Sample code: JobDefinitions_StartJob.
     *
     * @param manager Entry point to StorageMoverManager.
     */
    public static void jobDefinitionsStartJob(com.azure.resourcemanager.storagemover.StorageMoverManager manager) {
        manager
            .jobDefinitions()
            .startJobWithResponse(
                "examples-rg",
                "examples-storageMoverName",
                "examples-projectName",
                "examples-jobDefinitionName",
                com.azure.core.util.Context.NONE);
    }
}
