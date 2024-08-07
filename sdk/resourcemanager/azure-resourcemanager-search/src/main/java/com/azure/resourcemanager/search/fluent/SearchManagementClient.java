// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.search.fluent.models.QuotaUsageResultInner;
import java.time.Duration;
import java.util.UUID;
import reactor.core.publisher.Mono;

/**
 * The interface for SearchManagementClient class.
 */
public interface SearchManagementClient {
    /**
     * Gets The unique identifier for a Microsoft Azure subscription. You can obtain this value from the Azure Resource
     * Manager API, command line tools, or the portal.
     * 
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets server parameter.
     * 
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets Api Version.
     * 
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Gets The HTTP pipeline to send requests through.
     * 
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     * 
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the OperationsClient object to access its operations.
     * 
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the AdminKeysClient object to access its operations.
     * 
     * @return the AdminKeysClient object.
     */
    AdminKeysClient getAdminKeys();

    /**
     * Gets the QueryKeysClient object to access its operations.
     * 
     * @return the QueryKeysClient object.
     */
    QueryKeysClient getQueryKeys();

    /**
     * Gets the ServicesClient object to access its operations.
     * 
     * @return the ServicesClient object.
     */
    ServicesClient getServices();

    /**
     * Gets the PrivateLinkResourcesClient object to access its operations.
     * 
     * @return the PrivateLinkResourcesClient object.
     */
    PrivateLinkResourcesClient getPrivateLinkResources();

    /**
     * Gets the PrivateEndpointConnectionsClient object to access its operations.
     * 
     * @return the PrivateEndpointConnectionsClient object.
     */
    PrivateEndpointConnectionsClient getPrivateEndpointConnections();

    /**
     * Gets the SharedPrivateLinkResourcesClient object to access its operations.
     * 
     * @return the SharedPrivateLinkResourcesClient object.
     */
    SharedPrivateLinkResourcesClient getSharedPrivateLinkResources();

    /**
     * Gets the UsagesClient object to access its operations.
     * 
     * @return the UsagesClient object.
     */
    UsagesClient getUsages();

    /**
     * Gets the quota usage for a search SKU in the given subscription.
     * 
     * @param location The unique location name for a Microsoft Azure geographic region.
     * @param skuName The unique SKU name that identifies a billable tier.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     * included in response information as a way to track the request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the quota usage for a search SKU in the given subscription along with {@link Response} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<QuotaUsageResultInner>> usageBySubscriptionSkuWithResponseAsync(String location, String skuName,
        UUID clientRequestId);

    /**
     * Gets the quota usage for a search SKU in the given subscription.
     * 
     * @param location The unique location name for a Microsoft Azure geographic region.
     * @param skuName The unique SKU name that identifies a billable tier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the quota usage for a search SKU in the given subscription on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<QuotaUsageResultInner> usageBySubscriptionSkuAsync(String location, String skuName);

    /**
     * Gets the quota usage for a search SKU in the given subscription.
     * 
     * @param location The unique location name for a Microsoft Azure geographic region.
     * @param skuName The unique SKU name that identifies a billable tier.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     * included in response information as a way to track the request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the quota usage for a search SKU in the given subscription along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<QuotaUsageResultInner> usageBySubscriptionSkuWithResponse(String location, String skuName,
        UUID clientRequestId, Context context);

    /**
     * Gets the quota usage for a search SKU in the given subscription.
     * 
     * @param location The unique location name for a Microsoft Azure geographic region.
     * @param skuName The unique SKU name that identifies a billable tier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the quota usage for a search SKU in the given subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    QuotaUsageResultInner usageBySubscriptionSku(String location, String skuName);
}
