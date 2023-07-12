// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcehealth.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.resourcehealth.fluent.ImpactedResourcesClient;
import com.azure.resourcemanager.resourcehealth.fluent.models.EventImpactedResourceInner;
import com.azure.resourcemanager.resourcehealth.models.EventImpactedResource;
import com.azure.resourcemanager.resourcehealth.models.ImpactedResources;

public final class ImpactedResourcesImpl implements ImpactedResources {
    private static final ClientLogger LOGGER = new ClientLogger(ImpactedResourcesImpl.class);

    private final ImpactedResourcesClient innerClient;

    private final com.azure.resourcemanager.resourcehealth.ResourceHealthManager serviceManager;

    public ImpactedResourcesImpl(
        ImpactedResourcesClient innerClient,
        com.azure.resourcemanager.resourcehealth.ResourceHealthManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<EventImpactedResource> listBySubscriptionIdAndEventId(String eventTrackingId) {
        PagedIterable<EventImpactedResourceInner> inner =
            this.serviceClient().listBySubscriptionIdAndEventId(eventTrackingId);
        return Utils.mapPage(inner, inner1 -> new EventImpactedResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<EventImpactedResource> listBySubscriptionIdAndEventId(
        String eventTrackingId, String filter, Context context) {
        PagedIterable<EventImpactedResourceInner> inner =
            this.serviceClient().listBySubscriptionIdAndEventId(eventTrackingId, filter, context);
        return Utils.mapPage(inner, inner1 -> new EventImpactedResourceImpl(inner1, this.manager()));
    }

    public Response<EventImpactedResource> getWithResponse(
        String eventTrackingId, String impactedResourceName, Context context) {
        Response<EventImpactedResourceInner> inner =
            this.serviceClient().getWithResponse(eventTrackingId, impactedResourceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new EventImpactedResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public EventImpactedResource get(String eventTrackingId, String impactedResourceName) {
        EventImpactedResourceInner inner = this.serviceClient().get(eventTrackingId, impactedResourceName);
        if (inner != null) {
            return new EventImpactedResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<EventImpactedResource> listByTenantIdAndEventId(String eventTrackingId) {
        PagedIterable<EventImpactedResourceInner> inner =
            this.serviceClient().listByTenantIdAndEventId(eventTrackingId);
        return Utils.mapPage(inner, inner1 -> new EventImpactedResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<EventImpactedResource> listByTenantIdAndEventId(
        String eventTrackingId, String filter, Context context) {
        PagedIterable<EventImpactedResourceInner> inner =
            this.serviceClient().listByTenantIdAndEventId(eventTrackingId, filter, context);
        return Utils.mapPage(inner, inner1 -> new EventImpactedResourceImpl(inner1, this.manager()));
    }

    public Response<EventImpactedResource> getByTenantIdWithResponse(
        String eventTrackingId, String impactedResourceName, Context context) {
        Response<EventImpactedResourceInner> inner =
            this.serviceClient().getByTenantIdWithResponse(eventTrackingId, impactedResourceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new EventImpactedResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public EventImpactedResource getByTenantId(String eventTrackingId, String impactedResourceName) {
        EventImpactedResourceInner inner = this.serviceClient().getByTenantId(eventTrackingId, impactedResourceName);
        if (inner != null) {
            return new EventImpactedResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private ImpactedResourcesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.resourcehealth.ResourceHealthManager manager() {
        return this.serviceManager;
    }
}
