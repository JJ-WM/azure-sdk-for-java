// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of PartnerRegistrations. */
public interface PartnerRegistrations {
    /**
     * Get a partner registration.
     *
     * <p>Gets a partner registration with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerRegistrationName Name of the partner registration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a partner registration with the specified parameters along with {@link Response}.
     */
    Response<PartnerRegistration> getByResourceGroupWithResponse(
        String resourceGroupName, String partnerRegistrationName, Context context);

    /**
     * Get a partner registration.
     *
     * <p>Gets a partner registration with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerRegistrationName Name of the partner registration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a partner registration with the specified parameters.
     */
    PartnerRegistration getByResourceGroup(String resourceGroupName, String partnerRegistrationName);

    /**
     * Delete a partner registration.
     *
     * <p>Deletes a partner registration with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerRegistrationName Name of the partner registration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String partnerRegistrationName);

    /**
     * Delete a partner registration.
     *
     * <p>Deletes a partner registration with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param partnerRegistrationName Name of the partner registration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String partnerRegistrationName, Context context);

    /**
     * List partner registrations under an Azure subscription.
     *
     * <p>List all the partner registrations under an Azure subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List Partner Registrations operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PartnerRegistration> list();

    /**
     * List partner registrations under an Azure subscription.
     *
     * <p>List all the partner registrations under an Azure subscription.
     *
     * @param filter The query used to filter the search results using OData syntax. Filtering is permitted on the
     *     'name' property only and with limited number of OData operations. These operations are: the 'contains'
     *     function as well as the following logical operations: not, and, or, eq (for equal), and ne (for not equal).
     *     No arithmetic operations are supported. The following is a valid filter example: $filter=contains(namE,
     *     'PATTERN') and name ne 'PATTERN-1'. The following is not a valid filter example: $filter=location eq
     *     'westus'.
     * @param top The number of results to return per page for the list operation. Valid range for top parameter is 1 to
     *     100. If not specified, the default number of results to be returned is 20 items per page.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List Partner Registrations operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PartnerRegistration> list(String filter, Integer top, Context context);

    /**
     * List partner registrations under a resource group.
     *
     * <p>List all the partner registrations under a resource group.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List Partner Registrations operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PartnerRegistration> listByResourceGroup(String resourceGroupName);

    /**
     * List partner registrations under a resource group.
     *
     * <p>List all the partner registrations under a resource group.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param filter The query used to filter the search results using OData syntax. Filtering is permitted on the
     *     'name' property only and with limited number of OData operations. These operations are: the 'contains'
     *     function as well as the following logical operations: not, and, or, eq (for equal), and ne (for not equal).
     *     No arithmetic operations are supported. The following is a valid filter example: $filter=contains(namE,
     *     'PATTERN') and name ne 'PATTERN-1'. The following is not a valid filter example: $filter=location eq
     *     'westus'.
     * @param top The number of results to return per page for the list operation. Valid range for top parameter is 1 to
     *     100. If not specified, the default number of results to be returned is 20 items per page.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List Partner Registrations operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PartnerRegistration> listByResourceGroup(
        String resourceGroupName, String filter, Integer top, Context context);

    /**
     * Get a partner registration.
     *
     * <p>Gets a partner registration with the specified parameters.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a partner registration with the specified parameters along with {@link Response}.
     */
    PartnerRegistration getById(String id);

    /**
     * Get a partner registration.
     *
     * <p>Gets a partner registration with the specified parameters.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a partner registration with the specified parameters along with {@link Response}.
     */
    Response<PartnerRegistration> getByIdWithResponse(String id, Context context);

    /**
     * Delete a partner registration.
     *
     * <p>Deletes a partner registration with the specified parameters.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete a partner registration.
     *
     * <p>Deletes a partner registration with the specified parameters.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new PartnerRegistration resource.
     *
     * @param name resource name.
     * @return the first stage of the new PartnerRegistration definition.
     */
    PartnerRegistration.DefinitionStages.Blank define(String name);
}
