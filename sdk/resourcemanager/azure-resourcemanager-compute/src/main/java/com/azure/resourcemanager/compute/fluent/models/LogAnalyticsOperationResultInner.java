// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.compute.models.LogAnalyticsOutput;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * LogAnalytics operation status response.
 */
@Immutable
public final class LogAnalyticsOperationResultInner {
    /*
     * LogAnalyticsOutput
     */
    @JsonProperty(value = "properties", access = JsonProperty.Access.WRITE_ONLY)
    private LogAnalyticsOutput properties;

    /**
     * Creates an instance of LogAnalyticsOperationResultInner class.
     */
    public LogAnalyticsOperationResultInner() {
    }

    /**
     * Get the properties property: LogAnalyticsOutput.
     * 
     * @return the properties value.
     */
    public LogAnalyticsOutput properties() {
        return this.properties;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
