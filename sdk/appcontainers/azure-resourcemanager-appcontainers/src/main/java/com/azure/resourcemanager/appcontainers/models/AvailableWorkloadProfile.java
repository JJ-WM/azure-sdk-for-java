// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.resourcemanager.appcontainers.fluent.models.AvailableWorkloadProfileInner;

/** An immutable client-side representation of AvailableWorkloadProfile. */
public interface AvailableWorkloadProfile {
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
     * Gets the location property: Region of the workload profile.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the properties property: Revision resource specific properties.
     *
     * @return the properties value.
     */
    AvailableWorkloadProfileProperties properties();

    /**
     * Gets the inner com.azure.resourcemanager.appcontainers.fluent.models.AvailableWorkloadProfileInner object.
     *
     * @return the inner object.
     */
    AvailableWorkloadProfileInner innerModel();
}
