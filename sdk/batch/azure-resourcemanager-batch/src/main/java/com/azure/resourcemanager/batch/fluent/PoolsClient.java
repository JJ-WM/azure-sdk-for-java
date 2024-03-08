// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.batch.fluent.models.PoolInner;
import com.azure.resourcemanager.batch.models.PoolsCreateResponse;
import com.azure.resourcemanager.batch.models.PoolsDisableAutoScaleResponse;
import com.azure.resourcemanager.batch.models.PoolsGetResponse;
import com.azure.resourcemanager.batch.models.PoolsStopResizeResponse;
import com.azure.resourcemanager.batch.models.PoolsUpdateResponse;

/**
 * An instance of this class provides access to all the operations defined in PoolsClient.
 */
public interface PoolsClient {
    /**
     * Lists all of the pools in the specified account.
     * 
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return values returned by the List operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PoolInner> listByBatchAccount(String resourceGroupName, String accountName);

    /**
     * Lists all of the pools in the specified account.
     * 
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param maxresults The maximum number of items to return in the response.
     * @param select Comma separated list of properties that should be returned. e.g. "properties/provisioningState".
     * Only top level properties under properties/ are valid for selection.
     * @param filter OData filter expression. Valid properties for filtering are:
     * 
     * name
     * properties/allocationState
     * properties/allocationStateTransitionTime
     * properties/creationTime
     * properties/provisioningState
     * properties/provisioningStateTransitionTime
     * properties/lastModified
     * properties/vmSize
     * properties/interNodeCommunication
     * properties/scaleSettings/autoScale
     * properties/scaleSettings/fixedScale.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return values returned by the List operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PoolInner> listByBatchAccount(String resourceGroupName, String accountName, Integer maxresults,
        String select, String filter, Context context);

    /**
     * Creates a new pool inside the specified account.
     * 
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param poolName The pool name. This must be unique within the account.
     * @param parameters Additional parameters for pool creation.
     * @param ifMatch The entity state (ETag) version of the pool to update. A value of "*" can be used to apply the
     * operation only if the pool already exists. If omitted, this operation will always be applied.
     * @param ifNoneMatch Set to '*' to allow a new pool to be created, but to prevent updating an existing pool. Other
     * values will be ignored.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains information about a pool.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PoolsCreateResponse createWithResponse(String resourceGroupName, String accountName, String poolName,
        PoolInner parameters, String ifMatch, String ifNoneMatch, Context context);

    /**
     * Creates a new pool inside the specified account.
     * 
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param poolName The pool name. This must be unique within the account.
     * @param parameters Additional parameters for pool creation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains information about a pool.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PoolInner create(String resourceGroupName, String accountName, String poolName, PoolInner parameters);

    /**
     * Updates the properties of an existing pool.
     * 
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param poolName The pool name. This must be unique within the account.
     * @param parameters Pool properties that should be updated. Properties that are supplied will be updated, any
     * property not supplied will be unchanged.
     * @param ifMatch The entity state (ETag) version of the pool to update. This value can be omitted or set to "*" to
     * apply the operation unconditionally.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains information about a pool.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PoolsUpdateResponse updateWithResponse(String resourceGroupName, String accountName, String poolName,
        PoolInner parameters, String ifMatch, Context context);

    /**
     * Updates the properties of an existing pool.
     * 
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param poolName The pool name. This must be unique within the account.
     * @param parameters Pool properties that should be updated. Properties that are supplied will be updated, any
     * property not supplied will be unchanged.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains information about a pool.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PoolInner update(String resourceGroupName, String accountName, String poolName, PoolInner parameters);

    /**
     * Deletes the specified pool.
     * 
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param poolName The pool name. This must be unique within the account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String accountName, String poolName);

    /**
     * Deletes the specified pool.
     * 
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param poolName The pool name. This must be unique within the account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String accountName, String poolName,
        Context context);

    /**
     * Deletes the specified pool.
     * 
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param poolName The pool name. This must be unique within the account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String accountName, String poolName);

    /**
     * Deletes the specified pool.
     * 
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param poolName The pool name. This must be unique within the account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String accountName, String poolName, Context context);

    /**
     * Gets information about the specified pool.
     * 
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param poolName The pool name. This must be unique within the account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified pool.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PoolsGetResponse getWithResponse(String resourceGroupName, String accountName, String poolName, Context context);

    /**
     * Gets information about the specified pool.
     * 
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param poolName The pool name. This must be unique within the account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified pool.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PoolInner get(String resourceGroupName, String accountName, String poolName);

    /**
     * Disables automatic scaling for a pool.
     * 
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param poolName The pool name. This must be unique within the account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains information about a pool.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PoolsDisableAutoScaleResponse disableAutoScaleWithResponse(String resourceGroupName, String accountName,
        String poolName, Context context);

    /**
     * Disables automatic scaling for a pool.
     * 
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param poolName The pool name. This must be unique within the account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains information about a pool.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PoolInner disableAutoScale(String resourceGroupName, String accountName, String poolName);

    /**
     * Stops an ongoing resize operation on the pool.
     * 
     * This does not restore the pool to its previous state before the resize operation: it only stops any further
     * changes being made, and the pool maintains its current state. After stopping, the pool stabilizes at the number
     * of nodes it was at when the stop operation was done. During the stop operation, the pool allocation state changes
     * first to stopping and then to steady. A resize operation need not be an explicit resize pool request; this API
     * can also be used to halt the initial sizing of the pool when it is created.
     * 
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param poolName The pool name. This must be unique within the account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains information about a pool.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PoolsStopResizeResponse stopResizeWithResponse(String resourceGroupName, String accountName, String poolName,
        Context context);

    /**
     * Stops an ongoing resize operation on the pool.
     * 
     * This does not restore the pool to its previous state before the resize operation: it only stops any further
     * changes being made, and the pool maintains its current state. After stopping, the pool stabilizes at the number
     * of nodes it was at when the stop operation was done. During the stop operation, the pool allocation state changes
     * first to stopping and then to steady. A resize operation need not be an explicit resize pool request; this API
     * can also be used to halt the initial sizing of the pool when it is created.
     * 
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param poolName The pool name. This must be unique within the account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return contains information about a pool.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PoolInner stopResize(String resourceGroupName, String accountName, String poolName);
}
