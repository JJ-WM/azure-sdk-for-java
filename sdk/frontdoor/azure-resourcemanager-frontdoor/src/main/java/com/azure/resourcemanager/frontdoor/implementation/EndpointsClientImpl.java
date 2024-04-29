// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
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
import com.azure.resourcemanager.frontdoor.fluent.EndpointsClient;
import com.azure.resourcemanager.frontdoor.models.PurgeParameters;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in EndpointsClient.
 */
public final class EndpointsClientImpl implements EndpointsClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final EndpointsService service;

    /**
     * The service client containing this operation class.
     */
    private final FrontDoorManagementClientImpl client;

    /**
     * Initializes an instance of EndpointsClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    EndpointsClientImpl(FrontDoorManagementClientImpl client) {
        this.service
            = RestProxy.create(EndpointsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for FrontDoorManagementClientEndpoints to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "FrontDoorManagementC")
    public interface EndpointsService {
        @Headers({ "Content-Type: application/json" })
        @Post("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/frontDoors/{frontDoorName}/purge")
        @ExpectedResponses({ 200, 202 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Flux<ByteBuffer>>> purgeContent(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("frontDoorName") String frontDoorName,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") PurgeParameters contentFilePaths, @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Removes a content from Front Door.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @param contentFilePaths The path to the content to be purged. Path can be a full URL, e.g. '/pictures/city.png'
     * which removes a single file, or a directory with a wildcard, e.g. '/pictures/*' which removes all folders and
     * files in the directory.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> purgeContentWithResponseAsync(String resourceGroupName,
        String frontDoorName, PurgeParameters contentFilePaths) {
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
        if (frontDoorName == null) {
            return Mono.error(new IllegalArgumentException("Parameter frontDoorName is required and cannot be null."));
        }
        if (contentFilePaths == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter contentFilePaths is required and cannot be null."));
        } else {
            contentFilePaths.validate();
        }
        final String apiVersion = "2021-06-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.purgeContent(this.client.getEndpoint(), this.client.getSubscriptionId(),
                resourceGroupName, frontDoorName, apiVersion, contentFilePaths, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Removes a content from Front Door.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @param contentFilePaths The path to the content to be purged. Path can be a full URL, e.g. '/pictures/city.png'
     * which removes a single file, or a directory with a wildcard, e.g. '/pictures/*' which removes all folders and
     * files in the directory.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> purgeContentWithResponseAsync(String resourceGroupName,
        String frontDoorName, PurgeParameters contentFilePaths, Context context) {
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
        if (frontDoorName == null) {
            return Mono.error(new IllegalArgumentException("Parameter frontDoorName is required and cannot be null."));
        }
        if (contentFilePaths == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter contentFilePaths is required and cannot be null."));
        } else {
            contentFilePaths.validate();
        }
        final String apiVersion = "2021-06-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.purgeContent(this.client.getEndpoint(), this.client.getSubscriptionId(), resourceGroupName,
            frontDoorName, apiVersion, contentFilePaths, accept, context);
    }

    /**
     * Removes a content from Front Door.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @param contentFilePaths The path to the content to be purged. Path can be a full URL, e.g. '/pictures/city.png'
     * which removes a single file, or a directory with a wildcard, e.g. '/pictures/*' which removes all folders and
     * files in the directory.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    private PollerFlux<PollResult<Void>, Void> beginPurgeContentAsync(String resourceGroupName, String frontDoorName,
        PurgeParameters contentFilePaths) {
        Mono<Response<Flux<ByteBuffer>>> mono
            = purgeContentWithResponseAsync(resourceGroupName, frontDoorName, contentFilePaths);
        return this.client.<Void, Void>getLroResult(mono, this.client.getHttpPipeline(), Void.class, Void.class,
            this.client.getContext());
    }

    /**
     * Removes a content from Front Door.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @param contentFilePaths The path to the content to be purged. Path can be a full URL, e.g. '/pictures/city.png'
     * which removes a single file, or a directory with a wildcard, e.g. '/pictures/*' which removes all folders and
     * files in the directory.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    private PollerFlux<PollResult<Void>, Void> beginPurgeContentAsync(String resourceGroupName, String frontDoorName,
        PurgeParameters contentFilePaths, Context context) {
        context = this.client.mergeContext(context);
        Mono<Response<Flux<ByteBuffer>>> mono
            = purgeContentWithResponseAsync(resourceGroupName, frontDoorName, contentFilePaths, context);
        return this.client.<Void, Void>getLroResult(mono, this.client.getHttpPipeline(), Void.class, Void.class,
            context);
    }

    /**
     * Removes a content from Front Door.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @param contentFilePaths The path to the content to be purged. Path can be a full URL, e.g. '/pictures/city.png'
     * which removes a single file, or a directory with a wildcard, e.g. '/pictures/*' which removes all folders and
     * files in the directory.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<PollResult<Void>, Void> beginPurgeContent(String resourceGroupName, String frontDoorName,
        PurgeParameters contentFilePaths) {
        return this.beginPurgeContentAsync(resourceGroupName, frontDoorName, contentFilePaths).getSyncPoller();
    }

    /**
     * Removes a content from Front Door.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @param contentFilePaths The path to the content to be purged. Path can be a full URL, e.g. '/pictures/city.png'
     * which removes a single file, or a directory with a wildcard, e.g. '/pictures/*' which removes all folders and
     * files in the directory.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<PollResult<Void>, Void> beginPurgeContent(String resourceGroupName, String frontDoorName,
        PurgeParameters contentFilePaths, Context context) {
        return this.beginPurgeContentAsync(resourceGroupName, frontDoorName, contentFilePaths, context).getSyncPoller();
    }

    /**
     * Removes a content from Front Door.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @param contentFilePaths The path to the content to be purged. Path can be a full URL, e.g. '/pictures/city.png'
     * which removes a single file, or a directory with a wildcard, e.g. '/pictures/*' which removes all folders and
     * files in the directory.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> purgeContentAsync(String resourceGroupName, String frontDoorName,
        PurgeParameters contentFilePaths) {
        return beginPurgeContentAsync(resourceGroupName, frontDoorName, contentFilePaths).last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Removes a content from Front Door.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @param contentFilePaths The path to the content to be purged. Path can be a full URL, e.g. '/pictures/city.png'
     * which removes a single file, or a directory with a wildcard, e.g. '/pictures/*' which removes all folders and
     * files in the directory.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> purgeContentAsync(String resourceGroupName, String frontDoorName,
        PurgeParameters contentFilePaths, Context context) {
        return beginPurgeContentAsync(resourceGroupName, frontDoorName, contentFilePaths, context).last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Removes a content from Front Door.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @param contentFilePaths The path to the content to be purged. Path can be a full URL, e.g. '/pictures/city.png'
     * which removes a single file, or a directory with a wildcard, e.g. '/pictures/*' which removes all folders and
     * files in the directory.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void purgeContent(String resourceGroupName, String frontDoorName, PurgeParameters contentFilePaths) {
        purgeContentAsync(resourceGroupName, frontDoorName, contentFilePaths).block();
    }

    /**
     * Removes a content from Front Door.
     * 
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param frontDoorName Name of the Front Door which is globally unique.
     * @param contentFilePaths The path to the content to be purged. Path can be a full URL, e.g. '/pictures/city.png'
     * which removes a single file, or a directory with a wildcard, e.g. '/pictures/*' which removes all folders and
     * files in the directory.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void purgeContent(String resourceGroupName, String frontDoorName, PurgeParameters contentFilePaths,
        Context context) {
        purgeContentAsync(resourceGroupName, frontDoorName, contentFilePaths, context).block();
    }
}
