// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of response errors for real user requests for which origin will be deemed unhealthy.
 */
public enum ResponseBasedDetectedErrorTypes {
    /**
     * Enum value None.
     */
    NONE("None"),

    /**
     * Enum value TcpErrorsOnly.
     */
    TCP_ERRORS_ONLY("TcpErrorsOnly"),

    /**
     * Enum value TcpAndHttpErrors.
     */
    TCP_AND_HTTP_ERRORS("TcpAndHttpErrors");

    /**
     * The actual serialized value for a ResponseBasedDetectedErrorTypes instance.
     */
    private final String value;

    ResponseBasedDetectedErrorTypes(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ResponseBasedDetectedErrorTypes instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed ResponseBasedDetectedErrorTypes object, or null if unable to parse.
     */
    @JsonCreator
    public static ResponseBasedDetectedErrorTypes fromString(String value) {
        if (value == null) {
            return null;
        }
        ResponseBasedDetectedErrorTypes[] items = ResponseBasedDetectedErrorTypes.values();
        for (ResponseBasedDetectedErrorTypes item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
