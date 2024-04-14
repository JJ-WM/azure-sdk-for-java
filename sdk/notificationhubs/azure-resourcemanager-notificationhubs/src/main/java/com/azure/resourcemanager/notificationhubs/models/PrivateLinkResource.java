// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.notificationhubs.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.notificationhubs.fluent.models.PrivateLinkResourceInner;

/**
 * An immutable client-side representation of PrivateLinkResource.
 */
public interface PrivateLinkResource {
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
     * Gets the properties property: Represents properties of Private Link Resource.
     * 
     * @return the properties value.
     */
    PrivateLinkResourceProperties properties();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the inner com.azure.resourcemanager.notificationhubs.fluent.models.PrivateLinkResourceInner object.
     * 
     * @return the inner object.
     */
    PrivateLinkResourceInner innerModel();
}
