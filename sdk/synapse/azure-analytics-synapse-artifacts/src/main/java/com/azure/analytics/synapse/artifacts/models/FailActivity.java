// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * This activity will fail within its own scope and output a custom error message and error code. The error message and
 * code can provided either as a string literal or as an expression that can be evaluated to a string at runtime. The
 * activity scope can be the whole pipeline or a control activity (e.g. foreach, switch, until), if the fail activity is
 * contained in it.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Fail")
@JsonFlatten
@Fluent
public class FailActivity extends ControlActivity {
    /*
     * The error message that surfaced in the Fail activity. It can be dynamic content that's evaluated to a non
     * empty/blank string at runtime. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.message", required = true)
    private Object message;

    /*
     * The error code that categorizes the error type of the Fail activity. It can be dynamic content that's evaluated
     * to a non empty/blank string at runtime. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.errorCode", required = true)
    private Object errorCode;

    /** Creates an instance of FailActivity class. */
    public FailActivity() {}

    /**
     * Get the message property: The error message that surfaced in the Fail activity. It can be dynamic content that's
     * evaluated to a non empty/blank string at runtime. Type: string (or Expression with resultType string).
     *
     * @return the message value.
     */
    public Object getMessage() {
        return this.message;
    }

    /**
     * Set the message property: The error message that surfaced in the Fail activity. It can be dynamic content that's
     * evaluated to a non empty/blank string at runtime. Type: string (or Expression with resultType string).
     *
     * @param message the message value to set.
     * @return the FailActivity object itself.
     */
    public FailActivity setMessage(Object message) {
        this.message = message;
        return this;
    }

    /**
     * Get the errorCode property: The error code that categorizes the error type of the Fail activity. It can be
     * dynamic content that's evaluated to a non empty/blank string at runtime. Type: string (or Expression with
     * resultType string).
     *
     * @return the errorCode value.
     */
    public Object getErrorCode() {
        return this.errorCode;
    }

    /**
     * Set the errorCode property: The error code that categorizes the error type of the Fail activity. It can be
     * dynamic content that's evaluated to a non empty/blank string at runtime. Type: string (or Expression with
     * resultType string).
     *
     * @param errorCode the errorCode value to set.
     * @return the FailActivity object itself.
     */
    public FailActivity setErrorCode(Object errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FailActivity setName(String name) {
        super.setName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FailActivity setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FailActivity setState(ActivityState state) {
        super.setState(state);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FailActivity setOnInactiveMarkAs(ActivityOnInactiveMarkAs onInactiveMarkAs) {
        super.setOnInactiveMarkAs(onInactiveMarkAs);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FailActivity setDependsOn(List<ActivityDependency> dependsOn) {
        super.setDependsOn(dependsOn);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FailActivity setUserProperties(List<UserProperty> userProperties) {
        super.setUserProperties(userProperties);
        return this;
    }
}
