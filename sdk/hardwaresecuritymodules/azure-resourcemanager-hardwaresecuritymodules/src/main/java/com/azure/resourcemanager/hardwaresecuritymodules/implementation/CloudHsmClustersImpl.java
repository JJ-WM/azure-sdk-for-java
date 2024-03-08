// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hardwaresecuritymodules.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hardwaresecuritymodules.fluent.CloudHsmClustersClient;
import com.azure.resourcemanager.hardwaresecuritymodules.fluent.models.CloudHsmClusterInner;
import com.azure.resourcemanager.hardwaresecuritymodules.models.CloudHsmCluster;
import com.azure.resourcemanager.hardwaresecuritymodules.models.CloudHsmClusters;

public final class CloudHsmClustersImpl implements CloudHsmClusters {
    private static final ClientLogger LOGGER = new ClientLogger(CloudHsmClustersImpl.class);

    private final CloudHsmClustersClient innerClient;

    private final com.azure.resourcemanager.hardwaresecuritymodules.HardwareSecurityModulesManager serviceManager;

    public CloudHsmClustersImpl(CloudHsmClustersClient innerClient,
        com.azure.resourcemanager.hardwaresecuritymodules.HardwareSecurityModulesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<CloudHsmCluster> getByResourceGroupWithResponse(String resourceGroupName,
        String cloudHsmClusterName, Context context) {
        Response<CloudHsmClusterInner> inner
            = this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, cloudHsmClusterName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new CloudHsmClusterImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public CloudHsmCluster getByResourceGroup(String resourceGroupName, String cloudHsmClusterName) {
        CloudHsmClusterInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, cloudHsmClusterName);
        if (inner != null) {
            return new CloudHsmClusterImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String cloudHsmClusterName) {
        this.serviceClient().delete(resourceGroupName, cloudHsmClusterName);
    }

    public void delete(String resourceGroupName, String cloudHsmClusterName, Context context) {
        this.serviceClient().delete(resourceGroupName, cloudHsmClusterName, context);
    }

    public PagedIterable<CloudHsmCluster> listByResourceGroup(String resourceGroupName) {
        PagedIterable<CloudHsmClusterInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new CloudHsmClusterImpl(inner1, this.manager()));
    }

    public PagedIterable<CloudHsmCluster> listByResourceGroup(String resourceGroupName, String skiptoken,
        Context context) {
        PagedIterable<CloudHsmClusterInner> inner
            = this.serviceClient().listByResourceGroup(resourceGroupName, skiptoken, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new CloudHsmClusterImpl(inner1, this.manager()));
    }

    public PagedIterable<CloudHsmCluster> list() {
        PagedIterable<CloudHsmClusterInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new CloudHsmClusterImpl(inner1, this.manager()));
    }

    public PagedIterable<CloudHsmCluster> list(String skiptoken, Context context) {
        PagedIterable<CloudHsmClusterInner> inner = this.serviceClient().list(skiptoken, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new CloudHsmClusterImpl(inner1, this.manager()));
    }

    public CloudHsmCluster getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String cloudHsmClusterName = ResourceManagerUtils.getValueFromIdByName(id, "cloudHsmClusters");
        if (cloudHsmClusterName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'cloudHsmClusters'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, cloudHsmClusterName, Context.NONE).getValue();
    }

    public Response<CloudHsmCluster> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String cloudHsmClusterName = ResourceManagerUtils.getValueFromIdByName(id, "cloudHsmClusters");
        if (cloudHsmClusterName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'cloudHsmClusters'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, cloudHsmClusterName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String cloudHsmClusterName = ResourceManagerUtils.getValueFromIdByName(id, "cloudHsmClusters");
        if (cloudHsmClusterName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'cloudHsmClusters'.", id)));
        }
        this.delete(resourceGroupName, cloudHsmClusterName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String cloudHsmClusterName = ResourceManagerUtils.getValueFromIdByName(id, "cloudHsmClusters");
        if (cloudHsmClusterName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'cloudHsmClusters'.", id)));
        }
        this.delete(resourceGroupName, cloudHsmClusterName, context);
    }

    private CloudHsmClustersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.hardwaresecuritymodules.HardwareSecurityModulesManager manager() {
        return this.serviceManager;
    }

    public CloudHsmClusterImpl define(String name) {
        return new CloudHsmClusterImpl(name, this.manager());
    }
}
