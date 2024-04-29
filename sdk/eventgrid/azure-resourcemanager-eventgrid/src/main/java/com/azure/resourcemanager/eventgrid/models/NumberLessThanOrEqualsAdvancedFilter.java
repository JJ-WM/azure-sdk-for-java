// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * NumberLessThanOrEquals Advanced Filter.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "operatorType",
    defaultImpl = NumberLessThanOrEqualsAdvancedFilter.class,
    visible = true)
@JsonTypeName("NumberLessThanOrEquals")
@Fluent
public final class NumberLessThanOrEqualsAdvancedFilter extends AdvancedFilter {
    /*
     * The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
     */
    @JsonTypeId
    @JsonProperty(value = "operatorType", required = true)
    private AdvancedFilterOperatorType operatorType = AdvancedFilterOperatorType.NUMBER_LESS_THAN_OR_EQUALS;

    /*
     * The filter value.
     */
    @JsonProperty(value = "value")
    private Double value;

    /**
     * Creates an instance of NumberLessThanOrEqualsAdvancedFilter class.
     */
    public NumberLessThanOrEqualsAdvancedFilter() {
    }

    /**
     * Get the operatorType property: The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals
     * and others.
     * 
     * @return the operatorType value.
     */
    @Override
    public AdvancedFilterOperatorType operatorType() {
        return this.operatorType;
    }

    /**
     * Get the value property: The filter value.
     * 
     * @return the value value.
     */
    public Double value() {
        return this.value;
    }

    /**
     * Set the value property: The filter value.
     * 
     * @param value the value value to set.
     * @return the NumberLessThanOrEqualsAdvancedFilter object itself.
     */
    public NumberLessThanOrEqualsAdvancedFilter withValue(Double value) {
        this.value = value;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NumberLessThanOrEqualsAdvancedFilter withKey(String key) {
        super.withKey(key);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
