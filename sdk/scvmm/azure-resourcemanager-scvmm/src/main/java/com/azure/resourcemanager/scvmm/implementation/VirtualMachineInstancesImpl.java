// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scvmm.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.scvmm.fluent.VirtualMachineInstancesClient;
import com.azure.resourcemanager.scvmm.fluent.models.VirtualMachineInstanceInner;
import com.azure.resourcemanager.scvmm.models.DeleteFromHost;
import com.azure.resourcemanager.scvmm.models.ForceDelete;
import com.azure.resourcemanager.scvmm.models.StopVirtualMachineOptions;
import com.azure.resourcemanager.scvmm.models.VirtualMachineCreateCheckpoint;
import com.azure.resourcemanager.scvmm.models.VirtualMachineDeleteCheckpoint;
import com.azure.resourcemanager.scvmm.models.VirtualMachineInstance;
import com.azure.resourcemanager.scvmm.models.VirtualMachineInstances;
import com.azure.resourcemanager.scvmm.models.VirtualMachineInstanceUpdate;
import com.azure.resourcemanager.scvmm.models.VirtualMachineRestoreCheckpoint;

public final class VirtualMachineInstancesImpl implements VirtualMachineInstances {
    private static final ClientLogger LOGGER = new ClientLogger(VirtualMachineInstancesImpl.class);

    private final VirtualMachineInstancesClient innerClient;

    private final com.azure.resourcemanager.scvmm.ScvmmManager serviceManager;

    public VirtualMachineInstancesImpl(VirtualMachineInstancesClient innerClient,
        com.azure.resourcemanager.scvmm.ScvmmManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<VirtualMachineInstance> list(String resourceUri) {
        PagedIterable<VirtualMachineInstanceInner> inner = this.serviceClient().list(resourceUri);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new VirtualMachineInstanceImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualMachineInstance> list(String resourceUri, Context context) {
        PagedIterable<VirtualMachineInstanceInner> inner = this.serviceClient().list(resourceUri, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new VirtualMachineInstanceImpl(inner1, this.manager()));
    }

    public Response<VirtualMachineInstance> getWithResponse(String resourceUri, Context context) {
        Response<VirtualMachineInstanceInner> inner = this.serviceClient().getWithResponse(resourceUri, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new VirtualMachineInstanceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public VirtualMachineInstance get(String resourceUri) {
        VirtualMachineInstanceInner inner = this.serviceClient().get(resourceUri);
        if (inner != null) {
            return new VirtualMachineInstanceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public VirtualMachineInstance createOrUpdate(String resourceUri, VirtualMachineInstanceInner resource) {
        VirtualMachineInstanceInner inner = this.serviceClient().createOrUpdate(resourceUri, resource);
        if (inner != null) {
            return new VirtualMachineInstanceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public VirtualMachineInstance createOrUpdate(String resourceUri, VirtualMachineInstanceInner resource,
        Context context) {
        VirtualMachineInstanceInner inner = this.serviceClient().createOrUpdate(resourceUri, resource, context);
        if (inner != null) {
            return new VirtualMachineInstanceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public VirtualMachineInstance update(String resourceUri, VirtualMachineInstanceUpdate properties) {
        VirtualMachineInstanceInner inner = this.serviceClient().update(resourceUri, properties);
        if (inner != null) {
            return new VirtualMachineInstanceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public VirtualMachineInstance update(String resourceUri, VirtualMachineInstanceUpdate properties, Context context) {
        VirtualMachineInstanceInner inner = this.serviceClient().update(resourceUri, properties, context);
        if (inner != null) {
            return new VirtualMachineInstanceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceUri) {
        this.serviceClient().delete(resourceUri);
    }

    public void delete(String resourceUri, ForceDelete force, DeleteFromHost deleteFromHost, Context context) {
        this.serviceClient().delete(resourceUri, force, deleteFromHost, context);
    }

    public void createCheckpoint(String resourceUri, VirtualMachineCreateCheckpoint body) {
        this.serviceClient().createCheckpoint(resourceUri, body);
    }

    public void createCheckpoint(String resourceUri, VirtualMachineCreateCheckpoint body, Context context) {
        this.serviceClient().createCheckpoint(resourceUri, body, context);
    }

    public void deleteCheckpoint(String resourceUri, VirtualMachineDeleteCheckpoint body) {
        this.serviceClient().deleteCheckpoint(resourceUri, body);
    }

    public void deleteCheckpoint(String resourceUri, VirtualMachineDeleteCheckpoint body, Context context) {
        this.serviceClient().deleteCheckpoint(resourceUri, body, context);
    }

    public void restart(String resourceUri) {
        this.serviceClient().restart(resourceUri);
    }

    public void restart(String resourceUri, Context context) {
        this.serviceClient().restart(resourceUri, context);
    }

    public void restoreCheckpoint(String resourceUri, VirtualMachineRestoreCheckpoint body) {
        this.serviceClient().restoreCheckpoint(resourceUri, body);
    }

    public void restoreCheckpoint(String resourceUri, VirtualMachineRestoreCheckpoint body, Context context) {
        this.serviceClient().restoreCheckpoint(resourceUri, body, context);
    }

    public void start(String resourceUri) {
        this.serviceClient().start(resourceUri);
    }

    public void start(String resourceUri, Context context) {
        this.serviceClient().start(resourceUri, context);
    }

    public void stop(String resourceUri, StopVirtualMachineOptions body) {
        this.serviceClient().stop(resourceUri, body);
    }

    public void stop(String resourceUri, StopVirtualMachineOptions body, Context context) {
        this.serviceClient().stop(resourceUri, body, context);
    }

    private VirtualMachineInstancesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.scvmm.ScvmmManager manager() {
        return this.serviceManager;
    }
}
