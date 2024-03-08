// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

/** Samples for LicenseProfiles Delete. */
public final class LicenseProfilesDeleteSamples {
    /*
     * x-ms-original-file: specification/hybridcompute/resource-manager/Microsoft.HybridCompute/preview/2023-06-20-preview/examples/licenseProfile/LicenseProfile_Delete.json
     */
    /**
     * Sample code: Delete a License Profile.
     *
     * @param manager Entry point to HybridComputeManager.
     */
    public static void deleteALicenseProfile(com.azure.resourcemanager.hybridcompute.HybridComputeManager manager) {
        manager.licenseProfiles().delete("myResourceGroup", "myMachine", com.azure.core.util.Context.NONE);
    }
}
