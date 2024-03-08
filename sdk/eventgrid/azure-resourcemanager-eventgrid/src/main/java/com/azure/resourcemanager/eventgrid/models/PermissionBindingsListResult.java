// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.eventgrid.fluent.models.PermissionBindingInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Result of the List Permission Binding operation.
 */
@Fluent
public final class PermissionBindingsListResult {
    /*
     * A collection of Permission Binding.
     */
    @JsonProperty(value = "value")
    private List<PermissionBindingInner> value;

    /*
     * A link for the next page of Permission Binding.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of PermissionBindingsListResult class.
     */
    public PermissionBindingsListResult() {
    }

    /**
     * Get the value property: A collection of Permission Binding.
     * 
     * @return the value value.
     */
    public List<PermissionBindingInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A collection of Permission Binding.
     * 
     * @param value the value value to set.
     * @return the PermissionBindingsListResult object itself.
     */
    public PermissionBindingsListResult withValue(List<PermissionBindingInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: A link for the next page of Permission Binding.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: A link for the next page of Permission Binding.
     * 
     * @param nextLink the nextLink value to set.
     * @return the PermissionBindingsListResult object itself.
     */
    public PermissionBindingsListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
