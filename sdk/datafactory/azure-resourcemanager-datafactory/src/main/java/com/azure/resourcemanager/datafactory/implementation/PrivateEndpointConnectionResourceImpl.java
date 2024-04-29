// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.datafactory.fluent.models.PrivateEndpointConnectionResourceInner;
import com.azure.resourcemanager.datafactory.models.PrivateEndpointConnectionResource;
import com.azure.resourcemanager.datafactory.models.PrivateLinkConnectionApprovalRequest;
import com.azure.resourcemanager.datafactory.models.PrivateLinkConnectionApprovalRequestResource;
import com.azure.resourcemanager.datafactory.models.RemotePrivateEndpointConnection;

public final class PrivateEndpointConnectionResourceImpl implements PrivateEndpointConnectionResource,
    PrivateEndpointConnectionResource.Definition, PrivateEndpointConnectionResource.Update {
    private PrivateEndpointConnectionResourceInner innerObject;

    private final com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public RemotePrivateEndpointConnection properties() {
        return this.innerModel().properties();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public PrivateEndpointConnectionResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.datafactory.DataFactoryManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String factoryName;

    private String privateEndpointConnectionName;

    private String createIfMatch;

    private PrivateLinkConnectionApprovalRequestResource createPrivateEndpointWrapper;

    private String updateIfMatch;

    private PrivateLinkConnectionApprovalRequestResource updatePrivateEndpointWrapper;

    public PrivateEndpointConnectionResourceImpl withExistingFactory(String resourceGroupName, String factoryName) {
        this.resourceGroupName = resourceGroupName;
        this.factoryName = factoryName;
        return this;
    }

    public PrivateEndpointConnectionResource create() {
        this.innerObject = serviceManager.serviceClient()
            .getPrivateEndpointConnectionOperations()
            .createOrUpdateWithResponse(resourceGroupName, factoryName, privateEndpointConnectionName,
                createPrivateEndpointWrapper, createIfMatch, Context.NONE)
            .getValue();
        return this;
    }

    public PrivateEndpointConnectionResource create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getPrivateEndpointConnectionOperations()
            .createOrUpdateWithResponse(resourceGroupName, factoryName, privateEndpointConnectionName,
                createPrivateEndpointWrapper, createIfMatch, context)
            .getValue();
        return this;
    }

    PrivateEndpointConnectionResourceImpl(String name,
        com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager) {
        this.innerObject = new PrivateEndpointConnectionResourceInner();
        this.serviceManager = serviceManager;
        this.privateEndpointConnectionName = name;
        this.createIfMatch = null;
        this.createPrivateEndpointWrapper = new PrivateLinkConnectionApprovalRequestResource();
    }

    public PrivateEndpointConnectionResourceImpl update() {
        this.updateIfMatch = null;
        this.updatePrivateEndpointWrapper = new PrivateLinkConnectionApprovalRequestResource();
        return this;
    }

    public PrivateEndpointConnectionResource apply() {
        this.innerObject = serviceManager.serviceClient()
            .getPrivateEndpointConnectionOperations()
            .createOrUpdateWithResponse(resourceGroupName, factoryName, privateEndpointConnectionName,
                updatePrivateEndpointWrapper, updateIfMatch, Context.NONE)
            .getValue();
        return this;
    }

    public PrivateEndpointConnectionResource apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getPrivateEndpointConnectionOperations()
            .createOrUpdateWithResponse(resourceGroupName, factoryName, privateEndpointConnectionName,
                updatePrivateEndpointWrapper, updateIfMatch, context)
            .getValue();
        return this;
    }

    PrivateEndpointConnectionResourceImpl(PrivateEndpointConnectionResourceInner innerObject,
        com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.factoryName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "factories");
        this.privateEndpointConnectionName
            = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "privateEndpointConnections");
    }

    public PrivateEndpointConnectionResource refresh() {
        String localIfNoneMatch = null;
        this.innerObject = serviceManager.serviceClient()
            .getPrivateEndpointConnectionOperations()
            .getWithResponse(resourceGroupName, factoryName, privateEndpointConnectionName, localIfNoneMatch,
                Context.NONE)
            .getValue();
        return this;
    }

    public PrivateEndpointConnectionResource refresh(Context context) {
        String localIfNoneMatch = null;
        this.innerObject = serviceManager.serviceClient()
            .getPrivateEndpointConnectionOperations()
            .getWithResponse(resourceGroupName, factoryName, privateEndpointConnectionName, localIfNoneMatch, context)
            .getValue();
        return this;
    }

    public PrivateEndpointConnectionResourceImpl withProperties(PrivateLinkConnectionApprovalRequest properties) {
        if (isInCreateMode()) {
            this.createPrivateEndpointWrapper.withProperties(properties);
            return this;
        } else {
            this.updatePrivateEndpointWrapper.withProperties(properties);
            return this;
        }
    }

    public PrivateEndpointConnectionResourceImpl withIfMatch(String ifMatch) {
        if (isInCreateMode()) {
            this.createIfMatch = ifMatch;
            return this;
        } else {
            this.updateIfMatch = ifMatch;
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
