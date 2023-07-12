// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.trafficmanager.implementation;

import com.azure.core.annotation.ServiceClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.resourcemanager.resources.fluentcore.AzureServiceClient;
import com.azure.resourcemanager.trafficmanager.fluent.EndpointsClient;
import com.azure.resourcemanager.trafficmanager.fluent.GeographicHierarchiesClient;
import com.azure.resourcemanager.trafficmanager.fluent.HeatMapsClient;
import com.azure.resourcemanager.trafficmanager.fluent.ProfilesClient;
import com.azure.resourcemanager.trafficmanager.fluent.TrafficManagerManagementClient;
import com.azure.resourcemanager.trafficmanager.fluent.TrafficManagerUserMetricsKeysClient;
import java.time.Duration;

/** Initializes a new instance of the TrafficManagerManagementClientImpl type. */
@ServiceClient(builder = TrafficManagerManagementClientBuilder.class)
public final class TrafficManagerManagementClientImpl extends AzureServiceClient
    implements TrafficManagerManagementClient {
    /** The ID of the target subscription. */
    private final String subscriptionId;

    /**
     * Gets The ID of the target subscription.
     *
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /** server parameter. */
    private final String endpoint;

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /** Api Version. */
    private final String apiVersion;

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /** The default poll interval for long-running operation. */
    private final Duration defaultPollInterval;

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    public Duration getDefaultPollInterval() {
        return this.defaultPollInterval;
    }

    /** The EndpointsClient object to access its operations. */
    private final EndpointsClient endpoints;

    /**
     * Gets the EndpointsClient object to access its operations.
     *
     * @return the EndpointsClient object.
     */
    public EndpointsClient getEndpoints() {
        return this.endpoints;
    }

    /** The ProfilesClient object to access its operations. */
    private final ProfilesClient profiles;

    /**
     * Gets the ProfilesClient object to access its operations.
     *
     * @return the ProfilesClient object.
     */
    public ProfilesClient getProfiles() {
        return this.profiles;
    }

    /** The GeographicHierarchiesClient object to access its operations. */
    private final GeographicHierarchiesClient geographicHierarchies;

    /**
     * Gets the GeographicHierarchiesClient object to access its operations.
     *
     * @return the GeographicHierarchiesClient object.
     */
    public GeographicHierarchiesClient getGeographicHierarchies() {
        return this.geographicHierarchies;
    }

    /** The HeatMapsClient object to access its operations. */
    private final HeatMapsClient heatMaps;

    /**
     * Gets the HeatMapsClient object to access its operations.
     *
     * @return the HeatMapsClient object.
     */
    public HeatMapsClient getHeatMaps() {
        return this.heatMaps;
    }

    /** The TrafficManagerUserMetricsKeysClient object to access its operations. */
    private final TrafficManagerUserMetricsKeysClient trafficManagerUserMetricsKeys;

    /**
     * Gets the TrafficManagerUserMetricsKeysClient object to access its operations.
     *
     * @return the TrafficManagerUserMetricsKeysClient object.
     */
    public TrafficManagerUserMetricsKeysClient getTrafficManagerUserMetricsKeys() {
        return this.trafficManagerUserMetricsKeys;
    }

    /**
     * Initializes an instance of TrafficManagerManagementClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     * @param subscriptionId The ID of the target subscription.
     * @param endpoint server parameter.
     */
    TrafficManagerManagementClientImpl(
        HttpPipeline httpPipeline,
        SerializerAdapter serializerAdapter,
        Duration defaultPollInterval,
        AzureEnvironment environment,
        String subscriptionId,
        String endpoint) {
        super(httpPipeline, serializerAdapter, environment);
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.defaultPollInterval = defaultPollInterval;
        this.subscriptionId = subscriptionId;
        this.endpoint = endpoint;
        this.apiVersion = "2022-04-01";
        this.endpoints = new EndpointsClientImpl(this);
        this.profiles = new ProfilesClientImpl(this);
        this.geographicHierarchies = new GeographicHierarchiesClientImpl(this);
        this.heatMaps = new HeatMapsClientImpl(this);
        this.trafficManagerUserMetricsKeys = new TrafficManagerUserMetricsKeysClientImpl(this);
    }
}
