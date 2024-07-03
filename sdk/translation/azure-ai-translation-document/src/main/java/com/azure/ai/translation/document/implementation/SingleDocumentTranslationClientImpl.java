// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.translation.document.implementation;

import com.azure.ai.translation.document.DocumentTranslationServiceVersion;
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
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;
import reactor.core.publisher.Mono;

/**
 * Initializes a new instance of the SingleDocumentTranslationClient type.
 */
public final class SingleDocumentTranslationClientImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final SingleDocumentTranslationClientService service;

    /**
     * Supported document Translation endpoint, protocol and hostname, for example:
     * https://{TranslatorResourceName}.cognitiveservices.azure.com/translator.
     */
    private final String endpoint;

    /**
     * Gets Supported document Translation endpoint, protocol and hostname, for example:
     * https://{TranslatorResourceName}.cognitiveservices.azure.com/translator.
     * 
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * Service version.
     */
    private final DocumentTranslationServiceVersion serviceVersion;

    /**
     * Gets Service version.
     * 
     * @return the serviceVersion value.
     */
    public DocumentTranslationServiceVersion getServiceVersion() {
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
     * Initializes an instance of SingleDocumentTranslationClient client.
     * 
     * @param endpoint Supported document Translation endpoint, protocol and hostname, for example:
     * https://{TranslatorResourceName}.cognitiveservices.azure.com/translator.
     * @param serviceVersion Service version.
     */
    public SingleDocumentTranslationClientImpl(String endpoint, DocumentTranslationServiceVersion serviceVersion) {
        this(new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy()).build(),
            JacksonAdapter.createDefaultSerializerAdapter(), endpoint, serviceVersion);
    }

    /**
     * Initializes an instance of SingleDocumentTranslationClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param endpoint Supported document Translation endpoint, protocol and hostname, for example:
     * https://{TranslatorResourceName}.cognitiveservices.azure.com/translator.
     * @param serviceVersion Service version.
     */
    public SingleDocumentTranslationClientImpl(HttpPipeline httpPipeline, String endpoint,
        DocumentTranslationServiceVersion serviceVersion) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), endpoint, serviceVersion);
    }

    /**
     * Initializes an instance of SingleDocumentTranslationClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param endpoint Supported document Translation endpoint, protocol and hostname, for example:
     * https://{TranslatorResourceName}.cognitiveservices.azure.com/translator.
     * @param serviceVersion Service version.
     */
    public SingleDocumentTranslationClientImpl(HttpPipeline httpPipeline, SerializerAdapter serializerAdapter,
        String endpoint, DocumentTranslationServiceVersion serviceVersion) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.endpoint = endpoint;
        this.serviceVersion = serviceVersion;
        this.service = RestProxy.create(SingleDocumentTranslationClientService.class, this.httpPipeline,
            this.getSerializerAdapter());
    }

    /**
     * The interface defining all the services for SingleDocumentTranslationClient to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{endpoint}/translator")
    @ServiceInterface(name = "SingleDocumentTransl")
    public interface SingleDocumentTranslationClientService {
        // @Multipart not supported by RestProxy
        @Post("/document:translate")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<BinaryData>> documentTranslate(@HostParam("endpoint") String endpoint,
            @QueryParam("api-version") String apiVersion, @QueryParam("targetLanguage") String targetLanguage,
            @HeaderParam("Content-Type") String contentType, @HeaderParam("accept") String accept,
            @BodyParam("multipart/form-data") BinaryData documentTranslateContent, RequestOptions requestOptions,
            Context context);

        // @Multipart not supported by RestProxy
        @Post("/document:translate")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<BinaryData> documentTranslateSync(@HostParam("endpoint") String endpoint,
            @QueryParam("api-version") String apiVersion, @QueryParam("targetLanguage") String targetLanguage,
            @HeaderParam("Content-Type") String contentType, @HeaderParam("accept") String accept,
            @BodyParam("multipart/form-data") BinaryData documentTranslateContent, RequestOptions requestOptions,
            Context context);
    }

    /**
     * Submit a single document translation request to the Document Translation service
     * 
     * Use this API to submit a single translation request to the Document Translation Service.
     * <p><strong>Query Parameters</strong></p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>sourceLanguage</td><td>String</td><td>No</td><td>Specifies source language of the input document.
     * If this parameter isn't specified, automatic language detection is applied to determine the source language.
     * For example if the source document is written in English, then use sourceLanguage=en</td></tr>
     * <tr><td>category</td><td>String</td><td>No</td><td>A string specifying the category (domain) of the translation.
     * This parameter is used to get translations
     * from a customized system built with Custom Translator. Add the Category ID from your Custom Translator
     * project details to this parameter to use your deployed customized system. Default value is: general.</td></tr>
     * <tr><td>allowFallback</td><td>Boolean</td><td>No</td><td>Specifies that the service is allowed to fall back to a
     * general system when a custom system doesn't exist.
     * Possible values are: true (default) or false.</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * BinaryData
     * }</pre>
     * 
     * @param targetLanguage Specifies the language of the output document.
     * The target language must be one of the supported languages included in the translation scope.
     * For example if you want to translate the document in German language, then use targetLanguage=de.
     * @param documentTranslateContent Document Translate Request Content.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> documentTranslateWithResponseAsync(String targetLanguage,
        BinaryData documentTranslateContent, RequestOptions requestOptions) {
        final String contentType = "multipart/form-data";
        final String accept = "application/octet-stream, application/json";
        return FluxUtil
            .withContext(context -> service.documentTranslate(this.getEndpoint(), this.getServiceVersion().getVersion(),
                targetLanguage, contentType, accept, documentTranslateContent, requestOptions, context));
    }

    /**
     * Submit a single document translation request to the Document Translation service
     * 
     * Use this API to submit a single translation request to the Document Translation Service.
     * <p><strong>Query Parameters</strong></p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>sourceLanguage</td><td>String</td><td>No</td><td>Specifies source language of the input document.
     * If this parameter isn't specified, automatic language detection is applied to determine the source language.
     * For example if the source document is written in English, then use sourceLanguage=en</td></tr>
     * <tr><td>category</td><td>String</td><td>No</td><td>A string specifying the category (domain) of the translation.
     * This parameter is used to get translations
     * from a customized system built with Custom Translator. Add the Category ID from your Custom Translator
     * project details to this parameter to use your deployed customized system. Default value is: general.</td></tr>
     * <tr><td>allowFallback</td><td>Boolean</td><td>No</td><td>Specifies that the service is allowed to fall back to a
     * general system when a custom system doesn't exist.
     * Possible values are: true (default) or false.</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * BinaryData
     * }</pre>
     * 
     * @param targetLanguage Specifies the language of the output document.
     * The target language must be one of the supported languages included in the translation scope.
     * For example if you want to translate the document in German language, then use targetLanguage=de.
     * @param documentTranslateContent Document Translate Request Content.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> documentTranslateWithResponse(String targetLanguage,
        BinaryData documentTranslateContent, RequestOptions requestOptions) {
        final String contentType = "multipart/form-data";
        final String accept = "application/octet-stream, application/json";
        return service.documentTranslateSync(this.getEndpoint(), this.getServiceVersion().getVersion(), targetLanguage,
            contentType, accept, documentTranslateContent, requestOptions, Context.NONE);
    }
}
