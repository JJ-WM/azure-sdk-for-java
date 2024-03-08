// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Salesforce Marketing Cloud linked service properties.
 */
@Fluent
public final class SalesforceMarketingCloudLinkedServiceTypeProperties {
    /*
     * Properties used to connect to Salesforce Marketing Cloud. It is mutually exclusive with any other properties in
     * the linked service. Type: object.
     */
    @JsonProperty(value = "connectionProperties")
    private Object connectionProperties;

    /*
     * The client ID associated with the Salesforce Marketing Cloud application. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "clientId")
    private Object clientId;

    /*
     * The client secret associated with the Salesforce Marketing Cloud application. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "clientSecret")
    private SecretBase clientSecret;

    /*
     * Specifies whether the data source endpoints are encrypted using HTTPS. The default value is true. Type: boolean
     * (or Expression with resultType boolean).
     */
    @JsonProperty(value = "useEncryptedEndpoints")
    private Object useEncryptedEndpoints;

    /*
     * Specifies whether to require the host name in the server's certificate to match the host name of the server when
     * connecting over SSL. The default value is true. Type: boolean (or Expression with resultType boolean).
     */
    @JsonProperty(value = "useHostVerification")
    private Object useHostVerification;

    /*
     * Specifies whether to verify the identity of the server when connecting over SSL. The default value is true.
     * Type: boolean (or Expression with resultType boolean).
     */
    @JsonProperty(value = "usePeerVerification")
    private Object usePeerVerification;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string.
     */
    @JsonProperty(value = "encryptedCredential")
    private String encryptedCredential;

    /**
     * Creates an instance of SalesforceMarketingCloudLinkedServiceTypeProperties class.
     */
    public SalesforceMarketingCloudLinkedServiceTypeProperties() {
    }

    /**
     * Get the connectionProperties property: Properties used to connect to Salesforce Marketing Cloud. It is mutually
     * exclusive with any other properties in the linked service. Type: object.
     * 
     * @return the connectionProperties value.
     */
    public Object connectionProperties() {
        return this.connectionProperties;
    }

    /**
     * Set the connectionProperties property: Properties used to connect to Salesforce Marketing Cloud. It is mutually
     * exclusive with any other properties in the linked service. Type: object.
     * 
     * @param connectionProperties the connectionProperties value to set.
     * @return the SalesforceMarketingCloudLinkedServiceTypeProperties object itself.
     */
    public SalesforceMarketingCloudLinkedServiceTypeProperties withConnectionProperties(Object connectionProperties) {
        this.connectionProperties = connectionProperties;
        return this;
    }

    /**
     * Get the clientId property: The client ID associated with the Salesforce Marketing Cloud application. Type:
     * string (or Expression with resultType string).
     * 
     * @return the clientId value.
     */
    public Object clientId() {
        return this.clientId;
    }

    /**
     * Set the clientId property: The client ID associated with the Salesforce Marketing Cloud application. Type:
     * string (or Expression with resultType string).
     * 
     * @param clientId the clientId value to set.
     * @return the SalesforceMarketingCloudLinkedServiceTypeProperties object itself.
     */
    public SalesforceMarketingCloudLinkedServiceTypeProperties withClientId(Object clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the clientSecret property: The client secret associated with the Salesforce Marketing Cloud application.
     * Type: string (or Expression with resultType string).
     * 
     * @return the clientSecret value.
     */
    public SecretBase clientSecret() {
        return this.clientSecret;
    }

    /**
     * Set the clientSecret property: The client secret associated with the Salesforce Marketing Cloud application.
     * Type: string (or Expression with resultType string).
     * 
     * @param clientSecret the clientSecret value to set.
     * @return the SalesforceMarketingCloudLinkedServiceTypeProperties object itself.
     */
    public SalesforceMarketingCloudLinkedServiceTypeProperties withClientSecret(SecretBase clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * Get the useEncryptedEndpoints property: Specifies whether the data source endpoints are encrypted using HTTPS.
     * The default value is true. Type: boolean (or Expression with resultType boolean).
     * 
     * @return the useEncryptedEndpoints value.
     */
    public Object useEncryptedEndpoints() {
        return this.useEncryptedEndpoints;
    }

    /**
     * Set the useEncryptedEndpoints property: Specifies whether the data source endpoints are encrypted using HTTPS.
     * The default value is true. Type: boolean (or Expression with resultType boolean).
     * 
     * @param useEncryptedEndpoints the useEncryptedEndpoints value to set.
     * @return the SalesforceMarketingCloudLinkedServiceTypeProperties object itself.
     */
    public SalesforceMarketingCloudLinkedServiceTypeProperties withUseEncryptedEndpoints(Object useEncryptedEndpoints) {
        this.useEncryptedEndpoints = useEncryptedEndpoints;
        return this;
    }

    /**
     * Get the useHostVerification property: Specifies whether to require the host name in the server's certificate to
     * match the host name of the server when connecting over SSL. The default value is true. Type: boolean (or
     * Expression with resultType boolean).
     * 
     * @return the useHostVerification value.
     */
    public Object useHostVerification() {
        return this.useHostVerification;
    }

    /**
     * Set the useHostVerification property: Specifies whether to require the host name in the server's certificate to
     * match the host name of the server when connecting over SSL. The default value is true. Type: boolean (or
     * Expression with resultType boolean).
     * 
     * @param useHostVerification the useHostVerification value to set.
     * @return the SalesforceMarketingCloudLinkedServiceTypeProperties object itself.
     */
    public SalesforceMarketingCloudLinkedServiceTypeProperties withUseHostVerification(Object useHostVerification) {
        this.useHostVerification = useHostVerification;
        return this;
    }

    /**
     * Get the usePeerVerification property: Specifies whether to verify the identity of the server when connecting
     * over SSL. The default value is true. Type: boolean (or Expression with resultType boolean).
     * 
     * @return the usePeerVerification value.
     */
    public Object usePeerVerification() {
        return this.usePeerVerification;
    }

    /**
     * Set the usePeerVerification property: Specifies whether to verify the identity of the server when connecting
     * over SSL. The default value is true. Type: boolean (or Expression with resultType boolean).
     * 
     * @param usePeerVerification the usePeerVerification value to set.
     * @return the SalesforceMarketingCloudLinkedServiceTypeProperties object itself.
     */
    public SalesforceMarketingCloudLinkedServiceTypeProperties withUsePeerVerification(Object usePeerVerification) {
        this.usePeerVerification = usePeerVerification;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string.
     * 
     * @return the encryptedCredential value.
     */
    public String encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string.
     * 
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the SalesforceMarketingCloudLinkedServiceTypeProperties object itself.
     */
    public SalesforceMarketingCloudLinkedServiceTypeProperties withEncryptedCredential(String encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (clientSecret() != null) {
            clientSecret().validate();
        }
    }
}
