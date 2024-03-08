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
import com.azure.resourcemanager.containerregistry.fluent.models.ReplicationInner;
import com.azure.resourcemanager.containerregistry.models.ReplicationUpdateParameters;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in ReplicationsClient.
 */
public interface ReplicationsClient {
    /**
     * Lists all the replications for the specified container registry.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to list replications for a container registry as paginated response with
     * {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ReplicationInner> listAsync(String resourceGroupName, String registryName);

    /**
     * Lists all the replications for the specified container registry.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to list replications for a container registry as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ReplicationInner> list(String resourceGroupName, String registryName);

    /**
     * Lists all the replications for the specified container registry.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to list replications for a container registry as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ReplicationInner> list(String resourceGroupName, String registryName, Context context);

    /**
     * Gets the properties of the specified replication.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param replicationName The name of the replication.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified replication along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ReplicationInner>> getWithResponseAsync(String resourceGroupName, String registryName,
        String replicationName);

    /**
     * Gets the properties of the specified replication.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param replicationName The name of the replication.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified replication on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ReplicationInner> getAsync(String resourceGroupName, String registryName, String replicationName);

    /**
     * Gets the properties of the specified replication.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param replicationName The name of the replication.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified replication along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ReplicationInner> getWithResponse(String resourceGroupName, String registryName, String replicationName,
        Context context);

    /**
     * Gets the properties of the specified replication.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param replicationName The name of the replication.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified replication.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ReplicationInner get(String resourceGroupName, String registryName, String replicationName);

    /**
     * Creates a replication for a container registry with the specified parameters.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param replicationName The name of the replication.
     * @param replication The parameters for creating a replication.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a replication for a container registry along with {@link Response} on
     * successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createWithResponseAsync(String resourceGroupName, String registryName,
        String replicationName, ReplicationInner replication);

    /**
     * Creates a replication for a container registry with the specified parameters.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param replicationName The name of the replication.
     * @param replication The parameters for creating a replication.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of an object that represents a replication for a container registry.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<ReplicationInner>, ReplicationInner> beginCreateAsync(String resourceGroupName,
        String registryName, String replicationName, ReplicationInner replication);

    /**
     * Creates a replication for a container registry with the specified parameters.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param replicationName The name of the replication.
     * @param replication The parameters for creating a replication.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of an object that represents a replication for a container registry.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ReplicationInner>, ReplicationInner> beginCreate(String resourceGroupName,
        String registryName, String replicationName, ReplicationInner replication);

    /**
     * Creates a replication for a container registry with the specified parameters.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param replicationName The name of the replication.
     * @param replication The parameters for creating a replication.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of an object that represents a replication for a container registry.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ReplicationInner>, ReplicationInner> beginCreate(String resourceGroupName,
        String registryName, String replicationName, ReplicationInner replication, Context context);

    /**
     * Creates a replication for a container registry with the specified parameters.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param replicationName The name of the replication.
     * @param replication The parameters for creating a replication.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a replication for a container registry on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ReplicationInner> createAsync(String resourceGroupName, String registryName, String replicationName,
        ReplicationInner replication);

    /**
     * Creates a replication for a container registry with the specified parameters.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param replicationName The name of the replication.
     * @param replication The parameters for creating a replication.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a replication for a container registry.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ReplicationInner create(String resourceGroupName, String registryName, String replicationName,
        ReplicationInner replication);

    /**
     * Creates a replication for a container registry with the specified parameters.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param replicationName The name of the replication.
     * @param replication The parameters for creating a replication.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a replication for a container registry.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ReplicationInner create(String resourceGroupName, String registryName, String replicationName,
        ReplicationInner replication, Context context);

    /**
     * Deletes a replication from a container registry.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param replicationName The name of the replication.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String registryName,
        String replicationName);

    /**
     * Deletes a replication from a container registry.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param replicationName The name of the replication.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(String resourceGroupName, String registryName,
        String replicationName);

    /**
     * Deletes a replication from a container registry.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param replicationName The name of the replication.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String registryName,
        String replicationName);

    /**
     * Deletes a replication from a container registry.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param replicationName The name of the replication.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String registryName,
        String replicationName, Context context);

    /**
     * Deletes a replication from a container registry.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param replicationName The name of the replication.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String registryName, String replicationName);

    /**
     * Deletes a replication from a container registry.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param replicationName The name of the replication.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String registryName, String replicationName);

    /**
     * Deletes a replication from a container registry.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param replicationName The name of the replication.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String registryName, String replicationName, Context context);

    /**
     * Updates a replication for a container registry with the specified parameters.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param replicationName The name of the replication.
     * @param replicationUpdateParameters The parameters for updating a replication.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a replication for a container registry along with {@link Response} on
     * successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> updateWithResponseAsync(String resourceGroupName, String registryName,
        String replicationName, ReplicationUpdateParameters replicationUpdateParameters);

    /**
     * Updates a replication for a container registry with the specified parameters.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param replicationName The name of the replication.
     * @param replicationUpdateParameters The parameters for updating a replication.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of an object that represents a replication for a container registry.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<ReplicationInner>, ReplicationInner> beginUpdateAsync(String resourceGroupName,
        String registryName, String replicationName, ReplicationUpdateParameters replicationUpdateParameters);

    /**
     * Updates a replication for a container registry with the specified parameters.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param replicationName The name of the replication.
     * @param replicationUpdateParameters The parameters for updating a replication.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of an object that represents a replication for a container registry.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ReplicationInner>, ReplicationInner> beginUpdate(String resourceGroupName,
        String registryName, String replicationName, ReplicationUpdateParameters replicationUpdateParameters);

    /**
     * Updates a replication for a container registry with the specified parameters.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param replicationName The name of the replication.
     * @param replicationUpdateParameters The parameters for updating a replication.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of an object that represents a replication for a container registry.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ReplicationInner>, ReplicationInner> beginUpdate(String resourceGroupName,
        String registryName, String replicationName, ReplicationUpdateParameters replicationUpdateParameters,
        Context context);

    /**
     * Updates a replication for a container registry with the specified parameters.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param replicationName The name of the replication.
     * @param replicationUpdateParameters The parameters for updating a replication.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a replication for a container registry on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ReplicationInner> updateAsync(String resourceGroupName, String registryName, String replicationName,
        ReplicationUpdateParameters replicationUpdateParameters);

    /**
     * Updates a replication for a container registry with the specified parameters.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param replicationName The name of the replication.
     * @param replicationUpdateParameters The parameters for updating a replication.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a replication for a container registry.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ReplicationInner update(String resourceGroupName, String registryName, String replicationName,
        ReplicationUpdateParameters replicationUpdateParameters);

    /**
     * Updates a replication for a container registry with the specified parameters.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param replicationName The name of the replication.
     * @param replicationUpdateParameters The parameters for updating a replication.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a replication for a container registry.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ReplicationInner update(String resourceGroupName, String registryName, String replicationName,
        ReplicationUpdateParameters replicationUpdateParameters, Context context);
}
