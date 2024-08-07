// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated;

import com.azure.resourcemanager.appplatform.models.ApmReference;

/**
 * Samples for Services DisableApmGlobally.
 */
public final class ServicesDisableApmGloballySamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/stable/2023-12-01/examples/
     * Services_DisableApmGlobally.json
     */
    /**
     * Sample code: Services_DisableApmGlobally.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void servicesDisableApmGlobally(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.springServices()
            .manager()
            .serviceClient()
            .getServices()
            .disableApmGlobally("myResourceGroup", "myservice", new ApmReference().withResourceId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.AppPlatform/Spring/myservice/apms/myappinsights"),
                com.azure.core.util.Context.NONE);
    }
}
