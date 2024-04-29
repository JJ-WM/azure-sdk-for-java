// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.generated;

/**
 * Samples for FileWorkspaces Get.
 */
public final class FileWorkspacesGetSamples {
    /*
     * x-ms-original-file: specification/support/resource-manager/Microsoft.Support/stable/2024-04-01/examples/GetFileWorkspaceDetailsForSubscription.json
     */
    /**
     * Sample code: Get details of a subscription file workspace.
     * 
     * @param manager Entry point to SupportManager.
     */
    public static void
        getDetailsOfASubscriptionFileWorkspace(com.azure.resourcemanager.support.SupportManager manager) {
        manager.fileWorkspaces().getWithResponse("testworkspace", com.azure.core.util.Context.NONE);
    }
}
