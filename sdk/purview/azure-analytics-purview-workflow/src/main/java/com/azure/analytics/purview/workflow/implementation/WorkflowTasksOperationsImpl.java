// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.workflow.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in WorkflowTasksOperations. */
public final class WorkflowTasksOperationsImpl {
    /** The proxy service used to perform REST calls. */
    private final WorkflowTasksService service;

    /** The service client containing this operation class. */
    private final PurviewWorkflowClientImpl client;

    /**
     * Initializes an instance of WorkflowTasksOperationsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    WorkflowTasksOperationsImpl(PurviewWorkflowClientImpl client) {
        this.service =
                RestProxy.create(WorkflowTasksService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for PurviewWorkflowWorkflowTasksOperations to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{endpoint}/workflow")
    @ServiceInterface(name = "PurviewWorkflowWorkf")
    public interface WorkflowTasksService {
        @Get("/workflowtasks/{taskId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = ClientAuthenticationException.class,
                code = {401})
        @UnexpectedResponseExceptionType(
                value = ResourceNotFoundException.class,
                code = {404})
        @UnexpectedResponseExceptionType(
                value = ResourceModifiedException.class,
                code = {409})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<BinaryData>> get(
                @HostParam("endpoint") String endpoint,
                @PathParam("taskId") String taskId,
                @HeaderParam("Accept") String accept,
                RequestOptions requestOptions,
                Context context);

        @Get("/workflowtasks/{taskId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = ClientAuthenticationException.class,
                code = {401})
        @UnexpectedResponseExceptionType(
                value = ResourceNotFoundException.class,
                code = {404})
        @UnexpectedResponseExceptionType(
                value = ResourceModifiedException.class,
                code = {409})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<BinaryData> getSync(
                @HostParam("endpoint") String endpoint,
                @PathParam("taskId") String taskId,
                @HeaderParam("Accept") String accept,
                RequestOptions requestOptions,
                Context context);

        @Post("/workflowtasks/{taskId}/reassign")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = ClientAuthenticationException.class,
                code = {401})
        @UnexpectedResponseExceptionType(
                value = ResourceNotFoundException.class,
                code = {404})
        @UnexpectedResponseExceptionType(
                value = ResourceModifiedException.class,
                code = {409})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> reassign(
                @HostParam("endpoint") String endpoint,
                @PathParam("taskId") String taskId,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") BinaryData reassignCommand,
                @HeaderParam("Accept") String accept,
                RequestOptions requestOptions,
                Context context);

        @Post("/workflowtasks/{taskId}/reassign")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = ClientAuthenticationException.class,
                code = {401})
        @UnexpectedResponseExceptionType(
                value = ResourceNotFoundException.class,
                code = {404})
        @UnexpectedResponseExceptionType(
                value = ResourceModifiedException.class,
                code = {409})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<Void> reassignSync(
                @HostParam("endpoint") String endpoint,
                @PathParam("taskId") String taskId,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") BinaryData reassignCommand,
                @HeaderParam("Accept") String accept,
                RequestOptions requestOptions,
                Context context);
    }

    /**
     * Get a workflow task.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Required)
     *     title: String (Optional)
     *     workflowRunId: String (Required)
     *     workflowId: String (Required)
     *     requestor: String (Required)
     *     createdTime: OffsetDateTime (Required)
     *     lastUpdateTime: OffsetDateTime (Required)
     *     payload (Required): {
     *         type: String(CreateTerm/UpdateTerm/DeleteTerm/ImportTerms/UpdateAsset/GrantDataAccess) (Required)
     *         targetValue: String (Required)
     *         payload: Object (Optional)
     *     }
     *     reminderInfo (Optional): {
     *         lastRemindTime: OffsetDateTime (Optional)
     *         nextRemindTime: OffsetDateTime (Required)
     *         reminderSettings: Object (Required)
     *     }
     *     expiryInfo (Optional): {
     *         lastExpiryNotificationTime: OffsetDateTime (Optional)
     *         nextExpiryNotificationTime: OffsetDateTime (Required)
     *         expiryTime: OffsetDateTime (Required)
     *         expirySettings (Required): {
     *             expireAfter: Object (Required)
     *             notifyOnExpiration (Optional): [
     *                 String (Optional)
     *             ]
     *         }
     *     }
     * }
     * }</pre>
     *
     * @param taskId The task id.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a workflow task along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getWithResponseAsync(String taskId, RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context -> service.get(this.client.getEndpoint(), taskId, accept, requestOptions, context));
    }

    /**
     * Get a workflow task.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Required)
     *     title: String (Optional)
     *     workflowRunId: String (Required)
     *     workflowId: String (Required)
     *     requestor: String (Required)
     *     createdTime: OffsetDateTime (Required)
     *     lastUpdateTime: OffsetDateTime (Required)
     *     payload (Required): {
     *         type: String(CreateTerm/UpdateTerm/DeleteTerm/ImportTerms/UpdateAsset/GrantDataAccess) (Required)
     *         targetValue: String (Required)
     *         payload: Object (Optional)
     *     }
     *     reminderInfo (Optional): {
     *         lastRemindTime: OffsetDateTime (Optional)
     *         nextRemindTime: OffsetDateTime (Required)
     *         reminderSettings: Object (Required)
     *     }
     *     expiryInfo (Optional): {
     *         lastExpiryNotificationTime: OffsetDateTime (Optional)
     *         nextExpiryNotificationTime: OffsetDateTime (Required)
     *         expiryTime: OffsetDateTime (Required)
     *         expirySettings (Required): {
     *             expireAfter: Object (Required)
     *             notifyOnExpiration (Optional): [
     *                 String (Optional)
     *             ]
     *         }
     *     }
     * }
     * }</pre>
     *
     * @param taskId The task id.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a workflow task along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getWithResponse(String taskId, RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.getSync(this.client.getEndpoint(), taskId, accept, requestOptions, Context.NONE);
    }

    /**
     * Reassign a workflow task.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     reassignments (Optional): [
     *          (Optional){
     *             reassignFrom: String (Required)
     *             reassignTo: String (Required)
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param taskId The task id.
     * @param reassignCommand The request body of reassigning a workflow task.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> reassignWithResponseAsync(
            String taskId, BinaryData reassignCommand, RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context ->
                        service.reassign(
                                this.client.getEndpoint(),
                                taskId,
                                this.client.getServiceVersion().getVersion(),
                                reassignCommand,
                                accept,
                                requestOptions,
                                context));
    }

    /**
     * Reassign a workflow task.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     reassignments (Optional): [
     *          (Optional){
     *             reassignFrom: String (Required)
     *             reassignTo: String (Required)
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param taskId The task id.
     * @param reassignCommand The request body of reassigning a workflow task.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> reassignWithResponse(
            String taskId, BinaryData reassignCommand, RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.reassignSync(
                this.client.getEndpoint(),
                taskId,
                this.client.getServiceVersion().getVersion(),
                reassignCommand,
                accept,
                requestOptions,
                Context.NONE);
    }
}
