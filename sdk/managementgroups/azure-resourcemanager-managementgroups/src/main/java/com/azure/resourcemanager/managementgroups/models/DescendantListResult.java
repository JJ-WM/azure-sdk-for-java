// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managementgroups.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.managementgroups.fluent.models.DescendantInfoInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes the result of the request to view descendants. */
@Fluent
public final class DescendantListResult {
    /*
     * The list of descendants.
     */
    @JsonProperty(value = "value")
    private List<DescendantInfoInner> value;

    /*
     * The URL to use for getting the next set of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /** Creates an instance of DescendantListResult class. */
    public DescendantListResult() {
    }

    /**
     * Get the value property: The list of descendants.
     *
     * @return the value value.
     */
    public List<DescendantInfoInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of descendants.
     *
     * @param value the value value to set.
     * @return the DescendantListResult object itself.
     */
    public DescendantListResult withValue(List<DescendantInfoInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to use for getting the next set of results.
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
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
