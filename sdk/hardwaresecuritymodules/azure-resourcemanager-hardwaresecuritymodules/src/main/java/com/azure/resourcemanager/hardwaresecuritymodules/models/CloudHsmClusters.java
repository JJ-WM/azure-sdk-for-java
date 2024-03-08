// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hardwaresecuritymodules.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of CloudHsmClusters.
 */
public interface CloudHsmClusters {
    /**
     * Gets the specified Cloud HSM Cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudHsmClusterName The name of the Cloud HSM Cluster within the specified resource group. Cloud HSM
     * Cluster names must be between 3 and 24 characters in length.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Cloud HSM Cluster along with {@link Response}.
     */
    Response<CloudHsmCluster> getByResourceGroupWithResponse(String resourceGroupName, String cloudHsmClusterName,
        Context context);

    /**
     * Gets the specified Cloud HSM Cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudHsmClusterName The name of the Cloud HSM Cluster within the specified resource group. Cloud HSM
     * Cluster names must be between 3 and 24 characters in length.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Cloud HSM Cluster.
     */
    CloudHsmCluster getByResourceGroup(String resourceGroupName, String cloudHsmClusterName);

    /**
     * Deletes the specified Cloud HSM Cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudHsmClusterName The name of the Cloud HSM Cluster within the specified resource group. Cloud HSM
     * Cluster names must be between 3 and 24 characters in length.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String cloudHsmClusterName);

    /**
     * Deletes the specified Cloud HSM Cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cloudHsmClusterName The name of the Cloud HSM Cluster within the specified resource group. Cloud HSM
     * Cluster names must be between 3 and 24 characters in length.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String cloudHsmClusterName, Context context);

    /**
     * The List operation gets information about the Cloud HSM Clusters associated with the subscription and within the
     * specified resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Cloud HSM Clusters as paginated response with {@link PagedIterable}.
     */
    PagedIterable<CloudHsmCluster> listByResourceGroup(String resourceGroupName);

    /**
     * The List operation gets information about the Cloud HSM Clusters associated with the subscription and within the
     * specified resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param skiptoken The page-continuation token to use with a paged version of this API.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Cloud HSM Clusters as paginated response with {@link PagedIterable}.
     */
    PagedIterable<CloudHsmCluster> listByResourceGroup(String resourceGroupName, String skiptoken, Context context);

    /**
     * The List operation gets information about the Cloud HSM Clusters associated with the subscription.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Cloud HSM Clusters as paginated response with {@link PagedIterable}.
     */
    PagedIterable<CloudHsmCluster> list();

    /**
     * The List operation gets information about the Cloud HSM Clusters associated with the subscription.
     * 
     * @param skiptoken The page-continuation token to use with a paged version of this API.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Cloud HSM Clusters as paginated response with {@link PagedIterable}.
     */
    PagedIterable<CloudHsmCluster> list(String skiptoken, Context context);

    /**
     * Gets the specified Cloud HSM Cluster.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Cloud HSM Cluster along with {@link Response}.
     */
    CloudHsmCluster getById(String id);

    /**
     * Gets the specified Cloud HSM Cluster.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Cloud HSM Cluster along with {@link Response}.
     */
    Response<CloudHsmCluster> getByIdWithResponse(String id, Context context);

    /**
     * Deletes the specified Cloud HSM Cluster.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the specified Cloud HSM Cluster.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new CloudHsmCluster resource.
     * 
     * @param name resource name.
     * @return the first stage of the new CloudHsmCluster definition.
     */
    CloudHsmCluster.DefinitionStages.Blank define(String name);
}
