// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.generated;

import com.azure.resourcemanager.healthcareapis.models.Kind;
import com.azure.resourcemanager.healthcareapis.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.healthcareapis.models.PublicNetworkAccess;
import com.azure.resourcemanager.healthcareapis.models.ServiceAccessPolicyEntry;
import com.azure.resourcemanager.healthcareapis.models.ServiceAuthenticationConfigurationInfo;
import com.azure.resourcemanager.healthcareapis.models.ServiceCorsConfigurationInfo;
import com.azure.resourcemanager.healthcareapis.models.ServiceCosmosDbConfigurationInfo;
import com.azure.resourcemanager.healthcareapis.models.ServiceExportConfigurationInfo;
import com.azure.resourcemanager.healthcareapis.models.ServicesProperties;
import com.azure.resourcemanager.healthcareapis.models.ServicesResourceIdentity;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Services CreateOrUpdate.
 */
public final class ServicesCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/healthcareapis/resource-manager/Microsoft.HealthcareApis/stable/2023-11-01/examples/legacy/
     * ServiceCreate.json
     */
    /**
     * Sample code: Create or Update a service with all parameters.
     * 
     * @param manager Entry point to HealthcareApisManager.
     */
    public static void createOrUpdateAServiceWithAllParameters(
        com.azure.resourcemanager.healthcareapis.HealthcareApisManager manager) {
        manager
            .services().define("service1").withRegion("westus2").withExistingResourceGroup(
                "rg1")
            .withKind(Kind.FHIR_R4).withTags(mapOf())
            .withIdentity(new ServicesResourceIdentity().withType(ManagedServiceIdentityType.SYSTEM_ASSIGNED))
            .withProperties(new ServicesProperties()
                .withAccessPolicies(
                    Arrays.asList(new ServiceAccessPolicyEntry().withObjectId("c487e7d1-3210-41a3-8ccc-e9372b78da47"),
                        new ServiceAccessPolicyEntry().withObjectId("5b307da8-43d4-492b-8b66-b0294ade872f")))
                .withCosmosDbConfiguration(new ServiceCosmosDbConfigurationInfo().withOfferThroughput(1000)
                    .withKeyVaultKeyUri("fakeTokenPlaceholder"))
                .withAuthenticationConfiguration(new ServiceAuthenticationConfigurationInfo()
                    .withAuthority("https://login.microsoftonline.com/abfde7b2-df0f-47e6-aabf-2462b07508dc")
                    .withAudience("https://azurehealthcareapis.com").withSmartProxyEnabled(true))
                .withCorsConfiguration(
                    new ServiceCorsConfigurationInfo().withOrigins(Arrays.asList("*")).withHeaders(Arrays.asList("*"))
                        .withMethods(Arrays.asList("DELETE", "GET", "OPTIONS", "PATCH", "POST", "PUT")).withMaxAge(1440)
                        .withAllowCredentials(false))
                .withExportConfiguration(
                    new ServiceExportConfigurationInfo().withStorageAccountName("existingStorageAccount"))
                .withPrivateEndpointConnections(Arrays.asList()).withPublicNetworkAccess(PublicNetworkAccess.DISABLED))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/healthcareapis/resource-manager/Microsoft.HealthcareApis/stable/2023-11-01/examples/legacy/
     * ServiceCreateInDataSovereignRegionWithCmkEnabled.json
     */
    /**
     * Sample code: Create or Update a service with all parameters and CMK enabled in a data sovereign region.
     * 
     * @param manager Entry point to HealthcareApisManager.
     */
    public static void createOrUpdateAServiceWithAllParametersAndCMKEnabledInADataSovereignRegion(
        com.azure.resourcemanager.healthcareapis.HealthcareApisManager manager) {
        manager
            .services().define("service1").withRegion("Southeast Asia").withExistingResourceGroup(
                "rg1")
            .withKind(Kind.FHIR_R4).withTags(mapOf())
            .withIdentity(new ServicesResourceIdentity().withType(ManagedServiceIdentityType.SYSTEM_ASSIGNED))
            .withProperties(new ServicesProperties()
                .withAccessPolicies(
                    Arrays.asList(new ServiceAccessPolicyEntry().withObjectId("c487e7d1-3210-41a3-8ccc-e9372b78da47"),
                        new ServiceAccessPolicyEntry().withObjectId("5b307da8-43d4-492b-8b66-b0294ade872f")))
                .withCosmosDbConfiguration(new ServiceCosmosDbConfigurationInfo().withOfferThroughput(1000)
                    .withKeyVaultKeyUri("fakeTokenPlaceholder")
                    .withCrossTenantCmkApplicationId("de3fbeef-8c3a-428e-8b9f-4d229c8a85f4"))
                .withAuthenticationConfiguration(new ServiceAuthenticationConfigurationInfo()
                    .withAuthority("https://login.microsoftonline.com/abfde7b2-df0f-47e6-aabf-2462b07508dc")
                    .withAudience("https://azurehealthcareapis.com").withSmartProxyEnabled(true))
                .withCorsConfiguration(
                    new ServiceCorsConfigurationInfo().withOrigins(Arrays.asList("*")).withHeaders(Arrays.asList("*"))
                        .withMethods(Arrays.asList("DELETE", "GET", "OPTIONS", "PATCH", "POST", "PUT")).withMaxAge(1440)
                        .withAllowCredentials(false))
                .withExportConfiguration(
                    new ServiceExportConfigurationInfo().withStorageAccountName("existingStorageAccount"))
                .withPrivateEndpointConnections(Arrays.asList()).withPublicNetworkAccess(PublicNetworkAccess.DISABLED))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/healthcareapis/resource-manager/Microsoft.HealthcareApis/stable/2023-11-01/examples/legacy/
     * ServiceCreateMinimum.json
     */
    /**
     * Sample code: Create or Update a service with minimum parameters.
     * 
     * @param manager Entry point to HealthcareApisManager.
     */
    public static void createOrUpdateAServiceWithMinimumParameters(
        com.azure.resourcemanager.healthcareapis.HealthcareApisManager manager) {
        manager.services().define("service2").withRegion("westus2").withExistingResourceGroup("rg1")
            .withKind(Kind.FHIR_R4).withTags(mapOf())
            .withProperties(new ServicesProperties().withAccessPolicies(
                Arrays.asList(new ServiceAccessPolicyEntry().withObjectId("c487e7d1-3210-41a3-8ccc-e9372b78da47"))))
            .create();
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
