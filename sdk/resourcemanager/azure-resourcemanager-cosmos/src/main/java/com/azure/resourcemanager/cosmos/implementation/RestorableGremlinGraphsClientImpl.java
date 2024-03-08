// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
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
import com.azure.resourcemanager.cosmos.fluent.RestorableGremlinGraphsClient;
import com.azure.resourcemanager.cosmos.fluent.models.RestorableGremlinGraphGetResultInner;
import com.azure.resourcemanager.cosmos.models.RestorableGremlinGraphsListResult;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in RestorableGremlinGraphsClient.
 */
public final class RestorableGremlinGraphsClientImpl implements RestorableGremlinGraphsClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final RestorableGremlinGraphsService service;

    /**
     * The service client containing this operation class.
     */
    private final CosmosDBManagementClientImpl client;

    /**
     * Initializes an instance of RestorableGremlinGraphsClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    RestorableGremlinGraphsClientImpl(CosmosDBManagementClientImpl client) {
        this.service = RestProxy.create(RestorableGremlinGraphsService.class, client.getHttpPipeline(),
            client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for CosmosDBManagementClientRestorableGremlinGraphs to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "CosmosDBManagementCl")
    public interface RestorableGremlinGraphsService {
        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.DocumentDB/locations/{location}/restorableDatabaseAccounts/{instanceId}/restorableGraphs")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<RestorableGremlinGraphsListResult>> list(@HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId,
            @PathParam("location") String location, @PathParam("instanceId") String instanceId,
            @QueryParam("restorableGremlinDatabaseRid") String restorableGremlinDatabaseRid,
            @QueryParam("startTime") String startTime, @QueryParam("endTime") String endTime,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Show the event feed of all mutations done on all the Azure Cosmos DB Gremlin graphs under a specific database.
     * This helps in scenario where container was accidentally deleted. This API requires
     * 'Microsoft.DocumentDB/locations/restorableDatabaseAccounts/.../read' permission.
     * 
     * @param location Cosmos DB region, with spaces between words and each word capitalized.
     * @param instanceId The instanceId GUID of a restorable database account.
     * @param restorableGremlinDatabaseRid The resource ID of the Gremlin database.
     * @param startTime Restorable Gremlin graphs event feed start time.
     * @param endTime Restorable Gremlin graphs event feed end time.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List operation response, that contains the Gremlin graph events and their properties along with
     * {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<RestorableGremlinGraphGetResultInner>> listSinglePageAsync(String location,
        String instanceId, String restorableGremlinDatabaseRid, String startTime, String endTime) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (instanceId == null) {
            return Mono.error(new IllegalArgumentException("Parameter instanceId is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.list(this.client.getEndpoint(), this.client.getApiVersion(),
                this.client.getSubscriptionId(), location, instanceId, restorableGremlinDatabaseRid, startTime, endTime,
                accept, context))
            .<PagedResponse<RestorableGremlinGraphGetResultInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
                res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Show the event feed of all mutations done on all the Azure Cosmos DB Gremlin graphs under a specific database.
     * This helps in scenario where container was accidentally deleted. This API requires
     * 'Microsoft.DocumentDB/locations/restorableDatabaseAccounts/.../read' permission.
     * 
     * @param location Cosmos DB region, with spaces between words and each word capitalized.
     * @param instanceId The instanceId GUID of a restorable database account.
     * @param restorableGremlinDatabaseRid The resource ID of the Gremlin database.
     * @param startTime Restorable Gremlin graphs event feed start time.
     * @param endTime Restorable Gremlin graphs event feed end time.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List operation response, that contains the Gremlin graph events and their properties along with
     * {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<RestorableGremlinGraphGetResultInner>> listSinglePageAsync(String location,
        String instanceId, String restorableGremlinDatabaseRid, String startTime, String endTime, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (instanceId == null) {
            return Mono.error(new IllegalArgumentException("Parameter instanceId is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(this.client.getEndpoint(), this.client.getApiVersion(), this.client.getSubscriptionId(), location,
                instanceId, restorableGremlinDatabaseRid, startTime, endTime, accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), null, null));
    }

    /**
     * Show the event feed of all mutations done on all the Azure Cosmos DB Gremlin graphs under a specific database.
     * This helps in scenario where container was accidentally deleted. This API requires
     * 'Microsoft.DocumentDB/locations/restorableDatabaseAccounts/.../read' permission.
     * 
     * @param location Cosmos DB region, with spaces between words and each word capitalized.
     * @param instanceId The instanceId GUID of a restorable database account.
     * @param restorableGremlinDatabaseRid The resource ID of the Gremlin database.
     * @param startTime Restorable Gremlin graphs event feed start time.
     * @param endTime Restorable Gremlin graphs event feed end time.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List operation response, that contains the Gremlin graph events and their properties as paginated
     * response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<RestorableGremlinGraphGetResultInner> listAsync(String location, String instanceId,
        String restorableGremlinDatabaseRid, String startTime, String endTime) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(location, instanceId, restorableGremlinDatabaseRid, startTime, endTime));
    }

    /**
     * Show the event feed of all mutations done on all the Azure Cosmos DB Gremlin graphs under a specific database.
     * This helps in scenario where container was accidentally deleted. This API requires
     * 'Microsoft.DocumentDB/locations/restorableDatabaseAccounts/.../read' permission.
     * 
     * @param location Cosmos DB region, with spaces between words and each word capitalized.
     * @param instanceId The instanceId GUID of a restorable database account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List operation response, that contains the Gremlin graph events and their properties as paginated
     * response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<RestorableGremlinGraphGetResultInner> listAsync(String location, String instanceId) {
        final String restorableGremlinDatabaseRid = null;
        final String startTime = null;
        final String endTime = null;
        return new PagedFlux<>(
            () -> listSinglePageAsync(location, instanceId, restorableGremlinDatabaseRid, startTime, endTime));
    }

    /**
     * Show the event feed of all mutations done on all the Azure Cosmos DB Gremlin graphs under a specific database.
     * This helps in scenario where container was accidentally deleted. This API requires
     * 'Microsoft.DocumentDB/locations/restorableDatabaseAccounts/.../read' permission.
     * 
     * @param location Cosmos DB region, with spaces between words and each word capitalized.
     * @param instanceId The instanceId GUID of a restorable database account.
     * @param restorableGremlinDatabaseRid The resource ID of the Gremlin database.
     * @param startTime Restorable Gremlin graphs event feed start time.
     * @param endTime Restorable Gremlin graphs event feed end time.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List operation response, that contains the Gremlin graph events and their properties as paginated
     * response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<RestorableGremlinGraphGetResultInner> listAsync(String location, String instanceId,
        String restorableGremlinDatabaseRid, String startTime, String endTime, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(location, instanceId, restorableGremlinDatabaseRid, startTime, endTime, context));
    }

    /**
     * Show the event feed of all mutations done on all the Azure Cosmos DB Gremlin graphs under a specific database.
     * This helps in scenario where container was accidentally deleted. This API requires
     * 'Microsoft.DocumentDB/locations/restorableDatabaseAccounts/.../read' permission.
     * 
     * @param location Cosmos DB region, with spaces between words and each word capitalized.
     * @param instanceId The instanceId GUID of a restorable database account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List operation response, that contains the Gremlin graph events and their properties as paginated
     * response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<RestorableGremlinGraphGetResultInner> list(String location, String instanceId) {
        final String restorableGremlinDatabaseRid = null;
        final String startTime = null;
        final String endTime = null;
        return new PagedIterable<>(listAsync(location, instanceId, restorableGremlinDatabaseRid, startTime, endTime));
    }

    /**
     * Show the event feed of all mutations done on all the Azure Cosmos DB Gremlin graphs under a specific database.
     * This helps in scenario where container was accidentally deleted. This API requires
     * 'Microsoft.DocumentDB/locations/restorableDatabaseAccounts/.../read' permission.
     * 
     * @param location Cosmos DB region, with spaces between words and each word capitalized.
     * @param instanceId The instanceId GUID of a restorable database account.
     * @param restorableGremlinDatabaseRid The resource ID of the Gremlin database.
     * @param startTime Restorable Gremlin graphs event feed start time.
     * @param endTime Restorable Gremlin graphs event feed end time.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List operation response, that contains the Gremlin graph events and their properties as paginated
     * response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<RestorableGremlinGraphGetResultInner> list(String location, String instanceId,
        String restorableGremlinDatabaseRid, String startTime, String endTime, Context context) {
        return new PagedIterable<>(
            listAsync(location, instanceId, restorableGremlinDatabaseRid, startTime, endTime, context));
    }
}
