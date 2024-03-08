// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.monitor.query.implementation.logs;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;

/**
 * Initializes a new instance of the AzureLogAnalytics type.
 */
public final class AzureLogAnalyticsImpl {
    /**
     * server parameter.
     */
    private final String host;

    /**
     * Gets server parameter.
     * 
     * @return the host value.
     */
    public String getHost() {
        return this.host;
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
     * The Queries object to access its operations.
     */
    private final QueriesImpl queries;

    /**
     * Gets the Queries object to access its operations.
     * 
     * @return the Queries object.
     */
    public QueriesImpl getQueries() {
        return this.queries;
    }

    /**
     * The Metadatas object to access its operations.
     */
    private final MetadatasImpl metadatas;

    /**
     * Gets the Metadatas object to access its operations.
     * 
     * @return the Metadatas object.
     */
    public MetadatasImpl getMetadatas() {
        return this.metadatas;
    }

    /**
     * Initializes an instance of AzureLogAnalytics client.
     * 
     * @param host server parameter.
     */
    AzureLogAnalyticsImpl(String host) {
        this(new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy()).build(),
            JacksonAdapter.createDefaultSerializerAdapter(), host);
    }

    /**
     * Initializes an instance of AzureLogAnalytics client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param host server parameter.
     */
    AzureLogAnalyticsImpl(HttpPipeline httpPipeline, String host) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), host);
    }

    /**
     * Initializes an instance of AzureLogAnalytics client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param host server parameter.
     */
    AzureLogAnalyticsImpl(HttpPipeline httpPipeline, SerializerAdapter serializerAdapter, String host) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.host = host;
        this.queries = new QueriesImpl(this);
        this.metadatas = new MetadatasImpl(this);
    }
}
