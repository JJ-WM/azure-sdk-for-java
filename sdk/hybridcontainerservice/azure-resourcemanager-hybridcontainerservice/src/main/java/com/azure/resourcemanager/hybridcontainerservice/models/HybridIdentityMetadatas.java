// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.hybridcontainerservice.fluent.models.HybridIdentityMetadataInner;

/**
 * Resource collection API of HybridIdentityMetadatas.
 */
public interface HybridIdentityMetadatas {
    /**
     * Creates the hybrid identity metadata resource
     * 
     * Creates the hybrid identity metadata proxy resource that facilitates the managed identity provisioning.
     * 
     * @param connectedClusterResourceUri The fully qualified Azure Resource Manager identifier of the connected cluster
     * resource.
     * @param body Hybrid Identity Metadata resource definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the hybridIdentityMetadata along with {@link Response}.
     */
    Response<HybridIdentityMetadata> putWithResponse(String connectedClusterResourceUri,
        HybridIdentityMetadataInner body, Context context);

    /**
     * Creates the hybrid identity metadata resource
     * 
     * Creates the hybrid identity metadata proxy resource that facilitates the managed identity provisioning.
     * 
     * @param connectedClusterResourceUri The fully qualified Azure Resource Manager identifier of the connected cluster
     * resource.
     * @param body Hybrid Identity Metadata resource definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the hybridIdentityMetadata.
     */
    HybridIdentityMetadata put(String connectedClusterResourceUri, HybridIdentityMetadataInner body);

    /**
     * Get the hybrid identity metadata resource
     * 
     * Get the hybrid identity metadata proxy resource.
     * 
     * @param connectedClusterResourceUri The fully qualified Azure Resource Manager identifier of the connected cluster
     * resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the hybrid identity metadata proxy resource along with {@link Response}.
     */
    Response<HybridIdentityMetadata> getWithResponse(String connectedClusterResourceUri, Context context);

    /**
     * Get the hybrid identity metadata resource
     * 
     * Get the hybrid identity metadata proxy resource.
     * 
     * @param connectedClusterResourceUri The fully qualified Azure Resource Manager identifier of the connected cluster
     * resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the hybrid identity metadata proxy resource.
     */
    HybridIdentityMetadata get(String connectedClusterResourceUri);

    /**
     * Deletes the hybrid identity metadata resource
     * 
     * Deletes the hybrid identity metadata proxy resource.
     * 
     * @param connectedClusterResourceUri The fully qualified Azure Resource Manager identifier of the connected cluster
     * resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String connectedClusterResourceUri);

    /**
     * Deletes the hybrid identity metadata resource
     * 
     * Deletes the hybrid identity metadata proxy resource.
     * 
     * @param connectedClusterResourceUri The fully qualified Azure Resource Manager identifier of the connected cluster
     * resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String connectedClusterResourceUri, Context context);

    /**
     * Lists the hybrid identity metadata resources in a provisioned cluster instance
     * 
     * Lists the hybrid identity metadata proxy resource in a provisioned cluster instance.
     * 
     * @param connectedClusterResourceUri The fully qualified Azure Resource Manager identifier of the connected cluster
     * resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of hybridIdentityMetadata as paginated response with {@link PagedIterable}.
     */
    PagedIterable<HybridIdentityMetadata> listByCluster(String connectedClusterResourceUri);

    /**
     * Lists the hybrid identity metadata resources in a provisioned cluster instance
     * 
     * Lists the hybrid identity metadata proxy resource in a provisioned cluster instance.
     * 
     * @param connectedClusterResourceUri The fully qualified Azure Resource Manager identifier of the connected cluster
     * resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of hybridIdentityMetadata as paginated response with {@link PagedIterable}.
     */
    PagedIterable<HybridIdentityMetadata> listByCluster(String connectedClusterResourceUri, Context context);
}
