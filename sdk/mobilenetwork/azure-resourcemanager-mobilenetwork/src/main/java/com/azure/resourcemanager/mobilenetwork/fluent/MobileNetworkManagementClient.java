// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for MobileNetworkManagementClient class. */
public interface MobileNetworkManagementClient {
    /**
     * Gets The ID of the target subscription.
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
     * Gets the AttachedDataNetworksClient object to access its operations.
     *
     * @return the AttachedDataNetworksClient object.
     */
    AttachedDataNetworksClient getAttachedDataNetworks();

    /**
     * Gets the DataNetworksClient object to access its operations.
     *
     * @return the DataNetworksClient object.
     */
    DataNetworksClient getDataNetworks();

    /**
     * Gets the MobileNetworksClient object to access its operations.
     *
     * @return the MobileNetworksClient object.
     */
    MobileNetworksClient getMobileNetworks();

    /**
     * Gets the SitesClient object to access its operations.
     *
     * @return the SitesClient object.
     */
    SitesClient getSites();

    /**
     * Gets the SimsClient object to access its operations.
     *
     * @return the SimsClient object.
     */
    SimsClient getSims();

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the PacketCoreControlPlanesClient object to access its operations.
     *
     * @return the PacketCoreControlPlanesClient object.
     */
    PacketCoreControlPlanesClient getPacketCoreControlPlanes();

    /**
     * Gets the PacketCoreDataPlanesClient object to access its operations.
     *
     * @return the PacketCoreDataPlanesClient object.
     */
    PacketCoreDataPlanesClient getPacketCoreDataPlanes();

    /**
     * Gets the ServicesClient object to access its operations.
     *
     * @return the ServicesClient object.
     */
    ServicesClient getServices();

    /**
     * Gets the SimPoliciesClient object to access its operations.
     *
     * @return the SimPoliciesClient object.
     */
    SimPoliciesClient getSimPolicies();

    /**
     * Gets the SlicesClient object to access its operations.
     *
     * @return the SlicesClient object.
     */
    SlicesClient getSlices();
}
