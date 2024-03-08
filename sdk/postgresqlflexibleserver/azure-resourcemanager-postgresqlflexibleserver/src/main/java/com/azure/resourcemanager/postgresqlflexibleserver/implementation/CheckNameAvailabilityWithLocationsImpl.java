// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.CheckNameAvailabilityWithLocationsClient;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.NameAvailabilityInner;
import com.azure.resourcemanager.postgresqlflexibleserver.models.CheckNameAvailabilityRequest;
import com.azure.resourcemanager.postgresqlflexibleserver.models.CheckNameAvailabilityWithLocations;
import com.azure.resourcemanager.postgresqlflexibleserver.models.NameAvailability;

public final class CheckNameAvailabilityWithLocationsImpl implements CheckNameAvailabilityWithLocations {
    private static final ClientLogger LOGGER = new ClientLogger(CheckNameAvailabilityWithLocationsImpl.class);

    private final CheckNameAvailabilityWithLocationsClient innerClient;

    private final com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager serviceManager;

    public CheckNameAvailabilityWithLocationsImpl(CheckNameAvailabilityWithLocationsClient innerClient,
        com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<NameAvailability> executeWithResponse(String locationName,
        CheckNameAvailabilityRequest nameAvailabilityRequest, Context context) {
        Response<NameAvailabilityInner> inner
            = this.serviceClient().executeWithResponse(locationName, nameAvailabilityRequest, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new NameAvailabilityImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public NameAvailability execute(String locationName, CheckNameAvailabilityRequest nameAvailabilityRequest) {
        NameAvailabilityInner inner = this.serviceClient().execute(locationName, nameAvailabilityRequest);
        if (inner != null) {
            return new NameAvailabilityImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private CheckNameAvailabilityWithLocationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager manager() {
        return this.serviceManager;
    }
}
