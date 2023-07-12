// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.catalog.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
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

/** An instance of this class provides access to all the operations defined in Discoveries. */
public final class DiscoveriesImpl {
    /** The proxy service used to perform REST calls. */
    private final DiscoveriesService service;

    /** The service client containing this operation class. */
    private final PurviewCatalogClientImpl client;

    /**
     * Initializes an instance of DiscoveriesImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    DiscoveriesImpl(PurviewCatalogClientImpl client) {
        this.service =
                RestProxy.create(DiscoveriesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for PurviewCatalogClientDiscoveries to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{Endpoint}/catalog/api")
    @ServiceInterface(name = "PurviewCatalogClient")
    public interface DiscoveriesService {
        @Post("/search/query")
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
        Mono<Response<BinaryData>> query(
                @HostParam("Endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") BinaryData searchRequest,
                @HeaderParam("Accept") String accept,
                RequestOptions requestOptions,
                Context context);

        @Post("/search/query")
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
        Response<BinaryData> querySync(
                @HostParam("Endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") BinaryData searchRequest,
                @HeaderParam("Accept") String accept,
                RequestOptions requestOptions,
                Context context);

        @Post("/search/suggest")
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
        Mono<Response<BinaryData>> suggest(
                @HostParam("Endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") BinaryData suggestRequest,
                @HeaderParam("Accept") String accept,
                RequestOptions requestOptions,
                Context context);

        @Post("/search/suggest")
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
        Response<BinaryData> suggestSync(
                @HostParam("Endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") BinaryData suggestRequest,
                @HeaderParam("Accept") String accept,
                RequestOptions requestOptions,
                Context context);

        @Post("/browse")
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
        Mono<Response<BinaryData>> browse(
                @HostParam("Endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") BinaryData browseRequest,
                @HeaderParam("Accept") String accept,
                RequestOptions requestOptions,
                Context context);

        @Post("/browse")
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
        Response<BinaryData> browseSync(
                @HostParam("Endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") BinaryData browseRequest,
                @HeaderParam("Accept") String accept,
                RequestOptions requestOptions,
                Context context);

        @Post("/search/autocomplete")
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
        Mono<Response<BinaryData>> autoComplete(
                @HostParam("Endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") BinaryData autoCompleteRequest,
                @HeaderParam("Accept") String accept,
                RequestOptions requestOptions,
                Context context);

        @Post("/search/autocomplete")
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
        Response<BinaryData> autoCompleteSync(
                @HostParam("Endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") BinaryData autoCompleteRequest,
                @HeaderParam("Accept") String accept,
                RequestOptions requestOptions,
                Context context);
    }

    /**
     * Gets data using search.
     * <p><strong>Request Body Schema</strong></p>
     * <pre>{@code
     * {
     *     keywords: String (Optional)
     *     offset: Integer (Optional)
     *     limit: Integer (Optional)
     *     filter: Object (Optional)
     *     facets (Optional): [
     *          (Optional){
     *             count: Integer (Optional)
     *             facet: String (Optional)
     *             sort: Object (Optional)
     *         }
     *     ]
     *     taxonomySetting (Optional): {
     *         assetTypes (Optional): [
     *             String (Optional)
     *         ]
     *         facet (Optional): (recursive schema, see facet above)
     *     }
     * }
     * }</pre>
     * <p><strong>Response Body Schema</strong></p>
     * <pre>{@code
     * {
     *     @search.count: Integer (Optional)
     *     @search.facets (Optional): {
     *         assetType (Optional): [
     *              (Optional){
     *                 count: Integer (Optional)
     *                 value: String (Optional)
     *             }
     *         ]
     *         classification (Optional): [
     *             (recursive schema, see above)
     *         ]
     *         classificationCategory (Optional): [
     *             (recursive schema, see above)
     *         ]
     *         contactId (Optional): [
     *             (recursive schema, see above)
     *         ]
     *         fileExtension (Optional): [
     *             (recursive schema, see above)
     *         ]
     *         label (Optional): [
     *             (recursive schema, see above)
     *         ]
     *         term (Optional): [
     *             (recursive schema, see above)
     *         ]
     *     }
     *     value (Optional): [
     *          (Optional){
     *             @search.score: Float (Optional)
     *             @search.highlights (Optional): {
     *                 id (Optional): [
     *                     String (Optional)
     *                 ]
     *                 qualifiedName (Optional): [
     *                     String (Optional)
     *                 ]
     *                 name (Optional): [
     *                     String (Optional)
     *                 ]
     *                 description (Optional): [
     *                     String (Optional)
     *                 ]
     *                 entityType (Optional): [
     *                     String (Optional)
     *                 ]
     *             }
     *             @search.text: String (Optional)
     *             description: String (Optional)
     *             id: String (Optional)
     *             name: String (Optional)
     *             owner: String (Optional)
     *             qualifiedName: String (Optional)
     *             entityType: String (Optional)
     *             classification (Optional): [
     *                 String (Optional)
     *             ]
     *             label (Optional): [
     *                 String (Optional)
     *             ]
     *             term (Optional): [
     *                  (Optional){
     *                     name: String (Optional)
     *                     glossaryName: String (Optional)
     *                     guid: String (Optional)
     *                 }
     *             ]
     *             contact (Optional): [
     *                  (Optional){
     *                     id: String (Optional)
     *                     info: String (Optional)
     *                     contactType: String (Optional)
     *                 }
     *             ]
     *             assetType (Optional): [
     *                 String (Optional)
     *             ]
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param searchRequest An object specifying the search criteria.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return data using search along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> queryWithResponseAsync(BinaryData searchRequest, RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context ->
                        service.query(
                                this.client.getEndpoint(),
                                this.client.getServiceVersion().getVersion(),
                                searchRequest,
                                accept,
                                requestOptions,
                                context));
    }

    /**
     * Gets data using search.
     * <p><strong>Request Body Schema</strong></p>
     * <pre>{@code
     * {
     *     keywords: String (Optional)
     *     offset: Integer (Optional)
     *     limit: Integer (Optional)
     *     filter: Object (Optional)
     *     facets (Optional): [
     *          (Optional){
     *             count: Integer (Optional)
     *             facet: String (Optional)
     *             sort: Object (Optional)
     *         }
     *     ]
     *     taxonomySetting (Optional): {
     *         assetTypes (Optional): [
     *             String (Optional)
     *         ]
     *         facet (Optional): (recursive schema, see facet above)
     *     }
     * }
     * }</pre>
     * <p><strong>Response Body Schema</strong></p>
     * <pre>{@code
     * {
     *     @search.count: Integer (Optional)
     *     @search.facets (Optional): {
     *         assetType (Optional): [
     *              (Optional){
     *                 count: Integer (Optional)
     *                 value: String (Optional)
     *             }
     *         ]
     *         classification (Optional): [
     *             (recursive schema, see above)
     *         ]
     *         classificationCategory (Optional): [
     *             (recursive schema, see above)
     *         ]
     *         contactId (Optional): [
     *             (recursive schema, see above)
     *         ]
     *         fileExtension (Optional): [
     *             (recursive schema, see above)
     *         ]
     *         label (Optional): [
     *             (recursive schema, see above)
     *         ]
     *         term (Optional): [
     *             (recursive schema, see above)
     *         ]
     *     }
     *     value (Optional): [
     *          (Optional){
     *             @search.score: Float (Optional)
     *             @search.highlights (Optional): {
     *                 id (Optional): [
     *                     String (Optional)
     *                 ]
     *                 qualifiedName (Optional): [
     *                     String (Optional)
     *                 ]
     *                 name (Optional): [
     *                     String (Optional)
     *                 ]
     *                 description (Optional): [
     *                     String (Optional)
     *                 ]
     *                 entityType (Optional): [
     *                     String (Optional)
     *                 ]
     *             }
     *             @search.text: String (Optional)
     *             description: String (Optional)
     *             id: String (Optional)
     *             name: String (Optional)
     *             owner: String (Optional)
     *             qualifiedName: String (Optional)
     *             entityType: String (Optional)
     *             classification (Optional): [
     *                 String (Optional)
     *             ]
     *             label (Optional): [
     *                 String (Optional)
     *             ]
     *             term (Optional): [
     *                  (Optional){
     *                     name: String (Optional)
     *                     glossaryName: String (Optional)
     *                     guid: String (Optional)
     *                 }
     *             ]
     *             contact (Optional): [
     *                  (Optional){
     *                     id: String (Optional)
     *                     info: String (Optional)
     *                     contactType: String (Optional)
     *                 }
     *             ]
     *             assetType (Optional): [
     *                 String (Optional)
     *             ]
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param searchRequest An object specifying the search criteria.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return data using search along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> queryWithResponse(BinaryData searchRequest, RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.querySync(
                this.client.getEndpoint(),
                this.client.getServiceVersion().getVersion(),
                searchRequest,
                accept,
                requestOptions,
                Context.NONE);
    }

    /**
     * Get search suggestions by query criteria.
     * <p><strong>Request Body Schema</strong></p>
     * <pre>{@code
     * {
     *     keywords: String (Optional)
     *     limit: Integer (Optional)
     *     filter: Object (Optional)
     * }
     * }</pre>
     * <p><strong>Response Body Schema</strong></p>
     * <pre>{@code
     * {
     *     value (Optional): [
     *          (Optional){
     *             @search.score: Float (Optional)
     *             @search.text: String (Optional)
     *             description: String (Optional)
     *             id: String (Optional)
     *             name: String (Optional)
     *             owner: String (Optional)
     *             qualifiedName: String (Optional)
     *             entityType: String (Optional)
     *             classification (Optional): [
     *                 String (Optional)
     *             ]
     *             label (Optional): [
     *                 String (Optional)
     *             ]
     *             term (Optional): [
     *                  (Optional){
     *                     name: String (Optional)
     *                     glossaryName: String (Optional)
     *                     guid: String (Optional)
     *                 }
     *             ]
     *             contact (Optional): [
     *                  (Optional){
     *                     id: String (Optional)
     *                     info: String (Optional)
     *                     contactType: String (Optional)
     *                 }
     *             ]
     *             assetType (Optional): [
     *                 String (Optional)
     *             ]
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param suggestRequest An object specifying the suggest criteria.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return search suggestions by query criteria along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> suggestWithResponseAsync(
            BinaryData suggestRequest, RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context ->
                        service.suggest(
                                this.client.getEndpoint(),
                                this.client.getServiceVersion().getVersion(),
                                suggestRequest,
                                accept,
                                requestOptions,
                                context));
    }

    /**
     * Get search suggestions by query criteria.
     * <p><strong>Request Body Schema</strong></p>
     * <pre>{@code
     * {
     *     keywords: String (Optional)
     *     limit: Integer (Optional)
     *     filter: Object (Optional)
     * }
     * }</pre>
     * <p><strong>Response Body Schema</strong></p>
     * <pre>{@code
     * {
     *     value (Optional): [
     *          (Optional){
     *             @search.score: Float (Optional)
     *             @search.text: String (Optional)
     *             description: String (Optional)
     *             id: String (Optional)
     *             name: String (Optional)
     *             owner: String (Optional)
     *             qualifiedName: String (Optional)
     *             entityType: String (Optional)
     *             classification (Optional): [
     *                 String (Optional)
     *             ]
     *             label (Optional): [
     *                 String (Optional)
     *             ]
     *             term (Optional): [
     *                  (Optional){
     *                     name: String (Optional)
     *                     glossaryName: String (Optional)
     *                     guid: String (Optional)
     *                 }
     *             ]
     *             contact (Optional): [
     *                  (Optional){
     *                     id: String (Optional)
     *                     info: String (Optional)
     *                     contactType: String (Optional)
     *                 }
     *             ]
     *             assetType (Optional): [
     *                 String (Optional)
     *             ]
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param suggestRequest An object specifying the suggest criteria.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return search suggestions by query criteria along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> suggestWithResponse(BinaryData suggestRequest, RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.suggestSync(
                this.client.getEndpoint(),
                this.client.getServiceVersion().getVersion(),
                suggestRequest,
                accept,
                requestOptions,
                Context.NONE);
    }

    /**
     * Browse entities by path or entity type.
     * <p><strong>Request Body Schema</strong></p>
     * <pre>{@code
     * {
     *     entityType: String (Optional)
     *     path: String (Optional)
     *     limit: Integer (Optional)
     *     offset: Integer (Optional)
     * }
     * }</pre>
     * <p><strong>Response Body Schema</strong></p>
     * <pre>{@code
     * {
     *     @search.count: Integer (Optional)
     *     value (Optional): [
     *          (Optional){
     *             entityType: String (Optional)
     *             id: String (Optional)
     *             isLeaf: Boolean (Optional)
     *             name: String (Optional)
     *             owner (Optional): [
     *                  (Optional){
     *                     id: String (Optional)
     *                     displayName: String (Optional)
     *                     mail: String (Optional)
     *                     contactType: String (Optional)
     *                 }
     *             ]
     *             path: String (Optional)
     *             qualifiedName: String (Optional)
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param browseRequest An object specifying the browse criteria.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return browseResult along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> browseWithResponseAsync(BinaryData browseRequest, RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context ->
                        service.browse(
                                this.client.getEndpoint(),
                                this.client.getServiceVersion().getVersion(),
                                browseRequest,
                                accept,
                                requestOptions,
                                context));
    }

    /**
     * Browse entities by path or entity type.
     * <p><strong>Request Body Schema</strong></p>
     * <pre>{@code
     * {
     *     entityType: String (Optional)
     *     path: String (Optional)
     *     limit: Integer (Optional)
     *     offset: Integer (Optional)
     * }
     * }</pre>
     * <p><strong>Response Body Schema</strong></p>
     * <pre>{@code
     * {
     *     @search.count: Integer (Optional)
     *     value (Optional): [
     *          (Optional){
     *             entityType: String (Optional)
     *             id: String (Optional)
     *             isLeaf: Boolean (Optional)
     *             name: String (Optional)
     *             owner (Optional): [
     *                  (Optional){
     *                     id: String (Optional)
     *                     displayName: String (Optional)
     *                     mail: String (Optional)
     *                     contactType: String (Optional)
     *                 }
     *             ]
     *             path: String (Optional)
     *             qualifiedName: String (Optional)
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param browseRequest An object specifying the browse criteria.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return browseResult along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> browseWithResponse(BinaryData browseRequest, RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.browseSync(
                this.client.getEndpoint(),
                this.client.getServiceVersion().getVersion(),
                browseRequest,
                accept,
                requestOptions,
                Context.NONE);
    }

    /**
     * Get auto complete options.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     keywords: String (Optional)
     *     limit: Integer (Optional)
     *     filter: Object (Optional)
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value (Optional): [
     *          (Optional){
     *             text: String (Optional)
     *             queryPlusText: String (Optional)
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param autoCompleteRequest An object specifying the autocomplete criteria.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return auto complete options along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> autoCompleteWithResponseAsync(
            BinaryData autoCompleteRequest, RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context ->
                        service.autoComplete(
                                this.client.getEndpoint(),
                                this.client.getServiceVersion().getVersion(),
                                autoCompleteRequest,
                                accept,
                                requestOptions,
                                context));
    }

    /**
     * Get auto complete options.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     keywords: String (Optional)
     *     limit: Integer (Optional)
     *     filter: Object (Optional)
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value (Optional): [
     *          (Optional){
     *             text: String (Optional)
     *             queryPlusText: String (Optional)
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param autoCompleteRequest An object specifying the autocomplete criteria.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return auto complete options along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> autoCompleteWithResponse(
            BinaryData autoCompleteRequest, RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.autoCompleteSync(
                this.client.getEndpoint(),
                this.client.getServiceVersion().getVersion(),
                autoCompleteRequest,
                accept,
                requestOptions,
                Context.NONE);
    }
}
