// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.apimanagement.fluent.models.TagResourceContractInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Paged Tag list representation. */
@Fluent
public final class TagResourceCollection {
    /*
     * Page values.
     */
    @JsonProperty(value = "value")
    private List<TagResourceContractInner> value;

    /*
     * Total record count number across all pages.
     */
    @JsonProperty(value = "count")
    private Long count;

    /*
     * Next page link if any.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of TagResourceCollection class. */
    public TagResourceCollection() {
    }

    /**
     * Get the value property: Page values.
     *
     * @return the value value.
     */
    public List<TagResourceContractInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Page values.
     *
     * @param value the value value to set.
     * @return the TagResourceCollection object itself.
     */
    public TagResourceCollection withValue(List<TagResourceContractInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the count property: Total record count number across all pages.
     *
     * @return the count value.
     */
    public Long count() {
        return this.count;
    }

    /**
     * Set the count property: Total record count number across all pages.
     *
     * @param count the count value to set.
     * @return the TagResourceCollection object itself.
     */
    public TagResourceCollection withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * Get the nextLink property: Next page link if any.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Next page link if any.
     *
     * @param nextLink the nextLink value to set.
     * @return the TagResourceCollection object itself.
     */
    public TagResourceCollection withNextLink(String nextLink) {
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
