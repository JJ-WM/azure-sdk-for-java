// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/**
 * The interface for MicrosoftGraphClient class.
 */
public interface MicrosoftGraphClient {
    /**
     * Gets server parameter.
     * 
     * @return the endpoint value.
     */
    String getEndpoint();

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
     * Gets the ApplicationsApplicationsClient object to access its operations.
     * 
     * @return the ApplicationsApplicationsClient object.
     */
    ApplicationsApplicationsClient getApplicationsApplications();

    /**
     * Gets the ApplicationsClient object to access its operations.
     * 
     * @return the ApplicationsClient object.
     */
    ApplicationsClient getApplications();

    /**
     * Gets the ServicePrincipalsServicePrincipalsClient object to access its operations.
     * 
     * @return the ServicePrincipalsServicePrincipalsClient object.
     */
    ServicePrincipalsServicePrincipalsClient getServicePrincipalsServicePrincipals();

    /**
     * Gets the ServicePrincipalsClient object to access its operations.
     * 
     * @return the ServicePrincipalsClient object.
     */
    ServicePrincipalsClient getServicePrincipals();

    /**
     * Gets the GroupsGroupsClient object to access its operations.
     * 
     * @return the GroupsGroupsClient object.
     */
    GroupsGroupsClient getGroupsGroups();

    /**
     * Gets the GroupsClient object to access its operations.
     * 
     * @return the GroupsClient object.
     */
    GroupsClient getGroups();

    /**
     * Gets the UsersUsersClient object to access its operations.
     * 
     * @return the UsersUsersClient object.
     */
    UsersUsersClient getUsersUsers();

    /**
     * Gets the DomainsDomainsClient object to access its operations.
     * 
     * @return the DomainsDomainsClient object.
     */
    DomainsDomainsClient getDomainsDomains();
}
