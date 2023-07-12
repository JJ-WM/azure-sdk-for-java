// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.networkcloud.fluent.KubernetesClustersClient;
import com.azure.resourcemanager.networkcloud.fluent.models.KubernetesClusterInner;
import com.azure.resourcemanager.networkcloud.models.KubernetesCluster;
import com.azure.resourcemanager.networkcloud.models.KubernetesClusterRestartNodeParameters;
import com.azure.resourcemanager.networkcloud.models.KubernetesClusters;

public final class KubernetesClustersImpl implements KubernetesClusters {
    private static final ClientLogger LOGGER = new ClientLogger(KubernetesClustersImpl.class);

    private final KubernetesClustersClient innerClient;

    private final com.azure.resourcemanager.networkcloud.NetworkCloudManager serviceManager;

    public KubernetesClustersImpl(
        KubernetesClustersClient innerClient,
        com.azure.resourcemanager.networkcloud.NetworkCloudManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<KubernetesCluster> list() {
        PagedIterable<KubernetesClusterInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new KubernetesClusterImpl(inner1, this.manager()));
    }

    public PagedIterable<KubernetesCluster> list(Context context) {
        PagedIterable<KubernetesClusterInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new KubernetesClusterImpl(inner1, this.manager()));
    }

    public PagedIterable<KubernetesCluster> listByResourceGroup(String resourceGroupName) {
        PagedIterable<KubernetesClusterInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new KubernetesClusterImpl(inner1, this.manager()));
    }

    public PagedIterable<KubernetesCluster> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<KubernetesClusterInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new KubernetesClusterImpl(inner1, this.manager()));
    }

    public Response<KubernetesCluster> getByResourceGroupWithResponse(
        String resourceGroupName, String kubernetesClusterName, Context context) {
        Response<KubernetesClusterInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, kubernetesClusterName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new KubernetesClusterImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public KubernetesCluster getByResourceGroup(String resourceGroupName, String kubernetesClusterName) {
        KubernetesClusterInner inner =
            this.serviceClient().getByResourceGroup(resourceGroupName, kubernetesClusterName);
        if (inner != null) {
            return new KubernetesClusterImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String kubernetesClusterName) {
        this.serviceClient().delete(resourceGroupName, kubernetesClusterName);
    }

    public void delete(String resourceGroupName, String kubernetesClusterName, Context context) {
        this.serviceClient().delete(resourceGroupName, kubernetesClusterName, context);
    }

    public void restartNode(
        String resourceGroupName,
        String kubernetesClusterName,
        KubernetesClusterRestartNodeParameters kubernetesClusterRestartNodeParameters) {
        this
            .serviceClient()
            .restartNode(resourceGroupName, kubernetesClusterName, kubernetesClusterRestartNodeParameters);
    }

    public void restartNode(
        String resourceGroupName,
        String kubernetesClusterName,
        KubernetesClusterRestartNodeParameters kubernetesClusterRestartNodeParameters,
        Context context) {
        this
            .serviceClient()
            .restartNode(resourceGroupName, kubernetesClusterName, kubernetesClusterRestartNodeParameters, context);
    }

    public KubernetesCluster getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String kubernetesClusterName = Utils.getValueFromIdByName(id, "kubernetesClusters");
        if (kubernetesClusterName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'kubernetesClusters'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, kubernetesClusterName, Context.NONE).getValue();
    }

    public Response<KubernetesCluster> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String kubernetesClusterName = Utils.getValueFromIdByName(id, "kubernetesClusters");
        if (kubernetesClusterName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'kubernetesClusters'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, kubernetesClusterName, context);
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
        String kubernetesClusterName = Utils.getValueFromIdByName(id, "kubernetesClusters");
        if (kubernetesClusterName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'kubernetesClusters'.", id)));
        }
        this.delete(resourceGroupName, kubernetesClusterName, Context.NONE);
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
        String kubernetesClusterName = Utils.getValueFromIdByName(id, "kubernetesClusters");
        if (kubernetesClusterName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'kubernetesClusters'.", id)));
        }
        this.delete(resourceGroupName, kubernetesClusterName, context);
    }

    private KubernetesClustersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.networkcloud.NetworkCloudManager manager() {
        return this.serviceManager;
    }

    public KubernetesClusterImpl define(String name) {
        return new KubernetesClusterImpl(name, this.manager());
    }
}
