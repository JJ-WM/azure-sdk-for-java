// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.Expression;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Filter activity properties.
 */
@Fluent
public final class FilterActivityTypeProperties {
    /*
     * Input array on which filter should be applied.
     */
    @JsonProperty(value = "items", required = true)
    private Expression items;

    /*
     * Condition to be used for filtering the input.
     */
    @JsonProperty(value = "condition", required = true)
    private Expression condition;

    /**
     * Creates an instance of FilterActivityTypeProperties class.
     */
    public FilterActivityTypeProperties() {
    }

    /**
     * Get the items property: Input array on which filter should be applied.
     * 
     * @return the items value.
     */
    public Expression items() {
        return this.items;
    }

    /**
     * Set the items property: Input array on which filter should be applied.
     * 
     * @param items the items value to set.
     * @return the FilterActivityTypeProperties object itself.
     */
    public FilterActivityTypeProperties withItems(Expression items) {
        this.items = items;
        return this;
    }

    /**
     * Get the condition property: Condition to be used for filtering the input.
     * 
     * @return the condition value.
     */
    public Expression condition() {
        return this.condition;
    }

    /**
     * Set the condition property: Condition to be used for filtering the input.
     * 
     * @param condition the condition value to set.
     * @return the FilterActivityTypeProperties object itself.
     */
    public FilterActivityTypeProperties withCondition(Expression condition) {
        this.condition = condition;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (items() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property items in model FilterActivityTypeProperties"));
        } else {
            items().validate();
        }
        if (condition() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property condition in model FilterActivityTypeProperties"));
        } else {
            condition().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(FilterActivityTypeProperties.class);
}
