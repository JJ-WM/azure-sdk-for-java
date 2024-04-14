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
import com.azure.resourcemanager.security.fluent.DevOpsOperationResultsClient;
import com.azure.resourcemanager.security.fluent.models.OperationStatusResultInner;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in DevOpsOperationResultsClient.
 */
public final class DevOpsOperationResultsClientImpl implements DevOpsOperationResultsClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final DevOpsOperationResultsService service;

    /**
     * The service client containing this operation class.
     */
    private final SecurityCenterImpl client;

    /**
     * Initializes an instance of DevOpsOperationResultsClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    DevOpsOperationResultsClientImpl(SecurityCenterImpl client) {
        this.service = RestProxy.create(DevOpsOperationResultsService.class, client.getHttpPipeline(),
            client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SecurityCenterDevOpsOperationResults to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SecurityCenterDevOps")
    public interface DevOpsOperationResultsService {
        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Security/securityConnectors/{securityConnectorName}/devops/default/operationResults/{operationResultId}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<OperationStatusResultInner>> get(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("securityConnectorName") String securityConnectorName,
            @PathParam("operationResultId") String operationResultId, @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Get devops long running operation result.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param securityConnectorName The security connector name.
     * @param operationResultId The operation result Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return devops long running operation result along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<OperationStatusResultInner>> getWithResponseAsync(String resourceGroupName,
        String securityConnectorName, String operationResultId) {
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
        if (securityConnectorName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter securityConnectorName is required and cannot be null."));
        }
        if (operationResultId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter operationResultId is required and cannot be null."));
        }
        final String apiVersion = "2023-09-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.get(this.client.getEndpoint(), this.client.getSubscriptionId(),
                resourceGroupName, securityConnectorName, operationResultId, apiVersion, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get devops long running operation result.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param securityConnectorName The security connector name.
     * @param operationResultId The operation result Id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return devops long running operation result along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<OperationStatusResultInner>> getWithResponseAsync(String resourceGroupName,
        String securityConnectorName, String operationResultId, Context context) {
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
        if (securityConnectorName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter securityConnectorName is required and cannot be null."));
        }
        if (operationResultId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter operationResultId is required and cannot be null."));
        }
        final String apiVersion = "2023-09-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), this.client.getSubscriptionId(), resourceGroupName,
            securityConnectorName, operationResultId, apiVersion, accept, context);
    }

    /**
     * Get devops long running operation result.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param securityConnectorName The security connector name.
     * @param operationResultId The operation result Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return devops long running operation result on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<OperationStatusResultInner> getAsync(String resourceGroupName, String securityConnectorName,
        String operationResultId) {
        return getWithResponseAsync(resourceGroupName, securityConnectorName, operationResultId)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get devops long running operation result.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param securityConnectorName The security connector name.
     * @param operationResultId The operation result Id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return devops long running operation result along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<OperationStatusResultInner> getWithResponse(String resourceGroupName, String securityConnectorName,
        String operationResultId, Context context) {
        return getWithResponseAsync(resourceGroupName, securityConnectorName, operationResultId, context).block();
    }

    /**
     * Get devops long running operation result.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param securityConnectorName The security connector name.
     * @param operationResultId The operation result Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return devops long running operation result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public OperationStatusResultInner get(String resourceGroupName, String securityConnectorName,
        String operationResultId) {
        return getWithResponse(resourceGroupName, securityConnectorName, operationResultId, Context.NONE).getValue();
    }
}
