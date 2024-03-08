// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.PrivateEndpointConnectionOperationsClient;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.PrivateEndpointConnectionInner;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * PrivateEndpointConnectionOperationsClient.
 */
public final class PrivateEndpointConnectionOperationsClientImpl implements PrivateEndpointConnectionOperationsClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final PrivateEndpointConnectionOperationsService service;

    /**
     * The service client containing this operation class.
     */
    private final PostgreSqlManagementClientImpl client;

    /**
     * Initializes an instance of PrivateEndpointConnectionOperationsClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    PrivateEndpointConnectionOperationsClientImpl(PostgreSqlManagementClientImpl client) {
        this.service = RestProxy.create(PrivateEndpointConnectionOperationsService.class, client.getHttpPipeline(),
            client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for PostgreSqlManagementClientPrivateEndpointConnectionOperations to be
     * used by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "PostgreSqlManagement")
    public interface PrivateEndpointConnectionOperationsService {
        @Headers({ "Content-Type: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DBforPostgreSQL/flexibleServers/{serverName}/privateEndpointConnections/{privateEndpointConnectionName}")
        @ExpectedResponses({ 200, 201, 202 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Flux<ByteBuffer>>> update(@HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName,
            @PathParam("privateEndpointConnectionName") String privateEndpointConnectionName,
            @BodyParam("application/json") PrivateEndpointConnectionInner parameters,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DBforPostgreSQL/flexibleServers/{serverName}/privateEndpointConnections/{privateEndpointConnectionName}")
        @ExpectedResponses({ 202, 204 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Flux<ByteBuffer>>> delete(@HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName,
            @PathParam("privateEndpointConnectionName") String privateEndpointConnectionName,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Approve or reject a private endpoint connection with a given name.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param parameters The required parameters for updating private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private endpoint connection resource along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Flux<ByteBuffer>>> updateWithResponseAsync(String resourceGroupName, String serverName,
        String privateEndpointConnectionName, PrivateEndpointConnectionInner parameters) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (privateEndpointConnectionName == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter privateEndpointConnectionName is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.update(this.client.getEndpoint(), this.client.getApiVersion(),
                this.client.getSubscriptionId(), resourceGroupName, serverName, privateEndpointConnectionName,
                parameters, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Approve or reject a private endpoint connection with a given name.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param parameters The required parameters for updating private endpoint connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private endpoint connection resource along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> updateWithResponseAsync(String resourceGroupName, String serverName,
        String privateEndpointConnectionName, PrivateEndpointConnectionInner parameters, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (privateEndpointConnectionName == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter privateEndpointConnectionName is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.update(this.client.getEndpoint(), this.client.getApiVersion(), this.client.getSubscriptionId(),
            resourceGroupName, serverName, privateEndpointConnectionName, parameters, accept, context);
    }

    /**
     * Approve or reject a private endpoint connection with a given name.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param parameters The required parameters for updating private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of the private endpoint connection resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<PollResult<PrivateEndpointConnectionInner>, PrivateEndpointConnectionInner> beginUpdateAsync(
        String resourceGroupName, String serverName, String privateEndpointConnectionName,
        PrivateEndpointConnectionInner parameters) {
        Mono<Response<Flux<ByteBuffer>>> mono
            = updateWithResponseAsync(resourceGroupName, serverName, privateEndpointConnectionName, parameters);
        return this.client.<PrivateEndpointConnectionInner, PrivateEndpointConnectionInner>getLroResult(mono,
            this.client.getHttpPipeline(), PrivateEndpointConnectionInner.class, PrivateEndpointConnectionInner.class,
            this.client.getContext());
    }

    /**
     * Approve or reject a private endpoint connection with a given name.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param parameters The required parameters for updating private endpoint connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of the private endpoint connection resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    private PollerFlux<PollResult<PrivateEndpointConnectionInner>, PrivateEndpointConnectionInner> beginUpdateAsync(
        String resourceGroupName, String serverName, String privateEndpointConnectionName,
        PrivateEndpointConnectionInner parameters, Context context) {
        context = this.client.mergeContext(context);
        Mono<Response<Flux<ByteBuffer>>> mono = updateWithResponseAsync(resourceGroupName, serverName,
            privateEndpointConnectionName, parameters, context);
        return this.client.<PrivateEndpointConnectionInner, PrivateEndpointConnectionInner>getLroResult(mono,
            this.client.getHttpPipeline(), PrivateEndpointConnectionInner.class, PrivateEndpointConnectionInner.class,
            context);
    }

    /**
     * Approve or reject a private endpoint connection with a given name.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param parameters The required parameters for updating private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the private endpoint connection resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<PollResult<PrivateEndpointConnectionInner>, PrivateEndpointConnectionInner> beginUpdate(
        String resourceGroupName, String serverName, String privateEndpointConnectionName,
        PrivateEndpointConnectionInner parameters) {
        return this.beginUpdateAsync(resourceGroupName, serverName, privateEndpointConnectionName, parameters)
            .getSyncPoller();
    }

    /**
     * Approve or reject a private endpoint connection with a given name.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param parameters The required parameters for updating private endpoint connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the private endpoint connection resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<PollResult<PrivateEndpointConnectionInner>, PrivateEndpointConnectionInner> beginUpdate(
        String resourceGroupName, String serverName, String privateEndpointConnectionName,
        PrivateEndpointConnectionInner parameters, Context context) {
        return this.beginUpdateAsync(resourceGroupName, serverName, privateEndpointConnectionName, parameters, context)
            .getSyncPoller();
    }

    /**
     * Approve or reject a private endpoint connection with a given name.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param parameters The required parameters for updating private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private endpoint connection resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PrivateEndpointConnectionInner> updateAsync(String resourceGroupName, String serverName,
        String privateEndpointConnectionName, PrivateEndpointConnectionInner parameters) {
        return beginUpdateAsync(resourceGroupName, serverName, privateEndpointConnectionName, parameters).last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Approve or reject a private endpoint connection with a given name.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param parameters The required parameters for updating private endpoint connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private endpoint connection resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PrivateEndpointConnectionInner> updateAsync(String resourceGroupName, String serverName,
        String privateEndpointConnectionName, PrivateEndpointConnectionInner parameters, Context context) {
        return beginUpdateAsync(resourceGroupName, serverName, privateEndpointConnectionName, parameters, context)
            .last().flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Approve or reject a private endpoint connection with a given name.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param parameters The required parameters for updating private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private endpoint connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PrivateEndpointConnectionInner update(String resourceGroupName, String serverName,
        String privateEndpointConnectionName, PrivateEndpointConnectionInner parameters) {
        return updateAsync(resourceGroupName, serverName, privateEndpointConnectionName, parameters).block();
    }

    /**
     * Approve or reject a private endpoint connection with a given name.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param parameters The required parameters for updating private endpoint connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private endpoint connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PrivateEndpointConnectionInner update(String resourceGroupName, String serverName,
        String privateEndpointConnectionName, PrivateEndpointConnectionInner parameters, Context context) {
        return updateAsync(resourceGroupName, serverName, privateEndpointConnectionName, parameters, context).block();
    }

    /**
     * Deletes a private endpoint connection with a given name.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String serverName,
        String privateEndpointConnectionName) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (privateEndpointConnectionName == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter privateEndpointConnectionName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.delete(this.client.getEndpoint(), this.client.getApiVersion(),
                this.client.getSubscriptionId(), resourceGroupName, serverName, privateEndpointConnectionName, accept,
                context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Deletes a private endpoint connection with a given name.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String serverName,
        String privateEndpointConnectionName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (privateEndpointConnectionName == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter privateEndpointConnectionName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.delete(this.client.getEndpoint(), this.client.getApiVersion(), this.client.getSubscriptionId(),
            resourceGroupName, serverName, privateEndpointConnectionName, accept, context);
    }

    /**
     * Deletes a private endpoint connection with a given name.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<PollResult<Void>, Void> beginDeleteAsync(String resourceGroupName, String serverName,
        String privateEndpointConnectionName) {
        Mono<Response<Flux<ByteBuffer>>> mono
            = deleteWithResponseAsync(resourceGroupName, serverName, privateEndpointConnectionName);
        return this.client.<Void, Void>getLroResult(mono, this.client.getHttpPipeline(), Void.class, Void.class,
            this.client.getContext());
    }

    /**
     * Deletes a private endpoint connection with a given name.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    private PollerFlux<PollResult<Void>, Void> beginDeleteAsync(String resourceGroupName, String serverName,
        String privateEndpointConnectionName, Context context) {
        context = this.client.mergeContext(context);
        Mono<Response<Flux<ByteBuffer>>> mono
            = deleteWithResponseAsync(resourceGroupName, serverName, privateEndpointConnectionName, context);
        return this.client.<Void, Void>getLroResult(mono, this.client.getHttpPipeline(), Void.class, Void.class,
            context);
    }

    /**
     * Deletes a private endpoint connection with a given name.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String serverName,
        String privateEndpointConnectionName) {
        return this.beginDeleteAsync(resourceGroupName, serverName, privateEndpointConnectionName).getSyncPoller();
    }

    /**
     * Deletes a private endpoint connection with a given name.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String serverName,
        String privateEndpointConnectionName, Context context) {
        return this.beginDeleteAsync(resourceGroupName, serverName, privateEndpointConnectionName, context)
            .getSyncPoller();
    }

    /**
     * Deletes a private endpoint connection with a given name.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String serverName, String privateEndpointConnectionName) {
        return beginDeleteAsync(resourceGroupName, serverName, privateEndpointConnectionName).last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Deletes a private endpoint connection with a given name.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> deleteAsync(String resourceGroupName, String serverName, String privateEndpointConnectionName,
        Context context) {
        return beginDeleteAsync(resourceGroupName, serverName, privateEndpointConnectionName, context).last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Deletes a private endpoint connection with a given name.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String serverName, String privateEndpointConnectionName) {
        deleteAsync(resourceGroupName, serverName, privateEndpointConnectionName).block();
    }

    /**
     * Deletes a private endpoint connection with a given name.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String serverName, String privateEndpointConnectionName,
        Context context) {
        deleteAsync(resourceGroupName, serverName, privateEndpointConnectionName, context).block();
    }
}
