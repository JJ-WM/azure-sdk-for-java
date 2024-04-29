// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.quota.fluent.models.GroupQuotasEntityInner;
import com.azure.resourcemanager.quota.models.GroupQuotasEntityPatch;

/**
 * An instance of this class provides access to all the operations defined in GroupQuotasClient.
 */
public interface GroupQuotasClient {
    /**
     * Creates a new GroupQuota for the name passed.
     * 
     * Creates a new GroupQuota for the name passed. A RequestId will be returned by the Service. The status can be
     * polled periodically. The status Async polling is using standards defined at -
     * https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/async-api-reference.md#asynchronous-operations.
     * Use the OperationsStatus URI provided in Azure-AsyncOperation header, the duration will be specified in
     * retry-after header. Once the operation gets to terminal state - Succeeded | Failed, then the URI will change to
     * Get URI and full details can be checked.
     * 
     * @param managementGroupId Management Group Id.
     * @param groupQuotaName The GroupQuota name. The name should be unique for the provided context tenantId/MgId.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of properties and filters for ShareQuota.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ProxyResource>, ProxyResource> beginCreateOrUpdate(String managementGroupId,
        String groupQuotaName);

    /**
     * Creates a new GroupQuota for the name passed.
     * 
     * Creates a new GroupQuota for the name passed. A RequestId will be returned by the Service. The status can be
     * polled periodically. The status Async polling is using standards defined at -
     * https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/async-api-reference.md#asynchronous-operations.
     * Use the OperationsStatus URI provided in Azure-AsyncOperation header, the duration will be specified in
     * retry-after header. Once the operation gets to terminal state - Succeeded | Failed, then the URI will change to
     * Get URI and full details can be checked.
     * 
     * @param managementGroupId Management Group Id.
     * @param groupQuotaName The GroupQuota name. The name should be unique for the provided context tenantId/MgId.
     * @param groupQuotaPutRequestBody The GroupQuota body details for creation or update of a GroupQuota entity.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of properties and filters for ShareQuota.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ProxyResource>, ProxyResource> beginCreateOrUpdate(String managementGroupId,
        String groupQuotaName, GroupQuotasEntityInner groupQuotaPutRequestBody, Context context);

    /**
     * Creates a new GroupQuota for the name passed.
     * 
     * Creates a new GroupQuota for the name passed. A RequestId will be returned by the Service. The status can be
     * polled periodically. The status Async polling is using standards defined at -
     * https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/async-api-reference.md#asynchronous-operations.
     * Use the OperationsStatus URI provided in Azure-AsyncOperation header, the duration will be specified in
     * retry-after header. Once the operation gets to terminal state - Succeeded | Failed, then the URI will change to
     * Get URI and full details can be checked.
     * 
     * @param managementGroupId Management Group Id.
     * @param groupQuotaName The GroupQuota name. The name should be unique for the provided context tenantId/MgId.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties and filters for ShareQuota.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProxyResource createOrUpdate(String managementGroupId, String groupQuotaName);

    /**
     * Creates a new GroupQuota for the name passed.
     * 
     * Creates a new GroupQuota for the name passed. A RequestId will be returned by the Service. The status can be
     * polled periodically. The status Async polling is using standards defined at -
     * https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/async-api-reference.md#asynchronous-operations.
     * Use the OperationsStatus URI provided in Azure-AsyncOperation header, the duration will be specified in
     * retry-after header. Once the operation gets to terminal state - Succeeded | Failed, then the URI will change to
     * Get URI and full details can be checked.
     * 
     * @param managementGroupId Management Group Id.
     * @param groupQuotaName The GroupQuota name. The name should be unique for the provided context tenantId/MgId.
     * @param groupQuotaPutRequestBody The GroupQuota body details for creation or update of a GroupQuota entity.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties and filters for ShareQuota.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProxyResource createOrUpdate(String managementGroupId, String groupQuotaName,
        GroupQuotasEntityInner groupQuotaPutRequestBody, Context context);

    /**
     * Updates a new GroupQuotas for the name passed.
     * 
     * Updates the GroupQuotas for the name passed. A GroupQuotas RequestId will be returned by the Service. The status
     * can be polled periodically. The status Async polling is using standards defined at -
     * https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/async-api-reference.md#asynchronous-operations.
     * Use the OperationsStatus URI provided in Azure-AsyncOperation header, the duration will be specified in
     * retry-after header. Once the operation gets to terminal state - Succeeded | Failed, then the URI will change to
     * Get URI and full details can be checked.
     * Any change in the filters will be applicable to the future quota assignments, existing quota allocated to
     * subscriptions from the GroupQuotas remains unchanged.
     * 
     * @param managementGroupId Management Group Id.
     * @param groupQuotaName The GroupQuota name. The name should be unique for the provided context tenantId/MgId.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of properties and filters for ShareQuota.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<GroupQuotasEntityInner>, GroupQuotasEntityInner> beginUpdate(String managementGroupId,
        String groupQuotaName);

    /**
     * Updates a new GroupQuotas for the name passed.
     * 
     * Updates the GroupQuotas for the name passed. A GroupQuotas RequestId will be returned by the Service. The status
     * can be polled periodically. The status Async polling is using standards defined at -
     * https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/async-api-reference.md#asynchronous-operations.
     * Use the OperationsStatus URI provided in Azure-AsyncOperation header, the duration will be specified in
     * retry-after header. Once the operation gets to terminal state - Succeeded | Failed, then the URI will change to
     * Get URI and full details can be checked.
     * Any change in the filters will be applicable to the future quota assignments, existing quota allocated to
     * subscriptions from the GroupQuotas remains unchanged.
     * 
     * @param managementGroupId Management Group Id.
     * @param groupQuotaName The GroupQuota name. The name should be unique for the provided context tenantId/MgId.
     * @param groupQuotasPatchRequestBody The GroupQuotas Patch Request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of properties and filters for ShareQuota.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<GroupQuotasEntityInner>, GroupQuotasEntityInner> beginUpdate(String managementGroupId,
        String groupQuotaName, GroupQuotasEntityPatch groupQuotasPatchRequestBody, Context context);

    /**
     * Updates a new GroupQuotas for the name passed.
     * 
     * Updates the GroupQuotas for the name passed. A GroupQuotas RequestId will be returned by the Service. The status
     * can be polled periodically. The status Async polling is using standards defined at -
     * https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/async-api-reference.md#asynchronous-operations.
     * Use the OperationsStatus URI provided in Azure-AsyncOperation header, the duration will be specified in
     * retry-after header. Once the operation gets to terminal state - Succeeded | Failed, then the URI will change to
     * Get URI and full details can be checked.
     * Any change in the filters will be applicable to the future quota assignments, existing quota allocated to
     * subscriptions from the GroupQuotas remains unchanged.
     * 
     * @param managementGroupId Management Group Id.
     * @param groupQuotaName The GroupQuota name. The name should be unique for the provided context tenantId/MgId.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties and filters for ShareQuota.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GroupQuotasEntityInner update(String managementGroupId, String groupQuotaName);

    /**
     * Updates a new GroupQuotas for the name passed.
     * 
     * Updates the GroupQuotas for the name passed. A GroupQuotas RequestId will be returned by the Service. The status
     * can be polled periodically. The status Async polling is using standards defined at -
     * https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/async-api-reference.md#asynchronous-operations.
     * Use the OperationsStatus URI provided in Azure-AsyncOperation header, the duration will be specified in
     * retry-after header. Once the operation gets to terminal state - Succeeded | Failed, then the URI will change to
     * Get URI and full details can be checked.
     * Any change in the filters will be applicable to the future quota assignments, existing quota allocated to
     * subscriptions from the GroupQuotas remains unchanged.
     * 
     * @param managementGroupId Management Group Id.
     * @param groupQuotaName The GroupQuota name. The name should be unique for the provided context tenantId/MgId.
     * @param groupQuotasPatchRequestBody The GroupQuotas Patch Request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties and filters for ShareQuota.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GroupQuotasEntityInner update(String managementGroupId, String groupQuotaName,
        GroupQuotasEntityPatch groupQuotasPatchRequestBody, Context context);

    /**
     * Gets GroupQuotas for the name passed.
     * 
     * Gets the GroupQuotas for the name passed. It will return the GroupQuotas properties only. The details on group
     * quota can be access from the group quota APIs.
     * 
     * @param managementGroupId Management Group Id.
     * @param groupQuotaName The GroupQuota name. The name should be unique for the provided context tenantId/MgId.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the GroupQuotas for the name passed along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<GroupQuotasEntityInner> getWithResponse(String managementGroupId, String groupQuotaName, Context context);

    /**
     * Gets GroupQuotas for the name passed.
     * 
     * Gets the GroupQuotas for the name passed. It will return the GroupQuotas properties only. The details on group
     * quota can be access from the group quota APIs.
     * 
     * @param managementGroupId Management Group Id.
     * @param groupQuotaName The GroupQuota name. The name should be unique for the provided context tenantId/MgId.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the GroupQuotas for the name passed.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GroupQuotasEntityInner get(String managementGroupId, String groupQuotaName);

    /**
     * Deletes GroupQuotas for the name passed.
     * 
     * Deletes the GroupQuotas for the name passed. All the remaining shareQuota in the GroupQuotas will be lost.
     * 
     * @param managementGroupId Management Group Id.
     * @param groupQuotaName The GroupQuota name. The name should be unique for the provided context tenantId/MgId.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String managementGroupId, String groupQuotaName);

    /**
     * Deletes GroupQuotas for the name passed.
     * 
     * Deletes the GroupQuotas for the name passed. All the remaining shareQuota in the GroupQuotas will be lost.
     * 
     * @param managementGroupId Management Group Id.
     * @param groupQuotaName The GroupQuota name. The name should be unique for the provided context tenantId/MgId.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String managementGroupId, String groupQuotaName, Context context);

    /**
     * Deletes GroupQuotas for the name passed.
     * 
     * Deletes the GroupQuotas for the name passed. All the remaining shareQuota in the GroupQuotas will be lost.
     * 
     * @param managementGroupId Management Group Id.
     * @param groupQuotaName The GroupQuota name. The name should be unique for the provided context tenantId/MgId.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String managementGroupId, String groupQuotaName);

    /**
     * Deletes GroupQuotas for the name passed.
     * 
     * Deletes the GroupQuotas for the name passed. All the remaining shareQuota in the GroupQuotas will be lost.
     * 
     * @param managementGroupId Management Group Id.
     * @param groupQuotaName The GroupQuota name. The name should be unique for the provided context tenantId/MgId.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String managementGroupId, String groupQuotaName, Context context);

    /**
     * Lists GroupQuotas for the scope passed.
     * 
     * Lists GroupQuotas for the scope passed. It will return the GroupQuotas QuotaEntity properties only.The details on
     * group quota can be access from the group quota APIs.
     * 
     * @param managementGroupId Management Group Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Group Quotas at MG level as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<GroupQuotasEntityInner> list(String managementGroupId);

    /**
     * Lists GroupQuotas for the scope passed.
     * 
     * Lists GroupQuotas for the scope passed. It will return the GroupQuotas QuotaEntity properties only.The details on
     * group quota can be access from the group quota APIs.
     * 
     * @param managementGroupId Management Group Id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Group Quotas at MG level as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<GroupQuotasEntityInner> list(String managementGroupId, Context context);
}
