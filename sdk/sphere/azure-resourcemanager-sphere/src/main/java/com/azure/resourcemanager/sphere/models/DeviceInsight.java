// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sphere.models;

import com.azure.resourcemanager.sphere.fluent.models.DeviceInsightInner;
import java.time.OffsetDateTime;

/**
 * An immutable client-side representation of DeviceInsight.
 */
public interface DeviceInsight {
    /**
     * Gets the deviceId property: Device ID.
     * 
     * @return the deviceId value.
     */
    String deviceId();

    /**
     * Gets the description property: Event description.
     * 
     * @return the description value.
     */
    String description();

    /**
     * Gets the startTimestampUtc property: Event start timestamp.
     * 
     * @return the startTimestampUtc value.
     */
    OffsetDateTime startTimestampUtc();

    /**
     * Gets the endTimestampUtc property: Event end timestamp.
     * 
     * @return the endTimestampUtc value.
     */
    OffsetDateTime endTimestampUtc();

    /**
     * Gets the eventCategory property: Event category.
     * 
     * @return the eventCategory value.
     */
    String eventCategory();

    /**
     * Gets the eventClass property: Event class.
     * 
     * @return the eventClass value.
     */
    String eventClass();

    /**
     * Gets the eventType property: Event type.
     * 
     * @return the eventType value.
     */
    String eventType();

    /**
     * Gets the eventCount property: Event count.
     * 
     * @return the eventCount value.
     */
    int eventCount();

    /**
     * Gets the inner com.azure.resourcemanager.sphere.fluent.models.DeviceInsightInner object.
     * 
     * @return the inner object.
     */
    DeviceInsightInner innerModel();
}
