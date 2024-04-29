// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.standbypool.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of StandbyVirtualMachinePools.
 */
public interface StandbyVirtualMachinePools {
    /**
     * Get a StandbyVirtualMachinePoolResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param standbyVirtualMachinePoolName Name of the standby virtual machine pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a StandbyVirtualMachinePoolResource along with {@link Response}.
     */
    Response<StandbyVirtualMachinePoolResource> getByResourceGroupWithResponse(String resourceGroupName,
        String standbyVirtualMachinePoolName, Context context);

    /**
     * Get a StandbyVirtualMachinePoolResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param standbyVirtualMachinePoolName Name of the standby virtual machine pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a StandbyVirtualMachinePoolResource.
     */
    StandbyVirtualMachinePoolResource getByResourceGroup(String resourceGroupName,
        String standbyVirtualMachinePoolName);

    /**
     * Delete a StandbyVirtualMachinePoolResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param standbyVirtualMachinePoolName Name of the standby virtual machine pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String standbyVirtualMachinePoolName);

    /**
     * Delete a StandbyVirtualMachinePoolResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param standbyVirtualMachinePoolName Name of the standby virtual machine pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String standbyVirtualMachinePoolName, Context context);

    /**
     * List StandbyVirtualMachinePoolResource resources by resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a StandbyVirtualMachinePoolResource list operation as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<StandbyVirtualMachinePoolResource> listByResourceGroup(String resourceGroupName);

    /**
     * List StandbyVirtualMachinePoolResource resources by resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a StandbyVirtualMachinePoolResource list operation as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<StandbyVirtualMachinePoolResource> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * List StandbyVirtualMachinePoolResource resources by subscription ID.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a StandbyVirtualMachinePoolResource list operation as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<StandbyVirtualMachinePoolResource> list();

    /**
     * List StandbyVirtualMachinePoolResource resources by subscription ID.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a StandbyVirtualMachinePoolResource list operation as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<StandbyVirtualMachinePoolResource> list(Context context);

    /**
     * Get a StandbyVirtualMachinePoolResource.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a StandbyVirtualMachinePoolResource along with {@link Response}.
     */
    StandbyVirtualMachinePoolResource getById(String id);

    /**
     * Get a StandbyVirtualMachinePoolResource.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a StandbyVirtualMachinePoolResource along with {@link Response}.
     */
    Response<StandbyVirtualMachinePoolResource> getByIdWithResponse(String id, Context context);

    /**
     * Delete a StandbyVirtualMachinePoolResource.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete a StandbyVirtualMachinePoolResource.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new StandbyVirtualMachinePoolResource resource.
     * 
     * @param name resource name.
     * @return the first stage of the new StandbyVirtualMachinePoolResource definition.
     */
    StandbyVirtualMachinePoolResource.DefinitionStages.Blank define(String name);
}
