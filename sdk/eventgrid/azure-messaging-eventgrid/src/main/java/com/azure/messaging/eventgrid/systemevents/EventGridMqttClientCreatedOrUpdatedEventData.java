// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** Event data for Microsoft.EventGrid.MQTTClientCreatedOrUpdated event. */
@Fluent
public final class EventGridMqttClientCreatedOrUpdatedEventData extends EventGridMqttClientEventData {
    /*
     * Configured state of the client. The value could be Enabled or Disabled
     */
    @JsonProperty(value = "state")
    private EventGridMqttClientState state;

    /*
     * Time the client resource is created based on the provider's UTC time.
     */
    @JsonProperty(value = "createdOn")
    private OffsetDateTime createdOn;

    /*
     * Time the client resource is last updated based on the provider's UTC time. If the client resource was never
     * updated, this value is identical to the value of the 'createdOn' property.
     */
    @JsonProperty(value = "updatedOn")
    private OffsetDateTime updatedOn;

    /*
     * The key-value attributes that are assigned to the client resource.
     */
    @JsonProperty(value = "attributes")
    private Map<String, String> attributes;

    /** Creates an instance of EventGridMqttClientCreatedOrUpdatedEventData class. */
    public EventGridMqttClientCreatedOrUpdatedEventData() {}

    /**
     * Get the state property: Configured state of the client. The value could be Enabled or Disabled.
     *
     * @return the state value.
     */
    public EventGridMqttClientState getState() {
        return this.state;
    }

    /**
     * Set the state property: Configured state of the client. The value could be Enabled or Disabled.
     *
     * @param state the state value to set.
     * @return the EventGridMqttClientCreatedOrUpdatedEventData object itself.
     */
    public EventGridMqttClientCreatedOrUpdatedEventData setState(EventGridMqttClientState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the createdOn property: Time the client resource is created based on the provider's UTC time.
     *
     * @return the createdOn value.
     */
    public OffsetDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Set the createdOn property: Time the client resource is created based on the provider's UTC time.
     *
     * @param createdOn the createdOn value to set.
     * @return the EventGridMqttClientCreatedOrUpdatedEventData object itself.
     */
    public EventGridMqttClientCreatedOrUpdatedEventData setCreatedOn(OffsetDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Get the updatedOn property: Time the client resource is last updated based on the provider's UTC time. If the
     * client resource was never updated, this value is identical to the value of the 'createdOn' property.
     *
     * @return the updatedOn value.
     */
    public OffsetDateTime getUpdatedOn() {
        return this.updatedOn;
    }

    /**
     * Set the updatedOn property: Time the client resource is last updated based on the provider's UTC time. If the
     * client resource was never updated, this value is identical to the value of the 'createdOn' property.
     *
     * @param updatedOn the updatedOn value to set.
     * @return the EventGridMqttClientCreatedOrUpdatedEventData object itself.
     */
    public EventGridMqttClientCreatedOrUpdatedEventData setUpdatedOn(OffsetDateTime updatedOn) {
        this.updatedOn = updatedOn;
        return this;
    }

    /**
     * Get the attributes property: The key-value attributes that are assigned to the client resource.
     *
     * @return the attributes value.
     */
    public Map<String, String> getAttributes() {
        return this.attributes;
    }

    /**
     * Set the attributes property: The key-value attributes that are assigned to the client resource.
     *
     * @param attributes the attributes value to set.
     * @return the EventGridMqttClientCreatedOrUpdatedEventData object itself.
     */
    public EventGridMqttClientCreatedOrUpdatedEventData setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EventGridMqttClientCreatedOrUpdatedEventData setClientAuthenticationName(String clientAuthenticationName) {
        super.setClientAuthenticationName(clientAuthenticationName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EventGridMqttClientCreatedOrUpdatedEventData setClientName(String clientName) {
        super.setClientName(clientName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EventGridMqttClientCreatedOrUpdatedEventData setNamespaceName(String namespaceName) {
        super.setNamespaceName(namespaceName);
        return this;
    }
}
