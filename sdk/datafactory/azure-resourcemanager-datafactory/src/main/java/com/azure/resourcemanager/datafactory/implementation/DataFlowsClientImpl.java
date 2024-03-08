// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
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
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.datafactory.fluent.DataFlowsClient;
import com.azure.resourcemanager.datafactory.fluent.models.DataFlowResourceInner;
import com.azure.resourcemanager.datafactory.models.DataFlowListResponse;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in DataFlowsClient.
 */
public final class DataFlowsClientImpl implements DataFlowsClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final DataFlowsService service;

    /**
     * The service client containing this operation class.
     */
    private final DataFactoryManagementClientImpl client;

    /**
     * Initializes an instance of DataFlowsClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    DataFlowsClientImpl(DataFactoryManagementClientImpl client) {
        this.service
            = RestProxy.create(DataFlowsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for DataFactoryManagementClientDataFlows to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "DataFactoryManagemen")
    public interface DataFlowsService {
        @Headers({ "Content-Type: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DataFactory/factories/{factoryName}/dataflows/{dataFlowName}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DataFlowResourceInner>> createOrUpdate(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("factoryName") String factoryName,
            @PathParam("dataFlowName") String dataFlowName, @QueryParam("api-version") String apiVersion,
            @HeaderParam("If-Match") String ifMatch, @BodyParam("application/json") DataFlowResourceInner dataFlow,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DataFactory/factories/{factoryName}/dataflows/{dataFlowName}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DataFlowResourceInner>> get(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("factoryName") String factoryName,
            @PathParam("dataFlowName") String dataFlowName, @QueryParam("api-version") String apiVersion,
            @HeaderParam("If-None-Match") String ifNoneMatch, @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DataFactory/factories/{factoryName}/dataflows/{dataFlowName}")
        @ExpectedResponses({ 200, 204 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Void>> delete(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("factoryName") String factoryName,
            @PathParam("dataFlowName") String dataFlowName, @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DataFactory/factories/{factoryName}/dataflows")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DataFlowListResponse>> listByFactory(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("factoryName") String factoryName,
            @QueryParam("api-version") String apiVersion, @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DataFlowListResponse>> listByFactoryNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Creates or updates a data flow.
     * 
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param dataFlowName The data flow name.
     * @param dataFlow Data flow resource definition.
     * @param ifMatch ETag of the data flow entity. Should only be specified for update, for which it should match
     * existing entity or can be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return data flow resource type along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DataFlowResourceInner>> createOrUpdateWithResponseAsync(String resourceGroupName,
        String factoryName, String dataFlowName, DataFlowResourceInner dataFlow, String ifMatch) {
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
        if (factoryName == null) {
            return Mono.error(new IllegalArgumentException("Parameter factoryName is required and cannot be null."));
        }
        if (dataFlowName == null) {
            return Mono.error(new IllegalArgumentException("Parameter dataFlowName is required and cannot be null."));
        }
        if (dataFlow == null) {
            return Mono.error(new IllegalArgumentException("Parameter dataFlow is required and cannot be null."));
        } else {
            dataFlow.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.createOrUpdate(this.client.getEndpoint(), this.client.getSubscriptionId(),
                resourceGroupName, factoryName, dataFlowName, this.client.getApiVersion(), ifMatch, dataFlow, accept,
                context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Creates or updates a data flow.
     * 
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param dataFlowName The data flow name.
     * @param dataFlow Data flow resource definition.
     * @param ifMatch ETag of the data flow entity. Should only be specified for update, for which it should match
     * existing entity or can be * for unconditional update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return data flow resource type along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DataFlowResourceInner>> createOrUpdateWithResponseAsync(String resourceGroupName,
        String factoryName, String dataFlowName, DataFlowResourceInner dataFlow, String ifMatch, Context context) {
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
        if (factoryName == null) {
            return Mono.error(new IllegalArgumentException("Parameter factoryName is required and cannot be null."));
        }
        if (dataFlowName == null) {
            return Mono.error(new IllegalArgumentException("Parameter dataFlowName is required and cannot be null."));
        }
        if (dataFlow == null) {
            return Mono.error(new IllegalArgumentException("Parameter dataFlow is required and cannot be null."));
        } else {
            dataFlow.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.createOrUpdate(this.client.getEndpoint(), this.client.getSubscriptionId(), resourceGroupName,
            factoryName, dataFlowName, this.client.getApiVersion(), ifMatch, dataFlow, accept, context);
    }

    /**
     * Creates or updates a data flow.
     * 
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param dataFlowName The data flow name.
     * @param dataFlow Data flow resource definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return data flow resource type on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<DataFlowResourceInner> createOrUpdateAsync(String resourceGroupName, String factoryName,
        String dataFlowName, DataFlowResourceInner dataFlow) {
        final String ifMatch = null;
        return createOrUpdateWithResponseAsync(resourceGroupName, factoryName, dataFlowName, dataFlow, ifMatch)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Creates or updates a data flow.
     * 
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param dataFlowName The data flow name.
     * @param dataFlow Data flow resource definition.
     * @param ifMatch ETag of the data flow entity. Should only be specified for update, for which it should match
     * existing entity or can be * for unconditional update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return data flow resource type along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<DataFlowResourceInner> createOrUpdateWithResponse(String resourceGroupName, String factoryName,
        String dataFlowName, DataFlowResourceInner dataFlow, String ifMatch, Context context) {
        return createOrUpdateWithResponseAsync(resourceGroupName, factoryName, dataFlowName, dataFlow, ifMatch, context)
            .block();
    }

    /**
     * Creates or updates a data flow.
     * 
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param dataFlowName The data flow name.
     * @param dataFlow Data flow resource definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return data flow resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DataFlowResourceInner createOrUpdate(String resourceGroupName, String factoryName, String dataFlowName,
        DataFlowResourceInner dataFlow) {
        final String ifMatch = null;
        return createOrUpdateWithResponse(resourceGroupName, factoryName, dataFlowName, dataFlow, ifMatch, Context.NONE)
            .getValue();
    }

    /**
     * Gets a data flow.
     * 
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param dataFlowName The data flow name.
     * @param ifNoneMatch ETag of the data flow entity. Should only be specified for get. If the ETag matches the
     * existing entity tag, or if * was provided, then no content will be returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a data flow along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DataFlowResourceInner>> getWithResponseAsync(String resourceGroupName, String factoryName,
        String dataFlowName, String ifNoneMatch) {
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
        if (factoryName == null) {
            return Mono.error(new IllegalArgumentException("Parameter factoryName is required and cannot be null."));
        }
        if (dataFlowName == null) {
            return Mono.error(new IllegalArgumentException("Parameter dataFlowName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context -> service.get(this.client.getEndpoint(), this.client.getSubscriptionId(), resourceGroupName,
                    factoryName, dataFlowName, this.client.getApiVersion(), ifNoneMatch, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets a data flow.
     * 
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param dataFlowName The data flow name.
     * @param ifNoneMatch ETag of the data flow entity. Should only be specified for get. If the ETag matches the
     * existing entity tag, or if * was provided, then no content will be returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a data flow along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DataFlowResourceInner>> getWithResponseAsync(String resourceGroupName, String factoryName,
        String dataFlowName, String ifNoneMatch, Context context) {
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
        if (factoryName == null) {
            return Mono.error(new IllegalArgumentException("Parameter factoryName is required and cannot be null."));
        }
        if (dataFlowName == null) {
            return Mono.error(new IllegalArgumentException("Parameter dataFlowName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), this.client.getSubscriptionId(), resourceGroupName, factoryName,
            dataFlowName, this.client.getApiVersion(), ifNoneMatch, accept, context);
    }

    /**
     * Gets a data flow.
     * 
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param dataFlowName The data flow name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a data flow on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<DataFlowResourceInner> getAsync(String resourceGroupName, String factoryName, String dataFlowName) {
        final String ifNoneMatch = null;
        return getWithResponseAsync(resourceGroupName, factoryName, dataFlowName, ifNoneMatch)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets a data flow.
     * 
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param dataFlowName The data flow name.
     * @param ifNoneMatch ETag of the data flow entity. Should only be specified for get. If the ETag matches the
     * existing entity tag, or if * was provided, then no content will be returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a data flow along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<DataFlowResourceInner> getWithResponse(String resourceGroupName, String factoryName,
        String dataFlowName, String ifNoneMatch, Context context) {
        return getWithResponseAsync(resourceGroupName, factoryName, dataFlowName, ifNoneMatch, context).block();
    }

    /**
     * Gets a data flow.
     * 
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param dataFlowName The data flow name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a data flow.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DataFlowResourceInner get(String resourceGroupName, String factoryName, String dataFlowName) {
        final String ifNoneMatch = null;
        return getWithResponse(resourceGroupName, factoryName, dataFlowName, ifNoneMatch, Context.NONE).getValue();
    }

    /**
     * Deletes a data flow.
     * 
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param dataFlowName The data flow name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> deleteWithResponseAsync(String resourceGroupName, String factoryName,
        String dataFlowName) {
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
        if (factoryName == null) {
            return Mono.error(new IllegalArgumentException("Parameter factoryName is required and cannot be null."));
        }
        if (dataFlowName == null) {
            return Mono.error(new IllegalArgumentException("Parameter dataFlowName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.delete(this.client.getEndpoint(), this.client.getSubscriptionId(),
                resourceGroupName, factoryName, dataFlowName, this.client.getApiVersion(), accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Deletes a data flow.
     * 
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param dataFlowName The data flow name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> deleteWithResponseAsync(String resourceGroupName, String factoryName,
        String dataFlowName, Context context) {
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
        if (factoryName == null) {
            return Mono.error(new IllegalArgumentException("Parameter factoryName is required and cannot be null."));
        }
        if (dataFlowName == null) {
            return Mono.error(new IllegalArgumentException("Parameter dataFlowName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.delete(this.client.getEndpoint(), this.client.getSubscriptionId(), resourceGroupName,
            factoryName, dataFlowName, this.client.getApiVersion(), accept, context);
    }

    /**
     * Deletes a data flow.
     * 
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param dataFlowName The data flow name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> deleteAsync(String resourceGroupName, String factoryName, String dataFlowName) {
        return deleteWithResponseAsync(resourceGroupName, factoryName, dataFlowName).flatMap(ignored -> Mono.empty());
    }

    /**
     * Deletes a data flow.
     * 
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param dataFlowName The data flow name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteWithResponse(String resourceGroupName, String factoryName, String dataFlowName,
        Context context) {
        return deleteWithResponseAsync(resourceGroupName, factoryName, dataFlowName, context).block();
    }

    /**
     * Deletes a data flow.
     * 
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param dataFlowName The data flow name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String factoryName, String dataFlowName) {
        deleteWithResponse(resourceGroupName, factoryName, dataFlowName, Context.NONE);
    }

    /**
     * Lists data flows.
     * 
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of data flow resources along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DataFlowResourceInner>> listByFactorySinglePageAsync(String resourceGroupName,
        String factoryName) {
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
        if (factoryName == null) {
            return Mono.error(new IllegalArgumentException("Parameter factoryName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listByFactory(this.client.getEndpoint(), this.client.getSubscriptionId(),
                resourceGroupName, factoryName, this.client.getApiVersion(), accept, context))
            .<PagedResponse<DataFlowResourceInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
                res.getStatusCode(), res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Lists data flows.
     * 
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of data flow resources along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DataFlowResourceInner>> listByFactorySinglePageAsync(String resourceGroupName,
        String factoryName, Context context) {
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
        if (factoryName == null) {
            return Mono.error(new IllegalArgumentException("Parameter factoryName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByFactory(this.client.getEndpoint(), this.client.getSubscriptionId(), resourceGroupName, factoryName,
                this.client.getApiVersion(), accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }

    /**
     * Lists data flows.
     * 
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of data flow resources as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<DataFlowResourceInner> listByFactoryAsync(String resourceGroupName, String factoryName) {
        return new PagedFlux<>(() -> listByFactorySinglePageAsync(resourceGroupName, factoryName),
            nextLink -> listByFactoryNextSinglePageAsync(nextLink));
    }

    /**
     * Lists data flows.
     * 
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of data flow resources as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<DataFlowResourceInner> listByFactoryAsync(String resourceGroupName, String factoryName,
        Context context) {
        return new PagedFlux<>(() -> listByFactorySinglePageAsync(resourceGroupName, factoryName, context),
            nextLink -> listByFactoryNextSinglePageAsync(nextLink, context));
    }

    /**
     * Lists data flows.
     * 
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of data flow resources as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<DataFlowResourceInner> listByFactory(String resourceGroupName, String factoryName) {
        return new PagedIterable<>(listByFactoryAsync(resourceGroupName, factoryName));
    }

    /**
     * Lists data flows.
     * 
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of data flow resources as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<DataFlowResourceInner> listByFactory(String resourceGroupName, String factoryName,
        Context context) {
        return new PagedIterable<>(listByFactoryAsync(resourceGroupName, factoryName, context));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items
     * 
     * The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of data flow resources along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DataFlowResourceInner>> listByFactoryNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listByFactoryNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<DataFlowResourceInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
                res.getStatusCode(), res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items
     * 
     * The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of data flow resources along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DataFlowResourceInner>> listByFactoryNextSinglePageAsync(String nextLink,
        Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.listByFactoryNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }
}
