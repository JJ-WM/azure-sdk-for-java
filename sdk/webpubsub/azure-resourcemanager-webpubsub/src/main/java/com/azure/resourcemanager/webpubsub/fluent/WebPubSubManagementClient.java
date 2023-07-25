// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for WebPubSubManagementClient class. */
public interface WebPubSubManagementClient {
    /**
     * Gets The ID of the target subscription. The value must be an UUID.
     *
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the WebPubSubsClient object to access its operations.
     *
     * @return the WebPubSubsClient object.
     */
    WebPubSubsClient getWebPubSubs();

    /**
     * Gets the UsagesClient object to access its operations.
     *
     * @return the UsagesClient object.
     */
    UsagesClient getUsages();

    /**
     * Gets the WebPubSubCustomCertificatesClient object to access its operations.
     *
     * @return the WebPubSubCustomCertificatesClient object.
     */
    WebPubSubCustomCertificatesClient getWebPubSubCustomCertificates();

    /**
     * Gets the WebPubSubCustomDomainsClient object to access its operations.
     *
     * @return the WebPubSubCustomDomainsClient object.
     */
    WebPubSubCustomDomainsClient getWebPubSubCustomDomains();

    /**
     * Gets the WebPubSubHubsClient object to access its operations.
     *
     * @return the WebPubSubHubsClient object.
     */
    WebPubSubHubsClient getWebPubSubHubs();

    /**
     * Gets the WebPubSubPrivateEndpointConnectionsClient object to access its operations.
     *
     * @return the WebPubSubPrivateEndpointConnectionsClient object.
     */
    WebPubSubPrivateEndpointConnectionsClient getWebPubSubPrivateEndpointConnections();

    /**
     * Gets the WebPubSubPrivateLinkResourcesClient object to access its operations.
     *
     * @return the WebPubSubPrivateLinkResourcesClient object.
     */
    WebPubSubPrivateLinkResourcesClient getWebPubSubPrivateLinkResources();

    /**
     * Gets the WebPubSubReplicasClient object to access its operations.
     *
     * @return the WebPubSubReplicasClient object.
     */
    WebPubSubReplicasClient getWebPubSubReplicas();

    /**
     * Gets the WebPubSubSharedPrivateLinkResourcesClient object to access its operations.
     *
     * @return the WebPubSubSharedPrivateLinkResourcesClient object.
     */
    WebPubSubSharedPrivateLinkResourcesClient getWebPubSubSharedPrivateLinkResources();
}
