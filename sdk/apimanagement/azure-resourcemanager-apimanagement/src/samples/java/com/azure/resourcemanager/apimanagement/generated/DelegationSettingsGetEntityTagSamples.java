// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

/** Samples for DelegationSettings GetEntityTag. */
public final class DelegationSettingsGetEntityTagSamples {
    /*
     * x-ms-original-file: specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2022-08-01/examples/ApiManagementHeadDelegationSettings.json
     */
    /**
     * Sample code: ApiManagementHeadDelegationSettings.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementHeadDelegationSettings(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.delegationSettings().getEntityTagWithResponse("rg1", "apimService1", com.azure.core.util.Context.NONE);
    }
}
