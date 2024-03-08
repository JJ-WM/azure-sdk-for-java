// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.generated;

import com.azure.resourcemanager.hybridcontainerservice.fluent.models.ProvisionedClusterInner;
import com.azure.resourcemanager.hybridcontainerservice.models.AzureHybridBenefit;
import com.azure.resourcemanager.hybridcontainerservice.models.CloudProviderProfile;
import com.azure.resourcemanager.hybridcontainerservice.models.CloudProviderProfileInfraNetworkProfile;
import com.azure.resourcemanager.hybridcontainerservice.models.ClusterVMAccessProfile;
import com.azure.resourcemanager.hybridcontainerservice.models.ControlPlaneProfile;
import com.azure.resourcemanager.hybridcontainerservice.models.ExtendedLocation;
import com.azure.resourcemanager.hybridcontainerservice.models.ExtendedLocationTypes;
import com.azure.resourcemanager.hybridcontainerservice.models.LinuxProfileProperties;
import com.azure.resourcemanager.hybridcontainerservice.models.LinuxProfilePropertiesSsh;
import com.azure.resourcemanager.hybridcontainerservice.models.LinuxProfilePropertiesSshPublicKeysItem;
import com.azure.resourcemanager.hybridcontainerservice.models.NamedAgentPoolProfile;
import com.azure.resourcemanager.hybridcontainerservice.models.NetworkPolicy;
import com.azure.resourcemanager.hybridcontainerservice.models.NetworkProfile;
import com.azure.resourcemanager.hybridcontainerservice.models.OsType;
import com.azure.resourcemanager.hybridcontainerservice.models.ProvisionedClusterLicenseProfile;
import com.azure.resourcemanager.hybridcontainerservice.models.ProvisionedClusterProperties;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for ProvisionedClusterInstances CreateOrUpdate.
 */
public final class ProvisionedClusterInstancesCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/hybridaks/resource-manager/Microsoft.HybridContainerService/stable/2024-01-01/examples/
     * PutProvisionedClusterInstance.json
     */
    /**
     * Sample code: PutProvisionedClusterInstance.
     * 
     * @param manager Entry point to HybridContainerServiceManager.
     */
    public static void putProvisionedClusterInstance(
        com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager manager) {
        manager.provisionedClusterInstances().createOrUpdate(
            "subscriptions/fd3c3665-1729-4b7b-9a38-238e83b0f98b/resourceGroups/testrg/providers/Microsoft.Kubernetes/connectedClusters/test-hybridakscluster",
            new ProvisionedClusterInner()
                .withProperties(new ProvisionedClusterProperties()
                    .withLinuxProfile(new LinuxProfileProperties()
                        .withSsh(new LinuxProfilePropertiesSsh().withPublicKeys(Arrays.asList(
                            new LinuxProfilePropertiesSshPublicKeysItem().withKeyData("fakeTokenPlaceholder")))))
                    .withControlPlane(new ControlPlaneProfile().withCount(1).withVmSize("Standard_A4_v2"))
                    .withKubernetesVersion("v1.20.5")
                    .withNetworkProfile(
                        new NetworkProfile().withNetworkPolicy(NetworkPolicy.CALICO).withPodCidr("10.244.0.0/16"))
                    .withClusterVMAccessProfile(
                        new ClusterVMAccessProfile().withAuthorizedIpRanges("127.0.0.1,127.0.0.2"))
                    .withAgentPoolProfiles(Arrays.asList(new NamedAgentPoolProfile().withOsType(OsType.LINUX)
                        .withNodeLabels(mapOf("env", "dev", "goal", "test"))
                        .withNodeTaints(Arrays.asList("env=prod:NoSchedule", "sku=gpu:NoSchedule")).withCount(1)
                        .withVmSize("Standard_A4_v2").withName("default-nodepool-1")))
                    .withCloudProviderProfile(new CloudProviderProfile().withInfraNetworkProfile(
                        new CloudProviderProfileInfraNetworkProfile().withVnetSubnetIds(Arrays.asList(
                            "/subscriptions/a3e42606-29b1-4d7d-b1d9-9ff6b9d3c71b/resourceGroups/test-arcappliance-resgrp/providers/Microsoft.AzureStackHCI/logicalNetworks/test-vnet-static"))))
                    .withLicenseProfile(new ProvisionedClusterLicenseProfile()
                        .withAzureHybridBenefit(AzureHybridBenefit.NOT_APPLICABLE)))
                .withExtendedLocation(new ExtendedLocation().withType(ExtendedLocationTypes.CUSTOM_LOCATION).withName(
                    "/subscriptions/a3e42606-29b1-4d7d-b1d9-9ff6b9d3c71b/resourcegroups/test-arcappliance-resgrp/providers/microsoft.extendedlocation/customlocations/testcustomlocation")),
            com.azure.core.util.Context.NONE);
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
