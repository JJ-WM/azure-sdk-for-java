// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * Describes an experiment update.
 */
@Fluent
public final class ExperimentUpdate {
    /*
     * The identity of the experiment resource.
     */
    @JsonProperty(value = "identity")
    private ResourceIdentity identity;

    /*
     * The tags of the experiment resource.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /**
     * Creates an instance of ExperimentUpdate class.
     */
    public ExperimentUpdate() {
    }

    /**
     * Get the identity property: The identity of the experiment resource.
     * 
     * @return the identity value.
     */
    public ResourceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity of the experiment resource.
     * 
     * @param identity the identity value to set.
     * @return the ExperimentUpdate object itself.
     */
    public ExperimentUpdate withIdentity(ResourceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the tags property: The tags of the experiment resource.
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: The tags of the experiment resource.
     * 
     * @param tags the tags value to set.
     * @return the ExperimentUpdate object itself.
     */
    public ExperimentUpdate withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
    }
}
