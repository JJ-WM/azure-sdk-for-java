// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.devcenter.fluent.models.EnvironmentTypeInner;
import com.azure.resourcemanager.devcenter.models.EnvironmentType;
import com.azure.resourcemanager.devcenter.models.EnvironmentTypeUpdate;
import com.azure.resourcemanager.devcenter.models.ProvisioningState;
import java.util.Collections;
import java.util.Map;

public final class EnvironmentTypeImpl implements EnvironmentType, EnvironmentType.Definition, EnvironmentType.Update {
    private EnvironmentTypeInner innerObject;

    private final com.azure.resourcemanager.devcenter.DevCenterManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String displayName() {
        return this.innerModel().displayName();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public EnvironmentTypeInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.devcenter.DevCenterManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String devCenterName;

    private String environmentTypeName;

    private EnvironmentTypeUpdate updateBody;

    public EnvironmentTypeImpl withExistingDevcenter(String resourceGroupName, String devCenterName) {
        this.resourceGroupName = resourceGroupName;
        this.devCenterName = devCenterName;
        return this;
    }

    public EnvironmentType create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getEnvironmentTypes()
                .createOrUpdateWithResponse(
                    resourceGroupName, devCenterName, environmentTypeName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public EnvironmentType create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getEnvironmentTypes()
                .createOrUpdateWithResponse(
                    resourceGroupName, devCenterName, environmentTypeName, this.innerModel(), context)
                .getValue();
        return this;
    }

    EnvironmentTypeImpl(String name, com.azure.resourcemanager.devcenter.DevCenterManager serviceManager) {
        this.innerObject = new EnvironmentTypeInner();
        this.serviceManager = serviceManager;
        this.environmentTypeName = name;
    }

    public EnvironmentTypeImpl update() {
        this.updateBody = new EnvironmentTypeUpdate();
        return this;
    }

    public EnvironmentType apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getEnvironmentTypes()
                .updateWithResponse(resourceGroupName, devCenterName, environmentTypeName, updateBody, Context.NONE)
                .getValue();
        return this;
    }

    public EnvironmentType apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getEnvironmentTypes()
                .updateWithResponse(resourceGroupName, devCenterName, environmentTypeName, updateBody, context)
                .getValue();
        return this;
    }

    EnvironmentTypeImpl(
        EnvironmentTypeInner innerObject, com.azure.resourcemanager.devcenter.DevCenterManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.devCenterName = Utils.getValueFromIdByName(innerObject.id(), "devcenters");
        this.environmentTypeName = Utils.getValueFromIdByName(innerObject.id(), "environmentTypes");
    }

    public EnvironmentType refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getEnvironmentTypes()
                .getWithResponse(resourceGroupName, devCenterName, environmentTypeName, Context.NONE)
                .getValue();
        return this;
    }

    public EnvironmentType refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getEnvironmentTypes()
                .getWithResponse(resourceGroupName, devCenterName, environmentTypeName, context)
                .getValue();
        return this;
    }

    public EnvironmentTypeImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateBody.withTags(tags);
            return this;
        }
    }

    public EnvironmentTypeImpl withDisplayName(String displayName) {
        if (isInCreateMode()) {
            this.innerModel().withDisplayName(displayName);
            return this;
        } else {
            this.updateBody.withDisplayName(displayName);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
