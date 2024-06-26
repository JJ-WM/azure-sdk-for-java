// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appplatform.fluent.models.ContainerRegistryResourceInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Collection compose of container registry resources list and a possible link for next page.
 */
@Fluent
public final class ContainerRegistryResourceCollection {
    /*
     * The container registry resources list.
     */
    @JsonProperty(value = "value")
    private List<ContainerRegistryResourceInner> value;

    /*
     * The link to next page of storage list.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of ContainerRegistryResourceCollection class.
     */
    public ContainerRegistryResourceCollection() {
    }

    /**
     * Get the value property: The container registry resources list.
     * 
     * @return the value value.
     */
    public List<ContainerRegistryResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The container registry resources list.
     * 
     * @param value the value value to set.
     * @return the ContainerRegistryResourceCollection object itself.
     */
    public ContainerRegistryResourceCollection withValue(List<ContainerRegistryResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The link to next page of storage list.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link to next page of storage list.
     * 
     * @param nextLink the nextLink value to set.
     * @return the ContainerRegistryResourceCollection object itself.
     */
    public ContainerRegistryResourceCollection withNextLink(String nextLink) {
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
