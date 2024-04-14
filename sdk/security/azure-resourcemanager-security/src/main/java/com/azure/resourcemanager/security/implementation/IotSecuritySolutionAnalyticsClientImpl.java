// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

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
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.security.fluent.IotSecuritySolutionAnalyticsClient;
import com.azure.resourcemanager.security.fluent.models.IoTSecuritySolutionAnalyticsModelInner;
import com.azure.resourcemanager.security.fluent.models.IoTSecuritySolutionAnalyticsModelListInner;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in IotSecuritySolutionAnalyticsClient.
 */
public final class IotSecuritySolutionAnalyticsClientImpl implements IotSecuritySolutionAnalyticsClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final IotSecuritySolutionAnalyticsService service;

    /**
     * The service client containing this operation class.
     */
    private final SecurityCenterImpl client;

    /**
     * Initializes an instance of IotSecuritySolutionAnalyticsClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    IotSecuritySolutionAnalyticsClientImpl(SecurityCenterImpl client) {
        this.service = RestProxy.create(IotSecuritySolutionAnalyticsService.class, client.getHttpPipeline(),
            client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SecurityCenterIotSecuritySolutionAnalytics to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SecurityCenterIotSec")
    public interface IotSecuritySolutionAnalyticsService {
        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Security/iotSecuritySolutions/{solutionName}/analyticsModels")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<IoTSecuritySolutionAnalyticsModelListInner>> list(@HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("solutionName") String solutionName,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Security/iotSecuritySolutions/{solutionName}/analyticsModels/default")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<IoTSecuritySolutionAnalyticsModelInner>> get(@HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("solutionName") String solutionName,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Use this method to get IoT security Analytics metrics in an array.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     * insensitive.
     * @param solutionName The name of the IoT Security solution.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Security analytics of your IoT Security solution along with {@link Response} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<IoTSecuritySolutionAnalyticsModelListInner>> listWithResponseAsync(String resourceGroupName,
        String solutionName) {
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
        if (solutionName == null) {
            return Mono.error(new IllegalArgumentException("Parameter solutionName is required and cannot be null."));
        }
        final String apiVersion = "2019-08-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.list(this.client.getEndpoint(), apiVersion, this.client.getSubscriptionId(),
                resourceGroupName, solutionName, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Use this method to get IoT security Analytics metrics in an array.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     * insensitive.
     * @param solutionName The name of the IoT Security solution.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Security analytics of your IoT Security solution along with {@link Response} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<IoTSecuritySolutionAnalyticsModelListInner>> listWithResponseAsync(String resourceGroupName,
        String solutionName, Context context) {
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
        if (solutionName == null) {
            return Mono.error(new IllegalArgumentException("Parameter solutionName is required and cannot be null."));
        }
        final String apiVersion = "2019-08-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.list(this.client.getEndpoint(), apiVersion, this.client.getSubscriptionId(), resourceGroupName,
            solutionName, accept, context);
    }

    /**
     * Use this method to get IoT security Analytics metrics in an array.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     * insensitive.
     * @param solutionName The name of the IoT Security solution.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Security analytics of your IoT Security solution on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<IoTSecuritySolutionAnalyticsModelListInner> listAsync(String resourceGroupName, String solutionName) {
        return listWithResponseAsync(resourceGroupName, solutionName).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Use this method to get IoT security Analytics metrics in an array.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     * insensitive.
     * @param solutionName The name of the IoT Security solution.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Security analytics of your IoT Security solution along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<IoTSecuritySolutionAnalyticsModelListInner> listWithResponse(String resourceGroupName,
        String solutionName, Context context) {
        return listWithResponseAsync(resourceGroupName, solutionName, context).block();
    }

    /**
     * Use this method to get IoT security Analytics metrics in an array.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     * insensitive.
     * @param solutionName The name of the IoT Security solution.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Security analytics of your IoT Security solution.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public IoTSecuritySolutionAnalyticsModelListInner list(String resourceGroupName, String solutionName) {
        return listWithResponse(resourceGroupName, solutionName, Context.NONE).getValue();
    }

    /**
     * Use this method to get IoT Security Analytics metrics.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     * insensitive.
     * @param solutionName The name of the IoT Security solution.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security analytics of your IoT Security solution along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<IoTSecuritySolutionAnalyticsModelInner>> getWithResponseAsync(String resourceGroupName,
        String solutionName) {
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
        if (solutionName == null) {
            return Mono.error(new IllegalArgumentException("Parameter solutionName is required and cannot be null."));
        }
        final String apiVersion = "2019-08-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.get(this.client.getEndpoint(), apiVersion, this.client.getSubscriptionId(),
                resourceGroupName, solutionName, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Use this method to get IoT Security Analytics metrics.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     * insensitive.
     * @param solutionName The name of the IoT Security solution.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security analytics of your IoT Security solution along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<IoTSecuritySolutionAnalyticsModelInner>> getWithResponseAsync(String resourceGroupName,
        String solutionName, Context context) {
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
        if (solutionName == null) {
            return Mono.error(new IllegalArgumentException("Parameter solutionName is required and cannot be null."));
        }
        final String apiVersion = "2019-08-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), apiVersion, this.client.getSubscriptionId(), resourceGroupName,
            solutionName, accept, context);
    }

    /**
     * Use this method to get IoT Security Analytics metrics.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     * insensitive.
     * @param solutionName The name of the IoT Security solution.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security analytics of your IoT Security solution on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<IoTSecuritySolutionAnalyticsModelInner> getAsync(String resourceGroupName, String solutionName) {
        return getWithResponseAsync(resourceGroupName, solutionName).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Use this method to get IoT Security Analytics metrics.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     * insensitive.
     * @param solutionName The name of the IoT Security solution.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security analytics of your IoT Security solution along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<IoTSecuritySolutionAnalyticsModelInner> getWithResponse(String resourceGroupName,
        String solutionName, Context context) {
        return getWithResponseAsync(resourceGroupName, solutionName, context).block();
    }

    /**
     * Use this method to get IoT Security Analytics metrics.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     * insensitive.
     * @param solutionName The name of the IoT Security solution.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security analytics of your IoT Security solution.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public IoTSecuritySolutionAnalyticsModelInner get(String resourceGroupName, String solutionName) {
        return getWithResponse(resourceGroupName, solutionName, Context.NONE).getValue();
    }
}
