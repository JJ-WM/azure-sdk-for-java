// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.mysqlflexibleserver.fluent.models.MaintenanceInner;
import com.azure.resourcemanager.mysqlflexibleserver.models.Maintenance;
import com.azure.resourcemanager.mysqlflexibleserver.models.MaintenanceProvisioningState;
import com.azure.resourcemanager.mysqlflexibleserver.models.MaintenanceState;
import com.azure.resourcemanager.mysqlflexibleserver.models.MaintenanceType;
import java.time.OffsetDateTime;

public final class MaintenanceImpl implements Maintenance {
    private MaintenanceInner innerObject;

    private final com.azure.resourcemanager.mysqlflexibleserver.MySqlManager serviceManager;

    MaintenanceImpl(MaintenanceInner innerObject,
        com.azure.resourcemanager.mysqlflexibleserver.MySqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public MaintenanceType maintenanceType() {
        return this.innerModel().maintenanceType();
    }

    public MaintenanceState maintenanceState() {
        return this.innerModel().maintenanceState();
    }

    public OffsetDateTime maintenanceStartTime() {
        return this.innerModel().maintenanceStartTime();
    }

    public OffsetDateTime maintenanceEndTime() {
        return this.innerModel().maintenanceEndTime();
    }

    public OffsetDateTime maintenanceExecutionStartTime() {
        return this.innerModel().maintenanceExecutionStartTime();
    }

    public OffsetDateTime maintenanceExecutionEndTime() {
        return this.innerModel().maintenanceExecutionEndTime();
    }

    public OffsetDateTime maintenanceAvailableScheduleMinTime() {
        return this.innerModel().maintenanceAvailableScheduleMinTime();
    }

    public OffsetDateTime maintenanceAvailableScheduleMaxTime() {
        return this.innerModel().maintenanceAvailableScheduleMaxTime();
    }

    public String maintenanceTitle() {
        return this.innerModel().maintenanceTitle();
    }

    public String maintenanceDescription() {
        return this.innerModel().maintenanceDescription();
    }

    public MaintenanceProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public MaintenanceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.mysqlflexibleserver.MySqlManager manager() {
        return this.serviceManager;
    }
}
