// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The instance view of the container group. Only valid in response. */
@Immutable
public final class ContainerGroupPropertiesInstanceView {
    /*
     * The events of this container group.
     */
    @JsonProperty(value = "events", access = JsonProperty.Access.WRITE_ONLY)
    private List<Event> events;

    /*
     * The state of the container group. Only valid in response.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private String state;

    /** Creates an instance of ContainerGroupPropertiesInstanceView class. */
    public ContainerGroupPropertiesInstanceView() {
    }

    /**
     * Get the events property: The events of this container group.
     *
     * @return the events value.
     */
    public List<Event> events() {
        return this.events;
    }

    /**
     * Get the state property: The state of the container group. Only valid in response.
     *
     * @return the state value.
     */
    public String state() {
        return this.state;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (events() != null) {
            events().forEach(e -> e.validate());
        }
    }
}
