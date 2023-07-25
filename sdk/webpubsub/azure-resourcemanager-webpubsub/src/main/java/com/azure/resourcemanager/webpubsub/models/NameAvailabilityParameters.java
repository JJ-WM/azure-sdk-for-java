// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Data POST-ed to the nameAvailability action. */
@Fluent
public final class NameAvailabilityParameters {
    /*
     * The resource type. Can be "Microsoft.SignalRService/SignalR", "Microsoft.SignalRService/WebPubSub",
     * "Microsoft.SignalRService/SignalR/replicas" or "Microsoft.SignalRService/WebPubSub/replicas"
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /*
     * The resource name to validate. e.g."my-resource-name"
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /** Creates an instance of NameAvailabilityParameters class. */
    public NameAvailabilityParameters() {
    }

    /**
     * Get the type property: The resource type. Can be "Microsoft.SignalRService/SignalR",
     * "Microsoft.SignalRService/WebPubSub", "Microsoft.SignalRService/SignalR/replicas" or
     * "Microsoft.SignalRService/WebPubSub/replicas".
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The resource type. Can be "Microsoft.SignalRService/SignalR",
     * "Microsoft.SignalRService/WebPubSub", "Microsoft.SignalRService/SignalR/replicas" or
     * "Microsoft.SignalRService/WebPubSub/replicas".
     *
     * @param type the type value to set.
     * @return the NameAvailabilityParameters object itself.
     */
    public NameAvailabilityParameters withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the name property: The resource name to validate. e.g."my-resource-name".
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The resource name to validate. e.g."my-resource-name".
     *
     * @param name the name value to set.
     * @return the NameAvailabilityParameters object itself.
     */
    public NameAvailabilityParameters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (type() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property type in model NameAvailabilityParameters"));
        }
        if (name() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model NameAvailabilityParameters"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(NameAvailabilityParameters.class);
}
