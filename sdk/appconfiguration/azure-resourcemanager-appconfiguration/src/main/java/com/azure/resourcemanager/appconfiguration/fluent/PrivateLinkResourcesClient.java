// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appconfiguration.fluent.models.PrivateLinkResourceInner;

/** An instance of this class provides access to all the operations defined in PrivateLinkResourcesClient. */
public interface PrivateLinkResourcesClient {
    /**
     * Gets the private link resources that need to be created for a configuration store.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param configStoreName The name of the configuration store.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources that need to be created for a configuration store as paginated response with
     *     {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PrivateLinkResourceInner> listByConfigurationStore(String resourceGroupName, String configStoreName);

    /**
     * Gets the private link resources that need to be created for a configuration store.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param configStoreName The name of the configuration store.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources that need to be created for a configuration store as paginated response with
     *     {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PrivateLinkResourceInner> listByConfigurationStore(
        String resourceGroupName, String configStoreName, Context context);

    /**
     * Gets a private link resource that need to be created for a configuration store.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param configStoreName The name of the configuration store.
     * @param groupName The name of the private link resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private link resource that need to be created for a configuration store along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PrivateLinkResourceInner> getWithResponse(
        String resourceGroupName, String configStoreName, String groupName, Context context);

    /**
     * Gets a private link resource that need to be created for a configuration store.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param configStoreName The name of the configuration store.
     * @param groupName The name of the private link resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private link resource that need to be created for a configuration store.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateLinkResourceInner get(String resourceGroupName, String configStoreName, String groupName);
}
