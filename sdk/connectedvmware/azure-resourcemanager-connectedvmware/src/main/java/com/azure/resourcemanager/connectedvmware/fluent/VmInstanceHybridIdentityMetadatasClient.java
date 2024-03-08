// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.connectedvmware.fluent.models.VmInstanceHybridIdentityMetadataInner;

/**
 * An instance of this class provides access to all the operations defined in VmInstanceHybridIdentityMetadatasClient.
 */
public interface VmInstanceHybridIdentityMetadatasClient {
    /**
     * Gets HybridIdentityMetadata.
     *
     * <p>Implements HybridIdentityMetadata GET method.
     *
     * @param resourceUri The fully qualified Azure Resource manager identifier of the Hybrid Compute machine resource
     *     to be extended.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the HybridIdentityMetadata along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<VmInstanceHybridIdentityMetadataInner> getWithResponse(String resourceUri, Context context);

    /**
     * Gets HybridIdentityMetadata.
     *
     * <p>Implements HybridIdentityMetadata GET method.
     *
     * @param resourceUri The fully qualified Azure Resource manager identifier of the Hybrid Compute machine resource
     *     to be extended.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the HybridIdentityMetadata.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VmInstanceHybridIdentityMetadataInner get(String resourceUri);

    /**
     * Implements GET HybridIdentityMetadata in a vm.
     *
     * <p>Returns the list of HybridIdentityMetadata of the given vm.
     *
     * @param resourceUri The fully qualified Azure Resource manager identifier of the Hybrid Compute machine resource
     *     to be extended.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of HybridIdentityMetadata as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VmInstanceHybridIdentityMetadataInner> list(String resourceUri);

    /**
     * Implements GET HybridIdentityMetadata in a vm.
     *
     * <p>Returns the list of HybridIdentityMetadata of the given vm.
     *
     * @param resourceUri The fully qualified Azure Resource manager identifier of the Hybrid Compute machine resource
     *     to be extended.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of HybridIdentityMetadata as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VmInstanceHybridIdentityMetadataInner> list(String resourceUri, Context context);
}
