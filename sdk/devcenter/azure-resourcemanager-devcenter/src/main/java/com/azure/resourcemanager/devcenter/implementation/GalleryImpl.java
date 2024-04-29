// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.devcenter.fluent.models.GalleryInner;
import com.azure.resourcemanager.devcenter.models.Gallery;
import com.azure.resourcemanager.devcenter.models.ProvisioningState;

public final class GalleryImpl implements Gallery, Gallery.Definition, Gallery.Update {
    private GalleryInner innerObject;

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

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String galleryResourceId() {
        return this.innerModel().galleryResourceId();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public GalleryInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.devcenter.DevCenterManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String devCenterName;

    private String galleryName;

    public GalleryImpl withExistingDevcenter(String resourceGroupName, String devCenterName) {
        this.resourceGroupName = resourceGroupName;
        this.devCenterName = devCenterName;
        return this;
    }

    public Gallery create() {
        this.innerObject = serviceManager.serviceClient()
            .getGalleries()
            .createOrUpdate(resourceGroupName, devCenterName, galleryName, this.innerModel(), Context.NONE);
        return this;
    }

    public Gallery create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getGalleries()
            .createOrUpdate(resourceGroupName, devCenterName, galleryName, this.innerModel(), context);
        return this;
    }

    GalleryImpl(String name, com.azure.resourcemanager.devcenter.DevCenterManager serviceManager) {
        this.innerObject = new GalleryInner();
        this.serviceManager = serviceManager;
        this.galleryName = name;
    }

    public GalleryImpl update() {
        return this;
    }

    public Gallery apply() {
        this.innerObject = serviceManager.serviceClient()
            .getGalleries()
            .createOrUpdate(resourceGroupName, devCenterName, galleryName, this.innerModel(), Context.NONE);
        return this;
    }

    public Gallery apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getGalleries()
            .createOrUpdate(resourceGroupName, devCenterName, galleryName, this.innerModel(), context);
        return this;
    }

    GalleryImpl(GalleryInner innerObject, com.azure.resourcemanager.devcenter.DevCenterManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.devCenterName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "devcenters");
        this.galleryName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "galleries");
    }

    public Gallery refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getGalleries()
            .getWithResponse(resourceGroupName, devCenterName, galleryName, Context.NONE)
            .getValue();
        return this;
    }

    public Gallery refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getGalleries()
            .getWithResponse(resourceGroupName, devCenterName, galleryName, context)
            .getValue();
        return this;
    }

    public GalleryImpl withGalleryResourceId(String galleryResourceId) {
        this.innerModel().withGalleryResourceId(galleryResourceId);
        return this;
    }
}
