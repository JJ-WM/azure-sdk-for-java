// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.containerregistry.fluent.models.AgentPoolInner;
import com.azure.resourcemanager.containerregistry.fluent.models.AgentPoolQueueStatusInner;
import com.azure.resourcemanager.containerregistry.models.AgentPoolUpdateParameters;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in AgentPoolsClient.
 */
public interface AgentPoolsClient {
    /**
     * Gets the detailed information for a given agent pool.
     * 
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param agentPoolName The name of the agent pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the detailed information for a given agent pool along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<AgentPoolInner>> getWithResponseAsync(String resourceGroupName, String registryName,
        String agentPoolName);

    /**
     * Gets the detailed information for a given agent pool.
     * 
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param agentPoolName The name of the agent pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the detailed information for a given agent pool on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<AgentPoolInner> getAsync(String resourceGroupName, String registryName, String agentPoolName);

    /**
     * Gets the detailed information for a given agent pool.
     * 
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param agentPoolName The name of the agent pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the detailed information for a given agent pool along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AgentPoolInner> getWithResponse(String resourceGroupName, String registryName, String agentPoolName,
        Context context);

    /**
     * Gets the detailed information for a given agent pool.
     * 
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param agentPoolName The name of the agent pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the detailed information for a given agent pool.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AgentPoolInner get(String resourceGroupName, String registryName, String agentPoolName);

    /**
     * Creates an agent pool for a container registry with the specified parameters.
     * 
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param agentPoolName The name of the agent pool.
     * @param agentPool The parameters of an agent pool that needs to scheduled.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the agentpool that has the ARM resource and properties along with {@link Response} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createWithResponseAsync(String resourceGroupName, String registryName,
        String agentPoolName, AgentPoolInner agentPool);

    /**
     * Creates an agent pool for a container registry with the specified parameters.
     * 
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param agentPoolName The name of the agent pool.
     * @param agentPool The parameters of an agent pool that needs to scheduled.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of the agentpool that has the ARM resource and properties.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<AgentPoolInner>, AgentPoolInner> beginCreateAsync(String resourceGroupName,
        String registryName, String agentPoolName, AgentPoolInner agentPool);

    /**
     * Creates an agent pool for a container registry with the specified parameters.
     * 
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param agentPoolName The name of the agent pool.
     * @param agentPool The parameters of an agent pool that needs to scheduled.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the agentpool that has the ARM resource and properties.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AgentPoolInner>, AgentPoolInner> beginCreate(String resourceGroupName, String registryName,
        String agentPoolName, AgentPoolInner agentPool);

    /**
     * Creates an agent pool for a container registry with the specified parameters.
     * 
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param agentPoolName The name of the agent pool.
     * @param agentPool The parameters of an agent pool that needs to scheduled.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the agentpool that has the ARM resource and properties.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AgentPoolInner>, AgentPoolInner> beginCreate(String resourceGroupName, String registryName,
        String agentPoolName, AgentPoolInner agentPool, Context context);

    /**
     * Creates an agent pool for a container registry with the specified parameters.
     * 
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param agentPoolName The name of the agent pool.
     * @param agentPool The parameters of an agent pool that needs to scheduled.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the agentpool that has the ARM resource and properties on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<AgentPoolInner> createAsync(String resourceGroupName, String registryName, String agentPoolName,
        AgentPoolInner agentPool);

    /**
     * Creates an agent pool for a container registry with the specified parameters.
     * 
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param agentPoolName The name of the agent pool.
     * @param agentPool The parameters of an agent pool that needs to scheduled.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the agentpool that has the ARM resource and properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AgentPoolInner create(String resourceGroupName, String registryName, String agentPoolName,
        AgentPoolInner agentPool);

    /**
     * Creates an agent pool for a container registry with the specified parameters.
     * 
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param agentPoolName The name of the agent pool.
     * @param agentPool The parameters of an agent pool that needs to scheduled.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the agentpool that has the ARM resource and properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AgentPoolInner create(String resourceGroupName, String registryName, String agentPoolName, AgentPoolInner agentPool,
        Context context);

    /**
     * Deletes a specified agent pool resource.
     * 
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param agentPoolName The name of the agent pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String registryName,
        String agentPoolName);

    /**
     * Deletes a specified agent pool resource.
     * 
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param agentPoolName The name of the agent pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(String resourceGroupName, String registryName,
        String agentPoolName);

    /**
     * Deletes a specified agent pool resource.
     * 
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param agentPoolName The name of the agent pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String registryName, String agentPoolName);

    /**
     * Deletes a specified agent pool resource.
     * 
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param agentPoolName The name of the agent pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String registryName, String agentPoolName,
        Context context);

    /**
     * Deletes a specified agent pool resource.
     * 
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param agentPoolName The name of the agent pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String registryName, String agentPoolName);

    /**
     * Deletes a specified agent pool resource.
     * 
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param agentPoolName The name of the agent pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String registryName, String agentPoolName);

    /**
     * Deletes a specified agent pool resource.
     * 
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param agentPoolName The name of the agent pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String registryName, String agentPoolName, Context context);

    /**
     * Updates an agent pool with the specified parameters.
     * 
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param agentPoolName The name of the agent pool.
     * @param updateParameters The parameters for updating an agent pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the agentpool that has the ARM resource and properties along with {@link Response} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> updateWithResponseAsync(String resourceGroupName, String registryName,
        String agentPoolName, AgentPoolUpdateParameters updateParameters);

    /**
     * Updates an agent pool with the specified parameters.
     * 
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param agentPoolName The name of the agent pool.
     * @param updateParameters The parameters for updating an agent pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of the agentpool that has the ARM resource and properties.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<AgentPoolInner>, AgentPoolInner> beginUpdateAsync(String resourceGroupName,
        String registryName, String agentPoolName, AgentPoolUpdateParameters updateParameters);

    /**
     * Updates an agent pool with the specified parameters.
     * 
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param agentPoolName The name of the agent pool.
     * @param updateParameters The parameters for updating an agent pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the agentpool that has the ARM resource and properties.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AgentPoolInner>, AgentPoolInner> beginUpdate(String resourceGroupName, String registryName,
        String agentPoolName, AgentPoolUpdateParameters updateParameters);

    /**
     * Updates an agent pool with the specified parameters.
     * 
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param agentPoolName The name of the agent pool.
     * @param updateParameters The parameters for updating an agent pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the agentpool that has the ARM resource and properties.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AgentPoolInner>, AgentPoolInner> beginUpdate(String resourceGroupName, String registryName,
        String agentPoolName, AgentPoolUpdateParameters updateParameters, Context context);

    /**
     * Updates an agent pool with the specified parameters.
     * 
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param agentPoolName The name of the agent pool.
     * @param updateParameters The parameters for updating an agent pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the agentpool that has the ARM resource and properties on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<AgentPoolInner> updateAsync(String resourceGroupName, String registryName, String agentPoolName,
        AgentPoolUpdateParameters updateParameters);

    /**
     * Updates an agent pool with the specified parameters.
     * 
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param agentPoolName The name of the agent pool.
     * @param updateParameters The parameters for updating an agent pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the agentpool that has the ARM resource and properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AgentPoolInner update(String resourceGroupName, String registryName, String agentPoolName,
        AgentPoolUpdateParameters updateParameters);

    /**
     * Updates an agent pool with the specified parameters.
     * 
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param agentPoolName The name of the agent pool.
     * @param updateParameters The parameters for updating an agent pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the agentpool that has the ARM resource and properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AgentPoolInner update(String resourceGroupName, String registryName, String agentPoolName,
        AgentPoolUpdateParameters updateParameters, Context context);

    /**
     * Lists all the agent pools for a specified container registry.
     * 
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the collection of agent pools as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<AgentPoolInner> listAsync(String resourceGroupName, String registryName);

    /**
     * Lists all the agent pools for a specified container registry.
     * 
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the collection of agent pools as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AgentPoolInner> list(String resourceGroupName, String registryName);

    /**
     * Lists all the agent pools for a specified container registry.
     * 
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the collection of agent pools as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AgentPoolInner> list(String resourceGroupName, String registryName, Context context);

    /**
     * Gets the count of queued runs for a given agent pool.
     * 
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param agentPoolName The name of the agent pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the count of queued runs for a given agent pool along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<AgentPoolQueueStatusInner>> getQueueStatusWithResponseAsync(String resourceGroupName,
        String registryName, String agentPoolName);

    /**
     * Gets the count of queued runs for a given agent pool.
     * 
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param agentPoolName The name of the agent pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the count of queued runs for a given agent pool on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<AgentPoolQueueStatusInner> getQueueStatusAsync(String resourceGroupName, String registryName,
        String agentPoolName);

    /**
     * Gets the count of queued runs for a given agent pool.
     * 
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param agentPoolName The name of the agent pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the count of queued runs for a given agent pool along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AgentPoolQueueStatusInner> getQueueStatusWithResponse(String resourceGroupName, String registryName,
        String agentPoolName, Context context);

    /**
     * Gets the count of queued runs for a given agent pool.
     * 
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param agentPoolName The name of the agent pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the count of queued runs for a given agent pool.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AgentPoolQueueStatusInner getQueueStatus(String resourceGroupName, String registryName, String agentPoolName);
}
