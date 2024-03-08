// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.nginx.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.nginx.fluent.ConfigurationsClient;
import com.azure.resourcemanager.nginx.fluent.models.NginxConfigurationInner;
import com.azure.resourcemanager.nginx.models.Configurations;
import com.azure.resourcemanager.nginx.models.NginxConfiguration;

public final class ConfigurationsImpl implements Configurations {
    private static final ClientLogger LOGGER = new ClientLogger(ConfigurationsImpl.class);

    private final ConfigurationsClient innerClient;

    private final com.azure.resourcemanager.nginx.NginxManager serviceManager;

    public ConfigurationsImpl(ConfigurationsClient innerClient,
        com.azure.resourcemanager.nginx.NginxManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<NginxConfiguration> list(String resourceGroupName, String deploymentName) {
        PagedIterable<NginxConfigurationInner> inner = this.serviceClient().list(resourceGroupName, deploymentName);
        return Utils.mapPage(inner, inner1 -> new NginxConfigurationImpl(inner1, this.manager()));
    }

    public PagedIterable<NginxConfiguration> list(String resourceGroupName, String deploymentName, Context context) {
        PagedIterable<NginxConfigurationInner> inner
            = this.serviceClient().list(resourceGroupName, deploymentName, context);
        return Utils.mapPage(inner, inner1 -> new NginxConfigurationImpl(inner1, this.manager()));
    }

    public Response<NginxConfiguration> getWithResponse(String resourceGroupName, String deploymentName,
        String configurationName, Context context) {
        Response<NginxConfigurationInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, deploymentName, configurationName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new NginxConfigurationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public NginxConfiguration get(String resourceGroupName, String deploymentName, String configurationName) {
        NginxConfigurationInner inner = this.serviceClient().get(resourceGroupName, deploymentName, configurationName);
        if (inner != null) {
            return new NginxConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String deploymentName, String configurationName) {
        this.serviceClient().delete(resourceGroupName, deploymentName, configurationName);
    }

    public void delete(String resourceGroupName, String deploymentName, String configurationName, Context context) {
        this.serviceClient().delete(resourceGroupName, deploymentName, configurationName, context);
    }

    public NginxConfiguration getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String deploymentName = Utils.getValueFromIdByName(id, "nginxDeployments");
        if (deploymentName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'nginxDeployments'.", id)));
        }
        String configurationName = Utils.getValueFromIdByName(id, "configurations");
        if (configurationName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'configurations'.", id)));
        }
        return this.getWithResponse(resourceGroupName, deploymentName, configurationName, Context.NONE).getValue();
    }

    public Response<NginxConfiguration> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String deploymentName = Utils.getValueFromIdByName(id, "nginxDeployments");
        if (deploymentName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'nginxDeployments'.", id)));
        }
        String configurationName = Utils.getValueFromIdByName(id, "configurations");
        if (configurationName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'configurations'.", id)));
        }
        return this.getWithResponse(resourceGroupName, deploymentName, configurationName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String deploymentName = Utils.getValueFromIdByName(id, "nginxDeployments");
        if (deploymentName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'nginxDeployments'.", id)));
        }
        String configurationName = Utils.getValueFromIdByName(id, "configurations");
        if (configurationName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'configurations'.", id)));
        }
        this.delete(resourceGroupName, deploymentName, configurationName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String deploymentName = Utils.getValueFromIdByName(id, "nginxDeployments");
        if (deploymentName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'nginxDeployments'.", id)));
        }
        String configurationName = Utils.getValueFromIdByName(id, "configurations");
        if (configurationName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'configurations'.", id)));
        }
        this.delete(resourceGroupName, deploymentName, configurationName, context);
    }

    private ConfigurationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.nginx.NginxManager manager() {
        return this.serviceManager;
    }

    public NginxConfigurationImpl define(String name) {
        return new NginxConfigurationImpl(name, this.manager());
    }
}
