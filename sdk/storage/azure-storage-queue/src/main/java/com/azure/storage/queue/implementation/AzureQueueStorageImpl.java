// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.queue.implementation;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;

/**
 * Initializes a new instance of the AzureQueueStorage type.
 */
public final class AzureQueueStorageImpl {
    /**
     * The URL of the service account, queue or message that is the target of the desired operation.
     */
    private final String url;

    /**
     * Gets The URL of the service account, queue or message that is the target of the desired operation.
     * 
     * @return the url value.
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * Specifies the version of the operation to use for this request.
     */
    private final String version;

    /**
     * Gets Specifies the version of the operation to use for this request.
     * 
     * @return the version value.
     */
    public String getVersion() {
        return this.version;
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
     * The ServicesImpl object to access its operations.
     */
    private final ServicesImpl services;

    /**
     * Gets the ServicesImpl object to access its operations.
     * 
     * @return the ServicesImpl object.
     */
    public ServicesImpl getServices() {
        return this.services;
    }

    /**
     * The QueuesImpl object to access its operations.
     */
    private final QueuesImpl queues;

    /**
     * Gets the QueuesImpl object to access its operations.
     * 
     * @return the QueuesImpl object.
     */
    public QueuesImpl getQueues() {
        return this.queues;
    }

    /**
     * The MessagesImpl object to access its operations.
     */
    private final MessagesImpl messages;

    /**
     * Gets the MessagesImpl object to access its operations.
     * 
     * @return the MessagesImpl object.
     */
    public MessagesImpl getMessages() {
        return this.messages;
    }

    /**
     * The MessageIdsImpl object to access its operations.
     */
    private final MessageIdsImpl messageIds;

    /**
     * Gets the MessageIdsImpl object to access its operations.
     * 
     * @return the MessageIdsImpl object.
     */
    public MessageIdsImpl getMessageIds() {
        return this.messageIds;
    }

    /**
     * Initializes an instance of AzureQueueStorage client.
     * 
     * @param url The URL of the service account, queue or message that is the target of the desired operation.
     * @param version Specifies the version of the operation to use for this request.
     */
    public AzureQueueStorageImpl(String url, String version) {
        this(new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy()).build(),
            JacksonAdapter.createDefaultSerializerAdapter(), url, version);
    }

    /**
     * Initializes an instance of AzureQueueStorage client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param url The URL of the service account, queue or message that is the target of the desired operation.
     * @param version Specifies the version of the operation to use for this request.
     */
    public AzureQueueStorageImpl(HttpPipeline httpPipeline, String url, String version) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), url, version);
    }

    /**
     * Initializes an instance of AzureQueueStorage client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param url The URL of the service account, queue or message that is the target of the desired operation.
     * @param version Specifies the version of the operation to use for this request.
     */
    public AzureQueueStorageImpl(HttpPipeline httpPipeline, SerializerAdapter serializerAdapter, String url,
        String version) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.url = url;
        this.version = version;
        this.services = new ServicesImpl(this);
        this.queues = new QueuesImpl(this);
        this.messages = new MessagesImpl(this);
        this.messageIds = new MessageIdsImpl(this);
    }
}
