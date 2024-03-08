// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * Properties pertaining to the UnknownTarget.
 */
@Fluent
public final class UnknownTarget {
    /*
     * Dictionary of string->string pairs containing information about the Storage Target.
     */
    @JsonProperty(value = "attributes")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> attributes;

    /**
     * Creates an instance of UnknownTarget class.
     */
    public UnknownTarget() {
    }

    /**
     * Get the attributes property: Dictionary of string-&gt;string pairs containing information about the Storage
     * Target.
     * 
     * @return the attributes value.
     */
    public Map<String, String> attributes() {
        return this.attributes;
    }

    /**
     * Set the attributes property: Dictionary of string-&gt;string pairs containing information about the Storage
     * Target.
     * 
     * @param attributes the attributes value to set.
     * @return the UnknownTarget object itself.
     */
    public UnknownTarget withAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
