// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

/** Samples for ResourceSkus List. */
public final class ResourceSkusListSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/stable/2023-05-01/examples/GetSkus.json
     */
    /**
     * Sample code: Regenerate Keys.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void regenerateKeys(com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager.resourceSkus().list(com.azure.core.util.Context.NONE);
    }
}
