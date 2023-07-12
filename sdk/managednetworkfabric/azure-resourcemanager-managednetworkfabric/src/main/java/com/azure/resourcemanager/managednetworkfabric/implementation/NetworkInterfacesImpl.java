// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.managednetworkfabric.fluent.NetworkInterfacesClient;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.InterfaceStatusInner;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.NetworkInterfaceInner;
import com.azure.resourcemanager.managednetworkfabric.models.InterfaceStatus;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkInterface;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkInterfaces;
import com.azure.resourcemanager.managednetworkfabric.models.UpdateAdministrativeState;

public final class NetworkInterfacesImpl implements NetworkInterfaces {
    private static final ClientLogger LOGGER = new ClientLogger(NetworkInterfacesImpl.class);

    private final NetworkInterfacesClient innerClient;

    private final com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager serviceManager;

    public NetworkInterfacesImpl(
        NetworkInterfacesClient innerClient,
        com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<NetworkInterface> getWithResponse(
        String resourceGroupName, String networkDeviceName, String networkInterfaceName, Context context) {
        Response<NetworkInterfaceInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, networkDeviceName, networkInterfaceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new NetworkInterfaceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public NetworkInterface get(String resourceGroupName, String networkDeviceName, String networkInterfaceName) {
        NetworkInterfaceInner inner =
            this.serviceClient().get(resourceGroupName, networkDeviceName, networkInterfaceName);
        if (inner != null) {
            return new NetworkInterfaceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String networkDeviceName, String networkInterfaceName) {
        this.serviceClient().delete(resourceGroupName, networkDeviceName, networkInterfaceName);
    }

    public void delete(
        String resourceGroupName, String networkDeviceName, String networkInterfaceName, Context context) {
        this.serviceClient().delete(resourceGroupName, networkDeviceName, networkInterfaceName, context);
    }

    public PagedIterable<NetworkInterface> list(String resourceGroupName, String networkDeviceName) {
        PagedIterable<NetworkInterfaceInner> inner = this.serviceClient().list(resourceGroupName, networkDeviceName);
        return Utils.mapPage(inner, inner1 -> new NetworkInterfaceImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkInterface> list(String resourceGroupName, String networkDeviceName, Context context) {
        PagedIterable<NetworkInterfaceInner> inner =
            this.serviceClient().list(resourceGroupName, networkDeviceName, context);
        return Utils.mapPage(inner, inner1 -> new NetworkInterfaceImpl(inner1, this.manager()));
    }

    public InterfaceStatus getStatus(String resourceGroupName, String networkDeviceName, String networkInterfaceName) {
        InterfaceStatusInner inner =
            this.serviceClient().getStatus(resourceGroupName, networkDeviceName, networkInterfaceName);
        if (inner != null) {
            return new InterfaceStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public InterfaceStatus getStatus(
        String resourceGroupName, String networkDeviceName, String networkInterfaceName, Context context) {
        InterfaceStatusInner inner =
            this.serviceClient().getStatus(resourceGroupName, networkDeviceName, networkInterfaceName, context);
        if (inner != null) {
            return new InterfaceStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void updateAdministrativeState(
        String resourceGroupName,
        String networkDeviceName,
        String networkInterfaceName,
        UpdateAdministrativeState body) {
        this
            .serviceClient()
            .updateAdministrativeState(resourceGroupName, networkDeviceName, networkInterfaceName, body);
    }

    public void updateAdministrativeState(
        String resourceGroupName,
        String networkDeviceName,
        String networkInterfaceName,
        UpdateAdministrativeState body,
        Context context) {
        this
            .serviceClient()
            .updateAdministrativeState(resourceGroupName, networkDeviceName, networkInterfaceName, body, context);
    }

    public NetworkInterface getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkDeviceName = Utils.getValueFromIdByName(id, "networkDevices");
        if (networkDeviceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'networkDevices'.", id)));
        }
        String networkInterfaceName = Utils.getValueFromIdByName(id, "networkInterfaces");
        if (networkInterfaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'networkInterfaces'.", id)));
        }
        return this
            .getWithResponse(resourceGroupName, networkDeviceName, networkInterfaceName, Context.NONE)
            .getValue();
    }

    public Response<NetworkInterface> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkDeviceName = Utils.getValueFromIdByName(id, "networkDevices");
        if (networkDeviceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'networkDevices'.", id)));
        }
        String networkInterfaceName = Utils.getValueFromIdByName(id, "networkInterfaces");
        if (networkInterfaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'networkInterfaces'.", id)));
        }
        return this.getWithResponse(resourceGroupName, networkDeviceName, networkInterfaceName, context);
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
        String networkDeviceName = Utils.getValueFromIdByName(id, "networkDevices");
        if (networkDeviceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'networkDevices'.", id)));
        }
        String networkInterfaceName = Utils.getValueFromIdByName(id, "networkInterfaces");
        if (networkInterfaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'networkInterfaces'.", id)));
        }
        this.delete(resourceGroupName, networkDeviceName, networkInterfaceName, Context.NONE);
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
        String networkDeviceName = Utils.getValueFromIdByName(id, "networkDevices");
        if (networkDeviceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'networkDevices'.", id)));
        }
        String networkInterfaceName = Utils.getValueFromIdByName(id, "networkInterfaces");
        if (networkInterfaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'networkInterfaces'.", id)));
        }
        this.delete(resourceGroupName, networkDeviceName, networkInterfaceName, context);
    }

    private NetworkInterfacesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager manager() {
        return this.serviceManager;
    }

    public NetworkInterfaceImpl define(String name) {
        return new NetworkInterfaceImpl(name, this.manager());
    }
}
