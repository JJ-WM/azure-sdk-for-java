// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotfirmwaredefense.models;

import com.azure.resourcemanager.iotfirmwaredefense.fluent.models.ComponentInner;
import java.time.OffsetDateTime;
import java.util.List;

/** An immutable client-side representation of Component. */
public interface Component {
    /**
     * Gets the componentId property: ID for the component.
     *
     * @return the componentId value.
     */
    String componentId();

    /**
     * Gets the componentName property: Name for the component.
     *
     * @return the componentName value.
     */
    String componentName();

    /**
     * Gets the version property: Version for the component.
     *
     * @return the version value.
     */
    String version();

    /**
     * Gets the license property: License for the component.
     *
     * @return the license value.
     */
    String license();

    /**
     * Gets the releaseDate property: Release date for the component.
     *
     * @return the releaseDate value.
     */
    OffsetDateTime releaseDate();

    /**
     * Gets the paths property: Paths of the component.
     *
     * @return the paths value.
     */
    List<String> paths();

    /**
     * Gets the isUpdateAvailable property: Flag if new update is available for the component.
     *
     * @return the isUpdateAvailable value.
     */
    IsUpdateAvailable isUpdateAvailable();

    /**
     * Gets the inner com.azure.resourcemanager.iotfirmwaredefense.fluent.models.ComponentInner object.
     *
     * @return the inner object.
     */
    ComponentInner innerModel();
}
