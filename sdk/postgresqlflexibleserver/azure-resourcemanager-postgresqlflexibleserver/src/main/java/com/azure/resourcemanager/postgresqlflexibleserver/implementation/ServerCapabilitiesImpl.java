// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.ServerCapabilitiesClient;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.FlexibleServerCapabilityInner;
import com.azure.resourcemanager.postgresqlflexibleserver.models.FlexibleServerCapability;
import com.azure.resourcemanager.postgresqlflexibleserver.models.ServerCapabilities;

public final class ServerCapabilitiesImpl implements ServerCapabilities {
    private static final ClientLogger LOGGER = new ClientLogger(ServerCapabilitiesImpl.class);

    private final ServerCapabilitiesClient innerClient;

    private final com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager serviceManager;

    public ServerCapabilitiesImpl(ServerCapabilitiesClient innerClient,
        com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<FlexibleServerCapability> list(String resourceGroupName, String serverName) {
        PagedIterable<FlexibleServerCapabilityInner> inner = this.serviceClient().list(resourceGroupName, serverName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new FlexibleServerCapabilityImpl(inner1, this.manager()));
    }

    public PagedIterable<FlexibleServerCapability> list(String resourceGroupName, String serverName, Context context) {
        PagedIterable<FlexibleServerCapabilityInner> inner
            = this.serviceClient().list(resourceGroupName, serverName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new FlexibleServerCapabilityImpl(inner1, this.manager()));
    }

    private ServerCapabilitiesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager manager() {
        return this.serviceManager;
    }
}
