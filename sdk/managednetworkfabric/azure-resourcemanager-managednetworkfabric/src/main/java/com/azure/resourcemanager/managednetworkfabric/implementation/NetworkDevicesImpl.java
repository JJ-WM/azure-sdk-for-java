// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.managednetworkfabric.fluent.NetworkDevicesClient;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.GetDeviceStatusPropertiesInner;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.GetDynamicInterfaceMapsPropertiesItemInner;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.GetStaticInterfaceMapsPropertiesItemInner;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.NetworkDeviceInner;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.SupportPackagePropertiesInner;
import com.azure.resourcemanager.managednetworkfabric.models.GetDeviceStatusProperties;
import com.azure.resourcemanager.managednetworkfabric.models.GetDynamicInterfaceMapsPropertiesItem;
import com.azure.resourcemanager.managednetworkfabric.models.GetStaticInterfaceMapsPropertiesItem;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkDevice;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkDevices;
import com.azure.resourcemanager.managednetworkfabric.models.SupportPackageProperties;
import com.azure.resourcemanager.managednetworkfabric.models.UpdatePowerCycleProperties;
import com.azure.resourcemanager.managednetworkfabric.models.UpdateVersionProperties;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class NetworkDevicesImpl implements NetworkDevices {
    private static final ClientLogger LOGGER = new ClientLogger(NetworkDevicesImpl.class);

    private final NetworkDevicesClient innerClient;

    private final com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager serviceManager;

    public NetworkDevicesImpl(
        NetworkDevicesClient innerClient,
        com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<NetworkDevice> getByResourceGroupWithResponse(
        String resourceGroupName, String networkDeviceName, Context context) {
        Response<NetworkDeviceInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, networkDeviceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new NetworkDeviceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public NetworkDevice getByResourceGroup(String resourceGroupName, String networkDeviceName) {
        NetworkDeviceInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, networkDeviceName);
        if (inner != null) {
            return new NetworkDeviceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String networkDeviceName) {
        this.serviceClient().delete(resourceGroupName, networkDeviceName);
    }

    public void delete(String resourceGroupName, String networkDeviceName, Context context) {
        this.serviceClient().delete(resourceGroupName, networkDeviceName, context);
    }

    public PagedIterable<NetworkDevice> listByResourceGroup(String resourceGroupName) {
        PagedIterable<NetworkDeviceInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new NetworkDeviceImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkDevice> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<NetworkDeviceInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new NetworkDeviceImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkDevice> list() {
        PagedIterable<NetworkDeviceInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new NetworkDeviceImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkDevice> list(Context context) {
        PagedIterable<NetworkDeviceInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new NetworkDeviceImpl(inner1, this.manager()));
    }

    public void reboot(String resourceGroupName, String networkDeviceName) {
        this.serviceClient().reboot(resourceGroupName, networkDeviceName);
    }

    public void reboot(String resourceGroupName, String networkDeviceName, Context context) {
        this.serviceClient().reboot(resourceGroupName, networkDeviceName, context);
    }

    public void restoreConfig(String resourceGroupName, String networkDeviceName) {
        this.serviceClient().restoreConfig(resourceGroupName, networkDeviceName);
    }

    public void restoreConfig(String resourceGroupName, String networkDeviceName, Context context) {
        this.serviceClient().restoreConfig(resourceGroupName, networkDeviceName, context);
    }

    public void updateVersion(String resourceGroupName, String networkDeviceName, UpdateVersionProperties body) {
        this.serviceClient().updateVersion(resourceGroupName, networkDeviceName, body);
    }

    public void updateVersion(
        String resourceGroupName, String networkDeviceName, UpdateVersionProperties body, Context context) {
        this.serviceClient().updateVersion(resourceGroupName, networkDeviceName, body, context);
    }

    public SupportPackageProperties generateSupportPackage(String resourceGroupName, String networkDeviceName) {
        SupportPackagePropertiesInner inner =
            this.serviceClient().generateSupportPackage(resourceGroupName, networkDeviceName);
        if (inner != null) {
            return new SupportPackagePropertiesImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public SupportPackageProperties generateSupportPackage(
        String resourceGroupName, String networkDeviceName, Context context) {
        SupportPackagePropertiesInner inner =
            this.serviceClient().generateSupportPackage(resourceGroupName, networkDeviceName, context);
        if (inner != null) {
            return new SupportPackagePropertiesImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void updatePowerCycle(String resourceGroupName, String networkDeviceName, UpdatePowerCycleProperties body) {
        this.serviceClient().updatePowerCycle(resourceGroupName, networkDeviceName, body);
    }

    public void updatePowerCycle(
        String resourceGroupName, String networkDeviceName, UpdatePowerCycleProperties body, Context context) {
        this.serviceClient().updatePowerCycle(resourceGroupName, networkDeviceName, body, context);
    }

    public GetDeviceStatusProperties getStatus(String resourceGroupName, String networkDeviceName) {
        GetDeviceStatusPropertiesInner inner = this.serviceClient().getStatus(resourceGroupName, networkDeviceName);
        if (inner != null) {
            return new GetDeviceStatusPropertiesImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public GetDeviceStatusProperties getStatus(String resourceGroupName, String networkDeviceName, Context context) {
        GetDeviceStatusPropertiesInner inner =
            this.serviceClient().getStatus(resourceGroupName, networkDeviceName, context);
        if (inner != null) {
            return new GetDeviceStatusPropertiesImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public List<GetStaticInterfaceMapsPropertiesItem> getStaticInterfaceMaps(
        String resourceGroupName, String networkDeviceName) {
        List<GetStaticInterfaceMapsPropertiesItemInner> inner =
            this.serviceClient().getStaticInterfaceMaps(resourceGroupName, networkDeviceName);
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new GetStaticInterfaceMapsPropertiesItemImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public List<GetStaticInterfaceMapsPropertiesItem> getStaticInterfaceMaps(
        String resourceGroupName, String networkDeviceName, Context context) {
        List<GetStaticInterfaceMapsPropertiesItemInner> inner =
            this.serviceClient().getStaticInterfaceMaps(resourceGroupName, networkDeviceName, context);
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new GetStaticInterfaceMapsPropertiesItemImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public List<GetDynamicInterfaceMapsPropertiesItem> getDynamicInterfaceMaps(
        String resourceGroupName, String networkDeviceName) {
        List<GetDynamicInterfaceMapsPropertiesItemInner> inner =
            this.serviceClient().getDynamicInterfaceMaps(resourceGroupName, networkDeviceName);
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new GetDynamicInterfaceMapsPropertiesItemImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public List<GetDynamicInterfaceMapsPropertiesItem> getDynamicInterfaceMaps(
        String resourceGroupName, String networkDeviceName, Context context) {
        List<GetDynamicInterfaceMapsPropertiesItemInner> inner =
            this.serviceClient().getDynamicInterfaceMaps(resourceGroupName, networkDeviceName, context);
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new GetDynamicInterfaceMapsPropertiesItemImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public NetworkDevice getById(String id) {
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
        return this.getByResourceGroupWithResponse(resourceGroupName, networkDeviceName, Context.NONE).getValue();
    }

    public Response<NetworkDevice> getByIdWithResponse(String id, Context context) {
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
        return this.getByResourceGroupWithResponse(resourceGroupName, networkDeviceName, context);
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
        this.delete(resourceGroupName, networkDeviceName, Context.NONE);
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
        this.delete(resourceGroupName, networkDeviceName, context);
    }

    private NetworkDevicesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager manager() {
        return this.serviceManager;
    }

    public NetworkDeviceImpl define(String name) {
        return new NetworkDeviceImpl(name, this.manager());
    }
}
