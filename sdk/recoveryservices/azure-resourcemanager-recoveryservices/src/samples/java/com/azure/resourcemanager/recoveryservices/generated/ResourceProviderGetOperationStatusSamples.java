// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated;

/** Samples for ResourceProvider GetOperationStatus. */
public final class ResourceProviderGetOperationStatusSamples {
    /*
     * x-ms-original-file: specification/recoveryservices/resource-manager/Microsoft.RecoveryServices/stable/2023-04-01/examples/GetOperationStatus.json
     */
    /**
     * Sample code: Get Operation Status.
     *
     * @param manager Entry point to RecoveryServicesManager.
     */
    public static void getOperationStatus(com.azure.resourcemanager.recoveryservices.RecoveryServicesManager manager) {
        manager
            .resourceProviders()
            .getOperationStatusWithResponse(
                "HelloWorld",
                "swaggerExample",
                "YWUzNDFkMzQtZmM5OS00MmUyLWEzNDMtZGJkMDIxZjlmZjgzOzdmYzBiMzhmLTc2NmItNDM5NS05OWQ1LTVmOGEzNzg4MWQzNA==",
                com.azure.core.util.Context.NONE);
    }
}
