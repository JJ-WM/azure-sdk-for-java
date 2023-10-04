// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedapplications.generated;

/** Samples for JitRequests Delete. */
public final class JitRequestsDeleteSamples {
    /*
     * x-ms-original-file: specification/solutions/resource-manager/Microsoft.Solutions/stable/2021-07-01/examples/deleteJitRequest.json
     */
    /**
     * Sample code: Delete jit request.
     *
     * @param manager Entry point to ApplicationManager.
     */
    public static void deleteJitRequest(com.azure.resourcemanager.managedapplications.ApplicationManager manager) {
        manager.jitRequests().deleteByResourceGroupWithResponse("rg", "myJitRequest", com.azure.core.util.Context.NONE);
    }
}
