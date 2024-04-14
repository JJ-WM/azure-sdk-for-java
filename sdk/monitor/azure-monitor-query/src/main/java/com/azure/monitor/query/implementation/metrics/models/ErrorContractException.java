// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.monitor.query.implementation.metrics.models;

import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.HttpResponse;

/**
 * Exception thrown for an invalid response with ErrorContract information.
 */
public final class ErrorContractException extends HttpResponseException {
    /**
     * Initializes a new instance of the ErrorContractException class.
     * 
     * @param message the exception message or the response content if a message is not available.
     * @param response the HTTP response.
     */
    public ErrorContractException(String message, HttpResponse response) {
        super(message, response);
    }

    /**
     * Initializes a new instance of the ErrorContractException class.
     * 
     * @param message the exception message or the response content if a message is not available.
     * @param response the HTTP response.
     * @param value the deserialized response value.
     */
    public ErrorContractException(String message, HttpResponse response, ErrorContract value) {
        super(message, response, value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ErrorContract getValue() {
        return (ErrorContract) super.getValue();
    }
}
