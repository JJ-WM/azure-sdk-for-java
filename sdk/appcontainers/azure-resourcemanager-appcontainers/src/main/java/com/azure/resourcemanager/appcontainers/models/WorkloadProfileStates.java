// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.resourcemanager.appcontainers.fluent.models.WorkloadProfileStatesInner;

/** An immutable client-side representation of WorkloadProfileStates. */
public interface WorkloadProfileStates {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the properties property: Workload Profile resource specific properties.
     *
     * @return the properties value.
     */
    WorkloadProfileStatesProperties properties();

    /**
     * Gets the inner com.azure.resourcemanager.appcontainers.fluent.models.WorkloadProfileStatesInner object.
     *
     * @return the inner object.
     */
    WorkloadProfileStatesInner innerModel();
}
