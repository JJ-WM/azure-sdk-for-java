// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of CertificateObjectLocalRulestacks. */
public interface CertificateObjectLocalRulestacks {
    /**
     * List CertificateObjectLocalRulestackResource resources by LocalRulestacks.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param localRulestackName LocalRulestack resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a CertificateObjectLocalRulestackResource list operation as paginated response with
     *     {@link PagedIterable}.
     */
    PagedIterable<CertificateObjectLocalRulestackResource> listByLocalRulestacks(
        String resourceGroupName, String localRulestackName);

    /**
     * List CertificateObjectLocalRulestackResource resources by LocalRulestacks.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param localRulestackName LocalRulestack resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a CertificateObjectLocalRulestackResource list operation as paginated response with
     *     {@link PagedIterable}.
     */
    PagedIterable<CertificateObjectLocalRulestackResource> listByLocalRulestacks(
        String resourceGroupName, String localRulestackName, Context context);

    /**
     * Get a CertificateObjectLocalRulestackResource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param localRulestackName LocalRulestack resource name.
     * @param name certificate name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a CertificateObjectLocalRulestackResource along with {@link Response}.
     */
    Response<CertificateObjectLocalRulestackResource> getWithResponse(
        String resourceGroupName, String localRulestackName, String name, Context context);

    /**
     * Get a CertificateObjectLocalRulestackResource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param localRulestackName LocalRulestack resource name.
     * @param name certificate name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a CertificateObjectLocalRulestackResource.
     */
    CertificateObjectLocalRulestackResource get(String resourceGroupName, String localRulestackName, String name);

    /**
     * Delete a CertificateObjectLocalRulestackResource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param localRulestackName LocalRulestack resource name.
     * @param name certificate name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String localRulestackName, String name);

    /**
     * Delete a CertificateObjectLocalRulestackResource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param localRulestackName LocalRulestack resource name.
     * @param name certificate name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String localRulestackName, String name, Context context);

    /**
     * Get a CertificateObjectLocalRulestackResource.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a CertificateObjectLocalRulestackResource along with {@link Response}.
     */
    CertificateObjectLocalRulestackResource getById(String id);

    /**
     * Get a CertificateObjectLocalRulestackResource.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a CertificateObjectLocalRulestackResource along with {@link Response}.
     */
    Response<CertificateObjectLocalRulestackResource> getByIdWithResponse(String id, Context context);

    /**
     * Delete a CertificateObjectLocalRulestackResource.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete a CertificateObjectLocalRulestackResource.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new CertificateObjectLocalRulestackResource resource.
     *
     * @param name resource name.
     * @return the first stage of the new CertificateObjectLocalRulestackResource definition.
     */
    CertificateObjectLocalRulestackResource.DefinitionStages.Blank define(String name);
}
