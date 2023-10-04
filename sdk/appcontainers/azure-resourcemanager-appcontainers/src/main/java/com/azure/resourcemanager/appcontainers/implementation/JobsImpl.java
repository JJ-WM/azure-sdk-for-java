// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appcontainers.fluent.JobsClient;
import com.azure.resourcemanager.appcontainers.fluent.models.ContainerAppJobExecutionsInner;
import com.azure.resourcemanager.appcontainers.fluent.models.JobExecutionBaseInner;
import com.azure.resourcemanager.appcontainers.fluent.models.JobInner;
import com.azure.resourcemanager.appcontainers.fluent.models.JobSecretsCollectionInner;
import com.azure.resourcemanager.appcontainers.models.ContainerAppJobExecutions;
import com.azure.resourcemanager.appcontainers.models.Job;
import com.azure.resourcemanager.appcontainers.models.JobExecutionBase;
import com.azure.resourcemanager.appcontainers.models.JobExecutionTemplate;
import com.azure.resourcemanager.appcontainers.models.JobSecretsCollection;
import com.azure.resourcemanager.appcontainers.models.Jobs;

public final class JobsImpl implements Jobs {
    private static final ClientLogger LOGGER = new ClientLogger(JobsImpl.class);

    private final JobsClient innerClient;

    private final com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager;

    public JobsImpl(
        JobsClient innerClient, com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Job> list() {
        PagedIterable<JobInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new JobImpl(inner1, this.manager()));
    }

    public PagedIterable<Job> list(Context context) {
        PagedIterable<JobInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new JobImpl(inner1, this.manager()));
    }

    public PagedIterable<Job> listByResourceGroup(String resourceGroupName) {
        PagedIterable<JobInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new JobImpl(inner1, this.manager()));
    }

    public PagedIterable<Job> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<JobInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new JobImpl(inner1, this.manager()));
    }

    public Response<Job> getByResourceGroupWithResponse(String resourceGroupName, String jobName, Context context) {
        Response<JobInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, jobName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new JobImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Job getByResourceGroup(String resourceGroupName, String jobName) {
        JobInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, jobName);
        if (inner != null) {
            return new JobImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String jobName) {
        this.serviceClient().delete(resourceGroupName, jobName);
    }

    public void delete(String resourceGroupName, String jobName, Context context) {
        this.serviceClient().delete(resourceGroupName, jobName, context);
    }

    public JobExecutionBase start(String resourceGroupName, String jobName) {
        JobExecutionBaseInner inner = this.serviceClient().start(resourceGroupName, jobName);
        if (inner != null) {
            return new JobExecutionBaseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public JobExecutionBase start(
        String resourceGroupName, String jobName, JobExecutionTemplate template, Context context) {
        JobExecutionBaseInner inner = this.serviceClient().start(resourceGroupName, jobName, template, context);
        if (inner != null) {
            return new JobExecutionBaseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void stopExecution(String resourceGroupName, String jobName, String jobExecutionName) {
        this.serviceClient().stopExecution(resourceGroupName, jobName, jobExecutionName);
    }

    public void stopExecution(String resourceGroupName, String jobName, String jobExecutionName, Context context) {
        this.serviceClient().stopExecution(resourceGroupName, jobName, jobExecutionName, context);
    }

    public ContainerAppJobExecutions stopMultipleExecutions(String resourceGroupName, String jobName) {
        ContainerAppJobExecutionsInner inner = this.serviceClient().stopMultipleExecutions(resourceGroupName, jobName);
        if (inner != null) {
            return new ContainerAppJobExecutionsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ContainerAppJobExecutions stopMultipleExecutions(String resourceGroupName, String jobName, Context context) {
        ContainerAppJobExecutionsInner inner =
            this.serviceClient().stopMultipleExecutions(resourceGroupName, jobName, context);
        if (inner != null) {
            return new ContainerAppJobExecutionsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<JobSecretsCollection> listSecretsWithResponse(
        String resourceGroupName, String jobName, Context context) {
        Response<JobSecretsCollectionInner> inner =
            this.serviceClient().listSecretsWithResponse(resourceGroupName, jobName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new JobSecretsCollectionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public JobSecretsCollection listSecrets(String resourceGroupName, String jobName) {
        JobSecretsCollectionInner inner = this.serviceClient().listSecrets(resourceGroupName, jobName);
        if (inner != null) {
            return new JobSecretsCollectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Job getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String jobName = Utils.getValueFromIdByName(id, "jobs");
        if (jobName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'jobs'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, jobName, Context.NONE).getValue();
    }

    public Response<Job> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String jobName = Utils.getValueFromIdByName(id, "jobs");
        if (jobName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'jobs'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, jobName, context);
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
        String jobName = Utils.getValueFromIdByName(id, "jobs");
        if (jobName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'jobs'.", id)));
        }
        this.delete(resourceGroupName, jobName, Context.NONE);
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
        String jobName = Utils.getValueFromIdByName(id, "jobs");
        if (jobName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'jobs'.", id)));
        }
        this.delete(resourceGroupName, jobName, context);
    }

    private JobsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager() {
        return this.serviceManager;
    }

    public JobImpl define(String name) {
        return new JobImpl(name, this.manager());
    }
}
