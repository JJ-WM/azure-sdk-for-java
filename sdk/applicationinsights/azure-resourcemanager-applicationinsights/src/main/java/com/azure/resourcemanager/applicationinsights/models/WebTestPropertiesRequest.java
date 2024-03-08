// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The collection of request properties. */
@Fluent
public final class WebTestPropertiesRequest {
    /*
     * Url location to test.
     */
    @JsonProperty(value = "RequestUrl")
    private String requestUrl;

    /*
     * List of headers and their values to add to the WebTest call.
     */
    @JsonProperty(value = "Headers")
    private List<HeaderField> headers;

    /*
     * Http verb to use for this web test.
     */
    @JsonProperty(value = "HttpVerb")
    private String httpVerb;

    /*
     * Base64 encoded string body to send with this web test.
     */
    @JsonProperty(value = "RequestBody")
    private String requestBody;

    /*
     * Parse Dependent request for this WebTest.
     */
    @JsonProperty(value = "ParseDependentRequests")
    private Boolean parseDependentRequests;

    /*
     * Follow redirects for this web test.
     */
    @JsonProperty(value = "FollowRedirects")
    private Boolean followRedirects;

    /** Creates an instance of WebTestPropertiesRequest class. */
    public WebTestPropertiesRequest() {
    }

    /**
     * Get the requestUrl property: Url location to test.
     *
     * @return the requestUrl value.
     */
    public String requestUrl() {
        return this.requestUrl;
    }

    /**
     * Set the requestUrl property: Url location to test.
     *
     * @param requestUrl the requestUrl value to set.
     * @return the WebTestPropertiesRequest object itself.
     */
    public WebTestPropertiesRequest withRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
        return this;
    }

    /**
     * Get the headers property: List of headers and their values to add to the WebTest call.
     *
     * @return the headers value.
     */
    public List<HeaderField> headers() {
        return this.headers;
    }

    /**
     * Set the headers property: List of headers and their values to add to the WebTest call.
     *
     * @param headers the headers value to set.
     * @return the WebTestPropertiesRequest object itself.
     */
    public WebTestPropertiesRequest withHeaders(List<HeaderField> headers) {
        this.headers = headers;
        return this;
    }

    /**
     * Get the httpVerb property: Http verb to use for this web test.
     *
     * @return the httpVerb value.
     */
    public String httpVerb() {
        return this.httpVerb;
    }

    /**
     * Set the httpVerb property: Http verb to use for this web test.
     *
     * @param httpVerb the httpVerb value to set.
     * @return the WebTestPropertiesRequest object itself.
     */
    public WebTestPropertiesRequest withHttpVerb(String httpVerb) {
        this.httpVerb = httpVerb;
        return this;
    }

    /**
     * Get the requestBody property: Base64 encoded string body to send with this web test.
     *
     * @return the requestBody value.
     */
    public String requestBody() {
        return this.requestBody;
    }

    /**
     * Set the requestBody property: Base64 encoded string body to send with this web test.
     *
     * @param requestBody the requestBody value to set.
     * @return the WebTestPropertiesRequest object itself.
     */
    public WebTestPropertiesRequest withRequestBody(String requestBody) {
        this.requestBody = requestBody;
        return this;
    }

    /**
     * Get the parseDependentRequests property: Parse Dependent request for this WebTest.
     *
     * @return the parseDependentRequests value.
     */
    public Boolean parseDependentRequests() {
        return this.parseDependentRequests;
    }

    /**
     * Set the parseDependentRequests property: Parse Dependent request for this WebTest.
     *
     * @param parseDependentRequests the parseDependentRequests value to set.
     * @return the WebTestPropertiesRequest object itself.
     */
    public WebTestPropertiesRequest withParseDependentRequests(Boolean parseDependentRequests) {
        this.parseDependentRequests = parseDependentRequests;
        return this;
    }

    /**
     * Get the followRedirects property: Follow redirects for this web test.
     *
     * @return the followRedirects value.
     */
    public Boolean followRedirects() {
        return this.followRedirects;
    }

    /**
     * Set the followRedirects property: Follow redirects for this web test.
     *
     * @param followRedirects the followRedirects value to set.
     * @return the WebTestPropertiesRequest object itself.
     */
    public WebTestPropertiesRequest withFollowRedirects(Boolean followRedirects) {
        this.followRedirects = followRedirects;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (headers() != null) {
            headers().forEach(e -> e.validate());
        }
    }
}
