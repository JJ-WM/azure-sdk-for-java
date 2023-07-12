// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.IpPrefixInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of IpPrefixes. */
@Fluent
public final class IpPrefixesListResult {
    /*
     * List of IPPrefix resources.
     */
    @JsonProperty(value = "value")
    private List<IpPrefixInner> value;

    /*
     * Url to follow for getting next page of resources.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of IpPrefixesListResult class. */
    public IpPrefixesListResult() {
    }

    /**
     * Get the value property: List of IPPrefix resources.
     *
     * @return the value value.
     */
    public List<IpPrefixInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of IPPrefix resources.
     *
     * @param value the value value to set.
     * @return the IpPrefixesListResult object itself.
     */
    public IpPrefixesListResult withValue(List<IpPrefixInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Url to follow for getting next page of resources.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Url to follow for getting next page of resources.
     *
     * @param nextLink the nextLink value to set.
     * @return the IpPrefixesListResult object itself.
     */
    public IpPrefixesListResult withNextLink(String nextLink) {
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
