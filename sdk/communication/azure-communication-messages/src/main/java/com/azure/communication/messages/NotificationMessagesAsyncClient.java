// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.communication.messages;

import com.azure.communication.messages.implementation.NotificationMessagesClientImpl;
import com.azure.communication.messages.models.NotificationContent;
import com.azure.communication.messages.models.SendMessageResult;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Mono;

/**
 * Initializes a new instance of the asynchronous NotificationMessagesClient type.
 */
@ServiceClient(builder = NotificationMessagesClientBuilder.class, isAsync = true)
public final class NotificationMessagesAsyncClient {

    @Generated
    private final NotificationMessagesClientImpl serviceClient;

    /**
     * Initializes an instance of NotificationMessagesAsyncClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    NotificationMessagesAsyncClient(NotificationMessagesClientImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Sends a notification message from Business to User.
     * <p>
     * <strong>Header Parameters</strong>
     * </p>
     * <table border="1">
     * <caption>Header Parameters</caption>
     * <tr>
     * <th>Name</th>
     * <th>Type</th>
     * <th>Required</th>
     * <th>Description</th>
     * </tr>
     * <tr>
     * <td>repeatability-request-id</td>
     * <td>String</td>
     * <td>No</td>
     * <td>Repeatability request ID header</td>
     * </tr>
     * <tr>
     * <td>repeatability-first-sent</td>
     * <td>String</td>
     * <td>No</td>
     * <td>Repeatability first sent header as HTTP-date</td>
     * </tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addHeader}
     * <p>
     * <strong>Request Body Schema</strong>
     * </p>
     * <pre>{@code
     * {
     *     channelRegistrationId: String (Required)
     *     to (Required): [
     *         String (Required)
     *     ]
     * }
     * }</pre>
     * <p>
     * <strong>Response Body Schema</strong>
     * </p>
     * <pre>{@code
     * {
     *     receipts (Required): [
     *          (Required){
     *             messageId: String (Required)
     *             to: String (Required)
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param notificationContent Details of the message to send.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return result of the send message operation along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> sendWithResponse(BinaryData notificationContent, RequestOptions requestOptions) {
        return this.serviceClient.sendWithResponseAsync(notificationContent, requestOptions);
    }

    /**
     * Download the Media payload from a User to Business message.
     * <p>
     * <strong>Response Body Schema</strong>
     * </p>
     * <pre>{@code
     * BinaryData
     * }</pre>
     *
     * @param mediaId The stream ID.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> downloadMediaWithResponse(String mediaId, RequestOptions requestOptions) {
        return this.serviceClient.downloadMediaWithResponseAsync(mediaId, requestOptions);
    }

    /**
     * Sends a notification message from Business to User.
     *
     * @param notificationContent Details of the message to send.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the send message operation on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SendMessageResult> send(NotificationContent notificationContent) {
        // Generated convenience method for sendWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return sendWithResponse(BinaryData.fromObject(notificationContent), requestOptions).flatMap(FluxUtil::toMono)
            .map(protocolMethodData -> protocolMethodData.toObject(SendMessageResult.class));
    }

    /**
     * Download the Media payload from a User to Business message.
     *
     * @param mediaId The stream ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<BinaryData> downloadMedia(String mediaId) {
        // Generated convenience method for downloadMediaWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return downloadMediaWithResponse(mediaId, requestOptions).flatMap(FluxUtil::toMono);
    }
}
