// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Azure Synapse expression definition.
 */
@Fluent
public final class Expression {
    /*
     * Expression type.
     */
    @JsonProperty(value = "type", required = true)
    private ExpressionType type;

    /*
     * Expression value.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /**
     * Creates an instance of Expression class.
     */
    public Expression() {
    }

    /**
     * Get the type property: Expression type.
     * 
     * @return the type value.
     */
    public ExpressionType getType() {
        return this.type;
    }

    /**
     * Set the type property: Expression type.
     * 
     * @param type the type value to set.
     * @return the Expression object itself.
     */
    public Expression setType(ExpressionType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the value property: Expression value.
     * 
     * @return the value value.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Set the value property: Expression value.
     * 
     * @param value the value value to set.
     * @return the Expression object itself.
     */
    public Expression setValue(String value) {
        this.value = value;
        return this;
    }
}
