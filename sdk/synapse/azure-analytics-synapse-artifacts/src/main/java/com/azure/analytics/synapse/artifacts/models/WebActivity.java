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
 * Web activity.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("WebActivity")
@JsonFlatten
@Fluent
public class WebActivity extends ExecutionActivity {
    /*
     * Rest API method for target endpoint.
     */
    @JsonProperty(value = "typeProperties.method", required = true)
    private WebActivityMethod method;

    /*
     * Web activity target endpoint and path. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.url", required = true)
    private Object url;

    /*
     * Represents the headers that will be sent to the request. For example, to set the language and type on a request:
     * "headers" : { "Accept-Language": "en-us", "Content-Type": "application/json" }. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.headers")
    private Object headers;

    /*
     * Represents the payload that will be sent to the endpoint. Required for POST/PUT method, not allowed for GET
     * method Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.body")
    private Object body;

    /*
     * Authentication method used for calling the endpoint.
     */
    @JsonProperty(value = "typeProperties.authentication")
    private WebActivityAuthentication authentication;

    /*
     * List of datasets passed to web endpoint.
     */
    @JsonProperty(value = "typeProperties.datasets")
    private List<DatasetReference> datasets;

    /*
     * List of linked services passed to web endpoint.
     */
    @JsonProperty(value = "typeProperties.linkedServices")
    private List<LinkedServiceReference> linkedServices;

    /*
     * The integration runtime reference.
     */
    @JsonProperty(value = "typeProperties.connectVia")
    private IntegrationRuntimeReference connectVia;

    /**
     * Creates an instance of WebActivity class.
     */
    public WebActivity() {
    }

    /**
     * Get the method property: Rest API method for target endpoint.
     * 
     * @return the method value.
     */
    public WebActivityMethod getMethod() {
        return this.method;
    }

    /**
     * Set the method property: Rest API method for target endpoint.
     * 
     * @param method the method value to set.
     * @return the WebActivity object itself.
     */
    public WebActivity setMethod(WebActivityMethod method) {
        this.method = method;
        return this;
    }

    /**
     * Get the url property: Web activity target endpoint and path. Type: string (or Expression with resultType
     * string).
     * 
     * @return the url value.
     */
    public Object getUrl() {
        return this.url;
    }

    /**
     * Set the url property: Web activity target endpoint and path. Type: string (or Expression with resultType
     * string).
     * 
     * @param url the url value to set.
     * @return the WebActivity object itself.
     */
    public WebActivity setUrl(Object url) {
        this.url = url;
        return this;
    }

    /**
     * Get the headers property: Represents the headers that will be sent to the request. For example, to set the
     * language and type on a request: "headers" : { "Accept-Language": "en-us", "Content-Type": "application/json" }.
     * Type: string (or Expression with resultType string).
     * 
     * @return the headers value.
     */
    public Object getHeaders() {
        return this.headers;
    }

    /**
     * Set the headers property: Represents the headers that will be sent to the request. For example, to set the
     * language and type on a request: "headers" : { "Accept-Language": "en-us", "Content-Type": "application/json" }.
     * Type: string (or Expression with resultType string).
     * 
     * @param headers the headers value to set.
     * @return the WebActivity object itself.
     */
    public WebActivity setHeaders(Object headers) {
        this.headers = headers;
        return this;
    }

    /**
     * Get the body property: Represents the payload that will be sent to the endpoint. Required for POST/PUT method,
     * not allowed for GET method Type: string (or Expression with resultType string).
     * 
     * @return the body value.
     */
    public Object getBody() {
        return this.body;
    }

    /**
     * Set the body property: Represents the payload that will be sent to the endpoint. Required for POST/PUT method,
     * not allowed for GET method Type: string (or Expression with resultType string).
     * 
     * @param body the body value to set.
     * @return the WebActivity object itself.
     */
    public WebActivity setBody(Object body) {
        this.body = body;
        return this;
    }

    /**
     * Get the authentication property: Authentication method used for calling the endpoint.
     * 
     * @return the authentication value.
     */
    public WebActivityAuthentication getAuthentication() {
        return this.authentication;
    }

    /**
     * Set the authentication property: Authentication method used for calling the endpoint.
     * 
     * @param authentication the authentication value to set.
     * @return the WebActivity object itself.
     */
    public WebActivity setAuthentication(WebActivityAuthentication authentication) {
        this.authentication = authentication;
        return this;
    }

    /**
     * Get the datasets property: List of datasets passed to web endpoint.
     * 
     * @return the datasets value.
     */
    public List<DatasetReference> getDatasets() {
        return this.datasets;
    }

    /**
     * Set the datasets property: List of datasets passed to web endpoint.
     * 
     * @param datasets the datasets value to set.
     * @return the WebActivity object itself.
     */
    public WebActivity setDatasets(List<DatasetReference> datasets) {
        this.datasets = datasets;
        return this;
    }

    /**
     * Get the linkedServices property: List of linked services passed to web endpoint.
     * 
     * @return the linkedServices value.
     */
    public List<LinkedServiceReference> getLinkedServices() {
        return this.linkedServices;
    }

    /**
     * Set the linkedServices property: List of linked services passed to web endpoint.
     * 
     * @param linkedServices the linkedServices value to set.
     * @return the WebActivity object itself.
     */
    public WebActivity setLinkedServices(List<LinkedServiceReference> linkedServices) {
        this.linkedServices = linkedServices;
        return this;
    }

    /**
     * Get the connectVia property: The integration runtime reference.
     * 
     * @return the connectVia value.
     */
    public IntegrationRuntimeReference getConnectVia() {
        return this.connectVia;
    }

    /**
     * Set the connectVia property: The integration runtime reference.
     * 
     * @param connectVia the connectVia value to set.
     * @return the WebActivity object itself.
     */
    public WebActivity setConnectVia(IntegrationRuntimeReference connectVia) {
        this.connectVia = connectVia;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WebActivity setLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.setLinkedServiceName(linkedServiceName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WebActivity setPolicy(ActivityPolicy policy) {
        super.setPolicy(policy);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WebActivity setName(String name) {
        super.setName(name);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WebActivity setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WebActivity setState(ActivityState state) {
        super.setState(state);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WebActivity setOnInactiveMarkAs(ActivityOnInactiveMarkAs onInactiveMarkAs) {
        super.setOnInactiveMarkAs(onInactiveMarkAs);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WebActivity setDependsOn(List<ActivityDependency> dependsOn) {
        super.setDependsOn(dependsOn);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WebActivity setUserProperties(List<UserProperty> userProperties) {
        super.setUserProperties(userProperties);
        return this;
    }
}
