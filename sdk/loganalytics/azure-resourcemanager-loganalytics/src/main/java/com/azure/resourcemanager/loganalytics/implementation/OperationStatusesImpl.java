// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.loganalytics.fluent.OperationStatusesClient;
import com.azure.resourcemanager.loganalytics.fluent.models.OperationStatusInner;
import com.azure.resourcemanager.loganalytics.models.OperationStatus;
import com.azure.resourcemanager.loganalytics.models.OperationStatuses;

public final class OperationStatusesImpl implements OperationStatuses {
    private static final ClientLogger LOGGER = new ClientLogger(OperationStatusesImpl.class);

    private final OperationStatusesClient innerClient;

    private final com.azure.resourcemanager.loganalytics.LogAnalyticsManager serviceManager;

    public OperationStatusesImpl(
        OperationStatusesClient innerClient,
        com.azure.resourcemanager.loganalytics.LogAnalyticsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<OperationStatus> getWithResponse(String location, String asyncOperationId, Context context) {
        Response<OperationStatusInner> inner =
            this.serviceClient().getWithResponse(location, asyncOperationId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new OperationStatusImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public OperationStatus get(String location, String asyncOperationId) {
        OperationStatusInner inner = this.serviceClient().get(location, asyncOperationId);
        if (inner != null) {
            return new OperationStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private OperationStatusesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.loganalytics.LogAnalyticsManager manager() {
        return this.serviceManager;
    }
}
