// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.developer.devcenter.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.developer.devcenter.DevCenterServiceVersion;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import reactor.core.publisher.Mono;

/**
 * Initializes a new instance of the DevCenterClient type.
 */
public final class DevCenterClientImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final DevCenterClientService service;

    /**
     * The DevCenter-specific URI to operate on.
     */
    private final String endpoint;

    /**
     * Gets The DevCenter-specific URI to operate on.
     * 
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * Service version.
     */
    private final DevCenterServiceVersion serviceVersion;

    /**
     * Gets Service version.
     * 
     * @return the serviceVersion value.
     */
    public DevCenterServiceVersion getServiceVersion() {
        return this.serviceVersion;
    }

    /**
     * The HTTP pipeline to send requests through.
     */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     * 
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /**
     * The serializer to serialize an object into a string.
     */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     * 
     * @return the serializerAdapter value.
     */
    public SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /**
     * Initializes an instance of DevCenterClient client.
     * 
     * @param endpoint The DevCenter-specific URI to operate on.
     * @param serviceVersion Service version.
     */
    public DevCenterClientImpl(String endpoint, DevCenterServiceVersion serviceVersion) {
        this(new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy()).build(),
            JacksonAdapter.createDefaultSerializerAdapter(), endpoint, serviceVersion);
    }

    /**
     * Initializes an instance of DevCenterClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param endpoint The DevCenter-specific URI to operate on.
     * @param serviceVersion Service version.
     */
    public DevCenterClientImpl(HttpPipeline httpPipeline, String endpoint, DevCenterServiceVersion serviceVersion) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), endpoint, serviceVersion);
    }

    /**
     * Initializes an instance of DevCenterClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param endpoint The DevCenter-specific URI to operate on.
     * @param serviceVersion Service version.
     */
    public DevCenterClientImpl(HttpPipeline httpPipeline, SerializerAdapter serializerAdapter, String endpoint,
        DevCenterServiceVersion serviceVersion) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.endpoint = endpoint;
        this.serviceVersion = serviceVersion;
        this.service = RestProxy.create(DevCenterClientService.class, this.httpPipeline, this.getSerializerAdapter());
    }

    /**
     * The interface defining all the services for DevCenterClient to be used by the proxy service to perform REST
     * calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "DevCenterClient")
    public interface DevCenterClientService {
        @Get("/projects")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<BinaryData>> listProjects(@HostParam("endpoint") String endpoint,
            @QueryParam("api-version") String apiVersion, @HeaderParam("accept") String accept,
            RequestOptions requestOptions, Context context);

        @Get("/projects")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<BinaryData> listProjectsSync(@HostParam("endpoint") String endpoint,
            @QueryParam("api-version") String apiVersion, @HeaderParam("accept") String accept,
            RequestOptions requestOptions, Context context);

        @Get("/projects/{projectName}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<BinaryData>> getProject(@HostParam("endpoint") String endpoint,
            @QueryParam("api-version") String apiVersion, @PathParam("projectName") String projectName,
            @HeaderParam("accept") String accept, RequestOptions requestOptions, Context context);

        @Get("/projects/{projectName}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<BinaryData> getProjectSync(@HostParam("endpoint") String endpoint,
            @QueryParam("api-version") String apiVersion, @PathParam("projectName") String projectName,
            @HeaderParam("accept") String accept, RequestOptions requestOptions, Context context);

        @Get("{nextLink}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<BinaryData>> listProjectsNext(@PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("endpoint") String endpoint, @HeaderParam("accept") String accept, RequestOptions requestOptions,
            Context context);

        @Get("{nextLink}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<BinaryData> listProjectsNextSync(@PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("endpoint") String endpoint, @HeaderParam("accept") String accept, RequestOptions requestOptions,
            Context context);
    }

    /**
     * Lists all projects.
     * <p><strong>Query Parameters</strong></p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>filter</td><td>String</td><td>No</td><td>An OData filter clause to apply to the operation.</td></tr>
     * <tr><td>top</td><td>Integer</td><td>No</td><td>The maximum number of resources to return from the operation.
     * Example: 'top=10'.</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     name: String (Required)
     *     description: String (Optional)
     *     maxDevBoxesPerUser: Integer (Optional)
     * }
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return results of the project list operation along with {@link PagedResponse} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<BinaryData>> listProjectsSinglePageAsync(RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listProjects(this.getEndpoint(), this.getServiceVersion().getVersion(),
                accept, requestOptions, context))
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                getValues(res.getValue(), "value"), getNextLink(res.getValue(), "nextLink"), null));
    }

    /**
     * Lists all projects.
     * <p><strong>Query Parameters</strong></p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>filter</td><td>String</td><td>No</td><td>An OData filter clause to apply to the operation.</td></tr>
     * <tr><td>top</td><td>Integer</td><td>No</td><td>The maximum number of resources to return from the operation.
     * Example: 'top=10'.</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     name: String (Required)
     *     description: String (Optional)
     *     maxDevBoxesPerUser: Integer (Optional)
     * }
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return results of the project list operation as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> listProjectsAsync(RequestOptions requestOptions) {
        RequestOptions requestOptionsForNextPage = new RequestOptions();
        requestOptionsForNextPage.setContext(
            requestOptions != null && requestOptions.getContext() != null ? requestOptions.getContext() : Context.NONE);
        return new PagedFlux<>(() -> listProjectsSinglePageAsync(requestOptions),
            nextLink -> listProjectsNextSinglePageAsync(nextLink, requestOptionsForNextPage));
    }

    /**
     * Lists all projects.
     * <p><strong>Query Parameters</strong></p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>filter</td><td>String</td><td>No</td><td>An OData filter clause to apply to the operation.</td></tr>
     * <tr><td>top</td><td>Integer</td><td>No</td><td>The maximum number of resources to return from the operation.
     * Example: 'top=10'.</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     name: String (Required)
     *     description: String (Optional)
     *     maxDevBoxesPerUser: Integer (Optional)
     * }
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return results of the project list operation along with {@link PagedResponse}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private PagedResponse<BinaryData> listProjectsSinglePage(RequestOptions requestOptions) {
        final String accept = "application/json";
        Response<BinaryData> res = service.listProjectsSync(this.getEndpoint(), this.getServiceVersion().getVersion(),
            accept, requestOptions, Context.NONE);
        return new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
            getValues(res.getValue(), "value"), getNextLink(res.getValue(), "nextLink"), null);
    }

    /**
     * Lists all projects.
     * <p><strong>Query Parameters</strong></p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>filter</td><td>String</td><td>No</td><td>An OData filter clause to apply to the operation.</td></tr>
     * <tr><td>top</td><td>Integer</td><td>No</td><td>The maximum number of resources to return from the operation.
     * Example: 'top=10'.</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     name: String (Required)
     *     description: String (Optional)
     *     maxDevBoxesPerUser: Integer (Optional)
     * }
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return results of the project list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> listProjects(RequestOptions requestOptions) {
        RequestOptions requestOptionsForNextPage = new RequestOptions();
        requestOptionsForNextPage.setContext(
            requestOptions != null && requestOptions.getContext() != null ? requestOptions.getContext() : Context.NONE);
        return new PagedIterable<>(() -> listProjectsSinglePage(requestOptions),
            nextLink -> listProjectsNextSinglePage(nextLink, requestOptionsForNextPage));
    }

    /**
     * Gets a project.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     name: String (Required)
     *     description: String (Optional)
     *     maxDevBoxesPerUser: Integer (Optional)
     * }
     * }</pre>
     * 
     * @param projectName The DevCenter Project upon which to execute operations.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a project along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getProjectWithResponseAsync(String projectName, RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.getProject(this.getEndpoint(),
            this.getServiceVersion().getVersion(), projectName, accept, requestOptions, context));
    }

    /**
     * Gets a project.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     name: String (Required)
     *     description: String (Optional)
     *     maxDevBoxesPerUser: Integer (Optional)
     * }
     * }</pre>
     * 
     * @param projectName The DevCenter Project upon which to execute operations.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a project along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getProjectWithResponse(String projectName, RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.getProjectSync(this.getEndpoint(), this.getServiceVersion().getVersion(), projectName, accept,
            requestOptions, Context.NONE);
    }

    /**
     * Get the next page of items.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     name: String (Required)
     *     description: String (Optional)
     *     maxDevBoxesPerUser: Integer (Optional)
     * }
     * }</pre>
     * 
     * @param nextLink The URL to get the next list of items
     * 
     * The nextLink parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return results of the project list operation along with {@link PagedResponse} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<BinaryData>> listProjectsNextSinglePageAsync(String nextLink,
        RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context -> service.listProjectsNext(nextLink, this.getEndpoint(), accept, requestOptions, context))
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                getValues(res.getValue(), "value"), getNextLink(res.getValue(), "nextLink"), null));
    }

    /**
     * Get the next page of items.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     name: String (Required)
     *     description: String (Optional)
     *     maxDevBoxesPerUser: Integer (Optional)
     * }
     * }</pre>
     * 
     * @param nextLink The URL to get the next list of items
     * 
     * The nextLink parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return results of the project list operation along with {@link PagedResponse}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private PagedResponse<BinaryData> listProjectsNextSinglePage(String nextLink, RequestOptions requestOptions) {
        final String accept = "application/json";
        Response<BinaryData> res
            = service.listProjectsNextSync(nextLink, this.getEndpoint(), accept, requestOptions, Context.NONE);
        return new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
            getValues(res.getValue(), "value"), getNextLink(res.getValue(), "nextLink"), null);
    }

    private List<BinaryData> getValues(BinaryData binaryData, String path) {
        try {
            Map<?, ?> obj = binaryData.toObject(Map.class);
            List<?> values = (List<?>) obj.get(path);
            return values.stream().map(BinaryData::fromObject).collect(Collectors.toList());
        } catch (RuntimeException e) {
            return null;
        }
    }

    private String getNextLink(BinaryData binaryData, String path) {
        try {
            Map<?, ?> obj = binaryData.toObject(Map.class);
            return (String) obj.get(path);
        } catch (RuntimeException e) {
            return null;
        }
    }
}
