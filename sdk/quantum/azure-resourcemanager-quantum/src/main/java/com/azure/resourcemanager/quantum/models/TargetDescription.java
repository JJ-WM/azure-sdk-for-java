// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quantum.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Information about a Target. A target is the component that can process a specific type of Job.
 */
@Fluent
public final class TargetDescription {
    /*
     * Unique target id.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Display name of this target.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A description about this target.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * List of data formats accepted by this target.
     */
    @JsonProperty(value = "acceptedDataFormats")
    private List<String> acceptedDataFormats;

    /*
     * List of content encodings accepted by this target.
     */
    @JsonProperty(value = "acceptedContentEncodings")
    private List<String> acceptedContentEncodings;

    /**
     * Creates an instance of TargetDescription class.
     */
    public TargetDescription() {
    }

    /**
     * Get the id property: Unique target id.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Unique target id.
     * 
     * @param id the id value to set.
     * @return the TargetDescription object itself.
     */
    public TargetDescription withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: Display name of this target.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Display name of this target.
     * 
     * @param name the name value to set.
     * @return the TargetDescription object itself.
     */
    public TargetDescription withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the description property: A description about this target.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: A description about this target.
     * 
     * @param description the description value to set.
     * @return the TargetDescription object itself.
     */
    public TargetDescription withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the acceptedDataFormats property: List of data formats accepted by this target.
     * 
     * @return the acceptedDataFormats value.
     */
    public List<String> acceptedDataFormats() {
        return this.acceptedDataFormats;
    }

    /**
     * Set the acceptedDataFormats property: List of data formats accepted by this target.
     * 
     * @param acceptedDataFormats the acceptedDataFormats value to set.
     * @return the TargetDescription object itself.
     */
    public TargetDescription withAcceptedDataFormats(List<String> acceptedDataFormats) {
        this.acceptedDataFormats = acceptedDataFormats;
        return this;
    }

    /**
     * Get the acceptedContentEncodings property: List of content encodings accepted by this target.
     * 
     * @return the acceptedContentEncodings value.
     */
    public List<String> acceptedContentEncodings() {
        return this.acceptedContentEncodings;
    }

    /**
     * Set the acceptedContentEncodings property: List of content encodings accepted by this target.
     * 
     * @param acceptedContentEncodings the acceptedContentEncodings value to set.
     * @return the TargetDescription object itself.
     */
    public TargetDescription withAcceptedContentEncodings(List<String> acceptedContentEncodings) {
        this.acceptedContentEncodings = acceptedContentEncodings;
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
