// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

/** Samples for EnvironmentTypes Delete. */
public final class EnvironmentTypesDeleteSamples {
    /*
     * x-ms-original-file: specification/devcenter/resource-manager/Microsoft.DevCenter/preview/2023-10-01-preview/examples/EnvironmentTypes_Delete.json
     */
    /**
     * Sample code: EnvironmentTypes_Delete.
     *
     * @param manager Entry point to DevCenterManager.
     */
    public static void environmentTypesDelete(com.azure.resourcemanager.devcenter.DevCenterManager manager) {
        manager.environmentTypes().deleteWithResponse("rg1", "Contoso", "DevTest", com.azure.core.util.Context.NONE);
    }
}
