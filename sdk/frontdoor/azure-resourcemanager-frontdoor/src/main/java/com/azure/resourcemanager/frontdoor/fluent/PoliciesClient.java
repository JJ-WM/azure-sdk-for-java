// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.frontdoor.fluent.models.WebApplicationFirewallPolicyInner;
import com.azure.resourcemanager.frontdoor.models.TagsObject;

/**
 * An instance of this class provides access to all the operations defined in PoliciesClient.
 */
public interface PoliciesClient {
    /**
     * Lists all of the protection policies within a resource group.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines a list of WebApplicationFirewallPolicies as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WebApplicationFirewallPolicyInner> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all of the protection policies within a resource group.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines a list of WebApplicationFirewallPolicies as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WebApplicationFirewallPolicyInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Lists all of the protection policies within a subscription.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines a list of WebApplicationFirewallPolicies as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WebApplicationFirewallPolicyInner> list();

    /**
     * Lists all of the protection policies within a subscription.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines a list of WebApplicationFirewallPolicies as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WebApplicationFirewallPolicyInner> list(Context context);

    /**
     * Retrieve protection policy with specified name within a resource group.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param policyName The name of the Web Application Firewall Policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines web application firewall policy along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<WebApplicationFirewallPolicyInner> getByResourceGroupWithResponse(String resourceGroupName,
        String policyName, Context context);

    /**
     * Retrieve protection policy with specified name within a resource group.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param policyName The name of the Web Application Firewall Policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines web application firewall policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WebApplicationFirewallPolicyInner getByResourceGroup(String resourceGroupName, String policyName);

    /**
     * Create or update policy with specified rule set name within a resource group.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param policyName The name of the Web Application Firewall Policy.
     * @param parameters Policy to be created.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of defines web application firewall policy.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<WebApplicationFirewallPolicyInner>, WebApplicationFirewallPolicyInner>
        beginCreateOrUpdate(String resourceGroupName, String policyName, WebApplicationFirewallPolicyInner parameters);

    /**
     * Create or update policy with specified rule set name within a resource group.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param policyName The name of the Web Application Firewall Policy.
     * @param parameters Policy to be created.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of defines web application firewall policy.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<WebApplicationFirewallPolicyInner>, WebApplicationFirewallPolicyInner> beginCreateOrUpdate(
        String resourceGroupName, String policyName, WebApplicationFirewallPolicyInner parameters, Context context);

    /**
     * Create or update policy with specified rule set name within a resource group.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param policyName The name of the Web Application Firewall Policy.
     * @param parameters Policy to be created.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines web application firewall policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WebApplicationFirewallPolicyInner createOrUpdate(String resourceGroupName, String policyName,
        WebApplicationFirewallPolicyInner parameters);

    /**
     * Create or update policy with specified rule set name within a resource group.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param policyName The name of the Web Application Firewall Policy.
     * @param parameters Policy to be created.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines web application firewall policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WebApplicationFirewallPolicyInner createOrUpdate(String resourceGroupName, String policyName,
        WebApplicationFirewallPolicyInner parameters, Context context);

    /**
     * Patch a specific frontdoor webApplicationFirewall policy for tags update under the specified subscription and
     * resource group.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param policyName The name of the Web Application Firewall Policy.
     * @param parameters FrontdoorWebApplicationFirewallPolicy parameters to be patched.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of defines web application firewall policy.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<WebApplicationFirewallPolicyInner>, WebApplicationFirewallPolicyInner>
        beginUpdate(String resourceGroupName, String policyName, TagsObject parameters);

    /**
     * Patch a specific frontdoor webApplicationFirewall policy for tags update under the specified subscription and
     * resource group.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param policyName The name of the Web Application Firewall Policy.
     * @param parameters FrontdoorWebApplicationFirewallPolicy parameters to be patched.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of defines web application firewall policy.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<WebApplicationFirewallPolicyInner>, WebApplicationFirewallPolicyInner>
        beginUpdate(String resourceGroupName, String policyName, TagsObject parameters, Context context);

    /**
     * Patch a specific frontdoor webApplicationFirewall policy for tags update under the specified subscription and
     * resource group.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param policyName The name of the Web Application Firewall Policy.
     * @param parameters FrontdoorWebApplicationFirewallPolicy parameters to be patched.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines web application firewall policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WebApplicationFirewallPolicyInner update(String resourceGroupName, String policyName, TagsObject parameters);

    /**
     * Patch a specific frontdoor webApplicationFirewall policy for tags update under the specified subscription and
     * resource group.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param policyName The name of the Web Application Firewall Policy.
     * @param parameters FrontdoorWebApplicationFirewallPolicy parameters to be patched.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines web application firewall policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WebApplicationFirewallPolicyInner update(String resourceGroupName, String policyName, TagsObject parameters,
        Context context);

    /**
     * Deletes Policy.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param policyName The name of the Web Application Firewall Policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String policyName);

    /**
     * Deletes Policy.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param policyName The name of the Web Application Firewall Policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String policyName, Context context);

    /**
     * Deletes Policy.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param policyName The name of the Web Application Firewall Policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String policyName);

    /**
     * Deletes Policy.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param policyName The name of the Web Application Firewall Policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String policyName, Context context);
}
