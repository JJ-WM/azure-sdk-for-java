// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SAP Cloud for Customer linked service properties.
 */
@Fluent
public final class SapCloudForCustomerLinkedServiceTypeProperties {
    /*
     * The URL of SAP Cloud for Customer OData API. For example, '[https://[tenantname].crm.ondemand.com/sap/c4c/odata/v1]'. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "url", required = true)
    private Object url;

    /*
     * The username for Basic authentication. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "username")
    private Object username;

    /*
     * The password for Basic authentication.
     */
    @JsonProperty(value = "password")
    private SecretBase password;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Either encryptedCredential or username/password must be provided. Type: string.
     */
    @JsonProperty(value = "encryptedCredential")
    private String encryptedCredential;

    /**
     * Creates an instance of SapCloudForCustomerLinkedServiceTypeProperties class.
     */
    public SapCloudForCustomerLinkedServiceTypeProperties() {
    }

    /**
     * Get the url property: The URL of SAP Cloud for Customer OData API. For example,
     * '[https://[tenantname].crm.ondemand.com/sap/c4c/odata/v1]'. Type: string (or Expression with resultType string).
     * 
     * @return the url value.
     */
    public Object url() {
        return this.url;
    }

    /**
     * Set the url property: The URL of SAP Cloud for Customer OData API. For example,
     * '[https://[tenantname].crm.ondemand.com/sap/c4c/odata/v1]'. Type: string (or Expression with resultType string).
     * 
     * @param url the url value to set.
     * @return the SapCloudForCustomerLinkedServiceTypeProperties object itself.
     */
    public SapCloudForCustomerLinkedServiceTypeProperties withUrl(Object url) {
        this.url = url;
        return this;
    }

    /**
     * Get the username property: The username for Basic authentication. Type: string (or Expression with resultType
     * string).
     * 
     * @return the username value.
     */
    public Object username() {
        return this.username;
    }

    /**
     * Set the username property: The username for Basic authentication. Type: string (or Expression with resultType
     * string).
     * 
     * @param username the username value to set.
     * @return the SapCloudForCustomerLinkedServiceTypeProperties object itself.
     */
    public SapCloudForCustomerLinkedServiceTypeProperties withUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: The password for Basic authentication.
     * 
     * @return the password value.
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set the password property: The password for Basic authentication.
     * 
     * @param password the password value to set.
     * @return the SapCloudForCustomerLinkedServiceTypeProperties object itself.
     */
    public SapCloudForCustomerLinkedServiceTypeProperties withPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Either encryptedCredential or username/password must be
     * provided. Type: string.
     * 
     * @return the encryptedCredential value.
     */
    public String encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Either encryptedCredential or username/password must be
     * provided. Type: string.
     * 
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the SapCloudForCustomerLinkedServiceTypeProperties object itself.
     */
    public SapCloudForCustomerLinkedServiceTypeProperties withEncryptedCredential(String encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (url() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property url in model SapCloudForCustomerLinkedServiceTypeProperties"));
        }
        if (password() != null) {
            password().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SapCloudForCustomerLinkedServiceTypeProperties.class);
}
