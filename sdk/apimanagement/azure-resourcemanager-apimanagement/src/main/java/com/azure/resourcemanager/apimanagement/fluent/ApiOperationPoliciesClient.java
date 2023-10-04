// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.fluent.models.PolicyCollectionInner;
import com.azure.resourcemanager.apimanagement.fluent.models.PolicyContractInner;
import com.azure.resourcemanager.apimanagement.models.ApiOperationPoliciesCreateOrUpdateResponse;
import com.azure.resourcemanager.apimanagement.models.ApiOperationPoliciesGetEntityTagResponse;
import com.azure.resourcemanager.apimanagement.models.ApiOperationPoliciesGetResponse;
import com.azure.resourcemanager.apimanagement.models.PolicyExportFormat;
import com.azure.resourcemanager.apimanagement.models.PolicyIdName;

/** An instance of this class provides access to all the operations defined in ApiOperationPoliciesClient. */
public interface ApiOperationPoliciesClient {
    /**
     * Get the list of policy configuration at the API Operation level.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current
     *     revision has ;rev=n as a suffix where n is the revision number.
     * @param operationId Operation identifier within an API. Must be unique in the current API Management service
     *     instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of policy configuration at the API Operation level along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PolicyCollectionInner> listByOperationWithResponse(
        String resourceGroupName, String serviceName, String apiId, String operationId, Context context);

    /**
     * Get the list of policy configuration at the API Operation level.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current
     *     revision has ;rev=n as a suffix where n is the revision number.
     * @param operationId Operation identifier within an API. Must be unique in the current API Management service
     *     instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of policy configuration at the API Operation level.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PolicyCollectionInner listByOperation(
        String resourceGroupName, String serviceName, String apiId, String operationId);

    /**
     * Gets the entity state (Etag) version of the API operation policy specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current
     *     revision has ;rev=n as a suffix where n is the revision number.
     * @param operationId Operation identifier within an API. Must be unique in the current API Management service
     *     instance.
     * @param policyId The identifier of the Policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the entity state (Etag) version of the API operation policy specified by its identifier.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiOperationPoliciesGetEntityTagResponse getEntityTagWithResponse(
        String resourceGroupName,
        String serviceName,
        String apiId,
        String operationId,
        PolicyIdName policyId,
        Context context);

    /**
     * Gets the entity state (Etag) version of the API operation policy specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current
     *     revision has ;rev=n as a suffix where n is the revision number.
     * @param operationId Operation identifier within an API. Must be unique in the current API Management service
     *     instance.
     * @param policyId The identifier of the Policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void getEntityTag(
        String resourceGroupName, String serviceName, String apiId, String operationId, PolicyIdName policyId);

    /**
     * Get the policy configuration at the API Operation level.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current
     *     revision has ;rev=n as a suffix where n is the revision number.
     * @param operationId Operation identifier within an API. Must be unique in the current API Management service
     *     instance.
     * @param policyId The identifier of the Policy.
     * @param format Policy Export Format.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy configuration at the API Operation level.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiOperationPoliciesGetResponse getWithResponse(
        String resourceGroupName,
        String serviceName,
        String apiId,
        String operationId,
        PolicyIdName policyId,
        PolicyExportFormat format,
        Context context);

    /**
     * Get the policy configuration at the API Operation level.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current
     *     revision has ;rev=n as a suffix where n is the revision number.
     * @param operationId Operation identifier within an API. Must be unique in the current API Management service
     *     instance.
     * @param policyId The identifier of the Policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy configuration at the API Operation level.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PolicyContractInner get(
        String resourceGroupName, String serviceName, String apiId, String operationId, PolicyIdName policyId);

    /**
     * Creates or updates policy configuration for the API Operation level.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current
     *     revision has ;rev=n as a suffix where n is the revision number.
     * @param operationId Operation identifier within an API. Must be unique in the current API Management service
     *     instance.
     * @param policyId The identifier of the Policy.
     * @param parameters The policy contents to apply.
     * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return policy Contract details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiOperationPoliciesCreateOrUpdateResponse createOrUpdateWithResponse(
        String resourceGroupName,
        String serviceName,
        String apiId,
        String operationId,
        PolicyIdName policyId,
        PolicyContractInner parameters,
        String ifMatch,
        Context context);

    /**
     * Creates or updates policy configuration for the API Operation level.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current
     *     revision has ;rev=n as a suffix where n is the revision number.
     * @param operationId Operation identifier within an API. Must be unique in the current API Management service
     *     instance.
     * @param policyId The identifier of the Policy.
     * @param parameters The policy contents to apply.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return policy Contract details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PolicyContractInner createOrUpdate(
        String resourceGroupName,
        String serviceName,
        String apiId,
        String operationId,
        PolicyIdName policyId,
        PolicyContractInner parameters);

    /**
     * Deletes the policy configuration at the Api Operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current
     *     revision has ;rev=n as a suffix where n is the revision number.
     * @param operationId Operation identifier within an API. Must be unique in the current API Management service
     *     instance.
     * @param policyId The identifier of the Policy.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName,
        String serviceName,
        String apiId,
        String operationId,
        PolicyIdName policyId,
        String ifMatch,
        Context context);

    /**
     * Deletes the policy configuration at the Api Operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current
     *     revision has ;rev=n as a suffix where n is the revision number.
     * @param operationId Operation identifier within an API. Must be unique in the current API Management service
     *     instance.
     * @param policyId The identifier of the Policy.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(
        String resourceGroupName,
        String serviceName,
        String apiId,
        String operationId,
        PolicyIdName policyId,
        String ifMatch);
}
