// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/**
 * The interface for HybridContainerService class.
 */
public interface HybridContainerService {
    /**
     * Gets The ID of the target subscription. The value must be an UUID.
     * 
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets server parameter.
     * 
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets Api Version.
     * 
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Gets The HTTP pipeline to send requests through.
     * 
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     * 
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the ProvisionedClusterInstancesClient object to access its operations.
     * 
     * @return the ProvisionedClusterInstancesClient object.
     */
    ProvisionedClusterInstancesClient getProvisionedClusterInstances();

    /**
     * Gets the HybridIdentityMetadatasClient object to access its operations.
     * 
     * @return the HybridIdentityMetadatasClient object.
     */
    HybridIdentityMetadatasClient getHybridIdentityMetadatas();

    /**
     * Gets the AgentPoolsClient object to access its operations.
     * 
     * @return the AgentPoolsClient object.
     */
    AgentPoolsClient getAgentPools();

    /**
     * Gets the ResourceProvidersClient object to access its operations.
     * 
     * @return the ResourceProvidersClient object.
     */
    ResourceProvidersClient getResourceProviders();

    /**
     * Gets the KubernetesVersionsClient object to access its operations.
     * 
     * @return the KubernetesVersionsClient object.
     */
    KubernetesVersionsClient getKubernetesVersions();

    /**
     * Gets the VMSkusClient object to access its operations.
     * 
     * @return the VMSkusClient object.
     */
    VMSkusClient getVMSkus();

    /**
     * Gets the OperationsClient object to access its operations.
     * 
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the VirtualNetworksClient object to access its operations.
     * 
     * @return the VirtualNetworksClient object.
     */
    VirtualNetworksClient getVirtualNetworks();
}
