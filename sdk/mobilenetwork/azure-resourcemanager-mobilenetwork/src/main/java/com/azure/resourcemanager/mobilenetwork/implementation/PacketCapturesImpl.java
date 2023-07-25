// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mobilenetwork.fluent.PacketCapturesClient;
import com.azure.resourcemanager.mobilenetwork.fluent.models.AsyncOperationStatusInner;
import com.azure.resourcemanager.mobilenetwork.fluent.models.PacketCaptureInner;
import com.azure.resourcemanager.mobilenetwork.models.AsyncOperationStatus;
import com.azure.resourcemanager.mobilenetwork.models.PacketCapture;
import com.azure.resourcemanager.mobilenetwork.models.PacketCaptures;

public final class PacketCapturesImpl implements PacketCaptures {
    private static final ClientLogger LOGGER = new ClientLogger(PacketCapturesImpl.class);

    private final PacketCapturesClient innerClient;

    private final com.azure.resourcemanager.mobilenetwork.MobileNetworkManager serviceManager;

    public PacketCapturesImpl(
        PacketCapturesClient innerClient, com.azure.resourcemanager.mobilenetwork.MobileNetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<PacketCapture> getWithResponse(
        String resourceGroupName, String packetCoreControlPlaneName, String packetCaptureName, Context context) {
        Response<PacketCaptureInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, packetCoreControlPlaneName, packetCaptureName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PacketCaptureImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PacketCapture get(String resourceGroupName, String packetCoreControlPlaneName, String packetCaptureName) {
        PacketCaptureInner inner =
            this.serviceClient().get(resourceGroupName, packetCoreControlPlaneName, packetCaptureName);
        if (inner != null) {
            return new PacketCaptureImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String packetCoreControlPlaneName, String packetCaptureName) {
        this.serviceClient().delete(resourceGroupName, packetCoreControlPlaneName, packetCaptureName);
    }

    public void delete(
        String resourceGroupName, String packetCoreControlPlaneName, String packetCaptureName, Context context) {
        this.serviceClient().delete(resourceGroupName, packetCoreControlPlaneName, packetCaptureName, context);
    }

    public AsyncOperationStatus stop(
        String resourceGroupName, String packetCoreControlPlaneName, String packetCaptureName) {
        AsyncOperationStatusInner inner =
            this.serviceClient().stop(resourceGroupName, packetCoreControlPlaneName, packetCaptureName);
        if (inner != null) {
            return new AsyncOperationStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public AsyncOperationStatus stop(
        String resourceGroupName, String packetCoreControlPlaneName, String packetCaptureName, Context context) {
        AsyncOperationStatusInner inner =
            this.serviceClient().stop(resourceGroupName, packetCoreControlPlaneName, packetCaptureName, context);
        if (inner != null) {
            return new AsyncOperationStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<PacketCapture> listByPacketCoreControlPlane(
        String resourceGroupName, String packetCoreControlPlaneName) {
        PagedIterable<PacketCaptureInner> inner =
            this.serviceClient().listByPacketCoreControlPlane(resourceGroupName, packetCoreControlPlaneName);
        return Utils.mapPage(inner, inner1 -> new PacketCaptureImpl(inner1, this.manager()));
    }

    public PagedIterable<PacketCapture> listByPacketCoreControlPlane(
        String resourceGroupName, String packetCoreControlPlaneName, Context context) {
        PagedIterable<PacketCaptureInner> inner =
            this.serviceClient().listByPacketCoreControlPlane(resourceGroupName, packetCoreControlPlaneName, context);
        return Utils.mapPage(inner, inner1 -> new PacketCaptureImpl(inner1, this.manager()));
    }

    public PacketCapture getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String packetCoreControlPlaneName = Utils.getValueFromIdByName(id, "packetCoreControlPlanes");
        if (packetCoreControlPlaneName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'packetCoreControlPlanes'.",
                                id)));
        }
        String packetCaptureName = Utils.getValueFromIdByName(id, "packetCaptures");
        if (packetCaptureName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'packetCaptures'.", id)));
        }
        return this
            .getWithResponse(resourceGroupName, packetCoreControlPlaneName, packetCaptureName, Context.NONE)
            .getValue();
    }

    public Response<PacketCapture> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String packetCoreControlPlaneName = Utils.getValueFromIdByName(id, "packetCoreControlPlanes");
        if (packetCoreControlPlaneName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'packetCoreControlPlanes'.",
                                id)));
        }
        String packetCaptureName = Utils.getValueFromIdByName(id, "packetCaptures");
        if (packetCaptureName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'packetCaptures'.", id)));
        }
        return this.getWithResponse(resourceGroupName, packetCoreControlPlaneName, packetCaptureName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String packetCoreControlPlaneName = Utils.getValueFromIdByName(id, "packetCoreControlPlanes");
        if (packetCoreControlPlaneName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'packetCoreControlPlanes'.",
                                id)));
        }
        String packetCaptureName = Utils.getValueFromIdByName(id, "packetCaptures");
        if (packetCaptureName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'packetCaptures'.", id)));
        }
        this.delete(resourceGroupName, packetCoreControlPlaneName, packetCaptureName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String packetCoreControlPlaneName = Utils.getValueFromIdByName(id, "packetCoreControlPlanes");
        if (packetCoreControlPlaneName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'packetCoreControlPlanes'.",
                                id)));
        }
        String packetCaptureName = Utils.getValueFromIdByName(id, "packetCaptures");
        if (packetCaptureName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'packetCaptures'.", id)));
        }
        this.delete(resourceGroupName, packetCoreControlPlaneName, packetCaptureName, context);
    }

    private PacketCapturesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.mobilenetwork.MobileNetworkManager manager() {
        return this.serviceManager;
    }

    public PacketCaptureImpl define(String name) {
        return new PacketCaptureImpl(name, this.manager());
    }
}
