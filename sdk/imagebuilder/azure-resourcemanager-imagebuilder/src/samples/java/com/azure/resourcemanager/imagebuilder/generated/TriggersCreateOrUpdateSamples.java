// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.imagebuilder.generated;

import com.azure.resourcemanager.imagebuilder.models.SourceImageTriggerProperties;

/**
 * Samples for Triggers CreateOrUpdate.
 */
public final class TriggersCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/imagebuilder/resource-manager/Microsoft.VirtualMachineImages/stable/2023-07-01/examples/
     * CreateSourceImageTrigger.json
     */
    /**
     * Sample code: Create or update a source image type trigger.
     * 
     * @param manager Entry point to ImageBuilderManager.
     */
    public static void
        createOrUpdateASourceImageTypeTrigger(com.azure.resourcemanager.imagebuilder.ImageBuilderManager manager) {
        manager.triggers().define("source").withExistingImageTemplate("myResourceGroup", "myImageTemplate")
            .withProperties(new SourceImageTriggerProperties()).create();
    }
}
