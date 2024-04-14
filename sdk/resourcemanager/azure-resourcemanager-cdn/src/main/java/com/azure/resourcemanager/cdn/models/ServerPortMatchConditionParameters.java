// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Defines the parameters for ServerPort match conditions.
 */
@Fluent
public final class ServerPortMatchConditionParameters {
    /*
     * The typeName property.
     */
    @JsonProperty(value = "typeName", required = true)
    private String typeName = "DeliveryRuleServerPortConditionParameters";

    /*
     * Describes operator to be matched
     */
    @JsonProperty(value = "operator", required = true)
    private ServerPortOperator operator;

    /*
     * Describes if this is negate condition or not
     */
    @JsonProperty(value = "negateCondition")
    private Boolean negateCondition;

    /*
     * The match value for the condition of the delivery rule
     */
    @JsonProperty(value = "matchValues")
    private List<String> matchValues;

    /*
     * List of transforms
     */
    @JsonProperty(value = "transforms")
    private List<Transform> transforms;

    /**
     * Creates an instance of ServerPortMatchConditionParameters class.
     */
    public ServerPortMatchConditionParameters() {
    }

    /**
     * Get the typeName property: The typeName property.
     * 
     * @return the typeName value.
     */
    public String typeName() {
        return this.typeName;
    }

    /**
     * Set the typeName property: The typeName property.
     * 
     * @param typeName the typeName value to set.
     * @return the ServerPortMatchConditionParameters object itself.
     */
    public ServerPortMatchConditionParameters withTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    /**
     * Get the operator property: Describes operator to be matched.
     * 
     * @return the operator value.
     */
    public ServerPortOperator operator() {
        return this.operator;
    }

    /**
     * Set the operator property: Describes operator to be matched.
     * 
     * @param operator the operator value to set.
     * @return the ServerPortMatchConditionParameters object itself.
     */
    public ServerPortMatchConditionParameters withOperator(ServerPortOperator operator) {
        this.operator = operator;
        return this;
    }

    /**
     * Get the negateCondition property: Describes if this is negate condition or not.
     * 
     * @return the negateCondition value.
     */
    public Boolean negateCondition() {
        return this.negateCondition;
    }

    /**
     * Set the negateCondition property: Describes if this is negate condition or not.
     * 
     * @param negateCondition the negateCondition value to set.
     * @return the ServerPortMatchConditionParameters object itself.
     */
    public ServerPortMatchConditionParameters withNegateCondition(Boolean negateCondition) {
        this.negateCondition = negateCondition;
        return this;
    }

    /**
     * Get the matchValues property: The match value for the condition of the delivery rule.
     * 
     * @return the matchValues value.
     */
    public List<String> matchValues() {
        return this.matchValues;
    }

    /**
     * Set the matchValues property: The match value for the condition of the delivery rule.
     * 
     * @param matchValues the matchValues value to set.
     * @return the ServerPortMatchConditionParameters object itself.
     */
    public ServerPortMatchConditionParameters withMatchValues(List<String> matchValues) {
        this.matchValues = matchValues;
        return this;
    }

    /**
     * Get the transforms property: List of transforms.
     * 
     * @return the transforms value.
     */
    public List<Transform> transforms() {
        return this.transforms;
    }

    /**
     * Set the transforms property: List of transforms.
     * 
     * @param transforms the transforms value to set.
     * @return the ServerPortMatchConditionParameters object itself.
     */
    public ServerPortMatchConditionParameters withTransforms(List<Transform> transforms) {
        this.transforms = transforms;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (operator() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property operator in model ServerPortMatchConditionParameters"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ServerPortMatchConditionParameters.class);
}
