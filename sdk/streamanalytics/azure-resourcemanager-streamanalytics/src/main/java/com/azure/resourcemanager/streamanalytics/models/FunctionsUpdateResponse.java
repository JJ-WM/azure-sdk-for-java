// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.resourcemanager.streamanalytics.fluent.models.FunctionInner;

/**
 * Contains all response data for the update operation.
 */
public final class FunctionsUpdateResponse extends ResponseBase<FunctionsUpdateHeaders, FunctionInner> {
    /**
     * Creates an instance of FunctionsUpdateResponse.
     * 
     * @param request the request which resulted in this FunctionsUpdateResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public FunctionsUpdateResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders, FunctionInner value,
        FunctionsUpdateHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /**
     * Gets the deserialized response body.
     * 
     * @return the deserialized response body.
     */
    @Override
    public FunctionInner getValue() {
        return super.getValue();
    }
}
