// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.models.LogSettingsInner;

/** Resource collection API of Firewalls. */
public interface Firewalls {
    /**
     * List FirewallResource resources by subscription ID.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a FirewallResource list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<FirewallResource> list();

    /**
     * List FirewallResource resources by subscription ID.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a FirewallResource list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<FirewallResource> list(Context context);

    /**
     * List FirewallResource resources by resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a FirewallResource list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<FirewallResource> listByResourceGroup(String resourceGroupName);

    /**
     * List FirewallResource resources by resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a FirewallResource list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<FirewallResource> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Get a FirewallResource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param firewallName Firewall resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a FirewallResource along with {@link Response}.
     */
    Response<FirewallResource> getByResourceGroupWithResponse(
        String resourceGroupName, String firewallName, Context context);

    /**
     * Get a FirewallResource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param firewallName Firewall resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a FirewallResource.
     */
    FirewallResource getByResourceGroup(String resourceGroupName, String firewallName);

    /**
     * Delete a FirewallResource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param firewallName Firewall resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String firewallName);

    /**
     * Delete a FirewallResource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param firewallName Firewall resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String firewallName, Context context);

    /**
     * Get Global Rulestack associated with the Firewall.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param firewallName Firewall resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return global Rulestack associated with the Firewall along with {@link Response}.
     */
    Response<GlobalRulestackInfo> getGlobalRulestackWithResponse(
        String resourceGroupName, String firewallName, Context context);

    /**
     * Get Global Rulestack associated with the Firewall.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param firewallName Firewall resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return global Rulestack associated with the Firewall.
     */
    GlobalRulestackInfo getGlobalRulestack(String resourceGroupName, String firewallName);

    /**
     * Log Profile for Firewall.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param firewallName Firewall resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return log Settings for Firewall along with {@link Response}.
     */
    Response<LogSettings> getLogProfileWithResponse(String resourceGroupName, String firewallName, Context context);

    /**
     * Log Profile for Firewall.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param firewallName Firewall resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return log Settings for Firewall.
     */
    LogSettings getLogProfile(String resourceGroupName, String firewallName);

    /**
     * support info for firewall.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param firewallName Firewall resource name.
     * @param email email address on behalf of which this API called.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return support information for the resource along with {@link Response}.
     */
    Response<SupportInfo> getSupportInfoWithResponse(
        String resourceGroupName, String firewallName, String email, Context context);

    /**
     * support info for firewall.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param firewallName Firewall resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return support information for the resource.
     */
    SupportInfo getSupportInfo(String resourceGroupName, String firewallName);

    /**
     * Log Profile for Firewall.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param firewallName Firewall resource name.
     * @param logSettings Log Settings for Firewall.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> saveLogProfileWithResponse(
        String resourceGroupName, String firewallName, LogSettingsInner logSettings, Context context);

    /**
     * Log Profile for Firewall.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param firewallName Firewall resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void saveLogProfile(String resourceGroupName, String firewallName);

    /**
     * Get a FirewallResource.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a FirewallResource along with {@link Response}.
     */
    FirewallResource getById(String id);

    /**
     * Get a FirewallResource.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a FirewallResource along with {@link Response}.
     */
    Response<FirewallResource> getByIdWithResponse(String id, Context context);

    /**
     * Delete a FirewallResource.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete a FirewallResource.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new FirewallResource resource.
     *
     * @param name resource name.
     * @return the first stage of the new FirewallResource definition.
     */
    FirewallResource.DefinitionStages.Blank define(String name);
}