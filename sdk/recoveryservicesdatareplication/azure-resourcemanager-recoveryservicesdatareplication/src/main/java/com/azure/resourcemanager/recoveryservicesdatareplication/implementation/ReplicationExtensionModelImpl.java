// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.recoveryservicesdatareplication.fluent.models.ReplicationExtensionModelInner;
import com.azure.resourcemanager.recoveryservicesdatareplication.models.ReplicationExtensionModel;
import com.azure.resourcemanager.recoveryservicesdatareplication.models.ReplicationExtensionModelProperties;
import com.azure.resourcemanager.recoveryservicesdatareplication.models.ReplicationExtensionModelSystemData;

public final class ReplicationExtensionModelImpl
    implements ReplicationExtensionModel, ReplicationExtensionModel.Definition {
    private ReplicationExtensionModelInner innerObject;

    private final com.azure.resourcemanager.recoveryservicesdatareplication.RecoveryServicesDataReplicationManager
        serviceManager;

    ReplicationExtensionModelImpl(
        ReplicationExtensionModelInner innerObject,
        com.azure.resourcemanager.recoveryservicesdatareplication.RecoveryServicesDataReplicationManager
            serviceManager) {
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

    public ReplicationExtensionModelProperties properties() {
        return this.innerModel().properties();
    }

    public ReplicationExtensionModelSystemData systemData() {
        return this.innerModel().systemData();
    }

    public ReplicationExtensionModelInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.recoveryservicesdatareplication.RecoveryServicesDataReplicationManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String vaultName;

    private String replicationExtensionName;

    public ReplicationExtensionModelImpl withExistingReplicationVault(String resourceGroupName, String vaultName) {
        this.resourceGroupName = resourceGroupName;
        this.vaultName = vaultName;
        return this;
    }

    public ReplicationExtensionModel create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getReplicationExtensions()
                .create(resourceGroupName, vaultName, replicationExtensionName, this.innerModel(), Context.NONE);
        return this;
    }

    public ReplicationExtensionModel create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getReplicationExtensions()
                .create(resourceGroupName, vaultName, replicationExtensionName, this.innerModel(), context);
        return this;
    }

    ReplicationExtensionModelImpl(
        String name,
        com.azure.resourcemanager.recoveryservicesdatareplication.RecoveryServicesDataReplicationManager
            serviceManager) {
        this.innerObject = new ReplicationExtensionModelInner();
        this.serviceManager = serviceManager;
        this.replicationExtensionName = name;
    }

    public ReplicationExtensionModel refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getReplicationExtensions()
                .getWithResponse(resourceGroupName, vaultName, replicationExtensionName, Context.NONE)
                .getValue();
        return this;
    }

    public ReplicationExtensionModel refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getReplicationExtensions()
                .getWithResponse(resourceGroupName, vaultName, replicationExtensionName, context)
                .getValue();
        return this;
    }

    public ReplicationExtensionModelImpl withProperties(ReplicationExtensionModelProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }
}
