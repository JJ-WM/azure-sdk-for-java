// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Resume job properties.
 */
@Fluent
public final class ResumeJobParamsProperties {
    /*
     * Resume job comments.
     */
    @JsonProperty(value = "comments")
    private String comments;

    /**
     * Creates an instance of ResumeJobParamsProperties class.
     */
    public ResumeJobParamsProperties() {
    }

    /**
     * Get the comments property: Resume job comments.
     * 
     * @return the comments value.
     */
    public String comments() {
        return this.comments;
    }

    /**
     * Set the comments property: Resume job comments.
     * 
     * @param comments the comments value to set.
     * @return the ResumeJobParamsProperties object itself.
     */
    public ResumeJobParamsProperties withComments(String comments) {
        this.comments = comments;
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
