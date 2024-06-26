// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.avs.fluent.models.ExpressRouteAuthorizationInner;

/** An instance of this class provides access to all the operations defined in AuthorizationsClient. */
public interface AuthorizationsClient {
    /**
     * List ExpressRoute Circuit Authorizations in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a paged list of ExpressRoute Circuit Authorizations as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ExpressRouteAuthorizationInner> list(String resourceGroupName, String privateCloudName);

    /**
     * List ExpressRoute Circuit Authorizations in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a paged list of ExpressRoute Circuit Authorizations as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ExpressRouteAuthorizationInner> list(
        String resourceGroupName, String privateCloudName, Context context);

    /**
     * Get an ExpressRoute Circuit Authorization by name in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param authorizationName Name of the ExpressRoute Circuit Authorization in the private cloud.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an ExpressRoute Circuit Authorization by name in a private cloud along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ExpressRouteAuthorizationInner> getWithResponse(
        String resourceGroupName, String privateCloudName, String authorizationName, Context context);

    /**
     * Get an ExpressRoute Circuit Authorization by name in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param authorizationName Name of the ExpressRoute Circuit Authorization in the private cloud.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an ExpressRoute Circuit Authorization by name in a private cloud.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRouteAuthorizationInner get(String resourceGroupName, String privateCloudName, String authorizationName);

    /**
     * Create or update an ExpressRoute Circuit Authorization in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName The name of the private cloud.
     * @param authorizationName Name of the ExpressRoute Circuit Authorization in the private cloud.
     * @param authorization An ExpressRoute Circuit Authorization.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of expressRoute Circuit Authorization.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ExpressRouteAuthorizationInner>, ExpressRouteAuthorizationInner> beginCreateOrUpdate(
        String resourceGroupName,
        String privateCloudName,
        String authorizationName,
        ExpressRouteAuthorizationInner authorization);

    /**
     * Create or update an ExpressRoute Circuit Authorization in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName The name of the private cloud.
     * @param authorizationName Name of the ExpressRoute Circuit Authorization in the private cloud.
     * @param authorization An ExpressRoute Circuit Authorization.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of expressRoute Circuit Authorization.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ExpressRouteAuthorizationInner>, ExpressRouteAuthorizationInner> beginCreateOrUpdate(
        String resourceGroupName,
        String privateCloudName,
        String authorizationName,
        ExpressRouteAuthorizationInner authorization,
        Context context);

    /**
     * Create or update an ExpressRoute Circuit Authorization in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName The name of the private cloud.
     * @param authorizationName Name of the ExpressRoute Circuit Authorization in the private cloud.
     * @param authorization An ExpressRoute Circuit Authorization.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRoute Circuit Authorization.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRouteAuthorizationInner createOrUpdate(
        String resourceGroupName,
        String privateCloudName,
        String authorizationName,
        ExpressRouteAuthorizationInner authorization);

    /**
     * Create or update an ExpressRoute Circuit Authorization in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName The name of the private cloud.
     * @param authorizationName Name of the ExpressRoute Circuit Authorization in the private cloud.
     * @param authorization An ExpressRoute Circuit Authorization.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRoute Circuit Authorization.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRouteAuthorizationInner createOrUpdate(
        String resourceGroupName,
        String privateCloudName,
        String authorizationName,
        ExpressRouteAuthorizationInner authorization,
        Context context);

    /**
     * Delete an ExpressRoute Circuit Authorization in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param authorizationName Name of the ExpressRoute Circuit Authorization in the private cloud.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String privateCloudName, String authorizationName);

    /**
     * Delete an ExpressRoute Circuit Authorization in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param authorizationName Name of the ExpressRoute Circuit Authorization in the private cloud.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String privateCloudName, String authorizationName, Context context);

    /**
     * Delete an ExpressRoute Circuit Authorization in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param authorizationName Name of the ExpressRoute Circuit Authorization in the private cloud.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String privateCloudName, String authorizationName);

    /**
     * Delete an ExpressRoute Circuit Authorization in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param authorizationName Name of the ExpressRoute Circuit Authorization in the private cloud.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String privateCloudName, String authorizationName, Context context);
}
