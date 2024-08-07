// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabricmanagedclusters.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.servicefabricmanagedclusters.fluent.NodeTypesClient;
import com.azure.resourcemanager.servicefabricmanagedclusters.fluent.models.NodeTypeInner;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.NodeType;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.NodeTypeActionParameters;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.NodeTypes;

public final class NodeTypesImpl implements NodeTypes {
    private static final ClientLogger LOGGER = new ClientLogger(NodeTypesImpl.class);

    private final NodeTypesClient innerClient;

    private final com.azure.resourcemanager.servicefabricmanagedclusters.ServiceFabricManagedClustersManager serviceManager;

    public NodeTypesImpl(NodeTypesClient innerClient,
        com.azure.resourcemanager.servicefabricmanagedclusters.ServiceFabricManagedClustersManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<NodeType> listByManagedClusters(String resourceGroupName, String clusterName) {
        PagedIterable<NodeTypeInner> inner = this.serviceClient().listByManagedClusters(resourceGroupName, clusterName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new NodeTypeImpl(inner1, this.manager()));
    }

    public PagedIterable<NodeType> listByManagedClusters(String resourceGroupName, String clusterName,
        Context context) {
        PagedIterable<NodeTypeInner> inner
            = this.serviceClient().listByManagedClusters(resourceGroupName, clusterName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new NodeTypeImpl(inner1, this.manager()));
    }

    public void restart(String resourceGroupName, String clusterName, String nodeTypeName,
        NodeTypeActionParameters parameters) {
        this.serviceClient().restart(resourceGroupName, clusterName, nodeTypeName, parameters);
    }

    public void restart(String resourceGroupName, String clusterName, String nodeTypeName,
        NodeTypeActionParameters parameters, Context context) {
        this.serviceClient().restart(resourceGroupName, clusterName, nodeTypeName, parameters, context);
    }

    public void reimage(String resourceGroupName, String clusterName, String nodeTypeName,
        NodeTypeActionParameters parameters) {
        this.serviceClient().reimage(resourceGroupName, clusterName, nodeTypeName, parameters);
    }

    public void reimage(String resourceGroupName, String clusterName, String nodeTypeName,
        NodeTypeActionParameters parameters, Context context) {
        this.serviceClient().reimage(resourceGroupName, clusterName, nodeTypeName, parameters, context);
    }

    public void deleteNode(String resourceGroupName, String clusterName, String nodeTypeName,
        NodeTypeActionParameters parameters) {
        this.serviceClient().deleteNode(resourceGroupName, clusterName, nodeTypeName, parameters);
    }

    public void deleteNode(String resourceGroupName, String clusterName, String nodeTypeName,
        NodeTypeActionParameters parameters, Context context) {
        this.serviceClient().deleteNode(resourceGroupName, clusterName, nodeTypeName, parameters, context);
    }

    public Response<NodeType> getWithResponse(String resourceGroupName, String clusterName, String nodeTypeName,
        Context context) {
        Response<NodeTypeInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, clusterName, nodeTypeName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new NodeTypeImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public NodeType get(String resourceGroupName, String clusterName, String nodeTypeName) {
        NodeTypeInner inner = this.serviceClient().get(resourceGroupName, clusterName, nodeTypeName);
        if (inner != null) {
            return new NodeTypeImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String clusterName, String nodeTypeName) {
        this.serviceClient().delete(resourceGroupName, clusterName, nodeTypeName);
    }

    public void delete(String resourceGroupName, String clusterName, String nodeTypeName, Context context) {
        this.serviceClient().delete(resourceGroupName, clusterName, nodeTypeName, context);
    }

    public NodeType getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = ResourceManagerUtils.getValueFromIdByName(id, "managedClusters");
        if (clusterName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'managedClusters'.", id)));
        }
        String nodeTypeName = ResourceManagerUtils.getValueFromIdByName(id, "nodeTypes");
        if (nodeTypeName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'nodeTypes'.", id)));
        }
        return this.getWithResponse(resourceGroupName, clusterName, nodeTypeName, Context.NONE).getValue();
    }

    public Response<NodeType> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = ResourceManagerUtils.getValueFromIdByName(id, "managedClusters");
        if (clusterName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'managedClusters'.", id)));
        }
        String nodeTypeName = ResourceManagerUtils.getValueFromIdByName(id, "nodeTypes");
        if (nodeTypeName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'nodeTypes'.", id)));
        }
        return this.getWithResponse(resourceGroupName, clusterName, nodeTypeName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = ResourceManagerUtils.getValueFromIdByName(id, "managedClusters");
        if (clusterName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'managedClusters'.", id)));
        }
        String nodeTypeName = ResourceManagerUtils.getValueFromIdByName(id, "nodeTypes");
        if (nodeTypeName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'nodeTypes'.", id)));
        }
        this.delete(resourceGroupName, clusterName, nodeTypeName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = ResourceManagerUtils.getValueFromIdByName(id, "managedClusters");
        if (clusterName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'managedClusters'.", id)));
        }
        String nodeTypeName = ResourceManagerUtils.getValueFromIdByName(id, "nodeTypes");
        if (nodeTypeName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'nodeTypes'.", id)));
        }
        this.delete(resourceGroupName, clusterName, nodeTypeName, context);
    }

    private NodeTypesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.servicefabricmanagedclusters.ServiceFabricManagedClustersManager manager() {
        return this.serviceManager;
    }

    public NodeTypeImpl define(String name) {
        return new NodeTypeImpl(name, this.manager());
    }
}
