// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.LtrBackupOperationsClient;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.LtrServerBackupOperationInner;
import com.azure.resourcemanager.postgresqlflexibleserver.models.LtrBackupOperations;
import com.azure.resourcemanager.postgresqlflexibleserver.models.LtrServerBackupOperation;

public final class LtrBackupOperationsImpl implements LtrBackupOperations {
    private static final ClientLogger LOGGER = new ClientLogger(LtrBackupOperationsImpl.class);

    private final LtrBackupOperationsClient innerClient;

    private final com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager serviceManager;

    public LtrBackupOperationsImpl(
        LtrBackupOperationsClient innerClient,
        com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<LtrServerBackupOperation> getWithResponse(
        String resourceGroupName, String serverName, String backupName, Context context) {
        Response<LtrServerBackupOperationInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, serverName, backupName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new LtrServerBackupOperationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public LtrServerBackupOperation get(String resourceGroupName, String serverName, String backupName) {
        LtrServerBackupOperationInner inner = this.serviceClient().get(resourceGroupName, serverName, backupName);
        if (inner != null) {
            return new LtrServerBackupOperationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<LtrServerBackupOperation> listByServer(String resourceGroupName, String serverName) {
        PagedIterable<LtrServerBackupOperationInner> inner =
            this.serviceClient().listByServer(resourceGroupName, serverName);
        return Utils.mapPage(inner, inner1 -> new LtrServerBackupOperationImpl(inner1, this.manager()));
    }

    public PagedIterable<LtrServerBackupOperation> listByServer(
        String resourceGroupName, String serverName, Context context) {
        PagedIterable<LtrServerBackupOperationInner> inner =
            this.serviceClient().listByServer(resourceGroupName, serverName, context);
        return Utils.mapPage(inner, inner1 -> new LtrServerBackupOperationImpl(inner1, this.manager()));
    }

    private LtrBackupOperationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager manager() {
        return this.serviceManager;
    }
}
