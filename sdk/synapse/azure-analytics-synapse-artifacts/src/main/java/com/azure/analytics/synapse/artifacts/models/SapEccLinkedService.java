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
import java.util.Map;

/**
 * Linked service for SAP ERP Central Component(SAP ECC).
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SapEcc")
@JsonFlatten
@Fluent
public class SapEccLinkedService extends LinkedService {
    /*
     * The URL of SAP ECC OData API. For example, '[https://hostname:port/sap/opu/odata/sap/servicename/]'. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.url", required = true)
    private String url;

    /*
     * The username for Basic authentication. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.username")
    private String username;

    /*
     * The password for Basic authentication.
     */
    @JsonProperty(value = "typeProperties.password")
    private SecretBase password;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Either encryptedCredential or username/password must be provided. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private String encryptedCredential;

    /**
     * Creates an instance of SapEccLinkedService class.
     */
    public SapEccLinkedService() {
    }

    /**
     * Get the url property: The URL of SAP ECC OData API. For example,
     * '[https://hostname:port/sap/opu/odata/sap/servicename/]'. Type: string (or Expression with resultType string).
     * 
     * @return the url value.
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * Set the url property: The URL of SAP ECC OData API. For example,
     * '[https://hostname:port/sap/opu/odata/sap/servicename/]'. Type: string (or Expression with resultType string).
     * 
     * @param url the url value to set.
     * @return the SapEccLinkedService object itself.
     */
    public SapEccLinkedService setUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get the username property: The username for Basic authentication. Type: string (or Expression with resultType
     * string).
     * 
     * @return the username value.
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * Set the username property: The username for Basic authentication. Type: string (or Expression with resultType
     * string).
     * 
     * @param username the username value to set.
     * @return the SapEccLinkedService object itself.
     */
    public SapEccLinkedService setUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: The password for Basic authentication.
     * 
     * @return the password value.
     */
    public SecretBase getPassword() {
        return this.password;
    }

    /**
     * Set the password property: The password for Basic authentication.
     * 
     * @param password the password value to set.
     * @return the SapEccLinkedService object itself.
     */
    public SapEccLinkedService setPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Either encryptedCredential or username/password must
     * be provided. Type: string (or Expression with resultType string).
     * 
     * @return the encryptedCredential value.
     */
    public String getEncryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Either encryptedCredential or username/password must
     * be provided. Type: string (or Expression with resultType string).
     * 
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the SapEccLinkedService object itself.
     */
    public SapEccLinkedService setEncryptedCredential(String encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapEccLinkedService setConnectVia(IntegrationRuntimeReference connectVia) {
        super.setConnectVia(connectVia);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapEccLinkedService setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapEccLinkedService setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapEccLinkedService setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }
}
