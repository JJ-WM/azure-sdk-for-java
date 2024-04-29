// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.generated;

/**
 * Samples for Workspaces GetByResourceGroup.
 */
public final class WorkspacesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/healthcareapis/resource-manager/Microsoft.HealthcareApis/stable/2024-03-31/examples/workspaces/Workspaces_Get.json
     */
    /**
     * Sample code: Get workspace.
     * 
     * @param manager Entry point to HealthcareApisManager.
     */
    public static void getWorkspace(com.azure.resourcemanager.healthcareapis.HealthcareApisManager manager) {
        manager.workspaces().getByResourceGroupWithResponse("testRG", "workspace1", com.azure.core.util.Context.NONE);
    }
}
