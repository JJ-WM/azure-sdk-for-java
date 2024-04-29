// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.implementation;

import com.azure.resourcemanager.mysqlflexibleserver.fluent.models.CapabilityPropertiesInner;
import com.azure.resourcemanager.mysqlflexibleserver.models.CapabilityProperties;
import com.azure.resourcemanager.mysqlflexibleserver.models.ServerEditionCapability;
import java.util.Collections;
import java.util.List;

public final class CapabilityPropertiesImpl implements CapabilityProperties {
    private CapabilityPropertiesInner innerObject;

    private final com.azure.resourcemanager.mysqlflexibleserver.MySqlManager serviceManager;

    CapabilityPropertiesImpl(CapabilityPropertiesInner innerObject,
        com.azure.resourcemanager.mysqlflexibleserver.MySqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String zone() {
        return this.innerModel().zone();
    }

    public List<String> supportedHAMode() {
        List<String> inner = this.innerModel().supportedHAMode();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> supportedGeoBackupRegions() {
        List<String> inner = this.innerModel().supportedGeoBackupRegions();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<ServerEditionCapability> supportedFlexibleServerEditions() {
        List<ServerEditionCapability> inner = this.innerModel().supportedFlexibleServerEditions();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public CapabilityPropertiesInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.mysqlflexibleserver.MySqlManager manager() {
        return this.serviceManager;
    }
}
