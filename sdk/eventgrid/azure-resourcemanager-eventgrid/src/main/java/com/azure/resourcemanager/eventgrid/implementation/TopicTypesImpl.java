// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.eventgrid.fluent.TopicTypesClient;
import com.azure.resourcemanager.eventgrid.fluent.models.EventTypeInner;
import com.azure.resourcemanager.eventgrid.fluent.models.TopicTypeInfoInner;
import com.azure.resourcemanager.eventgrid.models.EventType;
import com.azure.resourcemanager.eventgrid.models.TopicTypeInfo;
import com.azure.resourcemanager.eventgrid.models.TopicTypes;

public final class TopicTypesImpl implements TopicTypes {
    private static final ClientLogger LOGGER = new ClientLogger(TopicTypesImpl.class);

    private final TopicTypesClient innerClient;

    private final com.azure.resourcemanager.eventgrid.EventGridManager serviceManager;

    public TopicTypesImpl(
        TopicTypesClient innerClient, com.azure.resourcemanager.eventgrid.EventGridManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<TopicTypeInfo> list() {
        PagedIterable<TopicTypeInfoInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new TopicTypeInfoImpl(inner1, this.manager()));
    }

    public PagedIterable<TopicTypeInfo> list(Context context) {
        PagedIterable<TopicTypeInfoInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new TopicTypeInfoImpl(inner1, this.manager()));
    }

    public Response<TopicTypeInfo> getWithResponse(String topicTypeName, Context context) {
        Response<TopicTypeInfoInner> inner = this.serviceClient().getWithResponse(topicTypeName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new TopicTypeInfoImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public TopicTypeInfo get(String topicTypeName) {
        TopicTypeInfoInner inner = this.serviceClient().get(topicTypeName);
        if (inner != null) {
            return new TopicTypeInfoImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<EventType> listEventTypes(String topicTypeName) {
        PagedIterable<EventTypeInner> inner = this.serviceClient().listEventTypes(topicTypeName);
        return Utils.mapPage(inner, inner1 -> new EventTypeImpl(inner1, this.manager()));
    }

    public PagedIterable<EventType> listEventTypes(String topicTypeName, Context context) {
        PagedIterable<EventTypeInner> inner = this.serviceClient().listEventTypes(topicTypeName, context);
        return Utils.mapPage(inner, inner1 -> new EventTypeImpl(inner1, this.manager()));
    }

    private TopicTypesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.eventgrid.EventGridManager manager() {
        return this.serviceManager;
    }
}
