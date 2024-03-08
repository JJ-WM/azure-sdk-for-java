// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Datastores. */
public interface Datastores {
    /**
     * Gets a datastore.
     *
     * <p>Implements datastore GET method.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param datastoreName Name of the datastore.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return define the datastore along with {@link Response}.
     */
    Response<Datastore> getByResourceGroupWithResponse(String resourceGroupName, String datastoreName, Context context);

    /**
     * Gets a datastore.
     *
     * <p>Implements datastore GET method.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param datastoreName Name of the datastore.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return define the datastore.
     */
    Datastore getByResourceGroup(String resourceGroupName, String datastoreName);

    /**
     * Deletes an datastore.
     *
     * <p>Implements datastore DELETE method.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param datastoreName Name of the datastore.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String datastoreName);

    /**
     * Deletes an datastore.
     *
     * <p>Implements datastore DELETE method.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param datastoreName Name of the datastore.
     * @param force Whether force delete was specified.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String datastoreName, Boolean force, Context context);

    /**
     * Implements GET datastores in a subscription.
     *
     * <p>List of datastores in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Datastores as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Datastore> list();

    /**
     * Implements GET datastores in a subscription.
     *
     * <p>List of datastores in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Datastores as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Datastore> list(Context context);

    /**
     * Implements GET datastores in a resource group.
     *
     * <p>List of datastores in a resource group.
     *
     * @param resourceGroupName The Resource Group Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Datastores as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Datastore> listByResourceGroup(String resourceGroupName);

    /**
     * Implements GET datastores in a resource group.
     *
     * <p>List of datastores in a resource group.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Datastores as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Datastore> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets a datastore.
     *
     * <p>Implements datastore GET method.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return define the datastore along with {@link Response}.
     */
    Datastore getById(String id);

    /**
     * Gets a datastore.
     *
     * <p>Implements datastore GET method.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return define the datastore along with {@link Response}.
     */
    Response<Datastore> getByIdWithResponse(String id, Context context);

    /**
     * Deletes an datastore.
     *
     * <p>Implements datastore DELETE method.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes an datastore.
     *
     * <p>Implements datastore DELETE method.
     *
     * @param id the resource ID.
     * @param force Whether force delete was specified.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Boolean force, Context context);

    /**
     * Begins definition for a new Datastore resource.
     *
     * @param name resource name.
     * @return the first stage of the new Datastore definition.
     */
    Datastore.DefinitionStages.Blank define(String name);
}
