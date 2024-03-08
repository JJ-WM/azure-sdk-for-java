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
import com.azure.resourcemanager.cosmos.fluent.PercentileSourceTargetsClient;
import com.azure.resourcemanager.cosmos.fluent.models.PercentileMetricInner;
import com.azure.resourcemanager.cosmos.models.PercentileMetricListResult;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in PercentileSourceTargetsClient.
 */
public final class PercentileSourceTargetsClientImpl implements PercentileSourceTargetsClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final PercentileSourceTargetsService service;

    /**
     * The service client containing this operation class.
     */
    private final CosmosDBManagementClientImpl client;

    /**
     * Initializes an instance of PercentileSourceTargetsClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    PercentileSourceTargetsClientImpl(CosmosDBManagementClientImpl client) {
        this.service = RestProxy.create(PercentileSourceTargetsService.class, client.getHttpPipeline(),
            client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for CosmosDBManagementClientPercentileSourceTargets to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "CosmosDBManagementCl")
    public interface PercentileSourceTargetsService {
        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DocumentDB/databaseAccounts/{accountName}/sourceRegion/{sourceRegion}/targetRegion/{targetRegion}/percentile/metrics")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PercentileMetricListResult>> listMetrics(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("accountName") String accountName,
            @PathParam("sourceRegion") String sourceRegion, @PathParam("targetRegion") String targetRegion,
            @QueryParam("api-version") String apiVersion, @QueryParam("$filter") String filter,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Retrieves the metrics determined by the given filter for the given account, source and target region. This url is
     * only for PBS and Replication Latency data.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param sourceRegion Source region from which data is written. Cosmos DB region, with spaces between words and
     * each word capitalized.
     * @param targetRegion Target region to which data is written. Cosmos DB region, with spaces between words and each
     * word capitalized.
     * @param filter An OData filter expression that describes a subset of metrics to return. The parameters that can be
     * filtered are name.value (name of the metric, can have an or of multiple names), startTime, endTime, and
     * timeGrain. The supported operator is eq.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a list percentile metrics request along with {@link PagedResponse} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<PercentileMetricInner>> listMetricsSinglePageAsync(String resourceGroupName,
        String accountName, String sourceRegion, String targetRegion, String filter) {
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
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        if (sourceRegion == null) {
            return Mono.error(new IllegalArgumentException("Parameter sourceRegion is required and cannot be null."));
        }
        if (targetRegion == null) {
            return Mono.error(new IllegalArgumentException("Parameter targetRegion is required and cannot be null."));
        }
        if (filter == null) {
            return Mono.error(new IllegalArgumentException("Parameter filter is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listMetrics(this.client.getEndpoint(), this.client.getSubscriptionId(),
                resourceGroupName, accountName, sourceRegion, targetRegion, this.client.getApiVersion(), filter, accept,
                context))
            .<PagedResponse<PercentileMetricInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
                res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Retrieves the metrics determined by the given filter for the given account, source and target region. This url is
     * only for PBS and Replication Latency data.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param sourceRegion Source region from which data is written. Cosmos DB region, with spaces between words and
     * each word capitalized.
     * @param targetRegion Target region to which data is written. Cosmos DB region, with spaces between words and each
     * word capitalized.
     * @param filter An OData filter expression that describes a subset of metrics to return. The parameters that can be
     * filtered are name.value (name of the metric, can have an or of multiple names), startTime, endTime, and
     * timeGrain. The supported operator is eq.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a list percentile metrics request along with {@link PagedResponse} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<PercentileMetricInner>> listMetricsSinglePageAsync(String resourceGroupName,
        String accountName, String sourceRegion, String targetRegion, String filter, Context context) {
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
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        if (sourceRegion == null) {
            return Mono.error(new IllegalArgumentException("Parameter sourceRegion is required and cannot be null."));
        }
        if (targetRegion == null) {
            return Mono.error(new IllegalArgumentException("Parameter targetRegion is required and cannot be null."));
        }
        if (filter == null) {
            return Mono.error(new IllegalArgumentException("Parameter filter is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listMetrics(this.client.getEndpoint(), this.client.getSubscriptionId(), resourceGroupName, accountName,
                sourceRegion, targetRegion, this.client.getApiVersion(), filter, accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), null, null));
    }

    /**
     * Retrieves the metrics determined by the given filter for the given account, source and target region. This url is
     * only for PBS and Replication Latency data.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param sourceRegion Source region from which data is written. Cosmos DB region, with spaces between words and
     * each word capitalized.
     * @param targetRegion Target region to which data is written. Cosmos DB region, with spaces between words and each
     * word capitalized.
     * @param filter An OData filter expression that describes a subset of metrics to return. The parameters that can be
     * filtered are name.value (name of the metric, can have an or of multiple names), startTime, endTime, and
     * timeGrain. The supported operator is eq.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a list percentile metrics request as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<PercentileMetricInner> listMetricsAsync(String resourceGroupName, String accountName,
        String sourceRegion, String targetRegion, String filter) {
        return new PagedFlux<>(
            () -> listMetricsSinglePageAsync(resourceGroupName, accountName, sourceRegion, targetRegion, filter));
    }

    /**
     * Retrieves the metrics determined by the given filter for the given account, source and target region. This url is
     * only for PBS and Replication Latency data.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param sourceRegion Source region from which data is written. Cosmos DB region, with spaces between words and
     * each word capitalized.
     * @param targetRegion Target region to which data is written. Cosmos DB region, with spaces between words and each
     * word capitalized.
     * @param filter An OData filter expression that describes a subset of metrics to return. The parameters that can be
     * filtered are name.value (name of the metric, can have an or of multiple names), startTime, endTime, and
     * timeGrain. The supported operator is eq.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a list percentile metrics request as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<PercentileMetricInner> listMetricsAsync(String resourceGroupName, String accountName,
        String sourceRegion, String targetRegion, String filter, Context context) {
        return new PagedFlux<>(() -> listMetricsSinglePageAsync(resourceGroupName, accountName, sourceRegion,
            targetRegion, filter, context));
    }

    /**
     * Retrieves the metrics determined by the given filter for the given account, source and target region. This url is
     * only for PBS and Replication Latency data.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param sourceRegion Source region from which data is written. Cosmos DB region, with spaces between words and
     * each word capitalized.
     * @param targetRegion Target region to which data is written. Cosmos DB region, with spaces between words and each
     * word capitalized.
     * @param filter An OData filter expression that describes a subset of metrics to return. The parameters that can be
     * filtered are name.value (name of the metric, can have an or of multiple names), startTime, endTime, and
     * timeGrain. The supported operator is eq.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a list percentile metrics request as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<PercentileMetricInner> listMetrics(String resourceGroupName, String accountName,
        String sourceRegion, String targetRegion, String filter) {
        return new PagedIterable<>(
            listMetricsAsync(resourceGroupName, accountName, sourceRegion, targetRegion, filter));
    }

    /**
     * Retrieves the metrics determined by the given filter for the given account, source and target region. This url is
     * only for PBS and Replication Latency data.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param sourceRegion Source region from which data is written. Cosmos DB region, with spaces between words and
     * each word capitalized.
     * @param targetRegion Target region to which data is written. Cosmos DB region, with spaces between words and each
     * word capitalized.
     * @param filter An OData filter expression that describes a subset of metrics to return. The parameters that can be
     * filtered are name.value (name of the metric, can have an or of multiple names), startTime, endTime, and
     * timeGrain. The supported operator is eq.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a list percentile metrics request as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<PercentileMetricInner> listMetrics(String resourceGroupName, String accountName,
        String sourceRegion, String targetRegion, String filter, Context context) {
        return new PagedIterable<>(
            listMetricsAsync(resourceGroupName, accountName, sourceRegion, targetRegion, filter, context));
    }
}
