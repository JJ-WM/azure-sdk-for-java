// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.containerregistry.fluent.models.TaskRunInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The collection of task runs.
 */
@Fluent
public final class TaskRunListResult {
    /*
     * The collection value.
     */
    @JsonProperty(value = "value")
    private List<TaskRunInner> value;

    /*
     * The URI that can be used to request the next set of paged results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of TaskRunListResult class.
     */
    public TaskRunListResult() {
    }

    /**
     * Get the value property: The collection value.
     * 
     * @return the value value.
     */
    public List<TaskRunInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The collection value.
     * 
     * @param value the value value to set.
     * @return the TaskRunListResult object itself.
     */
    public TaskRunListResult withValue(List<TaskRunInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI that can be used to request the next set of paged results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URI that can be used to request the next set of paged results.
     * 
     * @param nextLink the nextLink value to set.
     * @return the TaskRunListResult object itself.
     */
    public TaskRunListResult withNextLink(String nextLink) {
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
