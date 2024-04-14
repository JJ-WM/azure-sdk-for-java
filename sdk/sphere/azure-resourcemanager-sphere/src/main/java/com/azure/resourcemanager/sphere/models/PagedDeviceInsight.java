// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sphere.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sphere.fluent.models.DeviceInsightInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Paged collection of DeviceInsight items.
 */
@Fluent
public final class PagedDeviceInsight {
    /*
     * The DeviceInsight items on this page
     */
    @JsonProperty(value = "value", required = true)
    private List<DeviceInsightInner> value;

    /*
     * The link to the next page of items
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Creates an instance of PagedDeviceInsight class.
     */
    public PagedDeviceInsight() {
    }

    /**
     * Get the value property: The DeviceInsight items on this page.
     * 
     * @return the value value.
     */
    public List<DeviceInsightInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The DeviceInsight items on this page.
     * 
     * @param value the value value to set.
     * @return the PagedDeviceInsight object itself.
     */
    public PagedDeviceInsight withValue(List<DeviceInsightInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The link to the next page of items.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property value in model PagedDeviceInsight"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PagedDeviceInsight.class);
}
