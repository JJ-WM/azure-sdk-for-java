// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import com.azure.resourcemanager.datafactory.models.ZendeskAuthenticationType;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Zendesk linked service type properties. */
@Fluent
public final class ZendeskLinkedServiceTypeProperties {
    /*
     * The authentication type to use.
     */
    @JsonProperty(value = "authenticationType", required = true)
    private ZendeskAuthenticationType authenticationType;

    /*
     * The url to connect Zendesk source. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "url", required = true)
    private Object url;

    /*
     * The username of the Zendesk source. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "userName")
    private Object username;

    /*
     * The password of the Zendesk source.
     */
    @JsonProperty(value = "password")
    private SecretBase password;

    /*
     * The api token for the Zendesk source.
     */
    @JsonProperty(value = "apiToken")
    private SecretBase apiToken;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string.
     */
    @JsonProperty(value = "encryptedCredential")
    private String encryptedCredential;

    /** Creates an instance of ZendeskLinkedServiceTypeProperties class. */
    public ZendeskLinkedServiceTypeProperties() {
    }

    /**
     * Get the authenticationType property: The authentication type to use.
     *
     * @return the authenticationType value.
     */
    public ZendeskAuthenticationType authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: The authentication type to use.
     *
     * @param authenticationType the authenticationType value to set.
     * @return the ZendeskLinkedServiceTypeProperties object itself.
     */
    public ZendeskLinkedServiceTypeProperties withAuthenticationType(ZendeskAuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the url property: The url to connect Zendesk source. Type: string (or Expression with resultType string).
     *
     * @return the url value.
     */
    public Object url() {
        return this.url;
    }

    /**
     * Set the url property: The url to connect Zendesk source. Type: string (or Expression with resultType string).
     *
     * @param url the url value to set.
     * @return the ZendeskLinkedServiceTypeProperties object itself.
     */
    public ZendeskLinkedServiceTypeProperties withUrl(Object url) {
        this.url = url;
        return this;
    }

    /**
     * Get the username property: The username of the Zendesk source. Type: string (or Expression with resultType
     * string).
     *
     * @return the username value.
     */
    public Object username() {
        return this.username;
    }

    /**
     * Set the username property: The username of the Zendesk source. Type: string (or Expression with resultType
     * string).
     *
     * @param username the username value to set.
     * @return the ZendeskLinkedServiceTypeProperties object itself.
     */
    public ZendeskLinkedServiceTypeProperties withUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: The password of the Zendesk source.
     *
     * @return the password value.
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set the password property: The password of the Zendesk source.
     *
     * @param password the password value to set.
     * @return the ZendeskLinkedServiceTypeProperties object itself.
     */
    public ZendeskLinkedServiceTypeProperties withPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the apiToken property: The api token for the Zendesk source.
     *
     * @return the apiToken value.
     */
    public SecretBase apiToken() {
        return this.apiToken;
    }

    /**
     * Set the apiToken property: The api token for the Zendesk source.
     *
     * @param apiToken the apiToken value to set.
     * @return the ZendeskLinkedServiceTypeProperties object itself.
     */
    public ZendeskLinkedServiceTypeProperties withApiToken(SecretBase apiToken) {
        this.apiToken = apiToken;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     *
     * @return the encryptedCredential value.
     */
    public String encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the ZendeskLinkedServiceTypeProperties object itself.
     */
    public ZendeskLinkedServiceTypeProperties withEncryptedCredential(String encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (authenticationType() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property authenticationType in model ZendeskLinkedServiceTypeProperties"));
        }
        if (url() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property url in model ZendeskLinkedServiceTypeProperties"));
        }
        if (password() != null) {
            password().validate();
        }
        if (apiToken() != null) {
            apiToken().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ZendeskLinkedServiceTypeProperties.class);
}
