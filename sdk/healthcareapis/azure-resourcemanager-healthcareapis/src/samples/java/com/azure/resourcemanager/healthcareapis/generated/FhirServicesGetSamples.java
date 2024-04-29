// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.generated;

/**
 * Samples for FhirServices Get.
 */
public final class FhirServicesGetSamples {
    /*
     * x-ms-original-file: specification/healthcareapis/resource-manager/Microsoft.HealthcareApis/stable/2024-03-31/examples/fhirservices/FhirServices_Get.json
     */
    /**
     * Sample code: Get a Fhir Service.
     * 
     * @param manager Entry point to HealthcareApisManager.
     */
    public static void getAFhirService(com.azure.resourcemanager.healthcareapis.HealthcareApisManager manager) {
        manager.fhirServices()
            .getWithResponse("testRG", "workspace1", "fhirservices1", com.azure.core.util.Context.NONE);
    }
}
