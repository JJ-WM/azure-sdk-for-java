// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.mobilenetwork.fluent.models.ExtendedUeInfoInner;
import com.azure.resourcemanager.mobilenetwork.models.ExtendedUeInfo;
import com.azure.resourcemanager.mobilenetwork.models.ExtendedUeInfoProperties;

public final class ExtendedUeInfoImpl implements ExtendedUeInfo {
    private ExtendedUeInfoInner innerObject;

    private final com.azure.resourcemanager.mobilenetwork.MobileNetworkManager serviceManager;

    ExtendedUeInfoImpl(ExtendedUeInfoInner innerObject,
        com.azure.resourcemanager.mobilenetwork.MobileNetworkManager serviceManager) {
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

    public ExtendedUeInfoProperties properties() {
        return this.innerModel().properties();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public ExtendedUeInfoInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.mobilenetwork.MobileNetworkManager manager() {
        return this.serviceManager;
    }
}
