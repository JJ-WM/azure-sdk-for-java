// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.devcenter.fluent.models.ScheduleInner;
import com.azure.resourcemanager.devcenter.models.ScheduleUpdate;

/**
 * An instance of this class provides access to all the operations defined in SchedulesClient.
 */
public interface SchedulesClient {
    /**
     * Lists schedules for a pool.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param projectName The name of the project.
     * @param poolName Name of the pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the schedule list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ScheduleInner> listByPool(String resourceGroupName, String projectName, String poolName);

    /**
     * Lists schedules for a pool.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param projectName The name of the project.
     * @param poolName Name of the pool.
     * @param top The maximum number of resources to return from the operation. Example: '$top=10'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the schedule list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ScheduleInner> listByPool(String resourceGroupName, String projectName, String poolName, Integer top,
        Context context);

    /**
     * Gets a schedule resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param projectName The name of the project.
     * @param poolName Name of the pool.
     * @param scheduleName The name of the schedule that uniquely identifies it.
     * @param top The maximum number of resources to return from the operation. Example: '$top=10'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a schedule resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ScheduleInner> getWithResponse(String resourceGroupName, String projectName, String poolName,
        String scheduleName, Integer top, Context context);

    /**
     * Gets a schedule resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param projectName The name of the project.
     * @param poolName Name of the pool.
     * @param scheduleName The name of the schedule that uniquely identifies it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a schedule resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ScheduleInner get(String resourceGroupName, String projectName, String poolName, String scheduleName);

    /**
     * Creates or updates a Schedule.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param projectName The name of the project.
     * @param poolName Name of the pool.
     * @param scheduleName The name of the schedule that uniquely identifies it.
     * @param body Represents a scheduled task.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of represents a Schedule to execute a task.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ScheduleInner>, ScheduleInner> beginCreateOrUpdate(String resourceGroupName,
        String projectName, String poolName, String scheduleName, ScheduleInner body);

    /**
     * Creates or updates a Schedule.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param projectName The name of the project.
     * @param poolName Name of the pool.
     * @param scheduleName The name of the schedule that uniquely identifies it.
     * @param body Represents a scheduled task.
     * @param top The maximum number of resources to return from the operation. Example: '$top=10'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of represents a Schedule to execute a task.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ScheduleInner>, ScheduleInner> beginCreateOrUpdate(String resourceGroupName,
        String projectName, String poolName, String scheduleName, ScheduleInner body, Integer top, Context context);

    /**
     * Creates or updates a Schedule.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param projectName The name of the project.
     * @param poolName Name of the pool.
     * @param scheduleName The name of the schedule that uniquely identifies it.
     * @param body Represents a scheduled task.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a Schedule to execute a task.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ScheduleInner createOrUpdate(String resourceGroupName, String projectName, String poolName, String scheduleName,
        ScheduleInner body);

    /**
     * Creates or updates a Schedule.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param projectName The name of the project.
     * @param poolName Name of the pool.
     * @param scheduleName The name of the schedule that uniquely identifies it.
     * @param body Represents a scheduled task.
     * @param top The maximum number of resources to return from the operation. Example: '$top=10'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a Schedule to execute a task.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ScheduleInner createOrUpdate(String resourceGroupName, String projectName, String poolName, String scheduleName,
        ScheduleInner body, Integer top, Context context);

    /**
     * Partially updates a Scheduled.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param projectName The name of the project.
     * @param poolName Name of the pool.
     * @param scheduleName The name of the schedule that uniquely identifies it.
     * @param body Represents a scheduled task.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of represents a Schedule to execute a task.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ScheduleInner>, ScheduleInner> beginUpdate(String resourceGroupName, String projectName,
        String poolName, String scheduleName, ScheduleUpdate body);

    /**
     * Partially updates a Scheduled.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param projectName The name of the project.
     * @param poolName Name of the pool.
     * @param scheduleName The name of the schedule that uniquely identifies it.
     * @param body Represents a scheduled task.
     * @param top The maximum number of resources to return from the operation. Example: '$top=10'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of represents a Schedule to execute a task.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ScheduleInner>, ScheduleInner> beginUpdate(String resourceGroupName, String projectName,
        String poolName, String scheduleName, ScheduleUpdate body, Integer top, Context context);

    /**
     * Partially updates a Scheduled.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param projectName The name of the project.
     * @param poolName Name of the pool.
     * @param scheduleName The name of the schedule that uniquely identifies it.
     * @param body Represents a scheduled task.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a Schedule to execute a task.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ScheduleInner update(String resourceGroupName, String projectName, String poolName, String scheduleName,
        ScheduleUpdate body);

    /**
     * Partially updates a Scheduled.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param projectName The name of the project.
     * @param poolName Name of the pool.
     * @param scheduleName The name of the schedule that uniquely identifies it.
     * @param body Represents a scheduled task.
     * @param top The maximum number of resources to return from the operation. Example: '$top=10'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a Schedule to execute a task.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ScheduleInner update(String resourceGroupName, String projectName, String poolName, String scheduleName,
        ScheduleUpdate body, Integer top, Context context);

    /**
     * Deletes a Scheduled.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param projectName The name of the project.
     * @param poolName Name of the pool.
     * @param scheduleName The name of the schedule that uniquely identifies it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String projectName, String poolName,
        String scheduleName);

    /**
     * Deletes a Scheduled.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param projectName The name of the project.
     * @param poolName Name of the pool.
     * @param scheduleName The name of the schedule that uniquely identifies it.
     * @param top The maximum number of resources to return from the operation. Example: '$top=10'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String projectName, String poolName,
        String scheduleName, Integer top, Context context);

    /**
     * Deletes a Scheduled.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param projectName The name of the project.
     * @param poolName Name of the pool.
     * @param scheduleName The name of the schedule that uniquely identifies it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String projectName, String poolName, String scheduleName);

    /**
     * Deletes a Scheduled.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param projectName The name of the project.
     * @param poolName Name of the pool.
     * @param scheduleName The name of the schedule that uniquely identifies it.
     * @param top The maximum number of resources to return from the operation. Example: '$top=10'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String projectName, String poolName, String scheduleName, Integer top,
        Context context);
}
